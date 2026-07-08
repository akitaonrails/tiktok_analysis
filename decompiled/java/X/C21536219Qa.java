package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19Qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21536219Qa extends FrameLayout.LayoutParams {
    public int LIZ;
    public float LIZIZ;

    public C21536219Qa(int i) {
        super(-1, i);
        this.LIZIZ = 0.5f;
    }

    public C21536219Qa(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZIZ = 0.5f;
    }

    public C21536219Qa(FrameLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZIZ = 0.5f;
    }

    public C21536219Qa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZIZ = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CollapsingToolbarLayout_Layout);
        this.LIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
        this.LIZIZ = typedArrayObtainStyledAttributes.getFloat(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
