package X;

/* JADX INFO: renamed from: X.0p0S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1494980p0S {
    CONNECTION_INFO_UNKNOWN(0),
    CONNECTION_INFO_HTTP1_1(1),
    CONNECTION_INFO_DEPRECATED_SPDY3(3),
    CONNECTION_INFO_HTTP2(4),
    CONNECTION_INFO_QUIC_UNKNOWN_VERSION(5),
    CONNECTION_INFO_HTTP1_0(9);

    public final int LL;

    public static EnumC1494980p0S valueOf(String str) {
        return (EnumC1494980p0S) C08FF.LIZ(EnumC1494980p0S.class, str);
    }

    EnumC1494980p0S(int i) {
        this.LL = i;
    }
}
