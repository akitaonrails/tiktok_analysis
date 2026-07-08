package X;

/* JADX INFO: renamed from: X.0oyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1493810oyZ {
    CACHE_UNSET,
    CACHE_VALID,
    CACHE_STALE_BOTH,
    CACHE_STALE_NETCHANGED,
    CACHE_STALE_EXPIRED,
    PRELOAD_BATCH,
    REFRESH_BATCH;

    public static EnumC1493810oyZ valueOf(String str) {
        return (EnumC1493810oyZ) C08FF.LIZ(EnumC1493810oyZ.class, str);
    }
}
