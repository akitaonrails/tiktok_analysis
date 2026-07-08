package X;

import kotlin.jvm.internal.Intrinsics;
import tikcast.api.privilege.enigma.EnigmaProductsResponse;

/* JADX INFO: renamed from: X.0DQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338960DQo {
    public final EnigmaProductsResponse.Data.EnigmaIAPProductDetails LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C338960DQo)) {
            return false;
        }
        C338960DQo c338960DQo = (C338960DQo) obj;
        return Intrinsics.LJFF(this.LIZ, c338960DQo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c338960DQo.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingPurchase(productDetail=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C338960DQo(EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails, String str) {
        this.LIZ = enigmaIAPProductDetails;
        this.LIZIZ = str;
    }
}
