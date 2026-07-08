package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC566320MJa {
    public static final EnumC566320MJa FILTER;
    public static final EnumC566320MJa FLASH;
    public static final /* synthetic */ EnumC566320MJa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC566320MJa M_BEAUTY;
    public static final EnumC566320MJa REVERSE;

    public static InterfaceC2044707zh<EnumC566320MJa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC566320MJa enumC566320MJa = new EnumC566320MJa("REVERSE", 0);
        REVERSE = enumC566320MJa;
        EnumC566320MJa enumC566320MJa2 = new EnumC566320MJa("FLASH", 1);
        FLASH = enumC566320MJa2;
        EnumC566320MJa enumC566320MJa3 = new EnumC566320MJa("FILTER", 2);
        FILTER = enumC566320MJa3;
        EnumC566320MJa enumC566320MJa4 = new EnumC566320MJa("M_BEAUTY", 3);
        M_BEAUTY = enumC566320MJa4;
        EnumC566320MJa[] enumC566320MJaArr = {enumC566320MJa, enumC566320MJa2, enumC566320MJa3, enumC566320MJa4};
        LL = enumC566320MJaArr;
        LLILLJJLI = new C2254308sP(enumC566320MJaArr);
    }

    public static EnumC566320MJa[] values() {
        return (EnumC566320MJa[]) LL.clone();
    }

    public static EnumC566320MJa valueOf(String str) {
        return (EnumC566320MJa) C08FF.LIZ(EnumC566320MJa.class, str);
    }

    public EnumC566320MJa(String str, int i) {
    }
}
