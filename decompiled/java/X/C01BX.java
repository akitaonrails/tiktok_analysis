package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01BX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01BX {
    public static final /* synthetic */ C01BX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C01BX TYPE_1V1;
    public static final C01BX TYPE_1V1_QUICK_LIVE;
    public static final C01BX TYPE_9V16;
    public static final C01BX TYPE_9V16_NO_CORNER;

    public static InterfaceC2044707zh<C01BX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C01BX c01bx = new C01BX("TYPE_9V16", 0);
        TYPE_9V16 = c01bx;
        C01BX c01bx2 = new C01BX("TYPE_1V1", 1);
        TYPE_1V1 = c01bx2;
        C01BX c01bx3 = new C01BX("TYPE_1V1_QUICK_LIVE", 2);
        TYPE_1V1_QUICK_LIVE = c01bx3;
        C01BX c01bx4 = new C01BX("TYPE_9V16_NO_CORNER", 3);
        TYPE_9V16_NO_CORNER = c01bx4;
        C01BX[] c01bxArr = {c01bx, c01bx2, c01bx3, c01bx4};
        LL = c01bxArr;
        LLILLJJLI = new C2254308sP(c01bxArr);
    }

    public static C01BX[] values() {
        return (C01BX[]) LL.clone();
    }

    public static C01BX valueOf(String str) {
        return (C01BX) C08FF.LIZ(C01BX.class, str);
    }

    public C01BX(String str, int i) {
    }
}
