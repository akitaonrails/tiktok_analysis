package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16GY, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16GY extends LinearLayout.LayoutParams {
    public int LIZ;
    public final Interpolator LIZIZ;

    public C16GY() {
        super(-1, -2);
        this.LIZ = 1;
    }

    public C16GY(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZ = 1;
    }

    public C16GY(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.LIZ = 1;
    }

    public C16GY(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZ = 1;
    }

    public C16GY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IMAppBarLayout_Layout);
        this.LIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.IMAppBarLayout_Layout_layout_scrollFlags, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.IMAppBarLayout_Layout_layout_scrollInterpolator)) {
            try {
                this.LIZIZ = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.IMAppBarLayout_Layout_layout_scrollInterpolator, 0));
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
