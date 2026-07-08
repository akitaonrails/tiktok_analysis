package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodModule;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C719702rT extends AbstractC756202xM {
    public final SnsDisplayInfo LLILZLL;
    public final SnsInfo LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C719702rT)) {
            return false;
        }
        C719702rT c719702rT = (C719702rT) obj;
        return Intrinsics.LJFF(this.LLILZLL, c719702rT.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c719702rT.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c719702rT.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c719702rT.LLJ);
    }

    public final int hashCode() {
        int iHashCode = this.LLILZLL.hashCode() * 31;
        SnsInfo snsInfo = this.LLIZ;
        int iHashCode2 = (iHashCode + (snsInfo == null ? 0 : snsInfo.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJ;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OneStepSnsVO(snsDisplayInfo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", snsInfo=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SnsPeriodInfo LIZIZ() {
        List<SnsPeriodInfo> list;
        SnsPeriodModule snsPeriodModule = this.LLILZLL.snsPeriodModule;
        SnsPeriodInfo snsPeriodInfo = null;
        if (snsPeriodModule == null || (list = snsPeriodModule.snsPeriodInfoList) == null) {
            return null;
        }
        Iterator<SnsPeriodInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SnsPeriodInfo next = it2.next();
            if (Intrinsics.LJFF(next.isSelect, Boolean.TRUE)) {
                snsPeriodInfo = next;
                break;
            }
        }
        return snsPeriodInfo;
    }

    public final boolean LIZLLL() {
        List<SnsPeriodInfo> list;
        SnsInfo snsInfo = this.LLIZ;
        if (!(snsInfo != null ? Intrinsics.LJFF(snsInfo.isSubscribed, Boolean.TRUE) : false)) {
            SnsPeriodModule snsPeriodModule = this.LLILZLL.snsPeriodModule;
            if (snsPeriodModule == null || (list = snsPeriodModule.snsPeriodInfoList) == null || list.isEmpty()) {
                return false;
            }
            Iterator<SnsPeriodInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().isSelect, Boolean.TRUE)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C719702rT;
    }

    public C719702rT(SnsDisplayInfo snsDisplayInfo, SnsInfo snsInfo, String str, String str2) {
        this.LLILZLL = snsDisplayInfo;
        this.LLIZ = snsInfo;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
    }
}
