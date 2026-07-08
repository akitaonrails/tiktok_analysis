package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00FG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FG {
    public static final /* synthetic */ C00FG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00FG NONE;
    public static final C00FG PORTRAIT;
    public final long LL;

    public static InterfaceC2044707zh<C00FG> getEntries() {
        return LLILLL;
    }

    static {
        C00FG c00fg = new C00FG("NONE", 0, 0L);
        NONE = c00fg;
        C00FG c00fg2 = new C00FG("PORTRAIT", 1, 2L);
        PORTRAIT = c00fg2;
        C00FG[] c00fgArr = {c00fg, c00fg2};
        LLILLJJLI = c00fgArr;
        LLILLL = new C2254308sP(c00fgArr);
    }

    public static C00FG[] values() {
        return (C00FG[]) LLILLJJLI.clone();
    }

    public final long getTypeVal() {
        return this.LL;
    }

    public static C00FG valueOf(String str) {
        return (C00FG) C08FF.LIZ(C00FG.class, str);
    }

    public C00FG(String str, int i, long j) {
        this.LL = j;
    }
}
