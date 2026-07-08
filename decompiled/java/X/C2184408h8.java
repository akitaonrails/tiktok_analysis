package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08h8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2184408h8 {
    public static final /* synthetic */ int LJIIJ = 0;
    public final C2252321DDq LIZ;
    public final C2252321DDq LIZIZ;
    public final C2252331DDr LIZJ;
    public final C2252331DDr LIZLLL;
    public volatile long LJ;
    public volatile long LJFF;
    public volatile boolean LJI;
    public AnonymousClass0956 LJII;
    public int LJIIIIZZ;
    public volatile Function0<Long> LJIIIZ;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            boolean r0 = r6.LJI
            if (r0 != 0) goto L5
            return
        L5:
            kotlin.jvm.functions.Function0<java.lang.Long> r0 = r6.LJIIIZ
            if (r0 == 0) goto L36
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L36
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r3
            r6.LJ = r0
            X.1DDq r1 = r6.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.setValue(r0)
        L28:
            r0 = 0
            r6.LJI = r0
            X.0956 r1 = r6.LJII
            r0 = 0
            if (r1 == 0) goto L33
            r1.LIZIZ(r0)
        L33:
            r6.LJII = r0
            return
        L36:
            long r4 = r6.LJ
            long r2 = java.lang.System.nanoTime()
            long r0 = r6.LJFF
            long r2 = r2 - r0
            long r4 = r4 + r2
            r6.LJ = r4
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2184408h8.LIZ():void");
    }

    public final void LIZIZ() {
        if (this.LJI) {
            LIZ();
        }
        this.LJIIIZ = null;
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJII = null;
        this.LJ = 0L;
        this.LIZ.setValue(0L);
        this.LJIIIIZZ = -1;
    }

    public C2184408h8() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(0L);
        this.LIZ = c2252321DDqLIZ;
        this.LIZIZ = c2252321DDqLIZ;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 4, null, 5);
        this.LIZJ = c2252331DDrLIZIZ;
        this.LIZLLL = c2252331DDrLIZIZ;
        this.LJIIIIZZ = -1;
    }
}
