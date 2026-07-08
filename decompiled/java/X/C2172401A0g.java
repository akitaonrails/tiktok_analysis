package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;
import r4b.c;
import r4b.g;

/* JADX INFO: renamed from: X.1A0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172401A0g implements InterfaceC1065804Eu {
    public final Image LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final SalePropTag LJFF;
    public g LJI = new c();
    public final C2172431A0j LJII = new C2172431A0j();

    @Override // X.InterfaceC1065804Eu
    public final void LIZ() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2172401A0g)) {
            return false;
        }
        C2172401A0g c2172401A0g = (C2172401A0g) obj;
        return Intrinsics.LJFF(this.LIZ, c2172401A0g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2172401A0g.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2172401A0g.LIZJ) && this.LIZLLL == c2172401A0g.LIZLLL && this.LJ == c2172401A0g.LJ && Intrinsics.LJFF(this.LJFF, c2172401A0g.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        SalePropTag salePropTag = this.LJFF;
        return iHashCode2 + (salePropTag != null ? salePropTag.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageWithTextSpecVO(image=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", displayPrice=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasStock=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", salePropTag=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1065804Eu
    public final void LIZIZ(g gVar) {
        this.LJI = gVar;
    }

    public C2172401A0g(Image image, String str, String str2, boolean z, boolean z2, SalePropTag salePropTag) {
        this.LIZ = image;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = salePropTag;
    }
}
