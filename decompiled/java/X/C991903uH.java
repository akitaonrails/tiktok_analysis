package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03uH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C991903uH extends AbstractC1397560mTK {
    public CharSequence LIZLLL;
    public CharSequence LJ;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        View viewSd = C786410Ut5.Sd(R.layout.aou, C786410Ut5.ne(this.LIZ), null);
        C786410Ut5.W5(viewSd, new ViewGroup.MarginLayoutParams(-1, -2));
        CharSequence charSequence = this.LIZLLL;
        if (charSequence == null || charSequence.length() == 0) {
            C786410Ut5.LLLLZLL((TuxTextView) viewSd.findViewById(R.id.y3j), 8);
            CharSequence charSequence2 = this.LJ;
            if (charSequence2 == null || charSequence2.length() == 0) {
                C786410Ut5.LLLLZLL((TuxTextView) viewSd.findViewById(R.id.ewz), 8);
                return viewSd;
            }
            ((TextView) viewSd.findViewById(R.id.ewz)).setText(this.LJ);
            if (!(this.LJ instanceof String)) {
                ((TextView) viewSd.findViewById(R.id.ewz)).setMovementMethod(C431260Gvc.LIZ);
            }
        } else {
            ((TextView) viewSd.findViewById(R.id.y3j)).setText(this.LIZLLL);
            if (!(this.LIZLLL instanceof String)) {
                ((TextView) viewSd.findViewById(R.id.y3j)).setMovementMethod(C431260Gvc.LIZ);
            }
            CharSequence charSequence3 = this.LJ;
            if (charSequence3 == null || charSequence3.length() == 0) {
                C786410Ut5.LLLLZLL((TuxTextView) viewSd.findViewById(R.id.ewz), 8);
                return viewSd;
            }
            ((TextView) viewSd.findViewById(R.id.ewz)).setText(this.LJ);
            if (!(this.LJ instanceof String)) {
                ((TextView) viewSd.findViewById(R.id.ewz)).setMovementMethod(C431260Gvc.LIZ);
                return viewSd;
            }
        }
        return viewSd;
    }

    public C991903uH(Context context) {
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
