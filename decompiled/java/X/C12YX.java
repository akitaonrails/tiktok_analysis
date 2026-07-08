package X;

import Y.ALAdapterS24S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: renamed from: X.12YX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YX implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C12YX c12yx) {
        View view;
        int measuredHeight;
        TuxSheet tuxSheet = ((C19396110uV) c12yx.l0).LLILZIL.get();
        if (tuxSheet != null && (view = tuxSheet.getView()) != null && (measuredHeight = view.getMeasuredHeight()) > 0) {
            C786410Ut5.C3(((View) c12yx.l1).getViewTreeObserver(), c12yx);
            ((C19396110uV) c12yx.l0).LLILZLL = measuredHeight;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            C19396110uV c19396110uV = (C19396110uV) c12yx.l0;
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(c19396110uV, 66));
            valueAnimatorOfFloat.addListener(new ALAdapterS24S0100000_29(c19396110uV, 29));
            valueAnimatorOfFloat.start();
        }
    }

    public static final void onGlobalLayout$1(C12YX c12yx) {
        String string;
        C786410Ut5.C3(((TextView) c12yx.l0).getViewTreeObserver(), c12yx);
        Context context = ((TextView) c12yx.l0).getContext();
        if (context == null || (string = context.getString(2131834551)) == null) {
            string = "";
        }
        TuxTextView tuxTextView = ((C120B) c12yx.l1).LLJIJIL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(string);
        TuxTextView tuxTextView3 = ((C120B) c12yx.l1).LLJIJIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        TextView textView = (TextView) c12yx.l0;
        new AnonymousClass1207(tuxTextView3, textView).LIZ(textView.getMaxLines(), string);
        TuxTextView tuxTextView4 = ((C120B) c12yx.l1).LLJIJIL;
        if (tuxTextView4 != null) {
            tuxTextView2 = tuxTextView4;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
    }

    public static final void onGlobalLayout$2(C12YX c12yx) {
        if (((View) c12yx.l0).getWidth() > 0 && ((View) c12yx.l0).getHeight() > 0) {
            C786410Ut5.C3(((View) c12yx.l0).getViewTreeObserver(), c12yx);
            ((AbstractC2173191A3h) c12yx.l1).LJIILLIIL();
        }
    }

    public static final void onGlobalLayout$3(C12YX c12yx) {
        View view;
        int measuredHeight;
        TuxSheet tuxSheet = ((C19395810uS) c12yx.l0).LLILZIL.get();
        if (tuxSheet != null && (view = tuxSheet.getView()) != null && (measuredHeight = view.getMeasuredHeight()) > 0) {
            C786410Ut5.C3(((View) c12yx.l1).getViewTreeObserver(), c12yx);
            C19395810uS c19395810uS = (C19395810uS) c12yx.l0;
            c19395810uS.LLILZLL = measuredHeight;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(((Number) c19395810uS.LLIZ.getValue()).longValue());
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            C19395810uS c19395810uS2 = (C19395810uS) c12yx.l0;
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(c19395810uS2, 73));
            valueAnimatorOfFloat.addListener(new ALAdapterS24S0100000_29(c19395810uS2, 32));
            valueAnimatorOfFloat.start();
        }
    }

    public C12YX(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
