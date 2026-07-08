package X;

import Y.ARunnableS106S0100000_6;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431460Gvw extends LinkMovementMethod {
    public static C431460Gvw LJFF;
    public ClickableSpan LIZ;
    public boolean LIZJ;
    public View LIZLLL;
    public final long LIZIZ = ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout();
    public final ARunnableS106S0100000_6 LJ = new ARunnableS106S0100000_6(this, 68);

    public static ClickableSpan LIZ(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(y), x);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(iU3, iU3, ClickableSpan.class);
        if (clickableSpanArr.length > 0) {
            ClickableSpan clickableSpan = clickableSpanArr[0];
            if (iU3 >= spannable.getSpanStart(clickableSpan) && iU3 <= spannable.getSpanEnd(clickableSpan)) {
                return clickableSpanArr[0];
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.LIZLLL = textView;
        if (motionEvent.getAction() == 0) {
            try {
                this.LIZ = LIZ(textView, spannable, motionEvent);
                this.LIZJ = false;
                textView.getHandler().removeCallbacks(this.LJ);
                HandlerHook.viewPostDelay(textView, this.LJ, this.LIZIZ);
                ClickableSpan clickableSpan = this.LIZ;
                if (clickableSpan != null) {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(this.LIZ));
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                ClickableSpan clickableSpanLIZ = LIZ(textView, spannable, motionEvent);
                ClickableSpan clickableSpan2 = this.LIZ;
                if (clickableSpan2 != null && clickableSpanLIZ != clickableSpan2) {
                    this.LIZ = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        } else {
            textView.getHandler().removeCallbacks(this.LJ);
            if (motionEvent.getAction() == 1 && !this.LIZJ) {
                if (this.LIZ == null) {
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
                    super.onTouchEvent(textView, spannable, motionEvent);
                }
            }
            this.LIZJ = false;
            this.LIZ = null;
            this.LIZLLL = null;
            Selection.removeSelection(spannable);
            return true;
        }
        return true;
    }
}
