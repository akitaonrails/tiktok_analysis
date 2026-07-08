package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1094650eal {
    public static final EnumC1094650eal LANDSCAPE;
    public static final /* synthetic */ EnumC1094650eal[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1094650eal PORTRAIT;

    public static InterfaceC2044707zh<EnumC1094650eal> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1094650eal enumC1094650eal = new EnumC1094650eal("PORTRAIT", 0);
        PORTRAIT = enumC1094650eal;
        EnumC1094650eal enumC1094650eal2 = new EnumC1094650eal("LANDSCAPE", 1);
        LANDSCAPE = enumC1094650eal2;
        EnumC1094650eal[] enumC1094650ealArr = {enumC1094650eal, enumC1094650eal2};
        LL = enumC1094650ealArr;
        LLILLJJLI = new C2254308sP(enumC1094650ealArr);
    }

    public static EnumC1094650eal[] values() {
        return (EnumC1094650eal[]) LL.clone();
    }

    public static EnumC1094650eal valueOf(String str) {
        return (EnumC1094650eal) C08FF.LIZ(EnumC1094650eal.class, str);
    }

    public EnumC1094650eal(String str, int i) {
    }
}
