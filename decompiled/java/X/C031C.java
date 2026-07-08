package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C031C extends AbstractC756202xM {
    public final int LLILZLL;
    public final SaleProp LLIZ;
    public final C20510715Np LLIZLLLIL;
    public final SizeGuide LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C031C)) {
            return false;
        }
        C031C c031c = (C031C) obj;
        return this.LLILZLL == c031c.LLILZLL && Intrinsics.LJFF(this.LLIZ, c031c.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c031c.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c031c.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LLILZLL * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        SizeGuide sizeGuide = this.LLJ;
        return iHashCode + (sizeGuide == null ? 0 : sizeGuide.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaSkuImageSpecVO(groupIndex=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", saleProp=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", measureResult=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", sizeGuide=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C031C) {
            C031C c031c = (C031C) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c031c.LLIZ.propId, this.LLIZ.propId) && Intrinsics.LJFF(c031c.LLIZLLLIL, this.LLIZLLLIL) && c031c.LLILZLL == this.LLILZLL && Intrinsics.LJFF(c031c.LLJ, this.LLJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C031C) && Intrinsics.LJFF(((C031C) interfaceC1891350zJl).LLIZ.propId, this.LLIZ.propId)) {
            return true;
        }
        return false;
    }

    public C031C(int i, SaleProp saleProp, C20510715Np c20510715Np, SizeGuide sizeGuide) {
        this.LLILZLL = i;
        this.LLIZ = saleProp;
        this.LLIZLLLIL = c20510715Np;
        this.LLJ = sizeGuide;
    }
}
