package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YCP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0YCP {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0YCH.values().length];
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
            try {
                iArr[C0YCH.CLIENT_ERROR.ordinal()] = 1;
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
            iArr[C0YCH.SERVER_ERROR.ordinal()] = 2;
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
                iArr[C0YCH.CLIENT_CANCEL.ordinal()] = 3;
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
            iArr[C0YCH.CHECK_CODE_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError e12) {
            e = e12;
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
