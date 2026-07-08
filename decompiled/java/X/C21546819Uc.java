package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import u4.q0;

/* JADX INFO: renamed from: X.19Uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21546819Uc extends LinearLayout {
    public C763970Txz LL;
    public C16F5 LLILLJJLI;
    public LiveIconView LLILLL;
    public View LLILZ;
    public TextView LLILZIL;
    public LiveIconView LLILZLL;
    public Drawable LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ C21546719Ub LLJ;

    public int getContentWidth() {
        int i = 0;
        View[] viewArr = {this.LLILLJJLI, this.LLILLL, this.LLILZ};
        int right = 0;
        int left = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    left = Math.min(left, view.getLeft());
                    right = Math.max(right, view.getRight());
                } else {
                    left = view.getLeft();
                    right = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return right - left;
    }

    public final void LIZ() {
        C16F5 c16f5;
        View view;
        C763970Txz c763970Txz = this.LL;
        if (c763970Txz == null || (view = c763970Txz.LJI) == null) {
            View view2 = this.LLILZ;
            if (view2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
                removeView(view2);
                this.LLILZ = null;
            }
            this.LLILZIL = null;
            this.LLILZLL = null;
        } else {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
                }
                addView(view);
            }
            this.LLILZ = view;
            C16F5 c16f52 = this.LLILLJJLI;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 8);
            }
            LiveIconView liveIconView = this.LLILLL;
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 8);
                this.LLILLL.setImageDrawable(null);
            }
            TextView textView = (TextView) view.findViewById(R.id.text1);
            this.LLILZIL = textView;
            if (textView != null) {
                this.LLIZLLLIL = textView.getMaxLines();
            }
            this.LLILZLL = (LiveIconView) view.findViewById(R.id.icon);
        }
        boolean z = false;
        if (this.LLILZ == null) {
            if (this.LLILLL == null) {
                View view3 = (ImageView) C786410Ut5.Td(C786410Ut5.ne(getContext()), com.zhiliaoapp.musically.R.layout.dei, this, false);
                addView(view3, 0);
                LiveIconView liveIconView2 = (LiveIconView) view3;
                this.LLILLL = liveIconView2;
                ColorStateList colorStateList = this.LLJ.LLJILJILJ;
                if (colorStateList != null) {
                    liveIconView2.setIconTintList(colorStateList);
                }
            }
            if (this.LLILLJJLI == null) {
                C16F5 c16f53 = (C16F5) C786410Ut5.Td(C786410Ut5.ne(getContext()), com.zhiliaoapp.musically.R.layout.dej, this, false);
                addView(c16f53);
                this.LLILLJJLI = c16f53;
                this.LLIZLLLIL = c16f53.getMaxLines();
            }
            this.LLILLJJLI.setTextAppearance(this.LLJ.LLJIJIL);
            ColorStateList colorStateList2 = this.LLJ.LLJILJIL;
            if (colorStateList2 != null) {
                this.LLILLJJLI.setTextColor(colorStateList2);
            }
            LIZJ(this.LLILLJJLI, this.LLILLL);
        } else if (this.LLILZIL != null || this.LLILZLL != null) {
            LIZJ(this.LLILZIL, this.LLILZLL);
        }
        if (c763970Txz != null) {
            if (!TextUtils.isEmpty(c763970Txz.LJ)) {
                setContentDescription(c763970Txz.LJ);
            }
            int i = c763970Txz.LJIIL;
            if (i > 0) {
                this.LLILLJJLI.LJJJI(i);
            }
            int i2 = c763970Txz.LJIILIIL;
            if (i2 > 0) {
                this.LLJ.LLJJIJI = i2;
            }
            Typeface typeface = c763970Txz.LJIILJJIL;
            if (typeface != null && (c16f5 = this.LLILLJJLI) != null) {
                c16f5.setTypeface(typeface);
            }
            C21546719Ub c21546719Ub = c763970Txz.LJII;
            if (c21546719Ub == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if (c21546719Ub.getSelectedTabPosition() == c763970Txz.LJFF) {
                z = true;
            }
        }
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.LLIZ;
        if (drawable == null || !drawable.isStateful() || (!false && !this.LLIZ.setState(drawableState))) {
            return;
        }
        invalidate();
        this.LLJ.invalidate();
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.LL == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.LLJ.LLLJIL = true;
        this.LL.LIZ();
        return true;
    }

    public C763970Txz getTab() {
        return this.LL;
    }

    public View getTitleView() {
        return this.LLILLJJLI;
    }

    public final void LIZIZ(Context context) {
        GradientDrawable gradientDrawable;
        int i = this.LLJ.LLJJIJIL;
        GradientDrawable gradientDrawable2 = null;
        if (i != 0) {
            Drawable drawableLIZ = C14MI.LIZ(context, i);
            this.LLIZ = drawableLIZ;
            if (drawableLIZ != null && drawableLIZ.isStateful()) {
                this.LLIZ.setState(getDrawableState());
            }
        } else {
            this.LLIZ = null;
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(0);
        Drawable rippleDrawable = gradientDrawable3;
        if (this.LLJ.LLJILLL != null) {
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setCornerRadius(1.0E-5f);
            gradientDrawable4.setColor(-1);
            ColorStateList colorStateListLIZ = C19Q7.LIZ(this.LLJ.LLJILLL);
            if (this.LLJ.LLLFF) {
                gradientDrawable = null;
            } else {
                gradientDrawable2 = gradientDrawable4;
                gradientDrawable = gradientDrawable3;
            }
            rippleDrawable = new RippleDrawable(colorStateListLIZ, gradientDrawable, gradientDrawable2);
        }
        setBackground(rippleDrawable);
        this.LLJ.invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractC21547819Um.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractC21547819Um.class.getName());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            c16f5.setSelected(z);
        }
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            liveIconView.setSelected(z);
        }
        View view = this.LLILZ;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C763970Txz c763970Txz) {
        if (c763970Txz != this.LL) {
            this.LL = c763970Txz;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21546819Uc(C21546719Ub c21546719Ub, Context context) {
        super(context);
        this.LLJ = c21546719Ub;
        this.LLIZLLLIL = 2;
        LIZIZ(context);
        setPaddingRelative(c21546719Ub.LLIZ, c21546719Ub.LLIZLLLIL, c21546719Ub.LLJ, c21546719Ub.LLJI);
        setGravity(17);
        setOrientation(!c21546719Ub.LLL ? 1 : 0);
        setClickable(true);
        setClipChildren(false);
        setClipToPadding(false);
        q0.LJJ(this, C20097213kI.LIZ(getContext()));
    }

    public final void LIZJ(TextView textView, LiveIconView liveIconView) {
        Drawable drawableMutate;
        CharSequence charSequence;
        CharSequence charSequence2;
        int iLJIIIIZZ;
        Drawable drawable;
        C763970Txz c763970Txz = this.LL;
        CharSequence charSequence3 = null;
        if (c763970Txz != null && (drawable = c763970Txz.LIZIZ) != null) {
            drawableMutate = drawable.mutate();
        } else {
            drawableMutate = null;
        }
        C763970Txz c763970Txz2 = this.LL;
        if (c763970Txz2 != null) {
            charSequence = c763970Txz2.LIZJ;
        } else {
            charSequence = null;
        }
        if (liveIconView != null) {
            if (drawableMutate != null) {
                liveIconView.setImageDrawable(drawableMutate);
                C786410Ut5.LLJJIJIL(liveIconView, 0);
                int visibility = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, this);
            } else {
                C786410Ut5.LLJJIJIL(liveIconView, 8);
                liveIconView.setImageDrawable(null);
            }
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                C786410Ut5.LLIL(textView, 0);
                int visibility2 = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, this);
            } else {
                C786410Ut5.LLIL(textView, 8);
                textView.setText((CharSequence) null);
            }
        }
        if (liveIconView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) liveIconView.getLayoutParams();
            if (z && liveIconView.getVisibility() == 0) {
                iLJIIIIZZ = this.LLJ.LJIIIIZZ(8);
            } else {
                iLJIIIIZZ = 0;
            }
            if (this.LLJ.LLL) {
                if (iLJIIIIZZ != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iLJIIIIZZ);
                    marginLayoutParams.bottomMargin = 0;
                    C786410Ut5.w6(liveIconView, marginLayoutParams);
                    liveIconView.requestLayout();
                }
            } else if (iLJIIIIZZ != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iLJIIIIZZ;
                marginLayoutParams.setMarginEnd(0);
                C786410Ut5.w6(liveIconView, marginLayoutParams);
                liveIconView.requestLayout();
            }
        }
        C763970Txz c763970Txz3 = this.LL;
        if (c763970Txz3 != null) {
            charSequence2 = c763970Txz3.LJ;
        } else {
            charSequence2 = null;
        }
        if (!z) {
            charSequence3 = charSequence2;
        }
        C1697050uGN.LIZ(this, charSequence3);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21546819Uc.onMeasure(int, int):void");
    }
}
