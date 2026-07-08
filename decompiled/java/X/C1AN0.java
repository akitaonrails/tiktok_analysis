package X;

/* JADX INFO: renamed from: X.1AN0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public enum C1AN0 {
    NETWORK_ERROR(0, "NETWORK_ERROR"),
    INVALIDATE_PLAYER_MODEL(1, "INVALIDATE_DATA_SOURCE"),
    UNKNOWN(-1, "UNKNOWN");

    public final int LL;
    public final String LLILLJJLI;

    public static C1AN0 valueOf(String str) {
        return (C1AN0) C08FF.LIZ(C1AN0.class, str);
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMsg() {
        return this.LLILLJJLI;
    }

    C1AN0(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
