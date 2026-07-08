package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903370ZcF implements InterfaceC0148002o {
    public final AbstractC903430ZcL LL;
    public final C903380ZcG LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C903370ZcF)) {
            return false;
        }
        C903370ZcF c903370ZcF = (C903370ZcF) obj;
        return Intrinsics.LJFF(this.LL, c903370ZcF.LL) && Intrinsics.LJFF(this.LLILLJJLI, c903370ZcF.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C903380ZcG c903380ZcG = this.LLILLJJLI;
        return iHashCode + (c903380ZcG == null ? 0 : c903380ZcG.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizCompTranslationUiState(state=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bizCompData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C903370ZcF(AbstractC903430ZcL abstractC903430ZcL, C903380ZcG c903380ZcG) {
        this.LL = abstractC903430ZcL;
        this.LLILLJJLI = c903380ZcG;
    }

    public static C903370ZcF LIZ(C903370ZcF c903370ZcF, AbstractC903430ZcL abstractC903430ZcL, C903380ZcG c903380ZcG, int i) {
        if ((i & 1) != 0) {
            abstractC903430ZcL = c903370ZcF.LL;
        }
        if ((i & 2) != 0) {
            c903380ZcG = c903370ZcF.LLILLJJLI;
        }
        c903370ZcF.getClass();
        return new C903370ZcF(abstractC903430ZcL, c903380ZcG);
    }
}
