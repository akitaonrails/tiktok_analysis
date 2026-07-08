package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;
import q4b.j0;
import r4b.g;

/* JADX INFO: renamed from: X.1A0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172411A0h implements InterfaceC1065804Eu {
    public final Image LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final SalePropTag LJ;
    public final Boolean LJFF;
    public final String LJI;
    public g LJII = new j0();
    public final C2172421A0i LJIIIIZZ;

    @Override // X.InterfaceC1065804Eu
    public final void LIZ() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2172411A0h)) {
            return false;
        }
        C2172411A0h c2172411A0h = (C2172411A0h) obj;
        return Intrinsics.LJFF(this.LIZ, c2172411A0h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2172411A0h.LIZIZ) && this.LIZJ == c2172411A0h.LIZJ && this.LIZLLL == c2172411A0h.LIZLLL && Intrinsics.LJFF(this.LJ, c2172411A0h.LJ) && Intrinsics.LJFF(this.LJFF, c2172411A0h.LJFF) && Intrinsics.LJFF(this.LJI, c2172411A0h.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        SalePropTag salePropTag = this.LJ;
        int iHashCode3 = (iHashCode2 + (salePropTag == null ? 0 : salePropTag.hashCode())) * 31;
        Boolean bool = this.LJFF;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.LJI;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageSpecVO(image=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", displayPrice=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasStock=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", salePropTag=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isTopSkuModule=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1065804Eu
    public final void LIZIZ(g gVar) {
        this.LJII = gVar;
    }

    public C2172411A0h(Image image, String str, boolean z, boolean z2, SalePropTag salePropTag, Boolean bool, String str2) {
        C2172421A0i c2172421A0i;
        this.LIZ = image;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = salePropTag;
        this.LJFF = bool;
        this.LJI = str2;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            c2172421A0i = new C2172421A0i() { // from class: X.1A0l
                @Override // X.C2172421A0i, X.InterfaceC2172471A0n
                public final C2172461A0m LIZ() {
                    return new C2172461A0m(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                }
            };
        } else {
            c2172421A0i = new C2172421A0i();
        }
        this.LJIIIIZZ = c2172421A0i;
    }
}
