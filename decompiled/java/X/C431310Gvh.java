package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431310Gvh extends LinkMovementMethod {
    public static final C431310Gvh LIZ = new C431310Gvh();
    public static C431980Gwm LIZIZ;
    public static boolean LIZJ;

    public static void LIZ(TextView textView, Spannable spannable) {
        C431980Gwm c431980Gwm = LIZIZ;
        if (c431980Gwm != null) {
            c431980Gwm.LIZLLL = false;
        }
        Selection.removeSelection(spannable);
        textView.invalidate();
        LIZIZ = null;
    }

    public static C431980Gwm LIZIZ(TextView textView, MotionEvent motionEvent) {
        Spannable spannable;
        Pair pair = new Pair(Integer.valueOf((int) ((motionEvent.getX() - textView.getTotalPaddingLeft()) + textView.getScrollX())), Integer.valueOf((int) ((motionEvent.getY() - textView.getTotalPaddingTop()) + textView.getScrollY())));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        Layout layout = textView.getLayout();
        Object obj = null;
        if (layout == null) {
            return null;
        }
        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(iIntValue2), iIntValue);
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable) || (spannable = (Spannable) text) == null) {
            return null;
        }
        Object[] spans = spannable.getSpans(iU3, iU3, C431980Gwm.class);
        int length = spans.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj2 = spans[i];
            if (spannable.getSpanStart(obj2) <= iU3 && spannable.getSpanEnd(obj2) > iU3) {
                obj = obj2;
                break;
            }
            i++;
        }
        return (C431980Gwm) obj;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(textView, spannable, motionEvent);
                    }
                    LIZ(textView, spannable);
                    if (LIZJ) {
                        LIZJ = false;
                        textView.setBackground(null);
                    }
                    return super.onTouchEvent(textView, spannable, motionEvent);
                }
                C431980Gwm c431980GwmLIZIZ = LIZIZ(textView, motionEvent);
                C431980Gwm c431980Gwm = LIZIZ;
                if (c431980Gwm != null && !Intrinsics.LJFF(c431980GwmLIZIZ, c431980Gwm)) {
                    LIZ(textView, spannable);
                }
                return super.onTouchEvent(textView, spannable, motionEvent);
            }
            C431980Gwm c431980Gwm2 = LIZIZ;
            if (c431980Gwm2 != null) {
                Function1<View, Unit> function1 = c431980Gwm2.LIZJ;
                LIZ(textView, spannable);
                if (function1 == null) {
                    return true;
                }
                function1.invoke(textView);
                return true;
            }
            if (LIZJ) {
                LIZJ = false;
                textView.setBackground(null);
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        C431980Gwm c431980GwmLIZIZ2 = LIZIZ(textView, motionEvent);
        LIZIZ = c431980GwmLIZIZ2;
        if (c431980GwmLIZIZ2 != null) {
            c431980GwmLIZIZ2.LIZLLL = true;
            Selection.setSelection(spannable, spannable.getSpanStart(c431980GwmLIZIZ2), spannable.getSpanEnd(LIZIZ));
            textView.invalidate();
            return true;
        }
        LIZJ = true;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, textView.getContext());
        if (numLIZJ != null) {
            textView.setBackgroundColor(numLIZJ.intValue());
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
