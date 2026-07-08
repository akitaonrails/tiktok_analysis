package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import u4.q0;

/* JADX INFO: renamed from: X.03uI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C992003uI extends AbstractC1397560mTK {
    public CharSequence LIZLLL;
    public List<? extends CharSequence> LJ;

    @Override // X.AbstractC1397560mTK
    public final void LIZJ(CharSequence charSequence) {
    }

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        View viewSd = C786410Ut5.Sd(R.layout.i7c, C786410Ut5.ne(this.LIZ), null);
        C786410Ut5.W5(viewSd, new ViewGroup.MarginLayoutParams(-1, -2));
        TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.y3j);
        CharSequence charSequence = this.LIZLLL;
        boolean z = true;
        if (!(charSequence == null || charSequence.length() == 0)) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, viewSd.getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(iIntValue);
                }
            }
            q0.LJIJI(tuxTextView, true);
            if (tuxTextView != null) {
                tuxTextView.setText(this.LIZLLL);
            }
        } else if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        List<? extends CharSequence> list = this.LJ;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            C786410Ut5.LJZL(8, (LinearLayout) viewSd.findViewById(R.id.o9l));
        } else {
            C786410Ut5.LJZL(0, (LinearLayout) viewSd.findViewById(R.id.o9l));
            List<? extends CharSequence> list2 = this.LJ;
            if (list2 != null) {
                int iLIZIZ = 0;
                for (CharSequence charSequence2 : list2) {
                    TuxTextView tuxTextView2 = new TuxTextView(viewSd.findViewById(R.id.o9l).getContext(), null, 6, 0);
                    tuxTextView2.setGravity(8388611);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.topMargin = iLIZIZ;
                    C786410Ut5.R6(tuxTextView2, layoutParams);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, tuxTextView2.getContext());
                    if (numLIZJ2 != null) {
                        tuxTextView2.setTextColor(numLIZJ2.intValue());
                    }
                    tuxTextView2.setTuxFont(41);
                    SpannableString spannableString = new SpannableString(charSequence2);
                    C786410Ut5.p2(spannableString, new BulletSpan(15), 0, charSequence2.length(), 33);
                    tuxTextView2.setText(spannableString);
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                    ((ViewGroup) viewSd.findViewById(R.id.o9l)).addView(tuxTextView2);
                }
            }
        }
        return viewSd;
    }

    public C992003uI(Context context) {
        super(context);
    }

    @Override // X.AbstractC1397560mTK
    public final void LIZLLL(CharSequence charSequence) {
        this.LIZLLL = charSequence;
    }
}
