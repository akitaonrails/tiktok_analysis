package X;

import android.view.View;
import com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior;

/* JADX INFO: renamed from: X.16Be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class RunnableC20733216Be implements Runnable {
    public final View LL;
    public final int LLILLJJLI;
    public final /* synthetic */ SearchBottomSheetBehavior LLILLL;

    public final void LIZ() {
        C21586019dq c21586019dq = this.LLILLL.LJIILL;
        if (c21586019dq == null || !c21586019dq.LJIIIIZZ()) {
            this.LLILLL.setStateInternal(this.LLILLJJLI);
            return;
        }
        this.LL.postOnAnimation(this);
        if (this.LLILLJJLI == 4) {
            int top = this.LL.getTop();
            SearchBottomSheetBehavior searchBottomSheetBehavior = this.LLILLL;
            if (top != searchBottomSheetBehavior.LJI || searchBottomSheetBehavior.LJIIJJI) {
                return;
            }
            searchBottomSheetBehavior.LJIIJJI = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SearchBottomSheetBehavior$SettleRunnable@13ec.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchBottomSheetBehavior$SettleRunnable@13ec.run");
    }

    public RunnableC20733216Be(SearchBottomSheetBehavior searchBottomSheetBehavior, View view, int i) {
        this.LLILLL = searchBottomSheetBehavior;
        this.LL = view;
        this.LLILLJJLI = i;
    }
}
