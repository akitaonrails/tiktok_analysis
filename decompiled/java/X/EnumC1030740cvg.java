package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1030740cvg implements InterfaceC593520NPq<String> {
    public static final EnumC1030740cvg COLD_START_WITH_FOLLOW_TAB;
    public static final EnumC1030740cvg DISABLE_HOT_START;
    public static final EnumC1030740cvg EXPIRED;
    public static final EnumC1030740cvg FILTER_WITH_OVER_DELIVERY;
    public static final EnumC1030740cvg FILTER_WITH_SAME_AWEME;
    public static final EnumC1030740cvg FILTER_WITH_SAME_AWEME_24_HOURS;
    public static final EnumC1030740cvg FORCE_PRELOGIN;
    public static final EnumC1030740cvg INVALID_AWEME;
    public static final EnumC1030740cvg LIVE_SPLASH_SHOW;
    public static final /* synthetic */ EnumC1030740cvg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1030740cvg LOAD_FAIL;
    public static final EnumC1030740cvg NOT_ALLOW_TOPVIEW;
    public static final EnumC1030740cvg NOT_RIGHT_SCENE;
    public static final EnumC1030740cvg SUPER_ENTRANCE_SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1030740cvg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1030740cvg enumC1030740cvg = new EnumC1030740cvg("LOAD_FAIL", 0, "1");
        LOAD_FAIL = enumC1030740cvg;
        EnumC1030740cvg enumC1030740cvg2 = new EnumC1030740cvg("NOT_RIGHT_SCENE", 1, "2");
        NOT_RIGHT_SCENE = enumC1030740cvg2;
        EnumC1030740cvg enumC1030740cvg3 = new EnumC1030740cvg("FORCE_PRELOGIN", 2, "3");
        FORCE_PRELOGIN = enumC1030740cvg3;
        EnumC1030740cvg enumC1030740cvg4 = new EnumC1030740cvg("INVALID_AWEME", 3, "4");
        INVALID_AWEME = enumC1030740cvg4;
        EnumC1030740cvg enumC1030740cvg5 = new EnumC1030740cvg("EXPIRED", 4, "5");
        EXPIRED = enumC1030740cvg5;
        EnumC1030740cvg enumC1030740cvg6 = new EnumC1030740cvg("NOT_ALLOW_TOPVIEW", 5, "6");
        NOT_ALLOW_TOPVIEW = enumC1030740cvg6;
        EnumC1030740cvg enumC1030740cvg7 = new EnumC1030740cvg("DISABLE_HOT_START", 6, "7");
        DISABLE_HOT_START = enumC1030740cvg7;
        EnumC1030740cvg enumC1030740cvg8 = new EnumC1030740cvg("FILTER_WITH_SAME_AWEME", 7, "8");
        FILTER_WITH_SAME_AWEME = enumC1030740cvg8;
        EnumC1030740cvg enumC1030740cvg9 = new EnumC1030740cvg("COLD_START_WITH_FOLLOW_TAB", 8, "9");
        COLD_START_WITH_FOLLOW_TAB = enumC1030740cvg9;
        EnumC1030740cvg enumC1030740cvg10 = new EnumC1030740cvg("SUPER_ENTRANCE_SHOW", 9, "10");
        SUPER_ENTRANCE_SHOW = enumC1030740cvg10;
        EnumC1030740cvg enumC1030740cvg11 = new EnumC1030740cvg("LIVE_SPLASH_SHOW", 10, "11");
        LIVE_SPLASH_SHOW = enumC1030740cvg11;
        EnumC1030740cvg enumC1030740cvg12 = new EnumC1030740cvg("FILTER_WITH_SAME_AWEME_24_HOURS", 11, "12");
        FILTER_WITH_SAME_AWEME_24_HOURS = enumC1030740cvg12;
        EnumC1030740cvg enumC1030740cvg13 = new EnumC1030740cvg("FILTER_WITH_OVER_DELIVERY", 12, "13");
        FILTER_WITH_OVER_DELIVERY = enumC1030740cvg13;
        EnumC1030740cvg[] enumC1030740cvgArr = {enumC1030740cvg, enumC1030740cvg2, enumC1030740cvg3, enumC1030740cvg4, enumC1030740cvg5, enumC1030740cvg6, enumC1030740cvg7, enumC1030740cvg8, enumC1030740cvg9, enumC1030740cvg10, enumC1030740cvg11, enumC1030740cvg12, enumC1030740cvg13};
        LLILLJJLI = enumC1030740cvgArr;
        LLILLL = new C2254308sP(enumC1030740cvgArr);
    }

    public static EnumC1030740cvg[] values() {
        return (EnumC1030740cvg[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC1030740cvg valueOf(String str) {
        return (EnumC1030740cvg) C08FF.LIZ(EnumC1030740cvg.class, str);
    }

    public EnumC1030740cvg(String str, int i, String str2) {
        this.LL = str2;
    }
}
