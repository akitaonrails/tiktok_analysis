package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16GZ extends LinearLayout.LayoutParams {
    public int LIZ;
    public final Interpolator LIZIZ;

    public C16GZ(int i) {
        super(-1, i);
        this.LIZ = 1;
    }

    public C16GZ(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZ = 1;
    }

    public C16GZ(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.LIZ = 1;
    }

    public C16GZ(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZ = 1;
    }

    public C16GZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
        this.LIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
            this.LIZIZ = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
