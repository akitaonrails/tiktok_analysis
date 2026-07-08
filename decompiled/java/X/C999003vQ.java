package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelCard;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03vQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C999003vQ implements InterfaceC746802vq, C04DW {
    public final ModelCard LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Image LLILZ;
    public String LLILZIL = "undefined";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C999003vQ)) {
            return false;
        }
        C999003vQ c999003vQ = (C999003vQ) obj;
        return Intrinsics.LJFF(this.LL, c999003vQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c999003vQ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c999003vQ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c999003vQ.LLILZ);
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
        ModelCard modelCard = this.LL;
        int iHashCode = (modelCard == null ? 0 : modelCard.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.LLILZ;
        return iHashCode3 + (image != null ? image.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USPdpSizeGuideVO(modelCard=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sizeGuideSchema=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sizeGuideTitle=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", originSizeGuideImage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLILZIL = str;
    }

    public C999003vQ(ModelCard modelCard, String str, String str2, Image image) {
        this.LL = modelCard;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = image;
    }
}
