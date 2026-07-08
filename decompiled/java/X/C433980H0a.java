package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0H0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433980H0a extends LinkMovementMethod {
    public static final C01GW<C433980H0a> LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(114));

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && action != 1) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(scrollY), scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(iU3, iU3, ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            Selection.removeSelection(spannable);
            return false;
        }
        ClickableSpan clickableSpan = clickableSpanArr[0];
        if (action != 0) {
            clickableSpan.onClick(textView);
            return true;
        }
        Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
        return true;
    }
}
