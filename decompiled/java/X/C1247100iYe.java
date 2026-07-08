package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247100iYe implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Boolean> LL;
    public final String LLILLJJLI;
    public final C1247250iYt LLILLL;

    public C1247100iYe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1247100iYe)) {
            return false;
        }
        C1247100iYe c1247100iYe = (C1247100iYe) obj;
        return Intrinsics.LJFF(this.LL, c1247100iYe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1247100iYe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1247100iYe.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1247250iYt c1247250iYt = this.LLILLL;
        return iHashCode2 + (c1247250iYt != null ? c1247250iYt.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationSearchState(requestState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", removedFollowerUid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", localSearchResultData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1247100iYe(int i) {
        this(C491101vh.LIZ, null, null);
    }

    public C1247100iYe(AbstractC1623806Xk<Boolean> abstractC1623806Xk, String str, C1247250iYt c1247250iYt) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = str;
        this.LLILLL = c1247250iYt;
    }

    public static C1247100iYe LIZ(C1247100iYe c1247100iYe, AbstractC1623806Xk abstractC1623806Xk, String str, C1247250iYt c1247250iYt, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1247100iYe.LL;
        }
        if ((i & 2) != 0) {
            str = c1247100iYe.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1247250iYt = c1247100iYe.LLILLL;
        }
        c1247100iYe.getClass();
        return new C1247100iYe(abstractC1623806Xk, str, c1247250iYt);
    }
}
