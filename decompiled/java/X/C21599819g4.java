package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21599819g4 extends C21600219g8 {
    public final boolean LLLLLZL;
    public C21596819fa LLLLZ;
    public final C830490Whz<InterfaceC469360Ias, C21600019g6> LLLLZI;

    public static /* synthetic */ void getForceFlag$annotations() {
    }

    @Override // X.C21600219g8
    public void setOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
    }

    @Override // X.C21600219g8
    public PagerAdapter getAdapter() {
        PagerAdapter adapter = super.getAdapter();
        return adapter instanceof C21596819fa ? ((C21596819fa) adapter).LLILLJJLI : adapter;
    }

    @Override // X.C21600219g8
    @InterfaceC1294060jmO
    public int getCurrentItem() {
        return super.getCurrentItem();
    }

    public C21599819g4(Context context) {
        super(context);
        this.LLLLZI = new C830490Whz<>();
        this.LLLLLZL = context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // X.C21600219g8
    public final void LIZLLL(final InterfaceC469360Ias interfaceC469360Ias) {
        InterfaceC469360Ias interfaceC469360Ias2 = new InterfaceC469360Ias(interfaceC469360Ias) { // from class: X.19g6
            public final InterfaceC469360Ias LL;

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                InterfaceC469360Ias interfaceC469360Ias3 = this.LL;
                if (interfaceC469360Ias3 == null) {
                    return;
                }
                interfaceC469360Ias3.onPageScrollStateChanged(i);
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                InterfaceC469360Ias interfaceC469360Ias3 = this.LL;
                if (interfaceC469360Ias3 == null) {
                    return;
                }
                interfaceC469360Ias3.onPageSelected(this.LLILLJJLI.LJJIL(i));
            }

            {
                this.LL = interfaceC469360Ias;
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
                if (this.LL == null) {
                    return;
                }
                int iLJJIL = this.LLILLJJLI.LJJIL(i);
                if (this.LLILLJJLI.LLLLLZL) {
                    float f2 = iLJJIL - f;
                    iLJJIL = (int) f2;
                    f = f2 - iLJJIL;
                }
                this.LL.onPageScrolled(iLJJIL, f, i2);
            }
        };
        this.LLLLZI.put(interfaceC469360Ias, (C21600019g6) interfaceC469360Ias2);
        super.LIZLLL(interfaceC469360Ias2);
    }

    @Override // X.C21600219g8
    public final void LJJIIJZLJL(InterfaceC469360Ias interfaceC469360Ias) {
        C21600019g6 c21600019g6Remove = this.LLLLZI.remove(interfaceC469360Ias);
        if (c21600019g6Remove != null) {
            super.LJJIIJZLJL(c21600019g6Remove);
        }
    }

    public final int LJJIL(int i) {
        if (this.LLLLLZL) {
            try {
                int count = getAdapter().getCount();
                if (i >= 0 && i < count) {
                    return (count - i) - 1;
                }
                return i;
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                return i;
            }
        }
        return i;
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
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.C21600219g8
    public void setAdapter(PagerAdapter pagerAdapter) {
        C21596819fa c21596819fa = this.LLLLZ;
        if (c21596819fa != null) {
            try {
                c21596819fa.LLILLJJLI.LJJIJIIJIL(c21596819fa.LLILLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            this.LLLLZ = null;
        }
        if (this.LLLLLZL && pagerAdapter != null) {
            C21596819fa c21596819fa2 = new C21596819fa(pagerAdapter);
            this.LLLLZ = c21596819fa2;
            pagerAdapter = c21596819fa2;
        }
        super.setAdapter(pagerAdapter);
        if (this.LLLLLZL) {
            LLFFF(0, false);
        }
    }

    @Override // X.C21600219g8
    public void setCurrentItem(int i) {
        super.setCurrentItem(LJJIL(i));
    }

    public C21599819g4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZI = new C830490Whz<>();
        this.LLLLLZL = context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // X.C21600219g8
    public final void LLFFF(int i, boolean z) {
        super.LLFFF(LJJIL(i), z);
    }
}
