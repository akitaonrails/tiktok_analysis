package X;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import avg.f;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import mf.a;

/* JADX INFO: renamed from: X.19Tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21546019Tu extends ViewGroup implements InterfaceC21549819Vg {
    public static final int[] LLJJLIIIJLLLLLLLZ = {R.attr.state_checked};
    public static final int[] LLJL = {-16842910};
    public final C1149000g0Q LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final C19U8 LLIZ;
    public final C1085640eME LLIZLLLIL;
    public final SparseArray<View.OnTouchListener> LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public C21546419Ty[] LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public ColorStateList LLJJ;
    public int LLJJI;
    public ColorStateList LLJJIII;
    public final ColorStateList LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public Drawable LLJJJ;
    public int LLJJJIL;
    public final int[] LLJJJJ;
    public SparseArray<BadgeDrawable> LLJJJJJIL;
    public BottomNavigationPresenter LLJJJJLIIL;
    public C19V6 LLJJL;

    public final void LIZ() {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        C21546419Ty[] c21546419TyArr = this.LLJILJIL;
        if (c21546419TyArr != null) {
            for (C21546419Ty c21546419Ty : c21546419TyArr) {
                if (c21546419Ty != null) {
                    this.LLIZLLLIL.LIZ(c21546419Ty);
                    ImageView imageView = c21546419Ty.LLIZ;
                    if (c21546419Ty.LLJJI != null) {
                        if (imageView != null) {
                            c21546419Ty.setClipChildren(true);
                            c21546419Ty.setClipToPadding(true);
                            BadgeDrawable badgeDrawable = c21546419Ty.LLJJI;
                            if (badgeDrawable != null) {
                                if (badgeDrawable.LIZLLL() != null) {
                                    badgeDrawable.LIZLLL().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(badgeDrawable);
                                }
                            }
                        }
                        c21546419Ty.LLJJI = null;
                    }
                }
            }
        }
        if (this.LLJJL.size() == 0) {
            this.LLJILJILJ = 0;
            this.LLJILLL = 0;
            this.LLJILJIL = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.LLJJL.size(); i++) {
            hashSet.add(Integer.valueOf(this.LLJJL.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.LLJJJJJIL.size(); i2++) {
            int iKeyAt = this.LLJJJJJIL.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.LLJJJJJIL.delete(iKeyAt);
            }
        }
        this.LLJILJIL = new C21546419Ty[this.LLJJL.size()];
        int i3 = this.LLJIJIL;
        boolean z = i3 != -1 ? i3 == 0 : this.LLJJL.LJIIJJI().size() > 3;
        for (int i4 = 0; i4 < this.LLJJL.size(); i4++) {
            this.LLJJJJLIIL.LLILLJJLI = true;
            this.LLJJL.getItem(i4).setCheckable(true);
            this.LLJJJJLIIL.LLILLJJLI = false;
            C21546419Ty newItem = getNewItem();
            this.LLJILJIL[i4] = newItem;
            newItem.setIconTintList(this.LLJJ);
            newItem.setIconSize(this.LLJJI);
            newItem.setTextColor(this.LLJJIJI);
            newItem.setTextAppearanceInactive(this.LLJJIJIIJIL);
            newItem.setTextAppearanceActive(this.LLJJIJIL);
            newItem.setTextColor(this.LLJJIII);
            Drawable drawable = this.LLJJJ;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.LLJJJIL);
            }
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.LLJIJIL);
            C21548219Uq c21548219Uq = (C21548219Uq) this.LLJJL.getItem(i4);
            newItem.LJIIJJI(c21548219Uq);
            newItem.setItemPosition(i4);
            int i5 = c21548219Uq.LIZ;
            newItem.setOnTouchListener(this.LLJ.get(i5));
            View.OnClickListener aVar = this.LLIZ;
            if (C1848410yCV.LIZ) {
                if (aVar != null) {
                    aVar = new f(aVar);
                    aVar = new a(aVar);
                }
            } else if (aVar != null) {
                aVar = new a(aVar);
            }
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(newItem);
            }
            newItem.setOnClickListener(aVar);
            int i6 = this.LLJILJILJ;
            if (i6 != 0 && i5 == i6) {
                this.LLJILLL = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.LLJJL.size() - 1, this.LLJILLL);
        this.LLJILLL = iMin;
        this.LLJJL.getItem(iMin).setChecked(true);
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C21546419Ty getNewItem() {
        C21546419Ty c21546419Ty = (C21546419Ty) this.LLIZLLLIL.LIZIZ();
        return c21546419Ty == null ? new C21546419Ty(getContext()) : c21546419Ty;
    }

    public final ColorStateList LIZJ() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListLIZIZ = C838410Wul.LIZIZ(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(com.zhiliaoapp.musically.R.attr.bip, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListLIZIZ.getDefaultColor();
        int[] iArr = LLJL;
        return new ColorStateList(new int[][]{iArr, LLJJLIIIJLLLLLLLZ, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListLIZIZ.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public Drawable getItemBackground() {
        C21546419Ty[] c21546419TyArr = this.LLJILJIL;
        return (c21546419TyArr == null || c21546419TyArr.length <= 0) ? this.LLJJJ : c21546419TyArr[0].getBackground();
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.LLJJJJJIL;
    }

    public ColorStateList getIconTintList() {
        return this.LLJJ;
    }

    public int getItemBackgroundRes() {
        return this.LLJJJIL;
    }

    public int getItemIconSize() {
        return this.LLJJI;
    }

    public int getItemTextAppearanceActive() {
        return this.LLJJIJIL;
    }

    public int getItemTextAppearanceInactive() {
        return this.LLJJIJIIJIL;
    }

    public ColorStateList getItemTextColor() {
        return this.LLJJIII;
    }

    public int getLabelVisibilityMode() {
        return this.LLJIJIL;
    }

    public int getSelectedItemId() {
        return this.LLJILJILJ;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.19U8] */
    public C21546019Tu(Context context) {
        super(context, null);
        this.LLIZLLLIL = new C1085640eME(5);
        this.LLJ = new SparseArray<>(5);
        this.LLJILJILJ = 0;
        this.LLJILLL = 0;
        this.LLJJJJJIL = new SparseArray<>(5);
        Resources resources = getResources();
        this.LLILLJJLI = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.qc);
        this.LLILLL = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.qd);
        this.LLILZ = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.q7);
        this.LLILZIL = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.q8);
        this.LLILZLL = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.qa);
        this.LLJJIJI = LIZJ();
        C1149000g0Q c1149000g0Q = new C1149000g0Q();
        this.LL = c1149000g0Q;
        c1149000g0Q.LJJJJ(0);
        c1149000g0Q.LJJIIZ(115L);
        c1149000g0Q.LJJIJ(new C12DM());
        c1149000g0Q.LJJJ(new AbstractC21463118z7() { // from class: X.11rM
            @Override // X.AbstractC21463118z7
            public final void LIZLLL(C1489080oqw c1489080oqw) {
                View view = c1489080oqw.LIZIZ;
                if (view instanceof TextView) {
                    ((HashMap) c1489080oqw.LIZ).put("android:textscale:scale", Float.valueOf(view.getScaleX()));
                }
            }

            @Override // X.AbstractC21463118z7
            public final void LJI(C1489080oqw c1489080oqw) {
                View view = c1489080oqw.LIZIZ;
                if (view instanceof TextView) {
                    ((HashMap) c1489080oqw.LIZ).put("android:textscale:scale", Float.valueOf(view.getScaleX()));
                }
            }

            @Override // X.AbstractC21463118z7
            public final Animator LJIIJ(ViewGroup viewGroup, C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
                float fFloatValue;
                if (c1489080oqw == null || c1489080oqw2 == null || !(c1489080oqw.LIZIZ instanceof TextView)) {
                    return null;
                }
                View view = c1489080oqw2.LIZIZ;
                if (!(view instanceof TextView)) {
                    return null;
                }
                final TextView textView = (TextView) view;
                Map<String, Object> map = c1489080oqw.LIZ;
                Map<String, Object> map2 = c1489080oqw2.LIZ;
                HashMap map3 = (HashMap) map;
                float fFloatValue2 = 1.0f;
                if (map3.get("android:textscale:scale") != null) {
                    fFloatValue = ((Float) map3.get("android:textscale:scale")).floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                HashMap map4 = (HashMap) map2;
                if (map4.get("android:textscale:scale") != null) {
                    fFloatValue2 = ((Float) map4.get("android:textscale:scale")).floatValue();
                }
                if (fFloatValue == fFloatValue2) {
                    return null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.11rL
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        C786410Ut5.Mb(fFloatValue3, textView);
                        C786410Ut5.nc(fFloatValue3, textView);
                    }
                });
                return valueAnimatorOfFloat;
            }
        });
        this.LLIZ = new View.OnClickListener() { // from class: X.19U8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21548219Uq itemData = ((C21546419Ty) view).getItemData();
                C21546019Tu c21546019Tu = this.LL;
                if (!c21546019Tu.LLJJL.LJIILLIIL(itemData, c21546019Tu.LLJJJJLIIL, 0)) {
                    itemData.setChecked(true);
                }
            }
        };
        this.LLJJJJ = new int[5];
        setImportantForAccessibility(1);
    }

    private void setBadgeIfNeeded(C21546419Ty c21546419Ty) {
        BadgeDrawable badgeDrawable;
        int id = c21546419Ty.getId();
        if (id != -1 && (badgeDrawable = this.LLJJJJJIL.get(id)) != null) {
            c21546419Ty.setBadge(badgeDrawable);
        }
    }

    @Override // X.InterfaceC21549819Vg
    public final void LIZIZ(C19V6 c19v6) {
        this.LLJJL = c19v6;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(C20093113jd.LIZIZ(1, this.LLJJL.LJIIJJI().size(), 1, false));
    }

    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.LLJJJJJIL = sparseArray;
        C21546419Ty[] c21546419TyArr = this.LLJILJIL;
        if (c21546419TyArr != null) {
            for (C21546419Ty c21546419Ty : c21546419TyArr) {
                c21546419Ty.setBadge(sparseArray.get(c21546419Ty.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.LLJJ = colorStateList;
        C21546419Ty[] c21546419TyArr = this.LLJILJIL;
        if (c21546419TyArr != null) {
            for (C21546419Ty c21546419Ty : c21546419TyArr) {
                c21546419Ty.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.LLJJJ = drawable;
        C21546419Ty[] c21546419TyArr = this.LLJILJIL;
        if (c21546419TyArr != null) {
            for (C21546419Ty c21546419Ty : c21546419TyArr) {
                c21546419Ty.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.LLJJJIL = i;
        C21546419Ty[] c21546419TyArr = this.LLJILJIL;
        if (c21546419TyArr != null) {
            for (C21546419Ty c21546419Ty : c21546419TyArr) {
                c21546419Ty.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.LLJI = z;
    }

    public void setItemIconSize(int i) {
        this.LLJJI = i;
        C21546419Ty[] c21546419TyArr = this.LLJILJIL;
        if (c21546419TyArr != null) {
            for (C21546419Ty c21546419Ty : c21546419TyArr) {
                c21546419Ty.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.LLJJIJIL = i;
        C21546419Ty[] c21546419TyArr = this.LLJILJIL;
        if (c21546419TyArr != null) {
            for (C21546419Ty c21546419Ty : c21546419TyArr) {
                c21546419Ty.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.LLJJIII;
                if (colorStateList != null) {
                    c21546419Ty.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.LLJJIJIIJIL = i;
        C21546419Ty[] c21546419TyArr = this.LLJILJIL;
        if (c21546419TyArr != null) {
            for (C21546419Ty c21546419Ty : c21546419TyArr) {
                c21546419Ty.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.LLJJIII;
                if (colorStateList != null) {
                    c21546419Ty.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.LLJJIII = colorStateList;
        C21546419Ty[] c21546419TyArr = this.LLJILJIL;
        if (c21546419TyArr != null) {
            for (C21546419Ty c21546419Ty : c21546419TyArr) {
                c21546419Ty.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.LLJIJIL = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.LLJJJJLIIL = bottomNavigationPresenter;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.LLJJL.LJIIJJI().size();
        int childCount = getChildCount();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.LLILZLL, 1073741824);
        int i5 = this.LLJIJIL;
        int i6 = 1;
        if (i5 != -1 ? i5 == 0 : size2 > 3) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.LLJI) {
            View childAt = getChildAt(this.LLJILLL);
            int iMax = this.LLILZIL;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.LLILZ, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i7 = size2 - i3;
            int iMin = Math.min(size - (this.LLILLL * i7), Math.min(iMax, this.LLILZ));
            int i8 = size - iMin;
            if (i7 != 0) {
                i6 = i7;
            }
            int iMin2 = Math.min(i8 / i6, this.LLILLJJLI);
            int i9 = i8 - (i7 * iMin2);
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getVisibility() != 8) {
                    int[] iArr = this.LLJJJJ;
                    if (i10 == this.LLJILLL) {
                        i4 = iMin;
                    } else {
                        i4 = iMin2;
                    }
                    iArr[i10] = i4;
                    if (i9 > 0) {
                        iArr[i10] = i4 + 1;
                        i9--;
                    }
                } else {
                    this.LLJJJJ[i10] = 0;
                }
            }
        } else {
            if (size2 != 0) {
                i6 = size2;
            }
            int iMin3 = Math.min(size / i6, this.LLILZ);
            int i11 = size - (size2 * iMin3);
            for (int i12 = 0; i12 < childCount; i12++) {
                if (getChildAt(i12).getVisibility() != 8) {
                    int[] iArr2 = this.LLJJJJ;
                    iArr2[i12] = iMin3;
                    if (i11 > 0) {
                        iArr2[i12] = iMin3 + 1;
                        i11--;
                    }
                } else {
                    this.LLJJJJ[i12] = 0;
                }
            }
        }
        int measuredWidth = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.LLJJJJ[i13], 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), View.resolveSizeAndState(this.LLILZLL, iMakeMeasureSpec, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }
}
