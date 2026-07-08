package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZI implements InterfaceC2753014t {
    public final String LL = null;
    public final Map<String, String> LLILLJJLI = null;
    public final String LLILLL = "LiveHomePageMobParam";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07ZI)) {
            return false;
        }
        C07ZI c07zi = (C07ZI) obj;
        return Intrinsics.LJFF(this.LL, c07zi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c07zi.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c07zi.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.LLILLJJLI;
        return ((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveHomePageMobParam(liveTabStyle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", extraParam=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
