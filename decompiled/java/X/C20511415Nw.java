package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Nw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20511415Nw implements InterfaceC1891350zJl {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final SalePropTag LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final InterfaceC20511615Ny LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20511415Nw)) {
            return false;
        }
        C20511415Nw c20511415Nw = (C20511415Nw) obj;
        return this.LL == c20511415Nw.LL && this.LLILLJJLI == c20511415Nw.LLILLJJLI && this.LLILLL == c20511415Nw.LLILLL && Intrinsics.LJFF(this.LLILZ, c20511415Nw.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c20511415Nw.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c20511415Nw.LLILZLL) && this.LLIZ == c20511415Nw.LLIZ && this.LLIZLLLIL == c20511415Nw.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c20511415Nw.LLJ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = ((((((((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        SalePropTag salePropTag = this.LLILZLL;
        return ((((((iZ2 + (salePropTag == null ? 0 : salePropTag.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaSkuTextSpecItemVO(groupIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", valueIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasInit=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", salePropTag=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", hasStock=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", clickListener=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C20511415Nw) {
            C20511415Nw c20511415Nw = (C20511415Nw) interfaceC1891350zJl;
            if (c20511415Nw.LL == this.LL && c20511415Nw.LLILLJJLI == this.LLILLJJLI && c20511415Nw.LLILLL == this.LLILLL && Intrinsics.LJFF(c20511415Nw.LLILZ, this.LLILZ) && c20511415Nw.LLIZ == this.LLIZ && c20511415Nw.LLIZLLLIL == this.LLIZLLLIL) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C20511415Nw) && Intrinsics.LJFF(((C20511415Nw) interfaceC1891350zJl).LLILZ, this.LLILZ)) {
            return true;
        }
        return false;
    }

    public C20511415Nw(int i, int i2, boolean z, String str, String str2, SalePropTag salePropTag, boolean z2, boolean z3, C04GK c04gk) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = salePropTag;
        this.LLIZ = z2;
        this.LLIZLLLIL = z3;
        this.LLJ = c04gk;
    }
}
