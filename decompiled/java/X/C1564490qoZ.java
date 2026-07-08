package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qoZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564490qoZ implements InterfaceC111300bX {
    public final Map<String, String> LL;
    public final C1564500qoa LLILLJJLI;

    public C1564490qoZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1564490qoZ)) {
            return false;
        }
        C1564490qoZ c1564490qoZ = (C1564490qoZ) obj;
        return Intrinsics.LJFF(this.LL, c1564490qoZ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1564490qoZ.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedSkylightHierarchyData(extras=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1564490qoZ(int i) {
        Map mapLJ = C2097608Jq.LJ();
        C1564510qob c1564510qob = new C1564510qob();
        C1564500qoa c1564500qoa = c1564510qob.LIZ;
        c1564500qoa.LJFF = -1;
        c1564500qoa.LJ = C13LQ.LJJLL(new InterfaceC1564580qoi[0]);
        this(mapLJ, c1564510qob.LIZ);
    }

    public C1564490qoZ(Map<String, String> map, C1564500qoa c1564500qoa) {
        this.LL = map;
        this.LLILLJJLI = c1564500qoa;
    }
}
