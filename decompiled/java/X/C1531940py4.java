package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0py4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531940py4 {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C1532710pzJ LIZ;
    public final C1531930py3 LIZIZ;
    public final List<C1531900py0> LIZJ = new ArrayList();
    public C1531990py9<C1531820pxs> LIZLLL;
    public int LJ;
    public int LJFF;
    public String LJI;
    public String LJII;
    public boolean LJIIIIZZ;

    public final C1532720pzK LIZ() {
        C1532720pzK c1532720pzKLIZIZ;
        C1531930py3 c1531930py3 = this.LIZIZ;
        return (c1531930py3 == null || (c1532720pzKLIZIZ = c1531930py3.LIZIZ()) == null) ? this.LIZ.LJJIII : c1532720pzKLIZIZ;
    }

    public C1531940py4(C1532710pzJ c1532710pzJ, C1531930py3 c1531930py3) {
        this.LIZ = c1532710pzJ;
        this.LIZIZ = c1531930py3;
        this.LJIIIIZZ = c1532710pzJ.LJJIJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007a A[Catch: all -> 0x0094, PHI: r1
      0x007a: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v7 java.lang.String) binds: [B:39:0x0075, B:41:0x0078] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0094, blocks: (B:23:0x003f, B:27:0x005a, B:30:0x0063, B:33:0x006a, B:50:0x008f, B:48:0x0084, B:36:0x006f, B:38:0x0073, B:42:0x007a), top: B:57:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:23:0x003f, B:27:0x005a, B:30:0x0063, B:33:0x006a, B:50:0x008f, B:48:0x0084, B:36:0x006f, B:38:0x0073, B:42:0x007a), top: B:57:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(X.C1531930py3 r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r5 = ""
            X.0pzJ r0 = r8.LIZ
            boolean r0 = r0.LJIIJJI
            r4 = 0
            if (r0 != 0) goto La
            return r4
        La:
            if (r10 == 0) goto L11
            java.lang.String r0 = r8.LJI
            if (r0 != 0) goto L11
            return r4
        L11:
            X.0pzG r0 = X.C1532680pzG.LIZ
            r0.getClass()
            X.0py5 r7 = X.C1532680pzG.LJIJJ
            r3 = 0
            if (r7 == 0) goto Lb8
            boolean r0 = r7.LIZ
            if (r0 == 0) goto Lb8
            boolean r0 = r7.LIZ
            if (r0 == 0) goto L3e
            java.util.Map<java.lang.String, X.0py7> r2 = r7.LIZJ
            java.lang.String r0 = X.C1532680pzG.LJII
            java.lang.String r1 = "default"
            if (r0 != 0) goto L2c
            r0 = r1
        L2c:
            java.lang.Object r6 = r2.get(r0)
            X.0py7 r6 = (X.C1531970py7) r6
            if (r6 != 0) goto L3f
            java.util.Map<java.lang.String, X.0py7> r0 = r7.LIZJ
            java.lang.Object r6 = r0.get(r1)
            X.0py7 r6 = (X.C1531970py7) r6
            if (r6 != 0) goto L3f
        L3e:
            return r4
        L3f:
            java.lang.String r1 = r9.LIZLLL     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "/obj/"
            java.lang.String r1 = kotlin.text.a0.LJJLIL(r1, r0, r5)     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "/"
            java.lang.String r5 = kotlin.text.a0.LJJZ(r1, r0, r5)     // Catch: java.lang.Throwable -> L94
            boolean r0 = kotlin.text.a0.LJJJIL(r5)     // Catch: java.lang.Throwable -> L94
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L93
            if (r5 == 0) goto L93
            if (r10 != 0) goto L6f
            java.util.List<java.lang.String> r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> L94
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L63
            return r4
        L63:
            X.0py8 r0 = r6.LIZ     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> L94
            if (r1 != 0) goto L6a
            r1 = r3
        L6a:
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L7f
            goto L7e
        L6f:
            X.0py8 r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto Lb7
            java.lang.String r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> L94
            if (r1 != 0) goto L7a
            r1 = r3
            if (r0 == 0) goto L7f
        L7a:
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L7f
        L7e:
            r3 = r0
        L7f:
            if (r1 != 0) goto L84
            if (r3 == 0) goto Lb7
            goto L8f
        L84:
            java.lang.String r0 = r9.LIZLLL     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r0, r5, r1, r4)     // Catch: java.lang.Throwable -> L94
            r9.LIZLLL(r0)     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L92
        L8f:
            r9.LIZJ(r3)     // Catch: java.lang.Throwable -> L94
        L92:
            return r2
        L93:
            return r4
        L94:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0pze r3 = X.C1532920pze.LIZJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "failed to handle url "
            r1.append(r0)
            X.0pzK r0 = r9.LIZIZ()
            java.lang.String r0 = r0.LIZ
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r1 = "NetUrlDelegate"
            java.lang.String r0 = "tryHandleAreaInfo"
            r3.LIZIZ(r1, r0, r2)
        Lb7:
            return r4
        Lb8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1531940py4.LIZIZ(X.0py3, boolean):boolean");
    }
}
