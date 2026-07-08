package X;

/* JADX INFO: renamed from: X.0oyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1493990oyr {
    NOT_SET(0),
    SERVE_FROM_CACHE(2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVE_FROM_PREFER_ADDR(5),
    SERVE_FROM_HTTP_DNS_JOB(6),
    SERVE_FROM_PROC_DNS_JOB(8),
    SERVE_FROM_HARDCODE_HOSTS(9),
    /* JADX INFO: Fake field, exist only in values array */
    SERVE_FROM_BATCH_PRELOAD(19),
    /* JADX INFO: Fake field, exist only in values array */
    SERVE_FROM_ASYNC_BATCH_PRELOAD(20);

    public final int LL;

    public static EnumC1493990oyr valueOf(String str) {
        return (EnumC1493990oyr) C08FF.LIZ(EnumC1493990oyr.class, str);
    }

    EnumC1493990oyr(int i) {
        this.LL = i;
    }
}
