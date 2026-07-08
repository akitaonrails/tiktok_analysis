package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03N1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03N1 {
    public static final C03N1 CANCEL;
    public static final C03N1 COMPLETE;
    public static final C03N1 FAIL;
    public static final /* synthetic */ C03N1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C03N1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03N1 c03n1 = new C03N1("COMPLETE", 0);
        COMPLETE = c03n1;
        C03N1 c03n12 = new C03N1("CANCEL", 1);
        CANCEL = c03n12;
        C03N1 c03n13 = new C03N1("FAIL", 2);
        FAIL = c03n13;
        C03N1[] c03n1Arr = {c03n1, c03n12, c03n13};
        LL = c03n1Arr;
        LLILLJJLI = new C2254308sP(c03n1Arr);
    }

    public static C03N1[] values() {
        return (C03N1[]) LL.clone();
    }

    public static C03N1 valueOf(String str) {
        return (C03N1) C08FF.LIZ(C03N1.class, str);
    }

    public C03N1(String str, int i) {
    }
}
