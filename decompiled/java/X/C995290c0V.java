package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0c0V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995290c0V extends FrameLayout {
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxTextView LLILZ;
    public LinearLayout LLILZIL;
    public LinearLayout LLILZLL;

    public final LinearLayout getLlNoSelectionHint() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n_o);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlPaymentsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n_t);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvPaymentMethodFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z58);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvViewAllFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z7q);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getViewAllLlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.view_all_ll);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getViewAllLogoContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.view_all_logo_container);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public C995290c0V(Context context) {
        super(context, null, 0);
        addView(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dvh, this, false), new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public final void setLlNoSelectionHint(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    public final void setLlPaymentsFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setTvPaymentMethodFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setTvViewAllFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setViewAllLlFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setViewAllLogoContainerFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }
}
