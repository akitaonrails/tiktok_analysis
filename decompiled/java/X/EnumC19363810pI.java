package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19363810pI {
    public static final /* synthetic */ EnumC19363810pI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19363810pI REST;
    public static final EnumC19363810pI UNKNOWN;
    public static final EnumC19363810pI UNREST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19363810pI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19363810pI enumC19363810pI = new EnumC19363810pI("UNKNOWN", 0, 0);
        UNKNOWN = enumC19363810pI;
        EnumC19363810pI enumC19363810pI2 = new EnumC19363810pI("REST", 1, 1);
        REST = enumC19363810pI2;
        EnumC19363810pI enumC19363810pI3 = new EnumC19363810pI("UNREST", 2, 2);
        UNREST = enumC19363810pI3;
        EnumC19363810pI[] enumC19363810pIArr = {enumC19363810pI, enumC19363810pI2, enumC19363810pI3};
        LLILLJJLI = enumC19363810pIArr;
        LLILLL = new C2254308sP(enumC19363810pIArr);
    }

    public static EnumC19363810pI[] values() {
        return (EnumC19363810pI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19363810pI valueOf(String str) {
        return (EnumC19363810pI) C08FF.LIZ(EnumC19363810pI.class, str);
    }

    public EnumC19363810pI(String str, int i, int i2) {
        this.LL = i2;
    }
}
