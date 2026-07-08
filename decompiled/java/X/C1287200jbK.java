package X;

import android.view.Surface;
import android.view.SurfaceControl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287200jbK extends AbstractC1284860jXY {
    public volatile C1287220jbM LIZIZ;

    @Override // X.InterfaceC1472350oPx
    public final void destroy() {
        C1287220jbM c1287220jbM;
        try {
            if (((Boolean) C1474810oTv.w5.getValue()).booleanValue() && (c1287220jbM = this.LIZIZ) != null) {
                c1287220jbM.LIZ();
            }
            this.LIZIZ = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ = null;
            throw th;
        }
    }

    @Override // X.InterfaceC1472350oPx
    public final Surface LIZJ() {
        C1472250oPn c1472250oPn;
        C1472150oPd c1472150oPd;
        C1287220jbM c1287220jbM = this.LIZIZ;
        if (c1287220jbM == null || (c1472250oPn = c1287220jbM.LIZ.get()) == null || (c1472150oPd = c1472250oPn.LLILZIL) == null) {
            return null;
        }
        return c1472150oPd.LJJLIIIJJI();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerCoreSurfaceControlSession. coreSurfaceControlCallback:");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1472350oPx
    public final void LIZIZ(SurfaceControl surfaceControl, Integer num, Integer num2) {
        int iIntValue;
        C1472150oPd c1472150oPd;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parentSurfaceControl:");
            sbLIZ.append(surfaceControl);
            sbLIZ.append(", width:");
            sbLIZ.append(num);
            sbLIZ.append(", height:");
            sbLIZ.append(num2);
            sbLIZ.append(", this:");
            sbLIZ.append(this);
            C1481110oe5.LIZIZ("PlayerCoreSurfaceControlSession", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1287220jbM c1287220jbM = this.LIZIZ;
        if (c1287220jbM != null) {
            int iIntValue2 = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            C1472250oPn c1472250oPn = c1287220jbM.LIZ.get();
            if (c1472250oPn != null && (c1472150oPd = c1472250oPn.LLILZIL) != null) {
                c1472150oPd.LLIIJLIL(surfaceControl, iIntValue, iIntValue2);
            }
        }
    }
}
