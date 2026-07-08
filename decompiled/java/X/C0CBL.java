package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CBL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CBL {
    public static final C0CBL ENTERED;
    public static final C0CBL EXITED;
    public static final C0CBL IDLE;
    public static final /* synthetic */ C0CBL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0CBL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CBL c0cbl = new C0CBL("IDLE", 0);
        IDLE = c0cbl;
        C0CBL c0cbl2 = new C0CBL("ENTERED", 1);
        ENTERED = c0cbl2;
        C0CBL c0cbl3 = new C0CBL("EXITED", 2);
        EXITED = c0cbl3;
        C0CBL[] c0cblArr = {c0cbl, c0cbl2, c0cbl3};
        LL = c0cblArr;
        LLILLJJLI = new C2254308sP(c0cblArr);
    }

    public static C0CBL[] values() {
        return (C0CBL[]) LL.clone();
    }

    public static C0CBL valueOf(String str) {
        return (C0CBL) C08FF.LIZ(C0CBL.class, str);
    }

    public C0CBL(String str, int i) {
    }
}
