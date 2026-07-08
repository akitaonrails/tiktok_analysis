package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC677800QiI {
    public static final EnumC677800QiI ERROR;
    public static final /* synthetic */ EnumC677800QiI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC677800QiI LOADING;
    public static final EnumC677800QiI NO_MORE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC677800QiI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC677800QiI enumC677800QiI = new EnumC677800QiI("LOADING", 0, 1);
        LOADING = enumC677800QiI;
        EnumC677800QiI enumC677800QiI2 = new EnumC677800QiI("NO_MORE", 1, 2);
        NO_MORE = enumC677800QiI2;
        EnumC677800QiI enumC677800QiI3 = new EnumC677800QiI("ERROR", 2, 3);
        ERROR = enumC677800QiI3;
        EnumC677800QiI[] enumC677800QiIArr = {enumC677800QiI, enumC677800QiI2, enumC677800QiI3};
        LLILLJJLI = enumC677800QiIArr;
        LLILLL = new C2254308sP(enumC677800QiIArr);
    }

    public static EnumC677800QiI[] values() {
        return (EnumC677800QiI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC677800QiI valueOf(String str) {
        return (EnumC677800QiI) C08FF.LIZ(EnumC677800QiI.class, str);
    }

    public EnumC677800QiI(String str, int i, int i2) {
        this.LL = i2;
    }
}
