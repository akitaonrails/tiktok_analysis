package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DV3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DV3 {
    public static final C0DV3 CLICK_BAR;
    public static final C0DV3 CLICK_EXPAND;
    public static final C0DV3 CLICK_HIDE;
    public static final C0DV3 CLICK_ITEM;
    public static final C0DV3 CLICK_TAB;
    public static final /* synthetic */ C0DV3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0DV3> getEntries() {
        return LLILLL;
    }

    static {
        C0DV3 c0dv3 = new C0DV3("CLICK_BAR", 0, "click_bar");
        CLICK_BAR = c0dv3;
        C0DV3 c0dv32 = new C0DV3("CLICK_TAB", 1, "click_tab");
        CLICK_TAB = c0dv32;
        C0DV3 c0dv33 = new C0DV3("CLICK_ITEM", 2, "click_item");
        CLICK_ITEM = c0dv33;
        C0DV3 c0dv34 = new C0DV3("CLICK_EXPAND", 3, "click_expand");
        CLICK_EXPAND = c0dv34;
        C0DV3 c0dv35 = new C0DV3("CLICK_HIDE", 4, "click_hide");
        CLICK_HIDE = c0dv35;
        C0DV3[] c0dv3Arr = {c0dv3, c0dv32, c0dv33, c0dv34, c0dv35};
        LLILLJJLI = c0dv3Arr;
        LLILLL = new C2254308sP(c0dv3Arr);
    }

    public static C0DV3[] values() {
        return (C0DV3[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static C0DV3 valueOf(String str) {
        return (C0DV3) C08FF.LIZ(C0DV3.class, str);
    }

    public C0DV3(String str, int i, String str2) {
        this.LL = str2;
    }
}
