package X;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: X.0kIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313850kIJ extends Animation implements InterfaceC1314830kJt {
    public final AbstractC1313520kHm LL;
    public final View LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ = 0;
    public final int LLIZLLLIL = 0;
    public final int LLJ = 0;
    public final int LLJI = 0;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final Rect LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.LL.LJLIIL(Math.round(this.LLJJI + (this.LLJJIJI * f)), Math.round(this.LLJJIII + (this.LLJJIJIIJIL * f)), Math.round(this.LLJJIJIL + (this.LLJJJIL * f)), Math.round(this.LLJJJ + (this.LLJJJJ * f)), this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ);
    }

    @Override // X.InterfaceC1314830kJt
    public final void LIZ(int i, int i2, int i3, int i4) {
        LIZIZ(i, i2, i3, i4);
    }

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        this.LLJJI = this.LL.LJJIII() - this.LL.LJJJ();
        this.LLJJIII = this.LL.LJJIIJ() - this.LL.LJJJI();
        this.LLJJIJIL = this.LL.LJJJJI();
        int iLJIIZILJ = this.LL.LJIIZILJ();
        this.LLJJJ = iLJIIZILJ;
        this.LLJJIJI = i - this.LLJJI;
        this.LLJJIJIIJIL = i2 - this.LLJJIII;
        this.LLJJJIL = i3 - this.LLJJIJIL;
        this.LLJJJJ = i4 - iLJIIZILJ;
    }

    public C1313850kIJ(AbstractC1313520kHm abstractC1313520kHm, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect) {
        this.LL = abstractC1313520kHm;
        this.LLILLJJLI = abstractC1313520kHm.LLLLLILLIL;
        this.LLILLL = i5;
        this.LLILZ = i6;
        this.LLILZIL = i7;
        this.LLILZLL = i8;
        this.LLJIJIL = i9;
        this.LLJILJIL = i10;
        this.LLJILJILJ = i11;
        this.LLJILLL = i12;
        this.LLJJ = rect;
        LIZIZ(i, i2, i3, i4);
    }
}
