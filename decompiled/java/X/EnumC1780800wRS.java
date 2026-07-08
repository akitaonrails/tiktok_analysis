package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wRS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780800wRS {
    public static final EnumC1780800wRS FRI;
    public static final /* synthetic */ EnumC1780800wRS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780800wRS MON;
    public static final EnumC1780800wRS NON;
    public static final EnumC1780800wRS SAT;
    public static final EnumC1780800wRS SUN;
    public static final EnumC1780800wRS THU;
    public static final EnumC1780800wRS TUE;
    public static final EnumC1780800wRS WED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1780800wRS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780800wRS enumC1780800wRS = new EnumC1780800wRS("NON", 0, 0);
        NON = enumC1780800wRS;
        EnumC1780800wRS enumC1780800wRS2 = new EnumC1780800wRS("MON", 1, 1);
        MON = enumC1780800wRS2;
        EnumC1780800wRS enumC1780800wRS3 = new EnumC1780800wRS("TUE", 2, 2);
        TUE = enumC1780800wRS3;
        EnumC1780800wRS enumC1780800wRS4 = new EnumC1780800wRS("WED", 3, 3);
        WED = enumC1780800wRS4;
        EnumC1780800wRS enumC1780800wRS5 = new EnumC1780800wRS("THU", 4, 4);
        THU = enumC1780800wRS5;
        EnumC1780800wRS enumC1780800wRS6 = new EnumC1780800wRS("FRI", 5, 5);
        FRI = enumC1780800wRS6;
        EnumC1780800wRS enumC1780800wRS7 = new EnumC1780800wRS("SAT", 6, 6);
        SAT = enumC1780800wRS7;
        EnumC1780800wRS enumC1780800wRS8 = new EnumC1780800wRS("SUN", 7, 7);
        SUN = enumC1780800wRS8;
        EnumC1780800wRS[] enumC1780800wRSArr = {enumC1780800wRS, enumC1780800wRS2, enumC1780800wRS3, enumC1780800wRS4, enumC1780800wRS5, enumC1780800wRS6, enumC1780800wRS7, enumC1780800wRS8};
        LLILLJJLI = enumC1780800wRSArr;
        LLILLL = new C2254308sP(enumC1780800wRSArr);
    }

    public static EnumC1780800wRS[] values() {
        return (EnumC1780800wRS[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1780800wRS valueOf(String str) {
        return (EnumC1780800wRS) C08FF.LIZ(EnumC1780800wRS.class, str);
    }

    public EnumC1780800wRS(String str, int i, int i2) {
        this.LL = i2;
    }
}
