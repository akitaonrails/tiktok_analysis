package X;

import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.poi.PoiData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198620hIS implements InterfaceC1891350zJl {
    public final PoiData LL;
    public final String LLILLJJLI;
    public final List<Position> LLILLL;
    public final C1198610hIR LLILZ;
    public final Boolean LLILZIL;
    public final Integer LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1198620hIS() {
        this(63, null, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1198620hIS)) {
            return false;
        }
        C1198620hIS c1198620hIS = (C1198620hIS) obj;
        return Intrinsics.LJFF(this.LL, c1198620hIS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1198620hIS.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1198620hIS.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1198620hIS.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1198620hIS.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1198620hIS.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PoiData poiData = this.LL;
        int iHashCode = (poiData == null ? 0 : poiData.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Position> list = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C1198610hIR c1198610hIR = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c1198610hIR == null ? 0 : c1198610hIR.hashCode())) * 31;
        Boolean bool = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.LLILZLL;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCreatorPromoteStoresItem(promoteStoreItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", positions=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isCacheSearch=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isRTL=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C1198620hIS c1198620hIS;
        PoiData poiData;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C1198620hIS) && (c1198620hIS = (C1198620hIS) interfaceC1891350zJl) != null && (poiData = c1198620hIS.LL) != null) {
            str = poiData.poiId;
        } else {
            str = null;
        }
        PoiData poiData2 = this.LL;
        if (poiData2 != null) {
            str2 = poiData2.poiId;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public /* synthetic */ C1198620hIS(int i, PoiData poiData, String str) {
        this((i & 1) != 0 ? null : poiData, null, null, null, (i & 2) != 0 ? null : str, null);
    }

    public C1198620hIS(PoiData poiData, C1198610hIR c1198610hIR, Boolean bool, Integer num, String str, List list) {
        this.LL = poiData;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = c1198610hIR;
        this.LLILZIL = bool;
        this.LLILZLL = num;
    }
}
