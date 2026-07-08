package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19MI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MI extends ViewGroup.MarginLayoutParams {
    public int LIZ;

    public C19MI() {
        super(-2, -2);
        this.LIZ = 8388627;
    }

    public C19MI(C19MI c19mi) {
        super((ViewGroup.MarginLayoutParams) c19mi);
        this.LIZ = c19mi.LIZ;
    }

    public C19MI(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C19MI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBarLayout);
        this.LIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.ActionBarLayout_android_layout_gravity, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
