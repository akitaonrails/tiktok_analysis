package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A0Y implements InterfaceC1004403wI, InterfaceC21715019ye {
    public final Image LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final SalePropTag LLILZIL;
    public C21714919yd LLILZLL = new C21714919yd();
    public C1A0V LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A0Y)) {
            return false;
        }
        C1A0Y c1a0y = (C1A0Y) obj;
        return Intrinsics.LJFF(this.LL, c1a0y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1a0y.LLILLJJLI) && this.LLILLL == c1a0y.LLILLL && this.LLILZ == c1a0y.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1a0y.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        SalePropTag salePropTag = this.LLILZIL;
        return iHashCode2 + (salePropTag != null ? salePropTag.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspImageSpecVO(image=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", displayPrice=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasStock=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", salePropTag=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC21715019ye
    public final void LIZ(C21714919yd c21714919yd) {
        this.LLILZLL = c21714919yd;
    }

    @Override // X.InterfaceC21715019ye
    public final void LIZIZ(C212363188r c212363188r) {
        this.LLIZ = c212363188r;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1004303wH.LIZ(this, interfaceC1891350zJl);
    }

    public C1A0Y(Image image, String str, boolean z, boolean z2, SalePropTag salePropTag) {
        this.LL = image;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = salePropTag;
    }
}
