package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N1W, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1W {
    public static final /* synthetic */ C0N1W[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N1W NONE;
    public static final C0N1W TYPE_FRIEND_TAB_DISMISS_PUBLISH_WINDOW_ARROW;
    public static final C0N1W TYPE_FRIEND_TAB_DISMISS_PUBLISH_WINDOW_QSB;
    public static final C0N1W TYPE_FRIEND_TAB_DISMISS_PUBLISH_WINDOW_SHARE_ICON;
    public static final C0N1W TYPE_SELF_AWEME_GUIDE_ARROW;
    public static final C0N1W TYPE_SELF_AWEME_GUIDE_QSB;
    public static final C0N1W TYPE_SELF_AWEME_GUIDE_SHARE_ICON;
    public final int LL;

    public static InterfaceC2044707zh<C0N1W> getEntries() {
        return LLILLL;
    }

    static {
        C0N1W c0n1w = new C0N1W("NONE", 0, 0);
        NONE = c0n1w;
        C0N1W c0n1w2 = new C0N1W("TYPE_FRIEND_TAB_DISMISS_PUBLISH_WINDOW_ARROW", 1, 1);
        TYPE_FRIEND_TAB_DISMISS_PUBLISH_WINDOW_ARROW = c0n1w2;
        C0N1W c0n1w3 = new C0N1W("TYPE_FRIEND_TAB_DISMISS_PUBLISH_WINDOW_SHARE_ICON", 2, 2);
        TYPE_FRIEND_TAB_DISMISS_PUBLISH_WINDOW_SHARE_ICON = c0n1w3;
        C0N1W c0n1w4 = new C0N1W("TYPE_FRIEND_TAB_DISMISS_PUBLISH_WINDOW_QSB", 3, 3);
        TYPE_FRIEND_TAB_DISMISS_PUBLISH_WINDOW_QSB = c0n1w4;
        C0N1W c0n1w5 = new C0N1W("TYPE_SELF_AWEME_GUIDE_ARROW", 4, 4);
        TYPE_SELF_AWEME_GUIDE_ARROW = c0n1w5;
        C0N1W c0n1w6 = new C0N1W("TYPE_SELF_AWEME_GUIDE_SHARE_ICON", 5, 5);
        TYPE_SELF_AWEME_GUIDE_SHARE_ICON = c0n1w6;
        C0N1W c0n1w7 = new C0N1W("TYPE_SELF_AWEME_GUIDE_QSB", 6, 6);
        TYPE_SELF_AWEME_GUIDE_QSB = c0n1w7;
        C0N1W[] c0n1wArr = {c0n1w, c0n1w2, c0n1w3, c0n1w4, c0n1w5, c0n1w6, c0n1w7};
        LLILLJJLI = c0n1wArr;
        LLILLL = new C2254308sP(c0n1wArr);
    }

    public static C0N1W[] values() {
        return (C0N1W[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0N1W valueOf(String str) {
        return (C0N1W) C08FF.LIZ(C0N1W.class, str);
    }

    public C0N1W(String str, int i, int i2) {
        this.LL = i2;
    }
}
