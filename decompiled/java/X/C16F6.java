package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import u4.q0;

/* JADX INFO: renamed from: X.16F6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16F6 extends C16F5 {
    public C16F7 LLJJ;

    public C16F6(Context context) {
        super(context, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.16Ck, X.16F7] */
    @Override // X.C16F5
    public final void LJJJJ(Context context, AttributeSet attributeSet, int i) {
        super.LJJJJ(context, attributeSet, i);
        ?? r1 = new AbstractC20736416Ck<C16F6>(this) { // from class: X.16F7
            @Override // X.AbstractC20736516Cl
            public final int[] LIZLLL() {
                return R$styleable.LiveDialogActionView;
            }

            {
                super(this);
            }

            @Override // X.AbstractC20736416Ck
            public final void LJFF(TypedArray typedArray) {
                int indexCount = typedArray.getIndexCount();
                int dimensionPixelSize = 0;
                int dimensionPixelSize2 = 0;
                int dimensionPixelSize3 = 0;
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == R$styleable.LiveDialogActionView_android_textAppearance) {
                        int resourceId = typedArray.getResourceId(index, 0);
                        if (resourceId != 0) {
                            ((TextView) this.LL).setTextAppearance(resourceId);
                        }
                    } else if (index == R$styleable.LiveDialogActionView_android_textColor) {
                        ColorStateList colorStateListLIZ = C16F8.LIZ(this.LL.getContext(), typedArray, index);
                        if (colorStateListLIZ != null) {
                            ((TextView) this.LL).setTextColor(colorStateListLIZ);
                        }
                    } else if (index == R$styleable.LiveDialogActionView_android_paddingLeft) {
                        int dimensionPixelSize4 = typedArray.getDimensionPixelSize(index, 0);
                        T t = this.LL;
                        ((TextView) t).setPadding(dimensionPixelSize4, 0, t.getPaddingRight(), 0);
                    } else if (index == R$styleable.LiveDialogActionView_android_paddingRight) {
                        int dimensionPixelSize5 = typedArray.getDimensionPixelSize(index, 0);
                        T t2 = this.LL;
                        ((TextView) t2).setPadding(t2.getPaddingLeft(), 0, dimensionPixelSize5, 0);
                    } else if (index == R$styleable.LiveDialogActionView_android_background) {
                        this.LL.setBackground(typedArray.getDrawable(index));
                    } else if (index == R$styleable.LiveDialogActionView_autoSizeMinTextSize) {
                        dimensionPixelSize = typedArray.getDimensionPixelSize(index, 0);
                    } else if (index == R$styleable.LiveDialogActionView_autoSizeMaxTextSize) {
                        dimensionPixelSize2 = typedArray.getDimensionPixelSize(index, 0);
                    } else if (index == R$styleable.LiveDialogActionView_autoSizeStepGranularity) {
                        dimensionPixelSize3 = typedArray.getDimensionPixelSize(index, 0);
                    }
                }
                if (dimensionPixelSize > 0 && dimensionPixelSize2 > 0 && dimensionPixelSize3 > 0) {
                    C21382118m3.LIZIZ((TextView) this.LL, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, 0);
                }
            }
        };
        this.LLJJ = r1;
        r1.LJII(attributeSet, i, 0);
        setGravity(17);
        setLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        q0.LJIJ(this, new C1402430mbB(0));
    }
}
