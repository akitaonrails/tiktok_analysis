package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19404310vp extends LinearLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxTextView LLILZ;
    public Integer LLILZIL;
    public Integer LLILZLL;

    public final C419910GdJ getIcon() {
        return null;
    }

    public final Integer getTextColorRes() {
        return this.LLILZLL;
    }

    public final Integer getTextRes() {
        return this.LLILZIL;
    }

    public C19404310vp(Context context) {
        int i;
        View viewFindViewById;
        TuxTextView tuxTextView;
        super(context, null, 0);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            i = R.layout.fpr;
        } else {
            i = R.layout.fq1;
        }
        View viewSd = C786410Ut5.Sd(i, layoutInflaterNe, this);
        this.LL = viewSd;
        if (viewSd != null) {
            viewFindViewById = viewSd.findViewById(R.id.xd5);
        } else {
            viewFindViewById = null;
        }
        this.LLILLJJLI = viewFindViewById;
        if (viewSd != null) {
            tuxTextView = (TuxTextView) viewSd.findViewById(R.id.xd6);
        } else {
            tuxTextView = null;
        }
        this.LLILZ = tuxTextView;
        this.LLILLL = viewSd != null ? (TuxIconView) viewSd.findViewById(R.id.xd4) : null;
    }

    public final void setIcon(C419910GdJ c419910GdJ) {
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    public final void setTextColorRes(Integer num) {
        Integer numLIZJ;
        if (num != null && (numLIZJ = C1308910kAL.LIZJ(num.intValue(), getContext())) != null) {
            int iIntValue = numLIZJ.intValue();
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue);
            }
        }
        this.LLILZLL = num;
    }

    public final void setTextRes(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                tuxTextView.setText(getContext().getString(iIntValue));
            }
        }
        this.LLILZIL = num;
    }
}
