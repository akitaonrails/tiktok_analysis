package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E98, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E98 {
    public static final C0E98 EDIT_PAGE;
    public static final C0E98 EP_TOOLBAR;
    public static final /* synthetic */ C0E98[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0E98> getEntries() {
        return LLILLL;
    }

    static {
        C0E98 c0e98 = new C0E98("EDIT_PAGE", 0, "edit_page");
        EDIT_PAGE = c0e98;
        C0E98 c0e982 = new C0E98("EP_TOOLBAR", 1, "ep_toolbar");
        EP_TOOLBAR = c0e982;
        C0E98[] c0e98Arr = {c0e98, c0e982};
        LLILLJJLI = c0e98Arr;
        LLILLL = new C2254308sP(c0e98Arr);
    }

    public static C0E98[] values() {
        return (C0E98[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0E98 valueOf(String str) {
        return (C0E98) C08FF.LIZ(C0E98.class, str);
    }

    public C0E98(String str, int i, String str2) {
        this.LL = str2;
    }
}
