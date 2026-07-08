package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09EO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C09EO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C09D6.values().length];
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
            try {
                iArr[C09D6.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e3) {
            e = e3;
        }
        try {
            try {
            } catch (NoSuchFieldError e4) {
                e = e4;
            }
        } catch (NoSuchFieldError e5) {
            e = e5;
        }
        try {
            iArr[C09D6.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            e = e6;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
            } catch (NoSuchFieldError e7) {
                e = e7;
            }
            try {
                iArr[C09D6.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
                e = e8;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e9) {
            e = e9;
        }
        try {
            try {
            } catch (NoSuchFieldError e10) {
                e = e10;
            }
        } catch (NoSuchFieldError e11) {
            e = e11;
        }
        try {
            iArr[C09D6.NULL.ordinal()] = 4;
        } catch (NoSuchFieldError e12) {
            e = e12;
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
