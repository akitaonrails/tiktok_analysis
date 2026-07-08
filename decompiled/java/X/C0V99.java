package X;

import android.util.SparseArray;

/* JADX INFO: renamed from: X.0V99, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0V99 {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);

    public static final SparseArray<C0V99> LLILLJJLI;
    public final int LL;

    static {
        C0V99 c0v99 = UNKNOWN_MOBILE_SUBTYPE;
        C0V99 c0v992 = GPRS;
        C0V99 c0v993 = EDGE;
        C0V99 c0v994 = UMTS;
        C0V99 c0v995 = CDMA;
        C0V99 c0v996 = EVDO_0;
        C0V99 c0v997 = EVDO_A;
        C0V99 c0v998 = RTT;
        C0V99 c0v999 = HSDPA;
        C0V99 c0v9910 = HSUPA;
        C0V99 c0v9911 = HSPA;
        C0V99 c0v9912 = IDEN;
        C0V99 c0v9913 = EVDO_B;
        C0V99 c0v9914 = LTE;
        C0V99 c0v9915 = EHRPD;
        C0V99 c0v9916 = HSPAP;
        C0V99 c0v9917 = GSM;
        C0V99 c0v9918 = TD_SCDMA;
        C0V99 c0v9919 = IWLAN;
        C0V99 c0v9920 = LTE_CA;
        SparseArray<C0V99> sparseArray = new SparseArray<>();
        LLILLJJLI = sparseArray;
        sparseArray.put(0, c0v99);
        sparseArray.put(1, c0v992);
        sparseArray.put(2, c0v993);
        sparseArray.put(3, c0v994);
        sparseArray.put(4, c0v995);
        sparseArray.put(5, c0v996);
        sparseArray.put(6, c0v997);
        sparseArray.put(7, c0v998);
        sparseArray.put(8, c0v999);
        sparseArray.put(9, c0v9910);
        sparseArray.put(10, c0v9911);
        sparseArray.put(11, c0v9912);
        sparseArray.put(12, c0v9913);
        sparseArray.put(13, c0v9914);
        sparseArray.put(14, c0v9915);
        sparseArray.put(15, c0v9916);
        sparseArray.put(16, c0v9917);
        sparseArray.put(17, c0v9918);
        sparseArray.put(18, c0v9919);
        sparseArray.put(19, c0v9920);
    }

    public int getValue() {
        return this.LL;
    }

    public static C0V99 forNumber(int i) {
        return LLILLJJLI.get(i);
    }

    public static C0V99 valueOf(String str) {
        return (C0V99) C08FF.LIZ(C0V99.class, str);
    }

    C0V99(int i) {
        this.LL = i;
    }
}
