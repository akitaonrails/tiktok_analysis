package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08GU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C08GU {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C08GV.values().length];
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
            try {
                iArr[C08GV.Xor.ordinal()] = 1;
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
            iArr[C08GV.Ropa.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            e = e6;
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
