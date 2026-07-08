package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780780wRQ {
    public static final EnumC1780780wRQ FRI;
    public static final /* synthetic */ EnumC1780780wRQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780780wRQ MON;
    public static final EnumC1780780wRQ NON;
    public static final EnumC1780780wRQ SAT;
    public static final EnumC1780780wRQ SUN;
    public static final EnumC1780780wRQ THU;
    public static final EnumC1780780wRQ TUE;
    public static final EnumC1780780wRQ WED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1780780wRQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780780wRQ enumC1780780wRQ = new EnumC1780780wRQ("NON", 0, 0);
        NON = enumC1780780wRQ;
        EnumC1780780wRQ enumC1780780wRQ2 = new EnumC1780780wRQ("MON", 1, 1);
        MON = enumC1780780wRQ2;
        EnumC1780780wRQ enumC1780780wRQ3 = new EnumC1780780wRQ("TUE", 2, 2);
        TUE = enumC1780780wRQ3;
        EnumC1780780wRQ enumC1780780wRQ4 = new EnumC1780780wRQ("WED", 3, 3);
        WED = enumC1780780wRQ4;
        EnumC1780780wRQ enumC1780780wRQ5 = new EnumC1780780wRQ("THU", 4, 4);
        THU = enumC1780780wRQ5;
        EnumC1780780wRQ enumC1780780wRQ6 = new EnumC1780780wRQ("FRI", 5, 5);
        FRI = enumC1780780wRQ6;
        EnumC1780780wRQ enumC1780780wRQ7 = new EnumC1780780wRQ("SAT", 6, 6);
        SAT = enumC1780780wRQ7;
        EnumC1780780wRQ enumC1780780wRQ8 = new EnumC1780780wRQ("SUN", 7, 7);
        SUN = enumC1780780wRQ8;
        EnumC1780780wRQ[] enumC1780780wRQArr = {enumC1780780wRQ, enumC1780780wRQ2, enumC1780780wRQ3, enumC1780780wRQ4, enumC1780780wRQ5, enumC1780780wRQ6, enumC1780780wRQ7, enumC1780780wRQ8};
        LLILLJJLI = enumC1780780wRQArr;
        LLILLL = new C2254308sP(enumC1780780wRQArr);
    }

    public static EnumC1780780wRQ[] values() {
        return (EnumC1780780wRQ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1780780wRQ valueOf(String str) {
        return (EnumC1780780wRQ) C08FF.LIZ(EnumC1780780wRQ.class, str);
    }

    public EnumC1780780wRQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
