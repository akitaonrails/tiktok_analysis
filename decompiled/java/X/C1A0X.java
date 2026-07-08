package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A0X, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A0X implements InterfaceC1004403wI, InterfaceC21715019ye {
    public final Image LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final SalePropTag LLILZLL;
    public C21714919yd LLIZ = new C21714919yd();
    public C1A0V LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A0X)) {
            return false;
        }
        C1A0X c1a0x = (C1A0X) obj;
        return Intrinsics.LJFF(this.LL, c1a0x.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1a0x.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1a0x.LLILLL) && this.LLILZ == c1a0x.LLILZ && this.LLILZIL == c1a0x.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1a0x.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        SalePropTag salePropTag = this.LLILZLL;
        return iHashCode2 + (salePropTag != null ? salePropTag.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspImageWithTextSpecVO(image=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", displayPrice=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasStock=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", salePropTag=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC21715019ye
    public final void LIZ(C21714919yd c21714919yd) {
        this.LLIZ = c21714919yd;
    }

    @Override // X.InterfaceC21715019ye
    public final void LIZIZ(C212363188r c212363188r) {
        this.LLIZLLLIL = c212363188r;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1004303wH.LIZ(this, interfaceC1891350zJl);
    }

    public C1A0X(Image image, String str, String str2, boolean z, boolean z2, SalePropTag salePropTag) {
        this.LL = image;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = salePropTag;
    }
}
