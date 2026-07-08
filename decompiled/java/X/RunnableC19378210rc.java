package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.10rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19378210rc implements Runnable {
    public final /* synthetic */ C1A9R LL;

    public RunnableC19378210rc(C1A9R c1a9r) {
        this.LL = c1a9r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MusicCoverViewScaleHelper@7774.extendHotArea$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicCoverViewScaleHelper@7774.extendHotArea$1");
    }

    public final void LIZ() {
        ViewGroup.LayoutParams layoutParams;
        int i;
        View view;
        ViewGroup.LayoutParams layoutParams2;
        int iLIZJ = C20586815h4.LIZJ();
        View view2 = this.LL.LJ;
        if (view2 == null || (layoutParams = view2.getLayoutParams()) == null || (i = layoutParams.width) <= 0 || iLIZJ <= -1) {
            return;
        }
        int iLIZIZ = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZJ)));
        View view3 = this.LL.LJIILIIL;
        if ((view3 == null || (layoutParams2 = view3.getLayoutParams()) == null || layoutParams2.width != iLIZIZ) && (view = this.LL.LJIILIIL) != null) {
            C1744700vVE.LJIIL(view, iLIZIZ);
        }
    }
}
