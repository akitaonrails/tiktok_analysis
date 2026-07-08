package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0hyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224530hyF {
    public final InterfaceC1224270hxp LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final C099F LJ = C090F.LIZIZ();
    public String LJFF = "";

    public final void LIZIZ() {
        if (this.LIZ.LJIILLIIL().LIZ().size() <= 1) {
            return;
        }
        Iterator<InterfaceC1224210hxj> it2 = this.LIZ.LJIILLIIL().LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ().LJJIIJ();
        }
    }

    public final void LIZJ() {
        int i = this.LIZ.LJIILLIIL().LIZIZ().LIZ.LJIIIZ;
        List<InterfaceC1224210hxj> listLIZ = this.LIZ.LJIILLIIL().LIZ();
        if (i < 0 || i >= listLIZ.size() || this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        this.LJFF = ((InterfaceC1224210hxj) ListProtector.get(listLIZ, i)).LIZ().LIZIZ;
        InterfaceC1224480hyA interfaceC1224480hyALJII = this.LIZ.LJII();
        if (interfaceC1224480hyALJII != null) {
            interfaceC1224480hyALJII.LIZJ();
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ)), null, null, new C1224520hyE(listLIZ, i, this, null), 3);
        this.LIZJ = true;
    }

    public C1224530hyF(InterfaceC1224270hxp interfaceC1224270hxp) {
        this.LIZ = interfaceC1224270hxp;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r8, X.C1224140hxc r9, X.InterfaceC1364105Vn r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1224540hyG
            if (r0 == 0) goto L5d
            r4 = r10
            X.0hyG r4 = (X.C1224540hyG) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r6 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 == r1) goto L6b
            if (r0 == r2) goto L7a
            if (r0 != r3) goto L63
            X.C155000ia.LIZIZ(r6)
        L28:
            return r6
        L29:
            X.C155000ia.LIZIZ(r6)
            java.lang.String r0 = r7.LJFF
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 != 0) goto L3d
            r4.LLILLL = r1
            java.lang.Object r6 = r9.invoke(r4)
            if (r6 != r5) goto L6e
            return r5
        L3d:
            boolean r0 = r7.LIZIZ
            if (r0 != 0) goto L48
            boolean r0 = r7.LIZJ
            if (r0 == 0) goto L48
            r7.LIZIZ = r1
            goto L6f
        L48:
            X.099F r2 = r7.LJ
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "invoke refresh again before first invoke get result"
            r1.<init>(r0)
            r2.LJJJJJ(r1)
            r4.LLILLL = r3
            java.lang.Object r6 = r9.invoke(r4)
            if (r6 != r5) goto L28
            return r5
        L5d:
            X.0hyG r4 = new X.0hyG
            r4.<init>(r7, r10)
            goto L12
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6b:
            X.C155000ia.LIZIZ(r6)
        L6e:
            return r6
        L6f:
            X.099F r0 = r7.LJ     // Catch: java.lang.Exception -> L80
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L80
            java.lang.Object r6 = r0.LJLIIIL(r4)     // Catch: java.lang.Exception -> L80
            if (r6 != r5) goto L7d
            return r5
        L7a:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L80
        L7d:
            X.0hwr r6 = (X.AbstractC1223670hwr) r6     // Catch: java.lang.Exception -> L80
            return r6
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0hws r6 = new X.0hws
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1224530hyF.LIZ(java.lang.String, X.0hxc, X.05Vn):java.lang.Object");
    }
}
