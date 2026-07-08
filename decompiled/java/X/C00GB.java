package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GB {
    public static final /* synthetic */ C00GB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00GB POPUP_WINDOW;
    public static final C00GB TUX_TOOLTIP;
    public final String LL;

    public static InterfaceC2044707zh<C00GB> getEntries() {
        return LLILLL;
    }

    static {
        C00GB c00gb = new C00GB("POPUP_WINDOW", 0, "popup_window");
        POPUP_WINDOW = c00gb;
        C00GB c00gb2 = new C00GB("TUX_TOOLTIP", 1, "tux_tooltip");
        TUX_TOOLTIP = c00gb2;
        C00GB[] c00gbArr = {c00gb, c00gb2};
        LLILLJJLI = c00gbArr;
        LLILLL = new C2254308sP(c00gbArr);
    }

    public static C00GB[] values() {
        return (C00GB[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C00GB valueOf(String str) {
        return (C00GB) C08FF.LIZ(C00GB.class, str);
    }

    public C00GB(String str, int i, String str2) {
        this.LL = str2;
    }
}
