package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0GvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431230GvZ extends ScrollingMovementMethod {
    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(iU3, iU3, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    C431920Gwg.LIZ(clickableSpanArr, null).onClick(textView);
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
