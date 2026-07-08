package X;

import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerMessageOptSetting;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0uLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700320uLe {
    public static void LIZ() {
        AtomicBoolean atomicBoolean = C1700360uLi.LJII;
        if (!atomicBoolean.get() && C486790J7d.LIZIZ() && !LivePlayerMessageOptSetting.INSTANCE.disableRenderMessageOpt() && atomicBoolean.compareAndSet(false, true) && C1700360uLi.LJIIIIZZ == null) {
            C1700360uLi.LJIIIIZZ = C786410Ut5.v2();
        }
    }
}
