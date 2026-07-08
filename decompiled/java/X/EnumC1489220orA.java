package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0orA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1489220orA {
    public static final /* synthetic */ EnumC1489220orA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1489220orA MEDIUM;
    public static final EnumC1489220orA NOT_ENABLED;
    public static final EnumC1489220orA STRONG;
    public static final EnumC1489220orA UNKNOWN;
    public static final EnumC1489220orA WEAK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1489220orA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1489220orA enumC1489220orA = new EnumC1489220orA("NOT_ENABLED", 0, "-1");
        NOT_ENABLED = enumC1489220orA;
        EnumC1489220orA enumC1489220orA2 = new EnumC1489220orA("UNKNOWN", 1, "-1");
        UNKNOWN = enumC1489220orA2;
        EnumC1489220orA enumC1489220orA3 = new EnumC1489220orA("WEAK", 2, "1");
        WEAK = enumC1489220orA3;
        EnumC1489220orA enumC1489220orA4 = new EnumC1489220orA("MEDIUM", 3, "2");
        MEDIUM = enumC1489220orA4;
        EnumC1489220orA enumC1489220orA5 = new EnumC1489220orA("STRONG", 4, "3");
        STRONG = enumC1489220orA5;
        EnumC1489220orA[] enumC1489220orAArr = {enumC1489220orA, enumC1489220orA2, enumC1489220orA3, enumC1489220orA4, enumC1489220orA5};
        LLILLJJLI = enumC1489220orAArr;
        LLILLL = new C2254308sP(enumC1489220orAArr);
    }

    public static EnumC1489220orA[] values() {
        return (EnumC1489220orA[]) LLILLJJLI.clone();
    }

    public final boolean isSetPasswordAllowed() {
        return this == MEDIUM || this == STRONG || this == NOT_ENABLED;
    }

    public final String getEtValue() {
        return this.LL;
    }

    public static EnumC1489220orA valueOf(String str) {
        return (EnumC1489220orA) C08FF.LIZ(EnumC1489220orA.class, str);
    }

    public EnumC1489220orA(String str, int i, String str2) {
        this.LL = str2;
    }
}
