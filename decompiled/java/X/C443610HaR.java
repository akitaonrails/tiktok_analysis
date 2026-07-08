package X;

import android.view.View;
import com.bytedance.pipo.stellar.base.model.StellarTooltipDO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443610HaR {
    public final StellarTooltipDO LIZ;
    public final View LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C443610HaR)) {
            return false;
        }
        C443610HaR c443610HaR = (C443610HaR) obj;
        return Intrinsics.LJFF(this.LIZ, c443610HaR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c443610HaR.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        View view = this.LIZIZ;
        return iHashCode + (view == null ? 0 : view.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowTooltipActionWrapper(tooltipContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchorView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C443610HaR(StellarTooltipDO stellarTooltipDO, View view) {
        this.LIZ = stellarTooltipDO;
        this.LIZIZ = view;
    }
}
