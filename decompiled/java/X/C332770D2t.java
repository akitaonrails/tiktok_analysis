package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332770D2t implements Serializable {
    public final String arrivalDaysDesc;
    public final boolean isFreeShipping;
    public final String shippingPolicyDetail;
    public final String shippingStrategy;
    public final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332770D2t)) {
            return false;
        }
        C332770D2t c332770D2t = (C332770D2t) obj;
        return Intrinsics.LJFF(this.title, c332770D2t.title) && this.isFreeShipping == c332770D2t.isFreeShipping && Intrinsics.LJFF(this.arrivalDaysDesc, c332770D2t.arrivalDaysDesc) && Intrinsics.LJFF(this.shippingStrategy, c332770D2t.shippingStrategy) && Intrinsics.LJFF(this.shippingPolicyDetail, c332770D2t.shippingPolicyDetail);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + C786410Ut5.Z2(this.isFreeShipping)) * 31;
        String str = this.arrivalDaysDesc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shippingStrategy;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shippingPolicyDetail;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpShippingSectionState(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", isFreeShipping=");
        sbLIZ.append(this.isFreeShipping);
        sbLIZ.append(", arrivalDaysDesc=");
        sbLIZ.append(this.arrivalDaysDesc);
        sbLIZ.append(", shippingStrategy=");
        sbLIZ.append(this.shippingStrategy);
        sbLIZ.append(", shippingPolicyDetail=");
        sbLIZ.append(this.shippingPolicyDetail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isFreeShipping() {
        return this.isFreeShipping;
    }

    public C332770D2t(String str, boolean z, String str2, String str3, String str4) {
        this.title = str;
        this.isFreeShipping = z;
        this.arrivalDaysDesc = str2;
        this.shippingStrategy = str3;
        this.shippingPolicyDetail = str4;
    }
}
