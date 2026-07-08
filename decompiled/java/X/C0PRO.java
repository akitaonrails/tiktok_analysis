package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PRO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRO implements C0PWT {
    public static final /* synthetic */ int LLILZ = 0;
    public final C0PRM LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PRO)) {
            return false;
        }
        C0PRO c0pro = (C0PRO) obj;
        return this.LL == c0pro.LL && Intrinsics.LJFF(this.LLILLJJLI, c0pro.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0pro.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualSearchActivateSearchResultAction(transition=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newSearchId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", searchType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().CV0().LIZIZ(C13LE.LIZ(C0PRO.class), AFwS293S0000000_10.get$arr$(84));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C0PRO(C0PRM c0prm) {
        this(c0prm, null, "visual");
    }

    public C0PRO(C0PRM c0prm, String str, String str2) {
        this.LL = c0prm;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
