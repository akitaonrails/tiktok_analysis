package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ggx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422170Ggx extends LinearLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;

    public final TuxTextView getEcmDiscountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gi1);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getEcmOriginPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gi2);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getEcmPrefixFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gi3);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getEcmSalePriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gi4);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        C786410Ut5.Sd(R.layout.bvd, C786410Ut5.ne(getContext()), this);
    }

    public final void setEcmDiscountFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setEcmOriginPriceFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setEcmPrefixFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setEcmSalePriceFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public C422170Ggx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        int i5 = 0;
        int i6 = 0;
        for (View view : new C09RD(this)) {
            int i7 = i5 + 1;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            measureChild(view, i, i2);
            int measuredWidth2 = view.getMeasuredWidth();
            if (marginLayoutParams != null) {
                i3 = marginLayoutParams.leftMargin;
            } else {
                i3 = 0;
            }
            int i8 = measuredWidth2 + i3;
            if (marginLayoutParams != null) {
                i4 = marginLayoutParams.rightMargin;
            } else {
                i4 = 0;
            }
            i6 += i8 + i4;
            if (i6 > measuredWidth && i5 >= 1) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            i5 = i7;
        }
    }
}
