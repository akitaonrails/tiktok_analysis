package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC220700tB {
    public static final EnumC220700tB CACHE;
    public static final /* synthetic */ EnumC220700tB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC220700tB NETWORK;
    public final int LL;

    public static InterfaceC2044707zh<EnumC220700tB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC220700tB enumC220700tB = new EnumC220700tB("CACHE", 0, 1);
        CACHE = enumC220700tB;
        EnumC220700tB enumC220700tB2 = new EnumC220700tB("NETWORK", 1, 2);
        NETWORK = enumC220700tB2;
        EnumC220700tB[] enumC220700tBArr = {enumC220700tB, enumC220700tB2};
        LLILLJJLI = enumC220700tBArr;
        LLILLL = new C2254308sP(enumC220700tBArr);
    }

    public static EnumC220700tB[] values() {
        return (EnumC220700tB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC220700tB valueOf(String str) {
        return (EnumC220700tB) C08FF.LIZ(EnumC220700tB.class, str);
    }

    public EnumC220700tB(String str, int i, int i2) {
        this.LL = i2;
    }
}
