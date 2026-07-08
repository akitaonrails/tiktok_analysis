package X;

import com.ss.android.ugc.aweme.mix.api.response.CheckPlayResponse;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169480gXS implements InterfaceC0148002o {
    public final AbstractC1623806Xk<CheckPlayResponse> LL;
    public final AbstractC1623806Xk<ManageResponse> LLILLJJLI;

    public C1169480gXS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1169480gXS)) {
            return false;
        }
        C1169480gXS c1169480gXS = (C1169480gXS) obj;
        return Intrinsics.LJFF(this.LL, c1169480gXS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1169480gXS.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditNameState(checkNameRequest=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", changeNameRequest=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1169480gXS(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh);
    }

    public C1169480gXS(AbstractC1623806Xk<CheckPlayResponse> abstractC1623806Xk, AbstractC1623806Xk<ManageResponse> abstractC1623806Xk2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
    }

    public static C1169480gXS LIZ(C1169480gXS c1169480gXS, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1169480gXS.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c1169480gXS.LLILLJJLI;
        }
        c1169480gXS.getClass();
        return new C1169480gXS(abstractC1623806Xk, abstractC1623806Xk2);
    }
}
