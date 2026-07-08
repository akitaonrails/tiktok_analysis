package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0orB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1489230orB {
    public static final EnumC1489230orB INSTANT_WEAK;
    public static final /* synthetic */ EnumC1489230orB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1489230orB MEDIUM;
    public static final EnumC1489230orB STRONG;
    public static final EnumC1489230orB UNKNOWN;
    public static final EnumC1489230orB WEAK;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1489230orB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1489230orB enumC1489230orB = new EnumC1489230orB("INSTANT_WEAK", 0, -2);
        INSTANT_WEAK = enumC1489230orB;
        EnumC1489230orB enumC1489230orB2 = new EnumC1489230orB("UNKNOWN", 1, -1);
        UNKNOWN = enumC1489230orB2;
        EnumC1489230orB enumC1489230orB3 = new EnumC1489230orB("WEAK", 2, 0);
        WEAK = enumC1489230orB3;
        EnumC1489230orB enumC1489230orB4 = new EnumC1489230orB("MEDIUM", 3, 1);
        MEDIUM = enumC1489230orB4;
        EnumC1489230orB enumC1489230orB5 = new EnumC1489230orB("STRONG", 4, 2);
        STRONG = enumC1489230orB5;
        EnumC1489230orB[] enumC1489230orBArr = {enumC1489230orB, enumC1489230orB2, enumC1489230orB3, enumC1489230orB4, enumC1489230orB5};
        LLILLJJLI = enumC1489230orBArr;
        LLILLL = new C2254308sP(enumC1489230orBArr);
    }

    public static EnumC1489230orB[] values() {
        return (EnumC1489230orB[]) LLILLJJLI.clone();
    }

    public final EnumC1489230orB getIncreasedComplexity() {
        int i = C1489240orC.LIZ[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this;
        }
        if (i == 4) {
            return MEDIUM;
        }
        if (i == 5) {
            return STRONG;
        }
        throw new C1954807lC();
    }

    public final EnumC1489220orA getPasswordComplexity() {
        int i = C1489240orC.LIZ[ordinal()];
        return i != 1 ? i != 3 ? i != 5 ? EnumC1489220orA.WEAK : EnumC1489220orA.MEDIUM : EnumC1489220orA.STRONG : EnumC1489220orA.UNKNOWN;
    }

    public final int getScore$account_awemeaccount_release() {
        return this.LL;
    }

    public static EnumC1489230orB valueOf(String str) {
        return (EnumC1489230orB) C08FF.LIZ(EnumC1489230orB.class, str);
    }

    public EnumC1489230orB(String str, int i, int i2) {
        this.LL = i2;
    }
}
