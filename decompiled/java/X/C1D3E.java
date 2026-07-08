package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3E, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3E {
    public static final C1D3E CLIENT_SIGNAL_NAME_CLICK_COMMENT;
    public static final C1D3E CLIENT_SIGNAL_NAME_CLICK_FAVORITE;
    public static final C1D3E CLIENT_SIGNAL_NAME_CLICK_FOLLOW;
    public static final C1D3E CLIENT_SIGNAL_NAME_CLICK_LIKE;
    public static final C1D3E CLIENT_SIGNAL_NAME_CLICK_PROFILE;
    public static final C1D3E CLIENT_SIGNAL_NAME_CLICK_SHARE;
    public static final C1D3E CLIENT_SIGNAL_NAME_VIDEO_PLAY_FINISH;
    public static final C1D3E CLIENT_SIGNAL_NAME_VIDEO_PLAY_PROGRESS;
    public static final /* synthetic */ C1D3E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C1D3E> getEntries() {
        return LLILLL;
    }

    static {
        C1D3E c1d3e = new C1D3E("CLIENT_SIGNAL_NAME_CLICK_SHARE", 0, "click_share");
        CLIENT_SIGNAL_NAME_CLICK_SHARE = c1d3e;
        C1D3E c1d3e2 = new C1D3E("CLIENT_SIGNAL_NAME_CLICK_LIKE", 1, "like_click");
        CLIENT_SIGNAL_NAME_CLICK_LIKE = c1d3e2;
        C1D3E c1d3e3 = new C1D3E("CLIENT_SIGNAL_NAME_CLICK_FAVORITE", 2, "click_favorite");
        CLIENT_SIGNAL_NAME_CLICK_FAVORITE = c1d3e3;
        C1D3E c1d3e4 = new C1D3E("CLIENT_SIGNAL_NAME_CLICK_FOLLOW", 3, "click_follow");
        CLIENT_SIGNAL_NAME_CLICK_FOLLOW = c1d3e4;
        C1D3E c1d3e5 = new C1D3E("CLIENT_SIGNAL_NAME_CLICK_PROFILE", 4, "click_head_enter_profile");
        CLIENT_SIGNAL_NAME_CLICK_PROFILE = c1d3e5;
        C1D3E c1d3e6 = new C1D3E("CLIENT_SIGNAL_NAME_CLICK_COMMENT", 5, "click_comment");
        CLIENT_SIGNAL_NAME_CLICK_COMMENT = c1d3e6;
        C1D3E c1d3e7 = new C1D3E("CLIENT_SIGNAL_NAME_VIDEO_PLAY_FINISH", 6, "video_play_finish");
        CLIENT_SIGNAL_NAME_VIDEO_PLAY_FINISH = c1d3e7;
        C1D3E c1d3e8 = new C1D3E("CLIENT_SIGNAL_NAME_VIDEO_PLAY_PROGRESS", 7, "video_play_progress");
        CLIENT_SIGNAL_NAME_VIDEO_PLAY_PROGRESS = c1d3e8;
        C1D3E[] c1d3eArr = {c1d3e, c1d3e2, c1d3e3, c1d3e4, c1d3e5, c1d3e6, c1d3e7, c1d3e8};
        LLILLJJLI = c1d3eArr;
        LLILLL = new C2254308sP(c1d3eArr);
    }

    public static C1D3E[] values() {
        return (C1D3E[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C1D3E valueOf(String str) {
        return (C1D3E) C08FF.LIZ(C1D3E.class, str);
    }

    public C1D3E(String str, int i, String str2) {
        this.LL = str2;
    }
}
