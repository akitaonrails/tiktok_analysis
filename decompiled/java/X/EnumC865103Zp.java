package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC865103Zp {
    public static final EnumC865103Zp FILL_NEW_CCI_CARD_BR;
    public static final EnumC865103Zp FILL_NEW_CCI_CARD_SEA;
    public static final EnumC865103Zp FILL_NEW_CCI_CARD_US;
    public static final /* synthetic */ EnumC865103Zp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC865103Zp SELECT_BANK_INSTALLMENT_SEA;
    public static final EnumC865103Zp SELECT_INSTALLMENT_PLAN;

    public static InterfaceC2044707zh<EnumC865103Zp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC865103Zp enumC865103Zp = new EnumC865103Zp("SELECT_BANK_INSTALLMENT_SEA", 0);
        SELECT_BANK_INSTALLMENT_SEA = enumC865103Zp;
        EnumC865103Zp enumC865103Zp2 = new EnumC865103Zp("FILL_NEW_CCI_CARD_SEA", 1);
        FILL_NEW_CCI_CARD_SEA = enumC865103Zp2;
        EnumC865103Zp enumC865103Zp3 = new EnumC865103Zp("FILL_NEW_CCI_CARD_US", 2);
        FILL_NEW_CCI_CARD_US = enumC865103Zp3;
        EnumC865103Zp enumC865103Zp4 = new EnumC865103Zp("SELECT_INSTALLMENT_PLAN", 3);
        SELECT_INSTALLMENT_PLAN = enumC865103Zp4;
        EnumC865103Zp enumC865103Zp5 = new EnumC865103Zp("FILL_NEW_CCI_CARD_BR", 4);
        FILL_NEW_CCI_CARD_BR = enumC865103Zp5;
        EnumC865103Zp[] enumC865103ZpArr = {enumC865103Zp, enumC865103Zp2, enumC865103Zp3, enumC865103Zp4, enumC865103Zp5};
        LL = enumC865103ZpArr;
        LLILLJJLI = new C2254308sP(enumC865103ZpArr);
    }

    public static EnumC865103Zp[] values() {
        return (EnumC865103Zp[]) LL.clone();
    }

    public static EnumC865103Zp valueOf(String str) {
        return (EnumC865103Zp) C08FF.LIZ(EnumC865103Zp.class, str);
    }

    public EnumC865103Zp(String str, int i) {
    }
}
