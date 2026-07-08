package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WTT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTT implements RejectedExecutionHandler {
    public static final C0WTU LJ = new ThreadLocal<Integer>() { // from class: X.0WTU
        @Override // java.lang.ThreadLocal
        public final Integer initialValue() {
            return 0;
        }
    };
    public final String LIZ;
    public final AtomicInteger LIZIZ = new AtomicInteger(0);
    public volatile long LIZJ;
    public volatile long LIZLLL;

    public C0WTT(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0139 A[Catch: Exception -> 0x0173, all -> 0x01d3, TryCatch #7 {Exception -> 0x0173, blocks: (B:28:0x009c, B:37:0x00b9, B:65:0x0149, B:67:0x0151, B:69:0x0159, B:71:0x0163, B:41:0x00cc, B:44:0x00de, B:64:0x0139, B:45:0x00e2, B:49:0x00f3, B:63:0x0136, B:53:0x0106, B:57:0x0119, B:58:0x011d, B:62:0x0132), top: B:98:0x009c, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151 A[Catch: Exception -> 0x0173, all -> 0x01d3, TryCatch #7 {Exception -> 0x0173, blocks: (B:28:0x009c, B:37:0x00b9, B:65:0x0149, B:67:0x0151, B:69:0x0159, B:71:0x0163, B:41:0x00cc, B:44:0x00de, B:64:0x0139, B:45:0x00e2, B:49:0x00f3, B:63:0x0136, B:53:0x0106, B:57:0x0119, B:58:0x011d, B:62:0x0132), top: B:98:0x009c, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159 A[Catch: Exception -> 0x0173, all -> 0x01d3, TryCatch #7 {Exception -> 0x0173, blocks: (B:28:0x009c, B:37:0x00b9, B:65:0x0149, B:67:0x0151, B:69:0x0159, B:71:0x0163, B:41:0x00cc, B:44:0x00de, B:64:0x0139, B:45:0x00e2, B:49:0x00f3, B:63:0x0136, B:53:0x0106, B:57:0x0119, B:58:0x011d, B:62:0x0132), top: B:98:0x009c, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c4 A[PHI: r0 r1
      0x01c4: PHI (r0v34 java.lang.Integer) = (r0v20 java.lang.Integer), (r0v56 java.lang.Integer) binds: [B:81:0x01c2, B:73:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r1v6 X.0WTU) = (r1v3 X.0WTU), (r1v10 X.0WTU) binds: [B:81:0x01c2, B:73:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d1 A[PHI: r1
      0x01d1: PHI (r1v8 X.0WTU) = (r1v3 X.0WTU), (r1v10 X.0WTU) binds: [B:81:0x01c2, B:73:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.concurrent.RejectedExecutionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rejectedExecution(java.lang.Runnable r12, java.util.concurrent.ThreadPoolExecutor r13) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WTT.rejectedExecution(java.lang.Runnable, java.util.concurrent.ThreadPoolExecutor):void");
    }
}
