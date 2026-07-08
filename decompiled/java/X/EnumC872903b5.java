package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03b5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC872903b5 {
    public static final EnumC872903b5 ADD_ATM;
    public static final EnumC872903b5 ADD_CCDC;
    public static final EnumC872903b5 ADD_CCI;
    public static final EnumC872903b5 ADD_HSAFSA;
    public static final EnumC872903b5 CC_INSTALLMENT_PLAN;
    public static final EnumC872903b5 EDIT_ADDRESS;
    public static final EnumC872903b5 INSTALLMENT_PLAN_SELECTION;
    public static final /* synthetic */ EnumC872903b5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC872903b5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC872903b5 enumC872903b5 = new EnumC872903b5("ADD_ATM", 0);
        ADD_ATM = enumC872903b5;
        EnumC872903b5 enumC872903b52 = new EnumC872903b5("ADD_CCDC", 1);
        ADD_CCDC = enumC872903b52;
        EnumC872903b5 enumC872903b53 = new EnumC872903b5("EDIT_ADDRESS", 2);
        EDIT_ADDRESS = enumC872903b53;
        EnumC872903b5 enumC872903b54 = new EnumC872903b5("ADD_CCI", 3);
        ADD_CCI = enumC872903b54;
        EnumC872903b5 enumC872903b55 = new EnumC872903b5("CC_INSTALLMENT_PLAN", 4);
        CC_INSTALLMENT_PLAN = enumC872903b55;
        EnumC872903b5 enumC872903b56 = new EnumC872903b5("INSTALLMENT_PLAN_SELECTION", 5);
        INSTALLMENT_PLAN_SELECTION = enumC872903b56;
        EnumC872903b5 enumC872903b57 = new EnumC872903b5("ADD_HSAFSA", 6);
        ADD_HSAFSA = enumC872903b57;
        EnumC872903b5[] enumC872903b5Arr = {enumC872903b5, enumC872903b52, enumC872903b53, enumC872903b54, enumC872903b55, enumC872903b56, enumC872903b57};
        LL = enumC872903b5Arr;
        LLILLJJLI = new C2254308sP(enumC872903b5Arr);
    }

    public static EnumC872903b5[] values() {
        return (EnumC872903b5[]) LL.clone();
    }

    public static EnumC872903b5 valueOf(String str) {
        return (EnumC872903b5) C08FF.LIZ(EnumC872903b5.class, str);
    }

    public EnumC872903b5(String str, int i) {
    }
}
