package X;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableC21673519rx implements Runnable {
    public int LL;
    public int LLILLJJLI;
    public OverScroller LLILLL;
    public Interpolator LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final /* synthetic */ RecyclerView LLIZ;

    public final void LIZ() {
        int i;
        int i2;
        RecyclerView recyclerView = this.LLIZ;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.LLILLL.abortAnimation();
            return;
        }
        this.LLILZLL = false;
        this.LLILZIL = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.LLILLL;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currX - this.LL;
            int i4 = currY - this.LLILLJJLI;
            this.LL = currX;
            this.LLILLJJLI = currY;
            int iConsumeFlingInHorizontalStretch = this.LLIZ.consumeFlingInHorizontalStretch(i3);
            int iConsumeFlingInVerticalStretch = this.LLIZ.consumeFlingInVerticalStretch(i4);
            RecyclerView recyclerView2 = this.LLIZ;
            int[] iArr = recyclerView2.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView2.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = this.LLIZ.mReusableIntPair;
                iConsumeFlingInHorizontalStretch -= iArr2[0];
                iConsumeFlingInVerticalStretch -= iArr2[1];
            }
            if (this.LLIZ.getOverScrollMode() != 2) {
                this.LLIZ.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
            }
            RecyclerView recyclerView3 = this.LLIZ;
            if (recyclerView3.mAdapter != null) {
                int[] iArr3 = recyclerView3.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView3.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                RecyclerView recyclerView4 = this.LLIZ;
                int[] iArr4 = recyclerView4.mReusableIntPair;
                i2 = iArr4[0];
                i = iArr4[1];
                iConsumeFlingInHorizontalStretch -= i2;
                iConsumeFlingInVerticalStretch -= i;
                AbstractC21674019s2 abstractC21674019s2 = recyclerView4.mLayout.mSmoothScroller;
                if (abstractC21674019s2 != null && !abstractC21674019s2.LIZLLL && abstractC21674019s2.LJ) {
                    int iLIZIZ = recyclerView4.mState.LIZIZ();
                    if (iLIZIZ == 0) {
                        abstractC21674019s2.LJII();
                    } else if (abstractC21674019s2.LIZ >= iLIZIZ) {
                        abstractC21674019s2.LIZ = iLIZIZ - 1;
                        abstractC21674019s2.LIZJ(i2, i);
                    } else {
                        abstractC21674019s2.LIZJ(i2, i);
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (!this.LLIZ.mItemDecorations.isEmpty()) {
                this.LLIZ.invalidate();
            }
            RecyclerView recyclerView5 = this.LLIZ;
            int[] iArr5 = recyclerView5.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView5.dispatchNestedScroll(i2, i, iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, null, 1, iArr5);
            RecyclerView recyclerView6 = this.LLIZ;
            int[] iArr6 = recyclerView6.mReusableIntPair;
            int i5 = iConsumeFlingInHorizontalStretch - iArr6[0];
            int i6 = iConsumeFlingInVerticalStretch - iArr6[1];
            if (i2 != 0 || i != 0) {
                recyclerView6.dispatchOnScrolled(i2, i);
            }
            if (!this.LLIZ.awakenScrollBars()) {
                this.LLIZ.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
            RecyclerView recyclerView7 = this.LLIZ;
            AbstractC21674019s2 abstractC21674019s22 = recyclerView7.mLayout.mSmoothScroller;
            if ((abstractC21674019s22 == null || !abstractC21674019s22.LIZLLL) && z) {
                if (recyclerView7.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                    if (i6 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i6 <= 0) {
                        currVelocity = 0;
                    }
                    this.LLIZ.absorbGlows(i7, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    C21673819s0 c21673819s0 = this.LLIZ.mPrefetchRegistry;
                    int[] iArr7 = c21673819s0.LIZJ;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    c21673819s0.LIZLLL = 0;
                }
            } else {
                LIZJ();
                RecyclerView recyclerView8 = this.LLIZ;
                RunnableC21673419rw runnableC21673419rw = recyclerView8.mGapWorker;
                if (runnableC21673419rw != null) {
                    runnableC21673419rw.LIZJ(recyclerView8, i2, i);
                }
            }
        }
        AbstractC21674019s2 abstractC21674019s23 = this.LLIZ.mLayout.mSmoothScroller;
        if (abstractC21674019s23 != null && abstractC21674019s23.LIZLLL) {
            abstractC21674019s23.LIZJ(0, 0);
        }
        this.LLILZIL = false;
        if (this.LLILZLL) {
            this.LLIZ.removeCallbacks(this);
            this.LLIZ.postOnAnimation(this);
        } else {
            this.LLIZ.setScrollState(0);
            this.LLIZ.stopNestedScroll(1);
        }
    }

    public final void LIZJ() {
        if (this.LLILZIL) {
            this.LLILZLL = true;
        } else {
            this.LLIZ.removeCallbacks(this);
            this.LLIZ.postOnAnimation(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC21673519rx(RecyclerView recyclerView) {
        this.LLIZ = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.LLILZ = interpolator;
        this.LLILLL = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void LIZIZ(int i, int i2) {
        this.LLIZ.setScrollState(2);
        this.LLILLJJLI = 0;
        this.LL = 0;
        Interpolator interpolator = this.LLILZ;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.LLILZ = interpolator2;
            this.LLILLL = new OverScroller(this.LLIZ.getContext(), interpolator2);
        }
        this.LLILLL.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        LIZJ();
    }

    public final void LIZLLL(int i, int i2, Interpolator interpolator, int i3) {
        boolean z;
        int height;
        int iMin = i3;
        if (iMin == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            if (iAbs > iAbs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = this.LLIZ;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
                iAbs = iAbs2;
            }
            iMin = Math.min((int) (((iAbs / height) + 1.0f) * 300.0f), 2000);
        }
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.LLILZ != interpolator) {
            this.LLILZ = interpolator;
            this.LLILLL = new OverScroller(this.LLIZ.getContext(), interpolator);
        }
        this.LLILLJJLI = 0;
        this.LL = 0;
        this.LLIZ.setScrollState(2);
        this.LLILLL.startScroll(0, 0, i, i2, iMin);
        LIZJ();
    }
}
