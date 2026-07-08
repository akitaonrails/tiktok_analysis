package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC334020D7o {
    public static final EnumC334020D7o DECODING;
    public static final EnumC334020D7o JSON_RPC;
    public static final /* synthetic */ EnumC334020D7o[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC334020D7o TOKEN;
    public static final EnumC334020D7o UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC334020D7o> getEntries() {
        return LLILLL;
    }

    static {
        EnumC334020D7o enumC334020D7o = new EnumC334020D7o("TOKEN", 0, "token");
        TOKEN = enumC334020D7o;
        EnumC334020D7o enumC334020D7o2 = new EnumC334020D7o("DECODING", 1, "decoding");
        DECODING = enumC334020D7o2;
        EnumC334020D7o enumC334020D7o3 = new EnumC334020D7o("JSON_RPC", 2, "json_rpc");
        JSON_RPC = enumC334020D7o3;
        EnumC334020D7o enumC334020D7o4 = new EnumC334020D7o("UNKNOWN", 3, "unknown");
        UNKNOWN = enumC334020D7o4;
        EnumC334020D7o[] enumC334020D7oArr = {enumC334020D7o, enumC334020D7o2, enumC334020D7o3, enumC334020D7o4};
        LLILLJJLI = enumC334020D7oArr;
        LLILLL = new C2254308sP(enumC334020D7oArr);
    }

    public static EnumC334020D7o[] values() {
        return (EnumC334020D7o[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC334020D7o valueOf(String str) {
        return (EnumC334020D7o) C08FF.LIZ(EnumC334020D7o.class, str);
    }

    public EnumC334020D7o(String str, int i, String str2) {
        this.LL = str2;
    }
}
