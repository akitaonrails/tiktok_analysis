package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGF {
    public static final C0PGF GROUP;
    public static final /* synthetic */ C0PGF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PGF NORMAL;
    public static final C0PGF USER;

    public static InterfaceC2044707zh<C0PGF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PGF c0pgf = new C0PGF("NORMAL", 0);
        NORMAL = c0pgf;
        C0PGF c0pgf2 = new C0PGF("USER", 1);
        USER = c0pgf2;
        C0PGF c0pgf3 = new C0PGF("GROUP", 2);
        GROUP = c0pgf3;
        C0PGF[] c0pgfArr = {c0pgf, c0pgf2, c0pgf3};
        LL = c0pgfArr;
        LLILLJJLI = new C2254308sP(c0pgfArr);
    }

    public static C0PGF[] values() {
        return (C0PGF[]) LL.clone();
    }

    public static C0PGF valueOf(String str) {
        return (C0PGF) C08FF.LIZ(C0PGF.class, str);
    }

    public C0PGF(String str, int i) {
    }
}
