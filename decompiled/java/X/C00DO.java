package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.privilege.enigma.EnigmaProductsResponse;

/* JADX INFO: renamed from: X.00DO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00DO {
    public final EnigmaProductsResponse.Data.EnigmaIAPProductDetails LIZ;
    public final IapProductDetail LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00DO)) {
            return false;
        }
        C00DO c00do = (C00DO) obj;
        return Intrinsics.LJFF(this.LIZ, c00do.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00do.LIZIZ) && this.LIZJ == c00do.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnigmaProductPricingContext(backendDetail=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", playDetail=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", remainingDays=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00DO(EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails, IapProductDetail iapProductDetail, int i) {
        this.LIZ = enigmaIAPProductDetails;
        this.LIZIZ = iapProductDetail;
        this.LIZJ = i;
    }
}
