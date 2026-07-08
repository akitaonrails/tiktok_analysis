package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1C85, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public /* synthetic */ class C1C85 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[C1C87.values().length];
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
            try {
                iArr[C1C87.ACTION_CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e3) {
            e = e3;
        }
        LIZ = iArr;
        int[] iArr2 = new int[C1C86.values().length];
        try {
            try {
            } catch (NoSuchFieldError e4) {
                e = e4;
            }
        } catch (NoSuchFieldError e5) {
            e = e5;
        }
        try {
            iArr2[C1C86.ACTION_SET_NAME.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
            e = e6;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
                try {
                    iArr2[C1C86.ACTION_EXIT_THREAD.ordinal()] = 2;
                } catch (NoSuchFieldError e7) {
                    e = e7;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e8) {
                e = e8;
            }
        } catch (NoSuchFieldError e9) {
            e = e9;
        }
        LIZIZ = iArr2;
    }
}
