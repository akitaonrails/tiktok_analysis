package X;

import X.InterfaceC1080960eEg;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19Qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21538319Qv<T extends View & InterfaceC1080960eEg> extends AbstractC20736416Ck<T> implements InterfaceC1080960eEg, InterfaceC21538019Qs {
    public final C21537819Qq LLILLJJLI;

    @Override // X.InterfaceC21538219Qu
    public final boolean LIZIZ() {
        return this.LL.getLayoutDirection() == 1;
    }

    @Override // X.AbstractC20736516Cl
    public final int[] LIZLLL() {
        this.LLILLJJLI.getClass();
        return R$styleable.ShapeControlHelper;
    }

    public final int LJIIIIZZ() {
        C21537919Qr c21537919Qr = this.LLILLJJLI.LLJJJJJIL;
        if (c21537919Qr == null) {
            return 0;
        }
        return c21537919Qr.LLIZ;
    }

    @Override // X.InterfaceC1080590eE5
    public final int[] getGradientColors() {
        return this.LLILLJJLI.getGradientColors();
    }

    @Override // X.InterfaceC1080590eE5
    public final float[] getGradientPositions() {
        return this.LLILLJJLI.getGradientPositions();
    }

    @Override // X.InterfaceC21538019Qs
    public final int[] getState() {
        return this.LL.getDrawableState();
    }

    @Override // X.InterfaceC21538219Qu
    public final void invalidate() {
        this.LL.invalidate();
    }

    public C21538319Qv(T t) {
        super(t);
        this.LLILLJJLI = new C21537819Qq(this, EnumC1779280wP0.VIEW);
        t.setWillNotDraw(false);
    }

    @Override // X.InterfaceC21538019Qs
    public final void LIZJ(float f) {
        this.LL.setOutlineProvider(new C19RB(f));
        this.LL.setClipToOutline(true);
    }

    @Override // X.AbstractC20736416Ck
    public final void LJFF(TypedArray typedArray) {
        this.LLILLJJLI.LJ(this.LL.getContext(), typedArray);
    }

    public final void LJIIIZ(boolean z) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (c21537819Qq.LLILZLL != z) {
            c21537819Qq.LLILZLL = z;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public final void LJIIJ(float f) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (c21537819Qq.LLJJIJIL != f) {
            c21537819Qq.LLJJIJIL = f;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public final void LJIIJJI(boolean z) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (c21537819Qq.LLILZIL != z) {
            c21537819Qq.LLILZIL = z;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public final void LJIIL(float f) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (c21537819Qq.LLJJIJIIJIL != f) {
            c21537819Qq.LLJJIJIIJIL = f;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public final void LJIILIIL(int i) {
        C21537919Qr c21537919QrLJFF = this.LLILLJJLI.LJFF();
        int iLIZIZ = C419990GdR.LIZIZ(i, 0, 255);
        if (c21537919QrLJFF.LLIZ != iLIZIZ) {
            c21537919QrLJFF.LLIZ = iLIZIZ;
            c21537919QrLJFF.LLILLL.setAlpha(iLIZIZ);
            InterfaceC21538219Qu interfaceC21538219Qu = c21537919QrLJFF.LLILZLL;
            if (interfaceC21538219Qu != null) {
                interfaceC21538219Qu.invalidate();
            }
        }
    }

    public final void LJIILJJIL(int i) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        c21537819Qq.getClass();
        c21537819Qq.LLJJ = ColorStateList.valueOf(i);
        c21537819Qq.LLJILLL = null;
        c21537819Qq.LLJJJIL.invalidate();
    }

    public final void LJIILL(ColorStateList colorStateList) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (c21537819Qq.LLJJ != colorStateList) {
            c21537819Qq.LLJJ = colorStateList;
            c21537819Qq.LLJILLL = null;
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public final void LJIILLIIL(int[] iArr) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (iArr == null) {
            c21537819Qq.LLJILLL = null;
        } else {
            if (c21537819Qq.LLJILLL == null) {
                C21538119Qt c21538119Qt = new C21538119Qt();
                c21537819Qq.LLJILLL = c21538119Qt;
                c21538119Qt.LIZ = iArr;
            }
            c21537819Qq.LLJJ = null;
        }
        c21537819Qq.LJII();
        c21537819Qq.LLJJJIL.invalidate();
    }

    public final void LJIIZILJ(float f) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (c21537819Qq.LLJILJILJ != f) {
            c21537819Qq.LLJILJILJ = f;
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public final void LJIJ(boolean z) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (c21537819Qq.LLILZ != z) {
            c21537819Qq.LLILZ = z;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public final void LJIJI(float f) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (c21537819Qq.LLJJIJI != f) {
            c21537819Qq.LLJJIJI = f;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public final void LJIJJ(boolean z) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (c21537819Qq.LLILLL != z) {
            c21537819Qq.LLILLL = z;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    public final void LJIJJLI(float f) {
        C21537819Qq c21537819Qq = this.LLILLJJLI;
        if (c21537819Qq.LLJJIII != f) {
            c21537819Qq.LLJJIII = f;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
    }

    @Override // X.InterfaceC1080960eEg
    public final void setRadius(float f) {
        this.LLILLJJLI.setRadius(f);
    }

    @Override // X.InterfaceC1080590eE5
    public final void LJLILLLLZI(float[] fArr, int[] iArr) {
        this.LLILLJJLI.LJLILLLLZI(fArr, iArr);
    }
}
