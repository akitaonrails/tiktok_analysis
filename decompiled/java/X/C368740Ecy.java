package X;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ecy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368740Ecy extends AbstractC368670Ecr {
    public Function0<Unit> LLJ;

    @Override // X.AbstractC368670Ecr
    public final void LIZ() {
    }

    public final Function0<Unit> getOnScaleUpdate$editor_trackpanel_release() {
        return this.LLJ;
    }

    public final void setOnScaleUpdate$editor_trackpanel_release(Function0<Unit> function0) {
        this.LLJ = function0;
    }

    @Override // X.AbstractC368670Ecr
    public void setTimelineScale(float f) {
        if (getTimelineScale() != f) {
            super.setTimelineScale(f);
            Function0<Unit> function0 = this.LLJ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public C368740Ecy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // X.AbstractC368670Ecr, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Function2<Integer, Integer, Unit> scrollChangeListener = getScrollChangeListener();
        if (scrollChangeListener != null) {
            scrollChangeListener.invoke(Integer.valueOf(getScrollX()), Integer.valueOf(i - i3));
        }
    }
}
