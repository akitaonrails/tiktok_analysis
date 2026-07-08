package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Gvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431290Gvf extends BaseMovementMethod {
    public final Function2<MotionEvent, ViewGroup, Unit> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C431290Gvf(Function2<? super MotionEvent, ? super ViewGroup, Unit> function2) {
        this.LIZ = function2;
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Integer numValueOf;
        if (textView != null && spannable != null) {
            if (motionEvent != null) {
                numValueOf = Integer.valueOf(motionEvent.getAction());
            } else {
                numValueOf = null;
            }
            View view = (View) textView.getParent();
            if (numValueOf != null) {
                if (numValueOf.intValue() != 1 && numValueOf.intValue() != 0) {
                    if (numValueOf.intValue() == 3) {
                        view.setPressed(false);
                    }
                } else {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                    int totalPaddingTop = y - textView.getTotalPaddingTop();
                    int scrollX = totalPaddingLeft + textView.getScrollX();
                    int scrollY = totalPaddingTop + textView.getScrollY();
                    Layout layout = textView.getLayout();
                    if (layout != null) {
                        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(scrollY), scrollX);
                        AbstractC431340Gvk[] abstractC431340GvkArr = (AbstractC431340Gvk[]) spannable.getSpans(iU3, iU3 + 1, AbstractC431340Gvk.class);
                        if (abstractC431340GvkArr.length == 0) {
                            this.LIZ.invoke(motionEvent, (ViewGroup) view);
                            Selection.removeSelection(spannable);
                        } else {
                            AbstractC431340Gvk abstractC431340Gvk = abstractC431340GvkArr[0];
                            if (numValueOf.intValue() == 1) {
                                abstractC431340Gvk.onClick(textView);
                                Selection.removeSelection(spannable);
                                abstractC431340Gvk.mIsPressed = false;
                            } else if (numValueOf.intValue() == 0) {
                                abstractC431340Gvk.mIsPressed = true;
                                Selection.setSelection(spannable, spannable.getSpanStart(abstractC431340Gvk), spannable.getSpanEnd(abstractC431340Gvk));
                                return true;
                            }
                            return true;
                        }
                    }
                }
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
