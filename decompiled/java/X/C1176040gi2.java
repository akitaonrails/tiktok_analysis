package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gi2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176040gi2 implements C14NM, Serializable {
    public final int LL;
    public final PoiGeneralCard LLILLJJLI;

    public C1176040gi2() {
        this(50003, null);
    }

    public final C1176040gi2 copy(int i, PoiGeneralCard poiGeneralCard) {
        return new C1176040gi2(i, poiGeneralCard);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176040gi2)) {
            return false;
        }
        C1176040gi2 c1176040gi2 = (C1176040gi2) obj;
        return this.LL == c1176040gi2.LL && Intrinsics.LJFF(this.LLILLJJLI, c1176040gi2.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        int i = this.LL * 31;
        PoiGeneralCard poiGeneralCard = this.LLILLJJLI;
        return i + (poiGeneralCard == null ? 0 : poiGeneralCard.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiNearbyV2CellModel(contentType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", card=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PoiGeneralCard getCard() {
        return this.LLILLJJLI;
    }

    @Override // X.C14NM
    public int getContentType() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1176040gi2(int i, PoiGeneralCard poiGeneralCard) {
        this.LL = i;
        this.LLILLJJLI = poiGeneralCard;
    }
}
