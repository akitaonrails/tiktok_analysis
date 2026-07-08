package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KM4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KM4 {
    public static final C0KM4 CREATED;
    public static final C0KM4 IAP_FAIL;
    public static final C0KM4 IAP_STARTED;
    public static final C0KM4 IAP_SUCCEED;
    public static final /* synthetic */ C0KM4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0KM4 QUERY_ORDER_FAILED;
    public static final C0KM4 QUERY_ORDER_STARTED;
    public static final C0KM4 QUERY_ORDER_SUCCEED;
    public static final C0KM4 UNKNOWN;

    public static InterfaceC2044707zh<C0KM4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0KM4 c0km4 = new C0KM4("UNKNOWN", 0);
        UNKNOWN = c0km4;
        C0KM4 c0km42 = new C0KM4("CREATED", 1);
        CREATED = c0km42;
        C0KM4 c0km43 = new C0KM4("IAP_STARTED", 2);
        IAP_STARTED = c0km43;
        C0KM4 c0km44 = new C0KM4("IAP_SUCCEED", 3);
        IAP_SUCCEED = c0km44;
        C0KM4 c0km45 = new C0KM4("IAP_FAIL", 4);
        IAP_FAIL = c0km45;
        C0KM4 c0km46 = new C0KM4("QUERY_ORDER_STARTED", 5);
        QUERY_ORDER_STARTED = c0km46;
        C0KM4 c0km47 = new C0KM4("QUERY_ORDER_SUCCEED", 6);
        QUERY_ORDER_SUCCEED = c0km47;
        C0KM4 c0km48 = new C0KM4("QUERY_ORDER_FAILED", 7);
        QUERY_ORDER_FAILED = c0km48;
        C0KM4[] c0km4Arr = {c0km4, c0km42, c0km43, c0km44, c0km45, c0km46, c0km47, c0km48};
        LL = c0km4Arr;
        LLILLJJLI = new C2254308sP(c0km4Arr);
    }

    public static C0KM4[] values() {
        return (C0KM4[]) LL.clone();
    }

    public static C0KM4 valueOf(String str) {
        return (C0KM4) C08FF.LIZ(C0KM4.class, str);
    }

    public C0KM4(String str, int i) {
    }
}
