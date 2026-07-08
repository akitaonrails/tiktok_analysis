package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CI4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CI4 {
    public static final C0CI4 AUTOCUT_LIST;
    public static final /* synthetic */ C0CI4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CI4 TEMPLATE_ANCHOR;
    public static final C0CI4 TEMPLATE_TAB;
    public final String LL;

    public static InterfaceC2044707zh<C0CI4> getEntries() {
        return LLILLL;
    }

    static {
        C0CI4 c0ci4 = new C0CI4("TEMPLATE_TAB", 0, "template_tab");
        TEMPLATE_TAB = c0ci4;
        C0CI4 c0ci42 = new C0CI4("AUTOCUT_LIST", 1, "autocut_list");
        AUTOCUT_LIST = c0ci42;
        C0CI4 c0ci43 = new C0CI4("TEMPLATE_ANCHOR", 2, "template_anchor");
        TEMPLATE_ANCHOR = c0ci43;
        C0CI4[] c0ci4Arr = {c0ci4, c0ci42, c0ci43};
        LLILLJJLI = c0ci4Arr;
        LLILLL = new C2254308sP(c0ci4Arr);
    }

    public static C0CI4[] values() {
        return (C0CI4[]) LLILLJJLI.clone();
    }

    public final String getSceneName() {
        return this.LL;
    }

    public static C0CI4 valueOf(String str) {
        return (C0CI4) C08FF.LIZ(C0CI4.class, str);
    }

    public C0CI4(String str, int i, String str2) {
        this.LL = str2;
    }
}
