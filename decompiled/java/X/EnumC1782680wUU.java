package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782680wUU {
    public static final EnumC1782680wUU DO_NOT_LOAD;
    public static final /* synthetic */ EnumC1782680wUU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782680wUU NOT_PREDICTED;
    public static final EnumC1782680wUU ORIGINAL;
    public static final EnumC1782680wUU TRANSLATED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1782680wUU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782680wUU enumC1782680wUU = new EnumC1782680wUU("ORIGINAL", 0, 0);
        ORIGINAL = enumC1782680wUU;
        EnumC1782680wUU enumC1782680wUU2 = new EnumC1782680wUU("TRANSLATED", 1, 1);
        TRANSLATED = enumC1782680wUU2;
        EnumC1782680wUU enumC1782680wUU3 = new EnumC1782680wUU("DO_NOT_LOAD", 2, -1);
        DO_NOT_LOAD = enumC1782680wUU3;
        EnumC1782680wUU enumC1782680wUU4 = new EnumC1782680wUU("NOT_PREDICTED", 3, -2);
        NOT_PREDICTED = enumC1782680wUU4;
        EnumC1782680wUU[] enumC1782680wUUArr = {enumC1782680wUU, enumC1782680wUU2, enumC1782680wUU3, enumC1782680wUU4};
        LLILLJJLI = enumC1782680wUUArr;
        LLILLL = new C2254308sP(enumC1782680wUUArr);
    }

    public static EnumC1782680wUU[] values() {
        return (EnumC1782680wUU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1782680wUU valueOf(String str) {
        return (EnumC1782680wUU) C08FF.LIZ(EnumC1782680wUU.class, str);
    }

    public EnumC1782680wUU(String str, int i, int i2) {
        this.LL = i2;
    }
}
