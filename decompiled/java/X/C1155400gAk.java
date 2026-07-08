package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155400gAk implements InterfaceC0148002o {
    public static final /* synthetic */ int LLILLL = 0;
    public final Map<String, Boolean> LL;
    public final List<C20041213bG> LLILLJJLI;

    public C1155400gAk() {
        this((List) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155400gAk)) {
            return false;
        }
        C1155400gAk c1155400gAk = (C1155400gAk) obj;
        return Intrinsics.LJFF(this.LL, c1155400gAk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1155400gAk.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSettingsState(switchStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", operationDataList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1155400gAk(List list, int i) {
        Map mapLJ;
        if ((i & 1) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        this((Map<String, Boolean>) mapLJ, (List<C20041213bG>) ((i & 2) != 0 ? C13BV.INSTANCE : list));
    }

    public C1155400gAk(Map<String, Boolean> map, List<C20041213bG> list) {
        this.LL = map;
        this.LLILLJJLI = list;
    }
}
