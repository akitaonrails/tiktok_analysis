package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vFB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1734750vFB {
    public static final EnumC1734750vFB COUNTRY;
    public static final C1734930vFT Companion;
    public static final /* synthetic */ EnumC1734750vFB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1734750vFB PHONE;
    public static final EnumC1734750vFB SIMPLE_TEXT;
    public static final EnumC1734750vFB SINGLE_SELECT;
    public static final EnumC1734750vFB UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1734750vFB> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0vFT] */
    static {
        EnumC1734750vFB enumC1734750vFB = new EnumC1734750vFB("UNKNOWN", 0, 0);
        UNKNOWN = enumC1734750vFB;
        EnumC1734750vFB enumC1734750vFB2 = new EnumC1734750vFB("SIMPLE_TEXT", 1, 1);
        SIMPLE_TEXT = enumC1734750vFB2;
        EnumC1734750vFB enumC1734750vFB3 = new EnumC1734750vFB("SINGLE_SELECT", 2, 2);
        SINGLE_SELECT = enumC1734750vFB3;
        EnumC1734750vFB enumC1734750vFB4 = new EnumC1734750vFB("COUNTRY", 3, 3);
        COUNTRY = enumC1734750vFB4;
        EnumC1734750vFB enumC1734750vFB5 = new EnumC1734750vFB("PHONE", 4, 4);
        PHONE = enumC1734750vFB5;
        EnumC1734750vFB[] enumC1734750vFBArr = {enumC1734750vFB, enumC1734750vFB2, enumC1734750vFB3, enumC1734750vFB4, enumC1734750vFB5};
        LLILLJJLI = enumC1734750vFBArr;
        LLILLL = new C2254308sP(enumC1734750vFBArr);
        Companion = new Object() { // from class: X.0vFT
        };
    }

    public static EnumC1734750vFB[] values() {
        return (EnumC1734750vFB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1734750vFB valueOf(String str) {
        return (EnumC1734750vFB) C08FF.LIZ(EnumC1734750vFB.class, str);
    }

    public EnumC1734750vFB(String str, int i, int i2) {
        this.LL = i2;
    }
}
