package X;

import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: renamed from: X.0alN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947470alN {
    public final String LIZ;
    public final FrameLayout LIZIZ;
    public final RectF LIZJ;
    public final List<C957020b0m> LIZLLL;
    public final C955300ay0 LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalLinkMicLayoutRenderInfo(layoutKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutContainerView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", layoutContainerViewRect=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", windowsViews=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", layoutExtra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C947470alN(String str, FrameLayout frameLayout, RectF rectF, List<C957020b0m> list, C955300ay0 c955300ay0) {
        this.LIZ = str;
        this.LIZIZ = frameLayout;
        this.LIZJ = rectF;
        this.LIZLLL = list;
        this.LJ = c955300ay0;
    }
}
