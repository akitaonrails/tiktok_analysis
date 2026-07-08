package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154090g8d {
    public static final EnumC1154090g8d CLIENT_CLOSE_FREQ;
    public static final EnumC1154090g8d CLIENT_ERROR;
    public static final /* synthetic */ EnumC1154090g8d[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1154090g8d SERVER_FREQ;
    public static final EnumC1154090g8d SESSION_BLOCKED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1154090g8d> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154090g8d enumC1154090g8d = new EnumC1154090g8d("SERVER_FREQ", 0, "server_freq");
        SERVER_FREQ = enumC1154090g8d;
        EnumC1154090g8d enumC1154090g8d2 = new EnumC1154090g8d("SESSION_BLOCKED", 1, "session_blocked");
        SESSION_BLOCKED = enumC1154090g8d2;
        EnumC1154090g8d enumC1154090g8d3 = new EnumC1154090g8d("CLIENT_CLOSE_FREQ", 2, "client_close_freq");
        CLIENT_CLOSE_FREQ = enumC1154090g8d3;
        EnumC1154090g8d enumC1154090g8d4 = new EnumC1154090g8d("CLIENT_ERROR", 3, "client_error");
        CLIENT_ERROR = enumC1154090g8d4;
        EnumC1154090g8d[] enumC1154090g8dArr = {enumC1154090g8d, enumC1154090g8d2, enumC1154090g8d3, enumC1154090g8d4};
        LLILLJJLI = enumC1154090g8dArr;
        LLILLL = new C2254308sP(enumC1154090g8dArr);
    }

    public static EnumC1154090g8d[] values() {
        return (EnumC1154090g8d[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1154090g8d valueOf(String str) {
        return (EnumC1154090g8d) C08FF.LIZ(EnumC1154090g8d.class, str);
    }

    public EnumC1154090g8d(String str, int i, String str2) {
        this.LL = str2;
    }
}
