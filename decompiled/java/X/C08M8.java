package X;

/* JADX INFO: renamed from: X.08M8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08M8 {
    public static volatile ClassLoader LIZ;
    public static volatile Thread LIZIZ;

    public static synchronized ClassLoader LIZ() {
        if (LIZ == null) {
            LIZ = LIZIZ();
        }
        return LIZ;
    }

    public static synchronized ClassLoader LIZIZ() {
        ClassLoader contextClassLoader = null;
        if (LIZIZ == null) {
            LIZIZ = LIZJ();
            if (LIZIZ == null) {
                return null;
            }
        }
        synchronized (LIZIZ) {
            try {
                contextClassLoader = LIZIZ.getContextClassLoader();
            } catch (SecurityException th) {
                th.getMessage();
            } finally {
            }
        }
        return contextClassLoader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r1 = new X.C08M7(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r1.setContextClassLoader(null);
        r1.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r0.getMessage();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.Thread LIZJ() {
        /*
            java.lang.Class<X.08M8> r10 = X.C08M8.class
            monitor-enter(r10)
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L80
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L80
            java.lang.ThreadGroup r9 = r0.getThreadGroup()     // Catch: java.lang.Throwable -> L80
            r7 = 0
            if (r9 != 0) goto L14
            monitor-exit(r10)
            return r7
        L14:
            java.lang.Class<java.lang.Void> r8 = java.lang.Void.class
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L80
            int r4 = r9.activeGroupCount()     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            java.lang.ThreadGroup[] r3 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            r9.enumerate(r3)     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            r6 = 0
            r2 = 0
        L22:
            if (r2 >= r4) goto L35
            r5 = r3[r2]     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            java.lang.String r1 = "dynamiteLoader"
            java.lang.String r0 = r5.getName()     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            boolean r0 = r1.equals(r0)     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            if (r0 != 0) goto L3c
            int r2 = r2 + 1
            goto L22
        L35:
            java.lang.ThreadGroup r5 = new java.lang.ThreadGroup     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            java.lang.String r0 = "dynamiteLoader"
            r5.<init>(r9, r0)     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
        L3c:
            int r4 = r5.activeCount()     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            java.lang.Thread[] r3 = new java.lang.Thread[r4]     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            r5.enumerate(r3)     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
        L45:
            if (r6 >= r4) goto L58
            r1 = r3[r6]     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            java.lang.String r2 = "GmsDynamite"
            java.lang.String r0 = r1.getName()     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            boolean r0 = r2.equals(r0)     // Catch: java.lang.SecurityException -> L6f java.lang.Throwable -> L7a
            if (r0 != 0) goto L77
            int r6 = r6 + 1
            goto L45
        L58:
            X.08M7 r1 = new X.08M7     // Catch: java.lang.SecurityException -> L69 java.lang.Throwable -> L7a
            r1.<init>(r5)     // Catch: java.lang.SecurityException -> L69 java.lang.Throwable -> L7a
            r1.setContextClassLoader(r7)     // Catch: java.lang.SecurityException -> L64 java.lang.Throwable -> L7a
            r1.start()     // Catch: java.lang.SecurityException -> L64 java.lang.Throwable -> L7a
            goto L77
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L80
            goto L74
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L80
            r1 = r7
            goto L74
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L80
            r1 = r7
        L74:
            r0.getMessage()     // Catch: java.lang.Throwable -> L7a
        L77:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r10)
            return r1
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L80
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L80
        L80:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08M8.LIZJ():java.lang.Thread");
    }
}
