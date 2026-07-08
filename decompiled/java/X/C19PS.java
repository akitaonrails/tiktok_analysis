package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19PS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19PS extends ViewGroup.MarginLayoutParams {
    public final int LIZ;
    public final C19PY LIZIZ;

    public C19PS(int i) {
        super(-1, i);
    }

    public C19PS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmartRefreshLayout_Layout);
        this.LIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_Layout_layout_srlBackgroundColor, this.LIZ);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle)) {
            this.LIZIZ = C19PY.LJI[typedArrayObtainStyledAttributes.getInt(R$styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle, 0)];
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
