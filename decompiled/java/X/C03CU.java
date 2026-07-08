package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03CU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CU {
    public static final /* synthetic */ C03CU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03CU SNS_CARD_IS_PREPAID;
    public static final C03CU SNS_CARD_NOT_CHOOSE_SAVE;
    public static final C03CU SNS_PAYPAL_NOT_CHOOSE_SAVE;
    public final String LL;

    public static InterfaceC2044707zh<C03CU> getEntries() {
        return LLILLL;
    }

    static {
        C03CU c03cu = new C03CU("SNS_CARD_NOT_CHOOSE_SAVE", 0, "CARD_NOT_CHOOSE_SAVE");
        SNS_CARD_NOT_CHOOSE_SAVE = c03cu;
        C03CU c03cu2 = new C03CU("SNS_CARD_IS_PREPAID", 1, "CARD_IS_PREPAID");
        SNS_CARD_IS_PREPAID = c03cu2;
        C03CU c03cu3 = new C03CU("SNS_PAYPAL_NOT_CHOOSE_SAVE", 2, "PAYPAL_NOT_CHOOSE_SAVE");
        SNS_PAYPAL_NOT_CHOOSE_SAVE = c03cu3;
        C03CU[] c03cuArr = {c03cu, c03cu2, c03cu3};
        LLILLJJLI = c03cuArr;
        LLILLL = new C2254308sP(c03cuArr);
    }

    public static C03CU[] values() {
        return (C03CU[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C03CU valueOf(String str) {
        return (C03CU) C08FF.LIZ(C03CU.class, str);
    }

    public C03CU(String str, int i, String str2) {
        this.LL = str2;
    }
}
