package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ghh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175830ghh implements InterfaceC1891350zJl {
    public final PoiGeneralCard LL;

    public C1175830ghh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1175830ghh) && Intrinsics.LJFF(this.LL, ((C1175830ghh) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PoiGeneralCard poiGeneralCard = this.LL;
        if (poiGeneralCard == null) {
            return 0;
        }
        return poiGeneralCard.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapDetailTransportItem(card=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1175830ghh(PoiGeneralCard poiGeneralCard) {
        this.LL = poiGeneralCard;
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
