package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jo9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1295150jo9 implements InterfaceC1294590jnF, InterfaceC1295880jpK, InterfaceC1295800jpC {
    public final C1295950jpR LJ;
    public final AbstractC1295030jnx LJFF;
    public final float[] LJII;
    public final C1294440jn0 LJIIIIZZ;
    public final C1295230joH LJIIIZ;
    public final C1295240joI LJIIJ;
    public final List<AbstractC1295190joD<?, Float>> LJIIJJI;
    public final C1295230joH LJIIL;
    public C1295300joO LJIILIIL;
    public AbstractC1295190joD<Float, Float> LJIILJJIL;
    public float LJIILL;
    public final C1295210joF LJIILLIIL;
    public final PathMeasure LIZ = new PathMeasure();
    public final Path LIZIZ = new Path();
    public final Path LIZJ = new Path();
    public final RectF LIZLLL = new RectF();
    public final List<C1295680jp0> LJI = new ArrayList();

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LJ.invalidateSelf();
    }

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
        C1295680jp0 c1295680jp0 = null;
        C1294570jnD c1294570jnD = null;
        for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
            InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(list, size);
            if (interfaceC1295810jpD instanceof C1294570jnD) {
                C1294570jnD c1294570jnD2 = (C1294570jnD) interfaceC1295810jpD;
                if (c1294570jnD2.LIZJ == EnumC994250byp.INDIVIDUALLY) {
                    c1294570jnD = c1294570jnD2;
                }
            }
        }
        if (c1294570jnD != null) {
            c1294570jnD.LIZIZ(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            InterfaceC1295810jpD interfaceC1295810jpD2 = (InterfaceC1295810jpD) ListProtector.get(list2, size2);
            if (interfaceC1295810jpD2 instanceof C1294570jnD) {
                C1294570jnD c1294570jnD3 = (C1294570jnD) interfaceC1295810jpD2;
                if (c1294570jnD3.LIZJ == EnumC994250byp.INDIVIDUALLY) {
                    if (c1295680jp0 != null) {
                        ((ArrayList) this.LJI).add(c1295680jp0);
                    }
                    c1295680jp0 = new C1295680jp0(c1294570jnD3);
                    c1294570jnD3.LIZIZ(this);
                }
            }
            if (interfaceC1295810jpD2 instanceof InterfaceC1295830jpF) {
                if (c1295680jp0 == null) {
                    c1295680jp0 = new C1295680jp0(c1294570jnD);
                }
                ((ArrayList) c1295680jp0.LIZ).add(interfaceC1295810jpD2);
            }
        }
        if (c1295680jp0 != null) {
            ((ArrayList) this.LJI).add(c1295680jp0);
        }
    }

    @Override // X.InterfaceC1295760jp8
    public void LJII(C1295400joY c1295400joY, Object obj) {
        C1295210joF c1295210joF;
        C1295210joF c1295210joF2;
        C1295210joF c1295210joF3;
        C1295210joF c1295210joF4;
        C1295210joF c1295210joF5;
        if (obj == InterfaceC1295080jo2.LIZLLL) {
            this.LJIIJ.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJIJ) {
            this.LJIIIZ.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJL) {
            C1295300joO c1295300joO = this.LJIILIIL;
            if (c1295300joO != null) {
                this.LJFF.LJIILL(c1295300joO);
            }
            if (c1295400joY == null) {
                this.LJIILIIL = null;
                return;
            }
            C1295300joO c1295300joO2 = new C1295300joO(c1295400joY, null);
            this.LJIILIIL = c1295300joO2;
            c1295300joO2.LIZ(this);
            this.LJFF.LIZIZ(this.LJIILIIL);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJIIIZ) {
            AbstractC1295190joD<Float, Float> abstractC1295190joD = this.LJIILJJIL;
            if (abstractC1295190joD != null) {
                abstractC1295190joD.LJIIJ(c1295400joY);
                return;
            }
            C1295300joO c1295300joO3 = new C1295300joO(c1295400joY, null);
            this.LJIILJJIL = c1295300joO3;
            c1295300joO3.LIZ(this);
            this.LJFF.LIZIZ(this.LJIILJJIL);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJ && (c1295210joF5 = this.LJIILLIIL) != null) {
            c1295210joF5.LIZIZ.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJ && (c1295210joF4 = this.LJIILLIIL) != null) {
            c1295210joF4.LIZIZ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJIIJI && (c1295210joF3 = this.LJIILLIIL) != null) {
            c1295210joF3.LIZLLL.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJIIJIL && (c1295210joF2 = this.LJIILLIIL) != null) {
            c1295210joF2.LJ.LJIIJ(c1295400joY);
        } else {
            if (obj != InterfaceC1295080jo2.LJJIJIL || (c1295210joF = this.LJIILLIIL) == null) {
                return;
            }
            c1295210joF.LJFF.LJIIJ(c1295400joY);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0220  */
    @Override // X.InterfaceC1295800jpC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1295150jo9.LIZ(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // X.InterfaceC1295800jpC
    public final void LJI(RectF rectF, Matrix matrix, boolean z) {
        this.LIZIZ.reset();
        for (int i = 0; i < ((ArrayList) this.LJI).size(); i++) {
            C1295680jp0 c1295680jp0 = (C1295680jp0) ListProtector.get(this.LJI, i);
            for (int i2 = 0; i2 < ((ArrayList) c1295680jp0.LIZ).size(); i2++) {
                this.LIZIZ.addPath(((InterfaceC1295830jpF) ListProtector.get(c1295680jp0.LIZ, i2)).getPath(), matrix);
            }
        }
        this.LIZIZ.computeBounds(this.LIZLLL, false);
        float fLJIIJJI = this.LJIIIZ.LJIIJJI();
        RectF rectF2 = this.LIZLLL;
        float f = fLJIIJJI / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.LIZLLL);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJ(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
        C1295100jo4.LIZLLL(c1295090jo3, i, list, c1295090jo32, this);
    }

    public AbstractC1295150jo9(C1295950jpR c1295950jpR, AbstractC1295030jnx abstractC1295030jnx, Paint.Cap cap, Paint.Join join, float f, C1295460joe c1295460joe, C1295020jnw c1295020jnw, List<C1295020jnw> list, C1295020jnw c1295020jnw2) {
        C1294440jn0 c1294440jn0 = new C1294440jn0(1);
        this.LJIIIIZZ = c1294440jn0;
        this.LJIILL = 0.0f;
        this.LJ = c1295950jpR;
        this.LJFF = abstractC1295030jnx;
        c1294440jn0.setStyle(Paint.Style.STROKE);
        c1294440jn0.setStrokeCap(cap);
        c1294440jn0.setStrokeJoin(join);
        c1294440jn0.setStrokeMiter(f);
        this.LJIIJ = (C1295240joI) c1295460joe.LIZ();
        this.LJIIIZ = (C1295230joH) c1295020jnw.LIZ();
        if (c1295020jnw2 == null) {
            this.LJIIL = null;
        } else {
            this.LJIIL = (C1295230joH) c1295020jnw2.LIZ();
        }
        this.LJIIJJI = new ArrayList(list.size());
        this.LJII = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.LJIIJJI).add(((C1295020jnw) ListProtector.get(list, i)).LIZ());
        }
        abstractC1295030jnx.LIZIZ(this.LJIIJ);
        abstractC1295030jnx.LIZIZ(this.LJIIIZ);
        for (int i2 = 0; i2 < ((ArrayList) this.LJIIJJI).size(); i2++) {
            abstractC1295030jnx.LIZIZ((AbstractC1295190joD) ListProtector.get(this.LJIIJJI, i2));
        }
        C1295230joH c1295230joH = this.LJIIL;
        if (c1295230joH != null) {
            abstractC1295030jnx.LIZIZ(c1295230joH);
        }
        this.LJIIJ.LIZ(this);
        this.LJIIIZ.LIZ(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((AbstractC1295190joD) ListProtector.get(this.LJIIJJI, i3)).LIZ(this);
        }
        C1295230joH c1295230joH2 = this.LJIIL;
        if (c1295230joH2 != null) {
            c1295230joH2.LIZ(this);
        }
        if (abstractC1295030jnx.LJIIJJI() != null) {
            AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ = abstractC1295030jnx.LJIIJJI().LIZ.LIZ();
            this.LJIILJJIL = abstractC1295190joDLIZ;
            abstractC1295190joDLIZ.LIZ(this);
            abstractC1295030jnx.LIZIZ(this.LJIILJJIL);
        }
        if (abstractC1295030jnx.LJIIL() != null) {
            this.LJIILLIIL = new C1295210joF(this, abstractC1295030jnx, abstractC1295030jnx.LJIIL());
        }
    }
}
