package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436550H9x implements InterfaceC1891350zJl {
    public final Integer LL;
    public final PoiListApi.PoiYearForDisplay LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C436550H9x)) {
            return false;
        }
        C436550H9x c436550H9x = (C436550H9x) obj;
        return Intrinsics.LJFF(this.LL, c436550H9x.LL) && Intrinsics.LJFF(this.LLILLJJLI, c436550H9x.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        PoiListApi.PoiYearForDisplay poiYearForDisplay = this.LLILLJJLI;
        return iHashCode + (poiYearForDisplay != null ? poiYearForDisplay.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHotelOpeningItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", yearForDisplay=");
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

    public C436550H9x(Integer num, PoiListApi.PoiYearForDisplay poiYearForDisplay) {
        this.LL = num;
        this.LLILLJJLI = poiYearForDisplay;
    }
}
