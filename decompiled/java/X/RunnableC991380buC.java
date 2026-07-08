package X;

import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;

/* JADX INFO: renamed from: X.0buC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class RunnableC991380buC implements Runnable {
    public final /* synthetic */ VerticalViewPager LL;

    public final void LIZ() {
        this.LL.setScrollState(0);
        VerticalViewPager verticalViewPager = this.LL;
        if (verticalViewPager.LLLLLLLZIL > 0) {
            VerticalViewPager verticalViewPager2 = this.LL;
            HandlerHook.viewPostDelay(verticalViewPager2, verticalViewPager2.LLLZZIL, verticalViewPager2.LLLLLLLZIL);
        } else if (verticalViewPager.LLLLLZL) {
            int i = C2504109rb.LIZJ;
            if (i < 0 || (i <= 30000 && i <= 0)) {
                verticalViewPager.LJJIIZ();
            } else {
                HandlerHook.viewRemoveCallbacks(verticalViewPager, verticalViewPager.LLZ);
                VerticalViewPager verticalViewPager3 = this.LL;
                HandlerHook.viewPostDelay(verticalViewPager3, verticalViewPager3.LLZ, i >= 0 ? i > 30000 ? 30000 : i : 0);
            }
        } else {
            verticalViewPager.LJJIII();
        }
        this.LL.getClass();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VerticalViewPager@894f.<field>$6");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VerticalViewPager@894f.<field>$6");
    }

    public RunnableC991380buC(VerticalViewPager verticalViewPager) {
        this.LL = verticalViewPager;
    }
}
