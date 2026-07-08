package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624980OfI {
    public static final EnumC624980OfI CLICK_CONTINUE;
    public static final EnumC624980OfI CLICK_DOWNLOAD;
    public static final EnumC624980OfI DEFAULT_ENABLE;
    public static final /* synthetic */ EnumC624980OfI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC624980OfI SYSTEM_RESUME;
    public static final EnumC624980OfI USER_RESUME;
    public final int LL;

    public static InterfaceC2044707zh<EnumC624980OfI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC624980OfI enumC624980OfI = new EnumC624980OfI("CLICK_DOWNLOAD", 0, 0);
        CLICK_DOWNLOAD = enumC624980OfI;
        EnumC624980OfI enumC624980OfI2 = new EnumC624980OfI("USER_RESUME", 1, 1);
        USER_RESUME = enumC624980OfI2;
        EnumC624980OfI enumC624980OfI3 = new EnumC624980OfI("SYSTEM_RESUME", 2, 2);
        SYSTEM_RESUME = enumC624980OfI3;
        EnumC624980OfI enumC624980OfI4 = new EnumC624980OfI("CLICK_CONTINUE", 3, 3);
        CLICK_CONTINUE = enumC624980OfI4;
        EnumC624980OfI enumC624980OfI5 = new EnumC624980OfI("DEFAULT_ENABLE", 4, 4);
        DEFAULT_ENABLE = enumC624980OfI5;
        EnumC624980OfI[] enumC624980OfIArr = {enumC624980OfI, enumC624980OfI2, enumC624980OfI3, enumC624980OfI4, enumC624980OfI5};
        LLILLJJLI = enumC624980OfIArr;
        LLILLL = new C2254308sP(enumC624980OfIArr);
    }

    public static EnumC624980OfI[] values() {
        return (EnumC624980OfI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC624980OfI valueOf(String str) {
        return (EnumC624980OfI) C08FF.LIZ(EnumC624980OfI.class, str);
    }

    public EnumC624980OfI(String str, int i, int i2) {
        this.LL = i2;
    }
}
