package X;

/* JADX INFO: renamed from: X.0uJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public enum EnumC1699200uJq {
    PLAYER_INITIATED(0, "player"),
    CONTENT_STEERING_INITIATED(1, "content_steering"),
    SIGNAL_INITIATED(2, "signal");

    public final int LL;
    public final String LLILLJJLI;

    public int getCode() {
        return this.LL;
    }

    public String getDescription() {
        return this.LLILLJJLI;
    }

    public static EnumC1699200uJq valueOf(String str) {
        return (EnumC1699200uJq) C08FF.LIZ(EnumC1699200uJq.class, str);
    }

    EnumC1699200uJq(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
