package X;

import android.content.Context;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C430510GuP extends C430560GuU {
    public AbstractC430520GuQ LLL;

    public final AbstractC430520GuQ LJJJJLI(MotionEvent motionEvent) {
        Spanned spanned;
        CharSequence text = getText();
        if (!(text instanceof Spanned) || (spanned = (Spanned) text) == null) {
            return null;
        }
        try {
            int iU3 = C786410Ut5.U3(getLayout(), getLayout().getLineForVertical((((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY()), (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX());
            AbstractC430520GuQ[] abstractC430520GuQArr = (AbstractC430520GuQ[]) spanned.getSpans(iU3, iU3, AbstractC430520GuQ.class);
            if (abstractC430520GuQArr.length == 0) {
                return null;
            }
            AbstractC430520GuQ abstractC430520GuQ = abstractC430520GuQArr[0];
            if (iU3 < spanned.getSpanStart(abstractC430520GuQ) || iU3 > spanned.getSpanEnd(abstractC430520GuQ)) {
                return null;
            }
            return abstractC430520GuQArr[0];
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC430520GuQ abstractC430520GuQ;
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (abstractC430520GuQ = this.LLL) != null) {
                        abstractC430520GuQ.LL = false;
                        this.LLL = null;
                        invalidate();
                    }
                    return false;
                }
                AbstractC430520GuQ abstractC430520GuQ2 = this.LLL;
                if (abstractC430520GuQ2 != null && abstractC430520GuQ2 != LJJJJLI(motionEvent)) {
                    AbstractC430520GuQ abstractC430520GuQ3 = this.LLL;
                    if (abstractC430520GuQ3 != null) {
                        abstractC430520GuQ3.LL = false;
                    }
                    this.LLL = null;
                    invalidate();
                }
                return false;
            }
            AbstractC430520GuQ abstractC430520GuQ4 = this.LLL;
            if (abstractC430520GuQ4 == null || abstractC430520GuQ4 != LJJJJLI(motionEvent)) {
                return false;
            }
            AbstractC430520GuQ abstractC430520GuQ5 = this.LLL;
            if (abstractC430520GuQ5 != null) {
                abstractC430520GuQ5.LL = false;
            }
            this.LLL = null;
            invalidate();
            return true;
        }
        AbstractC430520GuQ abstractC430520GuQLJJJJLI = LJJJJLI(motionEvent);
        if (abstractC430520GuQLJJJJLI == null) {
            return false;
        }
        abstractC430520GuQLJJJJLI.LL = true;
        this.LLL = abstractC430520GuQLJJJJLI;
        invalidate();
        return true;
    }

    public C430510GuP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
