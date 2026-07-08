package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jlO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293440jlO implements InterfaceC1292580jk0, InterfaceC1293690jln, InterfaceC1291770jih {
    public final String LIZ;
    public final AbstractC1292630jk5 LIZIZ;
    public final C20066713fN<LinearGradient> LIZJ = new C20066713fN<>();
    public final C20066713fN<RadialGradient> LIZLLL = new C20066713fN<>();
    public final Matrix LJ = new Matrix();
    public final Path LJFF;
    public final Paint LJI;
    public final RectF LJII;
    public final List<InterfaceC1292610jk3> LJIIIIZZ;
    public final EnumC1293580jlc LJIIIZ;
    public final C1293320jlC LJIIJ;
    public final C1293030jkj LJIIJJI;
    public final C1293110jkr LJIIL;
    public final C1293110jkr LJIILIIL;
    public C1293360jlG LJIILJJIL;
    public final C1291430ji9 LJIILL;
    public final int LJIILLIIL;

    public final int LIZIZ() {
        int iRound = Math.round(this.LJIIL.LIZLLL * this.LJIILLIIL);
        int iRound2 = Math.round(this.LJIILIIL.LIZLLL * this.LJIILLIIL);
        int iRound3 = Math.round(this.LJIIJ.LIZLLL * this.LJIILLIIL);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        this.LJIILL.invalidateSelf();
    }

    @Override // X.InterfaceC1291780jii
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(list2, i);
            if (interfaceC1291780jii instanceof InterfaceC1292610jk3) {
                ((ArrayList) this.LJIIIIZZ).add(interfaceC1291780jii);
            }
        }
    }

    @Override // X.InterfaceC1292580jk0
    public final void LJ(RectF rectF, Matrix matrix) {
        this.LJFF.reset();
        for (int i = 0; i < ((ArrayList) this.LJIIIIZZ).size(); i++) {
            this.LJFF.addPath(((InterfaceC1292610jk3) ListProtector.get(this.LJIIIIZZ, i)).getPath(), matrix);
        }
        this.LJFF.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // X.InterfaceC1291570jiN
    public final <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
        if (t == InterfaceC1292740jkG.LJJ) {
            if (c1292420jjk == null) {
                this.LJIILJJIL = null;
                return;
            }
            C1293360jlG c1293360jlG = new C1293360jlG(c1292420jjk);
            this.LJIILJJIL = c1293360jlG;
            c1293360jlG.LIZ(this);
            this.LIZIZ.LIZIZ(this.LJIILJJIL);
        }
    }

    public C1293440jlO(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5, C1293530jlX c1293530jlX) {
        Path path = new Path();
        this.LJFF = path;
        this.LJII = new RectF();
        this.LJIIIIZZ = new ArrayList();
        this.LJI = new Paint(1);
        this.LIZIZ = abstractC1292630jk5;
        this.LIZ = c1293530jlX.LJI;
        this.LJIILL = c1291430ji9;
        this.LJIIIZ = c1293530jlX.LIZ;
        path.setFillType(c1293530jlX.LIZIZ);
        this.LJIILLIIL = (int) (c1291430ji9.LLILLJJLI.LIZIZ() / 32.0f);
        AbstractC1293310jlB<C1293680jlm, C1293680jlm> abstractC1293310jlBLIZ = c1293530jlX.LIZJ.LIZ();
        this.LJIIJ = (C1293320jlC) abstractC1293310jlBLIZ;
        abstractC1293310jlBLIZ.LIZ(this);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ);
        AbstractC1293310jlB<Integer, Integer> abstractC1293310jlBLIZ2 = c1293530jlX.LIZLLL.LIZ();
        this.LJIIJJI = (C1293030jkj) abstractC1293310jlBLIZ2;
        abstractC1293310jlBLIZ2.LIZ(this);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ2);
        AbstractC1293310jlB<PointF, PointF> abstractC1293310jlBLIZ3 = c1293530jlX.LJ.LIZ();
        this.LJIIL = (C1293110jkr) abstractC1293310jlBLIZ3;
        abstractC1293310jlBLIZ3.LIZ(this);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ3);
        AbstractC1293310jlB<PointF, PointF> abstractC1293310jlBLIZ4 = c1293530jlX.LJFF.LIZ();
        this.LJIILIIL = (C1293110jkr) abstractC1293310jlBLIZ4;
        abstractC1293310jlBLIZ4.LIZ(this);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ4);
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
    @Override // X.InterfaceC1292580jk0
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradientLJ;
        this.LJFF.reset();
        for (int i2 = 0; i2 < ((ArrayList) this.LJIIIIZZ).size(); i2++) {
            this.LJFF.addPath(((InterfaceC1292610jk3) ListProtector.get(this.LJIIIIZZ, i2)).getPath(), matrix);
        }
        this.LJFF.computeBounds(this.LJII, false);
        if (this.LJIIIZ == EnumC1293580jlc.Linear) {
            long jLIZIZ = LIZIZ();
            radialGradientLJ = this.LIZJ.LJ(jLIZIZ);
            if (radialGradientLJ == null) {
                PointF pointFLJ = this.LJIIL.LJ();
                PointF pointFLJ2 = this.LJIILIIL.LJ();
                C1293680jlm c1293680jlmLJ = LJ();
                radialGradientLJ = new LinearGradient(pointFLJ.x, pointFLJ.y, pointFLJ2.x, pointFLJ2.y, c1293680jlmLJ.LIZIZ, c1293680jlmLJ.LIZ, Shader.TileMode.CLAMP);
                this.LIZJ.LJIIIZ(jLIZIZ, radialGradientLJ);
            }
        } else {
            long jLIZIZ2 = LIZIZ();
            radialGradientLJ = this.LIZLLL.LJ(jLIZIZ2);
            if (radialGradientLJ == null) {
                PointF pointFLJ3 = this.LJIIL.LJ();
                PointF pointFLJ4 = this.LJIILIIL.LJ();
                C1293680jlm c1293680jlmLJ2 = LJ();
                int[] iArr = c1293680jlmLJ2.LIZIZ;
                float[] fArr = c1293680jlmLJ2.LIZ;
                radialGradientLJ = new RadialGradient(pointFLJ3.x, pointFLJ3.y, (float) Math.hypot(pointFLJ4.x - r10, pointFLJ4.y - r11), iArr, fArr, Shader.TileMode.CLAMP);
                this.LIZLLL.LJIIIZ(jLIZIZ2, radialGradientLJ);
            }
        }
        this.LJ.set(matrix);
        radialGradientLJ.setLocalMatrix(this.LJ);
        this.LJI.setShader(radialGradientLJ);
        C1293360jlG c1293360jlG = this.LJIILJJIL;
        if (c1293360jlG != null) {
            this.LJI.setColorFilter((ColorFilter) c1293360jlG.LJ());
        }
        this.LJI.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * LJ().intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(this.LJFF, this.LJI);
        C1291650jiV.LIZ();
    }

    @Override // X.InterfaceC1291570jiN
    public final void LJFF(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2) {
        C1291750jif.LIZLLL(c1291740jie, i, list, c1291740jie2, this);
    }
}
