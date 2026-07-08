package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1528000pri {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1527990prh.values().length];
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
            try {
                iArr[EnumC1527990prh.CONNECTION_UNKNOWN.ordinal()] = 1;
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
            iArr[EnumC1527990prh.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            e = e6;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
                try {
                    iArr[EnumC1527990prh.CONNECT_FAILED.ordinal()] = 3;
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
            iArr[EnumC1527990prh.CONNECT_TIMEOUT.ordinal()] = 4;
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
                iArr[EnumC1527990prh.CONNECT_CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError e14) {
                e = e14;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e15) {
            e = e15;
        }
        try {
            try {
            } catch (NoSuchFieldError e16) {
                e = e16;
            }
        } catch (NoSuchFieldError e17) {
            e = e17;
        }
        try {
            iArr[EnumC1527990prh.CONNECTED.ordinal()] = 6;
        } catch (NoSuchFieldError e18) {
            e = e18;
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
