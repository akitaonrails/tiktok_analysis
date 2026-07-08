package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wtF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1798030wtF {
    public static final EnumC1798030wtF ACCOUNT_SWITCHED;
    public static final EnumC1798030wtF COUNTRY_UPDATED;
    public static final C1798020wtE Companion;
    public static final EnumC1798030wtF FOREGROUND;
    public static final EnumC1798030wtF GP_REGION_CHANGED;
    public static final EnumC1798030wtF IP_LOCATION_UPDATED;
    public static final /* synthetic */ EnumC1798030wtF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1798030wtF LOG_IN;
    public static final EnumC1798030wtF LOG_OUT;
    public static final EnumC1798030wtF UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1798030wtF> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0wtE] */
    static {
        EnumC1798030wtF enumC1798030wtF = new EnumC1798030wtF("IP_LOCATION_UPDATED", 0, "ip_location_update");
        IP_LOCATION_UPDATED = enumC1798030wtF;
        EnumC1798030wtF enumC1798030wtF2 = new EnumC1798030wtF("GP_REGION_CHANGED", 1, "gp_region_changed");
        GP_REGION_CHANGED = enumC1798030wtF2;
        EnumC1798030wtF enumC1798030wtF3 = new EnumC1798030wtF("ACCOUNT_SWITCHED", 2, "account_switched");
        ACCOUNT_SWITCHED = enumC1798030wtF3;
        EnumC1798030wtF enumC1798030wtF4 = new EnumC1798030wtF("COUNTRY_UPDATED", 3, "country_updated");
        COUNTRY_UPDATED = enumC1798030wtF4;
        EnumC1798030wtF enumC1798030wtF5 = new EnumC1798030wtF("LOG_IN", 4, "log_in");
        LOG_IN = enumC1798030wtF5;
        EnumC1798030wtF enumC1798030wtF6 = new EnumC1798030wtF("LOG_OUT", 5, "log_out");
        LOG_OUT = enumC1798030wtF6;
        EnumC1798030wtF enumC1798030wtF7 = new EnumC1798030wtF("FOREGROUND", 6, "foreground");
        FOREGROUND = enumC1798030wtF7;
        EnumC1798030wtF enumC1798030wtF8 = new EnumC1798030wtF("UNKNOWN", 7, null);
        UNKNOWN = enumC1798030wtF8;
        EnumC1798030wtF[] enumC1798030wtFArr = {enumC1798030wtF, enumC1798030wtF2, enumC1798030wtF3, enumC1798030wtF4, enumC1798030wtF5, enumC1798030wtF6, enumC1798030wtF7, enumC1798030wtF8};
        LLILLJJLI = enumC1798030wtFArr;
        LLILLL = new C2254308sP(enumC1798030wtFArr);
        Companion = new Object() { // from class: X.0wtE
        };
    }

    public static EnumC1798030wtF[] values() {
        return (EnumC1798030wtF[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1798030wtF valueOf(String str) {
        return (EnumC1798030wtF) C08FF.LIZ(EnumC1798030wtF.class, str);
    }

    public EnumC1798030wtF(String str, int i, String str2) {
        this.LL = str2;
    }
}
