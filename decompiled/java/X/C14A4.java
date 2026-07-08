package X;

import java.util.Map;

/* JADX INFO: renamed from: X.14A4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14A4 {
    public final Map<String, String> LIZ;
    public final C14A3 LIZIZ;
    public final InterfaceC2178208g8 LIZJ;
    public final String LIZLLL;
    public final int LJ;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x004d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZ(byte[] r4, byte[] r5, java.io.InputStream r6) {
        /*
            if (r4 == 0) goto L55
            if (r5 == 0) goto L55
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r0 = "AES"
            r3.<init>(r4, r0)
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r5)
            javax.crypto.spec.GCMParameterSpec r2 = new javax.crypto.spec.GCMParameterSpec
            byte[] r1 = r0.getIV()
            r0 = 128(0x80, float:1.8E-43)
            r2.<init>(r0, r1)
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)
            r0 = 2
            r1.init(r0, r3, r2)
            byte[] r0 = X.C2106208My.LIZIZ(r6)
            byte[] r1 = r1.doFinal(r0)
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            r3.<init>(r0)
            r2 = 0
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L45
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = X.C08KC.LIZJ(r0)     // Catch: java.lang.Throwable -> L45
            X.C2107108Nh.LIZ(r3, r2)
            return r0
        L45:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4a
        L4a:
            r0 = move-exception
            r2 = r1
            goto L4e
        L4d:
            r0 = move-exception
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4d
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        L55:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r6)
            java.lang.String r0 = X.C08KC.LIZJ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14A4.LIZ(byte[], byte[], java.io.InputStream):java.lang.String");
    }

    public C14A4(String str, Map map, InterfaceC2178208g8 interfaceC2178208g8, String str2, int i) {
        C202185149f c202185149f = C202185149f.LIZ;
        this.LIZ = map;
        this.LIZIZ = c202185149f;
        this.LIZJ = interfaceC2178208g8;
        this.LIZLLL = str2;
        this.LJ = i;
    }
}
