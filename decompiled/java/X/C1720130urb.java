package X;

import com.bytedance.pipo.stellar.base.model.ActionSheetDO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0urb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720130urb extends AbstractC2201008jo {
    public final ActionSheetDO LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1720130urb) && Intrinsics.LJFF(this.LIZ, ((C1720130urb) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowActionSheetAction(sheetContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1720130urb(ActionSheetDO actionSheetDO) {
        this.LIZ = actionSheetDO;
    }
}
