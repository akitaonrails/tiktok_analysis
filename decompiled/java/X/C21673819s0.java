package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19s0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21673819s0 implements InterfaceC21677219sY {
    public int LIZ;
    public int LIZIZ;
    public int[] LIZJ;
    public int LIZLLL;

    public final void LIZ(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = this.LIZLLL * 2;
                int[] iArr = this.LIZJ;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.LIZJ = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.LIZJ = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.LIZJ;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.LIZLLL++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public final void LIZIZ(RecyclerView recyclerView, boolean z) {
        this.LIZLLL = 0;
        int[] iArr = this.LIZJ;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
        if (recyclerView.mAdapter != null && layoutManager != null && layoutManager.isItemPrefetchEnabled()) {
            if (z) {
                if (!recyclerView.mAdapterHelper.hasPendingUpdates()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.LIZ, this.LIZIZ, recyclerView.mState, this);
            }
            int i = this.LIZLLL;
            if (i > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = i;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.LJIIZILJ();
            }
        }
    }
}
