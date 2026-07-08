package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0Dcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC343190Dcr implements Runnable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ View LLILZ;

    public /* synthetic */ RunnableC343190Dcr(int i, View view, View view2, View view3) {
        this.LL = i;
        this.LLILLJJLI = view;
        this.LLILLL = view2;
        this.LLILZ = view3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.LL;
        View view = this.LLILLJJLI;
        View view2 = this.LLILLL;
        View view3 = this.LLILZ;
        C1C7U.LIZ("AdaptationManager@dcfd.doAdaptation4BottomTab$1L");
        int iLIZ = C418440Gaw.LIZ(Integer.valueOf(C14LC.LJIILIIL));
        if (i == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.bottomMargin != iLIZ) {
                layoutParams.bottomMargin = iLIZ;
                C786410Ut5.W5(view, layoutParams);
            }
        }
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2.height != iLIZ) {
                layoutParams2.height = iLIZ;
                C786410Ut5.W5(view2, layoutParams2);
            }
        }
        if (view3 != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
            if (layoutParams3.height != iLIZ) {
                layoutParams3.height = iLIZ;
                layoutParams3.topMargin = -iLIZ;
                C786410Ut5.W5(view3, layoutParams3);
            }
        }
        C1C7U.LIZIZ("AdaptationManager@dcfd.doAdaptation4BottomTab$1L");
    }
}
