package X;

import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: renamed from: X.0alM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947460alM {
    public final FrameLayout LIZ;
    public final RectF LIZIZ;
    public final List<C957020b0m> LIZJ;
    public final List<C942090ach> LIZLLL;
    public final List<C957020b0m> LJ;
    public final C955300ay0 LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalLinkMicLayoutDiffInfo(layoutContainerView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutContainerViewRect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", newWindowsInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", updatedWindowsInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", removedWindowsInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", layoutExtra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C947460alM(FrameLayout frameLayout, RectF rectF, List<C957020b0m> list, List<C942090ach> list2, List<C957020b0m> list3, C955300ay0 c955300ay0) {
        this.LIZ = frameLayout;
        this.LIZIZ = rectF;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = list3;
        this.LJFF = c955300ay0;
    }
}
