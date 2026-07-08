package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06H4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06H4 {
    public static final C06H4 ACTION_BAR;
    public static final C06H4 FLOW;
    public static final C06H4 INLINE_MESSAGE;
    public static final /* synthetic */ C06H4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06H4 SHARE_PANEL;
    public static final C06H4 WIDGET;
    public final String LL;

    public static InterfaceC2044707zh<C06H4> getEntries() {
        return LLILLL;
    }

    static {
        C06H4 c06h4 = new C06H4("ACTION_BAR", 0, "action_bar");
        ACTION_BAR = c06h4;
        C06H4 c06h42 = new C06H4("WIDGET", 1, "widget");
        WIDGET = c06h42;
        C06H4 c06h43 = new C06H4("SHARE_PANEL", 2, "share_panel");
        SHARE_PANEL = c06h43;
        C06H4 c06h44 = new C06H4("FLOW", 3, "flow");
        FLOW = c06h44;
        C06H4 c06h45 = new C06H4("INLINE_MESSAGE", 4, "inline_message");
        INLINE_MESSAGE = c06h45;
        C06H4[] c06h4Arr = {c06h4, c06h42, c06h43, c06h44, c06h45};
        LLILLJJLI = c06h4Arr;
        LLILLL = new C2254308sP(c06h4Arr);
    }

    public static C06H4[] values() {
        return (C06H4[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C06H4 valueOf(String str) {
        return (C06H4) C08FF.LIZ(C06H4.class, str);
    }

    public C06H4(String str, int i, String str2) {
        this.LL = str2;
    }
}
