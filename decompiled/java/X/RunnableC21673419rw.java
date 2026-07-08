package X;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.19rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class RunnableC21673419rw implements Runnable {
    public static final ThreadLocal<RunnableC21673419rw> LLILZIL = new ThreadLocal<>();
    public static final C21675519sH LLILZLL = new Comparator<C21675819sK>() { // from class: X.19sH
        @Override // java.util.Comparator
        public final int compare(C21675819sK c21675819sK, C21675819sK c21675819sK2) {
            boolean z;
            boolean z2;
            C21675819sK c21675819sK3 = c21675819sK;
            C21675819sK c21675819sK4 = c21675819sK2;
            RecyclerView recyclerView = c21675819sK3.LIZLLL;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (c21675819sK4.LIZLLL == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (recyclerView != null) {
                    return -1;
                }
            } else {
                boolean z3 = c21675819sK3.LIZ;
                if (z3 != c21675819sK4.LIZ) {
                    if (z3) {
                        return -1;
                    }
                } else {
                    int i = c21675819sK4.LIZIZ - c21675819sK3.LIZIZ;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = c21675819sK3.LIZJ - c21675819sK4.LIZJ;
                    if (i2 == 0) {
                        return 0;
                    }
                    return i2;
                }
            }
            return 1;
        }
    };
    public long LLILLJJLI;
    public long LLILLL;
    public final ArrayList<RecyclerView> LL = new ArrayList<>();
    public final ArrayList<C21675819sK> LLILZ = new ArrayList<>();

    public final void LIZIZ() {
        try {
            int i = C08C0.LIZ;
            Trace.beginSection("RV Prefetch");
            if (this.LL.isEmpty()) {
                this.LLILLJJLI = 0L;
                Trace.endSection();
                return;
            }
            int size = this.LL.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.LL.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.LLILLJJLI = 0L;
                Trace.endSection();
            } else {
                LIZLLL(TimeUnit.MILLISECONDS.toNanos(jMax) + this.LLILLL);
                this.LLILLJJLI = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI = 0L;
            int i3 = C08C0.LIZ;
            Trace.endSection();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public final void LIZLLL(long j) {
        C21675819sK c21675819sK;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        C21675819sK c21675819sK2;
        boolean z;
        int size = this.LL.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) ListProtector.get(this.LL, i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.LIZIZ(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.LIZLLL;
            }
        }
        this.LLILZ.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) ListProtector.get(this.LL, i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C21673819s0 c21673819s0 = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(c21673819s0.LIZ) + Math.abs(c21673819s0.LIZIZ);
                for (int i5 = 0; i5 < c21673819s0.LIZLLL * 2; i5 += 2) {
                    if (i3 >= this.LLILZ.size()) {
                        c21675819sK2 = new C21675819sK();
                        this.LLILZ.add(c21675819sK2);
                    } else {
                        c21675819sK2 = (C21675819sK) ListProtector.get(this.LLILZ, i3);
                    }
                    int[] iArr = c21673819s0.LIZJ;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= iAbs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c21675819sK2.LIZ = z;
                    c21675819sK2.LIZIZ = iAbs;
                    c21675819sK2.LIZJ = i6;
                    c21675819sK2.LIZLLL = recyclerView4;
                    c21675819sK2.LJ = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.LLILZ, LLILZLL);
        for (int i7 = 0; i7 < this.LLILZ.size() && (recyclerView = (c21675819sK = (C21675819sK) ListProtector.get(this.LLILZ, i7)).LIZLLL) != null; i7++) {
            if (c21675819sK.LIZ) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            RecyclerView.ViewHolder viewHolderLJ = LJ(recyclerView, c21675819sK.LJ, j2);
            if (viewHolderLJ != null && viewHolderLJ.mNestedRecyclerView != null && viewHolderLJ.isBound() && !viewHolderLJ.isInvalid() && (recyclerView2 = viewHolderLJ.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.getUnfilteredChildCount() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                C21673819s0 c21673819s02 = recyclerView2.mPrefetchRegistry;
                c21673819s02.LIZIZ(recyclerView2, true);
                if (c21673819s02.LIZLLL != 0) {
                    try {
                        int i8 = C08C0.LIZ;
                        Trace.beginSection("RV Nested Prefetch");
                        C21673919s1 c21673919s1 = recyclerView2.mState;
                        AbstractC21673619ry abstractC21673619ry = recyclerView2.mAdapter;
                        c21673919s1.LIZLLL = 1;
                        c21673919s1.LJ = abstractC21673619ry.getItemCount();
                        c21673919s1.LJI = false;
                        c21673919s1.LJII = false;
                        c21673919s1.LJIIIIZZ = false;
                        for (int i9 = 0; i9 < c21673819s02.LIZLLL * 2; i9 += 2) {
                            LJ(recyclerView2, c21673819s02.LIZJ[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        int i10 = C08C0.LIZ;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            c21675819sK.LIZ = false;
            c21675819sK.LIZIZ = 0;
            c21675819sK.LIZJ = 0;
            c21675819sK.LIZLLL = null;
            c21675819sK.LJ = 0;
        }
    }

    public static RecyclerView.ViewHolder LIZ(RecyclerView recyclerView, int i, long j) {
        int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
        for (int i2 = 0; i2 < unfilteredChildCount; i2++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        C21673319rv c21673319rv = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder viewHolderLJIILL = c21673319rv.LJIILL(i, j);
            if (viewHolderLJIILL != null) {
                if (viewHolderLJIILL.isBound() && !viewHolderLJIILL.isInvalid()) {
                    c21673319rv.LJIIJJI(viewHolderLJIILL.itemView);
                } else {
                    c21673319rv.LIZ(viewHolderLJIILL, false);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return viewHolderLJIILL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public static RecyclerView.ViewHolder LJ(RecyclerView recyclerView, int i, long j) {
        try {
            return LIZ(recyclerView, i, j);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "rv_gap_worker_illegal_argument_guard", true, false)) {
                throw e;
            }
            return null;
        } catch (IndexOutOfBoundsException e2) {
            TryCatchGuardChecker.doCheck(e2);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GapWorker Guard---->\n");
            sbLIZ.append(e2.toString());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "recyclerview_gap_worker_guard", true, false)) {
                throw e2;
            }
            return null;
        }
    }

    public final void LIZJ(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.LL.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.LLILLJJLI == 0) {
                this.LLILLJJLI = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C21673819s0 c21673819s0 = recyclerView.mPrefetchRegistry;
        c21673819s0.LIZ = i;
        c21673819s0.LIZIZ = i2;
    }
}
