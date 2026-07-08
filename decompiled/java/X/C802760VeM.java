package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802760VeM {
    public static synchronized void LIZ(JSONObject jSONObject) {
        C805630Viz c805630Viz = new C805630Viz();
        C805630Viz.LJ(jSONObject);
        c805630Viz.LIZLLL();
        LIZIZ(c805630Viz.LJ, c805630Viz.LIZLLL);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:50:0x0096
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static boolean LIZIZ(int r12, byte[] r13) {
        /*
            r3 = 0
            X.0VSJ r5 = new X.0VSJ     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = X.C0VX9.LIZLLL()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = "crash_protector.config"
            r5.<init>(r1, r0)     // Catch: java.lang.Throwable -> L9f
            r11 = 0
            r10 = 1
            if (r13 == 0) goto L59
            if (r12 <= 0) goto L59
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L59
            long r6 = r5.length()     // Catch: java.lang.Throwable -> L9f
            long r1 = (long) r12     // Catch: java.lang.Throwable -> L9f
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L59
            X.0VSP r9 = new X.0VSP     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L9f
            r9.<init>(r5)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L9f
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r0]     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L9f
            r7 = 0
        L2b:
            int r6 = r9.read(r8)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L9f
            if (r6 <= 0) goto L53
            int r4 = r7 + r6
            if (r4 > r12) goto L53
            r2 = 0
        L36:
            r1 = r8[r2]     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L9f
            int r0 = r7 + r2
            r0 = r13[r0]     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L9f
            if (r1 == r0) goto L42
            r9.close()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L9f
            goto L59
        L42:
            int r2 = r2 + 1
            if (r2 < r6) goto L36
            r7 = r4
            goto L2b
        L48:
            r0 = move-exception
            goto L50
        L4a:
            r0 = move-exception
            r7 = 0
            goto L50
        L4d:
            r0 = move-exception
            r7 = 0
            r9 = r11
        L50:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9f
        L53:
            X.C2112008Pe.LIZ(r9)     // Catch: java.lang.Throwable -> L9f
            if (r7 != r12) goto L59
            return r10
        L59:
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L62
            r5.delete()     // Catch: java.lang.Throwable -> L9f
        L62:
            if (r13 == 0) goto L9e
            if (r12 <= 0) goto L9e
            X.0VSJ r2 = new X.0VSJ     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = X.C0VX9.LIZLLL()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = "crash_protector.config.tmp"
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L7e
            boolean r0 = r2.createNewFile()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L7e
            return r3
        L7e:
            X.0VSV r1 = new X.0VSV     // Catch: java.lang.Throwable -> L96
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L96
            r1.write(r13, r3, r12)     // Catch: java.lang.Throwable -> L93
            r1.flush()     // Catch: java.lang.Throwable -> L93
            X.C2112008Pe.LIZ(r1)     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r2.renameTo(r5)     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto La3
            return r10
        L93:
            r0 = move-exception
            r11 = r1
            goto L97
        L96:
            r0 = move-exception
        L97:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L96
            X.C2112008Pe.LIZ(r11)     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Throwable -> L9f
        L9e:
            return r3
        L9f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802760VeM.LIZIZ(int, byte[]):boolean");
    }
}
