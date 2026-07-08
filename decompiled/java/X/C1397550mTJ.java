package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0mTJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397550mTJ extends AbstractC1397560mTK {
    public CharSequence LIZLLL;
    public CharSequence LJ;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        View viewSd = C786410Ut5.Sd(R.layout.mm, C786410Ut5.ne(this.LIZ), null);
        C786410Ut5.W5(viewSd, new ViewGroup.MarginLayoutParams(-1, -2));
        float f = C1397600mTO.LJJII;
        C1397600mTO c1397600mTO = new C1397600mTO(viewSd.getContext());
        TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.y3j);
        TuxTextView tuxTextView2 = (TuxTextView) viewSd.findViewById(R.id.ewz);
        tuxTextView.setTextColor(c1397600mTO.LJIIJ);
        q0.LJIJI(tuxTextView, true);
        CharSequence charSequence = this.LIZLLL;
        if (charSequence == null || charSequence.length() == 0) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            CharSequence charSequence2 = this.LJ;
            if (charSequence2 == null || charSequence2.length() == 0) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                return viewSd;
            }
            tuxTextView2.setTuxFont(c1397600mTO.LIZJ);
            tuxTextView2.setTextColor(c1397600mTO.LJIIJ);
            tuxTextView2.setText(this.LJ);
            if (!(this.LJ instanceof String)) {
                tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
            }
        } else {
            tuxTextView.setTuxFont(c1397600mTO.LIZ);
            tuxTextView.setText(this.LIZLLL);
            if (!(this.LIZLLL instanceof String)) {
                tuxTextView.setMovementMethod(C431260Gvc.LIZ);
            }
            CharSequence charSequence3 = this.LJ;
            if (charSequence3 == null || charSequence3.length() == 0) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                return viewSd;
            }
            tuxTextView2.setTuxFont(c1397600mTO.LIZIZ);
            tuxTextView2.setTextColor(c1397600mTO.LJIIJJI);
            tuxTextView2.setText(this.LJ);
            if (!(this.LJ instanceof String)) {
                tuxTextView2.setMovementMethod(C431260Gvc.LIZ);
                return viewSd;
            }
        }
        return viewSd;
    }

    @Override // X.AbstractC1397560mTK
    public final void LIZJ(CharSequence charSequence) {
        this.LJ = charSequence;
    }

    @Override // X.AbstractC1397560mTK
    public final void LIZLLL(CharSequence charSequence) {
        this.LIZLLL = charSequence;
    }

    public C1397550mTJ(Context context, CharSequence charSequence, CharSequence charSequence2) {
        super(context);
        this.LIZLLL = charSequence;
        this.LJ = charSequence2;
    }
}
