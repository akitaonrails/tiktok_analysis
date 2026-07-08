package X;

import android.util.SparseArray;

/* JADX INFO: renamed from: X.0WDE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0WDE {
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17),
    NONE(-1);

    public static final SparseArray<C0WDE> LLILLJJLI;
    public final int LL;

    static {
        C0WDE c0wde = MOBILE;
        C0WDE c0wde2 = WIFI;
        C0WDE c0wde3 = MOBILE_MMS;
        C0WDE c0wde4 = MOBILE_SUPL;
        C0WDE c0wde5 = MOBILE_DUN;
        C0WDE c0wde6 = MOBILE_HIPRI;
        C0WDE c0wde7 = WIMAX;
        C0WDE c0wde8 = BLUETOOTH;
        C0WDE c0wde9 = DUMMY;
        C0WDE c0wde10 = ETHERNET;
        C0WDE c0wde11 = MOBILE_FOTA;
        C0WDE c0wde12 = MOBILE_IMS;
        C0WDE c0wde13 = MOBILE_CBS;
        C0WDE c0wde14 = WIFI_P2P;
        C0WDE c0wde15 = MOBILE_IA;
        C0WDE c0wde16 = MOBILE_EMERGENCY;
        C0WDE c0wde17 = PROXY;
        C0WDE c0wde18 = VPN;
        C0WDE c0wde19 = NONE;
        SparseArray<C0WDE> sparseArray = new SparseArray<>();
        LLILLJJLI = sparseArray;
        sparseArray.put(0, c0wde);
        sparseArray.put(1, c0wde2);
        sparseArray.put(2, c0wde3);
        sparseArray.put(3, c0wde4);
        sparseArray.put(4, c0wde5);
        sparseArray.put(5, c0wde6);
        sparseArray.put(6, c0wde7);
        sparseArray.put(7, c0wde8);
        sparseArray.put(8, c0wde9);
        sparseArray.put(9, c0wde10);
        sparseArray.put(10, c0wde11);
        sparseArray.put(11, c0wde12);
        sparseArray.put(12, c0wde13);
        sparseArray.put(13, c0wde14);
        sparseArray.put(14, c0wde15);
        sparseArray.put(15, c0wde16);
        sparseArray.put(16, c0wde17);
        sparseArray.put(17, c0wde18);
        sparseArray.put(-1, c0wde19);
    }

    public int getValue() {
        return this.LL;
    }

    public static C0WDE forNumber(int i) {
        return LLILLJJLI.get(i);
    }

    public static C0WDE valueOf(String str) {
        return (C0WDE) C08FF.LIZ(C0WDE.class, str);
    }

    C0WDE(int i) {
        this.LL = i;
    }
}
