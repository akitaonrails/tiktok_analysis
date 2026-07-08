package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wC6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1771280wC6 {
    public static final /* synthetic */ EnumC1771280wC6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1771280wC6 NETWORK_UNAVAILABLE;
    public static final EnumC1771280wC6 NO_CACHE;
    public static final EnumC1771280wC6 NO_DATA;
    public static final EnumC1771280wC6 NO_INTERNET;
    public static final EnumC1771280wC6 RESPONSE_UNAVAILABLE;
    public static final EnumC1771280wC6 SPARK_LOAD_FAILED;
    public static final EnumC1771280wC6 UNINITIALIZED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1771280wC6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1771280wC6 enumC1771280wC6 = new EnumC1771280wC6("NETWORK_UNAVAILABLE", 0, "network_unavailable");
        NETWORK_UNAVAILABLE = enumC1771280wC6;
        EnumC1771280wC6 enumC1771280wC62 = new EnumC1771280wC6("NO_CACHE", 1, "no_cache");
        NO_CACHE = enumC1771280wC62;
        EnumC1771280wC6 enumC1771280wC63 = new EnumC1771280wC6("SPARK_LOAD_FAILED", 2, "spark_load_failed");
        SPARK_LOAD_FAILED = enumC1771280wC63;
        EnumC1771280wC6 enumC1771280wC64 = new EnumC1771280wC6("RESPONSE_UNAVAILABLE", 3, "response_unavailable");
        RESPONSE_UNAVAILABLE = enumC1771280wC64;
        EnumC1771280wC6 enumC1771280wC65 = new EnumC1771280wC6("UNINITIALIZED", 4, "uninitialized");
        UNINITIALIZED = enumC1771280wC65;
        EnumC1771280wC6 enumC1771280wC66 = new EnumC1771280wC6("NO_DATA", 5, "no_data");
        NO_DATA = enumC1771280wC66;
        EnumC1771280wC6 enumC1771280wC67 = new EnumC1771280wC6("NO_INTERNET", 6, "no_internet");
        NO_INTERNET = enumC1771280wC67;
        EnumC1771280wC6[] enumC1771280wC6Arr = {enumC1771280wC6, enumC1771280wC62, enumC1771280wC63, enumC1771280wC64, enumC1771280wC65, enumC1771280wC66, enumC1771280wC67};
        LLILLJJLI = enumC1771280wC6Arr;
        LLILLL = new C2254308sP(enumC1771280wC6Arr);
    }

    public static EnumC1771280wC6[] values() {
        return (EnumC1771280wC6[]) LLILLJJLI.clone();
    }

    public final String getErrMsg() {
        return this.LL;
    }

    public static EnumC1771280wC6 valueOf(String str) {
        return (EnumC1771280wC6) C08FF.LIZ(EnumC1771280wC6.class, str);
    }

    public EnumC1771280wC6(String str, int i, String str2) {
        this.LL = str2;
    }
}
