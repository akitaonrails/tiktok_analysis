package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PHT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PHT {
    public C0PHX LIZ;
    public C0PHX LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public C0PHW LJ;
    public String LJFF;
    public String LJI;
    public C0PHW LJII;
    public C0PDG LJIIIIZZ;
    public C0P7A LJIIIZ;
    public C642240PHa LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public C0PIE LJIILIIL;

    public C0PHT() {
        this(null, 511);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0PHW LIZ() {
        /*
            r5 = this;
            r4 = 0
            X.0PHW r0 = r5.LIZIZ()     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto Lc
            X.0PHW r0 = r5.LIZIZ()     // Catch: java.lang.Exception -> L35
            return r0
        Lc:
            X.0PHW r3 = r5.LIZLLL()     // Catch: java.lang.Exception -> L35
            r2 = r4
        L11:
            if (r3 == 0) goto L34
            java.lang.String r1 = r3.LIZ     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r5.LJFF     // Catch: java.lang.Exception -> L35
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L2f
            if (r2 == 0) goto L2e
            X.0PHX r0 = r3.LIZJ     // Catch: java.lang.Exception -> L35
            r0.LJ()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = r0.LJIIIZ     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r5.LJI     // Catch: java.lang.Exception -> L35
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L2f
        L2e:
            r2 = r3
        L2f:
            X.0PHW r3 = r3.LIZ()     // Catch: java.lang.Exception -> L35
            goto L11
        L34:
            return r2
        L35:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "getAllSearchMixAwemes compatEntryCursor == npe"
            X.C1AF0.LJFF(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PHT.LIZ():X.0PHW");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PHT)) {
            return false;
        }
        C0PHT c0pht = (C0PHT) obj;
        return Intrinsics.LJFF(this.LIZ, c0pht.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0pht.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0pht.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0pht.LIZLLL) && Intrinsics.LJFF(this.LJ, c0pht.LJ) && Intrinsics.LJFF(this.LJFF, c0pht.LJFF) && Intrinsics.LJFF(this.LJI, c0pht.LJI) && Intrinsics.LJFF(this.LJII, c0pht.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0pht.LJIIIIZZ);
    }

    public final C0PHW LIZJ() {
        C0PHW c0phw = this.LJ;
        if (c0phw != null) {
            return c0phw.LJ();
        }
        return null;
    }

    public final C0PHW LIZLLL() {
        for (C0PHX c0phx = this.LIZ; c0phx != null; c0phx = c0phx.LIZLLL) {
            c0phx.LJ();
            C0PHW c0phw = (C0PHW) C13LP.LJJJLL(c0phx.LJIIJJI);
            if (c0phw != null) {
                return c0phw;
            }
        }
        return null;
    }

    public final boolean LJFF() {
        return (C504670Jqj.LIZIZ(this.LIZJ) || this.LJIIL) ? false : true;
    }

    public final boolean LJI() {
        return !C504670Jqj.LIZIZ(this.LIZJ) && this.LJIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0PHW LIZIZ() {
        /*
            r4 = this;
            X.0PHW r3 = r4.LIZLLL()
            r2 = 0
        L5:
            if (r3 == 0) goto L28
            java.lang.String r1 = r3.LIZ
            java.lang.String r0 = r4.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L23
            if (r2 == 0) goto L22
            X.0PHX r0 = r3.LIZJ
            r0.LJ()
            java.lang.String r1 = r0.LJIIIZ
            java.lang.String r0 = r4.LIZLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L23
        L22:
            r2 = r3
        L23:
            X.0PHW r3 = r3.LIZ()
            goto L5
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PHT.LIZIZ():X.0PHW");
    }

    public final boolean LJ() {
        if (LJFF()) {
            return false;
        }
        return !C504670Jqj.LIZIZ(this.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0PHT(C640530PAl c640530PAl, int i) {
        c640530PAl = (i & 256) != 0 ? null : c640530PAl;
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = c640530PAl;
        this.LJIIIZ = new C0P7A();
        this.LJIIJ = new C642240PHa(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 16383);
        this.LJIILIIL = new C0PIE() { // from class: X.0PHV
            @Override // X.C0PIE
            public final void LIZJ() {
            }
        };
    }
}
