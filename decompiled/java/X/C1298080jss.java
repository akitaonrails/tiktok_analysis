package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableType;

/* JADX INFO: renamed from: X.0jss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1298080jss {
    public static final /* synthetic */ int[] LIZ;

    static {
        EnumC1298090jst.values();
        try {
            EnumC1298090jst.String.ordinal();
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            EnumC1298090jst.Int.ordinal();
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            EnumC1298090jst.Number.ordinal();
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            EnumC1298090jst.Boolean.ordinal();
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            EnumC1298090jst.Array.ordinal();
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            EnumC1298090jst.Map.ordinal();
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        int[] iArr = new int[ReadableType.values().length];
        try {
            iArr[ReadableType.Long.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[ReadableType.String.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[ReadableType.Number.ordinal()] = 3;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[ReadableType.Boolean.ordinal()] = 4;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[ReadableType.Map.ordinal()] = 5;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[ReadableType.Array.ordinal()] = 6;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[ReadableType.Null.ordinal()] = 7;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        LIZ = iArr;
    }
}
