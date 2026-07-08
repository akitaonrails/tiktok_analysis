package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Guh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewOnTouchListenerC430690Guh implements View.OnTouchListener {
    public static ViewOnTouchListenerC430690Guh LL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TextView textView = (TextView) view;
        Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
        int action = motionEvent.getAction();
        if (action != 1 && action != 0) {
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
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableNewSpannable.getSpans(iU3, iU3, ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            return false;
        }
        if (action == 1) {
            clickableSpanArr[0].onClick(textView);
        }
        return true;
    }
}
