package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0ktq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337120ktq extends TextView implements InterfaceC1337130ktr, C19J1 {
    public C21382618m8 LL;
    public float LLILLJJLI;
    public final C1337110ktp LLILLL;

    public float getBorderRadius() {
        return this.LLILLL.LLILLJJLI;
    }

    @Override // X.C19J1
    public float getRubIn() {
        return this.LLILLL.LLILZLL;
    }

    @Override // X.C19J1
    public float getShine() {
        return this.LLILLL.LLILZ;
    }

    @Override // X.C19J1
    public float getStretch() {
        return this.LLILLL.LLILZIL;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21382618m8 c21382618m8 = this.LL;
        if (c21382618m8 != null) {
            c21382618m8.LJIIJJI();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C21382618m8 c21382618m8 = this.LL;
        if (c21382618m8 != null) {
            c21382618m8.LJIIL();
        }
    }

    @Override // X.InterfaceC1337130ktr, X.C19J1
    public float getRipple() {
        return this.LLILLJJLI;
    }

    public C1337120ktq(Context context) {
        super(context);
        this.LLILLL = new C1337110ktp(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C19JY c19jy;
        C21382618m8 c21382618m8 = this.LL;
        if (c21382618m8 != null && (c19jy = c21382618m8.LLLLLLZZ) != null) {
            c19jy.LJI();
        }
        super.onDraw(canvas);
        C21382618m8 c21382618m82 = this.LL;
        if (c21382618m82 != null) {
            c21382618m82.LIZJ(canvas, this);
            this.LL.LIZIZ(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        C19JY c19jy;
        super.onWindowFocusChanged(z);
        C21382618m8 c21382618m8 = this.LL;
        if (c21382618m8 != null && (c19jy = c21382618m8.LLLLLLZZ) != null) {
            c19jy.LIZLLL();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.LLILLL.LIZ(i);
    }

    public void setBorderRadius(float f) {
        C1337110ktp c1337110ktp = this.LLILLL;
        if (c1337110ktp != null) {
            c1337110ktp.LIZIZ(f);
        }
    }

    public void setRipple(float f) {
        View view;
        this.LLILLJJLI = f;
        C1337110ktp c1337110ktp = this.LLILLL;
        if (c1337110ktp != null && (view = c1337110ktp.LL) != null) {
            c1337110ktp.LLILLL = f;
            view.postInvalidate();
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        C1337110ktp c1337110ktp = this.LLILLL;
        if (c1337110ktp != null) {
            c1337110ktp.LLILZLL = f;
            c1337110ktp.LL.postInvalidate();
        }
    }

    public void setShine(float f) {
        View view;
        C1337110ktp c1337110ktp = this.LLILLL;
        if (c1337110ktp != null && (view = c1337110ktp.LL) != null) {
            c1337110ktp.LLILZ = f;
            view.postInvalidate();
        }
    }

    public void setStretch(float f) {
        C1337110ktp c1337110ktp = this.LLILLL;
        if (c1337110ktp != null) {
            c1337110ktp.LLILZIL = f;
            c1337110ktp.LL.postInvalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        C21382618m8 c21382618m8 = this.LL;
        if (c21382618m8 != null) {
            int[] iArrLJIIIZ = c21382618m8.LJIIIZ(i, i2);
            super.onMeasure(iArrLJIIIZ[0], iArrLJIIIZ[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C21382618m8 c21382618m8 = this.LL;
        if (c21382618m8 != null) {
            c21382618m8.LJIILLIIL(i, i2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C19JY c19jy;
        C21382618m8 c21382618m8 = this.LL;
        if (c21382618m8 != null && (c19jy = c21382618m8.LLLLLLZZ) != null && !c21382618m8.LLLLZ) {
            c21382618m8.LLLLZ = true;
            c19jy.LJIIIZ();
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
