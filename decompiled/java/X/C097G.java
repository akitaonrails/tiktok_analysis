package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.097G, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C097G extends AbstractC764660Tz6 {
    public final List<C763870Txp> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C097G) && Intrinsics.LJFF(this.LIZ, ((C097G) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateTabList(tabs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C097G(List<C763870Txp> list) {
        this.LIZ = list;
    }
}
