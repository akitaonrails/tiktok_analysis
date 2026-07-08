package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1217060hmC {
    public static final EnumC1217060hmC CREATOR;
    public static final EnumC1217060hmC CUT_PRICE;
    public static final /* synthetic */ EnumC1217060hmC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1217060hmC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1217060hmC enumC1217060hmC = new EnumC1217060hmC("CREATOR", 0, 1);
        CREATOR = enumC1217060hmC;
        EnumC1217060hmC enumC1217060hmC2 = new EnumC1217060hmC("CUT_PRICE", 1, 2);
        CUT_PRICE = enumC1217060hmC2;
        EnumC1217060hmC[] enumC1217060hmCArr = {enumC1217060hmC, enumC1217060hmC2};
        LLILLJJLI = enumC1217060hmCArr;
        LLILLL = new C2254308sP(enumC1217060hmCArr);
    }

    public static EnumC1217060hmC[] values() {
        return (EnumC1217060hmC[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1217060hmC valueOf(String str) {
        return (EnumC1217060hmC) C08FF.LIZ(EnumC1217060hmC.class, str);
    }

    public EnumC1217060hmC(String str, int i, int i2) {
        this.LL = i2;
    }
}
