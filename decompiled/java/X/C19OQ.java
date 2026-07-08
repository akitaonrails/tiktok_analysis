package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19OQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C19OQ {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[C19O3.values().length];
        LIZIZ = iArr;
        try {
            iArr[C19O3.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZIZ[C19O3.WRAP_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZIZ[C19O3.MATCH_PARENT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZIZ[C19O3.MATCH_CONSTRAINT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        int[] iArr2 = new int[C19OV.values().length];
        LIZ = iArr2;
        try {
            iArr2[C19OV.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[C19OV.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZ[C19OV.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZ[C19OV.BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            LIZ[C19OV.BASELINE.ordinal()] = 5;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            LIZ[C19OV.CENTER.ordinal()] = 6;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            LIZ[C19OV.CENTER_X.ordinal()] = 7;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            LIZ[C19OV.CENTER_Y.ordinal()] = 8;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            LIZ[C19OV.NONE.ordinal()] = 9;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
    }
}
