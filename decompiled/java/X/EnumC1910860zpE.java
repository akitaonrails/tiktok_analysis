package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1910860zpE {
    public static final EnumC1910860zpE AUTH;
    public static final EnumC1910860zpE BIG_CARD;
    public static final EnumC1910860zpE BUTTON;
    public static final EnumC1910860zpE CAMPUS;
    public static final EnumC1910860zpE CONNECT_NOW;
    public static final EnumC1910860zpE EDIT_PROFILE;
    public static final EnumC1910860zpE FFP;
    public static final EnumC1910860zpE LABEL;
    public static final /* synthetic */ EnumC1910860zpE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1910860zpE PROFILE;
    public static final EnumC1910860zpE RELATION_LISTS;
    public static final EnumC1910860zpE SOCIAL_AVATAR;
    public static final EnumC1910860zpE STATUS;
    public static final EnumC1910860zpE UNKNOWN;
    public static final EnumC1910860zpE USER_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1910860zpE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1910860zpE enumC1910860zpE = new EnumC1910860zpE("BIG_CARD", 0, "BIG_CARD");
        BIG_CARD = enumC1910860zpE;
        EnumC1910860zpE enumC1910860zpE2 = new EnumC1910860zpE("STATUS", 1, "RELATION_STATUS");
        STATUS = enumC1910860zpE2;
        EnumC1910860zpE enumC1910860zpE3 = new EnumC1910860zpE("FFP", 2, "FIND_FRIENDS");
        FFP = enumC1910860zpE3;
        EnumC1910860zpE enumC1910860zpE4 = new EnumC1910860zpE("CONNECT_NOW", 3, "CONNECT_NOW");
        CONNECT_NOW = enumC1910860zpE4;
        EnumC1910860zpE enumC1910860zpE5 = new EnumC1910860zpE("USER_CARD", 4, "USER_CARD");
        USER_CARD = enumC1910860zpE5;
        EnumC1910860zpE enumC1910860zpE6 = new EnumC1910860zpE("RELATION_LISTS", 5, "RELATION_LISTS");
        RELATION_LISTS = enumC1910860zpE6;
        EnumC1910860zpE enumC1910860zpE7 = new EnumC1910860zpE("BUTTON", 6, "RELATION_BUTTON");
        BUTTON = enumC1910860zpE7;
        EnumC1910860zpE enumC1910860zpE8 = new EnumC1910860zpE("LABEL", 7, "RELATION_LABEL");
        LABEL = enumC1910860zpE8;
        EnumC1910860zpE enumC1910860zpE9 = new EnumC1910860zpE("PROFILE", 8, "PROFILE");
        PROFILE = enumC1910860zpE9;
        EnumC1910860zpE enumC1910860zpE10 = new EnumC1910860zpE("EDIT_PROFILE", 9, "EDIT_PROFILE");
        EDIT_PROFILE = enumC1910860zpE10;
        EnumC1910860zpE enumC1910860zpE11 = new EnumC1910860zpE("SOCIAL_AVATAR", 10, "SOCIAL_AVATAR");
        SOCIAL_AVATAR = enumC1910860zpE11;
        EnumC1910860zpE enumC1910860zpE12 = new EnumC1910860zpE("AUTH", 11, "AUTH");
        AUTH = enumC1910860zpE12;
        EnumC1910860zpE enumC1910860zpE13 = new EnumC1910860zpE("CAMPUS", 12, "CAMPUS");
        CAMPUS = enumC1910860zpE13;
        EnumC1910860zpE enumC1910860zpE14 = new EnumC1910860zpE("UNKNOWN", 13, "");
        UNKNOWN = enumC1910860zpE14;
        EnumC1910860zpE[] enumC1910860zpEArr = {enumC1910860zpE, enumC1910860zpE2, enumC1910860zpE3, enumC1910860zpE4, enumC1910860zpE5, enumC1910860zpE6, enumC1910860zpE7, enumC1910860zpE8, enumC1910860zpE9, enumC1910860zpE10, enumC1910860zpE11, enumC1910860zpE12, enumC1910860zpE13, enumC1910860zpE14};
        LLILLJJLI = enumC1910860zpEArr;
        LLILLL = new C2254308sP(enumC1910860zpEArr);
    }

    public static EnumC1910860zpE[] values() {
        return (EnumC1910860zpE[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1910860zpE valueOf(String str) {
        return (EnumC1910860zpE) C08FF.LIZ(EnumC1910860zpE.class, str);
    }

    public EnumC1910860zpE(String str, int i, String str2) {
        this.LL = str2;
    }
}
