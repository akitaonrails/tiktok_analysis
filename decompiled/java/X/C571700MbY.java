package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.ROTATE_DEGREE;

/* JADX INFO: renamed from: X.0MbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C571700MbY {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ROTATE_DEGREE.values().length];
        LIZ = iArr;
        try {
            iArr[ROTATE_DEGREE.ROTATE_NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[ROTATE_DEGREE.ROTATE_90.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[ROTATE_DEGREE.ROTATE_180.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[ROTATE_DEGREE.ROTATE_270.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
