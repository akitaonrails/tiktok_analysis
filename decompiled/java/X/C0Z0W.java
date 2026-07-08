package X;

/* JADX INFO: renamed from: X.0Z0W, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z0W {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r7.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.tars.settings.TarsConfig.Processor LIZ(com.ss.android.ugc.aweme.tars.settings.TarsConfig.Processor r9, com.ss.android.ugc.aweme.tars.settings.TarsConfig.Processor r10) {
        /*
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.config
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.config
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r6.put(r1, r0)
            goto L11
        L29:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List<com.ss.android.ugc.aweme.tars.settings.TarsConfig$TarsMapping> r0 = r9.keyMapping
            java.util.Iterator r5 = r0.iterator()
        L34:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.tars.settings.TarsConfig$TarsMapping r4 = (com.ss.android.ugc.aweme.tars.settings.TarsConfig.TarsMapping) r4
            java.util.List<com.ss.android.ugc.aweme.tars.settings.TarsConfig$TarsMapping> r0 = r10.keyMapping
            java.util.Iterator r3 = r0.iterator()
        L46:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.tars.settings.TarsConfig$TarsMapping r0 = (com.ss.android.ugc.aweme.tars.settings.TarsConfig.TarsMapping) r0
            java.lang.String r1 = r0.sourceKey
            java.lang.String r0 = r4.sourceKey
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L46
            if (r2 == 0) goto L63
            r7.add(r2)
            goto L34
        L63:
            r7.add(r4)
            goto L34
        L67:
            java.util.List<com.ss.android.ugc.aweme.tars.settings.TarsConfig$TarsMapping> r0 = r10.keyMapping
            java.util.Iterator r4 = r0.iterator()
        L6d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.tars.settings.TarsConfig$TarsMapping r3 = (com.ss.android.ugc.aweme.tars.settings.TarsConfig.TarsMapping) r3
            java.util.List<com.ss.android.ugc.aweme.tars.settings.TarsConfig$TarsMapping> r1 = r9.keyMapping
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L89
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L89
        L85:
            r7.add(r3)
            goto L6d
        L89:
            java.util.Iterator r2 = r1.iterator()
        L8d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.tars.settings.TarsConfig$TarsMapping r0 = (com.ss.android.ugc.aweme.tars.settings.TarsConfig.TarsMapping) r0
            java.lang.String r1 = r0.sourceKey
            java.lang.String r0 = r3.sourceKey
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8d
            goto L6d
        La4:
            java.lang.String r5 = r10.type
            int r0 = r5.length()
            if (r0 != 0) goto Lae
            java.lang.String r5 = r9.type
        Lae:
            r8 = 0
            r9 = 8
            com.ss.android.ugc.aweme.tars.settings.TarsConfig$Processor r4 = new com.ss.android.ugc.aweme.tars.settings.TarsConfig$Processor
            r10 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z0W.LIZ(com.ss.android.ugc.aweme.tars.settings.TarsConfig$Processor, com.ss.android.ugc.aweme.tars.settings.TarsConfig$Processor):com.ss.android.ugc.aweme.tars.settings.TarsConfig$Processor");
    }
}
