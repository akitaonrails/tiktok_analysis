package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0Sni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC732120Sni implements Runnable {
    public final /* synthetic */ C732130Snj LL;

    public RunnableC732120Sni(C732130Snj c732130Snj) {
        this.LL = c732130Snj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ShareViewScaleHelper@5301.extendHotArea$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareViewScaleHelper@5301.extendHotArea$1");
    }

    public final void LIZ() {
        ViewGroup.LayoutParams layoutParams;
        int i;
        View view;
        ViewGroup.LayoutParams layoutParams2;
        int iLIZJ = C20586815h4.LIZJ();
        View view2 = this.LL.LIZLLL;
        if (view2 == null || (layoutParams = view2.getLayoutParams()) == null || (i = layoutParams.width) <= 0 || iLIZJ <= -1) {
            return;
        }
        int iLIZIZ = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZJ)));
        View view3 = this.LL.LIZJ;
        if ((view3 == null || (layoutParams2 = view3.getLayoutParams()) == null || layoutParams2.width != iLIZIZ) && (view = this.LL.LIZJ) != null) {
            C1744700vVE.LJIIL(view, iLIZIZ);
        }
    }
}
