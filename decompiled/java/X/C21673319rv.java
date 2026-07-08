package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import u4.q0;

/* JADX INFO: renamed from: X.19rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21673319rv {
    public final ArrayList<RecyclerView.ViewHolder> LIZ;
    public ArrayList<RecyclerView.ViewHolder> LIZIZ;
    public final ArrayList<RecyclerView.ViewHolder> LIZJ;
    public final List<RecyclerView.ViewHolder> LIZLLL;
    public int LJ;
    public int LJFF;
    public RecyclerView.RecycledViewPool LJI;
    public AbstractC1343480l46 LJII;
    public final /* synthetic */ RecyclerView LJIIIIZZ;

    public final void LIZLLL() {
        this.LIZ.clear();
        LJIIIZ();
    }

    public final RecyclerView.RecycledViewPool LJFF() {
        if (this.LJI == null) {
            this.LJI = new RecyclerView.RecycledViewPool();
            LJIIIIZZ();
        }
        return this.LJI;
    }

    public final void LJIIIIZZ() {
        if (this.LJI != null) {
            RecyclerView recyclerView = this.LJIIIIZZ;
            if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            this.LJI.attachForPoolingContainer(this.LJIIIIZZ.mAdapter);
        }
    }

    public final void LJIIIZ() {
        for (int size = this.LIZJ.size() - 1; size >= 0; size--) {
            LJIIJ(size);
        }
        this.LIZJ.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            C21673819s0 c21673819s0 = this.LJIIIIZZ.mPrefetchRegistry;
            int[] iArr = c21673819s0.LIZJ;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c21673819s0.LIZLLL = 0;
        }
    }

    public final void LJIIZILJ() {
        RecyclerView.LayoutManager layoutManager = this.LJIIIIZZ.mLayout;
        this.LJFF = this.LJ + (layoutManager != null ? layoutManager.mPrefetchMaxCountObserved : 0);
        for (int size = this.LIZJ.size() - 1; size >= 0 && this.LIZJ.size() > this.LJFF; size--) {
            LJIIJ(size);
        }
    }

    public C21673319rv(RecyclerView recyclerView) {
        this.LJIIIIZZ = recyclerView;
        ArrayList<RecyclerView.ViewHolder> arrayList = new ArrayList<>();
        this.LIZ = arrayList;
        this.LIZIZ = null;
        this.LIZJ = new ArrayList<>();
        this.LIZLLL = Collections.unmodifiableList(arrayList);
        this.LJ = 2;
        this.LJFF = 2;
    }

    public final int LJ(int i) {
        if (i >= 0 && i < this.LJIIIIZZ.mState.LIZIZ()) {
            RecyclerView recyclerView = this.LJIIIIZZ;
            if (!recyclerView.mState.LJI) {
                return i;
            }
            return recyclerView.mAdapterHelper.findPositionOffset(i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalid position ");
        sbLIZ.append(i);
        sbLIZ.append(". State item count is ");
        sbLIZ.append(this.LJIIIIZZ.mState.LIZIZ());
        sbLIZ.append(this.LJIIIIZZ.exceptionLabel());
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final View LJI(int i) {
        return LJIILL(i, Long.MAX_VALUE).itemView;
    }

    public final void LJIIJ(int i) {
        boolean z = RecyclerView.sDebugAssertionsEnabled;
        LIZ((RecyclerView.ViewHolder) ListProtector.get(this.LIZJ, i), true);
        ListProtector.remove(this.LIZJ, i);
    }

    public final void LJIIJJI(View view) {
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isTmpDetached()) {
            this.LJIIIIZZ.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        LJIIL(childViewHolderInt);
        if (this.LJIIIIZZ.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
            this.LJIIIIZZ.mItemAnimator.LJIIJJI(childViewHolderInt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6 A[EDGE_INSN: B:75:0x00e6->B:61:0x00e6 BREAK  A[LOOP:1: B:51:0x00ba->B:79:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(androidx.recyclerview.widget.RecyclerView.ViewHolder r9) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21673319rv.LJIIL(androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
    }

    public final void LJIILIIL(View view) {
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !this.LJIIIIZZ.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new ArrayList<>();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.LIZIZ.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.LJIIIIZZ.mAdapter.mHasStableIds) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            sbLIZ.append(this.LJIIIIZZ.exceptionLabel());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.LIZ.add(childViewHolderInt);
    }

    public final void LJIILLIIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.mInChangeScrap) {
            this.LIZIZ.remove(viewHolder);
        } else {
            this.LIZ.remove(viewHolder);
        }
        viewHolder.mScrapContainer = null;
        viewHolder.mInChangeScrap = false;
        viewHolder.clearReturnedFromScrapFlag();
    }

    public static void LJII(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                LJII((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            C786410Ut5.LJLZ(0, viewGroup);
            C786410Ut5.LJLZ(4, viewGroup);
        } else {
            int visibility = viewGroup.getVisibility();
            C786410Ut5.LJLZ(4, viewGroup);
            C786410Ut5.LJLZ(visibility, viewGroup);
        }
    }

    public final void LIZ(RecyclerView.ViewHolder viewHolder, boolean z) {
        C20094213jo c20094213jo;
        RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
        View view = viewHolder.itemView;
        C20094913jv c20094913jv = this.LJIIIIZZ.mAccessibilityDelegate;
        if (c20094913jv != null) {
            C20094613js c20094613js = c20094913jv.LIZIZ;
            if (c20094613js instanceof C20094613js) {
                c20094213jo = (C20094213jo) ((WeakHashMap) c20094613js.LIZIZ).remove(view);
            } else {
                c20094213jo = null;
            }
            q0.LJIJ(view, c20094213jo);
        }
        if (z) {
            InterfaceC21676819sU interfaceC21676819sU = this.LJIIIIZZ.mRecyclerListener;
            if (interfaceC21676819sU != null) {
                interfaceC21676819sU.LIZ(viewHolder);
            }
            int size = this.LJIIIIZZ.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC21676819sU) ListProtector.get(this.LJIIIIZZ.mRecyclerListeners, i)).LIZ(viewHolder);
            }
            AbstractC21673619ry abstractC21673619ry = this.LJIIIIZZ.mAdapter;
            if (abstractC21673619ry != null) {
                abstractC21673619ry.onViewRecycled(viewHolder);
            }
            RecyclerView recyclerView = this.LJIIIIZZ;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.LIZLLL(viewHolder);
            }
            boolean z2 = RecyclerView.sDebugAssertionsEnabled;
        }
        viewHolder.mBindingAdapter = null;
        viewHolder.mOwnerRecyclerView = null;
        LJFF().putRecycledView(viewHolder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0237, code lost:
    
        if (r26.LJIIIIZZ.mState.LJI == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02da, code lost:
    
        r15.mPosition = r6;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0350, code lost:
    
        if (r15.getItemId() != r26.LJIIIIZZ.mAdapter.getItemId(r15.mPosition)) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder LIZIZ(int r27, long r28) {
        /*
            Method dump skipped, instruction units count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21673319rv.LIZIZ(int, long):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public final void LIZJ(int i, View view) {
        RecyclerView.LayoutParams layoutParams;
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            int iFindPositionOffset = this.LJIIIIZZ.mAdapterHelper.findPositionOffset(i);
            if (iFindPositionOffset >= 0 && iFindPositionOffset < this.LJIIIIZZ.mAdapter.getItemCount()) {
                LJIILJJIL(childViewHolderInt, iFindPositionOffset, i, Long.MAX_VALUE);
                ViewGroup.LayoutParams layoutParams2 = childViewHolderInt.itemView.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams = (RecyclerView.LayoutParams) this.LJIIIIZZ.generateDefaultLayoutParams();
                    C786410Ut5.W5(childViewHolderInt.itemView, layoutParams);
                } else if (!this.LJIIIIZZ.checkLayoutParams(layoutParams2)) {
                    layoutParams = (RecyclerView.LayoutParams) this.LJIIIIZZ.generateLayoutParams(layoutParams2);
                    C786410Ut5.W5(childViewHolderInt.itemView, layoutParams);
                } else {
                    layoutParams = (RecyclerView.LayoutParams) layoutParams2;
                }
                boolean z = true;
                layoutParams.mInsetsDirty = true;
                layoutParams.mViewHolder = childViewHolderInt;
                if (childViewHolderInt.itemView.getParent() != null) {
                    z = false;
                }
                layoutParams.mPendingInvalidate = z;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Inconsistency detected. Invalid item position ");
            sbLIZ.append(i);
            sbLIZ.append("(offset:");
            sbLIZ.append(iFindPositionOffset);
            sbLIZ.append(").state:");
            sbLIZ.append(this.LJIIIIZZ.mState.LIZIZ());
            sbLIZ.append(this.LJIIIIZZ.exceptionLabel());
            throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
        sbLIZ2.append(this.LJIIIIZZ.exceptionLabel());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final RecyclerView.ViewHolder LJIILL(int i, long j) {
        if (C21677519sb.LIZ == null) {
            SettingsManager.LIZLLL().getClass();
            C21677519sb.LIZ = Boolean.valueOf(SettingsManager.LIZ("catch_tryGetViewHolderForPositionByDeadline_crash", false));
        }
        if (!C21677519sb.LIZ.booleanValue()) {
            return LIZIZ(i, j);
        }
        try {
            return LIZIZ(i, j);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuffer stringBuffer = new StringBuffer("tryGetViewHolderForPositionByDeadline crash hook, error: ");
            stringBuffer.append(Log.getStackTraceString(e));
            C20612085q.LIZIZ = stringBuffer.toString();
            return null;
        }
    }

    public final boolean LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i, int i2, long j) {
        viewHolder.mBindingAdapter = null;
        viewHolder.mOwnerRecyclerView = this.LJIIIIZZ;
        int itemViewType = viewHolder.getItemViewType();
        long nanoTime = this.LJIIIIZZ.getNanoTime();
        boolean z = false;
        if (j != Long.MAX_VALUE && !this.LJI.willBindInTime(itemViewType, nanoTime, j)) {
            return false;
        }
        if (viewHolder.isTmpDetached()) {
            RecyclerView recyclerView = this.LJIIIIZZ;
            recyclerView.attachViewToParent(viewHolder.itemView, recyclerView.getChildCount(), viewHolder.itemView.getLayoutParams());
            z = true;
        }
        this.LJIIIIZZ.mAdapter.bindViewHolder(viewHolder, i);
        if (z) {
            this.LJIIIIZZ.detachViewFromParent(viewHolder.itemView);
        }
        this.LJI.factorInBindTime(viewHolder.getItemViewType(), this.LJIIIIZZ.getNanoTime() - nanoTime);
        if (this.LJIIIIZZ.isAccessibilityEnabled()) {
            View view = viewHolder.itemView;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            C20094913jv c20094913jv = this.LJIIIIZZ.mAccessibilityDelegate;
            if (c20094913jv != null) {
                C20094613js c20094613js = c20094913jv.LIZIZ;
                if (c20094613js instanceof C20094613js) {
                    c20094613js.getClass();
                    C20094213jo c20094213joLJFF = q0.LJFF(view);
                    if (c20094213joLJFF != null && c20094213joLJFF != c20094613js) {
                        ((WeakHashMap) c20094613js.LIZIZ).put(view, c20094213joLJFF);
                    }
                }
                q0.LJIJ(view, c20094613js);
            }
        }
        if (this.LJIIIIZZ.mState.LJI) {
            viewHolder.mPreLayoutPosition = i2;
        }
        return true;
    }
}
