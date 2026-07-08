package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC878703c1 {
    public static final EnumC878703c1 CHANGE_CARD;
    public static final /* synthetic */ EnumC878703c1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC878703c1 OSP;
    public static final EnumC878703c1 SECOND_PAYMENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC878703c1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC878703c1 enumC878703c1 = new EnumC878703c1("SECOND_PAYMENT", 0, "second_payment");
        SECOND_PAYMENT = enumC878703c1;
        EnumC878703c1 enumC878703c12 = new EnumC878703c1("OSP", 1, "osp");
        OSP = enumC878703c12;
        EnumC878703c1 enumC878703c13 = new EnumC878703c1("CHANGE_CARD", 2, "change_card");
        CHANGE_CARD = enumC878703c13;
        EnumC878703c1[] enumC878703c1Arr = {enumC878703c1, enumC878703c12, enumC878703c13};
        LLILLJJLI = enumC878703c1Arr;
        LLILLL = new C2254308sP(enumC878703c1Arr);
    }

    public static EnumC878703c1[] values() {
        return (EnumC878703c1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC878703c1 valueOf(String str) {
        return (EnumC878703c1) C08FF.LIZ(EnumC878703c1.class, str);
    }

    public EnumC878703c1(String str, int i, String str2) {
        this.LL = str2;
    }
}
