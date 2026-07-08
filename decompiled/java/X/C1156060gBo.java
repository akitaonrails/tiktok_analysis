package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156060gBo implements InterfaceC2753014t {
    public final String LL;
    public final List<String> LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156060gBo)) {
            return false;
        }
        C1156060gBo c1156060gBo = (C1156060gBo) obj;
        return Intrinsics.LJFF(this.LL, c1156060gBo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1156060gBo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1156060gBo.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        List<String> list = this.LLILLJJLI;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UGADSDeeplinkParamProperty(awemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", awemeIdList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156060gBo(String str, List<String> list, String str2) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = str2;
    }
}
