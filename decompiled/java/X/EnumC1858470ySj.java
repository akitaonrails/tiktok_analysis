package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ySj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1858470ySj {
    public static final EnumC1858470ySj BLACK_DOUBLE_LINE;
    public static final EnumC1858470ySj BLACK_LARGE;
    public static final EnumC1858470ySj BLACK_SINGLE_LINE;
    public static final EnumC1858470ySj GREY_SINGLE_LINE;
    public static final /* synthetic */ EnumC1858470ySj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1858470ySj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1858470ySj enumC1858470ySj = new EnumC1858470ySj("GREY_SINGLE_LINE", 0);
        GREY_SINGLE_LINE = enumC1858470ySj;
        EnumC1858470ySj enumC1858470ySj2 = new EnumC1858470ySj("BLACK_SINGLE_LINE", 1);
        BLACK_SINGLE_LINE = enumC1858470ySj2;
        EnumC1858470ySj enumC1858470ySj3 = new EnumC1858470ySj("BLACK_LARGE", 2);
        BLACK_LARGE = enumC1858470ySj3;
        EnumC1858470ySj enumC1858470ySj4 = new EnumC1858470ySj("BLACK_DOUBLE_LINE", 3);
        BLACK_DOUBLE_LINE = enumC1858470ySj4;
        EnumC1858470ySj[] enumC1858470ySjArr = {enumC1858470ySj, enumC1858470ySj2, enumC1858470ySj3, enumC1858470ySj4};
        LL = enumC1858470ySjArr;
        LLILLJJLI = new C2254308sP(enumC1858470ySjArr);
    }

    public static EnumC1858470ySj[] values() {
        return (EnumC1858470ySj[]) LL.clone();
    }

    public static EnumC1858470ySj valueOf(String str) {
        return (EnumC1858470ySj) C08FF.LIZ(EnumC1858470ySj.class, str);
    }

    public EnumC1858470ySj(String str, int i) {
    }
}
