package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1708860uZQ {
    public static final EnumC1708860uZQ BANK_CARD_RULE_LIST;
    public static final EnumC1708860uZQ CASHIER_DISPLAY_INFO;
    public static final EnumC1708860uZQ ELEMENT;
    public static final /* synthetic */ EnumC1708860uZQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1708860uZQ PAYMENT_METHOD;
    public static final EnumC1708860uZQ SESSION;
    public static final EnumC1708860uZQ STORED_PAYMENT_METHOD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1708860uZQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1708860uZQ enumC1708860uZQ = new EnumC1708860uZQ("PAYMENT_METHOD", 0, "PAYMENT_METHOD");
        PAYMENT_METHOD = enumC1708860uZQ;
        EnumC1708860uZQ enumC1708860uZQ2 = new EnumC1708860uZQ("STORED_PAYMENT_METHOD", 1, "STORED_PAYMENT_METHOD");
        STORED_PAYMENT_METHOD = enumC1708860uZQ2;
        EnumC1708860uZQ enumC1708860uZQ3 = new EnumC1708860uZQ("CASHIER_DISPLAY_INFO", 2, "CASHIER_DISPLAY_INFO");
        CASHIER_DISPLAY_INFO = enumC1708860uZQ3;
        EnumC1708860uZQ enumC1708860uZQ4 = new EnumC1708860uZQ("SESSION", 3, "SESSION");
        SESSION = enumC1708860uZQ4;
        EnumC1708860uZQ enumC1708860uZQ5 = new EnumC1708860uZQ("ELEMENT", 4, "ELEMENT");
        ELEMENT = enumC1708860uZQ5;
        EnumC1708860uZQ enumC1708860uZQ6 = new EnumC1708860uZQ("BANK_CARD_RULE_LIST", 5, "BANK_CARD_RULE_LIST");
        BANK_CARD_RULE_LIST = enumC1708860uZQ6;
        EnumC1708860uZQ[] enumC1708860uZQArr = {enumC1708860uZQ, enumC1708860uZQ2, enumC1708860uZQ3, enumC1708860uZQ4, enumC1708860uZQ5, enumC1708860uZQ6};
        LLILLJJLI = enumC1708860uZQArr;
        LLILLL = new C2254308sP(enumC1708860uZQArr);
    }

    public static EnumC1708860uZQ[] values() {
        return (EnumC1708860uZQ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1708860uZQ valueOf(String str) {
        return (EnumC1708860uZQ) C08FF.LIZ(EnumC1708860uZQ.class, str);
    }

    public EnumC1708860uZQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
