package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16Fx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20745516Fx extends AbstractC20736416Ck<TextView> {
    public C20745416Fw LLILLJJLI;

    @Override // X.AbstractC20736516Cl
    public final int[] LIZLLL() {
        return R$styleable.TextStyleableHelper;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.16Fw] */
    public C20745516Fx(TextView textView) {
        super(textView);
        final TextView textView2 = (TextView) this.LL;
        this.LLILLJJLI = new AbstractC20736416Ck<TextView>(textView2) { // from class: X.16Fw
            @Override // X.AbstractC20736516Cl
            public final int[] LIZLLL() {
                return R$styleable.TextAppearanceStyleableHelper;
            }

            @Override // X.AbstractC20736416Ck
            public final void LJFF(TypedArray typedArray) {
                int dimensionPixelSize;
                int dimensionPixelSize2;
                int dimensionPixelSize3;
                if (C011Z.LIZ.LJJI()) {
                    if (typedArray.hasValue(R$styleable.TextAppearanceStyleableHelper_android_textSize)) {
                        dimensionPixelSize3 = typedArray.getDimensionPixelSize(R$styleable.TextAppearanceStyleableHelper_android_textSize, 0);
                    } else {
                        dimensionPixelSize3 = 0;
                    }
                    int indexCount = typedArray.getIndexCount();
                    for (int i = 0; i < indexCount; i++) {
                        int index = typedArray.getIndex(i);
                        int i2 = R$styleable.TextAppearanceStyleableHelper_fontType;
                        if (index == i2) {
                            int i3 = typedArray.getInt(i2, 1);
                            C1119850fFP c1119850fFP = C011Z.LIZ;
                            Context context = this.LL.getContext();
                            c1119850fFP.getClass();
                            Typeface typefaceLJIILL = C1119850fFP.LJIILL(dimensionPixelSize3, i3, context, false);
                            if (typefaceLJIILL != null && ((TextView) this.LL).getTypeface() != typefaceLJIILL) {
                                ((TextView) this.LL).setTypeface(typefaceLJIILL);
                            }
                        } else if (index == R$styleable.TextAppearanceStyleableHelper_android_textSize && dimensionPixelSize3 > 0) {
                            ((TextView) this.LL).setTextSize(0, dimensionPixelSize3);
                        }
                    }
                    return;
                }
                int indexCount2 = typedArray.getIndexCount();
                for (int i4 = 0; i4 < indexCount2; i4++) {
                    int index2 = typedArray.getIndex(i4);
                    int i5 = R$styleable.TextAppearanceStyleableHelper_fontType;
                    if (index2 == i5) {
                        int i6 = typedArray.getInt(i5, 1);
                        if (typedArray.hasValue(R$styleable.TextAppearanceStyleableHelper_android_textSize)) {
                            dimensionPixelSize2 = typedArray.getDimensionPixelSize(R$styleable.TextAppearanceStyleableHelper_android_textSize, -1);
                        } else {
                            dimensionPixelSize2 = 0;
                        }
                        C1119850fFP c1119850fFP2 = C011Z.LIZ;
                        Context context2 = this.LL.getContext();
                        c1119850fFP2.getClass();
                        Typeface typefaceLJIILL2 = C1119850fFP.LJIILL(dimensionPixelSize2, i6, context2, false);
                        if (typefaceLJIILL2 != null) {
                            ((TextView) this.LL).setTypeface(typefaceLJIILL2);
                        }
                    } else {
                        int i7 = R$styleable.TextAppearanceStyleableHelper_android_textSize;
                        if (index2 == i7 && (dimensionPixelSize = typedArray.getDimensionPixelSize(i7, 0)) > 0) {
                            ((TextView) this.LL).setTextSize(0, dimensionPixelSize);
                        }
                    }
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20736416Ck
    public void LJFF(TypedArray typedArray) {
        int dimensionPixelSize;
        boolean z;
        int dimensionPixelSize2;
        int resourceId;
        int dimensionPixelSize3;
        int i;
        boolean zHasValue;
        boolean zHasValue2;
        int dimensionPixelSize4;
        int autoSizeTextType;
        int autoSizeMinTextSize;
        int autoSizeMaxTextSize;
        int autoSizeStepGranularity;
        int dimensionPixelSize5;
        int resourceId2;
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI()) {
            boolean zHasValue3 = typedArray.hasValue(R$styleable.TextStyleableHelper_fontType);
            int integer = typedArray.getInteger(R$styleable.TextStyleableHelper_fontType, 1);
            boolean zHasValue4 = typedArray.hasValue(R$styleable.TextStyleableHelper_android_textSize);
            if (zHasValue4) {
                dimensionPixelSize3 = typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_android_textSize, 0);
            } else {
                dimensionPixelSize3 = 0;
            }
            if (typedArray.hasValue(R$styleable.TextStyleableHelper_android_textAppearance) && (resourceId2 = typedArray.getResourceId(R$styleable.TextStyleableHelper_android_textAppearance, 0)) != 0) {
                TypedArray typedArrayObtainStyledAttributes = this.LL.getContext().obtainStyledAttributes(resourceId2, R$styleable.TextAppearanceStyleableHelper);
                zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearanceStyleableHelper_fontType);
                if (zHasValue) {
                    i = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearanceStyleableHelper_fontType, 1);
                } else {
                    i = 1;
                }
                zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearanceStyleableHelper_android_textSize);
                if (zHasValue2) {
                    dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearanceStyleableHelper_android_textSize, -1);
                } else {
                    dimensionPixelSize4 = 0;
                }
                typedArrayObtainStyledAttributes.recycle();
            } else {
                i = 1;
                zHasValue = false;
                zHasValue2 = false;
                dimensionPixelSize4 = 0;
            }
            if (!zHasValue3) {
                integer = 1;
            }
            if (!zHasValue) {
                i = integer;
            }
            if (!zHasValue2) {
                dimensionPixelSize4 = -1;
            }
            if (!zHasValue4) {
                dimensionPixelSize3 = dimensionPixelSize4;
            }
            float f = dimensionPixelSize3;
            ((TextView) this.LL).setTypeface(C1119850fFP.LJIILL(f, i, this.LL.getContext(), false));
            if (dimensionPixelSize3 > 0) {
                ((TextView) this.LL).setTextSize(0, f);
            }
            if (typedArray.hasValue(R$styleable.TextStyleableHelper_lineHeight) && (dimensionPixelSize5 = typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_lineHeight, 0)) >= 0 && ((TextView) this.LL).getLineHeight() != dimensionPixelSize5) {
                C21382118m3.LJFF((TextView) this.LL, dimensionPixelSize5);
            }
            if (c1119850fFP.LJJII() && typedArray.hasValue(R$styleable.TextStyleableHelper_autoSizeTextType) && typedArray.getInt(R$styleable.TextStyleableHelper_autoSizeTextType, 0) == 1) {
                int dimensionPixelSize6 = typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_autoSizeMaxTextSize, -1);
                int dimensionPixelSize7 = typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_autoSizeMinTextSize, -1);
                int dimensionPixelSize8 = typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_autoSizeStepGranularity, 1);
                if (dimensionPixelSize7 > 0 && dimensionPixelSize6 > 0 && dimensionPixelSize8 > 0 && dimensionPixelSize6 > dimensionPixelSize7) {
                    int iLJIIJJI = c1119850fFP.LJIIJJI(dimensionPixelSize7);
                    int iLJIIJJI2 = c1119850fFP.LJIIJJI(dimensionPixelSize6);
                    TextView textView = (TextView) this.LL;
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 27) {
                        autoSizeTextType = C20745716Fz.LJ(textView);
                    } else {
                        if (textView instanceof InterfaceC20745616Fy) {
                            autoSizeTextType = ((InterfaceC20745616Fy) textView).getAutoSizeTextType();
                        }
                        C21382118m3.LIZIZ((TextView) this.LL, iLJIIJJI, iLJIIJJI2, dimensionPixelSize8, 0);
                        return;
                    }
                    if (autoSizeTextType == 1) {
                        TextView textView2 = (TextView) this.LL;
                        if (i2 >= 27) {
                            autoSizeMinTextSize = C20745716Fz.LIZIZ(textView2);
                        } else if (textView2 instanceof InterfaceC20745616Fy) {
                            autoSizeMinTextSize = ((InterfaceC20745616Fy) textView2).getAutoSizeMinTextSize();
                        } else {
                            autoSizeMinTextSize = -1;
                        }
                        if (autoSizeMinTextSize == iLJIIJJI) {
                            TextView textView3 = (TextView) this.LL;
                            if (i2 >= 27) {
                                autoSizeMaxTextSize = C20745716Fz.LIZ(textView3);
                            } else if (textView3 instanceof InterfaceC20745616Fy) {
                                autoSizeMaxTextSize = ((InterfaceC20745616Fy) textView3).getAutoSizeMaxTextSize();
                            } else {
                                autoSizeMaxTextSize = -1;
                            }
                            if (autoSizeMaxTextSize == iLJIIJJI2) {
                                TextView textView4 = (TextView) this.LL;
                                if (i2 >= 27) {
                                    autoSizeStepGranularity = C20745716Fz.LIZJ(textView4);
                                } else if (textView4 instanceof InterfaceC20745616Fy) {
                                    autoSizeStepGranularity = ((InterfaceC20745616Fy) textView4).getAutoSizeStepGranularity();
                                }
                                if (autoSizeStepGranularity == dimensionPixelSize8) {
                                    return;
                                }
                            }
                        }
                    }
                    C21382118m3.LIZIZ((TextView) this.LL, iLJIIJJI, iLJIIJJI2, dimensionPixelSize8, 0);
                    return;
                }
                return;
            }
            return;
        }
        int integer2 = typedArray.getInteger(R$styleable.TextStyleableHelper_fontType, 1);
        if (typedArray.hasValue(R$styleable.TextStyleableHelper_android_textSize)) {
            dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_android_textSize, -1);
        } else {
            dimensionPixelSize = 0;
        }
        if (typedArray.hasValue(R$styleable.TextStyleableHelper_defaultFontType)) {
            z = typedArray.getBoolean(R$styleable.TextStyleableHelper_defaultFontType, false);
        } else {
            z = false;
        }
        ((TextView) this.LL).setTypeface(C1119850fFP.LJIILL(dimensionPixelSize, integer2, this.LL.getContext(), z));
        if (typedArray.hasValue(R$styleable.TextStyleableHelper_android_textAppearance) && (resourceId = typedArray.getResourceId(R$styleable.TextStyleableHelper_android_textAppearance, 0)) != 0) {
            LJI(resourceId);
        }
        if (typedArray.hasValue(R$styleable.TextStyleableHelper_lineHeight)) {
            C21382118m3.LJFF((TextView) this.LL, typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_lineHeight, 0));
        }
        if (typedArray.hasValue(R$styleable.TextStyleableHelper_android_textSize) && (dimensionPixelSize2 = typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_android_textSize, -1)) != -1) {
            ((TextView) this.LL).setTextSize(0, dimensionPixelSize2);
        }
        if ((this.LL instanceof C16F5) && typedArray.hasValue(R$styleable.TextStyleableHelper_reduceFont)) {
            ((C16F5) this.LL).setReduceFont(typedArray.getBoolean(R$styleable.TextStyleableHelper_reduceFont, false));
        }
        if (!c1119850fFP.LJJII() || !typedArray.hasValue(R$styleable.TextStyleableHelper_autoSizeTextType) || typedArray.getInt(R$styleable.TextStyleableHelper_autoSizeTextType, 0) != 1) {
            return;
        }
        int dimensionPixelSize9 = typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_autoSizeMaxTextSize, -1);
        int dimensionPixelSize10 = typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_autoSizeMinTextSize, -1);
        int dimensionPixelSize11 = typedArray.getDimensionPixelSize(R$styleable.TextStyleableHelper_autoSizeStepGranularity, 1);
        if (dimensionPixelSize10 <= 0 || dimensionPixelSize9 <= 0 || dimensionPixelSize11 <= 0 || dimensionPixelSize9 <= dimensionPixelSize10) {
            return;
        }
        C21382118m3.LIZIZ((TextView) this.LL, c1119850fFP.LJIIJJI(dimensionPixelSize10), c1119850fFP.LJIIJJI(dimensionPixelSize9), dimensionPixelSize11, 0);
    }

    public final void LJIIIIZZ(int i) {
        LJI(i);
    }

    public final int LJIIIZ(float f) {
        getClass();
        return C011Z.LIZ.LJIIJJI(f);
    }
}
