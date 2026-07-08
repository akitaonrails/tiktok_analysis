package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC598910NeL {
    public static final EnumC598910NeL COMPLETE;
    public static final EnumC598910NeL ERROR;
    public static final /* synthetic */ EnumC598910NeL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC598910NeL START;
    public static final EnumC598910NeL TRANSMIT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC598910NeL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC598910NeL enumC598910NeL = new EnumC598910NeL("START", 0, "communication_start");
        START = enumC598910NeL;
        EnumC598910NeL enumC598910NeL2 = new EnumC598910NeL("TRANSMIT", 1, "communication_transmit");
        TRANSMIT = enumC598910NeL2;
        EnumC598910NeL enumC598910NeL3 = new EnumC598910NeL("COMPLETE", 2, "communication_complete");
        COMPLETE = enumC598910NeL3;
        EnumC598910NeL enumC598910NeL4 = new EnumC598910NeL("ERROR", 3, "communication_error");
        ERROR = enumC598910NeL4;
        EnumC598910NeL[] enumC598910NeLArr = {enumC598910NeL, enumC598910NeL2, enumC598910NeL3, enumC598910NeL4};
        LLILLJJLI = enumC598910NeLArr;
        LLILLL = new C2254308sP(enumC598910NeLArr);
    }

    public static EnumC598910NeL[] values() {
        return (EnumC598910NeL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC598910NeL valueOf(String str) {
        return (EnumC598910NeL) C08FF.LIZ(EnumC598910NeL.class, str);
    }

    public EnumC598910NeL(String str, int i, String str2) {
        this.LL = str2;
    }
}
