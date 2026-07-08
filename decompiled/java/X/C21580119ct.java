package X;

import Y.ALAdapterS27S0100000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.19ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21580119ct extends C21578619ce {
    public final List<InterfaceC21580219cu> LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final BPEAHandler LLIZ;
    public final ValueAnimator LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;

    public final void LIZ(int i) {
        if (!this.LLILZLL || !canScrollVertically(i - getScrollY())) {
            return;
        }
        this.LLJ = i;
        this.LLJI = getScrollY();
        this.LLIZLLLIL.cancel();
        this.LLIZLLLIL.start();
    }

    @Override // X.C21578619ce
    public final void fling(int i) {
        super.fling(i);
        Iterator<InterfaceC21580219cu> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().d3(i);
        }
        this.LLILZIL = true;
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!canScrollVertically(1)) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C21578619ce, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        super.onStopNestedScroll(view);
    }

    @Override // X.C21578619ce, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        motionEvent.getAction();
        motionEvent.getAction();
        if (motionEvent.getAction() == 1 && !this.LLILZIL) {
            this.LLIZ.removeCallbacksAndMessages(null);
            C786410Ut5.LJLJJI(1001, 16L, this.LLIZ);
        }
        return zOnTouchEvent;
    }

    public final void setParentRefreshLayout(C0J33 c0j33) {
        if (c0j33 != null) {
            c0j33.setOnInterceptListener(new AwS612S0100000_33(this, 62));
        }
    }

    @Override // X.C21578619ce, android.view.View
    public final boolean startNestedScroll(int i) {
        return super.startNestedScroll(i);
    }

    public C21580119ct(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.C21578619ce, X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        super.onStopNestedScroll(view, i);
        if (!this.LLILZ && !this.LLJIJIL) {
            boolean z = this.LLILLJJLI;
            if (z && i == 1) {
                Iterator<InterfaceC21580219cu> it2 = this.LL.iterator();
                while (it2.hasNext()) {
                    it2.next().c3();
                }
                return;
            } else {
                if (this.LLILLL && !z && i == 0) {
                    Iterator<InterfaceC21580219cu> it3 = this.LL.iterator();
                    while (it3.hasNext()) {
                        it3.next().c3();
                    }
                    return;
                }
                return;
            }
        }
        this.LLILZ = false;
    }

    @Override // X.C21578619ce, X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        this.LLILZ = true;
        onStopNestedScroll(this, 1);
        this.LLILLL = true;
        return super.startNestedScroll(i, i2);
    }

    public C21580119ct(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOverScrollMode(2);
        this.LL = new ArrayList();
        this.LLIZ = new BPEAHandler(Looper.getMainLooper(), new C2189631Amn(this, 2));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 19));
        valueAnimatorOfFloat.addListener(new ALAdapterS27S0100000_33(this, 5));
        this.LLIZLLLIL = valueAnimatorOfFloat;
    }

    @Override // X.C21578619ce, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        this.LLILLJJLI = true;
        return super.onNestedPreFling(view, f, f2 / 2);
    }

    @Override // X.C21578619ce, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21580219cu) it2.next()).a3(getScrollY());
        }
        if (this.LLILZIL) {
            this.LLIZ.removeCallbacksAndMessages(null);
            C786410Ut5.LJLJJI(1001, 16L, this.LLIZ);
        }
    }

    @Override // X.C21578619ce, X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        super.onNestedPreScroll(view, i, i2, iArr, i3);
        if (i2 > 0 && canScrollVertically(i2) && i2 - iArr[1] > 0) {
            int i4 = i2 - iArr[1];
            iArr[0] = i;
            iArr[1] = i2;
            scrollBy(0, i4);
        }
    }
}
