package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.14L8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14L8 extends ViewGroup.MarginLayoutParams {
    public int LIZ;
    public int LIZIZ;

    public C14L8(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZ = LSPassThroughRecordSizeConfig.DEFAULT;
        if (layoutParams instanceof C14L8) {
            this.LIZ = ((C14L8) layoutParams).LIZ;
        }
    }

    public C14L8(int i) {
        super(i, -2);
        this.LIZ = LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public C14L8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = LSPassThroughRecordSizeConfig.DEFAULT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BenefitsVerticalLayout_Layout, 0, 0);
        this.LIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.BenefitsVerticalLayout_Layout_bvl_layout_priority, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
