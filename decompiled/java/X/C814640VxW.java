package X;

/* JADX INFO: renamed from: X.0VxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814640VxW {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C813900VwK LIZ(X.EnumC814620VxU r6, int r7, int r8) {
        /*
            int[] r1 = X.C814630VxV.LIZ
            int r0 = r6.ordinal()
            r4 = r1[r0]
            r3 = 1
            r6 = 18
            r5 = 20
            r2 = 22
            r1 = 3
            r0 = 2
            if (r4 == r3) goto L89
            if (r4 != r0) goto Lbe
            if (r7 == 0) goto L86
            if (r7 == r3) goto L80
            if (r7 == r0) goto L7a
            if (r7 == r1) goto L74
            X.0VxZ r4 = new X.AbstractC814660VxY() { // from class: X.0VxZ
                static {
                    /*
                        X.0VxZ r0 = new X.0VxZ
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0VxZ) X.0VxZ.LIZIZ X.0VxZ
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C814670VxZ.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        java.lang.String r0 = "always"
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C814670VxZ.<init>():void");
                }
            }
        L1f:
            boolean r0 = r4 instanceof X.C814670VxZ
            if (r0 == 0) goto L2d
            java.lang.String r2 = "always_clear"
        L25:
            X.0VwK r1 = new X.0VwK
            java.lang.String r0 = r4.LIZ
            r1.<init>(r3, r0, r2)
            return r1
        L2d:
            boolean r0 = r4 instanceof X.C814680Vxa
            if (r0 != 0) goto L43
            boolean r0 = r4 instanceof X.C814650VxX
            if (r0 == 0) goto Lb8
            r0 = r4
            X.0VxX r0 = (X.C814650VxX) r0
            int r0 = r0.LIZIZ
            if (r8 >= r0) goto L43
        L3c:
            boolean r0 = r4 instanceof X.C814680Vxa
            if (r0 == 0) goto L45
            java.lang.String r2 = "never_clear"
            goto L25
        L43:
            r3 = 0
            goto L3c
        L45:
            boolean r0 = r4 instanceof X.C814650VxX
            if (r0 == 0) goto Lb2
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "local_hour="
            r2.append(r0)
            r2.append(r8)
            r1 = 32
            r2.append(r1)
            if (r3 == 0) goto L71
            java.lang.String r0 = "<"
        L5e:
            r2.append(r0)
            r2.append(r1)
            r0 = r4
            X.0VxX r0 = (X.C814650VxX) r0
            int r0 = r0.LIZIZ
            r2.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r2)
            goto L25
        L71:
            java.lang.String r0 = ">="
            goto L5e
        L74:
            X.0VxX r4 = new X.0VxX
            r4.<init>(r6)
            goto L1f
        L7a:
            X.0VxX r4 = new X.0VxX
            r4.<init>(r5)
            goto L1f
        L80:
            X.0VxX r4 = new X.0VxX
            r4.<init>(r2)
            goto L1f
        L86:
            X.0VxZ r4 = X.C814670VxZ.LIZIZ
            goto L1f
        L89:
            if (r7 == 0) goto Lae
            if (r7 == r3) goto La7
            if (r7 == r0) goto La0
            if (r7 == r1) goto L9a
            r0 = 4
            if (r7 == r0) goto L97
            X.0Vxa r4 = new X.AbstractC814660VxY() { // from class: X.0Vxa
                static {
                    /*
                        X.0Vxa r0 = new X.0Vxa
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0Vxa) X.0Vxa.LIZIZ X.0Vxa
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C814680Vxa.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        java.lang.String r0 = "never"
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C814680Vxa.<init>():void");
                }
            }
            goto L1f
        L97:
            X.0VxZ r4 = X.C814670VxZ.LIZIZ
            goto L1f
        L9a:
            X.0VxX r4 = new X.0VxX
            r4.<init>(r6)
            goto L1f
        La0:
            X.0VxX r4 = new X.0VxX
            r4.<init>(r5)
            goto L1f
        La7:
            X.0VxX r4 = new X.0VxX
            r4.<init>(r2)
            goto L1f
        Lae:
            X.0Vxa r4 = X.C814680Vxa.LIZIZ
            goto L1f
        Lb2:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        Lb8:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        Lbe:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C814640VxW.LIZ(X.0VxU, int, int):X.0VwK");
    }
}
