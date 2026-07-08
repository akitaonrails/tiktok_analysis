package X;

import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropValue;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408710mlJ implements InterfaceC746802vq, InterfaceC1406920miQ {
    public final PropValue LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final Image LLILZLL;
    public final GodaV2Style LLIZ;
    public final String LLIZLLLIL;
    public Function1<? super C1408710mlJ, Unit> LLJ;
    public Function2<? super C1408710mlJ, ? super Integer, Unit> LLJI;
    public Function1<? super C1408710mlJ, Unit> LLJIJIL;
    public InterfaceC1420350n45 LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1408710mlJ)) {
            return false;
        }
        C1408710mlJ c1408710mlJ = (C1408710mlJ) obj;
        return Intrinsics.LJFF(this.LL, c1408710mlJ.LL) && this.LLILLJJLI == c1408710mlJ.LLILLJJLI && this.LLILLL == c1408710mlJ.LLILLL && this.LLILZ == c1408710mlJ.LLILZ && this.LLILZIL == c1408710mlJ.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1408710mlJ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1408710mlJ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1408710mlJ.LLIZLLLIL);
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31;
        Image image = this.LLILZLL;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        GodaV2Style godaV2Style = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (godaV2Style == null ? 0 : godaV2Style.hashCode())) * 31;
        String str = this.LLIZLLLIL;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuPropValueSelectionCellItem(propValue=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", propIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", propValueIndex=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", cellStyle=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1406920miQ
    public final boolean LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1406920miQ
    public final Image getImage() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1408710mlJ) {
            C1408710mlJ c1408710mlJ = (C1408710mlJ) interfaceC1891350zJl;
            if (this.LLILLJJLI == c1408710mlJ.LLILLJJLI && this.LLILLL == c1408710mlJ.LLILLL && Intrinsics.LJFF(this.LL, c1408710mlJ.LL) && this.LLILZIL == c1408710mlJ.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1408710mlJ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1408710mlJ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1408710mlJ.LLIZLLLIL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1408710mlJ) && Intrinsics.LJFF(this.LL.propValueId, ((C1408710mlJ) interfaceC1891350zJl).LL.propValueId)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (!(interfaceC1891350zJl instanceof C1408710mlJ)) {
            return null;
        }
        C1408710mlJ c1408710mlJ = (C1408710mlJ) interfaceC1891350zJl;
        boolean z2 = false;
        if (this.LLILLJJLI != c1408710mlJ.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLL != c1408710mlJ.LLILLL) {
            z2 = true;
        }
        return new C1408740mlM(z, z2, !Intrinsics.LJFF(this.LLIZLLLIL, c1408710mlJ.LLIZLLLIL), !Intrinsics.LJFF(this.LLILZLL, c1408710mlJ.LLILZLL), !Intrinsics.LJFF(this.LL.hotTag, c1408710mlJ.LL.hotTag), !Intrinsics.LJFF(this.LLIZ, c1408710mlJ.LLIZ));
    }

    public C1408710mlJ(PropValue propValue, boolean z, boolean z2, int i, int i2, Image image, GodaV2Style godaV2Style, String str) {
        this.LL = propValue;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = image;
        this.LLIZ = godaV2Style;
        this.LLIZLLLIL = str;
    }
}
