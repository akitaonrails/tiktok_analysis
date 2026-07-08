package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599620NfU {
    public static final EnumC599620NfU EVENT;
    public static final /* synthetic */ EnumC599620NfU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599620NfU METHOD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC599620NfU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599620NfU enumC599620NfU = new EnumC599620NfU("EVENT", 0, "event");
        EVENT = enumC599620NfU;
        EnumC599620NfU enumC599620NfU2 = new EnumC599620NfU("METHOD", 1, "method");
        METHOD = enumC599620NfU2;
        EnumC599620NfU[] enumC599620NfUArr = {enumC599620NfU, enumC599620NfU2};
        LLILLJJLI = enumC599620NfUArr;
        LLILLL = new C2254308sP(enumC599620NfUArr);
    }

    public static EnumC599620NfU[] values() {
        return (EnumC599620NfU[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC599620NfU valueOf(String str) {
        return (EnumC599620NfU) C08FF.LIZ(EnumC599620NfU.class, str);
    }

    public EnumC599620NfU(String str, int i, String str2) {
        this.LL = str2;
    }
}
