package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r3B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1573550r3B {
    public static final EnumC1573550r3B BOTTOM_TAB;
    public static final /* synthetic */ EnumC1573550r3B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1573550r3B MY_LIST;
    public static final EnumC1573550r3B PROFILE_TAB;
    public static final EnumC1573550r3B SERIES_CENTER;
    public static final EnumC1573550r3B SERIES_DISCOVER;
    public static final EnumC1573550r3B TOP_TAB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1573550r3B> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1573550r3B enumC1573550r3B = new EnumC1573550r3B("TOP_TAB", 0, "top_tab");
        TOP_TAB = enumC1573550r3B;
        EnumC1573550r3B enumC1573550r3B2 = new EnumC1573550r3B("BOTTOM_TAB", 1, "bottom_tab");
        BOTTOM_TAB = enumC1573550r3B2;
        EnumC1573550r3B enumC1573550r3B3 = new EnumC1573550r3B("PROFILE_TAB", 2, "profile_tab");
        PROFILE_TAB = enumC1573550r3B3;
        EnumC1573550r3B enumC1573550r3B4 = new EnumC1573550r3B("SERIES_CENTER", 3, "series_center");
        SERIES_CENTER = enumC1573550r3B4;
        EnumC1573550r3B enumC1573550r3B5 = new EnumC1573550r3B("SERIES_DISCOVER", 4, "series_discover");
        SERIES_DISCOVER = enumC1573550r3B5;
        EnumC1573550r3B enumC1573550r3B6 = new EnumC1573550r3B("MY_LIST", 5, "my_list");
        MY_LIST = enumC1573550r3B6;
        EnumC1573550r3B[] enumC1573550r3BArr = {enumC1573550r3B, enumC1573550r3B2, enumC1573550r3B3, enumC1573550r3B4, enumC1573550r3B5, enumC1573550r3B6};
        LLILLJJLI = enumC1573550r3BArr;
        LLILLL = new C2254308sP(enumC1573550r3BArr);
    }

    public static EnumC1573550r3B[] values() {
        return (EnumC1573550r3B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1573550r3B valueOf(String str) {
        return (EnumC1573550r3B) C08FF.LIZ(EnumC1573550r3B.class, str);
    }

    public EnumC1573550r3B(String str, int i, String str2) {
        this.LL = str2;
    }
}
