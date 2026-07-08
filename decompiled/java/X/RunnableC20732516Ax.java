package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;

/* JADX INFO: renamed from: X.16Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class RunnableC20732516Ax implements Runnable {
    public final View LL;
    public final int LLILLJJLI;
    public final /* synthetic */ ViewPagerBottomSheetBehavior LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ViewPagerBottomSheetBehavior$SettleRunnable@4899.run");
        try {
            C21586019dq c21586019dq = this.LLILLL.LJIIIZ;
            if (c21586019dq == null || !c21586019dq.LJIIIIZZ()) {
                this.LLILLL.setStateInternal(this.LLILLJJLI);
            } else {
                this.LL.postOnAnimation(this);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewPagerBottomSheetBehavior$SettleRunnable@4899.run");
    }

    public RunnableC20732516Ax(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, View view, int i) {
        this.LLILLL = viewPagerBottomSheetBehavior;
        this.LL = view;
        this.LLILLJJLI = i;
    }
}
