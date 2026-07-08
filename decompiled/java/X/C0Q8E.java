package X;

/* JADX INFO: renamed from: X.0Q8E, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q8E {
    public static final EnumC21267218Ko LIZ = EnumC21267218Ko.SEARCH;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:3:0x0002, B:5:0x0016, B:6:0x0022, B:8:0x0028, B:10:0x003c, B:13:0x004b, B:18:0x005d, B:20:0x0061, B:11:0x0043), top: B:30:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.content.Context r13) {
        /*
            r5 = 0
            r12 = 0
            long r3 = X.C2188571Al5.LIZIZ(r13)     // Catch: java.lang.Throwable -> L66
            long r10 = X.C2188571Al5.LIZ(r13)     // Catch: java.lang.Throwable -> L66
            X.01GW r0 = X.C0Q8F.LIZIZ     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L66
            com.ss.android.ugc.aweme.search.performance.memory.SearchMemoryData r0 = (com.ss.android.ugc.aweme.search.performance.memory.SearchMemoryData) r0     // Catch: java.lang.Throwable -> L66
            java.util.Map<java.lang.String, java.lang.Integer> r9 = r0.thresholds     // Catch: java.lang.Throwable -> L66
            if (r9 == 0) goto L43
            java.util.Set r0 = r9.keySet()     // Catch: java.lang.Throwable -> L66
            java.util.List r0 = X.C13LP.LJLLJ(r0)     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> L66
        L22:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L43
            java.lang.Object r7 = r8.next()     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L66
            float r6 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r7)     // Catch: java.lang.Throwable -> L66
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            float r0 = (float) r1     // Catch: java.lang.Throwable -> L66
            float r6 = r6 * r0
            float r0 = (float) r3     // Catch: java.lang.Throwable -> L66
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            java.lang.Object r4 = r9.get(r7)     // Catch: java.lang.Throwable -> L66
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L66
            goto L49
        L43:
            r0 = 1800(0x708, float:2.522E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L66
        L49:
            if (r4 == 0) goto L61
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> L66
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L66
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 * r0
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 > 0) goto L5a
            r0 = 1
            goto L5d
        L5a:
            r0 = 0
            if (r4 == 0) goto L61
        L5d:
            r4.intValue()     // Catch: java.lang.Throwable -> L66
            return r0
        L61:
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L66
            r1 = r5
            goto L72
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L72:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L79
            r5 = r1
        L79:
            java.lang.Void r5 = (java.lang.Void) r5
            if (r5 == 0) goto L83
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r12 = r5.booleanValue()
        L83:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q8E.LIZ(android.content.Context):boolean");
    }
}
