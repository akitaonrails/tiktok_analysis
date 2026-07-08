package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.19Qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21538619Qy extends C19XR implements InterfaceC1080960eEg {
    public C21538319Qv<C21538619Qy> LLILZ;

    public float getBottomEndRadius() {
        return this.LLILZ.LLILLJJLI.LLJJIJIL;
    }

    public float getBottomStartRadius() {
        return this.LLILZ.LLILLJJLI.LLJJIJIIJIL;
    }

    public int getGradientAlpha() {
        return this.LLILZ.LJIIIIZZ();
    }

    @Override // X.InterfaceC1080590eE5
    public int[] getGradientColors() {
        return this.LLILZ.getGradientColors();
    }

    public int getGradientLayerSize() {
        this.LLILZ.LLILLJJLI.getClass();
        return 0;
    }

    public int getGradientOrientation() {
        return this.LLILZ.LLILLJJLI.LJFF().LLILZ;
    }

    @Override // X.InterfaceC1080590eE5
    public float[] getGradientPositions() {
        return this.LLILZ.getGradientPositions();
    }

    public float getRadius() {
        return this.LLILZ.LLILLJJLI.LLJJI;
    }

    public ColorStateList getStrokeColor() {
        return this.LLILZ.LLILLJJLI.LLJJ;
    }

    public float getStrokeWidth() {
        return this.LLILZ.LLILLJJLI.LLJILJILJ;
    }

    public float getTopEndRadius() {
        return this.LLILZ.LLILLJJLI.LLJJIJI;
    }

    public float getTopStartRadius() {
        return this.LLILZ.LLILLJJLI.LLJJIII;
    }

    public C21538619Qy(Context context) {
        super(context);
        C21538319Qv<C21538619Qy> c21538319Qv = new C21538319Qv<>(this);
        this.LLILZ = c21538319Qv;
        c21538319Qv.LJII(null, 0, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C21537819Qq c21537819Qq = this.LLILZ.LLILLJJLI;
        if (c21537819Qq.LLJJJ) {
            C417440GYk.LIZ(c21537819Qq.LLJJJJ.width(), c21537819Qq.LLJJJJ.height(), canvas, null);
        }
        super.draw(canvas);
        C21537819Qq c21537819Qq2 = this.LLILZ.LLILLJJLI;
        if (c21537819Qq2.LLJJJ) {
            canvas.drawPath(c21537819Qq2.LLIZLLLIL, c21537819Qq2.LLJI);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.LLILZ.LLILLJJLI.getClass();
        super.onDraw(canvas);
        this.LLILZ.LLILLJJLI.LJI(canvas);
    }

    public void setBottomEndCircular(boolean z) {
        this.LLILZ.LJIIIZ(z);
    }

    public void setBottomEndRadius(float f) {
        this.LLILZ.LJIIJ(f);
    }

    public void setBottomStartCircular(boolean z) {
        this.LLILZ.LJIIJJI(z);
    }

    public void setBottomStartRadius(float f) {
        this.LLILZ.LJIIL(f);
    }

    public void setCircular(boolean z) {
        C21537819Qq c21537819Qq = this.LLILZ.LLILLJJLI;
        if (c21537819Qq.LLILLJJLI != z) {
            c21537819Qq.LLILLJJLI = z;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public void setGradientAlpha(int i) {
        this.LLILZ.LJIILIIL(i);
    }

    public void setGradientColors(int[] iArr) {
        this.LLILZ.LLILLJJLI.LJFF().LJLILLLLZI(null, iArr);
    }

    public void setGradientOrientation(int i) {
        C21537919Qr c21537919QrLJFF = this.LLILZ.LLILLJJLI.LJFF();
        c21537919QrLJFF.LLILZ = i;
        c21537919QrLJFF.LIZ();
        InterfaceC21538219Qu interfaceC21538219Qu = c21537919QrLJFF.LLILZLL;
        if (interfaceC21538219Qu != null) {
            interfaceC21538219Qu.invalidate();
        }
    }

    @Override // X.InterfaceC1080960eEg
    public void setRadius(float f) {
        this.LLILZ.setRadius(f);
    }

    public void setStrokeColor(int i) {
        this.LLILZ.LJIILJJIL(i);
    }

    public void setStrokeGradientColors(int[] iArr) {
        this.LLILZ.LJIILLIIL(iArr);
    }

    public void setStrokeWidth(float f) {
        this.LLILZ.LJIIZILJ(f);
    }

    public void setTopEndCircular(boolean z) {
        this.LLILZ.LJIJ(z);
    }

    public void setTopEndRadius(float f) {
        this.LLILZ.LJIJI(f);
    }

    public void setTopStartCircular(boolean z) {
        this.LLILZ.LJIJJ(z);
    }

    public void setTopStartRadius(float f) {
        this.LLILZ.LJIJJLI(f);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.LLILZ.LJIILL(colorStateList);
    }

    public C21538619Qy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C21538319Qv<C21538619Qy> c21538319Qv = new C21538319Qv<>(this);
        this.LLILZ = c21538319Qv;
        c21538319Qv.LJII(attributeSet, 0, 0);
    }

    @Override // X.InterfaceC1080590eE5
    public final void LJLILLLLZI(float[] fArr, int[] iArr) {
        this.LLILZ.LJLILLLLZI(fArr, iArr);
    }

    public C21538619Qy(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C21538319Qv<C21538619Qy> c21538319Qv = new C21538319Qv<>(this);
        this.LLILZ = c21538319Qv;
        c21538319Qv.LJII(attributeSet, i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C21537819Qq c21537819Qq = this.LLILZ.LLILLJJLI;
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
