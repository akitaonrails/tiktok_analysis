package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03v4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C996803v4 {
    public final String LIZ;
    public final String LIZIZ;
    public final Image LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C996803v4)) {
            return false;
        }
        C996803v4 c996803v4 = (C996803v4) obj;
        return Intrinsics.LJFF(this.LIZ, c996803v4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c996803v4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c996803v4.LIZJ) && this.LIZLLL == c996803v4.LIZLLL && Intrinsics.LJFF(this.LJ, c996803v4.LJ) && Intrinsics.LJFF(this.LJFF, c996803v4.LJFF) && this.LJI == c996803v4.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Image image = this.LIZJ;
        int iHashCode2 = (((iHashCode + (image == null ? 0 : image.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSupportTryOnPropItem(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSkc=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", propId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", propName=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hasStock=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C996803v4(String str, String str2, Image image, boolean z, String str3, String str4, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = image;
        this.LIZLLL = z;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = z2;
    }
}
