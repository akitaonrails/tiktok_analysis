package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC976420bW4 {
    public static final EnumC976420bW4 HTTP_FINISH;
    public static final EnumC976420bW4 HTTP_INFO;
    public static final EnumC976420bW4 HTTP_MULTI_FINISH;
    public static final /* synthetic */ EnumC976420bW4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC976420bW4 MSG_FINISH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC976420bW4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC976420bW4 enumC976420bW4 = new EnumC976420bW4("MSG_FINISH", 0, "msg_finish");
        MSG_FINISH = enumC976420bW4;
        EnumC976420bW4 enumC976420bW42 = new EnumC976420bW4("HTTP_INFO", 1, "http_info");
        HTTP_INFO = enumC976420bW42;
        EnumC976420bW4 enumC976420bW43 = new EnumC976420bW4("HTTP_FINISH", 2, "http_finish");
        HTTP_FINISH = enumC976420bW43;
        EnumC976420bW4 enumC976420bW44 = new EnumC976420bW4("HTTP_MULTI_FINISH", 3, "http_multi_finish");
        HTTP_MULTI_FINISH = enumC976420bW44;
        EnumC976420bW4[] enumC976420bW4Arr = {enumC976420bW4, enumC976420bW42, enumC976420bW43, enumC976420bW44};
        LLILLJJLI = enumC976420bW4Arr;
        LLILLL = new C2254308sP(enumC976420bW4Arr);
    }

    public static EnumC976420bW4[] values() {
        return (EnumC976420bW4[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC976420bW4 valueOf(String str) {
        return (EnumC976420bW4) C08FF.LIZ(EnumC976420bW4.class, str);
    }

    public EnumC976420bW4(String str, int i, String str2) {
        this.LL = str2;
    }
}
