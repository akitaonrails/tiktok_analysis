package X;

import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.poi.PoiData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200050hKl implements InterfaceC1891350zJl {
    public final PoiData LL;
    public final List<Position> LLILLJJLI;
    public final String LLILLL;
    public final C1198610hIR LLILZ;
    public final Boolean LLILZIL;
    public final Integer LLILZLL;

    public C1200050hKl() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200050hKl)) {
            return false;
        }
        C1200050hKl c1200050hKl = (C1200050hKl) obj;
        return Intrinsics.LJFF(this.LL, c1200050hKl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1200050hKl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1200050hKl.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1200050hKl.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1200050hKl.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1200050hKl.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PoiData poiData = this.LL;
        int iHashCode = (poiData == null ? 0 : poiData.hashCode()) * 31;
        List<Position> list = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C1198610hIR c1198610hIR = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c1198610hIR == null ? 0 : c1198610hIR.hashCode())) * 31;
        Boolean bool = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.LLILZLL;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiClaimListItem(poiItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", positions=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", logId=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1200050hKl(PoiData poiData, C1198610hIR c1198610hIR, Boolean bool, Integer num, String str, List list) {
        this.LL = poiData;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = c1198610hIR;
        this.LLILZIL = bool;
        this.LLILZLL = num;
    }
}
