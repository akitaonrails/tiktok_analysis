package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00SX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00SX {
    public static final C00SX INCOMPETITION;
    public static final /* synthetic */ C00SX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00SX NONE;
    public static final C00SX RESULT;
    public static final C00SX START;

    public static InterfaceC2044707zh<C00SX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00SX c00sx = new C00SX("NONE", 0);
        NONE = c00sx;
        C00SX c00sx2 = new C00SX("START", 1);
        START = c00sx2;
        C00SX c00sx3 = new C00SX("INCOMPETITION", 2);
        INCOMPETITION = c00sx3;
        C00SX c00sx4 = new C00SX("RESULT", 3);
        RESULT = c00sx4;
        C00SX[] c00sxArr = {c00sx, c00sx2, c00sx3, c00sx4};
        LL = c00sxArr;
        LLILLJJLI = new C2254308sP(c00sxArr);
    }

    public static C00SX[] values() {
        return (C00SX[]) LL.clone();
    }

    public static C00SX valueOf(String str) {
        return (C00SX) C08FF.LIZ(C00SX.class, str);
    }

    public C00SX(String str, int i) {
    }
}
