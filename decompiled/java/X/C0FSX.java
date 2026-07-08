package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FSX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FSX {
    public static final C0FSX BOTTOM;
    public static final /* synthetic */ C0FSX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FSX TOP;

    public static InterfaceC2044707zh<C0FSX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FSX c0fsx = new C0FSX("TOP", 0);
        TOP = c0fsx;
        C0FSX c0fsx2 = new C0FSX("BOTTOM", 1);
        BOTTOM = c0fsx2;
        C0FSX[] c0fsxArr = {c0fsx, c0fsx2};
        LL = c0fsxArr;
        LLILLJJLI = new C2254308sP(c0fsxArr);
    }

    public static C0FSX[] values() {
        return (C0FSX[]) LL.clone();
    }

    public static C0FSX valueOf(String str) {
        return (C0FSX) C08FF.LIZ(C0FSX.class, str);
    }

    public C0FSX(String str, int i) {
    }
}
