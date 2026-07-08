package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03OW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OW {
    public static final /* synthetic */ C03OW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03OW OSP_ADD_NEW_CARD;
    public static final C03OW OSP_ANCHOR;
    public static final C03OW OSP_CASHIER_ADD_NEW_CARD;
    public static final C03OW OSP_CASHIER_CHECKED_PAYMENT;
    public static final C03OW OSP_CHECKED_PAYMENT;
    public static final C03OW OSP_DEFAULT_SELECT;
    public static final C03OW OSP_SILENT;
    public static final C03OW SECOND_PAY_ADD_NEW_CARD;
    public static final C03OW SECOND_PAY_ANCHOR;
    public static final C03OW SECOND_PAY_CHECKED_PAYMENT;
    public static final C03OW SECOND_PAY_DEFAULT_SELECT;
    public static final C03OW SECOND_PAY_SILENT;
    public final String LL;

    public static InterfaceC2044707zh<C03OW> getEntries() {
        return LLILLL;
    }

    static {
        C03OW c03ow = new C03OW("OSP_SILENT", 0, "osp_silent");
        OSP_SILENT = c03ow;
        C03OW c03ow2 = new C03OW("OSP_ANCHOR", 1, "osp_anchor");
        OSP_ANCHOR = c03ow2;
        C03OW c03ow3 = new C03OW("OSP_DEFAULT_SELECT", 2, "osp_default_select");
        OSP_DEFAULT_SELECT = c03ow3;
        C03OW c03ow4 = new C03OW("OSP_CHECKED_PAYMENT", 3, "osp_checked_payment");
        OSP_CHECKED_PAYMENT = c03ow4;
        C03OW c03ow5 = new C03OW("OSP_ADD_NEW_CARD", 4, "osp_add_new_card");
        OSP_ADD_NEW_CARD = c03ow5;
        C03OW c03ow6 = new C03OW("OSP_CASHIER_CHECKED_PAYMENT", 5, "osp_cashier_checked_payment");
        OSP_CASHIER_CHECKED_PAYMENT = c03ow6;
        C03OW c03ow7 = new C03OW("OSP_CASHIER_ADD_NEW_CARD", 6, "osp_cashier_add_new_card");
        OSP_CASHIER_ADD_NEW_CARD = c03ow7;
        C03OW c03ow8 = new C03OW("SECOND_PAY_SILENT", 7, "second_pay_silent");
        SECOND_PAY_SILENT = c03ow8;
        C03OW c03ow9 = new C03OW("SECOND_PAY_ANCHOR", 8, "second_pay_anchor");
        SECOND_PAY_ANCHOR = c03ow9;
        C03OW c03ow10 = new C03OW("SECOND_PAY_DEFAULT_SELECT", 9, "second_pay_default_select");
        SECOND_PAY_DEFAULT_SELECT = c03ow10;
        C03OW c03ow11 = new C03OW("SECOND_PAY_CHECKED_PAYMENT", 10, "second_pay_checked_payment");
        SECOND_PAY_CHECKED_PAYMENT = c03ow11;
        C03OW c03ow12 = new C03OW("SECOND_PAY_ADD_NEW_CARD", 11, "second_pay_add_new_card");
        SECOND_PAY_ADD_NEW_CARD = c03ow12;
        C03OW[] c03owArr = {c03ow, c03ow2, c03ow3, c03ow4, c03ow5, c03ow6, c03ow7, c03ow8, c03ow9, c03ow10, c03ow11, c03ow12};
        LLILLJJLI = c03owArr;
        LLILLL = new C2254308sP(c03owArr);
    }

    public static C03OW[] values() {
        return (C03OW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C03OW valueOf(String str) {
        return (C03OW) C08FF.LIZ(C03OW.class, str);
    }

    public C03OW(String str, int i, String str2) {
        this.LL = str2;
    }
}
