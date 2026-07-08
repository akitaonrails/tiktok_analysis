package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3F, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3F {
    public static final /* synthetic */ C1D3F[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C1D3F SERVER_SIGNAL_NAME_CLICK_COMMENT;
    public static final C1D3F SERVER_SIGNAL_NAME_CLICK_FAVORITE;
    public static final C1D3F SERVER_SIGNAL_NAME_CLICK_FOLLOW;
    public static final C1D3F SERVER_SIGNAL_NAME_CLICK_LIKE;
    public static final C1D3F SERVER_SIGNAL_NAME_CLICK_PROFILE;
    public static final C1D3F SERVER_SIGNAL_NAME_CLICK_SHARE;
    public static final C1D3F SERVER_SIGNAL_NAME_VIDEO_PLAY_FINISH;
    public static final C1D3F SERVER_SIGNAL_NAME_VIDEO_PLAY_PROGRESS;
    public final String LL;

    public static InterfaceC2044707zh<C1D3F> getEntries() {
        return LLILLL;
    }

    static {
        C1D3F c1d3f = new C1D3F("SERVER_SIGNAL_NAME_CLICK_SHARE", 0, "click_share");
        SERVER_SIGNAL_NAME_CLICK_SHARE = c1d3f;
        C1D3F c1d3f2 = new C1D3F("SERVER_SIGNAL_NAME_CLICK_LIKE", 1, "click_like");
        SERVER_SIGNAL_NAME_CLICK_LIKE = c1d3f2;
        C1D3F c1d3f3 = new C1D3F("SERVER_SIGNAL_NAME_CLICK_FAVORITE", 2, "click_favorite");
        SERVER_SIGNAL_NAME_CLICK_FAVORITE = c1d3f3;
        C1D3F c1d3f4 = new C1D3F("SERVER_SIGNAL_NAME_CLICK_FOLLOW", 3, "click_follow");
        SERVER_SIGNAL_NAME_CLICK_FOLLOW = c1d3f4;
        C1D3F c1d3f5 = new C1D3F("SERVER_SIGNAL_NAME_CLICK_PROFILE", 4, "click_profile");
        SERVER_SIGNAL_NAME_CLICK_PROFILE = c1d3f5;
        C1D3F c1d3f6 = new C1D3F("SERVER_SIGNAL_NAME_CLICK_COMMENT", 5, "click_comment");
        SERVER_SIGNAL_NAME_CLICK_COMMENT = c1d3f6;
        C1D3F c1d3f7 = new C1D3F("SERVER_SIGNAL_NAME_VIDEO_PLAY_FINISH", 6, "video_play_finish");
        SERVER_SIGNAL_NAME_VIDEO_PLAY_FINISH = c1d3f7;
        C1D3F c1d3f8 = new C1D3F("SERVER_SIGNAL_NAME_VIDEO_PLAY_PROGRESS", 7, "video_play_progress");
        SERVER_SIGNAL_NAME_VIDEO_PLAY_PROGRESS = c1d3f8;
        C1D3F[] c1d3fArr = {c1d3f, c1d3f2, c1d3f3, c1d3f4, c1d3f5, c1d3f6, c1d3f7, c1d3f8};
        LLILLJJLI = c1d3fArr;
        LLILLL = new C2254308sP(c1d3fArr);
    }

    public static C1D3F[] values() {
        return (C1D3F[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C1D3F valueOf(String str) {
        return (C1D3F) C08FF.LIZ(C1D3F.class, str);
    }

    public C1D3F(String str, int i, String str2) {
        this.LL = str2;
    }
}
