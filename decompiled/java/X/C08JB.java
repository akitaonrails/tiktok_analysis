package X;

import java.util.LinkedList;

/* JADX INFO: renamed from: X.08JB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08JB {
    public final int LIZ;
    public volatile int LIZIZ = -1;
    public final LinkedList<Integer> LIZJ = new LinkedList<>();

    public final synchronized int LIZIZ() {
        return this.LIZIZ;
    }

    public C08JB(int i) {
        this.LIZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:6:0x0010, B:8:0x0022, B:9:0x0027, B:11:0x002d, B:12:0x0039, B:14:0x0040, B:15:0x0043), top: B:21:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZ(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.LinkedList<java.lang.Integer> r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L4a
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L4a
            int r0 = r5.LIZ     // Catch: java.lang.Throwable -> L4a
            if (r1 < r0) goto L10
            java.util.LinkedList<java.lang.Integer> r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L4a
            r0.removeFirst()     // Catch: java.lang.Throwable -> L4a
        L10:
            java.util.LinkedList<java.lang.Integer> r1 = r5.LIZJ     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L4a
            r1.addLast(r0)     // Catch: java.lang.Throwable -> L4a
            java.util.LinkedList<java.lang.Integer> r4 = r5.LIZJ     // Catch: java.lang.Throwable -> L4a
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L4a
            r3 = -1
            if (r0 == 0) goto L43
            java.util.Iterator r2 = r4.iterator()     // Catch: java.lang.Throwable -> L4a
            r1 = 0
        L27:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L39
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L4a
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L4a
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4a
            int r1 = r1 + r0
            goto L27
        L39:
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L4a
            int r1 = r1 / r0
            if (r1 == r3) goto L43
            r5.LIZIZ = r1     // Catch: java.lang.Throwable -> L4a
            goto L48
        L43:
            java.lang.String r0 = "Empty ThroughputRecorder"
            X.C1AF0.LIZJ(r0)     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r5)
            return
        L4a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08JB.LIZ(int):void");
    }
}
