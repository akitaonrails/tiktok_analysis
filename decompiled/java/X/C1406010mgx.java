package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406010mgx implements InterfaceC746802vq, C04DW {
    public final ECRichText LL;
    public final Icon LLILLJJLI;
    public final Icon LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public String LLILZLL;

    public C1406010mgx() {
        this(null, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406010mgx)) {
            return false;
        }
        C1406010mgx c1406010mgx = (C1406010mgx) obj;
        return Intrinsics.LJFF(this.LL, c1406010mgx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1406010mgx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1406010mgx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1406010mgx.LLILZ) && this.LLILZIL == c1406010mgx.LLILZIL;
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
        ECRichText eCRichText = this.LL;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Icon icon = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        String str = this.LLILZ;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AboutThisProductHeaderUICell(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", expandIcon=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", collapseIcon=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isContentExpanded=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILZLL;
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
        this.LLILZLL = str;
    }

    public C1406010mgx(ECRichText eCRichText, Icon icon, Icon icon2, String str, boolean z) {
        this.LL = eCRichText;
        this.LLILLJJLI = icon;
        this.LLILLL = icon2;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = "undefined";
    }
}
