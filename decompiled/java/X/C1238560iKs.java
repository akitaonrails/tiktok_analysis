package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0iKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1238560iKs {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC1238570iKt.values().length];
        try {
            iArr[EnumC1238570iKt.ACCOUNT_USER_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1238570iKt.PASSWORD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1238570iKt.PASSKEY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1238570iKt.PIN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1238570iKt.REQUEST_VERIFICATION.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC1238570iKt.CREATOR_VERIFICATION.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC1238570iKt.SWITCH_ACCOUNT.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC1238570iKt.SELLER_SETTINGS.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[EnumC1238570iKt.DOWNLOAD_DATA.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[EnumC1238570iKt.DEACTIVATE_DELETE_ACCOUNT.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[EnumC1238570iKt.MANAGE_ORG_PERMISSIONS.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[EnumC1238570iKt.MANAGE_ORG_ACCOUNTS.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[EnumC1238570iKt.EXTERNAL_ACCOUNTS.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC1238580iKu.values().length];
        try {
            iArr2[EnumC1238580iKu.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr2[EnumC1238580iKu.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr2[EnumC1238580iKu.DOB.ordinal()] = 3;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr2[EnumC1238580iKu.ACCOUNT_REGION.ordinal()] = 4;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr2[EnumC1238580iKu.AGE_VERIFICATION.ordinal()] = 5;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr2[EnumC1238580iKu.AUTOFILL.ordinal()] = 6;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        LIZIZ = iArr2;
    }
}
