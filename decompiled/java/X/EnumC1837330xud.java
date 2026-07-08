package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1837330xud implements InterfaceC1837420xum {
    public static final EnumC1837330xud BIZ_CHECK_ORDER;
    public static final EnumC1837330xud BIZ_CREATE_ORDER;
    public static final EnumC1837330xud BIZ_TEMPLATE_FETCH;
    public static final EnumC1837330xud GP_PAYMENT;
    public static final EnumC1837330xud GP_PRODUCT_FETCH;
    public static final /* synthetic */ EnumC1837330xud[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1837330xud PRE_CHECK;
    public static final EnumC1837330xud UNKNOWN;

    public static InterfaceC2044707zh<EnumC1837330xud> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1837330xud enumC1837330xud = new EnumC1837330xud("UNKNOWN", 0);
        UNKNOWN = enumC1837330xud;
        EnumC1837330xud enumC1837330xud2 = new EnumC1837330xud("PRE_CHECK", 1);
        PRE_CHECK = enumC1837330xud2;
        EnumC1837330xud enumC1837330xud3 = new EnumC1837330xud("BIZ_TEMPLATE_FETCH", 2);
        BIZ_TEMPLATE_FETCH = enumC1837330xud3;
        EnumC1837330xud enumC1837330xud4 = new EnumC1837330xud("GP_PRODUCT_FETCH", 3);
        GP_PRODUCT_FETCH = enumC1837330xud4;
        EnumC1837330xud enumC1837330xud5 = new EnumC1837330xud("BIZ_CREATE_ORDER", 4);
        BIZ_CREATE_ORDER = enumC1837330xud5;
        EnumC1837330xud enumC1837330xud6 = new EnumC1837330xud("GP_PAYMENT", 5);
        GP_PAYMENT = enumC1837330xud6;
        EnumC1837330xud enumC1837330xud7 = new EnumC1837330xud("BIZ_CHECK_ORDER", 6);
        BIZ_CHECK_ORDER = enumC1837330xud7;
        EnumC1837330xud[] enumC1837330xudArr = {enumC1837330xud, enumC1837330xud2, enumC1837330xud3, enumC1837330xud4, enumC1837330xud5, enumC1837330xud6, enumC1837330xud7};
        LL = enumC1837330xudArr;
        LLILLJJLI = new C2254308sP(enumC1837330xudArr);
    }

    public static EnumC1837330xud[] values() {
        return (EnumC1837330xud[]) LL.clone();
    }

    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    public static EnumC1837330xud valueOf(String str) {
        return (EnumC1837330xud) C08FF.LIZ(EnumC1837330xud.class, str);
    }

    public EnumC1837330xud(String str, int i) {
    }
}
