package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: X.18qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21411618qo {
    public final CheckedTextView LIZ;
    public ColorStateList LIZIZ;
    public PorterDuff.Mode LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZ() {
        Drawable checkMarkDrawable = this.LIZ.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.LIZLLL || this.LJ) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.LIZLLL) {
                    C16GF.LJII(drawableMutate, this.LIZIZ);
                }
                if (this.LJ) {
                    C16GF.LJIIIIZZ(drawableMutate, this.LIZJ);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.LIZ.getDrawableState());
                }
                this.LIZ.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public C21411618qo(CheckedTextView checkedTextView) {
        this.LIZ = checkedTextView;
    }
}
