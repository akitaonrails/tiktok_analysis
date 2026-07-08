package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03CX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CX {
    public static final C03CX DEFAULT_SELECTED;
    public static final C03CX INVERT_SELECTED;
    public static final /* synthetic */ C03CX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03CX UNSELECTED;
    public static final C03CX USER_SELECTED;
    public final int LL;

    public static InterfaceC2044707zh<C03CX> getEntries() {
        return LLILLL;
    }

    static {
        C03CX c03cx = new C03CX("UNSELECTED", 0, 1);
        UNSELECTED = c03cx;
        C03CX c03cx2 = new C03CX("DEFAULT_SELECTED", 1, 2);
        DEFAULT_SELECTED = c03cx2;
        C03CX c03cx3 = new C03CX("USER_SELECTED", 2, 3);
        USER_SELECTED = c03cx3;
        C03CX c03cx4 = new C03CX("INVERT_SELECTED", 3, 4);
        INVERT_SELECTED = c03cx4;
        C03CX[] c03cxArr = {c03cx, c03cx2, c03cx3, c03cx4};
        LLILLJJLI = c03cxArr;
        LLILLL = new C2254308sP(c03cxArr);
    }

    public static C03CX[] values() {
        return (C03CX[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03CX valueOf(String str) {
        return (C03CX) C08FF.LIZ(C03CX.class, str);
    }

    public C03CX(String str, int i, int i2) {
        this.LL = i2;
    }
}
