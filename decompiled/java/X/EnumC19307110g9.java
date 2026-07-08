package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10g9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19307110g9 {
    public static final EnumC19307110g9 FIVE_SCREEN;
    public static final EnumC19307110g9 FULL_SCREEN;
    public static final /* synthetic */ EnumC19307110g9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19307110g9 NINE_SCREEN;
    public static final EnumC19307110g9 SEVEN_SCREEN;

    public static InterfaceC2044707zh<EnumC19307110g9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19307110g9 enumC19307110g9 = new EnumC19307110g9("FULL_SCREEN", 0);
        FULL_SCREEN = enumC19307110g9;
        EnumC19307110g9 enumC19307110g92 = new EnumC19307110g9("NINE_SCREEN", 1);
        NINE_SCREEN = enumC19307110g92;
        EnumC19307110g9 enumC19307110g93 = new EnumC19307110g9("SEVEN_SCREEN", 2);
        SEVEN_SCREEN = enumC19307110g93;
        EnumC19307110g9 enumC19307110g94 = new EnumC19307110g9("FIVE_SCREEN", 3);
        FIVE_SCREEN = enumC19307110g94;
        EnumC19307110g9[] enumC19307110g9Arr = {enumC19307110g9, enumC19307110g92, enumC19307110g93, enumC19307110g94};
        LL = enumC19307110g9Arr;
        LLILLJJLI = new C2254308sP(enumC19307110g9Arr);
    }

    public static EnumC19307110g9[] values() {
        return (EnumC19307110g9[]) LL.clone();
    }

    public static EnumC19307110g9 valueOf(String str) {
        return (EnumC19307110g9) C08FF.LIZ(EnumC19307110g9.class, str);
    }

    public EnumC19307110g9(String str, int i) {
    }
}
