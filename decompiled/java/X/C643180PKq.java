package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TakoSugWordCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643180PKq implements InterfaceC655050Pmh {
    public final TakoSugWordCard LL;

    public C643180PKq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C643180PKq) && Intrinsics.LJFF(this.LL, ((C643180PKq) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        TakoSugWordCard takoSugWordCard = this.LL;
        if (takoSugWordCard == null) {
            return 0;
        }
        return takoSugWordCard.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTakoSugCardData(sugCard=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C643180PKq(TakoSugWordCard takoSugWordCard) {
        this.LL = takoSugWordCard;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
