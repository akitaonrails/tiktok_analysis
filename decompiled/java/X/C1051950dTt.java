package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051950dTt extends RelativeLayout {
    public LinearLayout LL;
    public View LLILLJJLI;
    public View LLILLL;
    public final boolean LLILZ;
    public C1077470e93 LLILZIL;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LL = (LinearLayout) findViewById(R.id.hlg);
        this.LLILLJJLI = findViewById(R.id.hl9);
    }

    public C1051950dTt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = true;
    }

    public final void LIZ(float f, int i, View view) {
        if (!C0J0T.LIZIZ(view)) {
            return;
        }
        LinearLayout linearLayout = this.LL;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            linearLayout = null;
        }
        View childAt = linearLayout.getChildAt(i);
        if (childAt == null) {
            return;
        }
        int i2 = i + 1;
        LinearLayout linearLayout3 = this.LL;
        if (linearLayout3 != null) {
            linearLayout2 = linearLayout3;
        }
        View childAt2 = linearLayout2.getChildAt(i2);
        if (childAt2 == null) {
            return;
        }
        if (childAt.getVisibility() == 0 && childAt2.getVisibility() == 0) {
            float x = (childAt.getX() + (childAt.getWidth() / 2)) - (view.getWidth() / 2);
            C786410Ut5.Fd(view, getX() + x + (f * (((childAt2.getX() + (childAt2.getWidth() / 2)) - (view.getWidth() / 2)) - x)));
        } else {
            if (!C0J0T.LIZIZ(childAt)) {
                return;
            }
            C786410Ut5.Fd(view, ((getX() + childAt.getX()) + (childAt.getWidth() / 2)) - (view.getWidth() / 2));
        }
    }
}
