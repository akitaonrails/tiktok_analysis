package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Uc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC775860Uc4 {
    public static final C775850Uc3 Companion;
    public static final EnumC775860Uc4 HEAVY;
    public static final EnumC775860Uc4 LIGHT;
    public static final /* synthetic */ EnumC775860Uc4[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC775860Uc4 MEDIUM;
    public static final EnumC775860Uc4 NONE;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC775860Uc4> getEntries() {
        return LLILZ;
    }

    static {
        EnumC775860Uc4 enumC775860Uc4 = new EnumC775860Uc4("NONE", 0, "none", 0);
        NONE = enumC775860Uc4;
        EnumC775860Uc4 enumC775860Uc42 = new EnumC775860Uc4("LIGHT", 1, "light", 1);
        LIGHT = enumC775860Uc42;
        EnumC775860Uc4 enumC775860Uc43 = new EnumC775860Uc4("MEDIUM", 2, "medium", 2);
        MEDIUM = enumC775860Uc43;
        EnumC775860Uc4 enumC775860Uc44 = new EnumC775860Uc4("HEAVY", 3, "heavy", 3);
        HEAVY = enumC775860Uc44;
        EnumC775860Uc4[] enumC775860Uc4Arr = {enumC775860Uc4, enumC775860Uc42, enumC775860Uc43, enumC775860Uc44};
        LLILLL = enumC775860Uc4Arr;
        LLILZ = new C2254308sP(enumC775860Uc4Arr);
        Companion = new C775850Uc3();
    }

    public static EnumC775860Uc4[] values() {
        return (EnumC775860Uc4[]) LLILLL.clone();
    }

    public final String getLevelName() {
        return this.LL;
    }

    public final int getLevelValue() {
        return this.LLILLJJLI;
    }

    public static EnumC775860Uc4 valueOf(String str) {
        return (EnumC775860Uc4) C08FF.LIZ(EnumC775860Uc4.class, str);
    }

    public EnumC775860Uc4(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
