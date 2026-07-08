package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.042z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC10351042z {
    public static final EnumC10351042z ADD_TO_CART;
    public static final EnumC10351042z BUY_NOW;
    public static final EnumC10351042z CONFIRM;
    public static final /* synthetic */ EnumC10351042z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC10351042z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC10351042z enumC10351042z = new EnumC10351042z("ADD_TO_CART", 0, 0);
        ADD_TO_CART = enumC10351042z;
        EnumC10351042z enumC10351042z2 = new EnumC10351042z("BUY_NOW", 1, 1);
        BUY_NOW = enumC10351042z2;
        EnumC10351042z enumC10351042z3 = new EnumC10351042z("CONFIRM", 2, 3);
        CONFIRM = enumC10351042z3;
        EnumC10351042z[] enumC10351042zArr = {enumC10351042z, enumC10351042z2, enumC10351042z3};
        LLILLJJLI = enumC10351042zArr;
        LLILLL = new C2254308sP(enumC10351042zArr);
    }

    public static EnumC10351042z[] values() {
        return (EnumC10351042z[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC10351042z valueOf(String str) {
        return (EnumC10351042z) C08FF.LIZ(EnumC10351042z.class, str);
    }

    public EnumC10351042z(String str, int i, int i2) {
        this.LL = i2;
    }
}
