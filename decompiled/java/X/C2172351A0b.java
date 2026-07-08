package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;
import r4b.c;
import r4b.g;

/* JADX INFO: renamed from: X.1A0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172351A0b implements InterfaceC1065804Eu {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final SalePropTag LJ;
    public final String LJFF;
    public final ECRichText LJI;
    public g LJII = new c();
    public final C2172441A0k LJIIIIZZ = new C2172441A0k();

    @Override // X.InterfaceC1065804Eu
    public final void LIZ() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2172351A0b)) {
            return false;
        }
        C2172351A0b c2172351A0b = (C2172351A0b) obj;
        return Intrinsics.LJFF(this.LIZ, c2172351A0b.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2172351A0b.LIZIZ) && this.LIZJ == c2172351A0b.LIZJ && this.LIZLLL == c2172351A0b.LIZLLL && Intrinsics.LJFF(this.LJ, c2172351A0b.LJ) && Intrinsics.LJFF(this.LJFF, c2172351A0b.LJFF) && Intrinsics.LJFF(this.LJI, c2172351A0b.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        SalePropTag salePropTag = this.LJ;
        int iHashCode3 = (iHashCode2 + (salePropTag == null ? 0 : salePropTag.hashCode())) * 31;
        String str2 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ECRichText eCRichText = this.LJI;
        return iHashCode4 + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextSpecVO(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", displayPrice=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasStock=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", salePropTag=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", displayPriceRichText=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1065804Eu
    public final void LIZIZ(g gVar) {
        this.LJII = gVar;
    }

    public C2172351A0b(String str, String str2, boolean z, boolean z2, SalePropTag salePropTag, String str3, ECRichText eCRichText) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = salePropTag;
        this.LJFF = str3;
        this.LJI = eCRichText;
    }
}
