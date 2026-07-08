package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ss.android.ugc.aweme.app.R$styleable;
import u4.q0;

/* JADX INFO: renamed from: X.18rC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21414018rC extends C19SG {
    public final SeekBar LIZLLL;
    public Drawable LJ;
    public ColorStateList LJFF;
    public PorterDuff.Mode LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public final void LIZJ() {
        Drawable drawable = this.LJ;
        if (drawable != null) {
            if (this.LJII || this.LJIIIIZZ) {
                Drawable drawableMutate = drawable.mutate();
                this.LJ = drawableMutate;
                if (this.LJII) {
                    C16GF.LJII(drawableMutate, this.LJFF);
                }
                if (this.LJIIIIZZ) {
                    C16GF.LJIIIIZZ(this.LJ, this.LJI);
                }
                if (this.LJ.isStateful()) {
                    this.LJ.setState(this.LIZLLL.getDrawableState());
                }
            }
        }
    }

    public C21414018rC(SeekBar seekBar) {
        super(seekBar);
        this.LIZLLL = seekBar;
    }

    public final void LIZLLL(Canvas canvas) {
        int i;
        if (this.LJ != null) {
            int max = this.LIZLLL.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.LJ.getIntrinsicWidth();
                int intrinsicHeight = this.LJ.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.LJ.setBounds(-i, -i2, i, i2);
                float width = ((this.LIZLLL.getWidth() - this.LIZLLL.getPaddingLeft()) - this.LIZLLL.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.LIZLLL.getPaddingLeft(), this.LIZLLL.getHeight() / 2);
                int i3 = 0;
                do {
                    this.LJ.draw(canvas);
                    canvas.translate(width, 0.0f);
                    i3++;
                } while (i3 <= max);
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // X.C19SG
    public final void LIZ(AttributeSet attributeSet, int i) {
        super.LIZ(attributeSet, i);
        Context context = this.LIZLLL.getContext();
        int[] iArr = R$styleable.AppCompatSeekBar;
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.LIZLLL;
        q0.LJIIZILJ(seekBar, seekBar.getContext(), iArr, attributeSet, c21411918qrLJIILIIL.LIZIZ, i);
        Drawable drawableLJFF = c21411918qrLJIILIIL.LJFF(R$styleable.AppCompatSeekBar_android_thumb);
        if (drawableLJFF != null) {
            this.LIZLLL.setThumb(drawableLJFF);
        }
        Drawable drawableLJ = c21411918qrLJIILIIL.LJ(R$styleable.AppCompatSeekBar_tickMark);
        if (this.LJ != null) {
            this.LJ.setCallback(null);
        }
        this.LJ = drawableLJ;
        if (drawableLJ != null) {
            drawableLJ.setCallback(this.LIZLLL);
            C16G6.LIZIZ(drawableLJ, this.LIZLLL.getLayoutDirection());
            if (drawableLJ.isStateful()) {
                drawableLJ.setState(this.LIZLLL.getDrawableState());
            }
            LIZJ();
        }
        this.LIZLLL.invalidate();
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.LJI = C14SQ.LIZJ(c21411918qrLJIILIIL.LJII(R$styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.LJI);
            this.LJIIIIZZ = true;
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.AppCompatSeekBar_tickMarkTint)) {
            this.LJFF = c21411918qrLJIILIIL.LIZIZ(R$styleable.AppCompatSeekBar_tickMarkTint);
            this.LJII = true;
        }
        c21411918qrLJIILIIL.LJIILJJIL();
        LIZJ();
    }
}
