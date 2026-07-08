package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Qye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C687940Qye {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC687960Qyg.values().length];
        try {
            iArr[EnumC687960Qyg.ALREADY_SATISFIED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC687960Qyg.CONVERSION_POPUP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC687960Qyg.STANDARD_REQUEST.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC687950Qyf.values().length];
        try {
            iArr2[EnumC687950Qyf.COARSE.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC687950Qyf.PRECISE.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZIZ = iArr2;
    }
}
