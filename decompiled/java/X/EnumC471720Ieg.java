package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ieg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC471720Ieg {
    public static final EnumC471720Ieg LIVE_TAB;
    public static final /* synthetic */ EnumC471720Ieg[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC471720Ieg NEARBY_PAGE;
    public static final EnumC471720Ieg TOP_LIVE;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC471720Ieg> getEntries() {
        return LLILZ;
    }

    static {
        EnumC471720Ieg enumC471720Ieg = new EnumC471720Ieg("TOP_LIVE", 0, "live_merge", "toplive_live_cover");
        TOP_LIVE = enumC471720Ieg;
        EnumC471720Ieg enumC471720Ieg2 = new EnumC471720Ieg("LIVE_TAB", 1, "homepage_bottom_live", "live_cover");
        LIVE_TAB = enumC471720Ieg2;
        EnumC471720Ieg enumC471720Ieg3 = new EnumC471720Ieg("NEARBY_PAGE", 2, "live_merge", "nearby_tab_toplive_live_cover");
        NEARBY_PAGE = enumC471720Ieg3;
        EnumC471720Ieg[] enumC471720IegArr = {enumC471720Ieg, enumC471720Ieg2, enumC471720Ieg3};
        LLILLL = enumC471720IegArr;
        LLILZ = new C2254308sP(enumC471720IegArr);
    }

    public static EnumC471720Ieg[] values() {
        return (EnumC471720Ieg[]) LLILLL.clone();
    }

    public final String getEnterFrom() {
        return this.LL;
    }

    public final String getEnterMethod() {
        return this.LLILLJJLI;
    }

    public static EnumC471720Ieg valueOf(String str) {
        return (EnumC471720Ieg) C08FF.LIZ(EnumC471720Ieg.class, str);
    }

    public EnumC471720Ieg(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
