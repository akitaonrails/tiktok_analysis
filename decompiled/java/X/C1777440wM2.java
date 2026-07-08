package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wM2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777440wM2 {
    public final Diamond LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final C1776960wLG LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777440wM2)) {
            return false;
        }
        C1777440wM2 c1777440wM2 = (C1777440wM2) obj;
        return Intrinsics.LJFF(this.LIZ, c1777440wM2.LIZ) && this.LIZIZ == c1777440wM2.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1777440wM2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1777440wM2.LIZLLL) && this.LJ == c1777440wM2.LJ && Intrinsics.LJFF(this.LJFF, c1777440wM2.LJFF);
    }

    public final int hashCode() {
        Diamond diamond = this.LIZ;
        int iHashCode = (((((diamond == null ? 0 : diamond.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        C1776960wLG c1776960wLG = this.LJFF;
        return iHashCode2 + (c1776960wLG != null ? c1776960wLG.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateOrderV3Result(diamond=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", chargeSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", orderData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", eventData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isSupportRetentionPopup=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", doRechargeArgumentsV3=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777440wM2(Diamond diamond, int i, String str, String str2, boolean z, C1776960wLG c1776960wLG) {
        this.LIZ = diamond;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z;
        this.LJFF = c1776960wLG;
    }
}
