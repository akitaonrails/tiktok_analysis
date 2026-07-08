package X;

/* JADX INFO: renamed from: X.08pP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2235708pP {
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(com.ss.android.ugc.aweme.creative.model.CreativeInfo r6, boolean r7) {
        /*
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0Moe r0 = r0.LJJIIJZLJL()
            X.0o7a r0 = r0.getPathAdapter()
            java.lang.String r0 = r0.LIZLLL(r6)
            r5 = 0
            X.C2286708xd.LJIIIIZZ(r0, r5)
            if (r7 == 0) goto Lb2
            java.lang.String r7 = "av_ic_water_mark_9_16.png"
        L18:
            android.app.Application r3 = lth.o.LIZ
            X.0VSJ r2 = new X.0VSJ
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L2d
            boolean r0 = r2.mkdirs()
            if (r0 != 0) goto L2d
        L2b:
            r0 = 0
            return r0
        L2d:
            X.0VSJ r6 = new X.0VSJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.io.File r0 = r2.getAbsoluteFile()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r6.<init>(r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L54
            java.lang.String r0 = r6.getAbsolutePath()
            return r0
        L54:
            android.content.res.AssetManager r0 = r3.getAssets()
            X.0VSV r4 = new X.0VSV     // Catch: java.io.IOException -> La5
            r4.<init>(r6)     // Catch: java.io.IOException -> La5
            java.io.InputStream r3 = r0.open(r7)     // Catch: java.lang.Throwable -> L95
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L95
        L65:
            int r1 = r3.read(r2)     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L8a
            r0 = -1
            if (r1 == r0) goto L70
            r4.write(r2, r5, r1)     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L8a
            goto L65
        L70:
            r4.flush()     // Catch: java.lang.Exception -> L7b java.lang.Throwable -> L8a
            X.C1971207nq.LIZ(r3)     // Catch: java.lang.Throwable -> L95
            X.C1971207nq.LIZ(r4)     // Catch: java.lang.Throwable -> L95
            r0 = 1
            goto L86
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8a
            X.C1971207nq.LIZ(r3)     // Catch: java.lang.Throwable -> L95
            X.C1971207nq.LIZ(r4)     // Catch: java.lang.Throwable -> L95
            r0 = 0
        L86:
            r4.close()     // Catch: java.io.IOException -> La5
            goto Laa
        L8a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8a
            X.C1971207nq.LIZ(r3)     // Catch: java.lang.Throwable -> L95
            X.C1971207nq.LIZ(r4)     // Catch: java.lang.Throwable -> L95
            throw r0     // Catch: java.lang.Throwable -> L95
        L95:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.io.IOException -> La5
            r4.close()     // Catch: java.lang.Throwable -> L9d
            goto La4
        L9d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.io.IOException -> La5
            r1.addSuppressed(r0)     // Catch: java.io.IOException -> La5
        La4:
            throw r1     // Catch: java.io.IOException -> La5
        La5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto Lab
        Laa:
            r5 = r0
        Lab:
            if (r5 == 0) goto L2b
            java.lang.String r0 = r6.getAbsolutePath()
            return r0
        Lb2:
            java.lang.String r7 = "av_ic_water_mark_16_9.png"
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2235708pP.LIZ(com.ss.android.ugc.aweme.creative.model.CreativeInfo, boolean):java.lang.String");
    }
}
