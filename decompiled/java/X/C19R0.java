package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.19R0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19R0 extends C19XT implements InterfaceC1080960eEg {
    public C21538319Qv<C19R0> LLILZIL;

    public float getBottomEndRadius() {
        return this.LLILZIL.LLILLJJLI.LLJJIJIL;
    }

    public float getBottomStartRadius() {
        return this.LLILZIL.LLILLJJLI.LLJJIJIIJIL;
    }

    public int getGradientAlpha() {
        return this.LLILZIL.LJIIIIZZ();
    }

    @Override // X.InterfaceC1080590eE5
    public int[] getGradientColors() {
        return this.LLILZIL.getGradientColors();
    }

    public int getGradientLayerSize() {
        this.LLILZIL.LLILLJJLI.getClass();
        return 0;
    }

    public int getGradientOrientation() {
        return this.LLILZIL.LLILLJJLI.LJFF().LLILZ;
    }

    @Override // X.InterfaceC1080590eE5
    public float[] getGradientPositions() {
        return this.LLILZIL.getGradientPositions();
    }

    public float getRadius() {
        return this.LLILZIL.LLILLJJLI.LLJJI;
    }

    public ColorStateList getStrokeColor() {
        return this.LLILZIL.LLILLJJLI.LLJJ;
    }

    public float getStrokeWidth() {
        return this.LLILZIL.LLILLJJLI.LLJILJILJ;
    }

    public float getTopEndRadius() {
        return this.LLILZIL.LLILLJJLI.LLJJIJI;
    }

    public float getTopStartRadius() {
        return this.LLILZIL.LLILLJJLI.LLJJIII;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C21537819Qq c21537819Qq = this.LLILZIL.LLILLJJLI;
        if (c21537819Qq.LLJJJ) {
            C417440GYk.LIZ(c21537819Qq.LLJJJJ.width(), c21537819Qq.LLJJJJ.height(), canvas, null);
        }
        super.draw(canvas);
        C21537819Qq c21537819Qq2 = this.LLILZIL.LLILLJJLI;
        if (c21537819Qq2.LLJJJ) {
            canvas.drawPath(c21537819Qq2.LLIZLLLIL, c21537819Qq2.LLJI);
            canvas.restore();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        this.LLILZIL.LLILLJJLI.getClass();
        super.onDraw(canvas);
        this.LLILZIL.LLILLJJLI.LJI(canvas);
    }

    public void setBottomEndCircular(boolean z) {
        this.LLILZIL.LJIIIZ(z);
    }

    public void setBottomEndRadius(float f) {
        this.LLILZIL.LJIIJ(f);
    }

    public void setBottomStartCircular(boolean z) {
        this.LLILZIL.LJIIJJI(z);
    }

    public void setBottomStartRadius(float f) {
        this.LLILZIL.LJIIL(f);
    }

    public void setCircular(boolean z) {
        C21537819Qq c21537819Qq = this.LLILZIL.LLILLJJLI;
        if (c21537819Qq.LLILLJJLI != z) {
            c21537819Qq.LLILLJJLI = z;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public void setGradientAlpha(int i) {
        this.LLILZIL.LJIILIIL(i);
    }

    public void setGradientColors(int[] iArr) {
        this.LLILZIL.LLILLJJLI.LJFF().LJLILLLLZI(null, iArr);
    }

    public void setGradientOrientation(int i) {
        C21537919Qr c21537919QrLJFF = this.LLILZIL.LLILLJJLI.LJFF();
        c21537919QrLJFF.LLILZ = i;
        c21537919QrLJFF.LIZ();
        InterfaceC21538219Qu interfaceC21538219Qu = c21537919QrLJFF.LLILZLL;
        if (interfaceC21538219Qu != null) {
            interfaceC21538219Qu.invalidate();
        }
    }

    @Override // X.InterfaceC1080960eEg
    public void setRadius(float f) {
        this.LLILZIL.setRadius(f);
    }

    public void setStrokeColor(int i) {
        this.LLILZIL.LJIILJJIL(i);
    }

    public void setStrokeGradientColors(int[] iArr) {
        this.LLILZIL.LJIILLIIL(iArr);
    }

    public void setStrokeWidth(float f) {
        this.LLILZIL.LJIIZILJ(f);
    }

    public void setTopEndCircular(boolean z) {
        this.LLILZIL.LJIJ(z);
    }

    public void setTopEndRadius(float f) {
        this.LLILZIL.LJIJI(f);
    }

    public void setTopStartCircular(boolean z) {
        this.LLILZIL.LJIJJ(z);
    }

    public void setTopStartRadius(float f) {
        this.LLILZIL.LJIJJLI(f);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.LLILZIL.LJIILL(colorStateList);
    }

    public C19R0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C21538319Qv<C19R0> c21538319Qv = new C21538319Qv<>(this);
        this.LLILZIL = c21538319Qv;
        c21538319Qv.LJII(attributeSet, 0, 0);
    }

    @Override // X.InterfaceC1080590eE5
    public final void LJLILLLLZI(float[] fArr, int[] iArr) {
        this.LLILZIL.LJLILLLLZI(fArr, iArr);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C21537819Qq c21537819Qq = this.LLILZIL.LLILLJJLI;
        c21537819Qq.LLJJJJ.set(0, 0, i, i2);
        c21537819Qq.LJII();
        C21537919Qr c21537919Qr = c21537819Qq.LLJJJJJIL;
        if (c21537919Qr != null) {
            Rect rect = c21537919Qr.LLILZIL;
            if (rect.left != 0 || rect.top != 0 || rect.right != i || rect.bottom != i2) {
                rect.set(0, 0, i, i2);
                c21537919Qr.LIZ();
                InterfaceC21538219Qu interfaceC21538219Qu = c21537919Qr.LLILZLL;
                if (interfaceC21538219Qu != null) {
                    interfaceC21538219Qu.invalidate();
                }
            }
        }
        c21537819Qq.LLJJJIL.invalidate();
    }
}
