package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.043i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC10360043i {
    public static final EnumC10360043i ALL_STOCK_OUT;
    public static final EnumC10360043i AVAILABLE;
    public static final EnumC10360043i CUR_COMBO_STOCK_OUT;
    public static final /* synthetic */ EnumC10360043i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC10360043i UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC10360043i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC10360043i enumC10360043i = new EnumC10360043i("UNAVAILABLE", 0);
        UNAVAILABLE = enumC10360043i;
        EnumC10360043i enumC10360043i2 = new EnumC10360043i("AVAILABLE", 1);
        AVAILABLE = enumC10360043i2;
        EnumC10360043i enumC10360043i3 = new EnumC10360043i("CUR_COMBO_STOCK_OUT", 2);
        CUR_COMBO_STOCK_OUT = enumC10360043i3;
        EnumC10360043i enumC10360043i4 = new EnumC10360043i("ALL_STOCK_OUT", 3);
        ALL_STOCK_OUT = enumC10360043i4;
        EnumC10360043i[] enumC10360043iArr = {enumC10360043i, enumC10360043i2, enumC10360043i3, enumC10360043i4};
        LL = enumC10360043iArr;
        LLILLJJLI = new C2254308sP(enumC10360043iArr);
    }

    public static EnumC10360043i[] values() {
        return (EnumC10360043i[]) LL.clone();
    }

    public static EnumC10360043i valueOf(String str) {
        return (EnumC10360043i) C08FF.LIZ(EnumC10360043i.class, str);
    }

    public EnumC10360043i(String str, int i) {
    }
}
