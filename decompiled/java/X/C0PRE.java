package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PRE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRE implements C0PWT {
    public static final /* synthetic */ int LLILLL = 0;
    public final C0PRL LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PRE)) {
            return false;
        }
        C0PRE c0pre = (C0PRE) obj;
        return this.LL == c0pre.LL && Intrinsics.LJFF(this.LLILLJJLI, c0pre.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchIdLifecycleAction(transition=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newSearchId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().cp2().LIZIZ(C13LE.LIZ(C0PRE.class), AFwS293S0000000_10.get$arr$(110));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PRE(C0PRL c0prl, String str) {
        this.LL = c0prl;
        this.LLILLJJLI = str;
    }
}
