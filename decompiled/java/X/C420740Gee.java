package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Gee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420740Gee extends FrameLayout {
    public final LinearLayout LL;
    public final TuxTextView LLILLJJLI;
    public final View LLILLL;

    public final int LIZ(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    public final void setShowSeparator(boolean z) {
        int i;
        View view = this.LLILLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public final void setStartIconList(List<C420750Gef> list) {
        C786410Ut5.LJJJJJL(this.LL);
        for (C420750Gef c420750Gef : list) {
            int iLIZLLL = C426930God.LIZLLL(c420750Gef.LIZ, getContext());
            int i = c420750Gef.LIZJ;
            TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LIZ(24), LIZ(24));
            layoutParams.setMarginStart(LIZ(16));
            C786410Ut5.M6(tuxIconView, layoutParams);
            if (iLIZLLL != 0) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = iLIZLLL;
                if (i == null) {
                    i = 0;
                }
                c419910GdJ.LIZLLL = i;
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(c420750Gef, 77));
            this.LL.addView(tuxIconView);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.LLILLJJLI.setText(charSequence);
    }

    public C420740Gee(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 8388627;
        C786410Ut5.d6(linearLayout, layoutParams);
        this.LL = linearLayout;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        C786410Ut5.R6(tuxTextView, layoutParams2);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(C426930God.LIZ(R.attr.fa8, context));
        tuxTextView.setTuxFont(33);
        this.LLILLJJLI = tuxTextView;
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, 1);
        layoutParams3.gravity = 80;
        C786410Ut5.W5(view, layoutParams3);
        view.setBackgroundColor(C426930God.LIZ(R.attr.f_u, context));
        C786410Ut5.T4(view, 0.12f);
        this.LLILLL = view;
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams4);
        setMinimumHeight(LIZ(52));
        addView(linearLayout);
        addView(tuxTextView);
        addView(view);
    }
}
