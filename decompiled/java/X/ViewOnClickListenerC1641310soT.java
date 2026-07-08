package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0soT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class ViewOnClickListenerC1641310soT extends FrameLayout implements View.OnClickListener {
    public final Context LL;
    public AbstractC1640730snX LLILLJJLI;
    public final List<C1641320soU> LLILLL;
    public InterfaceC1640480sn8 LLILZ;
    public final List<View> LLILZIL;

    public final void LIZ() {
        int iLIZ;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && ((ArrayList) this.LLILZIL).size() < 20) {
                ((ArrayList) this.LLILZIL).add(childAt);
            }
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViewsInLayout();
        AbstractC1640730snX abstractC1640730snX = this.LLILLJJLI;
        if (abstractC1640730snX != null && (iLIZ = abstractC1640730snX.LIZ()) > 0) {
            int i2 = 0;
            do {
                AbstractC1640730snX abstractC1640730snX2 = this.LLILLJJLI;
                if (abstractC1640730snX2 != null) {
                    if (!((ArrayList) this.LLILZIL).isEmpty()) {
                        ListProtector.remove(this.LLILZIL, 0);
                    }
                    View viewLIZIZ = abstractC1640730snX2.LIZIZ(i2);
                    if (viewLIZIZ != null) {
                        C786410Ut5.I7(this, viewLIZIZ);
                        ViewGroup.LayoutParams layoutParams = viewLIZIZ.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = generateDefaultLayoutParams();
                        }
                        addViewInLayout(viewLIZIZ, -1, layoutParams);
                    }
                }
                i2++;
            } while (i2 < iLIZ);
        }
        requestLayout();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1640480sn8 interfaceC1640480sn8 = this.LLILZ;
        if (interfaceC1640480sn8 == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) == view) {
                interfaceC1640480sn8.LIZ(i);
            }
        }
    }

    public final void setFlowPanelAdapter(AbstractC1640730snX abstractC1640730snX) {
        if (this.LLILLJJLI != abstractC1640730snX) {
            this.LLILLJJLI = abstractC1640730snX;
            if (abstractC1640730snX != null) {
                if (abstractC1640730snX.LIZ == this) {
                    abstractC1640730snX.LIZ = null;
                }
                abstractC1640730snX.LIZ = this;
            }
            LIZ();
        }
    }

    public final void setOnItemClickedListener(InterfaceC1640480sn8 interfaceC1640480sn8) {
        this.LLILZ = interfaceC1640480sn8;
    }

    public ViewOnClickListenerC1641310soT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = context;
        this.LLILLL = new ArrayList();
        this.LLILZIL = new ArrayList();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = (View.MeasureSpec.getSize(i) - getPaddingStart()) - getPaddingEnd();
        ((ArrayList) this.LLILLL).clear();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (getChildCount() > 0) {
            int childCount = getChildCount();
            C1641320soU c1641320soU = null;
            int measuredHeight = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                measureChild(childAt, Integer.MIN_VALUE | size2, 0);
                if (c1641320soU != null) {
                    if (!c1641320soU.LIZ(childAt)) {
                        paddingTop += c1641320soU.LIZLLL;
                        c1641320soU = new C1641320soU(this, size2);
                        ((ArrayList) this.LLILLL).add(c1641320soU);
                        c1641320soU.LIZ(childAt);
                        measuredHeight = 0;
                    }
                } else {
                    c1641320soU = new C1641320soU(this, size2);
                    ((ArrayList) this.LLILLL).add(c1641320soU);
                    c1641320soU.LIZ(childAt);
                    measuredHeight = 0;
                }
                if (measuredHeight < childAt.getMeasuredHeight()) {
                    measuredHeight = childAt.getMeasuredHeight();
                    c1641320soU.LIZLLL = measuredHeight;
                }
            }
            if (c1641320soU != null) {
                paddingTop += c1641320soU.LIZLLL;
            }
        }
        setMeasuredDimension(size, paddingTop);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (((ArrayList) this.LLILLL).size() <= 0) {
            return;
        }
        int paddingTop = getPaddingTop();
        int paddingStart = getPaddingStart();
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        for (C1641320soU c1641320soU : (ArrayList) this.LLILLL) {
            int i5 = c1641320soU.LIZ;
            int i6 = c1641320soU.LIZIZ;
            if (i5 - i6 < width) {
                c1641320soU.LIZIZ(paddingTop, ((width - (i5 - i6)) >> 1) + paddingStart);
            } else {
                c1641320soU.LIZIZ(paddingTop, paddingStart);
            }
            paddingTop += c1641320soU.LIZLLL;
        }
    }
}
