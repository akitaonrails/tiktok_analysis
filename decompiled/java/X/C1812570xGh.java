package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812570xGh extends AbstractC1812590xGj {
    public List<C1812850xH9> LLILLJJLI;
    public EnumC1812620xGm LLILLL;
    public C1778310wNR LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1812570xGh)) {
            return false;
        }
        C1812570xGh c1812570xGh = (C1812570xGh) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c1812570xGh.LLILLJJLI) && this.LLILLL == c1812570xGh.LLILLL && Intrinsics.LJFF(this.LLILZ, c1812570xGh.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode()) * 31;
        C1778310wNR c1778310wNR = this.LLILZ;
        return iHashCode + (c1778310wNR == null ? 0 : c1778310wNR.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiSummaryImageCellItem(items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadingState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", initParams=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812570xGh(List<C1812850xH9> list, EnumC1812620xGm enumC1812620xGm, C1778310wNR c1778310wNR) {
        super(list);
        this.LLILLJJLI = list;
        this.LLILLL = enumC1812620xGm;
        this.LLILZ = c1778310wNR;
    }
}
