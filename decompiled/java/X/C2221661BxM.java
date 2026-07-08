package X;

import com.bytedance.android.livesdk.livesetting.message.LiveMessageZstdSetting;

/* JADX INFO: renamed from: X.1BxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221661BxM {
    public static final C2221661BxM LIZ = new C2221661BxM();
    public static int LIZIZ = -1;
    public static String LIZJ;
    public static byte[] LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;

    public static boolean LIZIZ() {
        byte[] bArr;
        return (!LiveMessageZstdSetting.INSTANCE.enable() || LIZIZ <= 0 || (bArr = LIZLLL) == null || bArr.length == 0 || LJFF) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] LIZ(com.ss.ugc.live.sdk.message.data.PayloadItem r4) {
        /*
            byte[] r3 = r4.getPayload()     // Catch: java.lang.Throwable -> L3b
            byte[] r1 = X.C2221661BxM.LIZLLL     // Catch: java.lang.Throwable -> L3b
            r2 = 1
            if (r3 != 0) goto Lc
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> L3b
            goto L15
        Lc:
            com.bytedance.compression.zstd.ZstdDictDecompress r0 = new com.bytedance.compression.zstd.ZstdDictDecompress     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            byte[] r1 = com.bytedance.compression.zstd.ZstdDecompress.decompress(r3, r0)     // Catch: java.lang.Throwable -> L3b
        L15:
            int r0 = r1.length
            if (r0 != 0) goto L38
            r0 = 1
        L19:
            if (r0 == 0) goto L3a
            byte[] r0 = r4.getPayload()
            if (r0 == 0) goto L36
            int r0 = r0.length
            if (r0 != 0) goto L34
            r0 = 1
        L25:
            r0 = r0 ^ 1
            if (r0 != r2) goto L36
        L29:
            if (r2 == 0) goto L3a
            X.1BxN r2 = new X.1BxN
            r1 = 0
            java.lang.String r0 = "decompress empty"
            r2.<init>(r0, r1)
            throw r2
        L34:
            r0 = 0
            goto L25
        L36:
            r2 = 0
            goto L29
        L38:
            r0 = 0
            goto L19
        L3a:
            return r1
        L3b:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.1BxN r1 = new X.1BxN
            java.lang.String r0 = "decompress exception"
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221661BxM.LIZ(com.ss.ugc.live.sdk.message.data.PayloadItem):byte[]");
    }
}
