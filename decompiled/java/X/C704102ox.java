package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointLabel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C704102ox implements InterfaceC746802vq {
    public final int LL;
    public final List<SellingPointLabel> LLILLJJLI;
    public final ECRichText LLILLL;

    public C704102ox() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C704102ox)) {
            return false;
        }
        C704102ox c704102ox = (C704102ox) obj;
        return this.LL == c704102ox.LL && Intrinsics.LJFF(this.LLILLJJLI, c704102ox.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c704102ox.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        int i = this.LL * 31;
        List<SellingPointLabel> list = this.LLILLJJLI;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        ECRichText eCRichText = this.LLILLL;
        return iHashCode + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuHeaderItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", skuSellingPoints=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", skuLogisticsInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public C704102ox(List list, ECRichText eCRichText, int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        list = (i & 2) != 0 ? null : list;
        eCRichText = (i & 4) != 0 ? null : eCRichText;
        this.LL = i2;
        this.LLILLJJLI = list;
        this.LLILLL = eCRichText;
    }
}
