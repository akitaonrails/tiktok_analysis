package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Uc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC775910Uc9 {
    public static final EnumC775910Uc9 AV;
    public static final EnumC775910Uc9 BASE_CAPABILITY;
    public static final EnumC775910Uc9 LINK_MIC;
    public static final /* synthetic */ EnumC775910Uc9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC775910Uc9 PUBLIC_SCREEN;
    public static final EnumC775910Uc9 REACH;
    public static final EnumC775910Uc9 REVENUE;
    public static final EnumC775910Uc9 ROOM_FUNCTION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC775910Uc9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC775910Uc9 enumC775910Uc9 = new EnumC775910Uc9("REVENUE", 0, "revenue");
        REVENUE = enumC775910Uc9;
        EnumC775910Uc9 enumC775910Uc92 = new EnumC775910Uc9("LINK_MIC", 1, "linkmic");
        LINK_MIC = enumC775910Uc92;
        EnumC775910Uc9 enumC775910Uc93 = new EnumC775910Uc9("PUBLIC_SCREEN", 2, "public_screen");
        PUBLIC_SCREEN = enumC775910Uc93;
        EnumC775910Uc9 enumC775910Uc94 = new EnumC775910Uc9("REACH", 3, "reach");
        REACH = enumC775910Uc94;
        EnumC775910Uc9 enumC775910Uc95 = new EnumC775910Uc9("BASE_CAPABILITY", 4, "base_capability");
        BASE_CAPABILITY = enumC775910Uc95;
        EnumC775910Uc9 enumC775910Uc96 = new EnumC775910Uc9("ROOM_FUNCTION", 5, "room_function");
        ROOM_FUNCTION = enumC775910Uc96;
        EnumC775910Uc9 enumC775910Uc97 = new EnumC775910Uc9("AV", 6, "av");
        AV = enumC775910Uc97;
        EnumC775910Uc9[] enumC775910Uc9Arr = {enumC775910Uc9, enumC775910Uc92, enumC775910Uc93, enumC775910Uc94, enumC775910Uc95, enumC775910Uc96, enumC775910Uc97};
        LLILLJJLI = enumC775910Uc9Arr;
        LLILLL = new C2254308sP(enumC775910Uc9Arr);
    }

    public static EnumC775910Uc9[] values() {
        return (EnumC775910Uc9[]) LLILLJJLI.clone();
    }

    public final String getModuleName() {
        return this.LL;
    }

    public static EnumC775910Uc9 valueOf(String str) {
        return (EnumC775910Uc9) C08FF.LIZ(EnumC775910Uc9.class, str);
    }

    public EnumC775910Uc9(String str, int i, String str2) {
        this.LL = str2;
    }
}
