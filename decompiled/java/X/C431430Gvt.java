package X;

import Y.ARunnableS106S0100000_6;
import android.os.Handler;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431430Gvt extends LinkMovementMethod {
    public static C431430Gvt LJFF;
    public AbstractC431450Gvv LIZ;
    public View LIZLLL;
    public final long LIZIZ = ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout();
    public boolean LIZJ = false;
    public final ARunnableS106S0100000_6 LJ = new ARunnableS106S0100000_6(this, 248);

    public static AbstractC431450Gvv LIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(y), x);
        AbstractC431450Gvv[] abstractC431450GvvArr = (AbstractC431450Gvv[]) spannable.getSpans(iU3, iU3, AbstractC431450Gvv.class);
        if (abstractC431450GvvArr.length > 0) {
            AbstractC431450Gvv abstractC431450Gvv = abstractC431450GvvArr[0];
            if (iU3 >= spannable.getSpanStart(abstractC431450Gvv) && iU3 <= spannable.getSpanEnd(abstractC431450Gvv)) {
                return abstractC431450GvvArr[0];
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.text.Spannable] */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (textView != 0 && spannable != 0 && motionEvent != null) {
            this.LIZLLL = textView;
            if (motionEvent.getAction() == 0) {
                try {
                    this.LIZ = LIZ(textView, spannable, motionEvent);
                    this.LIZJ = false;
                    Handler handler = textView.getHandler();
                    if (handler != null) {
                        handler.removeCallbacks(this.LJ);
                        C786410Ut5.LJLIIL(this.LIZIZ, handler, this.LJ);
                    }
                    AbstractC431450Gvv abstractC431450Gvv = this.LIZ;
                    if (abstractC431450Gvv != null) {
                        abstractC431450Gvv.LL = true;
                        Selection.setSelection(spannable, spannable.getSpanStart(abstractC431450Gvv), spannable.getSpanEnd(this.LIZ));
                        return true;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            } else if (motionEvent.getAction() == 2) {
                try {
                    AbstractC431450Gvv abstractC431450GvvLIZ = LIZ(textView, spannable, motionEvent);
                    AbstractC431450Gvv abstractC431450Gvv2 = this.LIZ;
                    if (abstractC431450Gvv2 != null && abstractC431450GvvLIZ != abstractC431450Gvv2) {
                        abstractC431450Gvv2.LL = false;
                        this.LIZ = null;
                        Selection.removeSelection(spannable);
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return false;
                }
            } else {
                Handler handler2 = textView.getHandler();
                if (handler2 != null) {
                    handler2.removeCallbacks(this.LJ);
                }
                if (motionEvent.getAction() == 1 && !this.LIZJ) {
                    AbstractC431450Gvv abstractC431450Gvv3 = this.LIZ;
                    if (abstractC431450Gvv3 == null) {
                        while (true) {
                            if (!(textView.getParent() instanceof ViewGroup)) {
                                break;
                            }
                            textView = (View) textView.getParent();
                            if (textView.hasOnClickListeners()) {
                                textView.performClick();
                                break;
                            }
                        }
                    } else {
                        abstractC431450Gvv3.LL = false;
                        super.onTouchEvent(textView, spannable, motionEvent);
                    }
                }
                AbstractC431450Gvv abstractC431450Gvv4 = this.LIZ;
                if (abstractC431450Gvv4 != null) {
                    abstractC431450Gvv4.LL = false;
                }
                this.LIZJ = false;
                this.LIZ = null;
                this.LIZLLL = null;
                Selection.removeSelection(spannable);
                return true;
            }
            return true;
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
