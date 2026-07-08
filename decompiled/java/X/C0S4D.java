package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S4D, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S4D {
    public static final C0S4D BOTTOM_TAB;
    public static final /* synthetic */ C0S4D[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0S4D TOP_ICON;
    public static final C0S4D TOP_TAB;
    public final String LL;

    public static InterfaceC2044707zh<C0S4D> getEntries() {
        return LLILLL;
    }

    static {
        C0S4D c0s4d = new C0S4D("TOP_TAB", 0, "top_tab_container");
        TOP_TAB = c0s4d;
        C0S4D c0s4d2 = new C0S4D("TOP_ICON", 1, "top_icon_container");
        TOP_ICON = c0s4d2;
        C0S4D c0s4d3 = new C0S4D("BOTTOM_TAB", 2, "bottom_tab_container");
        BOTTOM_TAB = c0s4d3;
        C0S4D[] c0s4dArr = {c0s4d, c0s4d2, c0s4d3};
        LLILLJJLI = c0s4dArr;
        LLILLL = new C2254308sP(c0s4dArr);
    }

    public static C0S4D[] values() {
        return (C0S4D[]) LLILLJJLI.clone();
    }

    public final String getViewKey() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static C0S4D valueOf(String str) {
        return (C0S4D) C08FF.LIZ(C0S4D.class, str);
    }

    public C0S4D(String str, int i, String str2) {
        this.LL = str2;
    }
}
