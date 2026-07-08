package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ktJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1336790ktJ extends ViewPager {
    public boolean LL;
    public InterfaceC1336820ktM LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public final Class<?> LLILZLL;
    public boolean LLIZ;
    public final HashMap<InterfaceC469360Ias, C1336840ktO> LLIZLLLIL;

    public final Field getIsUnableToDrag() {
        Field declaredField = null;
        try {
            Class<?> cls = this.LLILZLL;
            if (cls != null) {
                declaredField = cls.getDeclaredField("mIsUnableToDrag");
                return declaredField;
            }
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("Foldview#BaseViewPagerImpl", "no such field mIsUnableToDrag");
        }
        return declaredField;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C21596419fW c21596419fW = (C21596419fW) super.getAdapter();
        if (c21596419fW != null) {
            return c21596419fW.LLILLJJLI;
        }
        return null;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !this.LLIZ) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    public final C21596419fW getReversingAdapter() {
        PagerAdapter adapter = super.getAdapter();
        if (adapter instanceof C21596419fW) {
            return (C21596419fW) adapter;
        }
        return null;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Method declaredMethod;
        super.onAttachedToWindow();
        try {
            Class<?> cls = this.LLILZLL;
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("populate", new Class[0])) == null) {
                return;
            }
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, new Object[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LynxLog.e("Foldview#BaseViewPagerImpl", "populate failed");
            requestLayout();
        }
    }

    public final int getMActivePointerId() {
        return this.LLILZIL;
    }

    public final boolean getMAllowHorizontalGesture() {
        return this.LL;
    }

    public final InterfaceC1336820ktM getMInterceptTouchEventListener() {
        return this.LLILLJJLI;
    }

    public final float getMLastMotionX() {
        return this.LLILLL;
    }

    public final float getMLastMotionY() {
        return this.LLILZ;
    }

    public final Class<?> getSuperclass() {
        return this.LLILZLL;
    }

    public C1336790ktJ(Context context) {
        Class<? super Object> superclass;
        new LinkedHashMap();
        super(context);
        this.LL = true;
        this.LLILZIL = -1;
        Class<? super Object> superclass2 = getClass().getSuperclass();
        if (superclass2 != null) {
            superclass = superclass2.getSuperclass();
        } else {
            superclass = null;
        }
        this.LLILZLL = superclass;
        this.LLIZLLLIL = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void addOnPageChangeListener(final InterfaceC469360Ias interfaceC469360Ias) {
        final PagerAdapter adapter = super.getAdapter();
        InterfaceC469360Ias interfaceC469360Ias2 = new InterfaceC469360Ias(interfaceC469360Ias, this, adapter) { // from class: X.0ktO
            public final InterfaceC469360Ias LL;
            public final C1336790ktJ LLILLJJLI;
            public final PagerAdapter LLILLL;

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                this.LL.onPageScrollStateChanged(i);
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                PagerAdapter pagerAdapter = this.LLILLL;
                if (this.LLILLJJLI.LLIZ && pagerAdapter != null) {
                    i = (pagerAdapter.getCount() - i) - 1;
                }
                this.LL.onPageSelected(i);
            }

            {
                this.LL = interfaceC469360Ias;
                this.LLILLJJLI = this;
                this.LLILLL = adapter;
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
                int width = this.LLILLJJLI.getWidth();
                PagerAdapter pagerAdapter = this.LLILLL;
                if (this.LLILLJJLI.LLIZ && pagerAdapter != null) {
                    int count = pagerAdapter.getCount();
                    float f2 = width;
                    int iLJIL = ((int) ((1 - pagerAdapter.LJIL(i)) * f2)) + i2;
                    while (i < count && iLJIL > 0) {
                        i++;
                        iLJIL -= (int) (pagerAdapter.LJIL(i) * f2);
                    }
                    i = (count - i) - 1;
                    i2 = -iLJIL;
                    f = i2 / (f2 * pagerAdapter.LJIL(i));
                }
                try {
                    this.LL.onPageScrolled(i, f, i2);
                } catch (NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LynxLog.e("ReversingOnPageChangeListener", e.toString());
                }
            }
        };
        this.LLIZLLLIL.put(interfaceC469360Ias, (C1336840ktO) interfaceC469360Ias2);
        super.addOnPageChangeListener(interfaceC469360Ias2);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        if (!this.LL) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("Foldview#BaseViewPagerImpl", e.toString());
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void removeOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        C1336840ktO c1336840ktORemove = this.LLIZLLLIL.remove(interfaceC469360Ias);
        if (c1336840ktORemove != null) {
            super.removeOnPageChangeListener(c1336840ktORemove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C21596419fW(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
    }

    public final void setMActivePointerId(int i) {
        this.LLILZIL = i;
    }

    public final void setMAllowHorizontalGesture(boolean z) {
        this.LL = z;
    }

    public final void setMInterceptTouchEventListener(InterfaceC1336820ktM interfaceC1336820ktM) {
        this.LLILLJJLI = interfaceC1336820ktM;
    }

    public final void setMLastMotionX(float f) {
        this.LLILLL = f;
    }

    public final void setMLastMotionY(float f) {
        this.LLILZ = f;
    }

    public final void setRTL(boolean z) {
        this.LLIZ = z;
    }

    public final void setRTLMode(boolean z) {
        this.LLIZ = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof C1336790ktJ) {
            if (super.canScroll(view, z, i, i2, i3) && ((C1336790ktJ) view).LL) {
                return true;
            }
            return false;
        }
        return super.canScroll(view, z, i, i2, i3);
    }
}
