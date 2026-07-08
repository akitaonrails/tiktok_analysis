package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L95, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L95 {
    public static final C0L95 ANCHOR;
    public static final C0L95 AUTOCUT_LIST;
    public static final /* synthetic */ C0L95[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L95 TEMPLATE_TAB;
    public static final C0L95 UNKOWN;
    public final String LL;

    public static InterfaceC2044707zh<C0L95> getEntries() {
        return LLILLL;
    }

    static {
        C0L95 c0l95 = new C0L95("UNKOWN", 0, "unkown");
        UNKOWN = c0l95;
        C0L95 c0l952 = new C0L95("TEMPLATE_TAB", 1, "template_tab");
        TEMPLATE_TAB = c0l952;
        C0L95 c0l953 = new C0L95("AUTOCUT_LIST", 2, "autocut_list");
        AUTOCUT_LIST = c0l953;
        C0L95 c0l954 = new C0L95("ANCHOR", 3, "anchor");
        ANCHOR = c0l954;
        C0L95[] c0l95Arr = {c0l95, c0l952, c0l953, c0l954};
        LLILLJJLI = c0l95Arr;
        LLILLL = new C2254308sP(c0l95Arr);
    }

    public static C0L95[] values() {
        return (C0L95[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0L95 valueOf(String str) {
        return (C0L95) C08FF.LIZ(C0L95.class, str);
    }

    public C0L95(String str, int i, String str2) {
        this.LL = str2;
    }
}
