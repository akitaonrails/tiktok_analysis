package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dmZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1063530dmZ {
    public static final /* synthetic */ EnumC1063530dmZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1063530dmZ PRIVATE;
    public static final EnumC1063530dmZ PROTECT;
    public static final EnumC1063530dmZ PUBLIC;
    public static final EnumC1063530dmZ SECURE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1063530dmZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1063530dmZ enumC1063530dmZ = new EnumC1063530dmZ("PUBLIC", 0, "public");
        PUBLIC = enumC1063530dmZ;
        EnumC1063530dmZ enumC1063530dmZ2 = new EnumC1063530dmZ("PRIVATE", 1, "private");
        PRIVATE = enumC1063530dmZ2;
        EnumC1063530dmZ enumC1063530dmZ3 = new EnumC1063530dmZ("PROTECT", 2, "protect");
        PROTECT = enumC1063530dmZ3;
        EnumC1063530dmZ enumC1063530dmZ4 = new EnumC1063530dmZ("SECURE", 3, "secure");
        SECURE = enumC1063530dmZ4;
        EnumC1063530dmZ[] enumC1063530dmZArr = {enumC1063530dmZ, enumC1063530dmZ2, enumC1063530dmZ3, enumC1063530dmZ4};
        LLILLJJLI = enumC1063530dmZArr;
        LLILLL = new C2254308sP(enumC1063530dmZArr);
    }

    public static EnumC1063530dmZ[] values() {
        return (EnumC1063530dmZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1063530dmZ valueOf(String str) {
        return (EnumC1063530dmZ) C08FF.LIZ(EnumC1063530dmZ.class, str);
    }

    public EnumC1063530dmZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
