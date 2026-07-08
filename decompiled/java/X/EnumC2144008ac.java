package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08ac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2144008ac {
    public static final EnumC2144008ac CORE_FUNCTION;
    public static final EnumC2144008ac DEBUG_TOOL;
    public static final EnumC2144008ac DEV_APP;
    public static final EnumC2144008ac LABORATORY;
    public static final /* synthetic */ EnumC2144008ac[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2144008ac MONITOR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2144008ac> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2144008ac enumC2144008ac = new EnumC2144008ac("DEV_APP", 0, "Pluggable");
        DEV_APP = enumC2144008ac;
        EnumC2144008ac enumC2144008ac2 = new EnumC2144008ac("LABORATORY", 1, "Optional Shutdown Function");
        LABORATORY = enumC2144008ac2;
        EnumC2144008ac enumC2144008ac3 = new EnumC2144008ac("CORE_FUNCTION", 2, "Business Function");
        CORE_FUNCTION = enumC2144008ac3;
        EnumC2144008ac enumC2144008ac4 = new EnumC2144008ac("MONITOR", 3, "Monitor");
        MONITOR = enumC2144008ac4;
        EnumC2144008ac enumC2144008ac5 = new EnumC2144008ac("DEBUG_TOOL", 4, "Debug Tool");
        DEBUG_TOOL = enumC2144008ac5;
        EnumC2144008ac[] enumC2144008acArr = {enumC2144008ac, enumC2144008ac2, enumC2144008ac3, enumC2144008ac4, enumC2144008ac5};
        LLILLJJLI = enumC2144008acArr;
        LLILLL = new C2254308sP(enumC2144008acArr);
    }

    public static EnumC2144008ac[] values() {
        return (EnumC2144008ac[]) LLILLJJLI.clone();
    }

    public final String getTitle() {
        return this.LL;
    }

    public static EnumC2144008ac valueOf(String str) {
        return (EnumC2144008ac) C08FF.LIZ(EnumC2144008ac.class, str);
    }

    public EnumC2144008ac(String str, int i, String str2) {
        this.LL = str2;
    }
}
