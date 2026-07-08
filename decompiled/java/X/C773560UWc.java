package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C773560UWc {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC773550UWb.values().length];
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
            try {
                iArr[EnumC773550UWb.DEFAULT.ordinal()] = 1;
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
            iArr[EnumC773550UWb.TESTING.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            e = e6;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
                try {
                    iArr[EnumC773550UWb.GOOD_CONNECTION.ordinal()] = 3;
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
        try {
            try {
            } catch (NoSuchFieldError e10) {
                e = e10;
            }
        } catch (NoSuchFieldError e11) {
            e = e11;
        }
        try {
            iArr[EnumC773550UWb.BAD_CONNECTION.ordinal()] = 4;
        } catch (NoSuchFieldError e12) {
            e = e12;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
            } catch (NoSuchFieldError e13) {
                e = e13;
            }
            try {
                iArr[EnumC773550UWb.PROBE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError e14) {
                e = e14;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e15) {
            e = e15;
        }
        LIZ = iArr;
    }
}
