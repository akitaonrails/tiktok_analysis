package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1405070mfR {
    public static final EnumC1405070mfR FAIL_OF_AB;
    public static final EnumC1405070mfR FAIL_OF_HAS_DATA;
    public static final EnumC1405070mfR FAIL_OF_LANDING;
    public static final EnumC1405070mfR FAIL_OF_PREDICTION;
    public static final /* synthetic */ EnumC1405070mfR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1405070mfR NONE;
    public static final EnumC1405070mfR SUCCESS;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<EnumC1405070mfR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1405070mfR enumC1405070mfR = new EnumC1405070mfR("NONE", 0, 0);
        NONE = enumC1405070mfR;
        EnumC1405070mfR enumC1405070mfR2 = new EnumC1405070mfR("FAIL_OF_AB", 1, 1);
        FAIL_OF_AB = enumC1405070mfR2;
        EnumC1405070mfR enumC1405070mfR3 = new EnumC1405070mfR("FAIL_OF_LANDING", 2, 2);
        FAIL_OF_LANDING = enumC1405070mfR3;
        EnumC1405070mfR enumC1405070mfR4 = new EnumC1405070mfR("FAIL_OF_HAS_DATA", 3, 3);
        FAIL_OF_HAS_DATA = enumC1405070mfR4;
        EnumC1405070mfR enumC1405070mfR5 = new EnumC1405070mfR("FAIL_OF_PREDICTION", 4, 4);
        FAIL_OF_PREDICTION = enumC1405070mfR5;
        EnumC1405070mfR enumC1405070mfR6 = new EnumC1405070mfR("SUCCESS", 5, 100);
        SUCCESS = enumC1405070mfR6;
        EnumC1405070mfR[] enumC1405070mfRArr = {enumC1405070mfR, enumC1405070mfR2, enumC1405070mfR3, enumC1405070mfR4, enumC1405070mfR5, enumC1405070mfR6};
        LLILLJJLI = enumC1405070mfRArr;
        LLILLL = new C2254308sP(enumC1405070mfRArr);
    }

    public static EnumC1405070mfR[] values() {
        return (EnumC1405070mfR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1405070mfR valueOf(String str) {
        return (EnumC1405070mfR) C08FF.LIZ(EnumC1405070mfR.class, str);
    }

    public EnumC1405070mfR(String str, int i, int i2) {
        this.LL = i2;
    }
}
