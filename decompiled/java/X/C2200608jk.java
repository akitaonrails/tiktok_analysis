package X;

import com.bytedance.pipo.stellar.base.model.prop.DialogContentDO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2200608jk extends AbstractC2201008jo {
    public final DialogContentDO LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2200608jk) && Intrinsics.LJFF(this.LIZ, ((C2200608jk) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowDialogAction(dialogContentDO=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2200608jk(DialogContentDO dialogContentDO) {
        this.LIZ = dialogContentDO;
    }
}
