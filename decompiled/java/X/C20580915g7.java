package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15g7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C20580915g7 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC339980DUm.values().length];
        try {
            iArr[EnumC339980DUm.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC339980DUm.FINISHED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC339980DUm.FAIL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC339980DUm.TNS_FAIL.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC1405120mfW.values().length];
        try {
            iArr2[EnumC1405120mfW.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[EnumC1405120mfW.SOCIAL_AVATAR.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[EnumC1405120mfW.GENERATED_AVATAR.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZIZ = iArr2;
    }
}
