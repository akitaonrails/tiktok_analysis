package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC852660Xce {
    public static final EnumC852660Xce ADD_CURRENT_DEVICE_TO_TRUST_DEVICE;
    public static final EnumC852660Xce BIND_EMAIL;
    public static final EnumC852660Xce BIND_EMAIL_FROM_FEED;
    public static final EnumC852660Xce BIND_EMAIL_FROM_INBOX;
    public static final EnumC852660Xce BIND_EMAIL_FROM_PROFILE;
    public static final EnumC852660Xce BIND_PHONE;
    public static final EnumC852660Xce BIND_PHONE_OR_EMAIL_3P_LOGIN;
    public static final EnumC852660Xce BIND_PHONE_OR_EMAIL_3P_SIGN_UP;
    public static final EnumC852660Xce BIND_TOTP;
    public static final EnumC852660Xce CHANGE_EMAIL;
    public static final EnumC852660Xce CHANGE_PASSWORD;
    public static final C0XYS Companion;
    public static final EnumC852660Xce EMAIL_OTP_LOGIN;
    public static final EnumC852660Xce EMAIL_OTP_SIGNUP;
    public static final EnumC852660Xce HISTORY_LOGIN;
    public static final EnumC852660Xce HISTORY_LOGIN_WITH_PASSPORT_TICKET;
    public static final /* synthetic */ EnumC852660Xce[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC852660Xce LOGIN;
    public static final EnumC852660Xce MANAGE_TRUSTED_DEVICE;
    public static final EnumC852660Xce MODIFY_PHONE;
    public static final EnumC852660Xce NONE;
    public static final EnumC852660Xce PASSKEY_REGISTRATION;
    public static final EnumC852660Xce PASSKEY_WIZARD;
    public static final EnumC852660Xce RECOVER_ACCOUNT;
    public static final EnumC852660Xce REMOVE_TOTP;
    public static final EnumC852660Xce SET_OR_RESET_PASSWORD;
    public static final EnumC852660Xce SIGN_UP;
    public static final EnumC852660Xce TWO_STEP_VERIFICATION;
    public static final EnumC852660Xce UNBIND_EMAIL;
    public static final EnumC852660Xce UNBIND_PHONE;
    public static final EnumC852660Xce UPDATE_TOTP;
    public static final Map<Integer, EnumC852660Xce> VALUES_MAP;
    public static final EnumC852660Xce VERIFY;
    public static final EnumC852660Xce VERIFY_3P;
    public static final EnumC852660Xce VERIFY_ACCOUNT_FROM_2SV;
    public static final EnumC852660Xce VERIFY_TOTP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC852660Xce> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.0XYS] */
    static {
        EnumC852660Xce enumC852660Xce = new EnumC852660Xce("NONE", 0, -1);
        NONE = enumC852660Xce;
        EnumC852660Xce enumC852660Xce2 = new EnumC852660Xce("SIGN_UP", 1, 0);
        SIGN_UP = enumC852660Xce2;
        EnumC852660Xce enumC852660Xce3 = new EnumC852660Xce("LOGIN", 2, 1);
        LOGIN = enumC852660Xce3;
        EnumC852660Xce enumC852660Xce4 = new EnumC852660Xce("SET_OR_RESET_PASSWORD", 3, 2);
        SET_OR_RESET_PASSWORD = enumC852660Xce4;
        EnumC852660Xce enumC852660Xce5 = new EnumC852660Xce("BIND_PHONE", 4, 3);
        BIND_PHONE = enumC852660Xce5;
        EnumC852660Xce enumC852660Xce6 = new EnumC852660Xce("MODIFY_PHONE", 5, 4);
        MODIFY_PHONE = enumC852660Xce6;
        EnumC852660Xce enumC852660Xce7 = new EnumC852660Xce("RECOVER_ACCOUNT", 6, 5);
        RECOVER_ACCOUNT = enumC852660Xce7;
        EnumC852660Xce enumC852660Xce8 = new EnumC852660Xce("CHANGE_PASSWORD", 7, 9);
        CHANGE_PASSWORD = enumC852660Xce8;
        EnumC852660Xce enumC852660Xce9 = new EnumC852660Xce("BIND_EMAIL", 8, 6);
        BIND_EMAIL = enumC852660Xce9;
        EnumC852660Xce enumC852660Xce10 = new EnumC852660Xce("VERIFY", 9, 7);
        VERIFY = enumC852660Xce10;
        EnumC852660Xce enumC852660Xce11 = new EnumC852660Xce("CHANGE_EMAIL", 10, 8);
        CHANGE_EMAIL = enumC852660Xce11;
        EnumC852660Xce enumC852660Xce12 = new EnumC852660Xce("TWO_STEP_VERIFICATION", 11, 11);
        TWO_STEP_VERIFICATION = enumC852660Xce12;
        EnumC852660Xce enumC852660Xce13 = new EnumC852660Xce("EMAIL_OTP_LOGIN", 12, 13);
        EMAIL_OTP_LOGIN = enumC852660Xce13;
        EnumC852660Xce enumC852660Xce14 = new EnumC852660Xce("UNBIND_PHONE", 13, 14);
        UNBIND_PHONE = enumC852660Xce14;
        EnumC852660Xce enumC852660Xce15 = new EnumC852660Xce("UNBIND_EMAIL", 14, 15);
        UNBIND_EMAIL = enumC852660Xce15;
        EnumC852660Xce enumC852660Xce16 = new EnumC852660Xce("BIND_PHONE_OR_EMAIL_3P_LOGIN", 15, 16);
        BIND_PHONE_OR_EMAIL_3P_LOGIN = enumC852660Xce16;
        EnumC852660Xce enumC852660Xce17 = new EnumC852660Xce("BIND_PHONE_OR_EMAIL_3P_SIGN_UP", 16, 17);
        BIND_PHONE_OR_EMAIL_3P_SIGN_UP = enumC852660Xce17;
        EnumC852660Xce enumC852660Xce18 = new EnumC852660Xce("BIND_EMAIL_FROM_FEED", 17, 18);
        BIND_EMAIL_FROM_FEED = enumC852660Xce18;
        EnumC852660Xce enumC852660Xce19 = new EnumC852660Xce("BIND_EMAIL_FROM_INBOX", 18, 19);
        BIND_EMAIL_FROM_INBOX = enumC852660Xce19;
        EnumC852660Xce enumC852660Xce20 = new EnumC852660Xce("BIND_EMAIL_FROM_PROFILE", 19, 20);
        BIND_EMAIL_FROM_PROFILE = enumC852660Xce20;
        EnumC852660Xce enumC852660Xce21 = new EnumC852660Xce("BIND_TOTP", 20, 21);
        BIND_TOTP = enumC852660Xce21;
        EnumC852660Xce enumC852660Xce22 = new EnumC852660Xce("VERIFY_TOTP", 21, 22);
        VERIFY_TOTP = enumC852660Xce22;
        EnumC852660Xce enumC852660Xce23 = new EnumC852660Xce("UPDATE_TOTP", 22, 23);
        UPDATE_TOTP = enumC852660Xce23;
        EnumC852660Xce enumC852660Xce24 = new EnumC852660Xce("REMOVE_TOTP", 23, 24);
        REMOVE_TOTP = enumC852660Xce24;
        EnumC852660Xce enumC852660Xce25 = new EnumC852660Xce("VERIFY_ACCOUNT_FROM_2SV", 24, 25);
        VERIFY_ACCOUNT_FROM_2SV = enumC852660Xce25;
        EnumC852660Xce enumC852660Xce26 = new EnumC852660Xce("HISTORY_LOGIN", 25, 26);
        HISTORY_LOGIN = enumC852660Xce26;
        EnumC852660Xce enumC852660Xce27 = new EnumC852660Xce("ADD_CURRENT_DEVICE_TO_TRUST_DEVICE", 26, 27);
        ADD_CURRENT_DEVICE_TO_TRUST_DEVICE = enumC852660Xce27;
        EnumC852660Xce enumC852660Xce28 = new EnumC852660Xce("MANAGE_TRUSTED_DEVICE", 27, 28);
        MANAGE_TRUSTED_DEVICE = enumC852660Xce28;
        EnumC852660Xce enumC852660Xce29 = new EnumC852660Xce("PASSKEY_REGISTRATION", 28, 29);
        PASSKEY_REGISTRATION = enumC852660Xce29;
        EnumC852660Xce enumC852660Xce30 = new EnumC852660Xce("PASSKEY_WIZARD", 29, 30);
        PASSKEY_WIZARD = enumC852660Xce30;
        EnumC852660Xce enumC852660Xce31 = new EnumC852660Xce("EMAIL_OTP_SIGNUP", 30, 31);
        EMAIL_OTP_SIGNUP = enumC852660Xce31;
        EnumC852660Xce enumC852660Xce32 = new EnumC852660Xce("VERIFY_3P", 31, 32);
        VERIFY_3P = enumC852660Xce32;
        EnumC852660Xce enumC852660Xce33 = new EnumC852660Xce("HISTORY_LOGIN_WITH_PASSPORT_TICKET", 32, 33);
        HISTORY_LOGIN_WITH_PASSPORT_TICKET = enumC852660Xce33;
        EnumC852660Xce[] enumC852660XceArr = {enumC852660Xce, enumC852660Xce2, enumC852660Xce3, enumC852660Xce4, enumC852660Xce5, enumC852660Xce6, enumC852660Xce7, enumC852660Xce8, enumC852660Xce9, enumC852660Xce10, enumC852660Xce11, enumC852660Xce12, enumC852660Xce13, enumC852660Xce14, enumC852660Xce15, enumC852660Xce16, enumC852660Xce17, enumC852660Xce18, enumC852660Xce19, enumC852660Xce20, enumC852660Xce21, enumC852660Xce22, enumC852660Xce23, enumC852660Xce24, enumC852660Xce25, enumC852660Xce26, enumC852660Xce27, enumC852660Xce28, enumC852660Xce29, enumC852660Xce30, enumC852660Xce31, enumC852660Xce32, enumC852660Xce33};
        LLILLJJLI = enumC852660XceArr;
        LLILLL = new C2254308sP(enumC852660XceArr);
        Companion = new Object() { // from class: X.0XYS
        };
        EnumC852660Xce[] enumC852660XceArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC852660XceArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ >= 16 ? iLIZIZ : 16);
        for (EnumC852660Xce enumC852660Xce34 : enumC852660XceArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC852660Xce34.LL), enumC852660Xce34);
        }
        VALUES_MAP = linkedHashMap;
    }

    public static EnumC852660Xce[] values() {
        return (EnumC852660Xce[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC852660Xce valueOf(String str) {
        return (EnumC852660Xce) C08FF.LIZ(EnumC852660Xce.class, str);
    }

    public EnumC852660Xce(String str, int i, int i2) {
        this.LL = i2;
    }
}
