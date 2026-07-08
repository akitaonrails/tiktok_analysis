package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03C0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03C0 extends FrameLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;

    public final TuxIconView getUserRightIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_right_icon);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getUserRightItemTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_right_item_text);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public C03C0(Context context) {
        super(context, null, 0);
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.aq0, this, true);
    }

    public final void setUserRightIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setUserRightItemTextFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZIZ;
        if (getUserRightItemTextFromXml().getText().length() > 16) {
            iLIZIZ = C0H9H.LIZIZ(100);
        } else {
            iLIZIZ = C0H9H.LIZIZ(60);
        }
        TuxTextView userRightItemTextFromXml = getUserRightItemTextFromXml();
        ViewGroup.LayoutParams layoutParams = userRightItemTextFromXml.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.width = iLIZIZ;
            C786410Ut5.W5(userRightItemTextFromXml, layoutParams2);
        }
        setMeasuredDimension(iLIZIZ, View.MeasureSpec.getSize(i2));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iLIZIZ, 1073741824), i2);
    }
}
