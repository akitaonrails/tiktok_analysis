package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCT {
    public static final C0NCT CANCELED;
    public static final C0NCT FAILED;
    public static final /* synthetic */ C0NCT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NCT SUCCESS;

    public static InterfaceC2044707zh<C0NCT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NCT c0nct = new C0NCT("SUCCESS", 0);
        SUCCESS = c0nct;
        C0NCT c0nct2 = new C0NCT("CANCELED", 1);
        CANCELED = c0nct2;
        C0NCT c0nct3 = new C0NCT("FAILED", 2);
        FAILED = c0nct3;
        C0NCT[] c0nctArr = {c0nct, c0nct2, c0nct3};
        LL = c0nctArr;
        LLILLJJLI = new C2254308sP(c0nctArr);
    }

    public static C0NCT[] values() {
        return (C0NCT[]) LL.clone();
    }

    public static C0NCT valueOf(String str) {
        return (C0NCT) C08FF.LIZ(C0NCT.class, str);
    }

    public C0NCT(String str, int i) {
    }
}
