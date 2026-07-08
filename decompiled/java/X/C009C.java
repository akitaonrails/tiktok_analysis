package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009C {
    public static final C009C DONE_BTN;
    public static final C009C LAYER_LIST_CONTAINER;
    public static final /* synthetic */ C009C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C009C ON_BOARDING_V2;
    public static final C009C PANEL_CONTAINER;
    public static final C009C TITLE_BAR;
    public static final C009C TOOL_BAR;
    public final int LL;

    public static InterfaceC2044707zh<C009C> getEntries() {
        return LLILLL;
    }

    static {
        C009C c009c = new C009C("TITLE_BAR", 0, 0);
        TITLE_BAR = c009c;
        C009C c009c2 = new C009C("LAYER_LIST_CONTAINER", 1, 1);
        LAYER_LIST_CONTAINER = c009c2;
        C009C c009c3 = new C009C("TOOL_BAR", 2, 2);
        TOOL_BAR = c009c3;
        C009C c009c4 = new C009C("PANEL_CONTAINER", 3, 3);
        PANEL_CONTAINER = c009c4;
        C009C c009c5 = new C009C("ON_BOARDING_V2", 4, 4);
        ON_BOARDING_V2 = c009c5;
        C009C c009c6 = new C009C("DONE_BTN", 5, 5);
        DONE_BTN = c009c6;
        C009C[] c009cArr = {c009c, c009c2, c009c3, c009c4, c009c5, c009c6};
        LLILLJJLI = c009cArr;
        LLILLL = new C2254308sP(c009cArr);
    }

    public static C009C[] values() {
        return (C009C[]) LLILLJJLI.clone();
    }

    public final int getWidgetType() {
        return this.LL;
    }

    public static C009C valueOf(String str) {
        return (C009C) C08FF.LIZ(C009C.class, str);
    }

    public C009C(String str, int i, int i2) {
        this.LL = i2;
    }
}
