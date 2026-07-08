package X;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: X.191I, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C191I extends C191C {
    public Matrix LLILZIL;
    public Matrix LLILZLL;
    public C191K LLIZ;

    @Override // X.C191C
    public final void LIZIZ(boolean z) {
        C214696190k.LIZ.LJFF(this.LLILLL, null);
        C191K c191k = this.LLIZ;
        View view = this.LLILLL;
        float f = c191k.LIZ;
        float f2 = c191k.LIZIZ;
        float f3 = c191k.LIZJ;
        float f4 = c191k.LIZLLL;
        float f5 = c191k.LJ;
        float f6 = c191k.LJFF;
        float f7 = c191k.LJI;
        float f8 = c191k.LJII;
        C786410Ut5.Jc(view, f);
        C786410Ut5.ed(view, f2);
        C14K9.LJIL(view, f3);
        C786410Ut5.Ob(view, f4);
        C786410Ut5.pc(view, f5);
        C786410Ut5.Hb(view, f6);
        C786410Ut5.Ib(view, f7);
        C786410Ut5.Ab(view, f8);
    }

    @Override // X.C191C
    public final C191E LIZJ(boolean z) {
        return new C191M(new C191N(this.LLILLL, new C19LL(Matrix.class, 9), new C19727712Gl(), this.LLILZIL, this.LLILZLL, null));
    }

    @Override // X.C191C
    public final void LIZ(View view, View view2, View view3) {
        super.LIZ(view, view2, view3);
        this.LLIZ = new C191K(view3);
        view.getTranslationX();
        view2.getTranslationX();
        view.getTranslationY();
        view2.getTranslationY();
        view.getTranslationZ();
        view2.getTranslationZ();
        view.getAlpha();
        view2.getAlpha();
        if (view == view3) {
            View view4 = (View) this.LL.getParent();
            View view5 = (View) this.LLILLJJLI.getParent();
            Matrix matrix = new Matrix();
            C214696190k.LIZIZ(view4, matrix);
            Matrix matrix2 = new Matrix();
            C214696190k.LIZIZ(view5, matrix2);
            Matrix matrix3 = new Matrix(this.LL.getMatrix());
            Matrix matrix4 = new Matrix(this.LLILLJJLI.getMatrix());
            Matrix matrix5 = new Matrix();
            matrix.invert(matrix5);
            matrix4.postTranslate(view2.getLeft(), view2.getTop());
            matrix4.postConcat(matrix2);
            matrix4.postConcat(matrix5);
            matrix4.postTranslate(-view.getLeft(), -view.getTop());
            this.LLILZIL = matrix3;
            this.LLILZLL = matrix4;
            View view6 = this.LLILLL;
            C786410Ut5.Jc(view6, 0.0f);
            C786410Ut5.ed(view6, 0.0f);
            C14K9.LJIL(view6, 0.0f);
            C786410Ut5.Ob(view6, 1.0f);
            C786410Ut5.pc(view6, 1.0f);
            C786410Ut5.Hb(view6, 0.0f);
            C786410Ut5.Ib(view6, 0.0f);
            C786410Ut5.Ab(view6, 0.0f);
        } else {
            View view7 = (View) this.LL.getParent();
            View view8 = (View) this.LLILLJJLI.getParent();
            Matrix matrix6 = new Matrix();
            C214696190k.LIZIZ(view7, matrix6);
            Matrix matrix7 = new Matrix();
            C214696190k.LIZIZ(view8, matrix7);
            Matrix matrix8 = new Matrix(this.LL.getMatrix());
            Matrix matrix9 = new Matrix(this.LLILLJJLI.getMatrix());
            Matrix matrix10 = new Matrix();
            matrix7.invert(matrix10);
            matrix8.postTranslate(view.getLeft(), view.getTop());
            matrix8.postConcat(matrix6);
            matrix8.postConcat(matrix10);
            matrix8.postTranslate(-view2.getLeft(), -view2.getTop());
            this.LLILZIL = matrix8;
            this.LLILZLL = matrix9;
            View view9 = this.LLILLL;
            C786410Ut5.Jc(view9, 0.0f);
            C786410Ut5.ed(view9, 0.0f);
            C14K9.LJIL(view9, 0.0f);
            C786410Ut5.Ob(view9, 1.0f);
            C786410Ut5.pc(view9, 1.0f);
            C786410Ut5.Hb(view9, 0.0f);
            C786410Ut5.Ib(view9, 0.0f);
            C786410Ut5.Ab(view9, 0.0f);
        }
        C214696190k.LIZ.LJFF(this.LLILLL, this.LLILZIL);
        view.getRotationX();
        view2.getRotationX();
        view.getRotationY();
        view2.getRotationY();
        view2.getRotation();
    }
}
