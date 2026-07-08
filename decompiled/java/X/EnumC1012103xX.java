package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03xX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1012103xX {
    public static final EnumC1012103xX ALL_STOCK_OUT;
    public static final EnumC1012103xX AVAILABLE;
    public static final EnumC1012103xX CUR_COMBO_STOCK_OUT;
    public static final /* synthetic */ EnumC1012103xX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1012103xX UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC1012103xX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1012103xX enumC1012103xX = new EnumC1012103xX("UNAVAILABLE", 0);
        UNAVAILABLE = enumC1012103xX;
        EnumC1012103xX enumC1012103xX2 = new EnumC1012103xX("AVAILABLE", 1);
        AVAILABLE = enumC1012103xX2;
        EnumC1012103xX enumC1012103xX3 = new EnumC1012103xX("CUR_COMBO_STOCK_OUT", 2);
        CUR_COMBO_STOCK_OUT = enumC1012103xX3;
        EnumC1012103xX enumC1012103xX4 = new EnumC1012103xX("ALL_STOCK_OUT", 3);
        ALL_STOCK_OUT = enumC1012103xX4;
        EnumC1012103xX[] enumC1012103xXArr = {enumC1012103xX, enumC1012103xX2, enumC1012103xX3, enumC1012103xX4};
        LL = enumC1012103xXArr;
        LLILLJJLI = new C2254308sP(enumC1012103xXArr);
    }

    public static EnumC1012103xX[] values() {
        return (EnumC1012103xX[]) LL.clone();
    }

    public static EnumC1012103xX valueOf(String str) {
        return (EnumC1012103xX) C08FF.LIZ(EnumC1012103xX.class, str);
    }

    public EnumC1012103xX(String str, int i) {
    }
}
