package X;

/* JADX INFO: renamed from: X.0j9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1270040j9e {
    None(0),
    Connecting(501),
    ConnectSuccess(502),
    Published(503),
    ConnectStop(504),
    ConnectError(505),
    Disconnected(506),
    Reconnecting(507),
    RtmpFailedBeforeReconnect(601);

    public static final C1270060j9g Companion = new C1270060j9g();
    public final int LL;

    public static final EnumC1270040j9e fromCode(int i) {
        Companion.getClass();
        return C1270060j9g.LIZ(i);
    }

    public static EnumC1270040j9e valueOf(String str) {
        return (EnumC1270040j9e) C08FF.LIZ(EnumC1270040j9e.class, str);
    }

    public final int getCode() {
        return this.LL;
    }

    EnumC1270040j9e(int i) {
        this.LL = i;
    }
}
