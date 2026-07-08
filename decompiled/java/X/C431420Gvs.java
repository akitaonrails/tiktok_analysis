package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431420Gvs extends LinkMovementMethod {
    public static final C431420Gvs LIZ = new C431420Gvs();
    public static AbstractC431450Gvv LIZIZ;

    public static AbstractC431450Gvv LIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        if (layout != null) {
            int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(y), x);
            AbstractC431450Gvv[] abstractC431450GvvArr = (AbstractC431450Gvv[]) spannable.getSpans(iU3, iU3, AbstractC431450Gvv.class);
            if (abstractC431450GvvArr.length != 0) {
                C431420Gvs c431420Gvs = LIZ;
                AbstractC431450Gvv abstractC431450Gvv = abstractC431450GvvArr[0];
                c431420Gvs.getClass();
                if (iU3 >= spannable.getSpanStart(abstractC431450Gvv) && iU3 <= spannable.getSpanEnd(abstractC431450Gvv)) {
                    return abstractC431450GvvArr[0];
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                AbstractC431450Gvv abstractC431450Gvv = LIZIZ;
                if (abstractC431450Gvv != null) {
                    abstractC431450Gvv.LL = false;
                    super.onTouchEvent(textView, spannable, motionEvent);
                    textView.invalidate();
                }
                LIZIZ = null;
                Selection.removeSelection(spannable);
            } else {
                try {
                    AbstractC431450Gvv abstractC431450GvvLIZ = LIZ(textView, spannable, motionEvent);
                    AbstractC431450Gvv abstractC431450Gvv2 = LIZIZ;
                    if (abstractC431450Gvv2 != null && abstractC431450GvvLIZ != abstractC431450Gvv2) {
                        abstractC431450Gvv2.LL = false;
                        LIZIZ = null;
                        Selection.removeSelection(spannable);
                        textView.invalidate();
                        return true;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (e.getMessage() != null) {
                        int i = C2187451AjH.LIZ;
                    }
                    return false;
                }
            }
        } else {
            try {
                AbstractC431450Gvv abstractC431450GvvLIZ2 = LIZ(textView, spannable, motionEvent);
                LIZIZ = abstractC431450GvvLIZ2;
                if (abstractC431450GvvLIZ2 != null) {
                    abstractC431450GvvLIZ2.LL = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(abstractC431450GvvLIZ2), spannable.getSpanEnd(abstractC431450GvvLIZ2));
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (e2.getMessage() != null) {
                    int i2 = C2187451AjH.LIZ;
                }
                return false;
            }
        }
        return true;
    }
}
