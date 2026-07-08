package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1338, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class AnonymousClass1338 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AnonymousClass1334.values().length];
        LIZ = iArr;
        try {
            iArr[AnonymousClass1334.DOUBLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[AnonymousClass1334.FLOAT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[AnonymousClass1334.INT64.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[AnonymousClass1334.UINT64.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[AnonymousClass1334.INT32.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[AnonymousClass1334.UINT32.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZ[AnonymousClass1334.FIXED64.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZ[AnonymousClass1334.SFIXED64.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            LIZ[AnonymousClass1334.FIXED32.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            LIZ[AnonymousClass1334.SFIXED32.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            LIZ[AnonymousClass1334.BOOL.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            LIZ[AnonymousClass1334.SINT32.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            LIZ[AnonymousClass1334.SINT64.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            LIZ[AnonymousClass1334.ENUM.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            LIZ[AnonymousClass1334.BYTES.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            LIZ[AnonymousClass1334.STRING.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            LIZ[AnonymousClass1334.GROUP.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            LIZ[AnonymousClass1334.MESSAGE.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
    }
}
