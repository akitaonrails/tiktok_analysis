package X;

import com.bytedance.android.livesdk.wallet.NoticesResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556790qc9 implements InterfaceC0148002o {
    public final AbstractC1556600qbq LL;
    public final AbstractC1556810qcB LLILLJJLI;
    public final List<NoticesResult.Notice> LLILLL;

    public C1556790qc9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556790qc9)) {
            return false;
        }
        C1556790qc9 c1556790qc9 = (C1556790qc9) obj;
        return Intrinsics.LJFF(this.LL, c1556790qc9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1556790qc9.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1556790qc9.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargePanelHeaderState(titleBar=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", notice=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", supplementaryNotices=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556790qc9(int i) {
        this(C1556610qbr.LIZ, C1556800qcA.LIZ, C13BV.INSTANCE);
    }

    public C1556790qc9(AbstractC1556600qbq abstractC1556600qbq, AbstractC1556810qcB abstractC1556810qcB, List<NoticesResult.Notice> list) {
        this.LL = abstractC1556600qbq;
        this.LLILLJJLI = abstractC1556810qcB;
        this.LLILLL = list;
    }

    public static C1556790qc9 LIZ(C1556790qc9 c1556790qc9, C1556590qbp c1556590qbp, AbstractC1556810qcB abstractC1556810qcB, List list, int i) {
        AbstractC1556600qbq abstractC1556600qbq = c1556590qbp;
        if ((i & 1) != 0) {
            abstractC1556600qbq = c1556790qc9.LL;
        }
        if ((i & 2) != 0) {
            abstractC1556810qcB = c1556790qc9.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list = c1556790qc9.LLILLL;
        }
        c1556790qc9.getClass();
        return new C1556790qc9(abstractC1556600qbq, abstractC1556810qcB, list);
    }
}
