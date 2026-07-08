package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ft5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1144450ft5 {
    public static final EnumC1144450ft5 BOOSTING_GLOVES;
    public static final C1144460ft6 Companion;
    public static final EnumC1144450ft5 HAMMER;
    public static final /* synthetic */ EnumC1144450ft5[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1144450ft5 MAGIC_SMOKES;
    public static final EnumC1144450ft5 NO2_BOOSTER;
    public static final EnumC1144450ft5 NO3_BOOSTER;
    public static final EnumC1144450ft5 TIME_EXTENDING;
    public static final EnumC1144450ft5 UNKNOWN;
    public static final EnumC1144450ft5 VAULT_GLOVES;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1144450ft5> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1144450ft5 enumC1144450ft5 = new EnumC1144450ft5("UNKNOWN", 0, 0, "unknown");
        UNKNOWN = enumC1144450ft5;
        EnumC1144450ft5 enumC1144450ft52 = new EnumC1144450ft5("BOOSTING_GLOVES", 1, 1, "boosting_gloves");
        BOOSTING_GLOVES = enumC1144450ft52;
        EnumC1144450ft5 enumC1144450ft53 = new EnumC1144450ft5("MAGIC_SMOKES", 2, 2, "magic_smokes");
        MAGIC_SMOKES = enumC1144450ft53;
        EnumC1144450ft5 enumC1144450ft54 = new EnumC1144450ft5("TIME_EXTENDING", 3, 3, "time_extending");
        TIME_EXTENDING = enumC1144450ft54;
        EnumC1144450ft5 enumC1144450ft55 = new EnumC1144450ft5("HAMMER", 4, 4, "hammer");
        HAMMER = enumC1144450ft55;
        EnumC1144450ft5 enumC1144450ft56 = new EnumC1144450ft5("NO2_BOOSTER", 5, 7, "no2_booster");
        NO2_BOOSTER = enumC1144450ft56;
        EnumC1144450ft5 enumC1144450ft57 = new EnumC1144450ft5("NO3_BOOSTER", 6, 8, "no3_booster");
        NO3_BOOSTER = enumC1144450ft57;
        EnumC1144450ft5 enumC1144450ft58 = new EnumC1144450ft5("VAULT_GLOVES", 7, 9, "vault_gloves");
        VAULT_GLOVES = enumC1144450ft58;
        EnumC1144450ft5[] enumC1144450ft5Arr = {enumC1144450ft5, enumC1144450ft52, enumC1144450ft53, enumC1144450ft54, enumC1144450ft55, enumC1144450ft56, enumC1144450ft57, enumC1144450ft58};
        LLILLL = enumC1144450ft5Arr;
        LLILZ = new C2254308sP(enumC1144450ft5Arr);
        Companion = new C1144460ft6();
    }

    public static EnumC1144450ft5[] values() {
        return (EnumC1144450ft5[]) LLILLL.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public final String getTypeKey() {
        return this.LLILLJJLI;
    }

    public static EnumC1144450ft5 valueOf(String str) {
        return (EnumC1144450ft5) C08FF.LIZ(EnumC1144450ft5.class, str);
    }

    public EnumC1144450ft5(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
