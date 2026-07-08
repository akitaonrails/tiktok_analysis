package X;

import com.bytedance.geckox.interceptors.zstd.compress.GeckoCompressConfig;

/* JADX INFO: renamed from: X.0qPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549140qPo {
    public static final GeckoCompressConfig LIZ;
    public static GeckoCompressConfig LIZIZ;

    static {
        new C1549140qPo();
        LIZ = new GeckoCompressConfig(false, null, null, 0, 0, 0, false, null, 0, false, 1023, null);
    }

    public static final GeckoCompressConfig LIZ() {
        if (LIZIZ == null) {
            LIZIZ = (GeckoCompressConfig) C0C64.LJIILLIIL().LJJII(GeckoCompressConfig.class, LIZ, "geckosdk_download_without_decompress_config", true);
        }
        GeckoCompressConfig geckoCompressConfig = LIZIZ;
        return geckoCompressConfig == null ? LIZ : geckoCompressConfig;
    }
}
