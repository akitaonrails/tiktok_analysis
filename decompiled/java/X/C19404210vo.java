package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19404210vo extends LinearLayout {
    public final View LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public Integer LLILZ;
    public Integer LLILZIL;

    public final C419910GdJ getIcon() {
        return null;
    }

    public final Integer getTextColorRes() {
        return this.LLILZIL;
    }

    public final Integer getTextRes() {
        return this.LLILZ;
    }

    public C19404210vo(Context context) {
        int i;
        TuxTextView tuxTextView;
        super(context, null, 0);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            i = R.layout.fpq;
        } else {
            i = R.layout.fpz;
        }
        View viewSd = C786410Ut5.Sd(i, layoutInflaterNe, this);
        this.LL = viewSd;
        if (viewSd != null) {
            tuxTextView = (TuxTextView) viewSd.findViewById(R.id.x7m);
        } else {
            tuxTextView = null;
        }
        this.LLILLL = tuxTextView;
        this.LLILLJJLI = viewSd != null ? (TuxIconView) viewSd.findViewById(R.id.x7l) : null;
    }

    public final void setIcon(C419910GdJ c419910GdJ) {
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    public final void setTextColorRes(Integer num) {
        Integer numLIZJ;
        if (num != null && (numLIZJ = C1308910kAL.LIZJ(num.intValue(), getContext())) != null) {
            int iIntValue = numLIZJ.intValue();
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue);
            }
        }
        this.LLILZIL = num;
    }

    public final void setTextRes(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(getContext().getString(iIntValue));
            }
        }
        this.LLILZ = num;
    }
}
