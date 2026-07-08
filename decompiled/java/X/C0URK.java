package X;

import com.bytedance.android.livesdk.livesetting.broadcast.AnchorSmoothRoomCreateOptABSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0URK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0URK {
    public static final C0URK LIZ = new C0URK();
    public static final C11NJ LIZIZ = new C11NJ();

    public final synchronized void LIZIZ() {
        if (AnchorSmoothRoomCreateOptABSetting.INSTANCE.enable()) {
            try {
                C20441214yg.LIZIZ("songsong", "LiveCreateRoomOptV2Helper resetValue");
                LIZIZ.LJ();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("LiveCreateRoomOptHelper", "resetValue", e);
            }
        }
    }

    public final synchronized void LIZ(C11JF c11jf) {
        if (!AnchorSmoothRoomCreateOptABSetting.INSTANCE.enable()) {
            return;
        }
        LIZIZ.LIZ(c11jf);
    }
}
