package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1741200vPa {
    public static final EnumC1741200vPa CLOSE_LANDING_PAGE_FULL_SCREEN;
    public static final EnumC1741200vPa CLOSE_LANDING_PAGE_HALF_SCREEN;
    public static final EnumC1741200vPa CLOSE_SUB_PAGE_FULL_SCREEN;
    public static final EnumC1741200vPa CLOSE_SUB_PAGE_HALF_SCREEN;
    public static final EnumC1741200vPa ENTER_MALL;
    public static final EnumC1741200vPa IN_MALL_HOMEPAGE_SPIN;
    public static final EnumC1741200vPa LEAVE_MALL;
    public static final /* synthetic */ EnumC1741200vPa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1741200vPa LOGIN;
    public static final EnumC1741200vPa OPEN_LANDING_PAGE_FULL_SCREEN;
    public static final EnumC1741200vPa OPEN_LANDING_PAGE_HALF_SCREEN;
    public static final EnumC1741200vPa OPEN_SUB_PAGE_FULL_SCREEN;
    public static final EnumC1741200vPa OPEN_SUB_PAGE_HALF_SCREEN;
    public static final EnumC1741200vPa TO_ACTIVE;
    public static final EnumC1741200vPa TO_NOT_ACTIVE;
    public static final EnumC1741200vPa UNEXPECTED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1741200vPa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1741200vPa enumC1741200vPa = new EnumC1741200vPa("UNEXPECTED", 0, "unexpected");
        UNEXPECTED = enumC1741200vPa;
        EnumC1741200vPa enumC1741200vPa2 = new EnumC1741200vPa("ENTER_MALL", 1, "enter_mall");
        ENTER_MALL = enumC1741200vPa2;
        EnumC1741200vPa enumC1741200vPa3 = new EnumC1741200vPa("IN_MALL_HOMEPAGE_SPIN", 2, "in_mall_homepage_spin");
        IN_MALL_HOMEPAGE_SPIN = enumC1741200vPa3;
        EnumC1741200vPa enumC1741200vPa4 = new EnumC1741200vPa("LEAVE_MALL", 3, "leave_mall");
        LEAVE_MALL = enumC1741200vPa4;
        EnumC1741200vPa enumC1741200vPa5 = new EnumC1741200vPa("LOGIN", 4, "login");
        LOGIN = enumC1741200vPa5;
        EnumC1741200vPa enumC1741200vPa6 = new EnumC1741200vPa("TO_NOT_ACTIVE", 5, "to_not_active");
        TO_NOT_ACTIVE = enumC1741200vPa6;
        EnumC1741200vPa enumC1741200vPa7 = new EnumC1741200vPa("TO_ACTIVE", 6, "to_active");
        TO_ACTIVE = enumC1741200vPa7;
        EnumC1741200vPa enumC1741200vPa8 = new EnumC1741200vPa("OPEN_LANDING_PAGE_FULL_SCREEN", 7, "open_landing_page_full_screen");
        OPEN_LANDING_PAGE_FULL_SCREEN = enumC1741200vPa8;
        EnumC1741200vPa enumC1741200vPa9 = new EnumC1741200vPa("CLOSE_LANDING_PAGE_FULL_SCREEN", 8, "close_landing_page_full_screen");
        CLOSE_LANDING_PAGE_FULL_SCREEN = enumC1741200vPa9;
        EnumC1741200vPa enumC1741200vPa10 = new EnumC1741200vPa("OPEN_LANDING_PAGE_HALF_SCREEN", 9, "open_landing_page_half_screen");
        OPEN_LANDING_PAGE_HALF_SCREEN = enumC1741200vPa10;
        EnumC1741200vPa enumC1741200vPa11 = new EnumC1741200vPa("CLOSE_LANDING_PAGE_HALF_SCREEN", 10, "close_landing_page_half_screen");
        CLOSE_LANDING_PAGE_HALF_SCREEN = enumC1741200vPa11;
        EnumC1741200vPa enumC1741200vPa12 = new EnumC1741200vPa("OPEN_SUB_PAGE_FULL_SCREEN", 11, "open_manually_subpage_full_screen");
        OPEN_SUB_PAGE_FULL_SCREEN = enumC1741200vPa12;
        EnumC1741200vPa enumC1741200vPa13 = new EnumC1741200vPa("CLOSE_SUB_PAGE_FULL_SCREEN", 12, "close_manually_subpage_full_screen");
        CLOSE_SUB_PAGE_FULL_SCREEN = enumC1741200vPa13;
        EnumC1741200vPa enumC1741200vPa14 = new EnumC1741200vPa("OPEN_SUB_PAGE_HALF_SCREEN", 13, "open_manually_subpage_half_screen");
        OPEN_SUB_PAGE_HALF_SCREEN = enumC1741200vPa14;
        EnumC1741200vPa enumC1741200vPa15 = new EnumC1741200vPa("CLOSE_SUB_PAGE_HALF_SCREEN", 14, "close_manually_subpage_half_screen");
        CLOSE_SUB_PAGE_HALF_SCREEN = enumC1741200vPa15;
        EnumC1741200vPa[] enumC1741200vPaArr = {enumC1741200vPa, enumC1741200vPa2, enumC1741200vPa3, enumC1741200vPa4, enumC1741200vPa5, enumC1741200vPa6, enumC1741200vPa7, enumC1741200vPa8, enumC1741200vPa9, enumC1741200vPa10, enumC1741200vPa11, enumC1741200vPa12, enumC1741200vPa13, enumC1741200vPa14, enumC1741200vPa15};
        LLILLJJLI = enumC1741200vPaArr;
        LLILLL = new C2254308sP(enumC1741200vPaArr);
    }

    public static EnumC1741200vPa[] values() {
        return (EnumC1741200vPa[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1741200vPa valueOf(String str) {
        return (EnumC1741200vPa) C08FF.LIZ(EnumC1741200vPa.class, str);
    }

    public EnumC1741200vPa(String str, int i, String str2) {
        this.LL = str2;
    }
}
