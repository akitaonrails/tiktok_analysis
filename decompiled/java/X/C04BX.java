package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04BX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04BX {
    public static final /* synthetic */ int LJII = 0;
    public final String LIZ;
    public final Image LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final SalePropTag LJ;
    public final String LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04BX)) {
            return false;
        }
        C04BX c04bx = (C04BX) obj;
        return Intrinsics.LJFF(this.LIZ, c04bx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c04bx.LIZIZ) && this.LIZJ == c04bx.LIZJ && this.LIZLLL == c04bx.LIZLLL && Intrinsics.LJFF(this.LJ, c04bx.LJ) && Intrinsics.LJFF(this.LJFF, c04bx.LJFF) && this.LJI == c04bx.LJI;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Image image = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (image == null ? 0 : image.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        SalePropTag salePropTag = this.LJ;
        return ((((iHashCode2 + (salePropTag != null ? salePropTag.hashCode() : 0)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpSkcItemData(skcId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", skcImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isInStock=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", skcTag=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", tagName=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", tagCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C04BX(String str, Image image, boolean z, boolean z2, SalePropTag salePropTag, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = image;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = salePropTag;
        this.LJFF = str2;
        this.LJI = i;
    }
}
