package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dmt.viewpager.DmtRtlViewPager$SavedState;
import dmt.viewpager.DmtViewPager$SavedState;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19g3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21599719g3 extends C21600219g8 {
    public int LLLLLZL;
    public final HashMap<InterfaceC469360Ias, C21599919g5> LLLLZ;

    public final boolean LJJJ() {
        return this.LLLLLZL == 1;
    }

    @Override // X.C21600219g8
    public PagerAdapter getAdapter() {
        C21596319fV c21596319fV = (C21596319fV) super.getAdapter();
        if (c21596319fV == null) {
            return null;
        }
        return c21596319fV.LLIZ;
    }

    @Override // X.C21600219g8
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !LJJJ()) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    @Override // X.C21600219g8, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DmtRtlViewPager$SavedState((DmtViewPager$SavedState) super.onSaveInstanceState(), this.LLLLLZL);
    }

    public C21599719g3(Context context) {
        super(context);
        this.LLLLZ = new HashMap<>();
    }

    @Override // X.C21600219g8
    public final void LIZLLL(InterfaceC469360Ias interfaceC469360Ias) {
        C21599919g5 c21599919g5 = new C21599919g5(this, interfaceC469360Ias);
        this.LLLLZ.put(interfaceC469360Ias, c21599919g5);
        super.LIZLLL(c21599919g5);
    }

    @Override // X.C21600219g8
    public final void LJJIIJZLJL(InterfaceC469360Ias interfaceC469360Ias) {
        super.LJJIIJZLJL(this.LLLLZ.get(interfaceC469360Ias));
        if (C0BIH.LIZ()) {
            this.LLLLZ.remove(interfaceC469360Ias);
        }
    }

    @Override // X.C21600219g8, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.C21600219g8, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DmtRtlViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DmtRtlViewPager$SavedState dmtRtlViewPager$SavedState = (DmtRtlViewPager$SavedState) parcelable;
        this.LLLLLZL = dmtRtlViewPager$SavedState.mLayoutDirection;
        super.onRestoreInstanceState(dmtRtlViewPager$SavedState.mViewPagerSavedState);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int currentItem = 0;
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        if (i2 != this.LLLLLZL) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                currentItem = getCurrentItem();
            }
            this.LLLLLZL = i2;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(currentItem);
            }
        }
    }

    @Override // X.C21600219g8, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
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

    @Override // X.C21600219g8
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C21596319fV(this, pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    @Override // X.C21600219g8
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LJJJ()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    @Override // X.C21600219g8
    public void setOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        super.setOnPageChangeListener(new C21599919g5(this, interfaceC469360Ias));
    }

    public C21599719g3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZ = new HashMap<>();
    }

    @Override // X.C21600219g8
    public void LLFFF(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LJJJ()) {
            i = (adapter.getCount() - i) - 1;
        }
        super.LLFFF(i, z);
    }

    @Override // X.C21600219g8, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // X.C21600219g8, android.view.View
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
}
