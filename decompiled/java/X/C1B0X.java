package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.privilege.enigma.EnigmaProductsResponse;

/* JADX INFO: renamed from: X.1B0X, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B0X {
    public final Context LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final EnigmaProductsResponse.Data.EnigmaIAPProductDetails LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final EnumC20513215Oo LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1B0X)) {
            return false;
        }
        C1B0X c1b0x = (C1B0X) obj;
        return Intrinsics.LJFF(this.LIZ, c1b0x.LIZ) && this.LIZIZ == c1b0x.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1b0x.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1b0x.LIZLLL) && Intrinsics.LJFF(this.LJ, c1b0x.LJ) && Intrinsics.LJFF(this.LJFF, c1b0x.LJFF) && Intrinsics.LJFF(this.LJI, c1b0x.LJI) && Intrinsics.LJFF(this.LJII, c1b0x.LJII) && this.LJIIIIZZ == c1b0x.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseRequestContext(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", basePlanId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contractId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", productDetail=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", productType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", merchantId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", storeCountry=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", flowType=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1B0X(Context context, long j, String str, String str2, EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails, String str3, String str4, String str5, EnumC20513215Oo enumC20513215Oo) {
        this.LIZ = context;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = enigmaIAPProductDetails;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = enumC20513215Oo;
    }
}
