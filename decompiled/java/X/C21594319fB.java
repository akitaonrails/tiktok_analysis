package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.widget.AVRtlViewPager$SavedState;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19fB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21594319fB extends ViewPager {
    public int LL;
    public final HashMap<InterfaceC469360Ias, C21594719fF> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    public final boolean LIZJ() {
        return this.LL == 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C21595519fN c21595519fN = (C21595519fN) super.getAdapter();
        if (c21595519fN == null) {
            return null;
        }
        return c21595519fN.LLIZ;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !LIZJ()) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    public int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getCount();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new AVRtlViewPager$SavedState(super.onSaveInstanceState(), this.LL);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void addOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        C21594719fF c21594719fF = new C21594719fF(this, interfaceC469360Ias);
        this.LLILLJJLI.put(interfaceC469360Ias, c21594719fF);
        super.addOnPageChangeListener(c21594719fF);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AVRtlViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AVRtlViewPager$SavedState aVRtlViewPager$SavedState = (AVRtlViewPager$SavedState) parcelable;
        this.LL = aVRtlViewPager$SavedState.mLayoutDirection;
        super.onRestoreInstanceState(aVRtlViewPager$SavedState.mViewPagerSavedState);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int currentItem = 0;
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        if (i2 != this.LL) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                currentItem = getCurrentItem();
            }
            this.LL = i2;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(currentItem);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (motionEvent.getAction() == 1) {
                motionEvent.setAction(3);
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void removeOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        super.removeOnPageChangeListener(this.LLILLJJLI.get(interfaceC469360Ias));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(final PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C21595519fN(pagerAdapter) { // from class: X.19fH
                @Override // androidx.viewpager.widget.PagerAdapter
                public final int LJIJJ(Object obj) {
                    int iLJIJJ = this.LLIZ.LJIJJ(obj);
                    if (this.LLIZLLLIL.LIZJ()) {
                        if (iLJIJJ != -1 && iLJIJJ != -2) {
                            return (getCount() - iLJIJJ) - 1;
                        }
                        return -2;
                    }
                    return iLJIJJ;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final CharSequence LJIJJLI(int i) {
                    if (this.LLIZLLLIL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    return this.LLIZ.LJIJJLI(i);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final float LJIL(int i) {
                    if (this.LLIZLLLIL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    return this.LLIZ.LJIL(i);
                }

                @Override // X.AbstractC480470Isn
                public final Fragment LJJIJIL(int i) {
                    if (this.LLIZLLLIL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    return ((AbstractC480470Isn) this.LLIZ).LJJIJIL(i);
                }

                @Override // X.AbstractC480470Isn
                public final long LJJIJL(int i) {
                    if (this.LLIZLLLIL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    return i;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final Object LJJ(int i, View view) {
                    if (this.LLIZLLLIL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    return this.LLIZ.LJJ(i, view);
                }

                @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
                public final Object LJJI(int i, ViewGroup viewGroup) {
                    if (this.LLIZLLLIL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    return this.LLIZ.LJJI(i, viewGroup);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final void LJIILLIIL(int i, View view, Object obj) {
                    if (this.LLIZLLLIL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    this.LLIZ.LJIILLIIL(i, view, obj);
                }

                @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
                public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
                    if (this.LLIZLLLIL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    this.LLIZ.LJIIZILJ(viewGroup, i, obj);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final void LJJIIJZLJL(int i, View view, Object obj) {
                    if (this.LLIZLLLIL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    this.LLIZ.LJJIIJZLJL(i, view, obj);
                }

                @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
                public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
                    if (this.LLIZLLLIL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    this.LLIZ.LJJIIZ(viewGroup, i, obj);
                }
            };
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setCheckScrollXWhenIdle(boolean z) {
        this.LLILLL = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LIZJ()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        super.setOnPageChangeListener(new C21594719fF(this, interfaceC469360Ias));
    }

    public C21594319fB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = new HashMap<>();
        this.LLILZ = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LIZJ()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        boolean z2;
        if (this.LLILZ) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            View view2 = (View) view.getParent();
            view2.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int width = view2.getWidth();
            int height = view2.getHeight();
            int width2 = view.getWidth();
            int height2 = view.getHeight();
            int i = iArr2[0];
            int i2 = width2 + i;
            int i3 = iArr[0];
            if (i2 > i3 && i < i3 + width) {
                z = true;
            } else {
                z = false;
            }
            int i4 = iArr2[1];
            int i5 = height2 + i4;
            int i6 = iArr[1];
            if (i5 > i6 && i4 < i6 + height) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }
}
