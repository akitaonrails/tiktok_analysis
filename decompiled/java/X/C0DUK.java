package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DUK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DUK extends FrameLayout {
    public int LL;
    public int LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedAdSurveyMaskLayout---dispatchTouchEvent---action=");
        Integer numValueOf2 = null;
        if (motionEvent != null) {
            numValueOf2 = Integer.valueOf(motionEvent.getAction());
        }
        sbLIZ.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LL = (int) motionEvent.getX();
                this.LLILLJJLI = (int) motionEvent.getY();
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if (numValueOf.intValue() == 2) {
                if (Math.abs(motionEvent.getX() - this.LL) > Math.abs(motionEvent.getY() - this.LLILLJJLI)) {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    return true;
                }
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedAdSurveyMaskLayout---onTouchEvent---action=");
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        return true;
    }

    public C0DUK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
