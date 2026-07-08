package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ghL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1175610ghL {
    public static final /* synthetic */ EnumC1175610ghL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1175610ghL USER_CITY_STATUS_BEFORE_TRAVEL;
    public static final EnumC1175610ghL USER_CITY_STATUS_IN_TRAVEL;
    public static final EnumC1175610ghL USER_CITY_STATUS_LOCAL;
    public static final EnumC1175610ghL USER_CITY_STATUS_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1175610ghL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1175610ghL enumC1175610ghL = new EnumC1175610ghL("USER_CITY_STATUS_UNKNOWN", 0, 0);
        USER_CITY_STATUS_UNKNOWN = enumC1175610ghL;
        EnumC1175610ghL enumC1175610ghL2 = new EnumC1175610ghL("USER_CITY_STATUS_LOCAL", 1, 1);
        USER_CITY_STATUS_LOCAL = enumC1175610ghL2;
        EnumC1175610ghL enumC1175610ghL3 = new EnumC1175610ghL("USER_CITY_STATUS_BEFORE_TRAVEL", 2, 2);
        USER_CITY_STATUS_BEFORE_TRAVEL = enumC1175610ghL3;
        EnumC1175610ghL enumC1175610ghL4 = new EnumC1175610ghL("USER_CITY_STATUS_IN_TRAVEL", 3, 3);
        USER_CITY_STATUS_IN_TRAVEL = enumC1175610ghL4;
        EnumC1175610ghL[] enumC1175610ghLArr = {enumC1175610ghL, enumC1175610ghL2, enumC1175610ghL3, enumC1175610ghL4};
        LLILLJJLI = enumC1175610ghLArr;
        LLILLL = new C2254308sP(enumC1175610ghLArr);
    }

    public static EnumC1175610ghL[] values() {
        return (EnumC1175610ghL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1175610ghL valueOf(String str) {
        return (EnumC1175610ghL) C08FF.LIZ(EnumC1175610ghL.class, str);
    }

    public EnumC1175610ghL(String str, int i, int i2) {
        this.LL = i2;
    }
}
