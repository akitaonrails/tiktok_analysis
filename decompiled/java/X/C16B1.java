package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;

/* JADX INFO: renamed from: X.16B1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16B1 implements Runnable {
    public final View LL;
    public final int LLILLJJLI;
    public final /* synthetic */ ViewPagerBottomSheetBehavior LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ViewPagerBottomSheetBehavior$SettleRunnable@f57b.run");
        try {
            C21586019dq c21586019dq = this.LLILLL.LJIIJ;
            if (c21586019dq == null || !c21586019dq.LJIIIIZZ()) {
                this.LLILLL.setStateInternal(this.LLILLJJLI);
            } else {
                this.LL.postOnAnimation(this);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewPagerBottomSheetBehavior$SettleRunnable@f57b.run");
    }

    public C16B1(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, View view, int i) {
        this.LLILLL = viewPagerBottomSheetBehavior;
        this.LL = view;
        this.LLILLJJLI = i;
    }
}
