package X;

/* JADX INFO: renamed from: X.08FL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08FL {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r2 >= r3.size()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = (java.lang.Object) r3.remove(r2);
        r0 = r5.invoke(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r1 = (java.lang.Object) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r3.add(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r2 < 0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.util.List<T> LIZ(java.util.List<T> r3, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4, kotlin.jvm.functions.Function1<? super T, ? extends T> r5) {
        /*
            java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Throwable -> L37
            r2 = 0
        L5:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L36
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L37
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L1c
            goto L1f
        L1c:
            int r2 = r2 + 1
            goto L5
        L1f:
            if (r2 < 0) goto L36
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L37
            if (r2 >= r0) goto L36
            java.lang.Object r1 = r3.remove(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = r5.invoke(r1)     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L32
            r1 = r0
        L32:
            r3.add(r2, r1)     // Catch: java.lang.Throwable -> L37
            return r3
        L36:
            return r3
        L37:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08FL.LIZ(java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):java.util.List");
    }
}
