package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QRW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QRW {
    public static final C0QRW CREATION_RECOMMEND_POI;
    public static final C0QRW CREATION_SEARCH_EFFECT;
    public static final C0QRW CREATION_SEARCH_MUSIC;
    public static final C0QRW CREATION_SEARCH_POI;
    public static final C0QRW FEED_EFFECT_PAGE;
    public static final C0QRW FEED_MUSIC_DETAIL;
    public static final C0QRW FEED_SINGLE_SONG;
    public static final C0QRW HOMEPAGE_HOT;
    public static final /* synthetic */ C0QRW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QRW MUSIC_PAGE_VIDEO_TWO_JUMPS;
    public static final C0QRW OTHERS_HOMEPAGE;
    public static final C0QRW SEARCH_MIX;
    public static final C0QRW SEARCH_USER;
    public static final C0QRW SEARCH_VIDEO;
    public static final C0QRW SHOOT_TWO_JUMPS;
    public static final C0QRW SMART_SEARCH;
    public static final C0QRW USER_PAGE_VIDEO_TWO_JUMPS;
    public static final C0QRW VISUAL_SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<C0QRW> getEntries() {
        return LLILLL;
    }

    static {
        C0QRW c0qrw = new C0QRW("HOMEPAGE_HOT", 0, "homepage_hot");
        HOMEPAGE_HOT = c0qrw;
        C0QRW c0qrw2 = new C0QRW("SEARCH_MIX", 1, "general_search");
        SEARCH_MIX = c0qrw2;
        C0QRW c0qrw3 = new C0QRW("SEARCH_USER", 2, "user_search");
        SEARCH_USER = c0qrw3;
        C0QRW c0qrw4 = new C0QRW("SEARCH_VIDEO", 3, "video_search");
        SEARCH_VIDEO = c0qrw4;
        C0QRW c0qrw5 = new C0QRW("SHOOT_TWO_JUMPS", 4, "shoot_two_jumps");
        SHOOT_TWO_JUMPS = c0qrw5;
        C0QRW c0qrw6 = new C0QRW("USER_PAGE_VIDEO_TWO_JUMPS", 5, "user_page_video_two_jumps");
        USER_PAGE_VIDEO_TWO_JUMPS = c0qrw6;
        C0QRW c0qrw7 = new C0QRW("MUSIC_PAGE_VIDEO_TWO_JUMPS", 6, "music_page_video_two_jumps");
        MUSIC_PAGE_VIDEO_TWO_JUMPS = c0qrw7;
        C0QRW c0qrw8 = new C0QRW("CREATION_SEARCH_MUSIC", 7, "creation_search_music");
        CREATION_SEARCH_MUSIC = c0qrw8;
        C0QRW c0qrw9 = new C0QRW("CREATION_SEARCH_EFFECT", 8, "creation_search_effect");
        CREATION_SEARCH_EFFECT = c0qrw9;
        C0QRW c0qrw10 = new C0QRW("FEED_SINGLE_SONG", 9, "single_song");
        FEED_SINGLE_SONG = c0qrw10;
        C0QRW c0qrw11 = new C0QRW("FEED_MUSIC_DETAIL", 10, "music_detail");
        FEED_MUSIC_DETAIL = c0qrw11;
        C0QRW c0qrw12 = new C0QRW("FEED_EFFECT_PAGE", 11, "prop_page");
        FEED_EFFECT_PAGE = c0qrw12;
        C0QRW c0qrw13 = new C0QRW("OTHERS_HOMEPAGE", 12, "others_homepage");
        OTHERS_HOMEPAGE = c0qrw13;
        C0QRW c0qrw14 = new C0QRW("CREATION_SEARCH_POI", 13, "creation_search_poi");
        CREATION_SEARCH_POI = c0qrw14;
        C0QRW c0qrw15 = new C0QRW("CREATION_RECOMMEND_POI", 14, "creation_recommend_poi");
        CREATION_RECOMMEND_POI = c0qrw15;
        C0QRW c0qrw16 = new C0QRW("VISUAL_SEARCH", 15, "visual_search");
        VISUAL_SEARCH = c0qrw16;
        C0QRW c0qrw17 = new C0QRW("SMART_SEARCH", 16, "smart_search");
        SMART_SEARCH = c0qrw17;
        C0QRW[] c0qrwArr = {c0qrw, c0qrw2, c0qrw3, c0qrw4, c0qrw5, c0qrw6, c0qrw7, c0qrw8, c0qrw9, c0qrw10, c0qrw11, c0qrw12, c0qrw13, c0qrw14, c0qrw15, c0qrw16, c0qrw17};
        LLILLJJLI = c0qrwArr;
        LLILLL = new C2254308sP(c0qrwArr);
    }

    public static C0QRW[] values() {
        return (C0QRW[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static C0QRW valueOf(String str) {
        return (C0QRW) C08FF.LIZ(C0QRW.class, str);
    }

    public C0QRW(String str, int i, String str2) {
        this.LL = str2;
    }
}
