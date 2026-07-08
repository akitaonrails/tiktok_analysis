package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2196771AyJ {
    public static final EnumC2196771AyJ ADS;
    public static final EnumC2196771AyJ ANCHOR;
    public static final EnumC2196771AyJ CENTER;
    public static final EnumC2196771AyJ DEBUG;
    public static final EnumC2196771AyJ DM_PLAYGROUND;
    public static final EnumC2196771AyJ FEED_SIDEBAR;
    public static final EnumC2196771AyJ FYF_LYNX;
    public static final /* synthetic */ EnumC2196771AyJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2196771AyJ SEARCH;
    public static final EnumC2196771AyJ UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2196771AyJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2196771AyJ enumC2196771AyJ = new EnumC2196771AyJ("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC2196771AyJ;
        EnumC2196771AyJ enumC2196771AyJ2 = new EnumC2196771AyJ("ADS", 1, "ads");
        ADS = enumC2196771AyJ2;
        EnumC2196771AyJ enumC2196771AyJ3 = new EnumC2196771AyJ("SEARCH", 2, "search");
        SEARCH = enumC2196771AyJ3;
        EnumC2196771AyJ enumC2196771AyJ4 = new EnumC2196771AyJ("ANCHOR", 3, "anchor");
        ANCHOR = enumC2196771AyJ4;
        EnumC2196771AyJ enumC2196771AyJ5 = new EnumC2196771AyJ("DEBUG", 4, "debug");
        DEBUG = enumC2196771AyJ5;
        EnumC2196771AyJ enumC2196771AyJ6 = new EnumC2196771AyJ("FYF_LYNX", 5, "fyf_lynx");
        FYF_LYNX = enumC2196771AyJ6;
        EnumC2196771AyJ enumC2196771AyJ7 = new EnumC2196771AyJ("CENTER", 6, "center");
        CENTER = enumC2196771AyJ7;
        EnumC2196771AyJ enumC2196771AyJ8 = new EnumC2196771AyJ("FEED_SIDEBAR", 7, "feed_sidebar");
        FEED_SIDEBAR = enumC2196771AyJ8;
        EnumC2196771AyJ enumC2196771AyJ9 = new EnumC2196771AyJ("DM_PLAYGROUND", 8, "dm_playground");
        DM_PLAYGROUND = enumC2196771AyJ9;
        EnumC2196771AyJ[] enumC2196771AyJArr = {enumC2196771AyJ, enumC2196771AyJ2, enumC2196771AyJ3, enumC2196771AyJ4, enumC2196771AyJ5, enumC2196771AyJ6, enumC2196771AyJ7, enumC2196771AyJ8, enumC2196771AyJ9};
        LLILLJJLI = enumC2196771AyJArr;
        LLILLL = new C2254308sP(enumC2196771AyJArr);
    }

    public static EnumC2196771AyJ[] values() {
        return (EnumC2196771AyJ[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC2196771AyJ valueOf(String str) {
        return (EnumC2196771AyJ) C08FF.LIZ(EnumC2196771AyJ.class, str);
    }

    public EnumC2196771AyJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
