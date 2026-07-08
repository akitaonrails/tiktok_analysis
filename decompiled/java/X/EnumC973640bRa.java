package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC973640bRa {
    public static final EnumC973640bRa CATCH_BEANS_GUIDE;
    public static final EnumC973640bRa CATCH_BEANS_GUIDE_CAPSULE;
    public static final EnumC973640bRa COMPETITION_PLATFORM_ACTION;
    public static final EnumC973640bRa INDIVIDUAL_GUIDE;
    public static final EnumC973640bRa LIVE_FEST_PAGE;
    public static final /* synthetic */ EnumC973640bRa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC973640bRa MULTI_PK_GUIDE;
    public static final EnumC973640bRa OTHER_VALUE;
    public static final EnumC973640bRa PK_GUIDE;
    public static final EnumC973640bRa PK_ICON;
    public static final EnumC973640bRa PK_REMATCH;
    public static final EnumC973640bRa PLAZA_ICON;
    public static final EnumC973640bRa TAKE_STAGE_GUIDE;
    public static final EnumC973640bRa TAKE_STAGE_GUIDE_V2;
    public final String LL;

    public static InterfaceC2044707zh<EnumC973640bRa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC973640bRa enumC973640bRa = new EnumC973640bRa("PK_ICON", 0, "pk_icon");
        PK_ICON = enumC973640bRa;
        EnumC973640bRa enumC973640bRa2 = new EnumC973640bRa("PLAZA_ICON", 1, "plaza_icon");
        PLAZA_ICON = enumC973640bRa2;
        EnumC973640bRa enumC973640bRa3 = new EnumC973640bRa("PK_GUIDE", 2, "pk_guide");
        PK_GUIDE = enumC973640bRa3;
        EnumC973640bRa enumC973640bRa4 = new EnumC973640bRa("INDIVIDUAL_GUIDE", 3, "1v1v1_guide");
        INDIVIDUAL_GUIDE = enumC973640bRa4;
        EnumC973640bRa enumC973640bRa5 = new EnumC973640bRa("PK_REMATCH", 4, "rematch");
        PK_REMATCH = enumC973640bRa5;
        EnumC973640bRa enumC973640bRa6 = new EnumC973640bRa("MULTI_PK_GUIDE", 5, "multi_pk_guide");
        MULTI_PK_GUIDE = enumC973640bRa6;
        EnumC973640bRa enumC973640bRa7 = new EnumC973640bRa("TAKE_STAGE_GUIDE", 6, "take_stage_guide");
        TAKE_STAGE_GUIDE = enumC973640bRa7;
        EnumC973640bRa enumC973640bRa8 = new EnumC973640bRa("TAKE_STAGE_GUIDE_V2", 7, "take_stage_guide_v2");
        TAKE_STAGE_GUIDE_V2 = enumC973640bRa8;
        EnumC973640bRa enumC973640bRa9 = new EnumC973640bRa("CATCH_BEANS_GUIDE", 8, "catch_bean_guide");
        CATCH_BEANS_GUIDE = enumC973640bRa9;
        EnumC973640bRa enumC973640bRa10 = new EnumC973640bRa("CATCH_BEANS_GUIDE_CAPSULE", 9, "catch_bean_guide_capsule");
        CATCH_BEANS_GUIDE_CAPSULE = enumC973640bRa10;
        EnumC973640bRa enumC973640bRa11 = new EnumC973640bRa("COMPETITION_PLATFORM_ACTION", 10, "competition_platform_action");
        COMPETITION_PLATFORM_ACTION = enumC973640bRa11;
        EnumC973640bRa enumC973640bRa12 = new EnumC973640bRa("LIVE_FEST_PAGE", 11, "livefest_page");
        LIVE_FEST_PAGE = enumC973640bRa12;
        EnumC973640bRa enumC973640bRa13 = new EnumC973640bRa("OTHER_VALUE", 12, "other_values");
        OTHER_VALUE = enumC973640bRa13;
        EnumC973640bRa[] enumC973640bRaArr = {enumC973640bRa, enumC973640bRa2, enumC973640bRa3, enumC973640bRa4, enumC973640bRa5, enumC973640bRa6, enumC973640bRa7, enumC973640bRa8, enumC973640bRa9, enumC973640bRa10, enumC973640bRa11, enumC973640bRa12, enumC973640bRa13};
        LLILLJJLI = enumC973640bRaArr;
        LLILLL = new C2254308sP(enumC973640bRaArr);
    }

    public static EnumC973640bRa[] values() {
        return (EnumC973640bRa[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC973640bRa valueOf(String str) {
        return (EnumC973640bRa) C08FF.LIZ(EnumC973640bRa.class, str);
    }

    public EnumC973640bRa(String str, int i, String str2) {
        this.LL = str2;
    }
}
