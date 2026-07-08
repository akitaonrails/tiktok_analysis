package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1741270vPh {
    public static final EnumC1741270vPh FIRST_SCREEN;
    public static final EnumC1741270vPh FROM_BACKGROUND;
    public static final EnumC1741270vPh FROM_SPLIT_SCREEN;
    public static final EnumC1741270vPh FROM_SUBPAGE;
    public static final /* synthetic */ EnumC1741270vPh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1741270vPh MALL_ROUTE_IN_HOMEPAGE;
    public static final EnumC1741270vPh TAB_SWITCH;
    public static final EnumC1741270vPh TO_BACKGROUND;
    public static final EnumC1741270vPh TO_SPLIT_SCREEN;
    public static final EnumC1741270vPh TO_SUBPAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1741270vPh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1741270vPh enumC1741270vPh = new EnumC1741270vPh("TAB_SWITCH", 0, "tab_switch");
        TAB_SWITCH = enumC1741270vPh;
        EnumC1741270vPh enumC1741270vPh2 = new EnumC1741270vPh("FROM_BACKGROUND", 1, "from_background");
        FROM_BACKGROUND = enumC1741270vPh2;
        EnumC1741270vPh enumC1741270vPh3 = new EnumC1741270vPh("TO_BACKGROUND", 2, "to_background");
        TO_BACKGROUND = enumC1741270vPh3;
        EnumC1741270vPh enumC1741270vPh4 = new EnumC1741270vPh("FROM_SUBPAGE", 3, "from_subpage");
        FROM_SUBPAGE = enumC1741270vPh4;
        EnumC1741270vPh enumC1741270vPh5 = new EnumC1741270vPh("TO_SUBPAGE", 4, "to_subpage");
        TO_SUBPAGE = enumC1741270vPh5;
        EnumC1741270vPh enumC1741270vPh6 = new EnumC1741270vPh("FROM_SPLIT_SCREEN", 5, "from_split_screen");
        FROM_SPLIT_SCREEN = enumC1741270vPh6;
        EnumC1741270vPh enumC1741270vPh7 = new EnumC1741270vPh("TO_SPLIT_SCREEN", 6, "to_split_screen");
        TO_SPLIT_SCREEN = enumC1741270vPh7;
        EnumC1741270vPh enumC1741270vPh8 = new EnumC1741270vPh("FIRST_SCREEN", 7, "first_screen");
        FIRST_SCREEN = enumC1741270vPh8;
        EnumC1741270vPh enumC1741270vPh9 = new EnumC1741270vPh("MALL_ROUTE_IN_HOMEPAGE", 8, "mall_route_in_homepage");
        MALL_ROUTE_IN_HOMEPAGE = enumC1741270vPh9;
        EnumC1741270vPh[] enumC1741270vPhArr = {enumC1741270vPh, enumC1741270vPh2, enumC1741270vPh3, enumC1741270vPh4, enumC1741270vPh5, enumC1741270vPh6, enumC1741270vPh7, enumC1741270vPh8, enumC1741270vPh9};
        LLILLJJLI = enumC1741270vPhArr;
        LLILLL = new C2254308sP(enumC1741270vPhArr);
    }

    public static EnumC1741270vPh[] values() {
        return (EnumC1741270vPh[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1741270vPh valueOf(String str) {
        return (EnumC1741270vPh) C08FF.LIZ(EnumC1741270vPh.class, str);
    }

    public EnumC1741270vPh(String str, int i, String str2) {
        this.LL = str2;
    }
}
