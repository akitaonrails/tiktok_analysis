package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Xd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C852920Xd4 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC852910Xd3.values().length];
        try {
            iArr[EnumC852910Xd3.RESET_PASSWORD_FOR_EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC852910Xd3.RESET_PASSWORD_FOR_PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC852910Xd3.CREATE_PASSWORD_FOR_PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC852910Xd3.CREATE_PASSWORD_FOR_EMAIL.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_SMS_FIND_PASSWORD.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_FIND_PASSWORD.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_SIGN_UP.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_LOGIN.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_SMS_SIGN_UP.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_BIND.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_VERIFY.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_MODIFY.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_SMS_VERIFY.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_FIND_PASSWORD.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_BIND.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_MODIFY.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr[EnumC852910Xd3.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_PHONE.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_EMAIL_FIND_PASSWORD.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_PASSWORD_LOGIN.ordinal()] = 19;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_OTP_LOGIN_SWITCH_TO_PASSWORD.ordinal()] = 20;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr[EnumC852910Xd3.FAILED_3P_PASSWORD_LOGIN.ordinal()] = 21;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_HL_LOGIN_SWITCH_TO_PASSWORD.ordinal()] = 22;
        } catch (NoSuchFieldError e22) {
            TryCatchGuardChecker.doCheck(e22);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_HL_LOGIN_SWITCH_TO_PASSWORD.ordinal()] = 23;
        } catch (NoSuchFieldError e23) {
            TryCatchGuardChecker.doCheck(e23);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_EMAIL_LOGIN.ordinal()] = 24;
        } catch (NoSuchFieldError e24) {
            TryCatchGuardChecker.doCheck(e24);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_EMAIL_SIGN_UP.ordinal()] = 25;
        } catch (NoSuchFieldError e25) {
            TryCatchGuardChecker.doCheck(e25);
        }
        try {
            iArr[EnumC852910Xd3.CREATE_NICKNAME.ordinal()] = 26;
        } catch (NoSuchFieldError e26) {
            TryCatchGuardChecker.doCheck(e26);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_PASSWORD_LOGIN.ordinal()] = 27;
        } catch (NoSuchFieldError e27) {
            TryCatchGuardChecker.doCheck(e27);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_EMAIL_LOGIN.ordinal()] = 28;
        } catch (NoSuchFieldError e28) {
            TryCatchGuardChecker.doCheck(e28);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_LOGIN.ordinal()] = 29;
        } catch (NoSuchFieldError e29) {
            TryCatchGuardChecker.doCheck(e29);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_SIGN_UP.ordinal()] = 30;
        } catch (NoSuchFieldError e30) {
            TryCatchGuardChecker.doCheck(e30);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_EMAIL_SIGN_UP.ordinal()] = 31;
        } catch (NoSuchFieldError e31) {
            TryCatchGuardChecker.doCheck(e31);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_SIGNUP.ordinal()] = 32;
        } catch (NoSuchFieldError e32) {
            TryCatchGuardChecker.doCheck(e32);
        }
        try {
            iArr[EnumC852910Xd3.PHONE_SMS_CHANGE_PASSWORD.ordinal()] = 33;
        } catch (NoSuchFieldError e33) {
            TryCatchGuardChecker.doCheck(e33);
        }
        try {
            iArr[EnumC852910Xd3.CHANGE_PASSWORD.ordinal()] = 34;
        } catch (NoSuchFieldError e34) {
            TryCatchGuardChecker.doCheck(e34);
        }
        try {
            iArr[EnumC852910Xd3.CREATE_PASSWORD_FOR_1P.ordinal()] = 35;
        } catch (NoSuchFieldError e35) {
            TryCatchGuardChecker.doCheck(e35);
        }
        try {
            iArr[EnumC852910Xd3.VERIFY_PASSWORD.ordinal()] = 36;
        } catch (NoSuchFieldError e36) {
            TryCatchGuardChecker.doCheck(e36);
        }
        try {
            iArr[EnumC852910Xd3.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV.ordinal()] = 37;
        } catch (NoSuchFieldError e37) {
            TryCatchGuardChecker.doCheck(e37);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_PASSWORD.ordinal()] = 38;
        } catch (NoSuchFieldError e38) {
            TryCatchGuardChecker.doCheck(e38);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_PHONE_VERIFY_USING_PASSWORD.ordinal()] = 39;
        } catch (NoSuchFieldError e39) {
            TryCatchGuardChecker.doCheck(e39);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_EMAIL_BIND.ordinal()] = 40;
        } catch (NoSuchFieldError e40) {
            TryCatchGuardChecker.doCheck(e40);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_SMS_BIND.ordinal()] = 41;
        } catch (NoSuchFieldError e41) {
            TryCatchGuardChecker.doCheck(e41);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_SMS_CHANGE.ordinal()] = 42;
        } catch (NoSuchFieldError e42) {
            TryCatchGuardChecker.doCheck(e42);
        }
        try {
            iArr[EnumC852910Xd3.VERIFY_EMAIL_BEFORE_CHANGE.ordinal()] = 43;
        } catch (NoSuchFieldError e43) {
            TryCatchGuardChecker.doCheck(e43);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_EMAIL_CHANGE.ordinal()] = 44;
        } catch (NoSuchFieldError e44) {
            TryCatchGuardChecker.doCheck(e44);
        }
        try {
            iArr[EnumC852910Xd3.CONFIRM_EMAIL_BEFORE_VERIFY.ordinal()] = 45;
        } catch (NoSuchFieldError e45) {
            TryCatchGuardChecker.doCheck(e45);
        }
        try {
            iArr[EnumC852910Xd3.VERIFY_PHONE.ordinal()] = 46;
        } catch (NoSuchFieldError e46) {
            TryCatchGuardChecker.doCheck(e46);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_SMS_CHANGE_PASSWORD.ordinal()] = 47;
        } catch (NoSuchFieldError e47) {
            TryCatchGuardChecker.doCheck(e47);
        }
        try {
            iArr[EnumC852910Xd3.TERMS_CONSENT_SIGN_UP.ordinal()] = 48;
        } catch (NoSuchFieldError e48) {
            TryCatchGuardChecker.doCheck(e48);
        }
        try {
            iArr[EnumC852910Xd3.TERMS_CONSENT_NEW_PHONE_USER.ordinal()] = 49;
        } catch (NoSuchFieldError e49) {
            TryCatchGuardChecker.doCheck(e49);
        }
        try {
            iArr[EnumC852910Xd3.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.ordinal()] = 50;
        } catch (NoSuchFieldError e50) {
            TryCatchGuardChecker.doCheck(e50);
        }
        try {
            iArr[EnumC852910Xd3.FTC_CREATE_ACCOUNT.ordinal()] = 51;
        } catch (NoSuchFieldError e51) {
            TryCatchGuardChecker.doCheck(e51);
        }
        try {
            iArr[EnumC852910Xd3.FTC_CREATE_PASSWORD.ordinal()] = 52;
        } catch (NoSuchFieldError e52) {
            TryCatchGuardChecker.doCheck(e52);
        }
        try {
            iArr[EnumC852910Xd3.CHANGE_PASSWORD_FOR_CHILDREN.ordinal()] = 53;
        } catch (NoSuchFieldError e53) {
            TryCatchGuardChecker.doCheck(e53);
        }
        try {
            iArr[EnumC852910Xd3.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV.ordinal()] = 54;
        } catch (NoSuchFieldError e54) {
            TryCatchGuardChecker.doCheck(e54);
        }
        try {
            iArr[EnumC852910Xd3.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV.ordinal()] = 55;
        } catch (NoSuchFieldError e55) {
            TryCatchGuardChecker.doCheck(e55);
        }
        try {
            iArr[EnumC852910Xd3.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV.ordinal()] = 56;
        } catch (NoSuchFieldError e56) {
            TryCatchGuardChecker.doCheck(e56);
        }
        try {
            iArr[EnumC852910Xd3.VERIFY_EMAIL_FOR_TICKET.ordinal()] = 57;
        } catch (NoSuchFieldError e57) {
            TryCatchGuardChecker.doCheck(e57);
        }
        try {
            iArr[EnumC852910Xd3.VERIFY_PHONE_FOR_TICKET.ordinal()] = 58;
        } catch (NoSuchFieldError e58) {
            TryCatchGuardChecker.doCheck(e58);
        }
        try {
            iArr[EnumC852910Xd3.PRIVATE_ACCOUNT_TIPS.ordinal()] = 59;
        } catch (NoSuchFieldError e59) {
            TryCatchGuardChecker.doCheck(e59);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_PHONE_CONFIRM.ordinal()] = 60;
        } catch (NoSuchFieldError e60) {
            TryCatchGuardChecker.doCheck(e60);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_EMAIL_CONFIRM.ordinal()] = 61;
        } catch (NoSuchFieldError e61) {
            TryCatchGuardChecker.doCheck(e61);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_PHONE_VERIFY.ordinal()] = 62;
        } catch (NoSuchFieldError e62) {
            TryCatchGuardChecker.doCheck(e62);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_EMAIL.ordinal()] = 63;
        } catch (NoSuchFieldError e63) {
            TryCatchGuardChecker.doCheck(e63);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_PHONE.ordinal()] = 64;
        } catch (NoSuchFieldError e64) {
            TryCatchGuardChecker.doCheck(e64);
        }
        try {
            iArr[EnumC852910Xd3.UNBIND_PHONE_VERIFY_USING_EMAIL.ordinal()] = 65;
        } catch (NoSuchFieldError e65) {
            TryCatchGuardChecker.doCheck(e65);
        }
        try {
            iArr[EnumC852910Xd3.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_CODE.ordinal()] = 66;
        } catch (NoSuchFieldError e66) {
            TryCatchGuardChecker.doCheck(e66);
        }
        try {
            iArr[EnumC852910Xd3.TOTP_BIND.ordinal()] = 67;
        } catch (NoSuchFieldError e67) {
            TryCatchGuardChecker.doCheck(e67);
        }
        try {
            iArr[EnumC852910Xd3.VERIFY_TOTP.ordinal()] = 68;
        } catch (NoSuchFieldError e68) {
            TryCatchGuardChecker.doCheck(e68);
        }
        try {
            iArr[EnumC852910Xd3.CREATE_AVATAR.ordinal()] = 69;
        } catch (NoSuchFieldError e69) {
            TryCatchGuardChecker.doCheck(e69);
        }
        try {
            iArr[EnumC852910Xd3.CREATE_AVATAR_AND_NICKNAME.ordinal()] = 70;
        } catch (NoSuchFieldError e70) {
            TryCatchGuardChecker.doCheck(e70);
        }
        try {
            iArr[EnumC852910Xd3.PRIVATE_ACCOUNT_PROMPT.ordinal()] = 71;
        } catch (NoSuchFieldError e71) {
            TryCatchGuardChecker.doCheck(e71);
        }
        try {
            iArr[EnumC852910Xd3.PRIVACY_HIGHLIGHT_FOR_TEENS.ordinal()] = 72;
        } catch (NoSuchFieldError e72) {
            TryCatchGuardChecker.doCheck(e72);
        }
        try {
            iArr[EnumC852910Xd3.ADD_AUTH_DEVICE.ordinal()] = 73;
        } catch (NoSuchFieldError e73) {
            TryCatchGuardChecker.doCheck(e73);
        }
        try {
            iArr[EnumC852910Xd3.TRUSTED_DEVICE.ordinal()] = 74;
        } catch (NoSuchFieldError e74) {
            TryCatchGuardChecker.doCheck(e74);
        }
        try {
            iArr[EnumC852910Xd3.RECENT_DEVICE.ordinal()] = 75;
        } catch (NoSuchFieldError e75) {
            TryCatchGuardChecker.doCheck(e75);
        }
        try {
            iArr[EnumC852910Xd3.PASSKEY.ordinal()] = 76;
        } catch (NoSuchFieldError e76) {
            TryCatchGuardChecker.doCheck(e76);
        }
        try {
            iArr[EnumC852910Xd3.PASSKEY_UPSELL.ordinal()] = 77;
        } catch (NoSuchFieldError e77) {
            TryCatchGuardChecker.doCheck(e77);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_OTP_LOGIN.ordinal()] = 78;
        } catch (NoSuchFieldError e78) {
            TryCatchGuardChecker.doCheck(e78);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_LINK_LOGIN_OR_SIGNUP.ordinal()] = 79;
        } catch (NoSuchFieldError e79) {
            TryCatchGuardChecker.doCheck(e79);
        }
        try {
            iArr[EnumC852910Xd3.EMAIL_OTP_SIGNUP.ordinal()] = 80;
        } catch (NoSuchFieldError e80) {
            TryCatchGuardChecker.doCheck(e80);
        }
        try {
            iArr[EnumC852910Xd3.NON1P_PHONE_BIND.ordinal()] = 81;
        } catch (NoSuchFieldError e81) {
            TryCatchGuardChecker.doCheck(e81);
        }
        try {
            iArr[EnumC852910Xd3.VERIFY_OR_BIND_PHONE.ordinal()] = 82;
        } catch (NoSuchFieldError e82) {
            TryCatchGuardChecker.doCheck(e82);
        }
        try {
            iArr[EnumC852910Xd3.ORG_OTP_LOGIN.ordinal()] = 83;
        } catch (NoSuchFieldError e83) {
            TryCatchGuardChecker.doCheck(e83);
        }
        try {
            iArr[EnumC852910Xd3.GSMA_VERIFY.ordinal()] = 84;
        } catch (NoSuchFieldError e84) {
            TryCatchGuardChecker.doCheck(e84);
        }
        try {
            iArr[EnumC852910Xd3.ACCOUNT_SELECTIONS.ordinal()] = 85;
        } catch (NoSuchFieldError e85) {
            TryCatchGuardChecker.doCheck(e85);
        }
        try {
            iArr[EnumC852910Xd3.OPTIONAL_PHONE_SMS_BIND.ordinal()] = 86;
        } catch (NoSuchFieldError e86) {
            TryCatchGuardChecker.doCheck(e86);
        }
        LIZ = iArr;
    }
}
