package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06H2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06H2 {
    public static final C06H2 CHAT;
    public static final C06H3 Companion;
    public static final C06H2 FRIENDS;
    public static final C06H2 INBOX;
    public static final C06H2 INNER_PUSH;
    public static final /* synthetic */ C06H2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06H2 OUTER_PUSH;
    public static final C06H2 SHARE_PANEL;
    public static final C06H2 STORY;
    public static final C06H2 STREAK_PANEL;
    public static final C06H2 UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C06H2> getEntries() {
        return LLILLL;
    }

    static {
        C06H2 c06h2 = new C06H2("UNKNOWN", 0, "unknown");
        UNKNOWN = c06h2;
        C06H2 c06h22 = new C06H2("CHAT", 1, "chat");
        CHAT = c06h22;
        C06H2 c06h23 = new C06H2("INBOX", 2, "notification_page");
        INBOX = c06h23;
        C06H2 c06h24 = new C06H2("SHARE_PANEL", 3, "share_panel");
        SHARE_PANEL = c06h24;
        C06H2 c06h25 = new C06H2("INNER_PUSH", 4, "inner_push");
        INNER_PUSH = c06h25;
        C06H2 c06h26 = new C06H2("STREAK_PANEL", 5, "streak_panel");
        STREAK_PANEL = c06h26;
        C06H2 c06h27 = new C06H2("OUTER_PUSH", 6, "outer_push");
        OUTER_PUSH = c06h27;
        C06H2 c06h28 = new C06H2("FRIENDS", 7, "friend_page");
        FRIENDS = c06h28;
        C06H2 c06h29 = new C06H2("STORY", 8, "story");
        STORY = c06h29;
        C06H2[] c06h2Arr = {c06h2, c06h22, c06h23, c06h24, c06h25, c06h26, c06h27, c06h28, c06h29};
        LLILLJJLI = c06h2Arr;
        LLILLL = new C2254308sP(c06h2Arr);
        Companion = new C06H3();
    }

    public static C06H2[] values() {
        return (C06H2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C06H2 valueOf(String str) {
        return (C06H2) C08FF.LIZ(C06H2.class, str);
    }

    public C06H2(String str, int i, String str2) {
        this.LL = str2;
    }
}
