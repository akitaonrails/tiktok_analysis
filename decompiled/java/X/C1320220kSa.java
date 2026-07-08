package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320220kSa extends Drawable implements InterfaceC1320240kSc {
    public InterfaceC1320380kSq LLILZIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public long LLJJIJI;
    public String LLJJIJIIJIL;
    public final int LLIZLLLIL = 80;
    public final Paint LLJ = new Paint(1);
    public final Matrix LLJI = new Matrix();
    public final Rect LLJIJIL = new Rect();
    public final RectF LLJILJIL = new RectF();
    public int LLILLJJLI = -1;
    public int LLILLL = -1;
    public int LLILZ = -1;
    public int LLILZLL = -1;
    public int LLIZ = -1;
    public String LL = "none";

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C1320220kSa() {
        invalidateSelf();
        this.LLJJIJI = -1L;
        this.LLJJIJIIJIL = null;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1320220kSa.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i;
        super.onBoundsChange(rect);
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.LLJ.setTextSize(iMin);
        int i2 = iMin + 8;
        this.LLJJ = i2;
        int i3 = this.LLIZLLLIL;
        if (i3 == 80) {
            this.LLJJ = -i2;
        }
        this.LLJILJILJ = rect.left + 10;
        if (i3 == 80) {
            i = rect.bottom - 10;
        } else {
            i = rect.top + 10 + 10;
        }
        this.LLJILLL = i;
    }

    public final void LIZ(Canvas canvas, String str, Object... objArr) {
        canvas.drawText(C786410Ut5.j4(str, objArr), this.LLJJI, this.LLJJIII, this.LLJ);
        this.LLJJIII += this.LLJJ;
    }
}
