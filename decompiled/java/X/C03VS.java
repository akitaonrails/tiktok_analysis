package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03VS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03VS {
    public static final /* synthetic */ C03VS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03VS MALL;
    public static final C03VS ORDER_DETAIL;
    public static final C03VS PAY_SUCCESS;
    public static final C03VS UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C03VS> getEntries() {
        return LLILLL;
    }

    static {
        C03VS c03vs = new C03VS("UNKNOWN", 0, 0);
        UNKNOWN = c03vs;
        C03VS c03vs2 = new C03VS("ORDER_DETAIL", 1, 1);
        ORDER_DETAIL = c03vs2;
        C03VS c03vs3 = new C03VS("PAY_SUCCESS", 2, 2);
        PAY_SUCCESS = c03vs3;
        C03VS c03vs4 = new C03VS("MALL", 3, 3);
        MALL = c03vs4;
        C03VS[] c03vsArr = {c03vs, c03vs2, c03vs3, c03vs4};
        LLILLJJLI = c03vsArr;
        LLILLL = new C2254308sP(c03vsArr);
    }

    public static C03VS[] values() {
        return (C03VS[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03VS valueOf(String str) {
        return (C03VS) C08FF.LIZ(C03VS.class, str);
    }

    public C03VS(String str, int i, int i2) {
        this.LL = i2;
    }
}
