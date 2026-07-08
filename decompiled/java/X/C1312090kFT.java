package X;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.lynx.tasm.behavior.ui.LynxUI;

/* JADX INFO: renamed from: X.0kFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312090kFT extends Animation implements InterfaceC1311790kEz {
    public final LynxUI LL;
    public final View LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
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
        this.LL.updateLayout(Math.round(this.LLJJI + (this.LLJJIJI * f)), Math.round(this.LLJJIII + (this.LLJJIJIIJIL * f)), Math.round(this.LLJJIJIL + (this.LLJJJIL * f)), Math.round(this.LLJJJ + (this.LLJJJJ * f)), this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ);
    }

    @Override // X.InterfaceC1311790kEz
    public final void LIZ(int i, int i2, int i3, int i4) {
        LIZIZ(i, i2, i3, i4);
    }

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        this.LLJJI = this.LL.getOriginLeft() - this.LL.getTranslationX();
        this.LLJJIII = this.LL.getOriginTop() - this.LL.getTranslationY();
        this.LLJJIJIL = this.LL.getWidth();
        int height = this.LL.getHeight();
        this.LLJJJ = height;
        this.LLJJIJI = i - this.LLJJI;
        this.LLJJIJIIJIL = i2 - this.LLJJIII;
        this.LLJJJIL = i3 - this.LLJJIJIL;
        this.LLJJJJ = i4 - height;
    }

    public C1312090kFT(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.LL = lynxUI;
        this.LLILLJJLI = lynxUI.mView;
        this.LLILLL = i5;
        this.LLILZ = i6;
        this.LLILZIL = i7;
        this.LLILZLL = i8;
        this.LLIZ = i9;
        this.LLIZLLLIL = i10;
        this.LLJ = i11;
        this.LLJI = i12;
        this.LLJIJIL = i13;
        this.LLJILJIL = i14;
        this.LLJILJILJ = i15;
        this.LLJILLL = i16;
        this.LLJJ = rect;
        LIZIZ(i, i2, i3, i4);
    }
}
