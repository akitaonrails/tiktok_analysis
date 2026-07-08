package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: renamed from: X.0jlR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293470jlR implements InterfaceC1292590jk1 {
    public final String LIZ;
    public final EnumC1293580jlc LIZIZ;
    public final C1293550jlZ LIZJ;
    public final C1292990jkf LIZLLL;
    public final C1293140jku LJ;
    public final C1293140jku LJFF;
    public final C1292960jkc LJI;
    public final EnumC1293710jlp LJII;
    public final EnumC1293720jlq LJIIIIZZ;
    public final float LJIIIZ;
    public final List<C1292960jkc> LJIIJ;
    public final C1292960jkc LJIIJJI;

    @Override // X.InterfaceC1292590jk1
    public final InterfaceC1291780jii LIZ(final C1291430ji9 c1291430ji9, final AbstractC1292630jk5 abstractC1292630jk5) {
        return new AbstractC1293430jlN(c1291430ji9, abstractC1292630jk5, this) { // from class: X.0jlP
            public final String LJIILJJIL;
            public final C20066713fN<LinearGradient> LJIILL;
            public final C20066713fN<RadialGradient> LJIILLIIL;
            public final RectF LJIIZILJ;
            public final EnumC1293580jlc LJIJ;
            public final int LJIJI;
            public final C1293320jlC LJIJJ;
            public final C1293110jkr LJIJJLI;
            public final C1293110jkr LJIL;

            public final int LIZIZ() {
                int iRound = Math.round(this.LJIJJLI.LIZLLL * this.LJIJI);
                int iRound2 = Math.round(this.LJIL.LIZLLL * this.LJIJI);
                int iRound3 = Math.round(this.LJIJJ.LIZLLL * this.LJIJI);
                int i = iRound != 0 ? iRound * 527 : 17;
                if (iRound2 != 0) {
                    i = i * 31 * iRound2;
                }
                return iRound3 != 0 ? i * 31 * iRound3 : i;
            }

            @Override // X.InterfaceC1291780jii
            public final String getName() {
                return this.LJIILJJIL;
            }

            {
                super(c1291430ji9, abstractC1292630jk5, this.LJII.toPaintCap(), this.LJIIIIZZ.toPaintJoin(), this.LJIIIZ, this.LIZLLL, this.LJI, this.LJIIJ, this.LJIIJJI);
                this.LJIILL = new C20066713fN<>();
                this.LJIILLIIL = new C20066713fN<>();
                this.LJIIZILJ = new RectF();
                this.LJIILJJIL = this.LIZ;
                this.LJIJ = this.LIZIZ;
                this.LJIJI = (int) (c1291430ji9.LLILLJJLI.LIZIZ() / 32.0f);
                AbstractC1293310jlB<C1293680jlm, C1293680jlm> abstractC1293310jlBLIZ = this.LIZJ.LIZ();
                this.LJIJJ = (C1293320jlC) abstractC1293310jlBLIZ;
                abstractC1293310jlBLIZ.LIZ(this);
                abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ);
                AbstractC1293310jlB<PointF, PointF> abstractC1293310jlBLIZ2 = this.LJ.LIZ();
                this.LJIJJLI = (C1293110jkr) abstractC1293310jlBLIZ2;
                abstractC1293310jlBLIZ2.LIZ(this);
                abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ2);
                AbstractC1293310jlB<PointF, PointF> abstractC1293310jlBLIZ3 = this.LJFF.LIZ();
                this.LJIL = (C1293110jkr) abstractC1293310jlBLIZ3;
                abstractC1293310jlBLIZ3.LIZ(this);
                abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ3);
            }

            @Override // X.AbstractC1293430jlN, X.InterfaceC1292580jk0
            public final void LIZ(Canvas canvas, Matrix matrix, int i) {
                LJ(this.LJIIZILJ, matrix);
                if (this.LJIJ == EnumC1293580jlc.Linear) {
                    Paint paint = this.LJIIIIZZ;
                    long jLIZIZ = LIZIZ();
                    LinearGradient linearGradientLJ = this.LJIILL.LJ(jLIZIZ);
                    if (linearGradientLJ == null) {
                        PointF pointFLJ = this.LJIJJLI.LJ();
                        PointF pointFLJ2 = this.LJIL.LJ();
                        C1293680jlm c1293680jlmLJ = LJ();
                        int[] iArr = c1293680jlmLJ.LIZIZ;
                        float[] fArr = c1293680jlmLJ.LIZ;
                        RectF rectF = this.LJIIZILJ;
                        int iWidth = (int) (rectF.left + (rectF.width() / 2.0f) + pointFLJ.x);
                        RectF rectF2 = this.LJIIZILJ;
                        int iHeight = (int) (rectF2.top + (rectF2.height() / 2.0f) + pointFLJ.y);
                        RectF rectF3 = this.LJIIZILJ;
                        int iWidth2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + pointFLJ2.x);
                        RectF rectF4 = this.LJIIZILJ;
                        linearGradientLJ = new LinearGradient(iWidth, iHeight, iWidth2, (int) (rectF4.top + (rectF4.height() / 2.0f) + pointFLJ2.y), iArr, fArr, Shader.TileMode.CLAMP);
                        this.LJIILL.LJIIIZ(jLIZIZ, linearGradientLJ);
                    }
                    paint.setShader(linearGradientLJ);
                } else {
                    Paint paint2 = this.LJIIIIZZ;
                    long jLIZIZ2 = LIZIZ();
                    RadialGradient radialGradientLJ = this.LJIILLIIL.LJ(jLIZIZ2);
                    if (radialGradientLJ == null) {
                        PointF pointFLJ3 = this.LJIJJLI.LJ();
                        PointF pointFLJ4 = this.LJIL.LJ();
                        C1293680jlm c1293680jlmLJ2 = LJ();
                        int[] iArr2 = c1293680jlmLJ2.LIZIZ;
                        float[] fArr2 = c1293680jlmLJ2.LIZ;
                        RectF rectF5 = this.LJIIZILJ;
                        int iWidth3 = (int) (rectF5.left + (rectF5.width() / 2.0f) + pointFLJ3.x);
                        RectF rectF6 = this.LJIIZILJ;
                        int iHeight2 = (int) (rectF6.top + (rectF6.height() / 2.0f) + pointFLJ3.y);
                        RectF rectF7 = this.LJIIZILJ;
                        int iWidth4 = (int) (rectF7.left + (rectF7.width() / 2.0f) + pointFLJ4.x);
                        RectF rectF8 = this.LJIIZILJ;
                        radialGradientLJ = new RadialGradient(iWidth3, iHeight2, (float) Math.hypot(iWidth4 - iWidth3, ((int) ((rectF8.top + (rectF8.height() / 2.0f)) + pointFLJ4.y)) - iHeight2), iArr2, fArr2, Shader.TileMode.CLAMP);
                        this.LJIILLIIL.LJIIIZ(jLIZIZ2, radialGradientLJ);
                    }
                    paint2.setShader(radialGradientLJ);
                }
                super.LIZ(canvas, matrix, i);
            }
        };
    }

    public C1293470jlR(String str, EnumC1293580jlc enumC1293580jlc, C1293550jlZ c1293550jlZ, C1292990jkf c1292990jkf, C1293140jku c1293140jku, C1293140jku c1293140jku2, C1292960jkc c1292960jkc, EnumC1293710jlp enumC1293710jlp, EnumC1293720jlq enumC1293720jlq, float f, List<C1292960jkc> list, C1292960jkc c1292960jkc2) {
        this.LIZ = str;
        this.LIZIZ = enumC1293580jlc;
        this.LIZJ = c1293550jlZ;
        this.LIZLLL = c1292990jkf;
        this.LJ = c1293140jku;
        this.LJFF = c1293140jku2;
        this.LJI = c1292960jkc;
        this.LJII = enumC1293710jlp;
        this.LJIIIIZZ = enumC1293720jlq;
        this.LJIIIZ = f;
        this.LJIIJ = list;
        this.LJIIJJI = c1292960jkc2;
    }
}
