package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04C0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04C0 {
    public final List<C1063004Ds> LIZ;

    public C04C0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C04C0) && Intrinsics.LJFF(this.LIZ, ((C04C0) obj).LIZ);
    }

    public final int hashCode() {
        List<C1063004Ds> list = this.LIZ;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarVO(buttons=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C04C0(List<C1063004Ds> list) {
        this.LIZ = list;
    }
}
