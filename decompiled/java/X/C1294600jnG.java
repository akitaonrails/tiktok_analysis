package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* JADX INFO: renamed from: X.0jnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294600jnG implements InterfaceC1294590jnF, InterfaceC1295880jpK, InterfaceC1295830jpF {
    public final String LIZJ;
    public final boolean LIZLLL;
    public final C1295950jpR LJ;
    public final AbstractC1295190joD<?, PointF> LJFF;
    public final AbstractC1295190joD<?, PointF> LJI;
    public final C1295230joH LJII;
    public boolean LJIIJ;
    public final Path LIZ = new Path();
    public final RectF LIZIZ = new RectF();
    public final C1294580jnE LJIIIIZZ = new C1294580jnE();
    public AbstractC1295190joD<Float, Float> LJIIIZ = null;

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LJIIJ = false;
        this.LJ.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    @Override // X.InterfaceC1295830jpF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Path getPath() {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1294600jnG.getPath():android.graphics.Path");
    }

    @Override // X.InterfaceC1295810jpD
    public final String getName() {
        return this.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // X.InterfaceC1295810jpD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<X.InterfaceC1295810jpD> r6, java.util.List<X.InterfaceC1295810jpD> r7) {
        /*
            r5 = this;
            r4 = 0
        L1:
            r0 = r6
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r4 >= r0) goto L37
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r4)
            X.0jpD r3 = (X.InterfaceC1295810jpD) r3
            boolean r0 = r3 instanceof X.C1294570jnD
            if (r0 == 0) goto L2c
            r2 = r3
            X.0jnD r2 = (X.C1294570jnD) r2
            X.0byp r1 = r2.LIZJ
            X.0byp r0 = X.EnumC994250byp.SIMULTANEOUSLY
            if (r1 != r0) goto L2c
            X.0jnE r0 = r5.LJIIIIZZ
            java.util.List<X.0jnD> r0 = r0.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
            r2.LIZIZ(r5)
        L29:
            int r4 = r4 + 1
            goto L1
        L2c:
            boolean r0 = r3 instanceof X.C1294470jn3
            if (r0 == 0) goto L29
            X.0jn3 r3 = (X.C1294470jn3) r3
            X.0joD<java.lang.Float, java.lang.Float> r0 = r3.LIZIZ
            r5.LJIIIZ = r0
            goto L29
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1294600jnG.LIZLLL(java.util.List, java.util.List):void");
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJII(C1295400joY c1295400joY, Object obj) {
        if (obj == InterfaceC1295080jo2.LJIIJJI) {
            this.LJI.LJIIJ(c1295400joY);
        } else if (obj == InterfaceC1295080jo2.LJIILIIL) {
            this.LJFF.LJIIJ(c1295400joY);
        } else {
            if (obj != InterfaceC1295080jo2.LJIIL) {
                return;
            }
            this.LJII.LJIIJ(c1295400joY);
        }
    }

    public C1294600jnG(C1295950jpR c1295950jpR, AbstractC1295030jnx abstractC1295030jnx, C1294610jnH c1294610jnH) {
        this.LIZJ = c1294610jnH.LIZ;
        this.LIZLLL = c1294610jnH.LJ;
        this.LJ = c1295950jpR;
        AbstractC1295190joD<PointF, PointF> abstractC1295190joDLIZ = c1294610jnH.LIZIZ.LIZ();
        this.LJFF = abstractC1295190joDLIZ;
        AbstractC1295190joD<PointF, PointF> abstractC1295190joDLIZ2 = c1294610jnH.LIZJ.LIZ();
        this.LJI = abstractC1295190joDLIZ2;
        AbstractC1295190joD<?, ?> abstractC1295190joDLIZ3 = c1294610jnH.LIZLLL.LIZ();
        this.LJII = (C1295230joH) abstractC1295190joDLIZ3;
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ2);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ3);
        abstractC1295190joDLIZ.LIZ(this);
        abstractC1295190joDLIZ2.LIZ(this);
        abstractC1295190joDLIZ3.LIZ(this);
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJ(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
        C1295100jo4.LIZLLL(c1295090jo3, i, list, c1295090jo32, this);
    }
}
