package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KMJ {
    public static final C0KMJ CREATED;
    public static final C0KMJ IAP_FAIL;
    public static final C0KMJ IAP_STARTED;
    public static final C0KMJ IAP_SUCCEED;
    public static final /* synthetic */ C0KMJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0KMJ QUERY_ORDER_FAILED;
    public static final C0KMJ QUERY_ORDER_STARTED;
    public static final C0KMJ QUERY_ORDER_SUCCEED;
    public static final C0KMJ UNKNOWN;

    public static InterfaceC2044707zh<C0KMJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0KMJ c0kmj = new C0KMJ("UNKNOWN", 0);
        UNKNOWN = c0kmj;
        C0KMJ c0kmj2 = new C0KMJ("CREATED", 1);
        CREATED = c0kmj2;
        C0KMJ c0kmj3 = new C0KMJ("IAP_STARTED", 2);
        IAP_STARTED = c0kmj3;
        C0KMJ c0kmj4 = new C0KMJ("IAP_SUCCEED", 3);
        IAP_SUCCEED = c0kmj4;
        C0KMJ c0kmj5 = new C0KMJ("IAP_FAIL", 4);
        IAP_FAIL = c0kmj5;
        C0KMJ c0kmj6 = new C0KMJ("QUERY_ORDER_STARTED", 5);
        QUERY_ORDER_STARTED = c0kmj6;
        C0KMJ c0kmj7 = new C0KMJ("QUERY_ORDER_SUCCEED", 6);
        QUERY_ORDER_SUCCEED = c0kmj7;
        C0KMJ c0kmj8 = new C0KMJ("QUERY_ORDER_FAILED", 7);
        QUERY_ORDER_FAILED = c0kmj8;
        C0KMJ[] c0kmjArr = {c0kmj, c0kmj2, c0kmj3, c0kmj4, c0kmj5, c0kmj6, c0kmj7, c0kmj8};
        LL = c0kmjArr;
        LLILLJJLI = new C2254308sP(c0kmjArr);
    }

    public static C0KMJ[] values() {
        return (C0KMJ[]) LL.clone();
    }

    public static C0KMJ valueOf(String str) {
        return (C0KMJ) C08FF.LIZ(C0KMJ.class, str);
    }

    public C0KMJ(String str, int i) {
    }
}
