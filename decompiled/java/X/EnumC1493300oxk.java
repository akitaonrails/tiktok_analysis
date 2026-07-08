package X;

/* JADX INFO: renamed from: X.0oxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1493300oxk {
    NONE(0),
    LAZY_INIT(1),
    PRE_INIT(2),
    FORCE_INIT(3),
    DEPRECATED_API(4),
    BIZ_HTTPDNS_API(5),
    ZSTD_API(6),
    COOKIE_INIT_COMPLETE_API(7);

    public final int LL;

    public static EnumC1493300oxk valueOf(String str) {
        return (EnumC1493300oxk) C08FF.LIZ(EnumC1493300oxk.class, str);
    }

    EnumC1493300oxk(int i) {
        this.LL = i;
    }
}
