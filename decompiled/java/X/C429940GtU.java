package X;

import Y.ARunnableS0S0412000_6;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GtU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429940GtU extends ConstraintLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public int LLILLL;

    public final TuxTextView getTvRelationFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_relation);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvUsernameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_username);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setBiggerTextSize(int i) {
        getTvUsernameFromXml().setTextSize(1, i);
    }

    public final void setTvRelationFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTvUsernameFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C429940GtU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public C429940GtU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bsd, this, true);
    }

    public final void e0(Context context, CharSequence charSequence, CharSequence charSequence2) {
        C19ME c19me;
        if (context != null) {
            TuxTextView tvUsernameFromXml = getTvUsernameFromXml();
            if (((Number) C276290AsF.LIZ.getValue()).intValue() == 1 && !C288700BTg.LIZ()) {
                ViewGroup.LayoutParams layoutParams = tvUsernameFromXml.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                    ((ViewGroup.MarginLayoutParams) c19me).width = 0;
                    c19me.constrainedWidth = false;
                    c19me.matchConstraintDefaultWidth = 0;
                    c19me.horizontalChainStyle = 0;
                    C786410Ut5.R6(tvUsernameFromXml, c19me);
                    tvUsernameFromXml.setMaxWidth(Integer.MAX_VALUE);
                    tvUsernameFromXml.setSingleLine(true);
                    tvUsernameFromXml.setMaxLines(1);
                    tvUsernameFromXml.setEllipsize(TextUtils.TruncateAt.END);
                    tvUsernameFromXml.requestLayout();
                    requestLayout();
                }
            }
            tvUsernameFromXml.setText(charSequence);
            if (((SpannableStringBuilder) charSequence2).length() > 0) {
                C786410Ut5.LLLLZLL(getTvRelationFromXml(), 0);
                getTvRelationFromXml().setText(charSequence2);
            } else {
                getTvRelationFromXml().setText("");
                C786410Ut5.LLLLZLL(getTvRelationFromXml(), 8);
            }
        }
    }

    public final void i0(int i, View view, boolean z) {
        if (!C288700BTg.LIZ()) {
            return;
        }
        TuxTextView tvUsernameFromXml = getTvUsernameFromXml();
        TuxTextView tvRelationFromXml = getTvRelationFromXml();
        this.LLILLL++;
        int i2 = this.LLILLL;
        tvUsernameFromXml.setSingleLine(true);
        tvUsernameFromXml.setMaxLines(1);
        tvUsernameFromXml.setMaxWidth(Integer.MAX_VALUE);
        tvUsernameFromXml.setEllipsize(TextUtils.TruncateAt.END);
        view.getLayoutParams().height = i;
        if (getWidth() > 0) {
            h0(view, i, tvUsernameFromXml, tvRelationFromXml, i2, false, z);
            return;
        }
        tvUsernameFromXml.requestLayout();
        view.requestLayout();
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(this, new ARunnableS0S0412000_6(this, view, i, tvUsernameFromXml, tvRelationFromXml, i2, z, 1));
    }

    public final void h0(View view, int i, TuxTextView tuxTextView, TuxTextView tuxTextView2, int i2, boolean z, boolean z2) {
        int measuredWidth;
        boolean z3;
        C19ME c19me;
        int iMax = i;
        if (i2 != this.LLILLL) {
            return;
        }
        if (getWidth() <= 0) {
            if (z) {
                HandlerHook.viewPost(this, new ARunnableS0S0412000_6(this, view, iMax, tuxTextView, tuxTextView2, i2, z2, 0));
                return;
            }
            return;
        }
        if (tuxTextView2.getVisibility() == 0) {
            tuxTextView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredWidth = tuxTextView2.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        int width = getWidth() - measuredWidth;
        if (width < 0) {
            width = 0;
        }
        tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = tuxTextView.getMeasuredWidth() + ((int) C12ES.LIZJ(1.0f, getContext()));
        int i3 = 1;
        if (!z2 && width > 0 && measuredWidth2 > width) {
            z3 = true;
        } else {
            z3 = false;
        }
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        TextUtils.TruncateAt truncateAt = null;
        if (layoutParams instanceof C19ME) {
            c19me = (C19ME) layoutParams;
        } else {
            c19me = null;
        }
        if (width <= 0) {
            width = getWidth();
        } else if (!z3 && measuredWidth2 <= width) {
            width = measuredWidth2;
        }
        if (c19me != null && (c19me.horizontalChainStyle != 2 || c19me.horizontalBias != 0.0f || ((ViewGroup.MarginLayoutParams) c19me).width != width)) {
            c19me.horizontalChainStyle = 2;
            c19me.horizontalBias = 0.0f;
            ((ViewGroup.MarginLayoutParams) c19me).width = width;
            C786410Ut5.R6(tuxTextView, c19me);
        }
        tuxTextView.setSingleLine(!z3);
        if (z3) {
            i3 = 2;
        }
        tuxTextView.setMaxLines(i3);
        if (!z3) {
            truncateAt = TextUtils.TruncateAt.END;
        }
        tuxTextView.setEllipsize(truncateAt);
        if (z3) {
            iMax = Math.max(iMax, (int) C12ES.LIZJ(60.0f, getContext()));
        }
        if (view.getLayoutParams().height != iMax) {
            view.getLayoutParams().height = iMax;
            view.requestLayout();
        }
    }
}
