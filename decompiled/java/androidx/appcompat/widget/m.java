package androidx.appcompat.widget;

import X.C14MG;
import X.C14MH;
import X.C14MI;
import X.C14SQ;
import X.C1763660vzo;
import X.C21411918qr;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import u4.q0;

/* JADX INFO: loaded from: classes33.dex */
public class m {
    public final ImageView LIZ;
    public C14MH LIZIZ;
    public int LIZJ;

    public final void LIZ() {
        Drawable drawable = this.LIZ.getDrawable();
        if (drawable != null) {
            C14SQ.LIZ(drawable);
            C14MH c14mh = this.LIZIZ;
            if (c14mh != null) {
                C14MG.LJ(drawable, c14mh, this.LIZ.getDrawableState());
            }
        }
    }

    public m(ImageView imageView) {
        this.LIZ = imageView;
    }

    public final void LIZJ(int i) {
        if (i != 0) {
            Drawable drawableLIZ = C14MI.LIZ(this.LIZ.getContext(), i);
            if (drawableLIZ != null) {
                C14SQ.LIZ(drawableLIZ);
            }
            this.LIZ.setImageDrawable(drawableLIZ);
        } else {
            this.LIZ.setImageDrawable(null);
        }
        LIZ();
    }

    public final void LIZIZ(AttributeSet attributeSet, int i) {
        Context context = this.LIZ.getContext();
        int[] iArr = R$styleable.AppCompatImageView;
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.LIZ;
        q0.LJIIZILJ(imageView, imageView.getContext(), iArr, attributeSet, c21411918qrLJIILIIL.LIZIZ, i);
        try {
            Drawable drawable = this.LIZ.getDrawable();
            if (drawable == null) {
                int iLJIIIIZZ = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.AppCompatImageView_srcCompat, -1);
                if (iLJIIIIZZ != -1 && (drawable = C14MI.LIZ(this.LIZ.getContext(), iLJIIIIZZ)) != null) {
                    this.LIZ.setImageDrawable(drawable);
                    C14SQ.LIZ(drawable);
                }
            } else {
                C14SQ.LIZ(drawable);
            }
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.AppCompatImageView_tint)) {
                C1763660vzo.LIZJ(this.LIZ, c21411918qrLJIILIIL.LIZIZ(R$styleable.AppCompatImageView_tint));
            }
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.AppCompatImageView_tintMode)) {
                C1763660vzo.LIZLLL(this.LIZ, C14SQ.LIZJ(c21411918qrLJIILIIL.LJII(R$styleable.AppCompatImageView_tintMode, -1), null));
            }
            c21411918qrLJIILIIL.LJIILJJIL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c21411918qrLJIILIIL.LJIILJJIL();
            throw th;
        }
    }
}
