package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Za9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902070Za9 extends RoundingCornerLayout {
    public FrameLayout LLILZ;
    public ResolutionComponent LLILZIL;
    public boolean LLILZLL;
    public EnumC901980Za0 LLIZ;
    public C462630ICf LLIZLLLIL;

    public C902070Za9(Context context) {
        this(context, null, 6);
    }

    public C902070Za9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final FrameLayout getContentDescriptionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ev3);
            this.LLILZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final float getResolutionRatio$im_camera_card_release() {
        if (this.LLILZIL == null) {
            return 1.0f;
        }
        return r2.width / r2.height;
    }

    public final ResolutionComponent getResolution() {
        return this.LLILZIL;
    }

    public final EnumC901980Za0 getStyle() {
        return this.LLIZ;
    }

    public final void setContentDescriptionFromXml(FrameLayout frameLayout) {
        this.LLILZ = frameLayout;
    }

    public final void setQuickLiveReact(boolean z) {
        this.LLILZLL = z;
    }

    public final void setResolution(ResolutionComponent resolutionComponent) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        ResolutionComponent resolutionComponent2 = this.LLILZIL;
        Integer numValueOf4 = null;
        if (resolutionComponent2 != null) {
            numValueOf = Integer.valueOf(resolutionComponent2.height);
        } else {
            numValueOf = null;
        }
        if (resolutionComponent != null) {
            numValueOf2 = Integer.valueOf(resolutionComponent.height);
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
            ResolutionComponent resolutionComponent3 = this.LLILZIL;
            if (resolutionComponent3 != null) {
                numValueOf3 = Integer.valueOf(resolutionComponent3.width);
            } else {
                numValueOf3 = null;
            }
            if (resolutionComponent != null) {
                numValueOf4 = Integer.valueOf(resolutionComponent.width);
            }
            if (Intrinsics.LJFF(numValueOf3, numValueOf4)) {
                return;
            }
        }
        this.LLILZIL = resolutionComponent;
        requestLayout();
    }

    @Override // com.ss.android.ugc.aweme.views.RoundingCornerLayout
    public void setRoundingParams(C462630ICf c462630ICf) {
        this.LLIZLLLIL = c462630ICf;
        super.setRoundingParams(c462630ICf);
        invalidate();
    }

    public final void setStyle(EnumC901980Za0 enumC901980Za0) {
        boolean z;
        float[] fArr;
        if (this.LLIZ != enumC901980Za0) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZ = enumC901980Za0;
        C462630ICf c462630ICf = this.LLIZLLLIL;
        if (c462630ICf != null) {
            int i = C902060Za8.LIZ[enumC901980Za0.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    float f = c462630ICf.LIZ;
                    float f2 = c462630ICf.LIZLLL;
                    fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2};
                } else {
                    throw new C1954807lC();
                }
            } else {
                float f3 = c462630ICf.LIZ;
                float f4 = c462630ICf.LIZIZ;
                float f5 = c462630ICf.LIZJ;
                float f6 = c462630ICf.LIZLLL;
                fArr = new float[]{f3, f3, f4, f4, f5, f5, f6, f6};
            }
            setCornerRadius(fArr);
            this.LL.LIZIZ(getWidth(), getHeight());
            if (z) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float fLIZIZ;
        double dLIZ;
        int childMeasureSpec;
        int childMeasureSpec2;
        if (this.LLILZIL == null) {
            setMeasuredDimension((int) C418440Gaw.LIZIZ(162), (int) C418440Gaw.LIZIZ(288));
        } else {
            float f = r1.width / r1.height;
            if (this.LLIZ == EnumC901980Za0.NUDE_MASK) {
                fLIZIZ = C418440Gaw.LIZIZ(86);
                dLIZ = C418440Gaw.LIZIZ(112);
            } else {
                double d = f;
                if (d <= 0.5d) {
                    fLIZIZ = C418440Gaw.LIZIZ(162);
                    dLIZ = LIZ((((double) fLIZIZ) * 1.0d) / d, C418440Gaw.LIZIZ(162), C418440Gaw.LIZIZ(324));
                } else if (f < 1.0f) {
                    fLIZIZ = C418440Gaw.LIZIZ(162);
                    dLIZ = LIZ((((double) fLIZIZ) * 1.0d) / d, C418440Gaw.LIZIZ(162), C418440Gaw.LIZIZ(288));
                } else if (d <= 1.2d) {
                    if (this.LLILZLL) {
                        fLIZIZ = C418440Gaw.LIZIZ(116);
                        dLIZ = LIZ((((double) fLIZIZ) * 1.0d) / d, C418440Gaw.LIZIZ(116), C418440Gaw.LIZIZ(116));
                    } else {
                        fLIZIZ = C418440Gaw.LIZIZ(162);
                        dLIZ = LIZ((((double) fLIZIZ) * 1.0d) / d, C418440Gaw.LIZIZ(126), C418440Gaw.LIZIZ(162));
                    }
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(260);
                    dLIZ = LIZ((((double) fLIZIZ) * 1.0d) / d, C418440Gaw.LIZIZ(80), C418440Gaw.LIZIZ(162));
                }
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) fLIZIZ, Integer.MIN_VALUE);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) dLIZ, 0);
            measureChildWithMargins(getContentDescriptionFromXml(), iMakeMeasureSpec, 0, iMakeMeasureSpec2, 0);
            getContentDescriptionFromXml().measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            if (getContentDescriptionFromXml().getMeasuredHeight() > dLIZ) {
                dLIZ = getContentDescriptionFromXml().getMeasuredHeight();
            }
            if (getContentDescriptionFromXml().getMeasuredWidth() > fLIZIZ) {
                fLIZIZ = getContentDescriptionFromXml().getMeasuredWidth();
            }
            setMeasuredDimension((int) fLIZIZ, (int) dLIZ);
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE);
                int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE);
                measureChildWithMargins(childAt, iMakeMeasureSpec3, 0, iMakeMeasureSpec4, 0);
                int i4 = marginLayoutParams.width;
                if (i4 == -1 || marginLayoutParams.height == -1) {
                    if (i4 == -1) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin), 1073741824);
                    } else {
                        childMeasureSpec = FrameLayout.getChildMeasureSpec(iMakeMeasureSpec3, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width);
                    }
                    if (marginLayoutParams.height == -1) {
                        childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin), 1073741824);
                    } else {
                        childMeasureSpec2 = FrameLayout.getChildMeasureSpec(iMakeMeasureSpec4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
                    }
                    childAt.measure(childMeasureSpec, childMeasureSpec2);
                }
            }
        }
    }

    public C902070Za9(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLIZ = EnumC901980Za0.DEFAULT;
    }

    public static double LIZ(double d, float f, float f2) {
        return Math.max(f, Math.min(d, f2));
    }
}
