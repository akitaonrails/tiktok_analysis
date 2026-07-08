package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0GvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431180GvU extends C431190GvV {
    public static C431180GvU LIZJ;
    public boolean LIZ = true;
    public float LIZIZ;

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2) {
            if (Math.abs(motionEvent.getY() - this.LIZIZ) > 10.0f) {
                this.LIZ = false;
            }
        } else if (action == 0 || action == 1) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(scrollY);
            float f = scrollX;
            int iU3 = C786410Ut5.U3(layout, lineForVertical, f);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(iU3, iU3, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action != 0) {
                    if (this.LIZ) {
                        if (f >= textView.getWidth() - textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString())) {
                            C431920Gwg.LIZ(clickableSpanArr, null).onClick(textView);
                        }
                    }
                } else {
                    this.LIZIZ = motionEvent.getY();
                    this.LIZ = true;
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
