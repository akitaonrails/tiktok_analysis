package X;

/* JADX INFO: renamed from: X.0hUG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205940hUG {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026 A[PHI: r5
      0x0026: PHI (r5v7 java.lang.String) = (r5v0 java.lang.String), (r5v8 java.lang.String) binds: [B:18:0x0024, B:16:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e A[PHI: r5
      0x002e: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v7 java.lang.String), (r5v7 java.lang.String) binds: [B:18:0x0024, B:20:0x0028, B:22:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031 A[PHI: r5 r6
      0x0031: PHI (r5v6 java.lang.String) = (r5v1 java.lang.String), (r5v7 java.lang.String) binds: [B:24:0x002f, B:22:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r6v5 java.lang.String) = (r6v0 java.lang.String), (r6v6 java.lang.String) binds: [B:24:0x002f, B:22:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039 A[PHI: r5 r6
      0x0039: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v6 java.lang.String), (r5v6 java.lang.String) binds: [B:24:0x002f, B:26:0x0033, B:28:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String), (r6v5 java.lang.String) binds: [B:24:0x002f, B:26:0x0033, B:28:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c A[PHI: r5 r6 r7
      0x003c: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v6 java.lang.String) binds: [B:30:0x003a, B:28:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r6v4 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String) binds: [B:30:0x003a, B:28:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:30:0x003a, B:28:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044 A[PHI: r5 r6 r7
      0x0044: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v5 java.lang.String), (r5v5 java.lang.String) binds: [B:30:0x003a, B:32:0x003e, B:34:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v4 java.lang.String), (r6v4 java.lang.String) binds: [B:30:0x003a, B:32:0x003e, B:34:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String), (r7v3 java.lang.String) binds: [B:30:0x003a, B:32:0x003e, B:34:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.poi.PokerBundle LIZ(com.bytedance.i18n.location.api.LocationData r8) {
        /*
            com.ss.android.ugc.aweme.poi.PokerBundle r3 = new com.ss.android.ugc.aweme.poi.PokerBundle
            com.bytedance.i18n.location.api.Address r0 = r8.address
            java.lang.String r2 = ""
            if (r0 == 0) goto L16
            com.bytedance.i18n.location.api.AreaModel r0 = r0.city
            if (r0 == 0) goto L16
            java.lang.Long r0 = r0.geoNameId
            if (r0 == 0) goto L16
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L17
        L16:
            r4 = r2
        L17:
            com.bytedance.i18n.location.api.Address r1 = r8.address
            if (r1 == 0) goto L23
            com.bytedance.i18n.location.api.AreaModel r0 = r1.district
            if (r0 == 0) goto L23
            java.lang.String r5 = r0.name
            if (r5 != 0) goto L26
        L23:
            r5 = r2
            if (r1 == 0) goto L2e
        L26:
            com.bytedance.i18n.location.api.AreaModel r0 = r1.country
            if (r0 == 0) goto L2e
            java.lang.String r6 = r0.name
            if (r6 != 0) goto L31
        L2e:
            r6 = r2
            if (r1 == 0) goto L39
        L31:
            com.bytedance.i18n.location.api.AreaModel r0 = r1.adminArea
            if (r0 == 0) goto L39
            java.lang.String r7 = r0.name
            if (r7 != 0) goto L3c
        L39:
            r7 = r2
            if (r1 == 0) goto L44
        L3c:
            com.bytedance.i18n.location.api.AreaModel r0 = r1.city
            if (r0 == 0) goto L44
            java.lang.String r8 = r0.name
            if (r8 != 0) goto L45
        L44:
            r8 = r2
        L45:
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1205940hUG.LIZ(com.bytedance.i18n.location.api.LocationData):com.ss.android.ugc.aweme.poi.PokerBundle");
    }
}
