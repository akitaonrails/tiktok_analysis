package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: X.0Gbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419030Gbt extends LinearLayout {
    public Integer LL;
    public final ArrayDeque<TuxTextView> LLILLJJLI;

    public C419030Gbt(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = new ArrayDeque<>();
        setOrientation(1);
        setGravity(8388611);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int paddingLeft;
        int iMakeMeasureSpec;
        Integer num = this.LL;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (num != null && marginLayoutParams != null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == 0) {
                paddingLeft = num.intValue();
            } else {
                paddingLeft = ((((size - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - i2;
                if (paddingLeft < 0) {
                    paddingLeft = 0;
                }
                int iIntValue = num.intValue();
                if (paddingLeft > iIntValue) {
                    paddingLeft = iIntValue;
                }
            }
            int i5 = marginLayoutParams.width;
            if (i5 != -2) {
                if (i5 != -1) {
                    if (i5 <= paddingLeft) {
                        paddingLeft = i5;
                    }
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
                } else if (mode == 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
                }
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE);
            }
            view.measure(iMakeMeasureSpec, LinearLayout.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
            return;
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }
}
