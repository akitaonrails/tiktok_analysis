package X;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08a0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2140208a0 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public final float LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", canvasWidthPx: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", micSeatWidthPx: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", micSeatHeightPx: ");
        sbLIZ.append(this.LIZIZ);
        C20441214yg.LIZIZ("MultiGuestAvatarSizeRestrictionHelper", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LIZ;
        int i2 = this.LIZIZ;
        if (i > i2) {
            i = i2;
        }
        float f = i * 0.5f;
        if (f > this.LJ * 0.22564103f) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("source: ");
            sbLIZ2.append(this.LIZLLL);
            sbLIZ2.append(", isBigAvatar == true");
            C20441214yg.LIZIZ("MultiGuestAvatarSizeRestrictionHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return this.LIZJ * 0.22564103f;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("source: ");
        sbLIZ3.append(this.LIZLLL);
        sbLIZ3.append(", isBigAvatar == false");
        C20441214yg.LIZIZ("MultiGuestAvatarSizeRestrictionHelper", C2188811AlT.LIZIZ(sbLIZ3));
        return f;
    }

    public /* synthetic */ C2140208a0(int i, int i2, int i3) {
        this(i, i2, i3, "");
    }

    public C2140208a0(int i, int i2, int i3, String str) {
        WindowManager windowManager;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = str;
        int iLJIIZILJ = C497740JfY.LJIIZILJ();
        int iLJIILLIIL = C497740JfY.LJIILLIIL();
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII != null) {
            try {
                Object objH2 = C786410Ut5.H2(contextLJII, "window");
                if ((objH2 instanceof WindowManager) && (windowManager = (WindowManager) objH2) != null) {
                    Point point = new Point();
                    C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EP7d5eT9CMuVsurmderxkYB4vSHGXuP7/HauVmGJBEammE26NxdCtH57s=", null)).getRealSize(point);
                    iLJIIZILJ = point.x;
                    iLJIILLIIL = point.y;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("MultiGuestAvatarSizeRestrictionHelper", String.valueOf(e.getMessage()));
            }
        }
        Pair pair = new Pair(Integer.valueOf(iLJIIZILJ), Integer.valueOf(iLJIILLIIL));
        int i4 = this.LIZJ;
        this.LJ = i4 <= 0 ? Math.min(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue()) : i4;
    }
}
