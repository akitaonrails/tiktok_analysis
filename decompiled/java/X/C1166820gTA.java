package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gTA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166820gTA implements InterfaceC1164430gPJ {
    public final PoiLandmark LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1166820gTA)) {
            return false;
        }
        C1166820gTA c1166820gTA = (C1166820gTA) obj;
        return Intrinsics.LJFF(this.LL, c1166820gTA.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1166820gTA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1166820gTA.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PoiLandmark poiLandmark = this.LL;
        int iHashCode = (poiLandmark == null ? 0 : poiLandmark.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModeNavTabSelectItem(poiLandmark=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", filterDistance=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", filterDistanceForDisplay=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String name;
        if (!areItemTheSame(interfaceC1891350zJl) || !(interfaceC1891350zJl instanceof C1166820gTA)) {
            return false;
        }
        PoiLandmark poiLandmark = this.LL;
        String name2 = null;
        if (poiLandmark != null) {
            name = poiLandmark.getName();
        } else {
            name = null;
        }
        C1166820gTA c1166820gTA = (C1166820gTA) interfaceC1891350zJl;
        PoiLandmark poiLandmark2 = c1166820gTA.LL;
        if (poiLandmark2 != null) {
            name2 = poiLandmark2.getName();
        }
        if (!Intrinsics.LJFF(name, name2) || !Intrinsics.LJFF(this.LLILLL, c1166820gTA.LLILLL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1166820gTA) && interfaceC1891350zJl != null) {
            return true;
        }
        return false;
    }

    public C1166820gTA(PoiLandmark poiLandmark, String str, String str2) {
        this.LL = poiLandmark;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
