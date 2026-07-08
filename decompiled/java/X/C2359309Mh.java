package X;

/* JADX INFO: renamed from: X.09Mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2359309Mh {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x003b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final java.lang.String LIZ(java.lang.String r8) {
        /*
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            android.app.Application r0 = X.C0CHQ.LIZ
            java.lang.String r1 = "_data"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            r5 = 0
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L3b
            X.0WZX r8 = new X.0WZX     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO66YpnakhZTJ8rWhCiD0fhp+6ojzsA="
            r8.<init>(r0, r5)     // Catch: java.lang.Throwable -> L3b
            r6 = r5
            r7 = r5
            android.database.Cursor r2 = X.C2204961BRm.LJJJ(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L35
            int r1 = r2.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L32
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2f
            java.lang.String r5 = r2.getString(r1)     // Catch: java.lang.Throwable -> L32
            goto L35
        L2f:
            java.lang.String r5 = ""
            goto L35
        L32:
            r0 = move-exception
            r5 = r2
            goto L3c
        L35:
            if (r2 == 0) goto L3a
            r2.close()
        L3a:
            return r5
        L3b:
            r0 = move-exception
        L3c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L44
            r5.close()
        L44:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2359309Mh.LIZ(java.lang.String):java.lang.String");
    }
}
