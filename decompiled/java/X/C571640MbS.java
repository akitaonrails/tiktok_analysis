package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.ROTATE_DEGREE;

/* JADX INFO: renamed from: X.0MbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C571640MbS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ROTATE_DEGREE.values().length];
        try {
            iArr[ROTATE_DEGREE.ROTATE_90.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[ROTATE_DEGREE.ROTATE_180.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[ROTATE_DEGREE.ROTATE_270.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
