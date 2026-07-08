package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.widgets.ConstraintOptimizer;
import com.bytedance.ies.sdk.widgets.LayeredElementConfiguration;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0eTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1090450eTz extends View {
    public Integer indicatorColor;

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public final Integer getIndicatorColor$live_widget_release() {
        return this.indicatorColor;
    }

    public C1090450eTz(Context context) {
        this(context, null, 0);
    }

    public final void setIndicatorColor$live_widget_release(Integer num) {
        this.indicatorColor = num;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            ConstraintOptimizer.INSTANCE.correctHelperParams$live_widget_release(layoutParams);
        }
        super.setLayoutParams(layoutParams);
    }

    public C1090450eTz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ConstraintOptimizer constraintOptimizer = ConstraintOptimizer.INSTANCE;
        setMeasuredDimension(constraintOptimizer.getOptMeasureSize$live_widget_release(getLayoutParams().width, i), constraintOptimizer.getOptMeasureSize$live_widget_release(getLayoutParams().height, i2));
    }

    public C1090450eTz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (LayeredElementConfiguration.INSTANCE.getGuidelineIndicatorEnabled()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GuidelineView, i, 0);
            this.indicatorColor = -65536;
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
