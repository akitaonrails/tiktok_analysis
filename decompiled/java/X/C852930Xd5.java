package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Xd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C852930Xd5 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC852910Xd3.values().length];
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_SIGN_UP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_LOGIN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_PASSWORD_LOGIN.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_FIND_PASSWORD.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_FIND_PASSWORD.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC852910Xd3.NON1P_PHONE_BIND.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_BIND_SHEET.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_VERIFY.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_MODIFY.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_CHANGE_PASSWORD.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[EnumC852910Xd3.VERIFY_PHONE.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[EnumC852910Xd3.VERIFY_EMAIL_BEFORE_CHANGE.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[EnumC852910Xd3.VERIFY_PHONE_FOR_TICKET.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr[EnumC852910Xd3.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_PHONE_CONFIRM.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_PHONE_VERIFY.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_PHONE.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_BIND.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr[EnumC852910Xd3.OPTIONAL_PHONE_SMS_BIND.ordinal()] = 19;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr[EnumC852910Xd3.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_PHONE.ordinal()] = 20;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr[EnumC852910Xd3.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_CODE.ordinal()] = 21;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_BIND.ordinal()] = 22;
        } catch (NoSuchFieldError e22) {
            TryCatchGuardChecker.doCheck(e22);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC852660Xce.values().length];
        try {
            iArr2[EnumC852660Xce.SIGN_UP.ordinal()] = 1;
        } catch (NoSuchFieldError e23) {
            TryCatchGuardChecker.doCheck(e23);
        }
        try {
            iArr2[EnumC852660Xce.LOGIN.ordinal()] = 2;
        } catch (NoSuchFieldError e24) {
            TryCatchGuardChecker.doCheck(e24);
        }
        try {
            iArr2[EnumC852660Xce.BIND_PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError e25) {
            TryCatchGuardChecker.doCheck(e25);
        }
        try {
            iArr2[EnumC852660Xce.MODIFY_PHONE.ordinal()] = 4;
        } catch (NoSuchFieldError e26) {
            TryCatchGuardChecker.doCheck(e26);
        }
        try {
            iArr2[EnumC852660Xce.RECOVER_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError e27) {
            TryCatchGuardChecker.doCheck(e27);
        }
        try {
            iArr2[EnumC852660Xce.BIND_PHONE_OR_EMAIL_3P_SIGN_UP.ordinal()] = 6;
        } catch (NoSuchFieldError e28) {
            TryCatchGuardChecker.doCheck(e28);
        }
        try {
            iArr2[EnumC852660Xce.BIND_PHONE_OR_EMAIL_3P_LOGIN.ordinal()] = 7;
        } catch (NoSuchFieldError e29) {
            TryCatchGuardChecker.doCheck(e29);
        }
        LIZIZ = iArr2;
    }
}
