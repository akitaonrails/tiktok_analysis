package X;

import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.19qB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21662519qB extends C21599719g3 {
    public long LLLLZI;
    public final C716710S9l LLLLZIL;
    public int LLLLZLL;
    public final CopyOnWriteArrayList<InterfaceC661730PxT> LLLLZLLIL;
    public boolean LLLLZLLLI;
    public int LLLZ;
    public boolean LLLZI;
    public boolean LLLZIIL;
    public int LLLZIL;
    public final ARunnableS133S0100000_33 LLLZL;

    private final Pair<Integer, Integer> getRealIndexAndRealCount() {
        if (!this.LLLZIIL) {
            return new Pair<>(Integer.valueOf(this.LLLLZLL), Integer.valueOf(getAdapter() != null ? getAdapter().getCount() : 0));
        }
        int size = getAdapter() instanceof C21663019qG ? ((C21663019qG) getAdapter()).LLJ.size() : getAdapter().getCount();
        return new Pair<>(Integer.valueOf(this.LLLLZLL % size), Integer.valueOf(size));
    }

    public final void LJJJI() {
        Pair<Integer, Integer> realIndexAndRealCount = getRealIndexAndRealCount();
        int iIntValue = realIndexAndRealCount.getFirst().intValue();
        int iIntValue2 = realIndexAndRealCount.getSecond().intValue();
        boolean z = iIntValue == this.LLLZIL;
        LLFFF(this.LLLLZLL, this.LLLZIIL || !z);
        if (!z) {
            Iterator<InterfaceC661730PxT> it2 = this.LLLLZLLIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(iIntValue, iIntValue2, 1500L);
            }
        } else {
            this.LLLZ++;
            Iterator<InterfaceC661730PxT> it3 = this.LLLLZLLIL.iterator();
            while (it3.hasNext()) {
                it3.next().LIZIZ(iIntValue, iIntValue2, this.LLLZ);
            }
        }
    }

    public final int getCurrentPosition() {
        return getRealIndexAndRealCount().getFirst().intValue();
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLLZI = true;
        C716710S9l c716710S9l = this.LLLLZIL;
        c716710S9l.LIZIZ = false;
        C0STS c0sts = c716710S9l.LIZ;
        c0sts.LIZLLL = false;
        c0sts.LIZ = 0;
        HandlerHook.viewRemoveCallbacks(this, this.LLLZL);
        this.LLLZ = 0;
    }

    @Override // X.C21600219g8, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (!this.LLLLZLLLI) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLLLZLLLI) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLLLZLLLI) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCurrentPhotoItem(int i) {
        this.LLLLZLL = i;
        LLFFF(i, false);
    }

    public final void setIsInfiniteScroll(boolean z) {
        this.LLLZIIL = z;
    }

    public final void setLastPhotoIndex(int i) {
        int iIntValue = getRealIndexAndRealCount().getSecond().intValue();
        if (i < 0) {
            i = 0;
        }
        int i2 = iIntValue - 1;
        if (i > i2) {
            i = i2;
        }
        this.LLLZIL = i;
    }

    public final void setSupportSlide(boolean z) {
        this.LLLLZLLLI = z;
    }

    public final void setTransformer(InterfaceC19471211Fu interfaceC19471211Fu) {
        if (interfaceC19471211Fu != null) {
            LJJIJIIJIL(interfaceC19471211Fu);
        } else {
            LJJIJIIJIL(null);
        }
    }

    public C21662519qB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZI = 2150L;
        C716710S9l c716710S9l = new C716710S9l(context);
        this.LLLLZIL = c716710S9l;
        this.LLLLZLL = getCurrentItem();
        this.LLLLZLLIL = new CopyOnWriteArrayList<>();
        this.LLLZL = new ARunnableS133S0100000_33(this, 74);
        setScroller(c716710S9l);
    }
}
