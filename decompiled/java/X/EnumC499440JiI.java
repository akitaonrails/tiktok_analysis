package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC499440JiI {
    public static final EnumC499440JiI GENERAL;
    public static final /* synthetic */ EnumC499440JiI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC499440JiI PRIVILEGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC499440JiI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC499440JiI enumC499440JiI = new EnumC499440JiI("GENERAL", 0, "general");
        GENERAL = enumC499440JiI;
        EnumC499440JiI enumC499440JiI2 = new EnumC499440JiI("PRIVILEGE", 1, "privilege");
        PRIVILEGE = enumC499440JiI2;
        EnumC499440JiI[] enumC499440JiIArr = {enumC499440JiI, enumC499440JiI2};
        LLILLJJLI = enumC499440JiIArr;
        LLILLL = new C2254308sP(enumC499440JiIArr);
    }

    public static EnumC499440JiI[] values() {
        return (EnumC499440JiI[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC499440JiI valueOf(String str) {
        return (EnumC499440JiI) C08FF.LIZ(EnumC499440JiI.class, str);
    }

    public EnumC499440JiI(String str, int i, String str2) {
        this.LL = str2;
    }
}
