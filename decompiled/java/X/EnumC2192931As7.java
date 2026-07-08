package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1As7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2192931As7 {
    public static final C2192941As8 Companion;
    public static final EnumC2192931As7 INVALID_API;
    public static final EnumC2192931As7 INVALID_PARAMS;
    public static final /* synthetic */ EnumC2192931As7[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC2192931As7 NONE;
    public static final EnumC2192931As7 SYSTEM_CRASH;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2192931As7> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1As8] */
    static {
        EnumC2192931As7 enumC2192931As7 = new EnumC2192931As7("NONE", 0, 0, "Success");
        NONE = enumC2192931As7;
        EnumC2192931As7 enumC2192931As72 = new EnumC2192931As7("INVALID_API", 1, 10001, "INVALID_API");
        INVALID_API = enumC2192931As72;
        EnumC2192931As7 enumC2192931As73 = new EnumC2192931As7("SYSTEM_CRASH", 2, 10002, "SYSTEM_CRASH");
        SYSTEM_CRASH = enumC2192931As73;
        EnumC2192931As7 enumC2192931As74 = new EnumC2192931As7("INVALID_PARAMS", 3, 1300022, "INVALID_PARAMS");
        INVALID_PARAMS = enumC2192931As74;
        EnumC2192931As7[] enumC2192931As7Arr = {enumC2192931As7, enumC2192931As72, enumC2192931As73, enumC2192931As74};
        LLILLL = enumC2192931As7Arr;
        LLILZ = new C2254308sP(enumC2192931As7Arr);
        Companion = new Object() { // from class: X.1As8
        };
    }

    public static EnumC2192931As7[] values() {
        return (EnumC2192931As7[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMsg() {
        return this.LLILLJJLI;
    }

    public static EnumC2192931As7 valueOf(String str) {
        return (EnumC2192931As7) C08FF.LIZ(EnumC2192931As7.class, str);
    }

    public EnumC2192931As7(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
