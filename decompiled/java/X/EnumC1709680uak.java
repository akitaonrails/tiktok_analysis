package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1709680uak {
    public static final EnumC1709680uak BANK_TRANSFER;
    public static final EnumC1709680uak BANK_TRANSFER_GROUP;
    public static final EnumC1709680uak CCDC_ADDED_LOCAL;
    public static final EnumC1709680uak CCDC_GROUP;
    public static final EnumC1709680uak CCDC_TEMPLATE;
    public static final EnumC1709680uak DISPLAY_IN_SINGLE_PM;
    public static final EnumC1709680uak DISPLAY_IN_SINGLE_PM_GROUP;
    public static final /* synthetic */ EnumC1709680uak[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1709680uak NORMAL;
    public static final EnumC1709680uak NORMAL_GROUP;
    public static final EnumC1709680uak NORMAL_SUB;

    public static InterfaceC2044707zh<EnumC1709680uak> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1709680uak enumC1709680uak = new EnumC1709680uak("CCDC_GROUP", 0);
        CCDC_GROUP = enumC1709680uak;
        EnumC1709680uak enumC1709680uak2 = new EnumC1709680uak("CCDC_TEMPLATE", 1);
        CCDC_TEMPLATE = enumC1709680uak2;
        EnumC1709680uak enumC1709680uak3 = new EnumC1709680uak("CCDC_ADDED_LOCAL", 2);
        CCDC_ADDED_LOCAL = enumC1709680uak3;
        EnumC1709680uak enumC1709680uak4 = new EnumC1709680uak("BANK_TRANSFER_GROUP", 3);
        BANK_TRANSFER_GROUP = enumC1709680uak4;
        EnumC1709680uak enumC1709680uak5 = new EnumC1709680uak("BANK_TRANSFER", 4);
        BANK_TRANSFER = enumC1709680uak5;
        EnumC1709680uak enumC1709680uak6 = new EnumC1709680uak("DISPLAY_IN_SINGLE_PM_GROUP", 5);
        DISPLAY_IN_SINGLE_PM_GROUP = enumC1709680uak6;
        EnumC1709680uak enumC1709680uak7 = new EnumC1709680uak("DISPLAY_IN_SINGLE_PM", 6);
        DISPLAY_IN_SINGLE_PM = enumC1709680uak7;
        EnumC1709680uak enumC1709680uak8 = new EnumC1709680uak("NORMAL_GROUP", 7);
        NORMAL_GROUP = enumC1709680uak8;
        EnumC1709680uak enumC1709680uak9 = new EnumC1709680uak("NORMAL_SUB", 8);
        NORMAL_SUB = enumC1709680uak9;
        EnumC1709680uak enumC1709680uak10 = new EnumC1709680uak("NORMAL", 9);
        NORMAL = enumC1709680uak10;
        EnumC1709680uak[] enumC1709680uakArr = {enumC1709680uak, enumC1709680uak2, enumC1709680uak3, enumC1709680uak4, enumC1709680uak5, enumC1709680uak6, enumC1709680uak7, enumC1709680uak8, enumC1709680uak9, enumC1709680uak10};
        LL = enumC1709680uakArr;
        LLILLJJLI = new C2254308sP(enumC1709680uakArr);
    }

    public static EnumC1709680uak[] values() {
        return (EnumC1709680uak[]) LL.clone();
    }

    public static EnumC1709680uak valueOf(String str) {
        return (EnumC1709680uak) C08FF.LIZ(EnumC1709680uak.class, str);
    }

    public EnumC1709680uak(String str, int i) {
    }
}
