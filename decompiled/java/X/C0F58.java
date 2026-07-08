package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0F58, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F58 {
    public static final C0F58 CAPTION_FORMAT_PANEL;
    public static final C0F58 CAPTION_TEMPLATE;
    public static final C0F58 CAPTION_WORD_FILTER;
    public static final /* synthetic */ C0F58[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0F58 MULTI_SELECT_PAGE;
    public static final C0F58 STICKER_EDIT_PANEL;
    public final String LL;

    public static InterfaceC2044707zh<C0F58> getEntries() {
        return LLILLL;
    }

    static {
        C0F58 c0f58 = new C0F58("CAPTION_TEMPLATE", 0, "caption_template");
        CAPTION_TEMPLATE = c0f58;
        C0F58 c0f582 = new C0F58("CAPTION_WORD_FILTER", 1, "caption_word_filter");
        CAPTION_WORD_FILTER = c0f582;
        C0F58 c0f583 = new C0F58("CAPTION_FORMAT_PANEL", 2, "caption_format_panel");
        CAPTION_FORMAT_PANEL = c0f583;
        C0F58 c0f584 = new C0F58("STICKER_EDIT_PANEL", 3, "sticker_edit_panel");
        STICKER_EDIT_PANEL = c0f584;
        C0F58 c0f585 = new C0F58("MULTI_SELECT_PAGE", 4, "multi_select");
        MULTI_SELECT_PAGE = c0f585;
        C0F58[] c0f58Arr = {c0f58, c0f582, c0f583, c0f584, c0f585};
        LLILLJJLI = c0f58Arr;
        LLILLL = new C2254308sP(c0f58Arr);
    }

    public static C0F58[] values() {
        return (C0F58[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0F58 valueOf(String str) {
        return (C0F58) C08FF.LIZ(C0F58.class, str);
    }

    public C0F58(String str, int i, String str2) {
        this.LL = str2;
    }
}
