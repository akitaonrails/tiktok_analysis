package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0mTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397570mTL extends AbstractC1397560mTK {
    public CharSequence LIZLLL;
    public CharSequence LJ;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        View viewSd = C1397510mTF.LLJJIJIIJIL != 0 ? C786410Ut5.Sd(R.layout.gj, C786410Ut5.ne(this.LIZ), null) : C786410Ut5.Sd(R.layout.gk, C786410Ut5.ne(this.LIZ), null);
        C786410Ut5.W5(viewSd, new ViewGroup.MarginLayoutParams(-1, -2));
        TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.y3j);
        TuxTextView tuxTextView2 = (TuxTextView) viewSd.findViewById(R.id.ewz);
        if (C1397510mTF.LLJJIJIIJIL != 0) {
            tuxTextView.setTextColor(this.LIZIZ.LJIIIZ);
        } else {
            tuxTextView.setTextColor(this.LIZIZ.LJIIJ);
        }
        q0.LJIJI(tuxTextView, true);
        CharSequence charSequence = this.LIZLLL;
        if (charSequence == null || charSequence.length() == 0) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            CharSequence charSequence2 = this.LJ;
            if (charSequence2 == null || charSequence2.length() == 0) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                return viewSd;
            }
            tuxTextView2.setTuxFont(this.LIZIZ.LIZJ);
            tuxTextView2.setTextColor(this.LIZIZ.LJIIIZ);
            tuxTextView2.setText(this.LJ);
            if (!(this.LJ instanceof String)) {
                tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
            }
        } else {
            tuxTextView.setTuxFont(this.LIZIZ.LIZ);
            tuxTextView.setText(this.LIZLLL);
            if (!(this.LIZLLL instanceof String)) {
                tuxTextView.setMovementMethod(C431260Gvc.LIZ);
            }
            CharSequence charSequence3 = this.LJ;
            if (charSequence3 == null || charSequence3.length() == 0) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                return viewSd;
            }
            tuxTextView2.setTuxFont(this.LIZIZ.LIZIZ);
            if (C1397510mTF.LLJJIJIIJIL != 0) {
                tuxTextView2.setTextColor(this.LIZIZ.LJIIL);
            } else {
                tuxTextView2.setTextColor(this.LIZIZ.LJIIJJI);
            }
            tuxTextView2.setText(this.LJ);
            if (!(this.LJ instanceof String)) {
                tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
                return viewSd;
            }
        }
        return viewSd;
    }

    public C1397570mTL(Context context) {
        super(context);
    }

    @Override // X.AbstractC1397560mTK
    public final void LIZJ(CharSequence charSequence) {
        this.LJ = charSequence;
    }

    @Override // X.AbstractC1397560mTK
    public final void LIZLLL(CharSequence charSequence) {
        this.LIZLLL = charSequence;
    }
}
