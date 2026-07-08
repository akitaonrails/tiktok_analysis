package X;

import android.graphics.Path;

/* JADX INFO: renamed from: X.0jnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294550jnB implements InterfaceC1295830jpF, InterfaceC1294590jnF {
    public final boolean LIZIZ;
    public final C1295950jpR LIZJ;
    public final C1294450jn1 LIZLLL;
    public boolean LJ;
    public final Path LIZ = new Path();
    public final C1294580jnE LJFF = new C1294580jnE();

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LJ = false;
        this.LIZJ.invalidateSelf();
    }

    @Override // X.InterfaceC1295830jpF
    public final Path getPath() {
        if (this.LJ) {
            return this.LIZ;
        }
        this.LIZ.reset();
        if (this.LIZIZ) {
            this.LJ = true;
            return this.LIZ;
        }
        Path pathLJFF = this.LIZLLL.LJFF();
        if (pathLJFF == null) {
            return this.LIZ;
        }
        this.LIZ.set(pathLJFF);
        this.LIZ.setFillType(Path.FillType.EVEN_ODD);
        this.LJFF.LIZ(this.LIZ);
        this.LJ = true;
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // X.InterfaceC1295810jpD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<X.InterfaceC1295810jpD> r7, java.util.List<X.InterfaceC1295810jpD> r8) {
        /*
            r6 = this;
            r5 = 0
            r4 = 0
        L2:
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r4 >= r0) goto L3c
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r4)
            X.0jpD r3 = (X.InterfaceC1295810jpD) r3
            boolean r0 = r3 instanceof X.C1294570jnD
            if (r0 == 0) goto L2d
            r2 = r3
            X.0jnD r2 = (X.C1294570jnD) r2
            X.0byp r1 = r2.LIZJ
            X.0byp r0 = X.EnumC994250byp.SIMULTANEOUSLY
            if (r1 != r0) goto L2d
            X.0jnE r0 = r6.LJFF
            java.util.List<X.0jnD> r0 = r0.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
            r2.LIZIZ(r6)
        L2a:
            int r4 = r4 + 1
            goto L2
        L2d:
            boolean r0 = r3 instanceof X.InterfaceC1294480jn4
            if (r0 == 0) goto L2a
            if (r5 != 0) goto L38
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L38:
            r5.add(r3)
            goto L2a
        L3c:
            X.0jn1 r0 = r6.LIZLLL
            r0.LJIIJ = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1294550jnB.LIZLLL(java.util.List, java.util.List):void");
    }

    public C1294550jnB(C1295950jpR c1295950jpR, AbstractC1295030jnx abstractC1295030jnx, C1294540jnA c1294540jnA) {
        this.LIZIZ = c1294540jnA.LIZLLL;
        this.LIZJ = c1295950jpR;
        C1294530jn9 c1294530jn9 = c1294540jnA.LIZJ;
        c1294530jn9.getClass();
        C1294450jn1 c1294450jn1 = new C1294450jn1(c1294530jn9.LIZ);
        this.LIZLLL = c1294450jn1;
        abstractC1295030jnx.LIZIZ(c1294450jn1);
        c1294450jn1.LIZ(this);
    }
}
