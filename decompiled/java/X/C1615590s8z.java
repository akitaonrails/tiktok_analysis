package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615590s8z extends FrameLayout {
    public final LinearLayout LL;
    public final FrameLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final FrameLayout LLILZIL;
    public ValueAnimator LLILZLL;
    public C1615600s90 LLIZ;
    public EnumC1615660s96 LLIZLLLIL;
    public EnumC1615630s93 LLJ;
    public EnumC1615580s8y LLJI;
    public InterfaceC1614500s7E LLJIJIL;
    public final int LLJILJIL;

    private final GradientDrawable getBackgroundLayerBackground() {
        Drawable background = this.LLILLJJLI.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final GradientDrawable getCursorCoveringColorLayoutBackground() {
        Drawable background = this.LLILZIL.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final GradientDrawable getCursorViewBackground() {
        Drawable background = this.LLILZ.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final GradientDrawable getMaterialLayerBackground() {
        Drawable background = this.LLILLL.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    public final void LIZ() {
        LinearLayout.LayoutParams layoutParams;
        for (View view : new C09RD(this.LL)) {
            int i = C1615640s94.LIZJ[this.LLJI.ordinal()];
            if (i == 1) {
                layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), -2, 1.0f);
            } else {
                if (i != 2) {
                    throw new C1954807lC();
                }
                layoutParams = new LinearLayout.LayoutParams(-2, -2, 0.0f);
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setMaterial(EnumC1615650s95 enumC1615650s95) {
        int i = C1615640s94.LIZIZ[enumC1615650s95.ordinal()];
        if (i != 1) {
            if (i == 2) {
                GradientDrawable materialLayerBackground = getMaterialLayerBackground();
                if (materialLayerBackground != null) {
                    materialLayerBackground.setColor(this.LLJILJIL);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        GradientDrawable materialLayerBackground2 = getMaterialLayerBackground();
        if (materialLayerBackground2 == null) {
            return;
        }
        materialLayerBackground2.setColor(0);
    }

    public final void setOnSelectedChangeListener(InterfaceC1614500s7E interfaceC1614500s7E) {
        this.LLJIJIL = interfaceC1614500s7E;
    }

    public final void setSelected(final C1615600s90 c1615600s90) {
        int iIndexOfChild = this.LL.indexOfChild(c1615600s90);
        C1615600s90 c1615600s902 = this.LLIZ;
        if (c1615600s902 == null) {
            c1615600s90.setSelected(true);
            InterfaceC1614500s7E interfaceC1614500s7E = this.LLJIJIL;
            if (interfaceC1614500s7E != null) {
                interfaceC1614500s7E.LIZ(iIndexOfChild, true);
            }
            c1615600s90.setBackgroundSelected(true);
            this.LLIZ = c1615600s90;
            return;
        }
        if (Intrinsics.LJFF(c1615600s902, c1615600s90)) {
            return;
        }
        c1615600s90.setSelected(true);
        InterfaceC1614500s7E interfaceC1614500s7E2 = this.LLJIJIL;
        if (interfaceC1614500s7E2 != null) {
            interfaceC1614500s7E2.LIZ(iIndexOfChild, true);
        }
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C1615600s90 c1615600s903 = this.LLIZ;
        if (c1615600s903 != null) {
            int iIndexOfChild2 = this.LL.indexOfChild(c1615600s903);
            c1615600s903.setSelected(false);
            InterfaceC1614500s7E interfaceC1614500s7E3 = this.LLJIJIL;
            if (interfaceC1614500s7E3 != null) {
                interfaceC1614500s7E3.LIZ(iIndexOfChild2, false);
            }
            c1615600s903.setBackgroundSelected(false);
            FrameLayout frameLayout = this.LLILZ;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = c1615600s903.getMeasuredWidth();
            layoutParams.height = c1615600s903.getMeasuredHeight();
            C786410Ut5.a6(frameLayout, layoutParams);
            C786410Ut5.Gd(this.LLILZ, c1615600s903.getX());
            C786410Ut5.Md(this.LLILZ, c1615600s903.getY());
            C786410Ut5.LJZ(0, this.LLILZ);
            final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIJ());
            final int measuredWidth = c1615600s903.getMeasuredWidth();
            final float x = c1615600s903.getX();
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0s92
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue = ((Float) valueAnimatorOfFloat.getAnimatedValue()).floatValue();
                    FrameLayout frameLayout2 = this.LLILZ;
                    ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                    layoutParams2.width = measuredWidth + ((int) ((c1615600s90.getMeasuredWidth() - r1) * fFloatValue));
                    C786410Ut5.a6(frameLayout2, layoutParams2);
                    C786410Ut5.Gd(this.LLILZ, x + ((int) ((c1615600s90.getX() - x) * fFloatValue)));
                    if (fFloatValue == 1.0f) {
                        C786410Ut5.LJZ(8, this.LLILZ);
                        c1615600s90.setBackgroundSelected(true);
                    }
                }
            });
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.start();
            this.LLILZLL = valueAnimatorOfFloat;
        }
        this.LLIZ = c1615600s90;
    }

    public final void setSelectedAt(int i) {
        if (i < this.LL.getChildCount() && i >= 0) {
            setSelected((C1615600s90) this.LL.getChildAt(i));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No segment at position ");
        sbLIZ.append(i);
        sbLIZ.append('.');
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setSize(EnumC1615660s96 enumC1615660s96) {
        if (this.LLIZLLLIL == enumC1615660s96) {
            return;
        }
        this.LLIZLLLIL = enumC1615660s96;
        int i = C1615640s94.LIZ[enumC1615660s96.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.LLJ == EnumC1615630s93.RECTANGLE) {
                    GradientDrawable backgroundLayerBackground = getBackgroundLayerBackground();
                    if (backgroundLayerBackground != null) {
                        backgroundLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getOuterRadiusXSmall())));
                    }
                    GradientDrawable materialLayerBackground = getMaterialLayerBackground();
                    if (materialLayerBackground != null) {
                        materialLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getOuterRadiusXSmall())));
                    }
                    GradientDrawable cursorViewBackground = getCursorViewBackground();
                    if (cursorViewBackground != null) {
                        cursorViewBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusXSmall())));
                    }
                    GradientDrawable cursorCoveringColorLayoutBackground = getCursorCoveringColorLayoutBackground();
                    if (cursorCoveringColorLayoutBackground != null) {
                        cursorCoveringColorLayoutBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusXSmall())));
                    }
                }
                C426750GoL.LJIIL(this.LL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 16);
            } else {
                throw new C1954807lC();
            }
        } else {
            if (this.LLJ == EnumC1615630s93.RECTANGLE) {
                GradientDrawable backgroundLayerBackground2 = getBackgroundLayerBackground();
                if (backgroundLayerBackground2 != null) {
                    backgroundLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getOuterRadiusSmall())));
                }
                GradientDrawable materialLayerBackground2 = getMaterialLayerBackground();
                if (materialLayerBackground2 != null) {
                    materialLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getOuterRadiusSmall())));
                }
                GradientDrawable cursorViewBackground2 = getCursorViewBackground();
                if (cursorViewBackground2 != null) {
                    cursorViewBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusSmall())));
                }
                GradientDrawable cursorCoveringColorLayoutBackground2 = getCursorCoveringColorLayoutBackground();
                if (cursorCoveringColorLayoutBackground2 != null) {
                    cursorCoveringColorLayoutBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusSmall())));
                }
            }
            C426750GoL.LJIIL(this.LL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), 16);
        }
        Iterator<View> it2 = new C09RD(this.LL).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                View view = (View) c09re.next();
                if (view instanceof C1615600s90) {
                    ((C1615600s90) view).setSize(enumC1615660s96);
                }
            } else {
                LIZ();
                return;
            }
        }
    }

    public final void setVariant(EnumC1615630s93 enumC1615630s93) {
        if (this.LLJ == enumC1615630s93) {
            return;
        }
        this.LLJ = enumC1615630s93;
        int i = C1615640s94.LIZ[this.LLIZLLLIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                GradientDrawable backgroundLayerBackground = getBackgroundLayerBackground();
                if (backgroundLayerBackground != null) {
                    backgroundLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getOuterRadiusXSmall())));
                }
                GradientDrawable materialLayerBackground = getMaterialLayerBackground();
                if (materialLayerBackground != null) {
                    materialLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getOuterRadiusXSmall())));
                }
                GradientDrawable cursorViewBackground = getCursorViewBackground();
                if (cursorViewBackground != null) {
                    cursorViewBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusXSmall())));
                }
                GradientDrawable cursorCoveringColorLayoutBackground = getCursorCoveringColorLayoutBackground();
                if (cursorCoveringColorLayoutBackground != null) {
                    cursorCoveringColorLayoutBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusXSmall())));
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            GradientDrawable backgroundLayerBackground2 = getBackgroundLayerBackground();
            if (backgroundLayerBackground2 != null) {
                backgroundLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getOuterRadiusSmall())));
            }
            GradientDrawable materialLayerBackground2 = getMaterialLayerBackground();
            if (materialLayerBackground2 != null) {
                materialLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getOuterRadiusSmall())));
            }
            GradientDrawable cursorViewBackground2 = getCursorViewBackground();
            if (cursorViewBackground2 != null) {
                cursorViewBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusSmall())));
            }
            GradientDrawable cursorCoveringColorLayoutBackground2 = getCursorCoveringColorLayoutBackground();
            if (cursorCoveringColorLayoutBackground2 != null) {
                cursorCoveringColorLayoutBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusSmall())));
            }
        }
        for (View view : new C09RD(this.LL)) {
            if (view instanceof C1615600s90) {
                ((C1615600s90) view).setVariant(enumC1615630s93);
            }
        }
    }

    public final void setWidthRule(EnumC1615580s8y enumC1615580s8y) {
        this.LLJI = enumC1615580s8y;
        LIZ();
    }

    public C1615590s8z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.yo);
        this.LLIZLLLIL = EnumC1615660s96.SMALL;
        EnumC1615630s93 enumC1615630s93 = EnumC1615630s93.CAPSULE;
        this.LLJ = enumC1615630s93;
        this.LLJI = EnumC1615580s8y.HUG_CONTENT;
        FrameLayout.inflate(context, R.layout.gy, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxSegmentedControl, R.attr.yo, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlBackgroundLayerColor, 0);
        this.LLJILJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlMaterialLayerColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlCursorColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlCursorCoveringColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LL = (LinearLayout) findViewById(R.id.uk5);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bod);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getOuterRadiusSmall())));
        gradientDrawable.setColor(color);
        frameLayout.setBackground(gradientDrawable);
        this.LLILLJJLI = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.o3s);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getOuterRadiusSmall())));
        frameLayout2.setBackground(gradientDrawable2);
        this.LLILLL = frameLayout2;
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.fbn);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusSmall())));
        gradientDrawable3.setColor(color2);
        frameLayout3.setBackground(gradientDrawable3);
        this.LLILZ = frameLayout3;
        FrameLayout frameLayout4 = (FrameLayout) findViewById(R.id.fbm);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusSmall())));
        gradientDrawable4.setColor(color3);
        frameLayout4.setBackground(gradientDrawable4);
        this.LLILZIL = frameLayout4;
    }
}
