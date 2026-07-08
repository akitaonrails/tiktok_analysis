package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2193681AtK {
    public static final EnumC2193681AtK ACCESS_DENIED;
    public static final EnumC2193681AtK INVALID_REQUEST;
    public static final EnumC2193681AtK INVALID_SCOPE;
    public static final /* synthetic */ EnumC2193681AtK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2193681AtK SERVER_ERROR;
    public static final EnumC2193681AtK TEMPORARILY_UNAVAILABLE;
    public static final EnumC2193681AtK UNAUTHORIZED_CLIENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2193681AtK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2193681AtK enumC2193681AtK = new EnumC2193681AtK("INVALID_REQUEST", 0, "invalid_request");
        INVALID_REQUEST = enumC2193681AtK;
        EnumC2193681AtK enumC2193681AtK2 = new EnumC2193681AtK("ACCESS_DENIED", 1, "access_denied");
        ACCESS_DENIED = enumC2193681AtK2;
        EnumC2193681AtK enumC2193681AtK3 = new EnumC2193681AtK("INVALID_SCOPE", 2, "invalid_scope");
        INVALID_SCOPE = enumC2193681AtK3;
        EnumC2193681AtK enumC2193681AtK4 = new EnumC2193681AtK("SERVER_ERROR", 3, "server_error");
        SERVER_ERROR = enumC2193681AtK4;
        EnumC2193681AtK enumC2193681AtK5 = new EnumC2193681AtK("TEMPORARILY_UNAVAILABLE", 4, "temporarily_unavailable");
        TEMPORARILY_UNAVAILABLE = enumC2193681AtK5;
        EnumC2193681AtK enumC2193681AtK6 = new EnumC2193681AtK("UNAUTHORIZED_CLIENT", 5, "unauthorized_client");
        UNAUTHORIZED_CLIENT = enumC2193681AtK6;
        EnumC2193681AtK[] enumC2193681AtKArr = {enumC2193681AtK, enumC2193681AtK2, enumC2193681AtK3, enumC2193681AtK4, enumC2193681AtK5, enumC2193681AtK6};
        LLILLJJLI = enumC2193681AtKArr;
        LLILLL = new C2254308sP(enumC2193681AtKArr);
    }

    public static EnumC2193681AtK[] values() {
        return (EnumC2193681AtK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2193681AtK valueOf(String str) {
        return (EnumC2193681AtK) C08FF.LIZ(EnumC2193681AtK.class, str);
    }

    public EnumC2193681AtK(String str, int i, String str2) {
        this.LL = str2;
    }
}
