package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BX {
    public static final C00BX DEFERRED_QUEUE;
    public static final C00BX DOWNLOAD_QUEUE;
    public static final /* synthetic */ C00BX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00BX RUNNING;

    public static InterfaceC2044707zh<C00BX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00BX c00bx = new C00BX("RUNNING", 0);
        RUNNING = c00bx;
        C00BX c00bx2 = new C00BX("DOWNLOAD_QUEUE", 1);
        DOWNLOAD_QUEUE = c00bx2;
        C00BX c00bx3 = new C00BX("DEFERRED_QUEUE", 2);
        DEFERRED_QUEUE = c00bx3;
        C00BX[] c00bxArr = {c00bx, c00bx2, c00bx3};
        LL = c00bxArr;
        LLILLJJLI = new C2254308sP(c00bxArr);
    }

    public static C00BX[] values() {
        return (C00BX[]) LL.clone();
    }

    public static C00BX valueOf(String str) {
        return (C00BX) C08FF.LIZ(C00BX.class, str);
    }

    public C00BX(String str, int i) {
    }
}
