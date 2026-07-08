package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21538419Qw extends C19XS implements InterfaceC1080960eEg {
    public C21538319Qv<C21538419Qw> LLILZ;

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

    @Override // android.view.View
    public void draw(Canvas canvas) {
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
    public final void onDraw(Canvas canvas) {
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

    public C21538419Qw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C21538319Qv<C21538419Qw> c21538319Qv = new C21538319Qv<>(this);
        this.LLILZ = c21538319Qv;
        c21538319Qv.LJII(attributeSet, 0, 0);
    }

    @Override // X.InterfaceC1080590eE5
    public final void LJLILLLLZI(float[] fArr, int[] iArr) {
        this.LLILZ.LJLILLLLZI(fArr, iArr);
    }

    public final void h0(Resources resources, int i) {
        int[] iArr;
        C21538319Qv<C21538419Qw> c21538319Qv = this.LLILZ;
        if (c21538319Qv != null) {
            C21537919Qr c21537919QrLJFF = c21538319Qv.LLILLJJLI.LJFF();
            c21537919QrLJFF.getClass();
            if (i != 0) {
                TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
                int length = typedArrayObtainTypedArray.length();
                iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = typedArrayObtainTypedArray.getColor(i2, -16777216);
                }
                typedArrayObtainTypedArray.recycle();
            } else {
                iArr = null;
            }
            TypedArray typedArrayObtainTypedArray2 = resources.obtainTypedArray(R.array.bu);
            int length2 = typedArrayObtainTypedArray2.length();
            float[] fArr = new float[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                fArr[i3] = typedArrayObtainTypedArray2.getFloat(i3, 0.0f);
            }
            typedArrayObtainTypedArray2.recycle();
            c21537919QrLJFF.LJLILLLLZI(fArr, iArr);
        }
    }

    public C21538419Qw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C21538319Qv<C21538419Qw> c21538319Qv = new C21538319Qv<>(this);
        this.LLILZ = c21538319Qv;
        c21538319Qv.LJII(attributeSet, i, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
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
