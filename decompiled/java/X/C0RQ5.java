package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQ5 {
    public static final C0RQ5 C_ANCHOR;
    public static final C0RQ5 C_BANNER;
    public static final C0RQ5 C_BOTTOM_BUTTON;
    public static final C0RQ5 C_CELL;
    public static final C0RQ5 C_DEFAULT;
    public static final C0RQ5 C_INTERACT_AREA;
    public static final C0RQ5 C_INTERACT_BIZ_BOTTOM;
    public static final C0RQ5 C_INTERACT_BIZ_TOP;
    public static final C0RQ5 C_INTERACT_BOTTOM;
    public static final C0RQ5 C_INTERACT_INFO;
    public static final C0RQ5 C_INTERACT_RIGHT;
    public static final C0RQ5 C_VIDEO_TAG;
    public static final /* synthetic */ C0RQ5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0RQ5> getEntries() {
        return LLILLL;
    }

    static {
        C0RQ5 c0rq5 = new C0RQ5("C_DEFAULT", 0, "N");
        C_DEFAULT = c0rq5;
        C0RQ5 c0rq52 = new C0RQ5("C_CELL", 1, "VideoViewCell");
        C_CELL = c0rq52;
        C0RQ5 c0rq53 = new C0RQ5("C_INTERACT_AREA", 2, "InteractAreaComponent");
        C_INTERACT_AREA = c0rq53;
        C0RQ5 c0rq54 = new C0RQ5("C_INTERACT_INFO", 3, "InteractInfoAreaComponent");
        C_INTERACT_INFO = c0rq54;
        C0RQ5 c0rq55 = new C0RQ5("C_INTERACT_RIGHT", 4, "InteractRightAreaComponent");
        C_INTERACT_RIGHT = c0rq55;
        C0RQ5 c0rq56 = new C0RQ5("C_INTERACT_BOTTOM", 5, "InteractBottomAreaComponent");
        C_INTERACT_BOTTOM = c0rq56;
        C0RQ5 c0rq57 = new C0RQ5("C_INTERACT_BIZ_TOP", 6, "BizTopAreaComponent");
        C_INTERACT_BIZ_TOP = c0rq57;
        C0RQ5 c0rq58 = new C0RQ5("C_INTERACT_BIZ_BOTTOM", 7, "BizBottomAreaComponent");
        C_INTERACT_BIZ_BOTTOM = c0rq58;
        C0RQ5 c0rq59 = new C0RQ5("C_VIDEO_TAG", 8, "VideoTagContainer");
        C_VIDEO_TAG = c0rq59;
        C0RQ5 c0rq510 = new C0RQ5("C_BOTTOM_BUTTON", 9, "FeedBottomButtonContainer");
        C_BOTTOM_BUTTON = c0rq510;
        C0RQ5 c0rq511 = new C0RQ5("C_ANCHOR", 10, "VideoFeedMultiTag");
        C_ANCHOR = c0rq511;
        C0RQ5 c0rq512 = new C0RQ5("C_BANNER", 11, "InteractBottomBannerComponent");
        C_BANNER = c0rq512;
        C0RQ5[] c0rq5Arr = {c0rq5, c0rq52, c0rq53, c0rq54, c0rq55, c0rq56, c0rq57, c0rq58, c0rq59, c0rq510, c0rq511, c0rq512};
        LLILLJJLI = c0rq5Arr;
        LLILLL = new C2254308sP(c0rq5Arr);
    }

    public static C0RQ5[] values() {
        return (C0RQ5[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0RQ5 valueOf(String str) {
        return (C0RQ5) C08FF.LIZ(C0RQ5.class, str);
    }

    public C0RQ5(String str, int i, String str2) {
        this.LL = str2;
    }
}
