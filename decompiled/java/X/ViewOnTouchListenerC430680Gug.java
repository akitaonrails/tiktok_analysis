package X;

import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0Gug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewOnTouchListenerC430680Gug implements View.OnTouchListener {
    public View LLILLJJLI;
    public long LL = -1;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS106S0100000_6 LLILZ = new ARunnableS106S0100000_6(this, 177);

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        if (action != 2) {
            this.LLILLL.removeCallbacksAndMessages(null);
        }
        if (action == 0) {
            this.LL = System.currentTimeMillis();
            this.LLILLJJLI = view;
            C786410Ut5.LJLIIL(ViewConfiguration.getLongPressTimeout(), this.LLILLL, this.LLILZ);
            C786410Ut5.T4(view, 0.5f);
        } else {
            C786410Ut5.T4(view, 1.0f);
            if (System.currentTimeMillis() - this.LL < ViewConfiguration.getLongPressTimeout() && action == 1) {
                C786410Ut5.T4(view, 1.0f);
                if (text instanceof Spanned) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                    int totalPaddingTop = y - textView.getTotalPaddingTop();
                    int scrollX = totalPaddingLeft + textView.getScrollX();
                    int scrollY = totalPaddingTop + textView.getScrollY();
                    Layout layout = textView.getLayout();
                    int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(scrollY), scrollX);
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(iU3, iU3, ClickableSpan.class);
                    if (clickableSpanArr.length == 0) {
                        view.performClick();
                        return true;
                    }
                    clickableSpanArr[0].onClick(textView);
                    return true;
                }
                view.performClick();
                return true;
            }
        }
        return true;
    }
}
