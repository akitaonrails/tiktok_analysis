package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC776120UcU {
    public static final EnumC776120UcU BEAUTY;
    public static final EnumC776120UcU DIVIDER;
    public static final EnumC776120UcU FILTER;
    public static final EnumC776120UcU FLASH;
    public static final /* synthetic */ EnumC776120UcU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC776120UcU MIC_PERMISSION;
    public static final EnumC776120UcU ONE_CLICK_BEAUTY;
    public static final EnumC776120UcU SWITCH;

    public static InterfaceC2044707zh<EnumC776120UcU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC776120UcU enumC776120UcU = new EnumC776120UcU("SWITCH", 0);
        SWITCH = enumC776120UcU;
        EnumC776120UcU enumC776120UcU2 = new EnumC776120UcU("FLASH", 1);
        FLASH = enumC776120UcU2;
        EnumC776120UcU enumC776120UcU3 = new EnumC776120UcU("FILTER", 2);
        FILTER = enumC776120UcU3;
        EnumC776120UcU enumC776120UcU4 = new EnumC776120UcU("BEAUTY", 3);
        BEAUTY = enumC776120UcU4;
        EnumC776120UcU enumC776120UcU5 = new EnumC776120UcU("ONE_CLICK_BEAUTY", 4);
        ONE_CLICK_BEAUTY = enumC776120UcU5;
        EnumC776120UcU enumC776120UcU6 = new EnumC776120UcU("MIC_PERMISSION", 5);
        MIC_PERMISSION = enumC776120UcU6;
        EnumC776120UcU enumC776120UcU7 = new EnumC776120UcU("DIVIDER", 6);
        DIVIDER = enumC776120UcU7;
        EnumC776120UcU[] enumC776120UcUArr = {enumC776120UcU, enumC776120UcU2, enumC776120UcU3, enumC776120UcU4, enumC776120UcU5, enumC776120UcU6, enumC776120UcU7};
        LL = enumC776120UcUArr;
        LLILLJJLI = new C2254308sP(enumC776120UcUArr);
    }

    public static EnumC776120UcU[] values() {
        return (EnumC776120UcU[]) LL.clone();
    }

    public static EnumC776120UcU valueOf(String str) {
        return (EnumC776120UcU) C08FF.LIZ(EnumC776120UcU.class, str);
    }

    public EnumC776120UcU(String str, int i) {
    }
}
