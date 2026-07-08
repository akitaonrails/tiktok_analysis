package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1223790hx3 extends AbstractC1223800hx4 {
    public final String LL;
    public final C1223780hx2 LLILLJJLI;
    public final Map<String, String> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1223790hx3)) {
            return false;
        }
        C1223790hx3 c1223790hx3 = (C1223790hx3) obj;
        return Intrinsics.LJFF(this.LL, c1223790hx3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1223790hx3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1223790hx3.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1223780hx2 c1223780hx2 = this.LLILLJJLI;
        return ((iHashCode + (c1223780hx2 == null ? 0 : c1223780hx2.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorListIndexItem(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", extMap=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1223790hx3(String str, C1223780hx2 c1223780hx2, int i) {
        this(str, (i & 2) != 0 ? null : c1223780hx2, (Map<String, String>) ((i & 4) != 0 ? C2097608Jq.LJ() : null));
    }

    public C1223790hx3(String str, C1223780hx2 c1223780hx2, Map<String, String> map) {
        this.LL = str;
        this.LLILLJJLI = c1223780hx2;
        this.LLILLL = map;
    }
}
