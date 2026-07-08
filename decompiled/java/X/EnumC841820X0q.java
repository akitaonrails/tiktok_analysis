package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC841820X0q {
    public static final EnumC841820X0q COMPLIANCE_NETWORK_MONITOR_LOG;
    public static final EnumC841820X0q COMPLIANCE_PAYLOAD_MONITOR_LOG;
    public static final EnumC841820X0q COMPLIANCE_THIRDPARTY_NETWORK_MONITOR_LOG;
    public static final EnumC841820X0q HTTP_COOKIE_TOKEN_LOG;
    public static final /* synthetic */ EnumC841820X0q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC841820X0q NATIVE_NETWORK_API_LOG;
    public static final EnumC841820X0q NATIVE_NETWORK_MONITOR_EXCEPTION_LOG;
    public static final EnumC841820X0q PENETRATE_HEADER_LOG;
    public static final EnumC841820X0q PNS_URL_BEFORE_STORE_REGION;
    public static final EnumC841820X0q UNEXPECTED_NETWORK_LOG;
    public final String LL;

    public static InterfaceC2044707zh<EnumC841820X0q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC841820X0q enumC841820X0q = new EnumC841820X0q("NATIVE_NETWORK_MONITOR_EXCEPTION_LOG", 0, "native_network_monitor_exception_log");
        NATIVE_NETWORK_MONITOR_EXCEPTION_LOG = enumC841820X0q;
        EnumC841820X0q enumC841820X0q2 = new EnumC841820X0q("UNEXPECTED_NETWORK_LOG", 1, "unexpected_network_log");
        UNEXPECTED_NETWORK_LOG = enumC841820X0q2;
        EnumC841820X0q enumC841820X0q3 = new EnumC841820X0q("NATIVE_NETWORK_API_LOG", 2, "native_network_api_log");
        NATIVE_NETWORK_API_LOG = enumC841820X0q3;
        EnumC841820X0q enumC841820X0q4 = new EnumC841820X0q("PENETRATE_HEADER_LOG", 3, "penetrate_header_log");
        PENETRATE_HEADER_LOG = enumC841820X0q4;
        EnumC841820X0q enumC841820X0q5 = new EnumC841820X0q("HTTP_COOKIE_TOKEN_LOG", 4, "http_cookie_token_log");
        HTTP_COOKIE_TOKEN_LOG = enumC841820X0q5;
        EnumC841820X0q enumC841820X0q6 = new EnumC841820X0q("COMPLIANCE_NETWORK_MONITOR_LOG", 5, "compliance_network_monitor_log");
        COMPLIANCE_NETWORK_MONITOR_LOG = enumC841820X0q6;
        EnumC841820X0q enumC841820X0q7 = new EnumC841820X0q("COMPLIANCE_PAYLOAD_MONITOR_LOG", 6, "compliance_payload_monitor_log");
        COMPLIANCE_PAYLOAD_MONITOR_LOG = enumC841820X0q7;
        EnumC841820X0q enumC841820X0q8 = new EnumC841820X0q("COMPLIANCE_THIRDPARTY_NETWORK_MONITOR_LOG", 7, "compliance_thirdparty_network_monitor_log");
        COMPLIANCE_THIRDPARTY_NETWORK_MONITOR_LOG = enumC841820X0q8;
        EnumC841820X0q enumC841820X0q9 = new EnumC841820X0q("PNS_URL_BEFORE_STORE_REGION", 8, "pns_url_before_store_region");
        PNS_URL_BEFORE_STORE_REGION = enumC841820X0q9;
        EnumC841820X0q[] enumC841820X0qArr = {enumC841820X0q, enumC841820X0q2, enumC841820X0q3, enumC841820X0q4, enumC841820X0q5, enumC841820X0q6, enumC841820X0q7, enumC841820X0q8, enumC841820X0q9};
        LLILLJJLI = enumC841820X0qArr;
        LLILLL = new C2254308sP(enumC841820X0qArr);
    }

    public static EnumC841820X0q[] values() {
        return (EnumC841820X0q[]) LLILLJJLI.clone();
    }

    public final String getLogType() {
        return this.LL;
    }

    public static EnumC841820X0q valueOf(String str) {
        return (EnumC841820X0q) C08FF.LIZ(EnumC841820X0q.class, str);
    }

    public EnumC841820X0q(String str, int i, String str2) {
        this.LL = str2;
    }
}
