package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419110Gc1 extends TuxTextView {
    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LinearLayout.LayoutParams layoutParams2;
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.weight = 1.0f;
        }
        super.setLayoutParams(layoutParams);
    }

    public C419110Gc1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZIZ;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 && (iLIZIZ = C814420VxA.LIZIZ(C0H1U.LIZLLL(this)) + getPaddingLeft() + getPaddingRight()) < size) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode, iLIZIZ), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
