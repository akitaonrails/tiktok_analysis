package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gvn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431370Gvn extends LinkMovementMethod {
    public static C431370Gvn LIZIZ;
    public AbstractC431380Gvo LIZ;

    public static AbstractC431380Gvo LIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(y), x);
        AbstractC431380Gvo[] abstractC431380GvoArr = (AbstractC431380Gvo[]) spannable.getSpans(iU3, iU3, AbstractC431380Gvo.class);
        if (abstractC431380GvoArr.length > 0) {
            AbstractC431380Gvo abstractC431380Gvo = abstractC431380GvoArr[0];
            if (iU3 >= spannable.getSpanStart(abstractC431380Gvo) && iU3 <= spannable.getSpanEnd(abstractC431380Gvo)) {
                return abstractC431380GvoArr[0];
            }
            return null;
        }
        return null;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                AbstractC431380Gvo abstractC431380GvoLIZ = LIZ(textView, spannable, motionEvent);
                this.LIZ = abstractC431380GvoLIZ;
                if (abstractC431380GvoLIZ != null) {
                    abstractC431380GvoLIZ.LLILLL = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(abstractC431380GvoLIZ), spannable.getSpanEnd(this.LIZ));
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                AbstractC431380Gvo abstractC431380GvoLIZ2 = LIZ(textView, spannable, motionEvent);
                AbstractC431380Gvo abstractC431380Gvo = this.LIZ;
                if (abstractC431380Gvo != null && abstractC431380GvoLIZ2 != abstractC431380Gvo) {
                    abstractC431380Gvo.LLILLL = false;
                    this.LIZ = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        } else {
            AbstractC431380Gvo abstractC431380Gvo2 = this.LIZ;
            if (abstractC431380Gvo2 != null) {
                abstractC431380Gvo2.LLILLL = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.LIZ = null;
            Selection.removeSelection(spannable);
            return true;
        }
        return true;
    }
}
