package X;

/* JADX INFO: renamed from: X.0j63, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267810j63 implements InterfaceC1272840jEA {
    public C1267790j61 LL;

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[Catch: all -> 0x008b, TryCatch #0 {, blocks: (B:5:0x0006, B:7:0x0023, B:8:0x002d, B:9:0x0031, B:11:0x0037, B:13:0x0044, B:15:0x0048, B:17:0x0050, B:19:0x0059, B:22:0x0062, B:26:0x0073, B:29:0x0079, B:31:0x007d, B:33:0x0087, B:23:0x0065, B:25:0x006c), top: B:41:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0006, B:7:0x0023, B:8:0x002d, B:9:0x0031, B:11:0x0037, B:13:0x0044, B:15:0x0048, B:17:0x0050, B:19:0x0059, B:22:0x0062, B:26:0x0073, B:29:0x0079, B:31:0x007d, B:33:0x0087, B:23:0x0065, B:25:0x006c), top: B:41:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.ttlivestreamer.core.buffer.k LIZ(int r7, int r8, java.lang.String r9) {
        /*
            r6 = this;
            X.0j61 r3 = r6.LL
            r0 = 0
            if (r3 == 0) goto L8f
            monitor-enter(r3)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L8b
            r2.append(r7)     // Catch: java.lang.Throwable -> L8b
            r1 = 120(0x78, float:1.68E-43)
            r2.append(r1)     // Catch: java.lang.Throwable -> L8b
            r2.append(r8)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<X.0j65>> r1 = r3.LJFF     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r5 = r1.get(r2)     // Catch: java.lang.Throwable -> L8b
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L8b
            if (r5 != 0) goto L2d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8b
            r5.<init>()     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<X.0j65>> r1 = r3.LJFF     // Catch: java.lang.Throwable -> L8b
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L8b
        L2d:
            java.util.Iterator r2 = r5.iterator()     // Catch: java.lang.Throwable -> L8b
        L31:
            boolean r1 = r2.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L5e
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L8b
            r1 = r4
            X.0j65 r1 = (X.C1267830j65) r1     // Catch: java.lang.Throwable -> L8b
            int r1 = r1.LIZIZ()     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L31
        L44:
            X.0j65 r4 = (X.C1267830j65) r4     // Catch: java.lang.Throwable -> L8b
            if (r4 != 0) goto L65
            int r2 = r5.size()     // Catch: java.lang.Throwable -> L8b
            int r1 = r3.LIZ     // Catch: java.lang.Throwable -> L8b
            if (r2 >= r1) goto L73
            X.0j65 r4 = new X.0j65     // Catch: java.lang.Throwable -> L8b
            r4.<init>(r3, r7, r8)     // Catch: java.lang.Throwable -> L8b
            com.ss.ttlivestreamer.core.buffer.k r1 = r4.LIZ     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L8e
            int r1 = r1.getTextureId()     // Catch: java.lang.Throwable -> L8b
            goto L60
        L5e:
            r4 = r0
            goto L44
        L60:
            if (r1 <= 0) goto L8e
            r5.add(r4)     // Catch: java.lang.Throwable -> L8b
        L65:
            r4.LIZJ(r9)     // Catch: java.lang.Throwable -> L8b
            com.ss.ttlivestreamer.core.buffer.k r2 = r4.LIZ     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L73
            float[] r1 = X.C1273510jFF.LIZIZ()     // Catch: java.lang.Throwable -> L8b
            r2.setTransformMatrixArray(r1)     // Catch: java.lang.Throwable -> L8b
        L73:
            boolean r1 = r3.LJ     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L85
            if (r4 == 0) goto L89
            com.ss.ttlivestreamer.core.buffer.k r2 = r4.LIZ     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L85
            android.graphics.Matrix r1 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L8b
            r1.<init>()     // Catch: java.lang.Throwable -> L8b
            r2.setTransformMatrix(r1)     // Catch: java.lang.Throwable -> L8b
        L85:
            if (r4 == 0) goto L89
            com.ss.ttlivestreamer.core.buffer.k r0 = r4.LIZ     // Catch: java.lang.Throwable -> L8b
        L89:
            monitor-exit(r3)
            return r0
        L8b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L8e:
            monitor-exit(r3)
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1267810j63.LIZ(int, int, java.lang.String):com.ss.ttlivestreamer.core.buffer.k");
    }
}
