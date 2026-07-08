package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.16AX, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16AX {
    public static final C16AX CLICKED;
    public static final C16AX DISMISSED;
    public static final C16AX DRAGGING;
    public static final /* synthetic */ C16AX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C16AX NO_ACTION;
    public static final C16AX RELEASED;

    public static InterfaceC2044707zh<C16AX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C16AX c16ax = new C16AX("NO_ACTION", 0);
        NO_ACTION = c16ax;
        C16AX c16ax2 = new C16AX("DRAGGING", 1);
        DRAGGING = c16ax2;
        C16AX c16ax3 = new C16AX("RELEASED", 2);
        RELEASED = c16ax3;
        C16AX c16ax4 = new C16AX("CLICKED", 3);
        CLICKED = c16ax4;
        C16AX c16ax5 = new C16AX("DISMISSED", 4);
        DISMISSED = c16ax5;
        C16AX[] c16axArr = {c16ax, c16ax2, c16ax3, c16ax4, c16ax5};
        LL = c16axArr;
        LLILLJJLI = new C2254308sP(c16axArr);
    }

    public static C16AX[] values() {
        return (C16AX[]) LL.clone();
    }

    public static C16AX valueOf(String str) {
        return (C16AX) C08FF.LIZ(C16AX.class, str);
    }

    public C16AX(String str, int i) {
    }
}
