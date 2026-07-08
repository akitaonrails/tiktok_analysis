package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315430kKr extends AbstractC1315450kKt {
    public C1315680kLG LLJJIII;

    @Override // X.AbstractC1315450kKt
    public final void LJ() {
    }

    @Override // X.AbstractC1315450kKt
    public final void LJFF() {
    }

    @Override // X.AbstractC1315450kKt
    public final void LJI() {
    }

    @Override // X.AbstractC1315450kKt
    public final void LJII() {
    }

    @Override // X.AbstractC1315450kKt
    public final Drawable LIZJ() {
        return this.LLJJIII.LLJI;
    }

    @Override // X.AbstractC1315450kKt
    public final void LIZLLL() {
        C1316590kMj c1316590kMj;
        C1315680kLG c1315680kLG = this.LLJJIII;
        if (c1315680kLG == null || (c1316590kMj = c1315680kLG.LLLLLJIL) == null) {
            return;
        }
        c1316590kMj.LJ();
    }

    @Override // X.AbstractC1315450kKt
    public final void LJIIIZ(Drawable.Callback callback) {
        this.LLJJ = callback;
        if (this.LLIZ > 0 && this.LLILZLL > 0) {
            this.LLJJIII.LJJ();
        }
    }

    public C1315430kKr(int i, int i2, int[] iArr) {
        super(i, i2, iArr);
    }

    public C1315430kKr(int i, int i2, int[] iArr, C1314280kJ0 c1314280kJ0) {
        super(i, i2, iArr);
        this.LLJJIII = c1314280kJ0;
        c1314280kJ0.LJIIJ(this.LLIZ, this.LLILZLL, 0, 0, 0, 0);
        this.LLJJIII.LLJLILLLLZIIL = true;
    }

    @Override // X.AbstractC1315450kKt, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.LLJJ == null) {
            return;
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }
}
