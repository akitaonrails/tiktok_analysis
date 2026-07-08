package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03lO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C936803lO {
    public final List<String> LIZ;
    public final String LIZIZ;
    public final Image LIZJ;
    public final int LIZLLL;
    public final C937003lQ LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C936803lO)) {
            return false;
        }
        C936803lO c936803lO = (C936803lO) obj;
        return Intrinsics.LJFF(this.LIZ, c936803lO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c936803lO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c936803lO.LIZJ) && this.LIZLLL == c936803lO.LIZLLL && Intrinsics.LJFF(this.LJ, c936803lO.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.LIZJ;
        return ((((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaSkuSelectionSnapshot(checkedSpecIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedSkuId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentImage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", currentImagePosition=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stockInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C936803lO(List<String> list, String str, Image image, int i, C937003lQ c937003lQ) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = image;
        this.LIZLLL = i;
        this.LJ = c937003lQ;
    }
}
