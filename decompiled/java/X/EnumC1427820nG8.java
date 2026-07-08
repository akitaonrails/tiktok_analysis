package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1427820nG8 {
    public static final EnumC1427820nG8 Auto;
    public static final EnumC1427820nG8 Dark;
    public static final /* synthetic */ EnumC1427820nG8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1427820nG8 Light;

    public static InterfaceC2044707zh<EnumC1427820nG8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1427820nG8 enumC1427820nG8 = new EnumC1427820nG8("Dark", 0);
        Dark = enumC1427820nG8;
        EnumC1427820nG8 enumC1427820nG82 = new EnumC1427820nG8("Light", 1);
        Light = enumC1427820nG82;
        EnumC1427820nG8 enumC1427820nG83 = new EnumC1427820nG8("Auto", 2);
        Auto = enumC1427820nG83;
        EnumC1427820nG8[] enumC1427820nG8Arr = {enumC1427820nG8, enumC1427820nG82, enumC1427820nG83};
        LL = enumC1427820nG8Arr;
        LLILLJJLI = new C2254308sP(enumC1427820nG8Arr);
    }

    public static EnumC1427820nG8[] values() {
        return (EnumC1427820nG8[]) LL.clone();
    }

    public static EnumC1427820nG8 valueOf(String str) {
        return (EnumC1427820nG8) C08FF.LIZ(EnumC1427820nG8.class, str);
    }

    public EnumC1427820nG8(String str, int i) {
    }
}
