package Y;

import X.C0I7D;
import X.C1195550hDV;
import X.C786410Ut5;
import android.text.Layout;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: loaded from: classes7.dex */
public class ATListenerS335S0200000_6 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS335S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS335S0200000_6 aTListenerS335S0200000_6, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C0I7D c0i7d = (C0I7D) aTListenerS335S0200000_6.l0;
            HandlerHook.viewPost(c0i7d, new ARunnableS106S0100000_6((Object) c0i7d, 157));
            ((C1195550hDV) aTListenerS335S0200000_6.l1).LLJIJIL.invoke();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS335S0200000_6 aTListenerS335S0200000_6, View view, MotionEvent motionEvent) {
        if (!(view instanceof TuxTextView)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0 && action != 1) {
            return false;
        }
        float x = motionEvent.getX();
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        float totalPaddingLeft = (x - appCompatTextView.getTotalPaddingLeft()) + appCompatTextView.getScrollX();
        float y = (motionEvent.getY() - appCompatTextView.getTotalPaddingTop()) + appCompatTextView.getScrollY();
        Layout layout = appCompatTextView.getLayout();
        int lineForVertical = layout.getLineForVertical((int) y);
        int iU3 = C786410Ut5.U3(layout, lineForVertical, totalPaddingLeft);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannableStringBuilder) aTListenerS335S0200000_6.l0).getSpans(iU3, iU3, ClickableSpan.class);
        if (totalPaddingLeft <= appCompatTextView.getPaint().measureText(appCompatTextView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString()) && clickableSpanArr.length != 0) {
            if (action != 0) {
                clickableSpanArr[0].onClick((TuxTextView) aTListenerS335S0200000_6.l1);
                appCompatTextView.performClick();
                return true;
            }
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aTListenerS335S0200000_6.l0;
            Selection.setSelection(spannableStringBuilder, spannableStringBuilder.getSpanStart(clickableSpanArr[0]), ((SpannableStringBuilder) aTListenerS335S0200000_6.l0).getSpanEnd(clickableSpanArr[0]));
            return true;
        }
        Selection.removeSelection((SpannableStringBuilder) aTListenerS335S0200000_6.l0);
        return false;
    }

    public static final boolean onTouch$2(ATListenerS335S0200000_6 aTListenerS335S0200000_6, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if ((view instanceof TextView) && numValueOf != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 0)) {
            float x = motionEvent.getX();
            TextView textView = (TextView) view;
            float totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
            float y = (motionEvent.getY() - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical((int) y);
            int iU3 = C786410Ut5.U3(layout, lineForVertical, totalPaddingLeft);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannableStringBuilder) aTListenerS335S0200000_6.l0).getSpans(iU3, iU3, ClickableSpan.class);
            if (totalPaddingLeft <= textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString()) && clickableSpanArr.length != 0) {
                if (numValueOf.intValue() == 1) {
                    clickableSpanArr[0].onClick((TuxTextView) aTListenerS335S0200000_6.l1);
                } else if (numValueOf.intValue() == 0) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aTListenerS335S0200000_6.l0;
                    Selection.setSelection(spannableStringBuilder, spannableStringBuilder.getSpanStart(clickableSpanArr[0]), ((SpannableStringBuilder) aTListenerS335S0200000_6.l0).getSpanEnd(clickableSpanArr[0]));
                    return true;
                }
                return true;
            }
            Selection.removeSelection((SpannableStringBuilder) aTListenerS335S0200000_6.l0);
        }
        return false;
    }
}
