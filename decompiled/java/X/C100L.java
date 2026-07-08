package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.100L, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C100L {
    public static final C100P Companion;
    public static final /* synthetic */ C100L[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C100L POPUP;
    public static final C100L TOAST;
    public final String LL;

    public static InterfaceC2044707zh<C100L> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.100P] */
    static {
        C100L c100l = new C100L("POPUP", 0, "popup");
        POPUP = c100l;
        C100L c100l2 = new C100L("TOAST", 1, "toast");
        TOAST = c100l2;
        C100L[] c100lArr = {c100l, c100l2};
        LLILLJJLI = c100lArr;
        LLILLL = new C2254308sP(c100lArr);
        Companion = new Object() { // from class: X.100P
        };
    }

    public static C100L[] values() {
        return (C100L[]) LLILLJJLI.clone();
    }

    public final String getRaw() {
        return this.LL;
    }

    public static C100L valueOf(String str) {
        return (C100L) C08FF.LIZ(C100L.class, str);
    }

    public C100L(String str, int i, String str2) {
        this.LL = str2;
    }
}
