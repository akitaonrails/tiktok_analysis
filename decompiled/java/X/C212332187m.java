package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.187m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212332187m extends LinearLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public boolean LLILZ;

    public C212332187m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        if (this.LLILZ) {
            LIZ();
            View view = this.LLILLJJLI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            addView(view, layoutParams);
            View view2 = this.LLILLL;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 80;
            addView(view2, layoutParams2);
            return;
        }
        LIZ();
        View view3 = this.LLILLL;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        addView(view3, layoutParams3);
        View view4 = this.LLILLJJLI;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(view4, layoutParams4);
    }

    public final void LIZ() {
        View view = this.LL;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        layoutParams.setMarginEnd(getContext().getResources().getDimensionPixelOffset(R.dimen.ug));
        addView(view, layoutParams);
    }

    public final String getPriceNumText() {
        return this.LLILLL.getText().toString();
    }

    public final float getPriceNumTextSize() {
        return this.LLILLL.getTextSize();
    }

    public final void setColor(int i) {
        this.LL.setTextColor(i);
        this.LLILLJJLI.setTextColor(i);
        this.LLILLL.setTextColor(i);
    }

    public final void setColorRes(int i) {
        this.LL.setTextColorRes(i);
        this.LLILLJJLI.setTextColorRes(i);
        this.LLILLL.setTextColorRes(i);
    }

    public final void setCurrencyShowLeft(boolean z) {
        if (C444960Hcc.LIZJ(getContext())) {
            if (!z) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z != this.LLILZ) {
            this.LLILZ = z;
            LIZIZ();
        }
    }

    public final void setCurrencyText(String str) {
        this.LLILLJJLI.setText(str);
    }

    public final void setPriceNumText(String str) {
        this.LLILLL.setText(str);
    }

    public final void setPriceNumTuxFont(int i) {
        this.LLILLL.setTuxFont(i);
    }

    public final void setPricePrefix(String str) {
        this.LL.setText(str);
    }

    public final void setPriceSize(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLILLJJLI.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.LL.getLayoutParams();
        int i2 = layoutParams.bottomMargin;
        int i3 = layoutParams2.bottomMargin;
        switch (i) {
            case 0:
                this.LLILLL.setTuxFont(13);
                this.LLILLJJLI.setTuxFont(33);
                this.LL.setTuxFont(33);
                layoutParams.bottomMargin = C679280Qkg.LIZ(2);
                layoutParams2.bottomMargin = C679280Qkg.LIZ(2);
                break;
            case 1:
                this.LLILLL.setTuxFont(22);
                this.LLILLJJLI.setTuxFont(52);
                this.LL.setTuxFont(52);
                layoutParams.bottomMargin = C679280Qkg.LIZ(1);
                layoutParams2.bottomMargin = C679280Qkg.LIZ(1);
                break;
            case 2:
                this.LLILLL.setTuxFont(32);
                this.LLILLJJLI.setTuxFont(72);
                this.LL.setTuxFont(72);
                layoutParams.bottomMargin = C679280Qkg.LIZ(1);
                layoutParams2.bottomMargin = C679280Qkg.LIZ(1);
                break;
            case 3:
                this.LLILLL.setTuxFont(42);
                this.LLILLJJLI.setTuxFont(82);
                this.LL.setTuxFont(82);
                layoutParams.bottomMargin = C679280Qkg.LIZ(1);
                layoutParams2.bottomMargin = C679280Qkg.LIZ(1);
                break;
            case 4:
                this.LLILLL.setTuxFont(62);
                this.LLILLJJLI.setTuxFont(92);
                this.LL.setTuxFont(92);
                layoutParams.bottomMargin = C679280Qkg.LIZ(1);
                layoutParams2.bottomMargin = C679280Qkg.LIZ(1);
                break;
            case 5:
                this.LLILLL.setTuxFont(22);
                this.LLILLJJLI.setTuxFont(22);
                this.LL.setTuxFont(22);
                break;
            case 6:
                this.LLILLL.setTuxFont(52);
                this.LLILLJJLI.setTuxFont(52);
                this.LL.setTuxFont(52);
                layoutParams.bottomMargin = 0;
                break;
        }
        if (i2 != layoutParams.bottomMargin) {
            this.LLILLJJLI.requestLayout();
        }
        if (i3 != layoutParams2.bottomMargin) {
            this.LL.requestLayout();
        }
    }

    public final void setColor(ColorStateList colorStateList) {
        this.LL.setTextColor(colorStateList);
        this.LLILLJJLI.setTextColor(colorStateList);
        this.LLILLL.setTextColor(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C212332187m(Context context, AttributeSet attributeSet, int i) {
        String strXd;
        String strXd2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setMaxLines(1);
        this.LL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setMaxLines(1);
        this.LLILLJJLI = tuxTextView2;
        TuxTextView tuxTextView3 = new TuxTextView(context, null, 6, 0);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setTextAlignment(5);
        tuxTextView3.setGravity(8388611);
        this.LLILLL = tuxTextView3;
        this.LLILZ = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NewPriceView);
        this.LLILZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NewPriceView_currency_show_left, true);
        if (C444960Hcc.LIZJ(context)) {
            this.LLILZ = !this.LLILZ;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.NewPriceView_price_size, -1);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NewPriceView_price_color);
        if (isInEditMode()) {
            strXd = "1999.999.000";
        } else {
            strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.NewPriceView_price_amount);
        }
        if (isInEditMode()) {
            strXd2 = e3.c;
        } else {
            strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.NewPriceView_price_currency);
        }
        String str = isInEditMode() ? "from" : null;
        typedArrayObtainStyledAttributes.recycle();
        LIZIZ();
        if (i2 >= 0) {
            setPriceSize(i2);
        }
        if (colorStateList != null) {
            setColor(colorStateList);
        }
        if (strXd != null) {
            setPriceNumText(strXd);
        }
        if (strXd2 != null) {
            setCurrencyText(strXd2);
        }
        if (str != null) {
            setPricePrefix(str);
        }
    }
}
