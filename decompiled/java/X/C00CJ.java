package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CJ {
    public static final /* synthetic */ C00CJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00CJ NEW_VIDEOS;
    public static final C00CJ TOP;
    public static final C00CJ TRENDING;
    public final int LL;

    public static InterfaceC2044707zh<C00CJ> getEntries() {
        return LLILLL;
    }

    static {
        C00CJ c00cj = new C00CJ("TOP", 0, 1);
        TOP = c00cj;
        C00CJ c00cj2 = new C00CJ("TRENDING", 1, 2);
        TRENDING = c00cj2;
        C00CJ c00cj3 = new C00CJ("NEW_VIDEOS", 2, 3);
        NEW_VIDEOS = c00cj3;
        C00CJ[] c00cjArr = {c00cj, c00cj2, c00cj3};
        LLILLJJLI = c00cjArr;
        LLILLL = new C2254308sP(c00cjArr);
    }

    public static C00CJ[] values() {
        return (C00CJ[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static C00CJ valueOf(String str) {
        return (C00CJ) C08FF.LIZ(C00CJ.class, str);
    }

    public C00CJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
