package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DA2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DA2 {
    public static final C0DA2 ECP;
    public static final /* synthetic */ C0DA2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DA2 UCP;

    public static InterfaceC2044707zh<C0DA2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DA2 c0da2 = new C0DA2("UCP", 0);
        UCP = c0da2;
        C0DA2 c0da22 = new C0DA2("ECP", 1);
        ECP = c0da22;
        C0DA2[] c0da2Arr = {c0da2, c0da22};
        LL = c0da2Arr;
        LLILLJJLI = new C2254308sP(c0da2Arr);
    }

    public static C0DA2[] values() {
        return (C0DA2[]) LL.clone();
    }

    public static C0DA2 valueOf(String str) {
        return (C0DA2) C08FF.LIZ(C0DA2.class, str);
    }

    public C0DA2(String str, int i) {
    }
}
