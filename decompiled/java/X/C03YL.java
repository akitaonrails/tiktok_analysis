package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03YL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03YL {
    public static final C03YL HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION;
    public static final C03YL HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION_TWOCOLUMNDISPLAYALLINSTALLMENTPLANS;
    public static final C03YL HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION_TWOCOLUMNDISPLAYFOURINSTALLMENTPLANS;
    public static final C03YL HAVE_REMAINING_AMOUNT_NO_INSTALLMENT_PREPOSITION;
    public static final /* synthetic */ C03YL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03YL NO_REMAINING_AMOUNT_NO_INSTALLMENT_PREPOSITION;
    public final int LL;

    public static InterfaceC2044707zh<C03YL> getEntries() {
        return LLILLL;
    }

    static {
        C03YL c03yl = new C03YL("NO_REMAINING_AMOUNT_NO_INSTALLMENT_PREPOSITION", 0, 0);
        NO_REMAINING_AMOUNT_NO_INSTALLMENT_PREPOSITION = c03yl;
        C03YL c03yl2 = new C03YL("HAVE_REMAINING_AMOUNT_NO_INSTALLMENT_PREPOSITION", 1, 1);
        HAVE_REMAINING_AMOUNT_NO_INSTALLMENT_PREPOSITION = c03yl2;
        C03YL c03yl3 = new C03YL("HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION", 2, 2);
        HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION = c03yl3;
        C03YL c03yl4 = new C03YL("HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION_TWOCOLUMNDISPLAYALLINSTALLMENTPLANS", 3, 3);
        HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION_TWOCOLUMNDISPLAYALLINSTALLMENTPLANS = c03yl4;
        C03YL c03yl5 = new C03YL("HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION_TWOCOLUMNDISPLAYFOURINSTALLMENTPLANS", 4, 4);
        HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION_TWOCOLUMNDISPLAYFOURINSTALLMENTPLANS = c03yl5;
        C03YL[] c03ylArr = {c03yl, c03yl2, c03yl3, c03yl4, c03yl5};
        LLILLJJLI = c03ylArr;
        LLILLL = new C2254308sP(c03ylArr);
    }

    public static C03YL[] values() {
        return (C03YL[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C03YL valueOf(String str) {
        return (C03YL) C08FF.LIZ(C03YL.class, str);
    }

    public C03YL(String str, int i, int i2) {
        this.LL = i2;
    }
}
