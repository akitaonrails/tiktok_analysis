package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428010GqN implements InterfaceC427650Gpn {
    public final String LIZ;
    public final Image LIZIZ;
    public final List<Image> LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C428010GqN)) {
            return false;
        }
        C428010GqN c428010GqN = (C428010GqN) obj;
        return Intrinsics.LJFF(this.LIZ, c428010GqN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c428010GqN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c428010GqN.LIZJ) && this.LIZLLL == c428010GqN.LIZLLL && Intrinsics.LJFF(this.LJ, c428010GqN.LJ) && this.LJFF == c428010GqN.LJFF && this.LJI == c428010GqN.LJI && this.LJII == c428010GqN.LJII;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Image image = this.LIZIZ;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        List<Image> list = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UI(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", skcImages=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pos=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", skcName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hasStock=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isEnable=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C428010GqN(String str, Image image, List<Image> list, int i, String str2, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = image;
        this.LIZJ = list;
        this.LIZLLL = i;
        this.LJ = str2;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
    }
}
