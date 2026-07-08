package X;

/* JADX INFO: renamed from: X.0XLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC847220XLk {
    UNKNOWN(-1),
    QUIC(0),
    TLS(1),
    HTTP2(2),
    SPDY(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC847220XLk valueOf(String str) {
        return (EnumC847220XLk) C08FF.LIZ(EnumC847220XLk.class, str);
    }

    EnumC847220XLk(int i) {
        this.LL = i;
    }
}
