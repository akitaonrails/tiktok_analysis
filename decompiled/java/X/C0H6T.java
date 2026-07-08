package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H6T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public abstract class C0H6T extends C0H6M {
    public boolean LJI;
    public final C01GW LJII;
    public Bitmap LJIIIIZZ;
    public final C01GW LJIIL;
    public Animatable LJIILIIL;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(440));
    public final Rect LJIIIZ = new Rect();
    public final Rect LJIIJ = new Rect();
    public final Path LJIIJJI = new Path();

    @Override // X.C0H6M
    public void LJII(Canvas canvas) {
        Drawable drawableLIZLLL;
        int iSave;
        Bitmap bitmap = this.LJIIIIZZ;
        if (this.LJI) {
            ((Drawable) this.LJII.getValue()).draw(canvas);
            return;
        }
        if (bitmap != null) {
            iSave = canvas.save();
            try {
                canvas.clipPath(this.LJIIJJI);
                canvas.drawBitmap(bitmap, this.LJIIJ, this.LJIIIZ, (Paint) null);
                canvas.restoreToCount(iSave);
                return;
            } finally {
            }
        }
        if (this.LJIILIIL == null || (drawableLIZLLL = ((C1320770kTT) this.LJIIL.getValue()).LIZLLL()) == null) {
            return;
        }
        Rect rect = this.LJIIIZ;
        drawableLIZLLL.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        iSave = canvas.save();
        try {
            canvas.clipPath(this.LJIIJJI);
            drawableLIZLLL.draw(canvas);
            canvas.restoreToCount(iSave);
            LJIIIZ();
        } finally {
        }
    }

    @Override // X.C0H6M
    public void LJIIIIZZ(int i, int i2) {
        int i3;
        this.LIZ = i;
        this.LIZIZ = i2;
        LJIIJJI(i, i2);
        if (LIZ()) {
            i3 = (this.LIZ * 4) / 9;
        } else {
            i3 = (this.LIZ * 7) / 9;
        }
        int i4 = this.LIZ / 2;
        int i5 = this.LIZIZ / 2;
        int i6 = i3 / 2;
        ((Drawable) this.LJII.getValue()).setBounds(i4 - i6, i5 - i6, i4 + i6, i5 + i6);
        ((C1320770kTT) this.LJIIL.getValue()).LJFF();
    }

    public final void LJIIJJI(int i, int i2) {
        float f = i;
        float f2 = i2;
        float f3 = 1 - 0.065f;
        this.LJIIIZ.set((int) (f * 0.065f), (int) (f2 * 0.065f), (int) (f * f3), (int) (f3 * f2));
        Path path = this.LJIIJJI;
        path.reset();
        float f4 = 0.15f * f;
        path.addRoundRect(new RectF(this.LJIIIZ), f4, f4, Path.Direction.CW);
        Bitmap bitmap = this.LJIIIIZZ;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f5 = f / f2;
            float f6 = width;
            float f7 = height;
            if (f5 > f6 / f7) {
                float f8 = f6 / f5;
                float f9 = (f7 - f8) / 2;
                this.LJIIJ.set(0, (int) f9, width, (int) (f9 + f8));
            } else {
                float f10 = f5 * f7;
                float f11 = (f6 - f10) / 2;
                this.LJIIJ.set((int) f11, 0, (int) (f11 + f10), height);
            }
        }
    }

    public C0H6T(Context context, InterfaceC497601wk interfaceC497601wk, String str) {
        this.LJII = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1116));
        this.LJIIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1115));
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0H6W(this, str, context, null), 3);
    }
}
