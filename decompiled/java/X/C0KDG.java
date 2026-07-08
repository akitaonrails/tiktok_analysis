package X;

import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KDG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDG {
    public SubInfo LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public int LJFF;
    public RefundInfo LJI;

    public C0KDG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KDG)) {
            return false;
        }
        C0KDG c0kdg = (C0KDG) obj;
        return Intrinsics.LJFF(this.LIZ, c0kdg.LIZ) && this.LIZIZ == c0kdg.LIZIZ && this.LIZJ == c0kdg.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0kdg.LIZLLL) && this.LJ == c0kdg.LJ && this.LJFF == c0kdg.LJFF && Intrinsics.LJFF(this.LJI, c0kdg.LJI);
    }

    public final int hashCode() {
        SubInfo subInfo = this.LIZ;
        int iHashCode = (((((((((((subInfo == null ? 0 : subInfo.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31;
        RefundInfo refundInfo = this.LJI;
        return iHashCode + (refundInfo != null ? refundInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UiData(subInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isRenewalScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSelectedRenewPlan=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", offerTermString=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isInOfferState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", renewalPeriod=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", refundInfo=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KDG(int i) {
        this.LIZ = null;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = "";
        this.LJ = false;
        this.LJFF = 1;
        this.LJI = null;
    }
}
