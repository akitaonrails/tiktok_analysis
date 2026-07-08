package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cHH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1005690cHH {
    public static final EnumC1005690cHH EVENT;
    public static final /* synthetic */ EnumC1005690cHH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1005690cHH REQUEST;
    public static final EnumC1005690cHH SCHEMA;
    public static final EnumC1005690cHH UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1005690cHH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1005690cHH enumC1005690cHH = new EnumC1005690cHH("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC1005690cHH;
        EnumC1005690cHH enumC1005690cHH2 = new EnumC1005690cHH("SCHEMA", 1, "schema");
        SCHEMA = enumC1005690cHH2;
        EnumC1005690cHH enumC1005690cHH3 = new EnumC1005690cHH("REQUEST", 2, "request");
        REQUEST = enumC1005690cHH3;
        EnumC1005690cHH enumC1005690cHH4 = new EnumC1005690cHH("EVENT", 3, "event");
        EVENT = enumC1005690cHH4;
        EnumC1005690cHH[] enumC1005690cHHArr = {enumC1005690cHH, enumC1005690cHH2, enumC1005690cHH3, enumC1005690cHH4};
        LLILLJJLI = enumC1005690cHHArr;
        LLILLL = new C2254308sP(enumC1005690cHHArr);
    }

    public static EnumC1005690cHH[] values() {
        return (EnumC1005690cHH[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1005690cHH valueOf(String str) {
        return (EnumC1005690cHH) C08FF.LIZ(EnumC1005690cHH.class, str);
    }

    public EnumC1005690cHH(String str, int i, String str2) {
        this.LL = str2;
    }
}
