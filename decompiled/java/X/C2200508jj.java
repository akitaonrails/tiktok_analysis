package X;

import com.bytedance.pipo.stellar.base.model.prop.ToastContentDO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2200508jj extends AbstractC2201008jo {
    public final ToastContentDO LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2200508jj) && Intrinsics.LJFF(this.LIZ, ((C2200508jj) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowToastAction(toastContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2200508jj(ToastContentDO toastContentDO) {
        this.LIZ = toastContentDO;
    }
}
