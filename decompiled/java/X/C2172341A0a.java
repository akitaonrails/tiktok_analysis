package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;
import r4b.c;
import r4b.g;

/* JADX INFO: renamed from: X.1A0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172341A0a implements InterfaceC1065804Eu {
    public final Image LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final SalePropTag LJ;
    public g LJFF = new c();

    @Override // X.InterfaceC1065804Eu
    public final void LIZ() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2172341A0a)) {
            return false;
        }
        C2172341A0a c2172341A0a = (C2172341A0a) obj;
        return Intrinsics.LJFF(this.LIZ, c2172341A0a.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2172341A0a.LIZIZ) && this.LIZJ == c2172341A0a.LIZJ && this.LIZLLL == c2172341A0a.LIZLLL && Intrinsics.LJFF(this.LJ, c2172341A0a.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        SalePropTag salePropTag = this.LJ;
        return iHashCode + (salePropTag == null ? 0 : salePropTag.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageHorizontalSpecVO(image=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasStock=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", salePropTag=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1065804Eu
    public final void LIZIZ(g gVar) {
        this.LJFF = gVar;
    }

    public C2172341A0a(Image image, String str, boolean z, boolean z2, SalePropTag salePropTag) {
        this.LIZ = image;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = salePropTag;
    }
}
