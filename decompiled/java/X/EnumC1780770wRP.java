package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wRP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780770wRP {
    public static final EnumC1780770wRP FRI;
    public static final /* synthetic */ EnumC1780770wRP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780770wRP MON;
    public static final EnumC1780770wRP NON;
    public static final EnumC1780770wRP SAT;
    public static final EnumC1780770wRP SUN;
    public static final EnumC1780770wRP THU;
    public static final EnumC1780770wRP TUE;
    public static final EnumC1780770wRP WED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1780770wRP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780770wRP enumC1780770wRP = new EnumC1780770wRP("NON", 0, 0);
        NON = enumC1780770wRP;
        EnumC1780770wRP enumC1780770wRP2 = new EnumC1780770wRP("MON", 1, 1);
        MON = enumC1780770wRP2;
        EnumC1780770wRP enumC1780770wRP3 = new EnumC1780770wRP("TUE", 2, 2);
        TUE = enumC1780770wRP3;
        EnumC1780770wRP enumC1780770wRP4 = new EnumC1780770wRP("WED", 3, 3);
        WED = enumC1780770wRP4;
        EnumC1780770wRP enumC1780770wRP5 = new EnumC1780770wRP("THU", 4, 4);
        THU = enumC1780770wRP5;
        EnumC1780770wRP enumC1780770wRP6 = new EnumC1780770wRP("FRI", 5, 5);
        FRI = enumC1780770wRP6;
        EnumC1780770wRP enumC1780770wRP7 = new EnumC1780770wRP("SAT", 6, 6);
        SAT = enumC1780770wRP7;
        EnumC1780770wRP enumC1780770wRP8 = new EnumC1780770wRP("SUN", 7, 7);
        SUN = enumC1780770wRP8;
        EnumC1780770wRP[] enumC1780770wRPArr = {enumC1780770wRP, enumC1780770wRP2, enumC1780770wRP3, enumC1780770wRP4, enumC1780770wRP5, enumC1780770wRP6, enumC1780770wRP7, enumC1780770wRP8};
        LLILLJJLI = enumC1780770wRPArr;
        LLILLL = new C2254308sP(enumC1780770wRPArr);
    }

    public static EnumC1780770wRP[] values() {
        return (EnumC1780770wRP[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1780770wRP valueOf(String str) {
        return (EnumC1780770wRP) C08FF.LIZ(EnumC1780770wRP.class, str);
    }

    public EnumC1780770wRP(String str, int i, int i2) {
        this.LL = i2;
    }
}
