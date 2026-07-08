package X;

import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.im.common.view.TightTuxTextView;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.16FA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16FA extends TightTuxTextView {
    public MotionEvent LLJJJJ;
    public final C01GW LLJJJJJIL;
    public CharacterStyle LLJJJJLIIL;

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return null;
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.LLJJJJJIL.getValue();
    }

    private final CharacterStyle getPressedSpan() {
        CharacterStyle characterStyle = this.LLJJJJLIIL;
        if (characterStyle != null) {
            return characterStyle;
        }
        CharacterStyle charStyle = getCharStyle();
        this.LLJJJJLIIL = charStyle;
        return charStyle;
    }

    public final CharacterStyle getCharStyle() {
        return new BackgroundColorSpan(getHighlightColor());
    }

    public final CharacterStyle getHighlightSpan() {
        return this.LLJJJJLIIL;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return getGestureDetector().onTouchEvent(motionEvent);
    }

    public final void setHighlightSpan(CharacterStyle characterStyle) {
        this.LLJJJJLIIL = characterStyle;
    }

    public C16FA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1456));
        getPaint().setUnderlineText(false);
        setTextIsSelectable(true);
    }

    public final boolean LJJJJJ(MotionEvent motionEvent, int i) {
        Spannable spannable;
        boolean z;
        if (motionEvent == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - getTotalPaddingLeft();
        int totalPaddingTop = y - getTotalPaddingTop();
        int scrollX = totalPaddingLeft + getScrollX();
        int scrollY = totalPaddingTop + getScrollY();
        Layout layout = getLayout();
        int iMax = Math.max(C786410Ut5.U3(layout, layout.getLineForVertical(scrollY), scrollX), 0);
        CharSequence text = getText();
        if (!(text instanceof Spannable) || (spannable = (Spannable) text) == null) {
            return false;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(iMax, iMax, ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
            int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
            if (i != 0) {
                if (i != 1) {
                    if (i == 3) {
                        Selection.removeSelection(spannable);
                        spannable.removeSpan(getPressedSpan());
                        return true;
                    }
                } else {
                    clickableSpanArr[0].onClick(this);
                    spannable.removeSpan(getPressedSpan());
                    Selection.removeSelection(spannable);
                    spannable.removeSpan(getPressedSpan());
                    return true;
                }
            } else {
                Selection.setSelection(spannable, spanStart, spanEnd);
                C786410Ut5.o2(spannable, getPressedSpan(), spanStart, spanEnd, 33);
                return true;
            }
        } else {
            Selection.removeSelection(spannable);
            spannable.removeSpan(getPressedSpan());
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            onTouchEvent(motionEventObtain);
        }
        return false;
    }
}
