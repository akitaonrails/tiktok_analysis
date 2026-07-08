package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0NG8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NG8 {
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile AtomicInteger LIZLLL = new AtomicInteger(0);
    public volatile AtomicLong LJ = new AtomicLong(0);
    public final C0NGA LJFF = new C0NE6() { // from class: X.0NGA
        @Override // X.C0NE6
        public final void LIZ(C0NE4 c0ne4) {
            if (c0ne4 == C0NE4.GOLDEN_CACHE) {
                this.LIZ.LIZJ = true;
                this.LIZ.LIZIZ(5);
            }
        }
    };
    public final /* synthetic */ C0NH6 LJI;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0NGA] */
    public C0NG8(C0NH6 c0nh6) {
        this.LJI = c0nh6;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b A[PHI: r10
      0x011b: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:59:0x0117, B:28:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NG8.LIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZIZ(int i) {
        C0NH6 c0nh6 = this.LJI;
        C23250099c.LIZLLL(c0nh6.LJII, null, null, new C0NGB(i, this, c0nh6, null), 3);
    }
}
