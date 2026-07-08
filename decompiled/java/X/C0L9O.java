package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9O, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9O {
    public static final C0L9O CREATE_VIDEO;
    public static final /* synthetic */ C0L9O[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L9O PERSONAL_HOMEPAGE;
    public static final C0L9O VIDEO_EDIT_PAGE;
    public static final C0L9O VIDEO_POST_PAGE;
    public static final C0L9O VIDEO_SHOOT_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<C0L9O> getEntries() {
        return LLILLL;
    }

    static {
        C0L9O c0l9o = new C0L9O("VIDEO_SHOOT_PAGE", 0, "video_shoot_page");
        VIDEO_SHOOT_PAGE = c0l9o;
        C0L9O c0l9o2 = new C0L9O("VIDEO_EDIT_PAGE", 1, "video_edit_page");
        VIDEO_EDIT_PAGE = c0l9o2;
        C0L9O c0l9o3 = new C0L9O("VIDEO_POST_PAGE", 2, "video_post_page");
        VIDEO_POST_PAGE = c0l9o3;
        C0L9O c0l9o4 = new C0L9O("PERSONAL_HOMEPAGE", 3, "personal_homepage");
        PERSONAL_HOMEPAGE = c0l9o4;
        C0L9O c0l9o5 = new C0L9O("CREATE_VIDEO", 4, "create_video");
        CREATE_VIDEO = c0l9o5;
        C0L9O[] c0l9oArr = {c0l9o, c0l9o2, c0l9o3, c0l9o4, c0l9o5};
        LLILLJJLI = c0l9oArr;
        LLILLL = new C2254308sP(c0l9oArr);
    }

    public static C0L9O[] values() {
        return (C0L9O[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0L9O valueOf(String str) {
        return (C0L9O) C08FF.LIZ(C0L9O.class, str);
    }

    public C0L9O(String str, int i, String str2) {
        this.LL = str2;
    }
}
