package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CX {
    public static final C00CX IS_INTRO_SHOW;
    public static final /* synthetic */ C00CX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00CX VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<C00CX> getEntries() {
        return LLILLL;
    }

    static {
        C00CX c00cx = new C00CX("IS_INTRO_SHOW", 0, "is_intro_show");
        IS_INTRO_SHOW = c00cx;
        C00CX c00cx2 = new C00CX("VIDEO", 1, "video");
        VIDEO = c00cx2;
        C00CX[] c00cxArr = {c00cx, c00cx2};
        LLILLJJLI = c00cxArr;
        LLILLL = new C2254308sP(c00cxArr);
    }

    public static C00CX[] values() {
        return (C00CX[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C00CX valueOf(String str) {
        return (C00CX) C08FF.LIZ(C00CX.class, str);
    }

    public C00CX(String str, int i, String str2) {
        this.LL = str2;
    }
}
