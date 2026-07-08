package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1523070pjl {
    public static final C1523080pjm Companion;
    public static final EnumC1523070pjl INTERNAL_ERROR;
    public static final EnumC1523070pjl INVALID_DOMAIN;
    public static final EnumC1523070pjl INVALID_PARAM;
    public static final EnumC1523070pjl INVALID_URL;
    public static final /* synthetic */ EnumC1523070pjl[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1523070pjl SOCKET_CLOSE_FAIL;
    public static final EnumC1523070pjl SOCKET_CREATE_FAIL;
    public static final EnumC1523070pjl SOCKET_NOT_EXIST;
    public static final EnumC1523070pjl SOCKET_NOT_OPEN;
    public static final EnumC1523070pjl SOCKET_SEND_FAIL;
    public static final EnumC1523070pjl SUCCESS;
    public static final EnumC1523070pjl TIMEOUT;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1523070pjl> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0pjm] */
    static {
        EnumC1523070pjl enumC1523070pjl = new EnumC1523070pjl("SUCCESS", 0, 1, "request:ok");
        SUCCESS = enumC1523070pjl;
        EnumC1523070pjl enumC1523070pjl2 = new EnumC1523070pjl("INVALID_PARAM", 1, 20001, "invalid param");
        INVALID_PARAM = enumC1523070pjl2;
        EnumC1523070pjl enumC1523070pjl3 = new EnumC1523070pjl("INTERNAL_ERROR", 2, 10401, "internal error");
        INTERNAL_ERROR = enumC1523070pjl3;
        EnumC1523070pjl enumC1523070pjl4 = new EnumC1523070pjl("TIMEOUT", 3, 21103, "request time out");
        TIMEOUT = enumC1523070pjl4;
        EnumC1523070pjl enumC1523070pjl5 = new EnumC1523070pjl("INVALID_DOMAIN", 4, 21100, "url not in domain list");
        INVALID_DOMAIN = enumC1523070pjl5;
        EnumC1523070pjl enumC1523070pjl6 = new EnumC1523070pjl("INVALID_URL", 5, 21101, "url is invalid");
        INVALID_URL = enumC1523070pjl6;
        EnumC1523070pjl enumC1523070pjl7 = new EnumC1523070pjl("SOCKET_NOT_OPEN", 6, 21300, "socket is not open");
        SOCKET_NOT_OPEN = enumC1523070pjl7;
        EnumC1523070pjl enumC1523070pjl8 = new EnumC1523070pjl("SOCKET_NOT_EXIST", 7, 21301, "socket does not exist");
        SOCKET_NOT_EXIST = enumC1523070pjl8;
        EnumC1523070pjl enumC1523070pjl9 = new EnumC1523070pjl("SOCKET_SEND_FAIL", 8, 21302, "socket send fail");
        SOCKET_SEND_FAIL = enumC1523070pjl9;
        EnumC1523070pjl enumC1523070pjl10 = new EnumC1523070pjl("SOCKET_CLOSE_FAIL", 9, 21303, "socket close fail");
        SOCKET_CLOSE_FAIL = enumC1523070pjl10;
        EnumC1523070pjl enumC1523070pjl11 = new EnumC1523070pjl("SOCKET_CREATE_FAIL", 10, 21304, "socket create fail");
        SOCKET_CREATE_FAIL = enumC1523070pjl11;
        EnumC1523070pjl[] enumC1523070pjlArr = {enumC1523070pjl, enumC1523070pjl2, enumC1523070pjl3, enumC1523070pjl4, enumC1523070pjl5, enumC1523070pjl6, enumC1523070pjl7, enumC1523070pjl8, enumC1523070pjl9, enumC1523070pjl10, enumC1523070pjl11};
        LLILLL = enumC1523070pjlArr;
        LLILZ = new C2254308sP(enumC1523070pjlArr);
        Companion = new Object() { // from class: X.0pjm
        };
    }

    public static EnumC1523070pjl[] values() {
        return (EnumC1523070pjl[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMsg() {
        return this.LLILLJJLI;
    }

    public static EnumC1523070pjl valueOf(String str) {
        return (EnumC1523070pjl) C08FF.LIZ(EnumC1523070pjl.class, str);
    }

    public EnumC1523070pjl(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
