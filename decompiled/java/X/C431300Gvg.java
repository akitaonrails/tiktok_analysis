package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431300Gvg extends LinkMovementMethod {
    public static C431300Gvg LIZIZ;
    public AbstractC431340Gvk LIZ;

    public static C431300Gvg LIZ() {
        if (LIZIZ == null) {
            LIZIZ = new C431300Gvg();
        }
        return LIZIZ;
    }

    public static AbstractC431340Gvk LIZIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(y), x);
        AbstractC431340Gvk[] abstractC431340GvkArr = (AbstractC431340Gvk[]) spannable.getSpans(iU3, iU3, AbstractC431340Gvk.class);
        if (abstractC431340GvkArr.length > 0) {
            AbstractC431340Gvk abstractC431340Gvk = abstractC431340GvkArr[0];
            if (iU3 >= spannable.getSpanStart(abstractC431340Gvk) && iU3 <= spannable.getSpanEnd(abstractC431340Gvk)) {
                return abstractC431340GvkArr[0];
            }
            return null;
        }
        return null;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                AbstractC431340Gvk abstractC431340GvkLIZIZ = LIZIZ(textView, spannable, motionEvent);
                this.LIZ = abstractC431340GvkLIZIZ;
                if (abstractC431340GvkLIZIZ != null) {
                    abstractC431340GvkLIZIZ.mIsPressed = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(abstractC431340GvkLIZIZ), spannable.getSpanEnd(this.LIZ));
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                AbstractC431340Gvk abstractC431340GvkLIZIZ2 = LIZIZ(textView, spannable, motionEvent);
                AbstractC431340Gvk abstractC431340Gvk = this.LIZ;
                if (abstractC431340Gvk != null && abstractC431340GvkLIZIZ2 != abstractC431340Gvk) {
                    abstractC431340Gvk.mIsPressed = false;
                    this.LIZ = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        } else {
            AbstractC431340Gvk abstractC431340Gvk2 = this.LIZ;
            if (abstractC431340Gvk2 != null) {
                abstractC431340Gvk2.mIsPressed = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.LIZ = null;
            Selection.removeSelection(spannable);
            return true;
        }
        return true;
    }
}
