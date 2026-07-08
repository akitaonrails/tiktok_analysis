package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19PH, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19PH {
    public int LIZ;
    public int LIZIZ;
    public int[] LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;

    public abstract void LIZ();

    public C19PH(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        this.LIZJ = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.aac);
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context, attributeSet, R$styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.LIZ = C19RN.LIZJ(context, typedArrayLIZLLL, R$styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.LIZIZ = Math.min(C19RN.LIZJ(context, typedArrayLIZLLL, R$styleable.BaseProgressIndicator_trackCornerRadius, 0), this.LIZ / 2);
        this.LJ = typedArrayLIZLLL.getInt(R$styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.LJFF = typedArrayLIZLLL.getInt(R$styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        if (!typedArrayLIZLLL.hasValue(R$styleable.BaseProgressIndicator_indicatorColor)) {
            int[] iArr = new int[1];
            TypedValue typedValueLIZ = C19PF.LIZ(R.attr.bip, context);
            if (typedValueLIZ != null) {
                i3 = typedValueLIZ.data;
            } else {
                i3 = -1;
            }
            iArr[0] = i3;
            this.LIZJ = iArr;
        } else if (typedArrayLIZLLL.peekValue(R$styleable.BaseProgressIndicator_indicatorColor).type != 1) {
            this.LIZJ = new int[]{typedArrayLIZLLL.getColor(R$styleable.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayLIZLLL.getResourceId(R$styleable.BaseProgressIndicator_indicatorColor, -1));
            this.LIZJ = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayLIZLLL.hasValue(R$styleable.BaseProgressIndicator_trackColor)) {
            this.LIZLLL = typedArrayLIZLLL.getColor(R$styleable.BaseProgressIndicator_trackColor, -1);
        } else {
            this.LIZLLL = this.LIZJ[0];
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            this.LIZLLL = C19PM.LIZ(this.LIZLLL, (int) (f * 255.0f));
        }
        typedArrayLIZLLL.recycle();
    }
}
