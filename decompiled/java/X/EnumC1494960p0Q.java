package X;

/* JADX INFO: renamed from: X.0p0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1494960p0Q {
    IDLE,
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_STALLED_SOCKET_POOL,
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_AVAILABLE_SOCKET,
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_DELEGATE,
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_CACHE,
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_APPCACHE,
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOADING_PAC_FILE,
    /* JADX INFO: Fake field, exist only in values array */
    RESOLVING_PROXY_FOR_URL,
    /* JADX INFO: Fake field, exist only in values array */
    RESOLVING_HOST_IN_PAC_FILE,
    /* JADX INFO: Fake field, exist only in values array */
    ESTABLISHING_PROXY_TUNNEL,
    RESOLVING_HOST,
    CONNECTING,
    SSL_HANDSHAKE,
    SENDING_REQUEST,
    WAITING_FOR_RESPONSE,
    READING_RESPONSE;

    public static EnumC1494960p0Q valueOf(String str) {
        return (EnumC1494960p0Q) C08FF.LIZ(EnumC1494960p0Q.class, str);
    }
}
