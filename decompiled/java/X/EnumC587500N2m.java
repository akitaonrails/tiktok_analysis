package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587500N2m {
    public static final EnumC587500N2m COMMERCIALIZE_PRODUCT_CARD;
    public static final EnumC587500N2m EC_UG_PRODUCT_CARD;
    public static final /* synthetic */ EnumC587500N2m[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC587500N2m> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587500N2m enumC587500N2m = new EnumC587500N2m("COMMERCIALIZE_PRODUCT_CARD", 0, 1);
        COMMERCIALIZE_PRODUCT_CARD = enumC587500N2m;
        EnumC587500N2m enumC587500N2m2 = new EnumC587500N2m("EC_UG_PRODUCT_CARD", 1, 2);
        EC_UG_PRODUCT_CARD = enumC587500N2m2;
        EnumC587500N2m[] enumC587500N2mArr = {enumC587500N2m, enumC587500N2m2};
        LLILLJJLI = enumC587500N2mArr;
        LLILLL = new C2254308sP(enumC587500N2mArr);
    }

    public static EnumC587500N2m[] values() {
        return (EnumC587500N2m[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC587500N2m valueOf(String str) {
        return (EnumC587500N2m) C08FF.LIZ(EnumC587500N2m.class, str);
    }

    public EnumC587500N2m(String str, int i, int i2) {
        this.LL = i2;
    }
}
