package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338940DQm extends ConstraintLayout {
    public final float LL;

    public final boolean e0() {
        float paddingLeft = (this.LL - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                paddingLeft = ((paddingLeft - childAt.getMeasuredWidth()) - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0)) - (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
                if (paddingLeft < 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return (isHorizontalFadingEdgeEnabled() && C497740JfY.LJJ() && e0()) ? 1.0f : 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return (isHorizontalFadingEdgeEnabled() && !C497740JfY.LJJ() && e0()) ? 1.0f : 0.0f;
    }

    public C338940DQm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C338940DQm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = context.getResources().getDimension(R.dimen.amm);
    }
}
