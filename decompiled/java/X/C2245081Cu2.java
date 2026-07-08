package X;

import com.ss.android.ugc.aweme.minis.model.payment.coupon.ACAConfig;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.QCPXConfig;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckQcpxResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Cu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245081Cu2 implements InterfaceC0148002o {
    public final QCPXConfig LL;
    public final ACAConfig LLILLJJLI;
    public final TiktokMinisMonetizationCheckQcpxResponse LLILLL;

    public C2245081Cu2() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2245081Cu2)) {
            return false;
        }
        C2245081Cu2 c2245081Cu2 = (C2245081Cu2) obj;
        return Intrinsics.LJFF(this.LL, c2245081Cu2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2245081Cu2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2245081Cu2.LLILLL);
    }

    public final int hashCode() {
        QCPXConfig qCPXConfig = this.LL;
        int iHashCode = (qCPXConfig == null ? 0 : qCPXConfig.hashCode()) * 31;
        ACAConfig aCAConfig = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (aCAConfig == null ? 0 : aCAConfig.hashCode())) * 31;
        TiktokMinisMonetizationCheckQcpxResponse tiktokMinisMonetizationCheckQcpxResponse = this.LLILLL;
        return iHashCode2 + (tiktokMinisMonetizationCheckQcpxResponse != null ? tiktokMinisMonetizationCheckQcpxResponse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisCouponState(QCPXConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ACAConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", QCPXData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2245081Cu2(QCPXConfig qCPXConfig, ACAConfig aCAConfig, TiktokMinisMonetizationCheckQcpxResponse tiktokMinisMonetizationCheckQcpxResponse) {
        this.LL = qCPXConfig;
        this.LLILLJJLI = aCAConfig;
        this.LLILLL = tiktokMinisMonetizationCheckQcpxResponse;
    }
}
