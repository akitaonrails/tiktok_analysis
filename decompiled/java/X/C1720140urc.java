package X;

import com.bytedance.pipo.stellar.base.model.StellarTooltipDO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0urc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720140urc extends AbstractC2201008jo {
    public final StellarTooltipDO LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1720140urc) && Intrinsics.LJFF(this.LIZ, ((C1720140urc) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowTooltipAction(tooltipContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1720140urc(StellarTooltipDO stellarTooltipDO) {
        this.LIZ = stellarTooltipDO;
    }
}
