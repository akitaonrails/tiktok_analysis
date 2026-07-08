package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00YS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YS {
    public static final C00YS ALL_GRANTED;
    public static final /* synthetic */ C00YS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00YS NOT_GRANTED;
    public static final C00YS PARTIAL_GRANTED;

    public static InterfaceC2044707zh<C00YS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00YS c00ys = new C00YS("ALL_GRANTED", 0);
        ALL_GRANTED = c00ys;
        C00YS c00ys2 = new C00YS("PARTIAL_GRANTED", 1);
        PARTIAL_GRANTED = c00ys2;
        C00YS c00ys3 = new C00YS("NOT_GRANTED", 2);
        NOT_GRANTED = c00ys3;
        C00YS[] c00ysArr = {c00ys, c00ys2, c00ys3};
        LL = c00ysArr;
        LLILLJJLI = new C2254308sP(c00ysArr);
    }

    public static C00YS[] values() {
        return (C00YS[]) LL.clone();
    }

    public static C00YS valueOf(String str) {
        return (C00YS) C08FF.LIZ(C00YS.class, str);
    }

    public C00YS(String str, int i) {
    }
}
