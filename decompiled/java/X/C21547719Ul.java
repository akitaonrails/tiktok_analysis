package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Ul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21547719Ul extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
    }

    static {
        new DecelerateInterpolator();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.ActionBar, R.attr.b82, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.b)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.c9));
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        context.getResources().getDimensionPixelSize(R.dimen.c_);
    }

    public void setContentHeight(int i) {
        requestLayout();
    }

    public void setTabSelected(int i) {
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C21547619Uk) view).getTab().LIZ();
    }
}
