package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0joB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295170joB implements InterfaceC1295800jpC, InterfaceC1294590jnF, InterfaceC1295880jpK {
    public final Path LIZ;
    public final C1294440jn0 LIZIZ;
    public final AbstractC1295030jnx LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final List<InterfaceC1295830jpF> LJFF;
    public final C1295250joJ LJI;
    public final C1295240joI LJII;
    public C1295300joO LJIIIIZZ;
    public final C1295950jpR LJIIIZ;
    public AbstractC1295190joD<Float, Float> LJIIJ;
    public float LJIIJJI;
    public final C1295210joF LJIIL;

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LJIIIZ.invalidateSelf();
    }

    @Override // X.InterfaceC1295810jpD
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(list2, i);
            if (interfaceC1295810jpD instanceof InterfaceC1295830jpF) {
                ((ArrayList) this.LJFF).add(interfaceC1295810jpD);
            }
        }
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJII(C1295400joY c1295400joY, Object obj) {
        C1295210joF c1295210joF;
        C1295210joF c1295210joF2;
        C1295210joF c1295210joF3;
        C1295210joF c1295210joF4;
        C1295210joF c1295210joF5;
        if (obj == InterfaceC1295080jo2.LIZ) {
            this.LJI.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LIZLLL) {
            this.LJII.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJL) {
            C1295300joO c1295300joO = this.LJIIIIZZ;
            if (c1295300joO != null) {
                this.LIZJ.LJIILL(c1295300joO);
            }
            if (c1295400joY == null) {
                this.LJIIIIZZ = null;
                return;
            }
            C1295300joO c1295300joO2 = new C1295300joO(c1295400joY, null);
            this.LJIIIIZZ = c1295300joO2;
            c1295300joO2.LIZ(this);
            this.LIZJ.LIZIZ(this.LJIIIIZZ);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJIIIZ) {
            AbstractC1295190joD<Float, Float> abstractC1295190joD = this.LJIIJ;
            if (abstractC1295190joD != null) {
                abstractC1295190joD.LJIIJ(c1295400joY);
                return;
            }
            C1295300joO c1295300joO3 = new C1295300joO(c1295400joY, null);
            this.LJIIJ = c1295300joO3;
            c1295300joO3.LIZ(this);
            this.LIZJ.LIZIZ(this.LJIIJ);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJ && (c1295210joF5 = this.LJIIL) != null) {
            c1295210joF5.LIZIZ.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJ && (c1295210joF4 = this.LJIIL) != null) {
            c1295210joF4.LIZIZ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJIIJI && (c1295210joF3 = this.LJIIL) != null) {
            c1295210joF3.LIZLLL.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJIIJIL && (c1295210joF2 = this.LJIIL) != null) {
            c1295210joF2.LJ.LJIIJ(c1295400joY);
        } else {
            if (obj != InterfaceC1295080jo2.LJJIJIL || (c1295210joF = this.LJIIL) == null) {
                return;
            }
            c1295210joF.LJFF.LJIIJ(c1295400joY);
        }
    }

    public C1295170joB(C1295950jpR c1295950jpR, AbstractC1295030jnx abstractC1295030jnx, C1295290joN c1295290joN) {
        Path path = new Path();
        this.LIZ = path;
        this.LIZIZ = new C1294440jn0(1);
        this.LJFF = new ArrayList();
        this.LIZJ = abstractC1295030jnx;
        this.LIZLLL = c1295290joN.LIZJ;
        this.LJ = c1295290joN.LJFF;
        this.LJIIIZ = c1295950jpR;
        if (abstractC1295030jnx.LJIIJJI() != null) {
            AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ = abstractC1295030jnx.LJIIJJI().LIZ.LIZ();
            this.LJIIJ = abstractC1295190joDLIZ;
            abstractC1295190joDLIZ.LIZ(this);
            abstractC1295030jnx.LIZIZ(this.LJIIJ);
        }
        if (abstractC1295030jnx.LJIIL() != null) {
            this.LJIIL = new C1295210joF(this, abstractC1295030jnx, abstractC1295030jnx.LJIIL());
        }
        if (c1295290joN.LIZLLL != null && c1295290joN.LJ != null) {
            path.setFillType(c1295290joN.LIZIZ);
            AbstractC1295190joD<Integer, Integer> abstractC1295190joDLIZ2 = c1295290joN.LIZLLL.LIZ();
            this.LJI = (C1295250joJ) abstractC1295190joDLIZ2;
            abstractC1295190joDLIZ2.LIZ(this);
            abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ2);
            AbstractC1295190joD<Integer, Integer> abstractC1295190joDLIZ3 = c1295290joN.LJ.LIZ();
            this.LJII = (C1295240joI) abstractC1295190joDLIZ3;
            abstractC1295190joDLIZ3.LIZ(this);
            abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ3);
            return;
        }
        this.LJI = null;
        this.LJII = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1295800jpC
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.LJ) {
            return;
        }
        C1295250joJ c1295250joJ = this.LJI;
        int iLJIIJJI = c1295250joJ.LJIIJJI(c1295250joJ.LIZIZ(), c1295250joJ.LIZLLL());
        C1294440jn0 c1294440jn0 = this.LIZIZ;
        PointF pointF = C1295100jo4.LIZ;
        c1294440jn0.setColor((Math.max(0, Math.min(255, (int) ((((i / 255.0f) * this.LJII.LJFF().intValue()) / 100.0f) * 255.0f))) << 24) | (iLJIIJJI & 16777215));
        C1295300joO c1295300joO = this.LJIIIIZZ;
        if (c1295300joO != null) {
            this.LIZIZ.setColorFilter((ColorFilter) c1295300joO.LJFF());
        }
        AbstractC1295190joD<Float, Float> abstractC1295190joD = this.LJIIJ;
        if (abstractC1295190joD != null) {
            float fFloatValue = abstractC1295190joD.LJFF().floatValue();
            if (fFloatValue == 0.0f) {
                this.LIZIZ.setMaskFilter(null);
            } else if (fFloatValue != this.LJIIJJI) {
                AbstractC1295030jnx abstractC1295030jnx = this.LIZJ;
                if (abstractC1295030jnx.LJJII == fFloatValue) {
                    blurMaskFilter = abstractC1295030jnx.LJJIII;
                } else {
                    blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC1295030jnx.LJJIII = blurMaskFilter;
                    abstractC1295030jnx.LJJII = fFloatValue;
                }
                this.LIZIZ.setMaskFilter(blurMaskFilter);
            }
            this.LJIIJJI = fFloatValue;
        }
        C1295210joF c1295210joF = this.LJIIL;
        if (c1295210joF != null) {
            c1295210joF.LIZ(this.LIZIZ);
        }
        this.LIZ.reset();
        for (int i2 = 0; i2 < ((ArrayList) this.LJFF).size(); i2++) {
            this.LIZ.addPath(((InterfaceC1295830jpF) ListProtector.get(this.LJFF, i2)).getPath(), matrix);
        }
        canvas.drawPath(this.LIZ, this.LIZIZ);
    }

    @Override // X.InterfaceC1295800jpC
    public final void LJI(RectF rectF, Matrix matrix, boolean z) {
        this.LIZ.reset();
        for (int i = 0; i < ((ArrayList) this.LJFF).size(); i++) {
            this.LIZ.addPath(((InterfaceC1295830jpF) ListProtector.get(this.LJFF, i)).getPath(), matrix);
        }
        this.LIZ.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJ(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
        C1295100jo4.LIZLLL(c1295090jo3, i, list, c1295090jo32, this);
    }
}
