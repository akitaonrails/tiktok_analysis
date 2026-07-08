package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.uikit.rtl.RtlViewPager$SavedState;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19fD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21594519fD extends ViewPager {
    public int LL;
    public final HashMap<InterfaceC469360Ias, C21595119fJ> LLILLJJLI;

    public final boolean LIZJ() {
        return this.LL == 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.LLILLJJLI.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C21595719fP c21595719fP = (C21595719fP) super.getAdapter();
        if (c21595719fP == null) {
            return null;
        }
        return c21595719fP.LLILLJJLI;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !LIZJ()) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new RtlViewPager$SavedState(super.onSaveInstanceState(), this.LL);
    }

    public C21594519fD(Context context) {
        super(context);
        this.LLILLJJLI = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void addOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        C21595119fJ c21595119fJ = new C21595119fJ(this, interfaceC469360Ias);
        this.LLILLJJLI.put(interfaceC469360Ias, c21595119fJ);
        super.addOnPageChangeListener(c21595119fJ);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof RtlViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        RtlViewPager$SavedState rtlViewPager$SavedState = (RtlViewPager$SavedState) parcelable;
        this.LL = rtlViewPager$SavedState.mLayoutDirection;
        super.onRestoreInstanceState(rtlViewPager$SavedState.mViewPagerSavedState);
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

    @Override // androidx.viewpager.widget.ViewPager
    public final void removeOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        C21595119fJ c21595119fJRemove = this.LLILLJJLI.remove(interfaceC469360Ias);
        if (c21595119fJRemove != null) {
            super.removeOnPageChangeListener(c21595119fJRemove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(final PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C21595719fP(pagerAdapter) { // from class: X.19fG
                @Override // androidx.viewpager.widget.PagerAdapter
                public final int LJIJJ(Object obj) {
                    int iLJIJJ = this.LLILLJJLI.LJIJJ(obj);
                    if (this.LLILLL.LIZJ()) {
                        if (iLJIJJ != -1 && iLJIJJ != -2) {
                            return (getCount() - iLJIJJ) - 1;
                        }
                        return -2;
                    }
                    return iLJIJJ;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final CharSequence LJIJJLI(int i) {
                    if (this.LLILLL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    return this.LLILLJJLI.LJIJJLI(i);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final float LJIL(int i) {
                    if (this.LLILLL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    return this.LLILLJJLI.LJIL(i);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final Object LJJ(int i, View view) {
                    if (this.LLILLL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    return this.LLILLJJLI.LJJ(i, view);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final Object LJJI(int i, ViewGroup viewGroup) {
                    if (this.LLILLL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    return this.LLILLJJLI.LJJI(i, viewGroup);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final void LJIILLIIL(int i, View view, Object obj) {
                    if (this.LLILLL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    this.LLILLJJLI.LJIILLIIL(i, view, obj);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
                    if (this.LLILLL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    this.LLILLJJLI.LJIIZILJ(viewGroup, i, obj);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final void LJJIIJZLJL(int i, View view, Object obj) {
                    if (this.LLILLL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    this.LLILLJJLI.LJJIIJZLJL(i, view, obj);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
                    if (this.LLILLL.LIZJ()) {
                        i = (getCount() - i) - 1;
                    }
                    this.LLILLJJLI.LJJIIZ(viewGroup, i, obj);
                }
            };
        }
        super.setAdapter(pagerAdapter);
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
        super.setOnPageChangeListener(new C21595119fJ(this, interfaceC469360Ias));
    }

    public C21594519fD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = new HashMap<>();
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
}
