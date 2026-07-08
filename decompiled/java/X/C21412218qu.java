package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import u4.q0;

/* JADX INFO: renamed from: X.18qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21412218qu {
    public final CompoundButton LIZ;
    public ColorStateList LIZIZ;
    public PorterDuff.Mode LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZ() {
        Drawable drawableLIZ = C21412718qz.LIZ(this.LIZ);
        if (drawableLIZ != null) {
            if (this.LIZLLL || this.LJ) {
                Drawable drawableMutate = drawableLIZ.mutate();
                if (this.LIZLLL) {
                    C16GF.LJII(drawableMutate, this.LIZIZ);
                }
                if (this.LJ) {
                    C16GF.LJIIIIZZ(drawableMutate, this.LIZJ);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.LIZ.getDrawableState());
                }
                this.LIZ.setButtonDrawable(drawableMutate);
            }
        }
    }

    public C21412218qu(CompoundButton compoundButton) {
        this.LIZ = compoundButton;
    }

    public final void LIZIZ(AttributeSet attributeSet, int i) {
        int iLJIIIIZZ;
        int iLJIIIIZZ2;
        Context context = this.LIZ.getContext();
        int[] iArr = R$styleable.CompoundButton;
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.LIZ;
        q0.LJIIZILJ(compoundButton, compoundButton.getContext(), iArr, attributeSet, c21411918qrLJIILIIL.LIZIZ, i);
        try {
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.CompoundButton_buttonCompat) && (iLJIIIIZZ2 = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.LIZ;
                    compoundButton2.setButtonDrawable(C14MI.LIZ(compoundButton2.getContext(), iLJIIIIZZ2));
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.CompoundButton_android_button)) {
                        CompoundButton compoundButton3 = this.LIZ;
                        compoundButton3.setButtonDrawable(C14MI.LIZ(compoundButton3.getContext(), iLJIIIIZZ));
                    }
                }
            } else if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.CompoundButton_android_button) && (iLJIIIIZZ = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.CompoundButton_android_button, 0)) != 0) {
                CompoundButton compoundButton32 = this.LIZ;
                compoundButton32.setButtonDrawable(C14MI.LIZ(compoundButton32.getContext(), iLJIIIIZZ));
            }
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.CompoundButton_buttonTint)) {
                C20744916Fr.LIZJ(this.LIZ, c21411918qrLJIILIIL.LIZIZ(R$styleable.CompoundButton_buttonTint));
            }
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.CompoundButton_buttonTintMode)) {
                C20744916Fr.LIZLLL(this.LIZ, C14SQ.LIZJ(c21411918qrLJIILIIL.LJII(R$styleable.CompoundButton_buttonTintMode, -1), null));
            }
            c21411918qrLJIILIIL.LJIILJJIL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c21411918qrLJIILIIL.LJIILJJIL();
            throw th;
        }
    }
}
