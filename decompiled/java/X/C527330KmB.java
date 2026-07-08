package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0KmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527330KmB extends ViewPager {
    public final Set<Integer> LL;
    public boolean LLILLJJLI;
    public float LLILLL;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        int currentItem;
        PagerAdapter adapter;
        PagerAdapter adapter2 = getAdapter();
        if (adapter2 != null) {
            numValueOf = Integer.valueOf(adapter2.getCount());
        } else {
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() == 0) {
            return false;
        }
        if (this.LLILLJJLI && !this.LL.isEmpty()) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    float x = motionEvent.getX();
                    float f = this.LLILLL - x;
                    if (Math.abs(f) > 50.0f) {
                        if (f > 0.0f) {
                            currentItem = getCurrentItem() + 1;
                        } else {
                            currentItem = getCurrentItem() - 1;
                        }
                        if (currentItem >= 0 && (adapter = getAdapter()) != null && currentItem < adapter.getCount()) {
                            getCurrentItem();
                            if (this.LLILLJJLI && this.LL.contains(Integer.valueOf(currentItem))) {
                                return false;
                            }
                        }
                    }
                    this.LLILLL = x;
                }
            } else {
                this.LLILLL = motionEvent.getX();
                getCurrentItem();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        int currentItem;
        PagerAdapter adapter;
        PagerAdapter adapter2 = getAdapter();
        if (adapter2 != null) {
            numValueOf = Integer.valueOf(adapter2.getCount());
        } else {
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() == 0) {
            return false;
        }
        if (this.LLILLJJLI && !this.LL.isEmpty()) {
            if (motionEvent.getAction() == 2) {
                float x = this.LLILLL - motionEvent.getX();
                if (Math.abs(x) > 50.0f) {
                    if (x > 0.0f) {
                        currentItem = getCurrentItem() + 1;
                    } else {
                        currentItem = getCurrentItem() - 1;
                    }
                    if (currentItem >= 0 && (adapter = getAdapter()) != null && currentItem < adapter.getCount()) {
                        getCurrentItem();
                        if (this.LLILLJJLI && this.LL.contains(Integer.valueOf(currentItem))) {
                            return false;
                        }
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        setCurrentItem(i, false);
    }

    public final void setRestrictedIndices(Set<Integer> set) {
        this.LL.clear();
        this.LL.addAll(set);
    }

    public final void setRestrictionEnabled(boolean z) {
        this.LLILLJJLI = z;
    }

    public C527330KmB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new LinkedHashSet();
        this.LLILLJJLI = true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z) {
        if (this.LLILLJJLI && this.LL.contains(Integer.valueOf(i))) {
            return;
        }
        super.setCurrentItem(i, z);
    }
}
