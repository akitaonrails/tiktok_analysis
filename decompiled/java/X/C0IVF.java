package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IVF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IVF {
    public static final /* synthetic */ C0IVF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IVF PAUSE;
    public static final C0IVF RESUME;
    public static final C0IVF START;
    public static final C0IVF STOP;

    public static InterfaceC2044707zh<C0IVF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IVF c0ivf = new C0IVF("START", 0);
        START = c0ivf;
        C0IVF c0ivf2 = new C0IVF("STOP", 1);
        STOP = c0ivf2;
        C0IVF c0ivf3 = new C0IVF("PAUSE", 2);
        PAUSE = c0ivf3;
        C0IVF c0ivf4 = new C0IVF("RESUME", 3);
        RESUME = c0ivf4;
        C0IVF[] c0ivfArr = {c0ivf, c0ivf2, c0ivf3, c0ivf4};
        LL = c0ivfArr;
        LLILLJJLI = new C2254308sP(c0ivfArr);
    }

    public static C0IVF[] values() {
        return (C0IVF[]) LL.clone();
    }

    public static C0IVF valueOf(String str) {
        return (C0IVF) C08FF.LIZ(C0IVF.class, str);
    }

    public C0IVF(String str, int i) {
    }
}
