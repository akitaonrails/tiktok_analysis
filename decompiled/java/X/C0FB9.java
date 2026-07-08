package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.Size;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;

/* JADX INFO: renamed from: X.0FB9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FB9 extends C0FBA<C0ENW> {
    public final C364570ERb LJJIFFI;
    public float LJJII;
    public float LJJIII;
    public boolean LJJIIJ;

    public C0FB9(Context context, C363630ENl c363630ENl) {
        super(context, c363630ENl);
        this.LJJIFFI = new C364570ERb();
        this.LJJIII = 1.0f;
        this.LJJIIJ = true;
    }

    @Override // X.C0FBA, X.C0FBW
    public final void LIZ(Canvas canvas, Size size, C0FEW c0few) {
        C0EO0 c0eo0;
        PointF pointFLJI;
        Size sizeLIZ;
        String str;
        float f;
        if (!this.LIZIZ) {
            return;
        }
        super.LIZ(canvas, size, c0few);
        C0ENW c0enw = (C0ENW) this.LIZJ;
        if (c0enw == null || (c0eo0 = this.LJJ) == null || (pointFLJI = LJI()) == null) {
            return;
        }
        float f2 = pointFLJI.x;
        float f3 = pointFLJI.y;
        canvas.drawCircle(f2, f3, this.LJIJJ, this.LJIILLIIL);
        C0ENW c0enw2 = (C0ENW) this.LIZJ;
        if (c0enw2 == null) {
            sizeLIZ = new Size(0, 0);
        } else {
            NLETextRichContent nLETextRichContentLIZJ = c0enw2.LIZJ();
            if (this.LJJIII <= 0.0f) {
                sizeLIZ = new Size(0, 0);
            } else {
                sizeLIZ = this.LJJIFFI.LIZ(nLETextRichContentLIZJ, Float.valueOf(this.LJJII), c0enw2.LIZJ, this.LJJIII, false);
            }
        }
        if (C363770ENz.LIZJ(sizeLIZ)) {
            return;
        }
        int height = sizeLIZ.getHeight();
        int width = sizeLIZ.getWidth();
        canvas.save();
        canvas.rotate(c0enw.LIZ.LIZIZ + c0eo0.LJ, f2, f3);
        this.LJIILLIIL.setPathEffect(this.LJIILJJIL);
        float f4 = width / 2;
        float f5 = f2 - f4;
        float f6 = height / 2;
        float f7 = f3 - f6;
        float f8 = f4 + f2;
        float f9 = f6 + f3;
        canvas.drawRect(f5, f7, f8, f9, this.LJIILLIIL);
        this.LJIILLIIL.setPathEffect(null);
        if (!this.LJJIIJ) {
            canvas.restore();
            return;
        }
        LIZLLL(new PointF(f2, f9), canvas);
        PointF pointF = new PointF(f8 + this.LJIJJLI + this.LJIL, f3);
        C385070F7x c385070F7x = c0enw.LIZJ().richTextData;
        if (c385070F7x == null || (str = c385070F7x.textStr) == null) {
            str = "";
        }
        if (str.length() < 2) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        LJFF(pointF, null, canvas, f);
        canvas.restore();
        LIZJ(canvas, size, c0few);
    }

    @Override // X.C0FBA
    public final void LJIIIIZZ(C0EO0 c0eo0, Float f, Size size, Size size2) {
        this.LJJ = c0eo0;
        if (c0eo0 != null && f != null) {
            f.floatValue();
            if (size == null || size2 == null) {
                return;
            }
            this.LJJIII = size2.getWidth() / size.getWidth();
            this.LJJII = (c0eo0.LIZ / f.floatValue()) * this.LJJIII;
        }
    }
}
