package X;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.android.livesdk.livesetting.other.OptimizeLiveTextViewStyleSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16F5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16F5 extends C20743216Fa {
    public float LLJI;
    public float LLJIJIL;
    public C1118860fDo LLJILJIL;
    public boolean LLJILJILJ;
    public C20745516Fx LLJILLL;

    public boolean getScreenAntiBurnEnabled() {
        return false;
    }

    public void setReduceFont(boolean z) {
    }

    private C1118860fDo getInputFilterHelper() {
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new C1118860fDo(this);
        }
        return this.LLJILJIL;
    }

    public C20745516Fx getTextStyleableHelper() {
        if (this.LLJILLL == null) {
            this.LLJILLL = new C20745516Fx(this);
        }
        return this.LLJILLL;
    }

    public C16F5(Context context) {
        this(context, null);
    }

    public final void LJJJI(int i) {
        getTextStyleableHelper().LJI(i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        C1118860fDo inputFilterHelper = getInputFilterHelper();
        inputFilterHelper.getClass();
        int length = inputFilterArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (inputFilterArr[i] instanceof C1118850fDn) {
                    break;
                } else {
                    i++;
                }
            } else {
                int length2 = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length2);
                inputFilterArr2[length2] = inputFilterHelper.LIZ;
                inputFilterArr = inputFilterArr2;
                break;
            }
        }
        super.setFilters(inputFilterArr);
    }

    public void setFontWeight(int i) {
        C1119850fFP c1119850fFP = C011Z.LIZ;
        Context context = getContext();
        float textSize = getTextSize();
        c1119850fFP.getClass();
        setTypeface(C1119850fFP.LJIILLIIL(context, i, textSize));
    }

    public void setMaxFontScaleRate(float f) {
        if (this.LLJIJIL != f) {
            this.LLJIJIL = f;
            float f2 = this.LLJI;
            if (f2 != 0.0f) {
                setTextSize(0, f2);
            }
        }
    }

    public C16F5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ex8);
    }

    public final float LJJJIL(float f, int i) {
        int iLJIIL;
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI()) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getContext().getResources().getDisplayMetrics());
            this.LLJI = fApplyDimension;
            iLJIIL = c1119850fFP.LJIIL(fApplyDimension, this.LLJIJIL);
        } else {
            float fApplyDimension2 = TypedValue.applyDimension(i, f, getContext().getResources().getDisplayMetrics());
            this.LLJI = fApplyDimension2;
            iLJIIL = c1119850fFP.LJIIL(fApplyDimension2, this.LLJIJIL);
        }
        return iLJIIL;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        getTextStyleableHelper().LJIIIIZZ(i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(0, LJJJIL(f, i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16F5(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = 2131107307(0x7f061deb, float:1.782719E38)
            r2 = 0
            if (r6 != r0) goto L2c
            X.0fFP r1 = X.C011Z.LIZ
            X.0UOr r0 = r1.LJJI
            if (r0 == 0) goto L2c
            X.0UOr r0 = r1.LJJI
            r0.getClass()
            com.bytedance.android.livesdk.livesetting.other.OptimizeLiveTextViewStyleSetting r0 = com.bytedance.android.livesdk.livesetting.other.OptimizeLiveTextViewStyleSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L2c
        L19:
            r3.<init>(r4, r5, r2)
            X.0fFP r0 = X.C011Z.LIZ
            r0.getClass()
            r0 = 0
            r3.LLJI = r0
            r0 = 1325400064(0x4f000000, float:2.1474836E9)
            r3.LLJIJIL = r0
            r3.LJJJJ(r4, r5, r6)
            return
        L2c:
            r2 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16F5.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void LJJJJ(Context context, AttributeSet attributeSet, int i) {
        if (!this.LLJILJILJ) {
            this.LLJILJILJ = true;
            C1119850fFP c1119850fFP = C011Z.LIZ;
            if (!c1119850fFP.LJJI()) {
                TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
            }
            getTextStyleableHelper().LJII(attributeSet, i, 0);
            if (c1119850fFP.LJJI != null) {
                c1119850fFP.LJJI.getClass();
                if (OptimizeLiveTextViewStyleSetting.INSTANCE.enable()) {
                    if (attributeSet != null) {
                        int attributeCount = attributeSet.getAttributeCount();
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            if (attributeSet.getAttributeNameResource(i2) == 16842904) {
                                return;
                            }
                        }
                    }
                    setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, context));
                }
            }
        }
    }
}
