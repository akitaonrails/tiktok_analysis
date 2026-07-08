package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02vu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C747202vu extends AbstractC756202xM {
    public final int LLILZLL;
    public final SaleProp LLIZ;
    public final SizeGuide LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C747202vu)) {
            return false;
        }
        C747202vu c747202vu = (C747202vu) obj;
        return this.LLILZLL == c747202vu.LLILZLL && Intrinsics.LJFF(this.LLIZ, c747202vu.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c747202vu.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LLILZLL * 31) + this.LLIZ.hashCode()) * 31;
        SizeGuide sizeGuide = this.LLIZLLLIL;
        return iHashCode + (sizeGuide == null ? 0 : sizeGuide.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaSkuTextSpecVO(groupIndex=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", saleProp=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", sizeGuide=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C747202vu) {
            C747202vu c747202vu = (C747202vu) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c747202vu.LLIZ.propId, this.LLIZ.propId) && c747202vu.LLILZLL == this.LLILZLL && Intrinsics.LJFF(c747202vu.LLIZLLLIL, this.LLIZLLLIL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C747202vu) && Intrinsics.LJFF(((C747202vu) interfaceC1891350zJl).LLIZ.propId, this.LLIZ.propId)) {
            return true;
        }
        return false;
    }

    public C747202vu(int i, SaleProp saleProp, SizeGuide sizeGuide) {
        this.LLILZLL = i;
        this.LLIZ = saleProp;
        this.LLIZLLLIL = sizeGuide;
    }
}
