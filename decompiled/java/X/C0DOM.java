package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DOM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DOM {
    public static final C0DOM CLICK_CANCEL;
    public static final C0DOM CLICK_REMOVE;
    public static final /* synthetic */ C0DOM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0DOM SHOW;
    public final String LL;

    public static InterfaceC2044707zh<C0DOM> getEntries() {
        return LLILLL;
    }

    static {
        C0DOM c0dom = new C0DOM("SHOW", 0, "show");
        SHOW = c0dom;
        C0DOM c0dom2 = new C0DOM("CLICK_REMOVE", 1, "click_continue_remove");
        CLICK_REMOVE = c0dom2;
        C0DOM c0dom3 = new C0DOM("CLICK_CANCEL", 2, "click_cancel");
        CLICK_CANCEL = c0dom3;
        C0DOM[] c0domArr = {c0dom, c0dom2, c0dom3};
        LLILLJJLI = c0domArr;
        LLILLL = new C2254308sP(c0domArr);
    }

    public static C0DOM[] values() {
        return (C0DOM[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static C0DOM valueOf(String str) {
        return (C0DOM) C08FF.LIZ(C0DOM.class, str);
    }

    public C0DOM(String str, int i, String str2) {
        this.LL = str2;
    }
}
