package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.100M, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C100M {
    public static final C100Q Companion;
    public static final C100M INLINE_POPUP;
    public static final /* synthetic */ C100M[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C100M TEMPLATE_ID;
    public final String LL;

    public static InterfaceC2044707zh<C100M> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.100Q] */
    static {
        C100M c100m = new C100M("INLINE_POPUP", 0, "inline_popup");
        INLINE_POPUP = c100m;
        C100M c100m2 = new C100M("TEMPLATE_ID", 1, "template_id");
        TEMPLATE_ID = c100m2;
        C100M[] c100mArr = {c100m, c100m2};
        LLILLJJLI = c100mArr;
        LLILLL = new C2254308sP(c100mArr);
        Companion = new Object() { // from class: X.100Q
        };
    }

    public static C100M[] values() {
        return (C100M[]) LLILLJJLI.clone();
    }

    public final String getRaw() {
        return this.LL;
    }

    public static C100M valueOf(String str) {
        return (C100M) C08FF.LIZ(C100M.class, str);
    }

    public C100M(String str, int i, String str2) {
        this.LL = str2;
    }
}
