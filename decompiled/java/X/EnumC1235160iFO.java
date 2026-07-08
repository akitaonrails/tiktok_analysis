package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235160iFO {
    public static final EnumC1235160iFO DIGITAL_0;
    public static final EnumC1235160iFO DIGITAL_1;
    public static final /* synthetic */ EnumC1235160iFO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1235160iFO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235160iFO enumC1235160iFO = new EnumC1235160iFO("DIGITAL_0", 0, 0);
        DIGITAL_0 = enumC1235160iFO;
        EnumC1235160iFO enumC1235160iFO2 = new EnumC1235160iFO("DIGITAL_1", 1, 1);
        DIGITAL_1 = enumC1235160iFO2;
        EnumC1235160iFO[] enumC1235160iFOArr = {enumC1235160iFO, enumC1235160iFO2};
        LLILLJJLI = enumC1235160iFOArr;
        LLILLL = new C2254308sP(enumC1235160iFOArr);
    }

    public static EnumC1235160iFO[] values() {
        return (EnumC1235160iFO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1235160iFO valueOf(String str) {
        return (EnumC1235160iFO) C08FF.LIZ(EnumC1235160iFO.class, str);
    }

    public EnumC1235160iFO(String str, int i, int i2) {
        this.LL = i2;
    }
}
