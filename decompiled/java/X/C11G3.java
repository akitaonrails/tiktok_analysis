package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11G3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11G3 extends LinearLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public View LLILLL;

    public final CharSequence getLabel() {
        return this.LLILLJJLI.getText();
    }

    public final boolean getWithIcon$tux_theme_release() {
        return this.LL.getVisibility() == 0;
    }

    public final View getCustomView$tux_theme_release() {
        return this.LLILLL;
    }

    public final TuxTextView getLabelTv$tux_theme_release() {
        return this.LLILLJJLI;
    }

    public C11G3(Context context) {
        super(context, null, R.attr.z2);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h8, this, true);
        this.LL = (TuxIconView) findViewById(R.id.k1_);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.m4r);
        this.LLILLJJLI = tuxTextView;
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine();
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void setCustomView(View view) {
        View view2 = this.LLILLL;
        if (view2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
            removeView(view2);
        }
        int i = 0;
        if (view != null) {
            addView(view, 0);
        }
        this.LLILLL = view;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (view != null) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
    }

    public final void setCustomView$tux_theme_release(View view) {
        this.LLILLL = view;
    }

    public final void setFont(int i) {
        this.LLILLJJLI.setTuxFont(i);
    }

    public final void setIconColor(int i) {
        this.LL.setTintColor(i);
    }

    public final void setIconRes(int i) {
        this.LL.setIconRes(i);
    }

    public final void setLabel(CharSequence charSequence) {
        this.LLILLJJLI.setText(charSequence);
        if (charSequence != null) {
            setCustomView(null);
        }
    }

    public final void setShowArrow(boolean z) {
        int i;
        TuxIconView tuxIconView = this.LL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
    }

    public final void setTextColor(int i) {
        this.LLILLJJLI.setTextColor(i);
    }
}
