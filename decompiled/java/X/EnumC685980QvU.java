package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC685980QvU {
    public static final EnumC685980QvU LIVE;
    public static final /* synthetic */ EnumC685980QvU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC685980QvU MULTI_PRODUCTS;
    public static final EnumC685980QvU OP;
    public static final EnumC685980QvU PRODUCT;
    public static final EnumC685980QvU VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC685980QvU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC685980QvU enumC685980QvU = new EnumC685980QvU("PRODUCT", 0, 1);
        PRODUCT = enumC685980QvU;
        EnumC685980QvU enumC685980QvU2 = new EnumC685980QvU("LIVE", 1, 2);
        LIVE = enumC685980QvU2;
        EnumC685980QvU enumC685980QvU3 = new EnumC685980QvU("VIDEO", 2, 3);
        VIDEO = enumC685980QvU3;
        EnumC685980QvU enumC685980QvU4 = new EnumC685980QvU("OP", 3, 4);
        OP = enumC685980QvU4;
        EnumC685980QvU enumC685980QvU5 = new EnumC685980QvU("MULTI_PRODUCTS", 4, 5);
        MULTI_PRODUCTS = enumC685980QvU5;
        EnumC685980QvU[] enumC685980QvUArr = {enumC685980QvU, enumC685980QvU2, enumC685980QvU3, enumC685980QvU4, enumC685980QvU5};
        LLILLJJLI = enumC685980QvUArr;
        LLILLL = new C2254308sP(enumC685980QvUArr);
    }

    public static EnumC685980QvU[] values() {
        return (EnumC685980QvU[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC685980QvU valueOf(String str) {
        return (EnumC685980QvU) C08FF.LIZ(EnumC685980QvU.class, str);
    }

    public EnumC685980QvU(String str, int i, int i2) {
        this.LL = i2;
    }
}
