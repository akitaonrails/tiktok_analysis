package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UV7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C0UV7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LiveMode.values().length];
        LIZ = iArr;
        try {
            iArr[LiveMode.SCREEN_RECORD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[LiveMode.LIVE_VOICE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
