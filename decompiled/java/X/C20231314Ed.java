package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.14Ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C20231314Ed {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ThreadMode.values().length];
        LIZ = iArr;
        try {
            iArr[ThreadMode.POSTING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[ThreadMode.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[ThreadMode.BACKGROUND.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[ThreadMode.ASYNC.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
    }
}
