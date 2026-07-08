package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782240wTm {
    public static final /* synthetic */ EnumC1782240wTm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782240wTm MAIN_PAGE;
    public static final EnumC1782240wTm ORDER_HISTORY;
    public static final EnumC1782240wTm PAYMENT_METHOD;
    public static final EnumC1782240wTm SUBSCRIPTION;

    public static InterfaceC2044707zh<EnumC1782240wTm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782240wTm enumC1782240wTm = new EnumC1782240wTm("MAIN_PAGE", 0);
        MAIN_PAGE = enumC1782240wTm;
        EnumC1782240wTm enumC1782240wTm2 = new EnumC1782240wTm("ORDER_HISTORY", 1);
        ORDER_HISTORY = enumC1782240wTm2;
        EnumC1782240wTm enumC1782240wTm3 = new EnumC1782240wTm("SUBSCRIPTION", 2);
        SUBSCRIPTION = enumC1782240wTm3;
        EnumC1782240wTm enumC1782240wTm4 = new EnumC1782240wTm("PAYMENT_METHOD", 3);
        PAYMENT_METHOD = enumC1782240wTm4;
        EnumC1782240wTm[] enumC1782240wTmArr = {enumC1782240wTm, enumC1782240wTm2, enumC1782240wTm3, enumC1782240wTm4};
        LL = enumC1782240wTmArr;
        LLILLJJLI = new C2254308sP(enumC1782240wTmArr);
    }

    public static EnumC1782240wTm[] values() {
        return (EnumC1782240wTm[]) LL.clone();
    }

    public static EnumC1782240wTm valueOf(String str) {
        return (EnumC1782240wTm) C08FF.LIZ(EnumC1782240wTm.class, str);
    }

    public EnumC1782240wTm(String str, int i) {
    }
}
