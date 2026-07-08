package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01EL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01EL {
    public static final C01EL END;
    public static final /* synthetic */ C01EL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C01EL START;

    public static InterfaceC2044707zh<C01EL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C01EL c01el = new C01EL("START", 0);
        START = c01el;
        C01EL c01el2 = new C01EL("END", 1);
        END = c01el2;
        C01EL[] c01elArr = {c01el, c01el2};
        LL = c01elArr;
        LLILLJJLI = new C2254308sP(c01elArr);
    }

    public static C01EL[] values() {
        return (C01EL[]) LL.clone();
    }

    public static C01EL valueOf(String str) {
        return (C01EL) C08FF.LIZ(C01EL.class, str);
    }

    public C01EL(String str, int i) {
    }
}
