package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994330byx {
    public static final C994340byy Companion;
    public static final EnumC994330byx GROUP_JOIN_CHECK_ITEM_TYPE_CAMPUS_VERIFIED;
    public static final EnumC994330byx GROUP_JOIN_CHECK_ITEM_TYPE_DM_SETTING_PERMISSION;
    public static final EnumC994330byx GROUP_JOIN_CHECK_ITEM_TYPE_FOLLOW;
    public static final EnumC994330byx GROUP_JOIN_CHECK_ITEM_TYPE_LIVE_TEAM_LEVEL;
    public static final EnumC994330byx GROUP_JOIN_CHECK_ITEM_TYPE_SUBSCRIBE;
    public static final EnumC994330byx GROUP_JOIN_CHECK_ITEM_TYPE_SUPER_FAN;
    public static final EnumC994330byx GROUP_JOIN_CHECK_ITEM_TYPE_UNKNOWN;
    public static final /* synthetic */ EnumC994330byx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC994330byx> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0byy] */
    static {
        EnumC994330byx enumC994330byx = new EnumC994330byx("GROUP_JOIN_CHECK_ITEM_TYPE_UNKNOWN", 0, 0);
        GROUP_JOIN_CHECK_ITEM_TYPE_UNKNOWN = enumC994330byx;
        EnumC994330byx enumC994330byx2 = new EnumC994330byx("GROUP_JOIN_CHECK_ITEM_TYPE_LIVE_TEAM_LEVEL", 1, 1);
        GROUP_JOIN_CHECK_ITEM_TYPE_LIVE_TEAM_LEVEL = enumC994330byx2;
        EnumC994330byx enumC994330byx3 = new EnumC994330byx("GROUP_JOIN_CHECK_ITEM_TYPE_FOLLOW", 2, 2);
        GROUP_JOIN_CHECK_ITEM_TYPE_FOLLOW = enumC994330byx3;
        EnumC994330byx enumC994330byx4 = new EnumC994330byx("GROUP_JOIN_CHECK_ITEM_TYPE_SUBSCRIBE", 3, 3);
        GROUP_JOIN_CHECK_ITEM_TYPE_SUBSCRIBE = enumC994330byx4;
        EnumC994330byx enumC994330byx5 = new EnumC994330byx("GROUP_JOIN_CHECK_ITEM_TYPE_CAMPUS_VERIFIED", 4, 4);
        GROUP_JOIN_CHECK_ITEM_TYPE_CAMPUS_VERIFIED = enumC994330byx5;
        EnumC994330byx enumC994330byx6 = new EnumC994330byx("GROUP_JOIN_CHECK_ITEM_TYPE_SUPER_FAN", 5, 5);
        GROUP_JOIN_CHECK_ITEM_TYPE_SUPER_FAN = enumC994330byx6;
        EnumC994330byx enumC994330byx7 = new EnumC994330byx("GROUP_JOIN_CHECK_ITEM_TYPE_DM_SETTING_PERMISSION", 6, 6);
        GROUP_JOIN_CHECK_ITEM_TYPE_DM_SETTING_PERMISSION = enumC994330byx7;
        EnumC994330byx[] enumC994330byxArr = {enumC994330byx, enumC994330byx2, enumC994330byx3, enumC994330byx4, enumC994330byx5, enumC994330byx6, enumC994330byx7};
        LLILLJJLI = enumC994330byxArr;
        LLILLL = new C2254308sP(enumC994330byxArr);
        Companion = new Object() { // from class: X.0byy
        };
    }

    public static EnumC994330byx[] values() {
        return (EnumC994330byx[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC994330byx valueOf(String str) {
        return (EnumC994330byx) C08FF.LIZ(EnumC994330byx.class, str);
    }

    public EnumC994330byx(String str, int i, int i2) {
        this.LL = i2;
    }
}
