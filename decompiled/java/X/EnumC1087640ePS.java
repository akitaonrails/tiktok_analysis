package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ePS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1087640ePS {
    public static final EnumC1087640ePS LEVEL_CRITICAL;
    public static final EnumC1087640ePS LEVEL_HIGH;
    public static final EnumC1087640ePS LEVEL_NORMAL;
    public static final EnumC1087640ePS LEVEL_SERIOUS;
    public static final /* synthetic */ EnumC1087640ePS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1087640ePS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1087640ePS enumC1087640ePS = new EnumC1087640ePS("LEVEL_CRITICAL", 0);
        LEVEL_CRITICAL = enumC1087640ePS;
        EnumC1087640ePS enumC1087640ePS2 = new EnumC1087640ePS("LEVEL_SERIOUS", 1);
        LEVEL_SERIOUS = enumC1087640ePS2;
        EnumC1087640ePS enumC1087640ePS3 = new EnumC1087640ePS("LEVEL_HIGH", 2);
        LEVEL_HIGH = enumC1087640ePS3;
        EnumC1087640ePS enumC1087640ePS4 = new EnumC1087640ePS("LEVEL_NORMAL", 3);
        LEVEL_NORMAL = enumC1087640ePS4;
        EnumC1087640ePS[] enumC1087640ePSArr = {enumC1087640ePS, enumC1087640ePS2, enumC1087640ePS3, enumC1087640ePS4};
        LL = enumC1087640ePSArr;
        LLILLJJLI = new C2254308sP(enumC1087640ePSArr);
    }

    public static EnumC1087640ePS[] values() {
        return (EnumC1087640ePS[]) LL.clone();
    }

    public static EnumC1087640ePS valueOf(String str) {
        return (EnumC1087640ePS) C08FF.LIZ(EnumC1087640ePS.class, str);
    }

    public EnumC1087640ePS(String str, int i) {
    }
}
