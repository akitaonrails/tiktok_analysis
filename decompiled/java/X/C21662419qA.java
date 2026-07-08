package X;

import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.19qA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21662419qA extends C21599719g3 {
    public long LLLLZI;
    public final C716710S9l LLLLZIL;
    public int LLLLZLL;
    public int LLLLZLLIL;
    public final CopyOnWriteArrayList<InterfaceC661730PxT> LLLLZLLLI;
    public boolean LLLZ;
    public int LLLZI;
    public boolean LLLZIIL;
    public final ARunnableS133S0100000_33 LLLZIL;

    public final void LJJJI() {
        InterfaceC21662719qD interfaceC21662719qDLJJJIL;
        int count;
        int iLJIIIZ;
        PagerAdapter adapter = getAdapter();
        if (adapter != null && (interfaceC21662719qDLJJJIL = LJJJIL()) != null && interfaceC21662719qDLJJJIL.LIZLLL() && (count = adapter.getCount()) > 0) {
            int currentItem = super.getCurrentItem();
            if (currentItem == 0) {
                int iLJIILL = interfaceC21662719qDLJJJIL.LJIILL();
                if (iLJIILL != currentItem) {
                    super.LLFFF(iLJIILL, false);
                }
            } else if (currentItem == count - 1 && (iLJIIIZ = interfaceC21662719qDLJJJIL.LJIIIZ()) != currentItem) {
                super.LLFFF(iLJIIIZ, false);
            }
            this.LLLLZLL = LJJJJJ(super.getCurrentItem());
        }
    }

    public final InterfaceC21662719qD LJJJIL() {
        Object adapter = getAdapter();
        if (adapter instanceof InterfaceC21662719qD) {
            return (InterfaceC21662719qD) adapter;
        }
        return null;
    }

    public final void LJJJJ() {
        int realItemCount;
        PagerAdapter adapter = getAdapter();
        if (adapter == null || (realItemCount = getRealItemCount()) == 0 || adapter.getCount() == 0) {
            return;
        }
        int currentItem = (super.getCurrentItem() + 1) % adapter.getCount();
        int iLJJJJJ = LJJJJJ(currentItem);
        this.LLLLZLL = iLJJJJJ;
        boolean z = false;
        boolean z2 = iLJJJJJ == this.LLLLZLLIL;
        InterfaceC21662719qD interfaceC21662719qDLJJJIL = LJJJIL();
        if (interfaceC21662719qDLJJJIL == null || !interfaceC21662719qDLJJJIL.LIZLLL() ? currentItem != 0 : !z2) {
            z = true;
        }
        LLFFF(currentItem, z);
        if (!z2) {
            Iterator<InterfaceC661730PxT> it2 = this.LLLLZLLLI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(this.LLLLZLL, realItemCount, 1500L);
            }
        } else {
            this.LLLZI++;
            Iterator<InterfaceC661730PxT> it3 = this.LLLLZLLLI.iterator();
            while (it3.hasNext()) {
                it3.next().LIZIZ(this.LLLLZLL, realItemCount, this.LLLZI);
            }
        }
    }

    public final int getCurrentPosition() {
        int iLJJJJJ = LJJJJJ(super.getCurrentItem());
        this.LLLLZLL = iLJJJJJ;
        return iLJJJJJ;
    }

    public final int getRealItemCount() {
        InterfaceC21662719qD interfaceC21662719qDLJJJIL = LJJJIL();
        if (interfaceC21662719qDLJJJIL != null) {
            return interfaceC21662719qDLJJJIL.LJIIJJI();
        }
        PagerAdapter adapter = getAdapter();
        if (adapter != null) {
            return adapter.getCount();
        }
        return 0;
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLLZIIL = true;
        C716710S9l c716710S9l = this.LLLLZIL;
        c716710S9l.LIZIZ = false;
        C0STS c0sts = c716710S9l.LIZ;
        c0sts.LIZLLL = false;
        c0sts.LIZ = 0;
        HandlerHook.viewRemoveCallbacks(this, this.LLLZIL);
        this.LLLZI = 0;
        HandlerHook.viewRemoveCallbacks(this, this.LLLZIL);
    }

    public final void LJJJJI(Integer num) {
        this.LLLZIIL = false;
        HandlerHook.viewRemoveCallbacks(this, this.LLLZIL);
        int realItemCount = getRealItemCount();
        if (num != null && realItemCount > 0) {
            int iIntValue = ((num.intValue() % realItemCount) + realItemCount) % realItemCount;
            this.LLLLZLL = iIntValue;
            LLFFF(LJJJJIZL(iIntValue), false);
        } else {
            InterfaceC21662719qD interfaceC21662719qDLJJJIL = LJJJIL();
            if (interfaceC21662719qDLJJJIL != null && interfaceC21662719qDLJJJIL.LIZLLL()) {
                LJJJI();
            } else {
                this.LLLLZLL = LJJJJJ(super.getCurrentItem());
            }
        }
        C716710S9l c716710S9l = this.LLLLZIL;
        c716710S9l.LIZIZ = true;
        C0STS c0sts = c716710S9l.LIZ;
        c0sts.LIZLLL = true;
        c0sts.LIZ = 0;
        HandlerHook.viewPostDelay(this, this.LLLZIL, 1500L);
    }

    public final int LJJJJIZL(int i) {
        int count;
        InterfaceC21662719qD interfaceC21662719qDLJJJIL = LJJJIL();
        if (interfaceC21662719qDLJJJIL != null && interfaceC21662719qDLJJJIL.LJIIJJI() > 0) {
            return interfaceC21662719qDLJJJIL.LIZ(i);
        }
        PagerAdapter adapter = getAdapter();
        if (adapter != null && (count = adapter.getCount()) != 0) {
            return C13LZ.LJ(i, 0, count - 1);
        }
        return 0;
    }

    public final int LJJJJJ(int i) {
        int count;
        InterfaceC21662719qD interfaceC21662719qDLJJJIL = LJJJIL();
        if (interfaceC21662719qDLJJJIL != null && interfaceC21662719qDLJJJIL.LJIIJJI() > 0) {
            return interfaceC21662719qDLJJJIL.LJIILIIL(i);
        }
        PagerAdapter adapter = getAdapter();
        if (adapter != null && (count = adapter.getCount()) != 0) {
            return C13LZ.LJ(i, 0, count - 1);
        }
        return 0;
    }

    @Override // X.C21600219g8, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (!this.LLLZ) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLLZ) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLLZ) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.C21599719g3, X.C21600219g8
    public void setCurrentItem(int i) {
        super.setCurrentItem(i);
        this.LLLLZLL = LJJJJJ(i);
    }

    public final void setCurrentPhotoItem(int i) {
        int i2;
        int realItemCount = getRealItemCount();
        if (realItemCount == 0) {
            this.LLLLZLL = 0;
            return;
        }
        if (realItemCount <= 0) {
            i2 = 0;
        } else {
            i2 = ((i % realItemCount) + realItemCount) % realItemCount;
        }
        this.LLLLZLL = i2;
        LLFFF(LJJJJIZL(i2), false);
    }

    public final void setInitialPhotoIndex(int i) {
        int realItemCount = getRealItemCount();
        if (realItemCount > 0) {
            this.LLLLZLLIL = ((i % realItemCount) + realItemCount) % realItemCount;
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.LLLLZLLIL = i;
    }

    public final void setSupportSlide(boolean z) {
        this.LLLZ = z;
    }

    public C21662419qA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZI = 2150L;
        C716710S9l c716710S9l = new C716710S9l(context);
        this.LLLLZIL = c716710S9l;
        this.LLLLZLLLI = new CopyOnWriteArrayList<>();
        this.LLLZIL = new ARunnableS133S0100000_33(this, 75);
        InterfaceC469360Ias interfaceC469360Ias = new InterfaceC469360Ias() { // from class: X.19qC
            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    this.LL.LJJJI();
                }
            }
        };
        setScroller(c716710S9l);
        LIZLLL(interfaceC469360Ias);
    }

    @Override // X.C21599719g3, X.C21600219g8
    public final void LLFFF(int i, boolean z) {
        super.LLFFF(i, z);
        this.LLLLZLL = LJJJJJ(i);
    }
}
