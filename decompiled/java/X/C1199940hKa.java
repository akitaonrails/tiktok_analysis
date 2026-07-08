package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199940hKa implements InterfaceC1891350zJl {
    public final PoiData LL;
    public final C1200260hL6 LLILLJJLI;
    public final boolean LLILLL;

    public C1199940hKa() {
        this(null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1199940hKa)) {
            return false;
        }
        C1199940hKa c1199940hKa = (C1199940hKa) obj;
        return Intrinsics.LJFF(this.LL, c1199940hKa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1199940hKa.LLILLJJLI) && this.LLILLL == c1199940hKa.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PoiData poiData = this.LL;
        int iHashCode = (poiData == null ? 0 : poiData.hashCode()) * 31;
        C1200260hL6 c1200260hL6 = this.LLILLJJLI;
        return ((iHashCode + (c1200260hL6 != null ? c1200260hL6.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiPublishRcmdListCellData(item=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", extensionMiscData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasHeader=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1199940hKa(PoiData poiData, C1200260hL6 c1200260hL6, boolean z) {
        this.LL = poiData;
        this.LLILLJJLI = c1200260hL6;
        this.LLILLL = z;
    }
}
