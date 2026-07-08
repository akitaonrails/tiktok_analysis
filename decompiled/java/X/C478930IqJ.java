package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478930IqJ {
    public final TabMGTopLive LIZ;
    public final long LIZIZ;
    public boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C478930IqJ)) {
            return false;
        }
        C478930IqJ c478930IqJ = (C478930IqJ) obj;
        return Intrinsics.LJFF(this.LIZ, c478930IqJ.LIZ) && this.LIZIZ == c478930IqJ.LIZIZ && this.LIZJ == c478930IqJ.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedTopModuleData(topModuleData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isExpired=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C478930IqJ(TabMGTopLive tabMGTopLive, long j) {
        this.LIZ = tabMGTopLive;
        this.LIZIZ = j;
    }
}
