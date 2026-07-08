package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EI5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EI5 {
    public static final C0EI5 AUTO_CUTOUT;
    public static final C0EI5 BRUSH;
    public static final C0EI5 ERASER;
    public static final /* synthetic */ C0EI5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0EI5 QUICK_BRUSH;
    public final String LL;

    public static InterfaceC2044707zh<C0EI5> getEntries() {
        return LLILLL;
    }

    static {
        C0EI5 c0ei5 = new C0EI5("AUTO_CUTOUT", 0, "auto_cutout");
        AUTO_CUTOUT = c0ei5;
        C0EI5 c0ei52 = new C0EI5("QUICK_BRUSH", 1, "quick_brush");
        QUICK_BRUSH = c0ei52;
        C0EI5 c0ei53 = new C0EI5("BRUSH", 2, "brush");
        BRUSH = c0ei53;
        C0EI5 c0ei54 = new C0EI5("ERASER", 3, "eraser");
        ERASER = c0ei54;
        C0EI5[] c0ei5Arr = {c0ei5, c0ei52, c0ei53, c0ei54};
        LLILLJJLI = c0ei5Arr;
        LLILLL = new C2254308sP(c0ei5Arr);
    }

    public static C0EI5[] values() {
        return (C0EI5[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0EI5 valueOf(String str) {
        return (C0EI5) C08FF.LIZ(C0EI5.class, str);
    }

    public C0EI5(String str, int i, String str2) {
        this.LL = str2;
    }
}
