package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1915980zxU {
    public static final EnumC1915980zxU CONSENT_AGE_GATE_PASS;
    public static final EnumC1915980zxU CONSENT_BOX;
    public static final EnumC1915980zxU CONSENT_DEFAULT;
    public static final EnumC1915980zxU CONSENT_GUEST_MODE;
    public static final EnumC1915980zxU CONSENT_KIDS_LOGIN_ONCE;
    public static final EnumC1915980zxU CONSENT_KIDS_MODE;
    public static final EnumC1915980zxU CONSENT_LOGIN;
    public static final EnumC1915980zxU CONSENT_LOGIN_ONCE;
    public static final C1916050zxb Companion;
    public static final EnumC1915980zxU DOES_NOT_HAVE_CONSENT;
    public static final EnumC1915980zxU HAS_CONSENT;
    public static final EnumC1915980zxU HU_CONSENT_SHEET;
    public static final /* synthetic */ EnumC1915980zxU[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1915980zxU NUJ_CONSENT;
    public static final EnumC1915980zxU TEST_USER_DEBUG_TOOL;
    public static final EnumC1915980zxU USER_AGREED_CONSENT;
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1915980zxU> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0zxb] */
    static {
        EnumC1915980zxU enumC1915980zxU = new EnumC1915980zxU("CONSENT_DEFAULT", 0, "", "", 0);
        CONSENT_DEFAULT = enumC1915980zxU;
        EnumC1915980zxU enumC1915980zxU2 = new EnumC1915980zxU("CONSENT_LOGIN", 1, "login_normal", "746618880516", 1);
        CONSENT_LOGIN = enumC1915980zxU2;
        EnumC1915980zxU enumC1915980zxU3 = new EnumC1915980zxU("CONSENT_KIDS_MODE", 2, "login_kids_mode", "744975360516", 2);
        CONSENT_KIDS_MODE = enumC1915980zxU3;
        EnumC1915980zxU enumC1915980zxU4 = new EnumC1915980zxU("CONSENT_GUEST_MODE", 3, "guest_mode", "744975361028", 3);
        CONSENT_GUEST_MODE = enumC1915980zxU4;
        EnumC1915980zxU enumC1915980zxU5 = new EnumC1915980zxU("CONSENT_LOGIN_ONCE", 4, "has_ever_logged_in", "746618880772", 4);
        CONSENT_LOGIN_ONCE = enumC1915980zxU5;
        EnumC1915980zxU enumC1915980zxU6 = new EnumC1915980zxU("CONSENT_KIDS_LOGIN_ONCE", 5, "last_login_kids_mode", "744975360772", 5);
        CONSENT_KIDS_LOGIN_ONCE = enumC1915980zxU6;
        EnumC1915980zxU enumC1915980zxU7 = new EnumC1915980zxU("CONSENT_BOX", 6, "consent_box", "746296320260", 6);
        CONSENT_BOX = enumC1915980zxU7;
        EnumC1915980zxU enumC1915980zxU8 = new EnumC1915980zxU("DOES_NOT_HAVE_CONSENT", 7, "does_not_have_consent", "", 7);
        DOES_NOT_HAVE_CONSENT = enumC1915980zxU8;
        EnumC1915980zxU enumC1915980zxU9 = new EnumC1915980zxU("CONSENT_AGE_GATE_PASS", 8, "age_gate_pass", "747248640772", 8);
        CONSENT_AGE_GATE_PASS = enumC1915980zxU9;
        EnumC1915980zxU enumC1915980zxU10 = new EnumC1915980zxU("HAS_CONSENT", 9, "has_consent", "", 10);
        HAS_CONSENT = enumC1915980zxU10;
        EnumC1915980zxU enumC1915980zxU11 = new EnumC1915980zxU("USER_AGREED_CONSENT", 10, "user_agreed_consent", "746956801028", 11);
        USER_AGREED_CONSENT = enumC1915980zxU11;
        EnumC1915980zxU enumC1915980zxU12 = new EnumC1915980zxU("NUJ_CONSENT", 11, "nuj_consent", "", 101);
        NUJ_CONSENT = enumC1915980zxU12;
        EnumC1915980zxU enumC1915980zxU13 = new EnumC1915980zxU("TEST_USER_DEBUG_TOOL", 12, "test_user_debug_tool", "744975364612", 102);
        TEST_USER_DEBUG_TOOL = enumC1915980zxU13;
        EnumC1915980zxU enumC1915980zxU14 = new EnumC1915980zxU("HU_CONSENT_SHEET", 13, "hu_consent_sheet", "", 103);
        HU_CONSENT_SHEET = enumC1915980zxU14;
        EnumC1915980zxU[] enumC1915980zxUArr = {enumC1915980zxU, enumC1915980zxU2, enumC1915980zxU3, enumC1915980zxU4, enumC1915980zxU5, enumC1915980zxU6, enumC1915980zxU7, enumC1915980zxU8, enumC1915980zxU9, enumC1915980zxU10, enumC1915980zxU11, enumC1915980zxU12, enumC1915980zxU13, enumC1915980zxU14};
        LLILZ = enumC1915980zxUArr;
        LLILZIL = new C2254308sP(enumC1915980zxUArr);
        Companion = new Object() { // from class: X.0zxb
        };
    }

    public static EnumC1915980zxU[] values() {
        return (EnumC1915980zxU[]) LLILZ.clone();
    }

    public final String getCollectionPointId() {
        return this.LLILLJJLI;
    }

    public final String getFlow() {
        return this.LL;
    }

    public final int getLegacyReasonValue() {
        return this.LLILLL;
    }

    public static EnumC1915980zxU valueOf(String str) {
        return (EnumC1915980zxU) C08FF.LIZ(EnumC1915980zxU.class, str);
    }

    public EnumC1915980zxU(String str, int i, String str2, String str3, int i2) {
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = i2;
    }
}
