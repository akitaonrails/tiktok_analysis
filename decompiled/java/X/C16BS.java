package X;

import android.view.View;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;

/* JADX INFO: renamed from: X.16BS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16BS implements Runnable {
    public final View LL;
    public final int LLILLJJLI;
    public final /* synthetic */ ViewPagerBottomSheetBehavior LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ViewPagerBottomSheetBehavior$SettleRunnable@3032.run");
        try {
            C21586019dq c21586019dq = this.LLILLL.mViewDragHelper;
            if (c21586019dq == null || !c21586019dq.LJIIIIZZ()) {
                this.LLILLL.setStateInternal(this.LLILLJJLI);
            } else {
                this.LL.postOnAnimation(this);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewPagerBottomSheetBehavior$SettleRunnable@3032.run");
    }

    public C16BS(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, View view, int i) {
        this.LLILLL = viewPagerBottomSheetBehavior;
        this.LL = view;
        this.LLILLJJLI = i;
    }
}
