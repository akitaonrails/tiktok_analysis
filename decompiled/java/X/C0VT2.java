package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VT2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C0VT2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0VT3.values().length];
        LIZ = iArr;
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
        } catch (NoSuchFieldError e2) {
            e = e2;
        }
        try {
            iArr[C0VT3.VALID_STATUS.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
                try {
                } catch (NoSuchFieldError e4) {
                    e = e4;
                }
            } catch (NoSuchFieldError e5) {
                e = e5;
            }
        } catch (NoSuchFieldError e6) {
            e = e6;
        }
        try {
            LIZ[C0VT3.USING_STATUS.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
            e = e7;
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
