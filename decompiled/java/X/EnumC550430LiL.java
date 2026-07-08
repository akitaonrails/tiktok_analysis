package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LiL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC550430LiL {
    public static final /* synthetic */ EnumC550430LiL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC550430LiL MANUAL;
    public static final EnumC550430LiL PRESET;
    public static final EnumC550430LiL PRESET_MODIFIED;
    public static final EnumC550430LiL UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC550430LiL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC550430LiL enumC550430LiL = new EnumC550430LiL("PRESET", 0, "preset");
        PRESET = enumC550430LiL;
        EnumC550430LiL enumC550430LiL2 = new EnumC550430LiL("MANUAL", 1, "manual");
        MANUAL = enumC550430LiL2;
        EnumC550430LiL enumC550430LiL3 = new EnumC550430LiL("PRESET_MODIFIED", 2, "preset_modified");
        PRESET_MODIFIED = enumC550430LiL3;
        EnumC550430LiL enumC550430LiL4 = new EnumC550430LiL("UNKNOWN", 3, "unknown");
        UNKNOWN = enumC550430LiL4;
        EnumC550430LiL[] enumC550430LiLArr = {enumC550430LiL, enumC550430LiL2, enumC550430LiL3, enumC550430LiL4};
        LLILLJJLI = enumC550430LiLArr;
        LLILLL = new C2254308sP(enumC550430LiLArr);
    }

    public static EnumC550430LiL[] values() {
        return (EnumC550430LiL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC550430LiL valueOf(String str) {
        return (EnumC550430LiL) C08FF.LIZ(EnumC550430LiL.class, str);
    }

    public EnumC550430LiL(String str, int i, String str2) {
        this.LL = str2;
    }
}
