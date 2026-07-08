package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.widgets.ConstraintOptimizer;

/* JADX INFO: renamed from: X.0eU0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1090460eU0 extends C19MW {
    public C1090460eU0(Context context) {
        this(context, null, 0);
    }

    public void callSuperSetLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            ConstraintOptimizer.INSTANCE.correctHelperParams$live_widget_release(layoutParams);
        }
        callSuperSetLayoutParams(layoutParams);
    }

    @Override // X.C19MX
    public void updatePreLayout(ConstraintLayout constraintLayout) {
        super.updatePreLayout(constraintLayout);
        if (constraintLayout == null) {
            return;
        }
        int i = this.mCount;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < i) {
                View viewById = constraintLayout.getViewById(this.mIds[i3]);
                if (viewById != null && (viewById.getVisibility() == 0 || viewById.getVisibility() == 4)) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i2 = 8;
                break;
            }
        }
        int visibility = getVisibility();
        setVisibility(i2);
        C1602160rnK.LIZIZ(visibility, i2, this);
    }

    public C1090460eU0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.C19MX, android.view.View
    public void onMeasure(int i, int i2) {
        ConstraintOptimizer constraintOptimizer = ConstraintOptimizer.INSTANCE;
        setMeasuredDimension(constraintOptimizer.getOptMeasureSize$live_widget_release(getLayoutParams().width, i), constraintOptimizer.getOptMeasureSize$live_widget_release(getLayoutParams().height, i2));
    }

    public C1090460eU0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }
}
