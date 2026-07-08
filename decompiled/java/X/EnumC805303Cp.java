package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC805303Cp {
    public static final EnumC805303Cp EU_MODE;
    public static final EnumC805303Cp LATAM_MODE;
    public static final /* synthetic */ EnumC805303Cp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC805303Cp US_MODE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC805303Cp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC805303Cp enumC805303Cp = new EnumC805303Cp("US_MODE", 0, "1");
        US_MODE = enumC805303Cp;
        EnumC805303Cp enumC805303Cp2 = new EnumC805303Cp("EU_MODE", 1, "2");
        EU_MODE = enumC805303Cp2;
        EnumC805303Cp enumC805303Cp3 = new EnumC805303Cp("LATAM_MODE", 2, "3");
        LATAM_MODE = enumC805303Cp3;
        EnumC805303Cp[] enumC805303CpArr = {enumC805303Cp, enumC805303Cp2, enumC805303Cp3};
        LLILLJJLI = enumC805303CpArr;
        LLILLL = new C2254308sP(enumC805303CpArr);
    }

    public static EnumC805303Cp[] values() {
        return (EnumC805303Cp[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC805303Cp valueOf(String str) {
        return (EnumC805303Cp) C08FF.LIZ(EnumC805303Cp.class, str);
    }

    public EnumC805303Cp(String str, int i, String str2) {
        this.LL = str2;
    }
}
