package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431060GvI extends C431070GvJ {
    public static C431060GvI LIZ;

    public static C431060GvI LIZ() {
        if (LIZ == null) {
            synchronized (C431050GvH.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C431060GvI();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
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
            if (clickableSpanArr.length != 0 && action == 1) {
                if (f <= textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString())) {
                    C431920Gwg.LIZ(clickableSpanArr, null).onClick(textView);
                }
            }
        }
        return true;
    }
}
