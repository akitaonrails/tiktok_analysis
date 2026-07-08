package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S2U, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S2U {
    public static final C0S2T Companion;
    public static final C0S2U FIXED_ENTRANCE;
    public static final /* synthetic */ C0S2U[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0S2U MUF_POST;
    public static final C0S2U MUF_SHARE_VIDEO;
    public static final C0S2U REPOST_MULTIPLE;
    public static final C0S2U REPOST_SINGLE;
    public static final C0S2U SHARE_LINK;
    public static final C0S2U UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C0S2U> getEntries() {
        return LLILLL;
    }

    static {
        C0S2U c0s2u = new C0S2U("MUF_POST", 0, "muf_post");
        MUF_POST = c0s2u;
        C0S2U c0s2u2 = new C0S2U("REPOST_SINGLE", 1, "repost_single");
        REPOST_SINGLE = c0s2u2;
        C0S2U c0s2u3 = new C0S2U("REPOST_MULTIPLE", 2, "repost_multiple");
        REPOST_MULTIPLE = c0s2u3;
        C0S2U c0s2u4 = new C0S2U("SHARE_LINK", 3, "share_link");
        SHARE_LINK = c0s2u4;
        C0S2U c0s2u5 = new C0S2U("MUF_SHARE_VIDEO", 4, "muf_share_video");
        MUF_SHARE_VIDEO = c0s2u5;
        C0S2U c0s2u6 = new C0S2U("FIXED_ENTRANCE", 5, "fixed_entrance");
        FIXED_ENTRANCE = c0s2u6;
        C0S2U c0s2u7 = new C0S2U("UNKNOWN", 6, "unknown");
        UNKNOWN = c0s2u7;
        C0S2U[] c0s2uArr = {c0s2u, c0s2u2, c0s2u3, c0s2u4, c0s2u5, c0s2u6, c0s2u7};
        LLILLJJLI = c0s2uArr;
        LLILLL = new C2254308sP(c0s2uArr);
        Companion = new C0S2T();
    }

    public static C0S2U[] values() {
        return (C0S2U[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static C0S2U valueOf(String str) {
        return (C0S2U) C08FF.LIZ(C0S2U.class, str);
    }

    public C0S2U(String str, int i, String str2) {
        this.LL = str2;
    }
}
