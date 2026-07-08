package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2174521A8k implements InterfaceC19211810Ea {
    public static final EnumC2174521A8k CHECK_UPDATE;
    public static final EnumC2174521A8k CLEAR_CACHE;
    public static final EnumC2174521A8k DATA_SAVER;
    public static final EnumC2174521A8k LITE_MODE;
    public static final /* synthetic */ EnumC2174521A8k[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC2174521A8k LOCAL_LIVE_WALLPAPER;
    public static final EnumC2174521A8k OFFLINE_VIDEOS;
    public static final EnumC2174521A8k SECTION_HEADER;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;

    public static InterfaceC2044707zh<EnumC2174521A8k> getEntries() {
        return LLIZ;
    }

    static {
        EnumC2174521A8k enumC2174521A8k = new EnumC2174521A8k("SECTION_HEADER", "cache_section_group", "sectionCache", "sectionCache", null, 0, true, 16);
        SECTION_HEADER = enumC2174521A8k;
        EnumC2174521A8k enumC2174521A8k2 = new EnumC2174521A8k("OFFLINE_VIDEOS", "offline_mode", "offlineVideo", null, "offline_videos", 1, false, 12);
        OFFLINE_VIDEOS = enumC2174521A8k2;
        EnumC2174521A8k enumC2174521A8k3 = new EnumC2174521A8k("CLEAR_CACHE", "clear_cache", "clearCache", null, "free_up_space", 2, false, 12);
        CLEAR_CACHE = enumC2174521A8k3;
        EnumC2174521A8k enumC2174521A8k4 = new EnumC2174521A8k("DATA_SAVER", "data_saver", "dataSaver", null, "data_saver", 3, false, 12);
        DATA_SAVER = enumC2174521A8k4;
        EnumC2174521A8k enumC2174521A8k5 = new EnumC2174521A8k("LOCAL_LIVE_WALLPAPER", "live_wallpaper", "liveWallpaper", null, "wallpaper", 4, false, 12);
        LOCAL_LIVE_WALLPAPER = enumC2174521A8k5;
        EnumC2174521A8k enumC2174521A8k6 = new EnumC2174521A8k("CHECK_UPDATE", "check_update", "checkUpdate", null, "check_update", 5, false, 12);
        CHECK_UPDATE = enumC2174521A8k6;
        EnumC2174521A8k enumC2174521A8k7 = new EnumC2174521A8k("LITE_MODE", "lite_mode", "liteMode", null, "lite_mode", 6, false, 12);
        LITE_MODE = enumC2174521A8k7;
        EnumC2174521A8k[] enumC2174521A8kArr = {enumC2174521A8k, enumC2174521A8k2, enumC2174521A8k3, enumC2174521A8k4, enumC2174521A8k5, enumC2174521A8k6, enumC2174521A8k7};
        LLILZLL = enumC2174521A8kArr;
        LLIZ = new C2254308sP(enumC2174521A8kArr);
    }

    public static EnumC2174521A8k[] values() {
        return (EnumC2174521A8k[]) LLILZLL.clone();
    }

    @Override // X.InterfaceC19211810Ea
    public String getContentType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC19211810Ea
    public boolean getHeadingItem() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19211810Ea
    public String getIdentifier() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19211810Ea
    public String getKey() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19211910Eb
    public String getTag() {
        return this.LL;
    }

    public static EnumC2174521A8k valueOf(String str) {
        return (EnumC2174521A8k) C08FF.LIZ(EnumC2174521A8k.class, str);
    }

    public EnumC2174521A8k(String str, String str2, String str3, String str4, String str5, int i, boolean z, int i2) {
        str4 = (i2 & 4) != 0 ? "cellDisclosure" : str4;
        z = (i2 & 8) != 0 ? false : z;
        str5 = (i2 & 16) != 0 ? "" : str5;
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = str4;
        this.LLILZ = z;
        this.LLILZIL = str5;
    }
}
