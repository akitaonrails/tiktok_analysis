package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1ATD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ATD {
    public static final C1ATD B;
    public static final C1ATD GB;
    public static final C1ATD KB;
    public static final /* synthetic */ C1ATD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1ATD MB;

    public static InterfaceC2044707zh<C1ATD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1ATD c1atd = new C1ATD("B", 0);
        B = c1atd;
        C1ATD c1atd2 = new C1ATD("KB", 1);
        KB = c1atd2;
        C1ATD c1atd3 = new C1ATD("MB", 2);
        MB = c1atd3;
        C1ATD c1atd4 = new C1ATD("GB", 3);
        GB = c1atd4;
        C1ATD[] c1atdArr = {c1atd, c1atd2, c1atd3, c1atd4};
        LL = c1atdArr;
        LLILLJJLI = new C2254308sP(c1atdArr);
    }

    public static C1ATD[] values() {
        return (C1ATD[]) LL.clone();
    }

    public static C1ATD valueOf(String str) {
        return (C1ATD) C08FF.LIZ(C1ATD.class, str);
    }

    public C1ATD(String str, int i) {
    }
}
