package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGD {
    public static final C0PGD FIRST_SCREEN;
    public static final /* synthetic */ C0PGD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PGD NON_FIRST_SCREEN;

    public static InterfaceC2044707zh<C0PGD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PGD c0pgd = new C0PGD("FIRST_SCREEN", 0);
        FIRST_SCREEN = c0pgd;
        C0PGD c0pgd2 = new C0PGD("NON_FIRST_SCREEN", 1);
        NON_FIRST_SCREEN = c0pgd2;
        C0PGD[] c0pgdArr = {c0pgd, c0pgd2};
        LL = c0pgdArr;
        LLILLJJLI = new C2254308sP(c0pgdArr);
    }

    public static C0PGD[] values() {
        return (C0PGD[]) LL.clone();
    }

    public static C0PGD valueOf(String str) {
        return (C0PGD) C08FF.LIZ(C0PGD.class, str);
    }

    public C0PGD(String str, int i) {
    }
}
