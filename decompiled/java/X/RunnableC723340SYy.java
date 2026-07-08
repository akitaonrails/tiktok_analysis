package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0SYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC723340SYy implements Runnable {
    public final /* synthetic */ C0SZ0 LL;

    public RunnableC723340SYy(C0SZ0 c0sz0) {
        this.LL = c0sz0;
    }

    public final void LIZ() {
        ViewGroup.LayoutParams layoutParams;
        int i;
        View view;
        ViewGroup.LayoutParams layoutParams2;
        View view2 = this.LL.LIZJ;
        C708910RrN c708910RrN = view2 instanceof C708910RrN ? (C708910RrN) view2 : null;
        if (c708910RrN != null) {
            c708910RrN.setGroupClickable(false);
        }
        int iLIZJ = C20586815h4.LIZJ();
        View view3 = this.LL.LIZLLL;
        if (view3 == null || (layoutParams = view3.getLayoutParams()) == null || (i = layoutParams.width) <= 0 || iLIZJ <= -1) {
            return;
        }
        int iLIZIZ = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZJ)));
        View view4 = this.LL.LIZJ;
        if ((view4 == null || (layoutParams2 = view4.getLayoutParams()) == null || layoutParams2.width != iLIZIZ) && (view = this.LL.LIZJ) != null) {
            C1744700vVE.LJIIL(view, iLIZIZ);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AvatarViewScaleHelper@d879.extendHotArea$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvatarViewScaleHelper@d879.extendHotArea$1");
    }
}
