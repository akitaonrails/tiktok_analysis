package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0326009k {
    public static final EnumC0326009k DSP_REPORT_SCENE_NONE_TTM_MUSIC_JOURNEY_PAGE;
    public static final EnumC0326009k DSP_REPORT_SCENE_NONE_TTM_MY_MUISC_PAGE;
    public static final EnumC0326009k DSP_REPORT_SCENE_TTM_FEED_IMPRESSION;
    public static final EnumC0326009k DSP_REPORT_SCENE_TTM_JOURNEY_PAGE;
    public static final EnumC0326009k DSP_REPORT_SCENE_TTM_MY_MUSIC_PAGE;
    public static final /* synthetic */ EnumC0326009k[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0326009k MUSIC_DETAIL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0326009k> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0326009k enumC0326009k = new EnumC0326009k("MUSIC_DETAIL", 0, 8);
        MUSIC_DETAIL = enumC0326009k;
        EnumC0326009k enumC0326009k2 = new EnumC0326009k("DSP_REPORT_SCENE_TTM_FEED_IMPRESSION", 1, 14);
        DSP_REPORT_SCENE_TTM_FEED_IMPRESSION = enumC0326009k2;
        EnumC0326009k enumC0326009k3 = new EnumC0326009k("DSP_REPORT_SCENE_TTM_MY_MUSIC_PAGE", 2, 15);
        DSP_REPORT_SCENE_TTM_MY_MUSIC_PAGE = enumC0326009k3;
        EnumC0326009k enumC0326009k4 = new EnumC0326009k("DSP_REPORT_SCENE_NONE_TTM_MY_MUISC_PAGE", 3, 16);
        DSP_REPORT_SCENE_NONE_TTM_MY_MUISC_PAGE = enumC0326009k4;
        EnumC0326009k enumC0326009k5 = new EnumC0326009k("DSP_REPORT_SCENE_TTM_JOURNEY_PAGE", 4, 17);
        DSP_REPORT_SCENE_TTM_JOURNEY_PAGE = enumC0326009k5;
        EnumC0326009k enumC0326009k6 = new EnumC0326009k("DSP_REPORT_SCENE_NONE_TTM_MUSIC_JOURNEY_PAGE", 5, 18);
        DSP_REPORT_SCENE_NONE_TTM_MUSIC_JOURNEY_PAGE = enumC0326009k6;
        EnumC0326009k[] enumC0326009kArr = {enumC0326009k, enumC0326009k2, enumC0326009k3, enumC0326009k4, enumC0326009k5, enumC0326009k6};
        LLILLJJLI = enumC0326009kArr;
        LLILLL = new C2254308sP(enumC0326009kArr);
    }

    public static EnumC0326009k[] values() {
        return (EnumC0326009k[]) LLILLJJLI.clone();
    }

    public final int getNumber() {
        return this.LL;
    }

    public static EnumC0326009k valueOf(String str) {
        return (EnumC0326009k) C08FF.LIZ(EnumC0326009k.class, str);
    }

    public EnumC0326009k(String str, int i, int i2) {
        this.LL = i2;
    }
}
