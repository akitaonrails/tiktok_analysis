package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326880kdK extends C21578619ce {
    public final ArrayList<Function0<Unit>> LL;
    public Float LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;

    @Override // X.C21578619ce
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int iHeight;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        if (!this.LLILZ) {
            if (rect != null) {
                iHeight = rect.height();
            } else {
                iHeight = 0;
            }
            if (iHeight <= C12ES.LIZJ(50.0f, getContext())) {
                int iComputeScrollDeltaToGetChildRectOnScreen = super.computeScrollDeltaToGetChildRectOnScreen(rect);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("rect left ");
                Integer numValueOf5 = null;
                if (rect != null) {
                    numValueOf = Integer.valueOf(rect.left);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append("  right ");
                if (rect != null) {
                    numValueOf2 = Integer.valueOf(rect.right);
                } else {
                    numValueOf2 = null;
                }
                sbLIZ.append(numValueOf2);
                sbLIZ.append(" bottom ");
                if (rect != null) {
                    numValueOf3 = Integer.valueOf(rect.bottom);
                } else {
                    numValueOf3 = null;
                }
                sbLIZ.append(numValueOf3);
                sbLIZ.append(" top ");
                if (rect != null) {
                    numValueOf4 = Integer.valueOf(rect.top);
                } else {
                    numValueOf4 = null;
                }
                sbLIZ.append(numValueOf4);
                sbLIZ.append("height ");
                if (rect != null) {
                    numValueOf5 = Integer.valueOf(rect.height());
                }
                sbLIZ.append(numValueOf5);
                sbLIZ.append("   result ");
                sbLIZ.append(iComputeScrollDeltaToGetChildRectOnScreen);
                C2188811AlT.LIZIZ(sbLIZ);
                return iComputeScrollDeltaToGetChildRectOnScreen;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchTouchEvent: ");
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LLILLJJLI = Float.valueOf(motionEvent.getRawY());
            } else if (motionEvent.getAction() == 2) {
                float rawY = motionEvent.getRawY();
                Float f = this.LLILLJJLI;
                if (f != null) {
                    if (Math.abs(rawY - f.floatValue()) > this.LLILLL) {
                        this.LLILLJJLI = Float.valueOf(rawY);
                        Iterator<Function0<Unit>> it2 = this.LL.iterator();
                        while (it2.hasNext()) {
                            it2.next().invoke();
                        }
                    }
                } else {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setForbidAutoScrollToShowChild(boolean z) {
        this.LLILZ = z;
    }

    public C1326880kdK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1326880kdK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new ArrayList<>();
        this.LLILLL = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }
}
