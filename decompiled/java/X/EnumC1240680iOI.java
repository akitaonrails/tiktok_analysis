package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iOI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1240680iOI {
    public static final /* synthetic */ EnumC1240680iOI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1240680iOI MAF;
    public static final EnumC1240680iOI RECENT;
    public static final EnumC1240680iOI RESULT;
    public static final EnumC1240680iOI SUGGESTED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1240680iOI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1240680iOI enumC1240680iOI = new EnumC1240680iOI("RECENT", 0, "recent");
        RECENT = enumC1240680iOI;
        EnumC1240680iOI enumC1240680iOI2 = new EnumC1240680iOI("SUGGESTED", 1, "suggested");
        SUGGESTED = enumC1240680iOI2;
        EnumC1240680iOI enumC1240680iOI3 = new EnumC1240680iOI("RESULT", 2, "result");
        RESULT = enumC1240680iOI3;
        EnumC1240680iOI enumC1240680iOI4 = new EnumC1240680iOI("MAF", 3, "maf");
        MAF = enumC1240680iOI4;
        EnumC1240680iOI[] enumC1240680iOIArr = {enumC1240680iOI, enumC1240680iOI2, enumC1240680iOI3, enumC1240680iOI4};
        LLILLJJLI = enumC1240680iOIArr;
        LLILLL = new C2254308sP(enumC1240680iOIArr);
    }

    public static EnumC1240680iOI[] values() {
        return (EnumC1240680iOI[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1240680iOI valueOf(String str) {
        return (EnumC1240680iOI) C08FF.LIZ(EnumC1240680iOI.class, str);
    }

    public EnumC1240680iOI(String str, int i, String str2) {
        this.LL = str2;
    }
}
