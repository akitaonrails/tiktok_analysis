package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599500NfI {
    public static final EnumC599500NfI ACTION;
    public static final EnumC599500NfI EVENT;
    public static final /* synthetic */ EnumC599500NfI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final Number LL;

    public static InterfaceC2044707zh<EnumC599500NfI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599500NfI enumC599500NfI = new EnumC599500NfI(0, 1, "ACTION");
        ACTION = enumC599500NfI;
        EnumC599500NfI enumC599500NfI2 = new EnumC599500NfI(1, 2, "EVENT");
        EVENT = enumC599500NfI2;
        EnumC599500NfI[] enumC599500NfIArr = {enumC599500NfI, enumC599500NfI2};
        LLILLJJLI = enumC599500NfIArr;
        LLILLL = new C2254308sP(enumC599500NfIArr);
    }

    public static EnumC599500NfI[] values() {
        return (EnumC599500NfI[]) LLILLJJLI.clone();
    }

    public final Number getValue() {
        return this.LL;
    }

    public static EnumC599500NfI valueOf(String str) {
        return (EnumC599500NfI) C08FF.LIZ(EnumC599500NfI.class, str);
    }

    public EnumC599500NfI(int i, Number number, String str) {
        this.LL = number;
    }
}
