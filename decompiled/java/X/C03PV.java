package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03PV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03PV {
    public static final /* synthetic */ C03PV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03PV ORDER_CREATE;
    public static final C03PV OSP_ORDER_PAY;
    public static final C03PV PIPO_SDK_PAY;
    public static final C03PV RETRY_CASHIER_ORDER_PAY;

    public static InterfaceC2044707zh<C03PV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03PV c03pv = new C03PV("ORDER_CREATE", 0);
        ORDER_CREATE = c03pv;
        C03PV c03pv2 = new C03PV("OSP_ORDER_PAY", 1);
        OSP_ORDER_PAY = c03pv2;
        C03PV c03pv3 = new C03PV("RETRY_CASHIER_ORDER_PAY", 2);
        RETRY_CASHIER_ORDER_PAY = c03pv3;
        C03PV c03pv4 = new C03PV("PIPO_SDK_PAY", 3);
        PIPO_SDK_PAY = c03pv4;
        C03PV[] c03pvArr = {c03pv, c03pv2, c03pv3, c03pv4};
        LL = c03pvArr;
        LLILLJJLI = new C2254308sP(c03pvArr);
    }

    public static C03PV[] values() {
        return (C03PV[]) LL.clone();
    }

    public static C03PV valueOf(String str) {
        return (C03PV) C08FF.LIZ(C03PV.class, str);
    }

    public C03PV(String str, int i) {
    }
}
