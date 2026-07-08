package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PHM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PHM {
    public static final C0PHM ALL_COLUMNS;
    public static final /* synthetic */ C0PHM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PHM ONE_COLUMN;

    public static InterfaceC2044707zh<C0PHM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PHM c0phm = new C0PHM("ONE_COLUMN", 0);
        ONE_COLUMN = c0phm;
        C0PHM c0phm2 = new C0PHM("ALL_COLUMNS", 1);
        ALL_COLUMNS = c0phm2;
        C0PHM[] c0phmArr = {c0phm, c0phm2};
        LL = c0phmArr;
        LLILLJJLI = new C2254308sP(c0phmArr);
    }

    public static C0PHM[] values() {
        return (C0PHM[]) LL.clone();
    }

    public static C0PHM valueOf(String str) {
        return (C0PHM) C08FF.LIZ(C0PHM.class, str);
    }

    public C0PHM(String str, int i) {
    }
}
