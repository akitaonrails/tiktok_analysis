package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2282608wy {
    public static final /* synthetic */ EnumC2282608wy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2282608wy PARAMS;
    public static final EnumC2282608wy REAL_TIME_CONDITION;
    public static final EnumC2282608wy SETTINGS;
    public static final EnumC2282608wy SYNTAX;
    public static final EnumC2282608wy UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2282608wy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2282608wy enumC2282608wy = new EnumC2282608wy("SYNTAX", 0, "syntax");
        SYNTAX = enumC2282608wy;
        EnumC2282608wy enumC2282608wy2 = new EnumC2282608wy("SETTINGS", 1, "settings");
        SETTINGS = enumC2282608wy2;
        EnumC2282608wy enumC2282608wy3 = new EnumC2282608wy("PARAMS", 2, "params");
        PARAMS = enumC2282608wy3;
        EnumC2282608wy enumC2282608wy4 = new EnumC2282608wy("UNKNOWN", 3, "unknown");
        UNKNOWN = enumC2282608wy4;
        EnumC2282608wy enumC2282608wy5 = new EnumC2282608wy("REAL_TIME_CONDITION", 4, "real_time_condition");
        REAL_TIME_CONDITION = enumC2282608wy5;
        EnumC2282608wy[] enumC2282608wyArr = {enumC2282608wy, enumC2282608wy2, enumC2282608wy3, enumC2282608wy4, enumC2282608wy5};
        LLILLJJLI = enumC2282608wyArr;
        LLILLL = new C2254308sP(enumC2282608wyArr);
    }

    public static EnumC2282608wy[] values() {
        return (EnumC2282608wy[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2282608wy valueOf(String str) {
        return (EnumC2282608wy) C08FF.LIZ(EnumC2282608wy.class, str);
    }

    public EnumC2282608wy(String str, int i, String str2) {
        this.LL = str2;
    }
}
