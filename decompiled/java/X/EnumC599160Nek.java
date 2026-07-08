package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599160Nek {
    public static final EnumC599160Nek COMPLETE;
    public static final EnumC599160Nek ERROR;
    public static final /* synthetic */ EnumC599160Nek[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599160Nek START;
    public static final EnumC599160Nek TRANSMIT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC599160Nek> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599160Nek enumC599160Nek = new EnumC599160Nek("START", 0, "paap_communication_start");
        START = enumC599160Nek;
        EnumC599160Nek enumC599160Nek2 = new EnumC599160Nek("TRANSMIT", 1, "paap_communication_transit");
        TRANSMIT = enumC599160Nek2;
        EnumC599160Nek enumC599160Nek3 = new EnumC599160Nek("COMPLETE", 2, "paap_communication_complete");
        COMPLETE = enumC599160Nek3;
        EnumC599160Nek enumC599160Nek4 = new EnumC599160Nek("ERROR", 3, "paap_communication_error");
        ERROR = enumC599160Nek4;
        EnumC599160Nek[] enumC599160NekArr = {enumC599160Nek, enumC599160Nek2, enumC599160Nek3, enumC599160Nek4};
        LLILLJJLI = enumC599160NekArr;
        LLILLL = new C2254308sP(enumC599160NekArr);
    }

    public static EnumC599160Nek[] values() {
        return (EnumC599160Nek[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC599160Nek valueOf(String str) {
        return (EnumC599160Nek) C08FF.LIZ(EnumC599160Nek.class, str);
    }

    public EnumC599160Nek(String str, int i, String str2) {
        this.LL = str2;
    }
}
