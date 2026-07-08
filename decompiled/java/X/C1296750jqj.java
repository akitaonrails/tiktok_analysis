package X;

/* JADX INFO: renamed from: X.0jqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296750jqj {
    public final String[] LIZ;
    public final C1496870p3V LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x0009, B:5:0x000c, B:7:0x001d, B:9:0x0025, B:21:0x0041, B:19:0x0039, B:20:0x003c, B:23:0x0046, B:24:0x0049, B:25:0x0058), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1296750jqj LIZ(java.lang.String... r11) {
        /*
            int r0 = r11.length     // Catch: java.io.IOException -> L6d
            okio.ByteString[] r7 = new okio.ByteString[r0]     // Catch: java.io.IOException -> L6d
            X.0p3D r10 = new X.0p3D     // Catch: java.io.IOException -> L6d
            r10.<init>()     // Catch: java.io.IOException -> L6d
            r9 = 0
        L9:
            int r0 = r11.length     // Catch: java.io.IOException -> L6d
            if (r9 >= r0) goto L58
            r8 = r11[r9]     // Catch: java.io.IOException -> L6d
            java.lang.String[] r6 = X.AbstractC1295900jpM.LLILZIL     // Catch: java.io.IOException -> L6d
            r5 = 34
            r10.LJJJZ(r5)     // Catch: java.io.IOException -> L6d
            int r4 = r8.length()     // Catch: java.io.IOException -> L6d
            r3 = 0
            r2 = 0
        L1b:
            if (r3 >= r4) goto L44
            char r1 = r8.charAt(r3)     // Catch: java.io.IOException -> L6d
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L2a
            r0 = r6[r1]     // Catch: java.io.IOException -> L6d
            if (r0 != 0) goto L37
            goto L41
        L2a:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L31
            java.lang.String r0 = "\\u2028"
            goto L37
        L31:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L41
            java.lang.String r0 = "\\u2029"
        L37:
            if (r2 >= r3) goto L3c
            r10.LJLJI(r2, r3, r8)     // Catch: java.io.IOException -> L6d
        L3c:
            r10.LJLJJLL(r0)     // Catch: java.io.IOException -> L6d
            int r2 = r3 + 1
        L41:
            int r3 = r3 + 1
            goto L1b
        L44:
            if (r2 >= r4) goto L49
            r10.LJLJI(r2, r4, r8)     // Catch: java.io.IOException -> L6d
        L49:
            r10.LJJJZ(r5)     // Catch: java.io.IOException -> L6d
            r10.readByte()     // Catch: java.io.IOException -> L6d
            okio.ByteString r0 = r10.LJIJJ()     // Catch: java.io.IOException -> L6d
            r7[r9] = r0     // Catch: java.io.IOException -> L6d
            int r9 = r9 + 1
            goto L9
        L58:
            X.0jqj r2 = new X.0jqj     // Catch: java.io.IOException -> L6d
            java.lang.Object r1 = r11.clone()     // Catch: java.io.IOException -> L6d
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.io.IOException -> L6d
            X.0p3U r0 = X.C1496870p3V.LLILLL     // Catch: java.io.IOException -> L6d
            r0.getClass()     // Catch: java.io.IOException -> L6d
            X.0p3V r0 = X.C1496860p3U.LIZIZ(r7)     // Catch: java.io.IOException -> L6d
            r2.<init>(r1, r0)     // Catch: java.io.IOException -> L6d
            return r2
        L6d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1296750jqj.LIZ(java.lang.String[]):X.0jqj");
    }

    public C1296750jqj(String[] strArr, C1496870p3V c1496870p3V) {
        this.LIZ = strArr;
        this.LIZIZ = c1496870p3V;
    }
}
