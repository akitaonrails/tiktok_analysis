package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qA8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1539420qA8 {
    public static final EnumC1539420qA8 GLOBAL_PROPS;
    public static final EnumC1539420qA8 INIT_DATA;
    public static final /* synthetic */ EnumC1539420qA8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1539420qA8 RUNTIME_INFO;
    public static final EnumC1539420qA8 SYSTEM_INFO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1539420qA8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1539420qA8 enumC1539420qA8 = new EnumC1539420qA8("GLOBAL_PROPS", 0, "global_props");
        GLOBAL_PROPS = enumC1539420qA8;
        EnumC1539420qA8 enumC1539420qA82 = new EnumC1539420qA8("SYSTEM_INFO", 1, "system_info");
        SYSTEM_INFO = enumC1539420qA82;
        EnumC1539420qA8 enumC1539420qA83 = new EnumC1539420qA8("INIT_DATA", 2, "init_data");
        INIT_DATA = enumC1539420qA83;
        EnumC1539420qA8 enumC1539420qA84 = new EnumC1539420qA8("RUNTIME_INFO", 3, "runtime_info");
        RUNTIME_INFO = enumC1539420qA84;
        EnumC1539420qA8[] enumC1539420qA8Arr = {enumC1539420qA8, enumC1539420qA82, enumC1539420qA83, enumC1539420qA84};
        LLILLJJLI = enumC1539420qA8Arr;
        LLILLL = new C2254308sP(enumC1539420qA8Arr);
    }

    public static EnumC1539420qA8[] values() {
        return (EnumC1539420qA8[]) LLILLJJLI.clone();
    }

    public final String getString() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC1539420qA8 valueOf(String str) {
        return (EnumC1539420qA8) C08FF.LIZ(EnumC1539420qA8.class, str);
    }

    public EnumC1539420qA8(String str, int i, String str2) {
        this.LL = str2;
    }
}
