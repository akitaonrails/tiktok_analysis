package X;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.im.common.widget.appbar.IMAppBarLayout$Behavior;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.16GW, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16GW extends LinearLayout implements C16G4 {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public C20246014Ju LLILZLL;
    public List<InterfaceC1618160sD8<?>> LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int[] LLJIJIL;

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C16GY();
    }

    @Override // X.C16G4
    public C16BC<?> getBehavior() {
        return new IMAppBarLayout$Behavior();
    }

    public final int getDownNestedPreScrollRange$im_common_saas_release() {
        int i = this.LLILLJJLI;
        if (i != -1) {
            return i;
        }
        int minimumHeight = 0;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            C16GY c16gy = (C16GY) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = c16gy.LIZ;
            if ((i2 & 5) != 5) {
                if (minimumHeight > 0) {
                    break;
                }
            } else {
                int i3 = minimumHeight + ((LinearLayout.LayoutParams) c16gy).topMargin + ((LinearLayout.LayoutParams) c16gy).bottomMargin;
                minimumHeight = (i2 & 8) != 0 ? i3 + childAt.getMinimumHeight() : i3 + (measuredHeight - ((i2 & 2) != 0 ? childAt.getMinimumHeight() : getTopInset$im_common_saas_release()));
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.LLILLJJLI = iMax;
        return iMax;
    }

    public final int getDownNestedScrollRange$im_common_saas_release() {
        int i = this.LLILLL;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C16GY c16gy = (C16GY) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c16gy).topMargin + ((LinearLayout.LayoutParams) c16gy).bottomMargin;
            int i3 = c16gy.LIZ;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight;
            if ((i3 & 2) != 0) {
                minimumHeight -= childAt.getMinimumHeight() + getTopInset$im_common_saas_release();
                break;
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.LLILLL = iMax;
        return iMax;
    }

    public final int getTopInset$im_common_saas_release() {
        C20246014Ju c20246014Ju = this.LLILZLL;
        if (c20246014Ju != null) {
            return c20246014Ju.LJFF();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C16GY c16gy = (C16GY) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c16gy.LIZ;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) c16gy).topMargin + ((LinearLayout.LayoutParams) c16gy).bottomMargin;
            if ((i3 & 2) != 0) {
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int iMax = C300830Bqj.LIZ() ? Math.max(0, minimumHeight) : Math.max(0, minimumHeight - getTopInset$im_common_saas_release());
        this.LL = iMax;
        return iMax;
    }

    public final boolean LJ() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || childAt.getFitsSystemWindows()) ? false : true;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int minimumHeight;
        int topInset$im_common_saas_release = getTopInset$im_common_saas_release();
        int minimumHeight2 = getMinimumHeight();
        if (minimumHeight2 != 0) {
            return (minimumHeight2 * 2) + topInset$im_common_saas_release;
        }
        int childCount = getChildCount();
        return (childCount < 1 || (minimumHeight = getChildAt(childCount - 1).getMinimumHeight()) == 0) ? getHeight() / 3 : (minimumHeight * 2) + topInset$im_common_saas_release;
    }

    public final int getUpNestedPreScrollRange$im_common_saas_release() {
        return getTotalScrollRange();
    }

    public final int getPendingAction$im_common_saas_release() {
        return this.LLILZIL;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C16GY();
    }

    private final void setDefaultStateListAnimator(float f) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{R.attr.enabled, com.zhiliaoapp.musically.R.attr.bxg, -2131103211}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(150L));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(this, "elevation", f).setDuration(150L));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    public final void LIZ(InterfaceC1618150sD7 interfaceC1618150sD7) {
        if (this.LLIZ == null) {
            this.LLIZ = new ArrayList();
        }
        List<InterfaceC1618160sD8<?>> list = this.LLIZ;
        if (list != null && interfaceC1618150sD7 != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.contains(interfaceC1618150sD7)) {
                arrayList.add(interfaceC1618150sD7);
            }
        }
    }

    public final void LIZIZ(int i) {
        InterfaceC1618160sD8 interfaceC1618160sD8;
        List<InterfaceC1618160sD8<?>> list = this.LLIZ;
        if (list == null) {
            return;
        }
        int size = ((ArrayList) list).size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(list, i2);
            if ((obj instanceof InterfaceC1618160sD8) && (interfaceC1618160sD8 = (InterfaceC1618160sD8) obj) != null) {
                interfaceC1618160sD8.LIZ(i);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C16GY;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C16GY((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C16GY((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C16GY(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.LLJIJIL == null) {
            this.LLJIJIL = new int[4];
        }
        int[] iArr = this.LLJIJIL;
        if (iArr == null) {
            return super.onCreateDrawableState(i);
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.LLIZLLLIL;
        if (z) {
            i2 = com.zhiliaoapp.musically.R.attr.bxg;
        } else {
            i2 = -2131103210;
        }
        iArr[0] = i2;
        if (z && this.LLJ) {
            i3 = com.zhiliaoapp.musically.R.attr.bxh;
        } else {
            i3 = -2131103211;
        }
        iArr[1] = i3;
        if (z) {
            i4 = com.zhiliaoapp.musically.R.attr.bxf;
        } else {
            i4 = -2131103209;
        }
        iArr[2] = i4;
        if (z && this.LLJ) {
            i5 = com.zhiliaoapp.musically.R.attr.bxe;
        } else {
            i5 = -2131103208;
        }
        iArr[3] = i5;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    public final void setExpanded(boolean z) {
        LIZLLL(z, isLaidOut(), true);
    }

    public final void setLiftOnScroll(boolean z) {
        this.LLJI = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            "IMAppBarLayout is always vertical and does not support horizontal orientation".toString();
            throw new IllegalArgumentException("IMAppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public final void setPendingAction$im_common_saas_release(int i) {
        this.LLILZIL = i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C16GY((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C16GY((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C16GY(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C16GY(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C16GY(getContext(), attributeSet);
    }

    public C16GW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = -1;
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
        setOrientation(1);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.stateListAnimator}, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.IMAppBarLayout, 0, 0);
            setBackground(typedArrayObtainStyledAttributes2.getDrawable(R$styleable.IMAppBarLayout_android_background));
            if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.IMAppBarLayout_expanded)) {
                LIZLLL(typedArrayObtainStyledAttributes2.getBoolean(R$styleable.IMAppBarLayout_expanded, false), false, false);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.IMAppBarLayout_elevation)) {
                setDefaultStateListAnimator(typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.IMAppBarLayout_elevation, 0));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.IMAppBarLayout_android_keyboardNavigationCluster)) {
                    setKeyboardNavigationCluster(typedArrayObtainStyledAttributes2.getBoolean(R$styleable.IMAppBarLayout_android_keyboardNavigationCluster, false));
                }
                if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.IMAppBarLayout_android_touchscreenBlocksFocus)) {
                    setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes2.getBoolean(R$styleable.IMAppBarLayout_android_touchscreenBlocksFocus, false));
                }
            }
            this.LLJI = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.IMAppBarLayout_liftOnScroll, false);
            typedArrayObtainStyledAttributes2.recycle();
            C14K9.LJIJJ(this, new C20750316Ht(this, 1));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && LJ()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset$im_common_saas_release();
                }
            } else {
                measuredHeight = C419990GdR.LIZIZ(getMeasuredHeight() + getTopInset$im_common_saas_release(), 0, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        this.LL = -1;
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
    }

    public final void LIZLLL(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.LLILZIL = i4 | i3;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && LJ()) {
            int topInset$im_common_saas_release = getTopInset$im_common_saas_release();
            for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset$im_common_saas_release);
            }
        }
        this.LL = -1;
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
        this.LLILZ = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C16GY) getChildAt(i5).getLayoutParams()).LIZIZ != null) {
                this.LLILZ = true;
                break;
            }
            i5++;
        }
        if (!this.LLJI) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount3) {
                    int i7 = ((C16GY) getChildAt(i6).getLayoutParams()).LIZ;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
        }
        if (this.LLIZLLLIL != z2) {
            this.LLIZLLLIL = z2;
            refreshDrawableState();
        }
    }
}
