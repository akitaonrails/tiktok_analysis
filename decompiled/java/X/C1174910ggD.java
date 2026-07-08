package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ggD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174910ggD implements InterfaceC1891350zJl {
    public final PoiLandmark LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174910ggD)) {
            return false;
        }
        C1174910ggD c1174910ggD = (C1174910ggD) obj;
        return Intrinsics.LJFF(this.LL, c1174910ggD.LL) && this.LLILLJJLI == c1174910ggD.LLILLJJLI && this.LLILLL == c1174910ggD.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModeFilterLandmarkItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", appliedSelectedState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentSelectedState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1174910ggD c1174910ggD;
        PoiLandmark poiLandmark;
        String poiId = this.LL.getPoiId();
        if (poiId != null && C123100dR.LIZ(poiId)) {
            String poiId2 = this.LL.getPoiId();
            String poiId3 = null;
            if ((interfaceC1891350zJl instanceof C1174910ggD) && (c1174910ggD = (C1174910ggD) interfaceC1891350zJl) != null && (poiLandmark = c1174910ggD.LL) != null) {
                poiId3 = poiLandmark.getPoiId();
            }
            if (Intrinsics.LJFF(poiId2, poiId3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1174910ggD(PoiLandmark poiLandmark, boolean z, boolean z2) {
        this.LL = poiLandmark;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }
}
