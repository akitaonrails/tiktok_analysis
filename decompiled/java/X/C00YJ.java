package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YJ {
    public static final /* synthetic */ C00YJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00YJ WHEN_FETCH;
    public static final C00YJ WHEN_MATCH_VIEW;

    public static InterfaceC2044707zh<C00YJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00YJ c00yj = new C00YJ("WHEN_MATCH_VIEW", 0);
        WHEN_MATCH_VIEW = c00yj;
        C00YJ c00yj2 = new C00YJ("WHEN_FETCH", 1);
        WHEN_FETCH = c00yj2;
        C00YJ[] c00yjArr = {c00yj, c00yj2};
        LL = c00yjArr;
        LLILLJJLI = new C2254308sP(c00yjArr);
    }

    public static C00YJ[] values() {
        return (C00YJ[]) LL.clone();
    }

    public static C00YJ valueOf(String str) {
        return (C00YJ) C08FF.LIZ(C00YJ.class, str);
    }

    public C00YJ(String str, int i) {
    }
}
