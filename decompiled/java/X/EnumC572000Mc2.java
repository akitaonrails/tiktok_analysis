package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC572000Mc2 {
    public static final EnumC572000Mc2 BLANK;
    public static final /* synthetic */ EnumC572000Mc2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC572000Mc2 OUT_OF_LIMIT;
    public static final EnumC572000Mc2 VALID;

    public static InterfaceC2044707zh<EnumC572000Mc2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC572000Mc2 enumC572000Mc2 = new EnumC572000Mc2("VALID", 0);
        VALID = enumC572000Mc2;
        EnumC572000Mc2 enumC572000Mc22 = new EnumC572000Mc2("BLANK", 1);
        BLANK = enumC572000Mc22;
        EnumC572000Mc2 enumC572000Mc23 = new EnumC572000Mc2("OUT_OF_LIMIT", 2);
        OUT_OF_LIMIT = enumC572000Mc23;
        EnumC572000Mc2[] enumC572000Mc2Arr = {enumC572000Mc2, enumC572000Mc22, enumC572000Mc23};
        LL = enumC572000Mc2Arr;
        LLILLJJLI = new C2254308sP(enumC572000Mc2Arr);
    }

    public static EnumC572000Mc2[] values() {
        return (EnumC572000Mc2[]) LL.clone();
    }

    public static EnumC572000Mc2 valueOf(String str) {
        return (EnumC572000Mc2) C08FF.LIZ(EnumC572000Mc2.class, str);
    }

    public EnumC572000Mc2(String str, int i) {
    }
}
