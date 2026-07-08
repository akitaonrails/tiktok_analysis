package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K2L, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K2L {
    public static final C0K2L BLOCK_CONTENT_ITEM;
    public static final C0K2L COMMENT;
    public static final C0K2L CUSTOM;
    public static final C0K2L DETAIL_COMMENT_CATEGORY;
    public static final C0K2L DIVIDER;
    public static final C0K2L EMPTY;
    public static final C0K2L HEADER;
    public static final C0K2L LIVE;
    public static final /* synthetic */ C0K2L[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0K2L LOAD_MORE;
    public static final C0K2L MEMBER;
    public static final C0K2L MOCK_TIP_TEXT;
    public static final C0K2L POLL;
    public static final C0K2L POLL_ADD;
    public static final C0K2L POLL_ITEM;
    public static final C0K2L POST_BTM_ACTION;
    public static final C0K2L REPLY_SEE_MORE;
    public static final C0K2L SPACE_ACTIVITY_INDICATOR;
    public static final C0K2L SUB_COMMENT;
    public static final C0K2L SUB_ONLY_VIDEO;
    public static final C0K2L TEXT;
    public static final C0K2L TOPIC;
    public final int LL;

    public static InterfaceC2044707zh<C0K2L> getEntries() {
        return LLILLL;
    }

    static {
        C0K2L c0k2l = new C0K2L("HEADER", 0, 1);
        HEADER = c0k2l;
        C0K2L c0k2l2 = new C0K2L("POST_BTM_ACTION", 1, 2);
        POST_BTM_ACTION = c0k2l2;
        C0K2L c0k2l3 = new C0K2L("DIVIDER", 2, 3);
        DIVIDER = c0k2l3;
        C0K2L c0k2l4 = new C0K2L("LOAD_MORE", 3, 4);
        LOAD_MORE = c0k2l4;
        C0K2L c0k2l5 = new C0K2L("TOPIC", 4, 5);
        TOPIC = c0k2l5;
        C0K2L c0k2l6 = new C0K2L("COMMENT", 5, 6);
        COMMENT = c0k2l6;
        C0K2L c0k2l7 = new C0K2L("EMPTY", 6, 7);
        EMPTY = c0k2l7;
        C0K2L c0k2l8 = new C0K2L("TEXT", 7, 100);
        TEXT = c0k2l8;
        C0K2L c0k2l9 = new C0K2L("LIVE", 8, 101);
        LIVE = c0k2l9;
        C0K2L c0k2l10 = new C0K2L("SUB_ONLY_VIDEO", 9, 102);
        SUB_ONLY_VIDEO = c0k2l10;
        C0K2L c0k2l11 = new C0K2L("POLL", 10, 103);
        POLL = c0k2l11;
        C0K2L c0k2l12 = new C0K2L("POLL_ITEM", 11, 104);
        POLL_ITEM = c0k2l12;
        C0K2L c0k2l13 = new C0K2L("BLOCK_CONTENT_ITEM", 12, 105);
        BLOCK_CONTENT_ITEM = c0k2l13;
        C0K2L c0k2l14 = new C0K2L("SPACE_ACTIVITY_INDICATOR", 13, 106);
        SPACE_ACTIVITY_INDICATOR = c0k2l14;
        C0K2L c0k2l15 = new C0K2L("MOCK_TIP_TEXT", 14, 107);
        MOCK_TIP_TEXT = c0k2l15;
        C0K2L c0k2l16 = new C0K2L("DETAIL_COMMENT_CATEGORY", 15, 201);
        DETAIL_COMMENT_CATEGORY = c0k2l16;
        C0K2L c0k2l17 = new C0K2L("SUB_COMMENT", 16, 202);
        SUB_COMMENT = c0k2l17;
        C0K2L c0k2l18 = new C0K2L("REPLY_SEE_MORE", 17, 203);
        REPLY_SEE_MORE = c0k2l18;
        C0K2L c0k2l19 = new C0K2L("MEMBER", 18, 301);
        MEMBER = c0k2l19;
        C0K2L c0k2l20 = new C0K2L("CUSTOM", 19, 401);
        CUSTOM = c0k2l20;
        C0K2L c0k2l21 = new C0K2L("POLL_ADD", 20, 402);
        POLL_ADD = c0k2l21;
        C0K2L[] c0k2lArr = {c0k2l, c0k2l2, c0k2l3, c0k2l4, c0k2l5, c0k2l6, c0k2l7, c0k2l8, c0k2l9, c0k2l10, c0k2l11, c0k2l12, c0k2l13, c0k2l14, c0k2l15, c0k2l16, c0k2l17, c0k2l18, c0k2l19, c0k2l20, c0k2l21};
        LLILLJJLI = c0k2lArr;
        LLILLL = new C2254308sP(c0k2lArr);
    }

    public static C0K2L[] values() {
        return (C0K2L[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0K2L valueOf(String str) {
        return (C0K2L) C08FF.LIZ(C0K2L.class, str);
    }

    public C0K2L(String str, int i, int i2) {
        this.LL = i2;
    }
}
