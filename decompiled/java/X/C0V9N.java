package X;

/* JADX INFO: renamed from: X.0V9N, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V9N {
    public static String LIZ;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.C0V9K r7, double r8, boolean r10) {
        /*
            r5 = 0
            r4 = 1
            if (r10 == 0) goto L52
            if (r7 == 0) goto L4a
            java.util.Map<java.lang.String, java.lang.Double> r0 = r7.LJI
            if (r0 == 0) goto L4a
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4a
            com.bytedance.apm6.cpu.ApmCpuManager r0 = com.bytedance.apm6.cpu.ApmCpuManager.getInstance()
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.getCpuSceneSet()
            java.util.Iterator r3 = r0.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r1 = r3.next()
            java.util.Map<java.lang.String, java.lang.Double> r0 = r7.LJI
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1f
            java.util.Map<java.lang.String, java.lang.Double> r0 = r7.LJI
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r1 = r0.doubleValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L1f
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1f
        L49:
            return r4
        L4a:
            double r1 = r7.LIZJ
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L49
            r4 = 0
            return r4
        L52:
            if (r7 == 0) goto L97
            java.util.Map<java.lang.String, java.lang.Double> r0 = r7.LJII
            if (r0 == 0) goto L97
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L97
            com.bytedance.apm6.cpu.ApmCpuManager r0 = com.bytedance.apm6.cpu.ApmCpuManager.getInstance()
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.getCpuSceneSet()
            java.util.Iterator r3 = r0.iterator()
        L6c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r1 = r3.next()
            java.util.Map<java.lang.String, java.lang.Double> r0 = r7.LJII
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L6c
            java.util.Map<java.lang.String, java.lang.Double> r0 = r7.LJII
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r1 = r0.doubleValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L6c
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6c
        L96:
            return r4
        L97:
            double r1 = r7.LIZLLL
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L96
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0V9N.LIZ(X.0V9K, double, boolean):boolean");
    }
}
