package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.touchpoint.api.model.ProgressBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0T8I, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8I extends LinearLayout {
    public LinearLayout LL;
    public View LLILLJJLI;
    public ProgressBar LLILLL;

    public final int getOffset() {
        ProgressBar progressBar = this.LLILLL;
        if (progressBar == null) {
            return 0;
        }
        Float f = progressBar.percent;
        return (int) (getProgressBarFromXml().getMeasuredWidth() * (f != null ? f.floatValue() : 0.0f));
    }

    public final View getPercentBarFromXml() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.q8i);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    public final LinearLayout getProgressBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s8q);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void setPercentBarFromXml(View view) {
        this.LLILLJJLI = view;
    }

    public final void setProgressBarFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public C0T8I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.LJLLJ(context, R.layout.ia2, this);
    }
}
