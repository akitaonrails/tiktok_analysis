package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21279418Pg {
    public static final /* synthetic */ EnumC21279418Pg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21279418Pg OTHER;
    public static final EnumC21279418Pg PRODUCT_CARD;
    public static final EnumC21279418Pg SHOP_TAB_ICON;
    public static final EnumC21279418Pg VIDEO_CTA;
    public static final EnumC21279418Pg VIDEO_DESC;
    public static final EnumC21279418Pg VIDEO_MASK;
    public static final EnumC21279418Pg VIDEO_PROFILE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21279418Pg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21279418Pg enumC21279418Pg = new EnumC21279418Pg("PRODUCT_CARD", 0, "card");
        PRODUCT_CARD = enumC21279418Pg;
        EnumC21279418Pg enumC21279418Pg2 = new EnumC21279418Pg("SHOP_TAB_ICON", 1, "shop_tab");
        SHOP_TAB_ICON = enumC21279418Pg2;
        EnumC21279418Pg enumC21279418Pg3 = new EnumC21279418Pg("VIDEO_DESC", 2, "ad_desc");
        VIDEO_DESC = enumC21279418Pg3;
        EnumC21279418Pg enumC21279418Pg4 = new EnumC21279418Pg("VIDEO_CTA", 3, "cta_button");
        VIDEO_CTA = enumC21279418Pg4;
        EnumC21279418Pg enumC21279418Pg5 = new EnumC21279418Pg("VIDEO_MASK", 4, "mask");
        VIDEO_MASK = enumC21279418Pg5;
        EnumC21279418Pg enumC21279418Pg6 = new EnumC21279418Pg("VIDEO_PROFILE", 5, "profile");
        VIDEO_PROFILE = enumC21279418Pg6;
        EnumC21279418Pg enumC21279418Pg7 = new EnumC21279418Pg("OTHER", 6, "other");
        OTHER = enumC21279418Pg7;
        EnumC21279418Pg[] enumC21279418PgArr = {enumC21279418Pg, enumC21279418Pg2, enumC21279418Pg3, enumC21279418Pg4, enumC21279418Pg5, enumC21279418Pg6, enumC21279418Pg7};
        LLILLJJLI = enumC21279418PgArr;
        LLILLL = new C2254308sP(enumC21279418PgArr);
    }

    public static EnumC21279418Pg[] values() {
        return (EnumC21279418Pg[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21279418Pg valueOf(String str) {
        return (EnumC21279418Pg) C08FF.LIZ(EnumC21279418Pg.class, str);
    }

    public EnumC21279418Pg(String str, int i, String str2) {
        this.LL = str2;
    }
}
