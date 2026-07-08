package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0joA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295160joA implements InterfaceC1295800jpC, InterfaceC1294590jnF, InterfaceC1295880jpK {
    public final String LIZ;
    public final boolean LIZIZ;
    public final AbstractC1295030jnx LIZJ;
    public final C20066713fN<LinearGradient> LIZLLL = new C20066713fN<>();
    public final C20066713fN<RadialGradient> LJ = new C20066713fN<>();
    public final Path LJFF;
    public final C1294440jn0 LJI;
    public final RectF LJII;
    public final List<InterfaceC1295830jpF> LJIIIIZZ;
    public final EnumC1295590jor LJIIIZ;
    public final C1295120jo6 LJIIJ;
    public final C1295240joI LJIIJJI;
    public final C1295270joL LJIIL;
    public final C1295270joL LJIILIIL;
    public C1295300joO LJIILJJIL;
    public C1295300joO LJIILL;
    public final C1295950jpR LJIILLIIL;
    public final int LJIIZILJ;
    public AbstractC1295190joD<Float, Float> LJIJ;
    public float LJIJI;
    public final C1295210joF LJIJJ;

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LJIILLIIL.invalidateSelf();
    }

    public final int LJIIIIZZ() {
        int iRound = Math.round(this.LJIIL.LIZLLL * this.LJIIZILJ);
        int iRound2 = Math.round(this.LJIILIIL.LIZLLL * this.LJIIZILJ);
        int iRound3 = Math.round(this.LJIIJ.LIZLLL * this.LJIIZILJ);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // X.InterfaceC1295810jpD
    public final String getName() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] LIZIZ(int[] iArr) {
        C1295300joO c1295300joO = this.LJIILL;
        if (c1295300joO != null) {
            Integer[] numArr = (Integer[]) c1295300joO.LJFF();
            int i = 0;
            if (iArr.length != numArr.length) {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(list2, i);
            if (interfaceC1295810jpD instanceof InterfaceC1295830jpF) {
                ((ArrayList) this.LJIIIIZZ).add(interfaceC1295810jpD);
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
        if (obj == InterfaceC1295080jo2.LIZLLL) {
            this.LJIIJJI.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJL) {
            C1295300joO c1295300joO = this.LJIILJJIL;
            if (c1295300joO != null) {
                this.LIZJ.LJIILL(c1295300joO);
            }
            if (c1295400joY == null) {
                this.LJIILJJIL = null;
                return;
            }
            C1295300joO c1295300joO2 = new C1295300joO(c1295400joY, null);
            this.LJIILJJIL = c1295300joO2;
            c1295300joO2.LIZ(this);
            this.LIZJ.LIZIZ(this.LJIILJJIL);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJLIJ) {
            C1295300joO c1295300joO3 = this.LJIILL;
            if (c1295300joO3 != null) {
                this.LIZJ.LJIILL(c1295300joO3);
            }
            if (c1295400joY == null) {
                this.LJIILL = null;
                return;
            }
            this.LIZLLL.LIZIZ();
            this.LJ.LIZIZ();
            C1295300joO c1295300joO4 = new C1295300joO(c1295400joY, null);
            this.LJIILL = c1295300joO4;
            c1295300joO4.LIZ(this);
            this.LIZJ.LIZIZ(this.LJIILL);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJIIIZ) {
            AbstractC1295190joD<Float, Float> abstractC1295190joD = this.LJIJ;
            if (abstractC1295190joD != null) {
                abstractC1295190joD.LJIIJ(c1295400joY);
                return;
            }
            C1295300joO c1295300joO5 = new C1295300joO(c1295400joY, null);
            this.LJIJ = c1295300joO5;
            c1295300joO5.LIZ(this);
            this.LIZJ.LIZIZ(this.LJIJ);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJ && (c1295210joF5 = this.LJIJJ) != null) {
            c1295210joF5.LIZIZ.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJ && (c1295210joF4 = this.LJIJJ) != null) {
            c1295210joF4.LIZIZ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJIIJI && (c1295210joF3 = this.LJIJJ) != null) {
            c1295210joF3.LIZLLL.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIJIIJIL && (c1295210joF2 = this.LJIJJ) != null) {
            c1295210joF2.LJ.LJIIJ(c1295400joY);
        } else {
            if (obj != InterfaceC1295080jo2.LJJIJIL || (c1295210joF = this.LJIJJ) == null) {
                return;
            }
            c1295210joF.LJFF.LJIIJ(c1295400joY);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1295800jpC
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradientLJ;
        if (this.LIZIZ) {
            return;
        }
        this.LJFF.reset();
        for (int i2 = 0; i2 < ((ArrayList) this.LJIIIIZZ).size(); i2++) {
            this.LJFF.addPath(((InterfaceC1295830jpF) ListProtector.get(this.LJIIIIZZ, i2)).getPath(), matrix);
        }
        this.LJFF.computeBounds(this.LJII, false);
        if (this.LJIIIZ == EnumC1295590jor.LINEAR) {
            long jLJIIIIZZ = LJIIIIZZ();
            radialGradientLJ = this.LIZLLL.LJ(jLJIIIIZZ);
            if (radialGradientLJ == null) {
                PointF pointFLJFF = this.LJIIL.LJFF();
                PointF pointFLJFF2 = this.LJIILIIL.LJFF();
                C1295620jou c1295620jouLJFF = LJFF();
                radialGradientLJ = new LinearGradient(pointFLJFF.x, pointFLJFF.y, pointFLJFF2.x, pointFLJFF2.y, LIZIZ(c1295620jouLJFF.LIZIZ), c1295620jouLJFF.LIZ, Shader.TileMode.CLAMP);
                this.LIZLLL.LJIIIZ(jLJIIIIZZ, radialGradientLJ);
            }
        } else {
            long jLJIIIIZZ2 = LJIIIIZZ();
            radialGradientLJ = this.LJ.LJ(jLJIIIIZZ2);
            if (radialGradientLJ == null) {
                PointF pointFLJFF3 = this.LJIIL.LJFF();
                PointF pointFLJFF4 = this.LJIILIIL.LJFF();
                C1295620jou c1295620jouLJFF2 = LJFF();
                int[] iArrLIZIZ = LIZIZ(c1295620jouLJFF2.LIZIZ);
                float[] fArr = c1295620jouLJFF2.LIZ;
                float f = pointFLJFF3.x;
                float f2 = pointFLJFF3.y;
                float fHypot = (float) Math.hypot(pointFLJFF4.x - f, pointFLJFF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradientLJ = new RadialGradient(f, f2, fHypot, iArrLIZIZ, fArr, Shader.TileMode.CLAMP);
                this.LJ.LJIIIZ(jLJIIIIZZ2, radialGradientLJ);
            }
        }
        radialGradientLJ.setLocalMatrix(matrix);
        this.LJI.setShader(radialGradientLJ);
        C1295300joO c1295300joO = this.LJIILJJIL;
        if (c1295300joO != null) {
            this.LJI.setColorFilter((ColorFilter) c1295300joO.LJFF());
        }
        AbstractC1295190joD<Float, Float> abstractC1295190joD = this.LJIJ;
        if (abstractC1295190joD != null) {
            float fFloatValue = abstractC1295190joD.LJFF().floatValue();
            if (fFloatValue == 0.0f) {
                this.LJI.setMaskFilter(null);
            } else if (fFloatValue != this.LJIJI) {
                this.LJI.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.LJIJI = fFloatValue;
        }
        C1295210joF c1295210joF = this.LJIJJ;
        if (c1295210joF != null) {
            c1295210joF.LIZ(this.LJI);
        }
        C1294440jn0 c1294440jn0 = this.LJI;
        PointF pointF = C1295100jo4.LIZ;
        c1294440jn0.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * this.LJIIJJI.LJFF().intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(this.LJFF, this.LJI);
    }

    @Override // X.InterfaceC1295800jpC
    public final void LJI(RectF rectF, Matrix matrix, boolean z) {
        this.LJFF.reset();
        for (int i = 0; i < ((ArrayList) this.LJIIIIZZ).size(); i++) {
            this.LJFF.addPath(((InterfaceC1295830jpF) ListProtector.get(this.LJIIIIZZ, i)).getPath(), matrix);
        }
        this.LJFF.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public C1295160joA(C1295950jpR c1295950jpR, C1294720jnS c1294720jnS, AbstractC1295030jnx abstractC1295030jnx, C1295380joW c1295380joW) {
        Path path = new Path();
        this.LJFF = path;
        this.LJI = new C1294440jn0(1);
        this.LJII = new RectF();
        this.LJIIIIZZ = new ArrayList();
        this.LJIJI = 0.0f;
        this.LIZJ = abstractC1295030jnx;
        this.LIZ = c1295380joW.LJI;
        this.LIZIZ = c1295380joW.LJII;
        this.LJIILLIIL = c1295950jpR;
        this.LJIIIZ = c1295380joW.LIZ;
        path.setFillType(c1295380joW.LIZIZ);
        this.LJIIZILJ = (int) (c1294720jnS.LIZIZ() / 32.0f);
        AbstractC1295190joD<C1295620jou, C1295620jou> abstractC1295190joDLIZ = c1295380joW.LIZJ.LIZ();
        this.LJIIJ = (C1295120jo6) abstractC1295190joDLIZ;
        abstractC1295190joDLIZ.LIZ(this);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ);
        AbstractC1295190joD<Integer, Integer> abstractC1295190joDLIZ2 = c1295380joW.LIZLLL.LIZ();
        this.LJIIJJI = (C1295240joI) abstractC1295190joDLIZ2;
        abstractC1295190joDLIZ2.LIZ(this);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ2);
        AbstractC1295190joD<PointF, PointF> abstractC1295190joDLIZ3 = c1295380joW.LJ.LIZ();
        this.LJIIL = (C1295270joL) abstractC1295190joDLIZ3;
        abstractC1295190joDLIZ3.LIZ(this);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ3);
        AbstractC1295190joD<PointF, PointF> abstractC1295190joDLIZ4 = c1295380joW.LJFF.LIZ();
        this.LJIILIIL = (C1295270joL) abstractC1295190joDLIZ4;
        abstractC1295190joDLIZ4.LIZ(this);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ4);
        if (abstractC1295030jnx.LJIIJJI() != null) {
            AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ5 = abstractC1295030jnx.LJIIJJI().LIZ.LIZ();
            this.LJIJ = abstractC1295190joDLIZ5;
            abstractC1295190joDLIZ5.LIZ(this);
            abstractC1295030jnx.LIZIZ(this.LJIJ);
        }
        if (abstractC1295030jnx.LJIIL() != null) {
            this.LJIJJ = new C1295210joF(this, abstractC1295030jnx, abstractC1295030jnx.LJIIL());
        }
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJ(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
        C1295100jo4.LIZLLL(c1295090jo3, i, list, c1295090jo32, this);
    }
}
