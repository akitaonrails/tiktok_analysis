package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EJE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJE {
    public static final /* synthetic */ C0EJE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0EJE NORMAL;
    public static final C0EJE SMALL;
    public static final C0EJE WIDE;

    public static InterfaceC2044707zh<C0EJE> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0EJE c0eje = new C0EJE("SMALL", 0);
        SMALL = c0eje;
        C0EJE c0eje2 = new C0EJE("NORMAL", 1);
        NORMAL = c0eje2;
        C0EJE c0eje3 = new C0EJE("WIDE", 2);
        WIDE = c0eje3;
        C0EJE[] c0ejeArr = {c0eje, c0eje2, c0eje3};
        LL = c0ejeArr;
        LLILLJJLI = new C2254308sP(c0ejeArr);
    }

    public static C0EJE[] values() {
        return (C0EJE[]) LL.clone();
    }

    public static C0EJE valueOf(String str) {
        return (C0EJE) C08FF.LIZ(C0EJE.class, str);
    }

    public C0EJE(String str, int i) {
    }
}
