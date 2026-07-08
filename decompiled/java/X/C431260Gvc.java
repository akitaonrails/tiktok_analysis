package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Gvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431260Gvc extends BaseMovementMethod {
    public static final C431260Gvc LIZ = new C431260Gvc();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Integer numValueOf;
        ClickableSpan[] clickableSpanArr;
        if (textView != null && spannable != null) {
            if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 0)) {
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
                if (scrollY >= 0 && scrollY <= layout.getHeight() && f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical) && (clickableSpanArr = (ClickableSpan[]) spannable.getSpans(iU3, iU3, ClickableSpan.class)) != 0) {
                    boolean z = false;
                    if (clickableSpanArr.length != 0) {
                        C511601z0 c511601z0 = clickableSpanArr[0];
                        if (c511601z0 instanceof InterfaceC431250Gvb) {
                            if (numValueOf.intValue() == 1) {
                                ((InterfaceC431250Gvb) c511601z0).LIZJ(textView, spannable, iU3);
                            } else if (numValueOf.intValue() == 0) {
                                ((InterfaceC431250Gvb) c511601z0).LJ(textView, spannable, iU3);
                            }
                            z = true;
                        }
                        if (numValueOf.intValue() == 1) {
                            c511601z0.onClick(textView);
                        }
                        if (z) {
                            textView.invalidate();
                        }
                        return true;
                    }
                }
                Selection.removeSelection(spannable);
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
