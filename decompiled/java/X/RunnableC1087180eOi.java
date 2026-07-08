package X;

import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0eOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class RunnableC1087180eOi implements Runnable {
    public final /* synthetic */ C1107270ev7 LL;

    public RunnableC1087180eOi(C1107270ev7 c1107270ev7) {
        this.LL = c1107270ev7;
    }

    public final void LIZ() {
        C16F5 c16f5;
        C1324720kZq c1324720kZq;
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1107270ev7 c1107270ev7 = this.LL;
        C16F5 c16f52 = c1107270ev7.LLJ;
        if (c16f52 == null || (c16f5 = c1107270ev7.LLJJIJIIJIL) == null || (c1324720kZq = c1107270ev7.LLJJJ) == null || (viewGroup = c1107270ev7.LLJJJJ) == null || c16f5.getVisibility() != 0) {
            return;
        }
        if (c16f5.getTop() - c16f52.getBottom() <= ((int) C497740JfY.LIZIZ(2))) {
            float f = 74;
            int iLIZIZ = (int) C497740JfY.LIZIZ(f);
            int iLIZIZ2 = (int) C497740JfY.LIZIZ(f);
            ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iLIZIZ;
                layoutParams.width = iLIZIZ2;
                C786410Ut5.u6(c1324720kZq, layoutParams);
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                return;
            }
            marginLayoutParams.height = iLIZIZ;
            marginLayoutParams.bottomMargin = (int) C497740JfY.LIZIZ(8.0f);
            C786410Ut5.X5(marginLayoutParams, viewGroup);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PcsNativePinCardViewV2@1d5d.adjustMainImageHeightIfNeeded$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PcsNativePinCardViewV2@1d5d.adjustMainImageHeightIfNeeded$1");
    }
}
