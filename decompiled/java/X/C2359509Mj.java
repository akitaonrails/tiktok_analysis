package X;

/* JADX INFO: renamed from: X.09Mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2359509Mj {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) throws java.lang.Throwable {
        /*
            java.lang.String r2 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r2}
            r8 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            X.0WZX r9 = new X.0WZX     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyNY/5YvWla6T/3ebryEewfF6h5KNl8Vl5GTgLopuTjMLGlKw=="
            r9.<init>(r0, r8)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            r7 = r12
            r6 = r11
            r4 = r10
            android.database.Cursor r1 = X.C2204961BRm.LJJJ(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            if (r1 == 0) goto L37
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            if (r0 == 0) goto L37
            int r0 = r1.getColumnIndexOrThrow(r2)     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            r1.close()
            return r0
        L2d:
            r0 = move-exception
            goto L31
        L2f:
            r0 = move-exception
            r1 = r8
        L31:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L3c
            goto L39
        L37:
            if (r1 == 0) goto L3c
        L39:
            r1.close()
        L3c:
            return r8
        L3d:
            r0 = move-exception
            r8 = r1
        L3f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r0 = move-exception
            goto L3f
        L45:
            if (r8 == 0) goto L4a
            r8.close()
        L4a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2359509Mj.LIZ(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
