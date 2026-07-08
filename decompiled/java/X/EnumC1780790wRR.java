package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780790wRR {
    public static final EnumC1780790wRR FRI;
    public static final /* synthetic */ EnumC1780790wRR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780790wRR MON;
    public static final EnumC1780790wRR NON;
    public static final EnumC1780790wRR SAT;
    public static final EnumC1780790wRR SUN;
    public static final EnumC1780790wRR THU;
    public static final EnumC1780790wRR TUE;
    public static final EnumC1780790wRR WED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1780790wRR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780790wRR enumC1780790wRR = new EnumC1780790wRR("NON", 0, 0);
        NON = enumC1780790wRR;
        EnumC1780790wRR enumC1780790wRR2 = new EnumC1780790wRR("MON", 1, 1);
        MON = enumC1780790wRR2;
        EnumC1780790wRR enumC1780790wRR3 = new EnumC1780790wRR("TUE", 2, 2);
        TUE = enumC1780790wRR3;
        EnumC1780790wRR enumC1780790wRR4 = new EnumC1780790wRR("WED", 3, 3);
        WED = enumC1780790wRR4;
        EnumC1780790wRR enumC1780790wRR5 = new EnumC1780790wRR("THU", 4, 4);
        THU = enumC1780790wRR5;
        EnumC1780790wRR enumC1780790wRR6 = new EnumC1780790wRR("FRI", 5, 5);
        FRI = enumC1780790wRR6;
        EnumC1780790wRR enumC1780790wRR7 = new EnumC1780790wRR("SAT", 6, 6);
        SAT = enumC1780790wRR7;
        EnumC1780790wRR enumC1780790wRR8 = new EnumC1780790wRR("SUN", 7, 7);
        SUN = enumC1780790wRR8;
        EnumC1780790wRR[] enumC1780790wRRArr = {enumC1780790wRR, enumC1780790wRR2, enumC1780790wRR3, enumC1780790wRR4, enumC1780790wRR5, enumC1780790wRR6, enumC1780790wRR7, enumC1780790wRR8};
        LLILLJJLI = enumC1780790wRRArr;
        LLILLL = new C2254308sP(enumC1780790wRRArr);
    }

    public static EnumC1780790wRR[] values() {
        return (EnumC1780790wRR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1780790wRR valueOf(String str) {
        return (EnumC1780790wRR) C08FF.LIZ(EnumC1780790wRR.class, str);
    }

    public EnumC1780790wRR(String str, int i, int i2) {
        this.LL = i2;
    }
}
