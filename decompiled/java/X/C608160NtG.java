package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightCellItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608160NtG implements InterfaceC1891350zJl {
    public final HighlightCellItem LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C608160NtG)) {
            return false;
        }
        C608160NtG c608160NtG = (C608160NtG) obj;
        return Intrinsics.LJFF(this.LL, c608160NtG.LL) && this.LLILLJJLI == c608160NtG.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightClipItemUiModel(item=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isTopHighlight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C608160NtG(HighlightCellItem highlightCellItem, boolean z) {
        this.LL = highlightCellItem;
        this.LLILLJJLI = z;
    }
}
