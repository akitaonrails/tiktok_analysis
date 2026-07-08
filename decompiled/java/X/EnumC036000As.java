package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00As, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC036000As {
    public static final EnumC036000As INSTALLMENT_PRICE;
    public static final /* synthetic */ EnumC036000As[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC036000As NO_SAVING;
    public static final EnumC036000As SAVING_AMOUNT;
    public static final EnumC036000As SAVING_PERCENTAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC036000As> getEntries() {
        return LLILLL;
    }

    static {
        EnumC036000As enumC036000As = new EnumC036000As("INSTALLMENT_PRICE", 0, 1);
        INSTALLMENT_PRICE = enumC036000As;
        EnumC036000As enumC036000As2 = new EnumC036000As("SAVING_AMOUNT", 1, 2);
        SAVING_AMOUNT = enumC036000As2;
        EnumC036000As enumC036000As3 = new EnumC036000As("SAVING_PERCENTAGE", 2, 3);
        SAVING_PERCENTAGE = enumC036000As3;
        EnumC036000As enumC036000As4 = new EnumC036000As("NO_SAVING", 3, 4);
        NO_SAVING = enumC036000As4;
        EnumC036000As[] enumC036000AsArr = {enumC036000As, enumC036000As2, enumC036000As3, enumC036000As4};
        LLILLJJLI = enumC036000AsArr;
        LLILLL = new C2254308sP(enumC036000AsArr);
    }

    public static EnumC036000As[] values() {
        return (EnumC036000As[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC036000As valueOf(String str) {
        return (EnumC036000As) C08FF.LIZ(EnumC036000As.class, str);
    }

    public EnumC036000As(String str, int i, int i2) {
        this.LL = i2;
    }
}
