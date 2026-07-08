package X;

import Y.ACListenerS151S0100000_16;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bsb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990390bsb extends LinearLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public ValueAnimator LLILZ;

    public final TuxIconView getCommerceTipsCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.efb);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getCommerceTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.efa);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.LLILZ;
    }

    public final View getUnderView() {
        return this.LLILLL;
    }

    public final void setCommerceTipsCloseFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setCommerceTipsFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.LLILZ = valueAnimator;
    }

    public final void setUnderView(View view) {
        this.LLILLL = view;
    }

    public C990390bsb(Context context, AttributeSet attributeSet) {
        String string;
        super(context, attributeSet, 0);
        C786410Ut5.LJLLJ(context, R.layout.i9t, this);
        setOrientation(1);
        C786410Ut5.a9(getCommerceTipsCloseFromXml(), new ACListenerS151S0100000_16(this, 55));
        TuxTextView commerceTipsFromXml = getCommerceTipsFromXml();
        String str = C990360bsY.LIZ().text;
        if (str != null && str.length() != 0) {
            string = C990360bsY.LIZ().text;
        } else {
            string = getContext().getString(2131829273);
        }
        commerceTipsFromXml.setText(string);
        setLayerType(1, null);
    }
}
