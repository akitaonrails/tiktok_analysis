package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1222640hvC {
    public static final EnumC1222640hvC ADS;
    public static final EnumC1222640hvC FEEDBACK;
    public static final EnumC1222640hvC FUNCTIONALITY;
    public static final /* synthetic */ EnumC1222640hvC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1222640hvC PAYMENT_ORDER;
    public static final EnumC1222640hvC UNKNOWN;
    public static final EnumC1222640hvC VIOLATION;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1222640hvC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1222640hvC enumC1222640hvC = new EnumC1222640hvC("UNKNOWN", 0, 0);
        UNKNOWN = enumC1222640hvC;
        EnumC1222640hvC enumC1222640hvC2 = new EnumC1222640hvC("VIOLATION", 1, 1);
        VIOLATION = enumC1222640hvC2;
        EnumC1222640hvC enumC1222640hvC3 = new EnumC1222640hvC("FUNCTIONALITY", 2, 2);
        FUNCTIONALITY = enumC1222640hvC3;
        EnumC1222640hvC enumC1222640hvC4 = new EnumC1222640hvC("PAYMENT_ORDER", 3, 3);
        PAYMENT_ORDER = enumC1222640hvC4;
        EnumC1222640hvC enumC1222640hvC5 = new EnumC1222640hvC("ADS", 4, 4);
        ADS = enumC1222640hvC5;
        EnumC1222640hvC enumC1222640hvC6 = new EnumC1222640hvC("FEEDBACK", 5, 5);
        FEEDBACK = enumC1222640hvC6;
        EnumC1222640hvC[] enumC1222640hvCArr = {enumC1222640hvC, enumC1222640hvC2, enumC1222640hvC3, enumC1222640hvC4, enumC1222640hvC5, enumC1222640hvC6};
        LLILLJJLI = enumC1222640hvCArr;
        LLILLL = new C2254308sP(enumC1222640hvCArr);
    }

    public static EnumC1222640hvC[] values() {
        return (EnumC1222640hvC[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1222640hvC valueOf(String str) {
        return (EnumC1222640hvC) C08FF.LIZ(EnumC1222640hvC.class, str);
    }

    public EnumC1222640hvC(String str, int i, int i2) {
        this.LL = i2;
    }
}
