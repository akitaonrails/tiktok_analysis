package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431360Gvm extends LinkMovementMethod {
    public static C431360Gvm LIZIZ;
    public AbstractC344840DfW LIZ;

    public static C431360Gvm LIZ() {
        if (LIZIZ == null) {
            LIZIZ = new C431360Gvm();
        }
        return LIZIZ;
    }

    public static AbstractC344840DfW LIZIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(y), x);
        AbstractC344840DfW[] abstractC344840DfWArr = (AbstractC344840DfW[]) spannable.getSpans(iU3, iU3, AbstractC344840DfW.class);
        if (abstractC344840DfWArr.length > 0) {
            AbstractC344840DfW abstractC344840DfW = abstractC344840DfWArr[0];
            if (iU3 >= spannable.getSpanStart(abstractC344840DfW) && iU3 <= spannable.getSpanEnd(abstractC344840DfW)) {
                return abstractC344840DfWArr[0];
            }
            return null;
        }
        return null;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                AbstractC344840DfW abstractC344840DfWLIZIZ = LIZIZ(textView, spannable, motionEvent);
                this.LIZ = abstractC344840DfWLIZIZ;
                if (abstractC344840DfWLIZIZ != null) {
                    abstractC344840DfWLIZIZ.LLILLL = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(abstractC344840DfWLIZIZ), spannable.getSpanEnd(this.LIZ));
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                AbstractC344840DfW abstractC344840DfWLIZIZ2 = LIZIZ(textView, spannable, motionEvent);
                AbstractC344840DfW abstractC344840DfW = this.LIZ;
                if (abstractC344840DfW != null && abstractC344840DfWLIZIZ2 != abstractC344840DfW) {
                    abstractC344840DfW.LLILLL = false;
                    this.LIZ = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        } else {
            AbstractC344840DfW abstractC344840DfW2 = this.LIZ;
            if (abstractC344840DfW2 != null) {
                abstractC344840DfW2.LLILLL = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.LIZ = null;
            Selection.removeSelection(spannable);
            return true;
        }
        return true;
    }
}
