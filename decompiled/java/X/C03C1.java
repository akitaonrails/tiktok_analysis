package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03C1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03C1 extends FrameLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public int LLILLL;

    public final TuxIconView getUserRightIcon() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_right_icon);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getUserRightItemText() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_right_item_text);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public C03C1(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.apy, this, true);
    }

    public final void setUserRightIcon(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setUserRightItemText(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLILLL > 0) {
            TuxTextView userRightItemText = getUserRightItemText();
            if (userRightItemText != null) {
                ViewGroup.LayoutParams layoutParams = userRightItemText.getLayoutParams();
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = null;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    layoutParams2.width = this.LLILLL;
                    C786410Ut5.W5(userRightItemText, layoutParams2);
                }
            }
            setMeasuredDimension(this.LLILLL, View.MeasureSpec.getSize(i2));
            i = View.MeasureSpec.makeMeasureSpec(this.LLILLL, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
