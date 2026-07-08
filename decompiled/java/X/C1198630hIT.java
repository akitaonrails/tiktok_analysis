package X;

import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.poi.PoiData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hIT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198630hIT implements C14NM {
    public final PoiData LL;
    public final List<Position> LLILLJJLI;
    public final String LLILLL;
    public final C1198610hIR LLILZ;
    public final Boolean LLILZIL;
    public final Integer LLILZLL;
    public final int LLIZ;

    public C1198630hIT() {
        this(null, null, null, null, null, null, 50002);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1198630hIT)) {
            return false;
        }
        C1198630hIT c1198630hIT = (C1198630hIT) obj;
        return Intrinsics.LJFF(this.LL, c1198630hIT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1198630hIT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1198630hIT.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1198630hIT.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1198630hIT.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1198630hIT.LLILZLL) && this.LLIZ == c1198630hIT.LLIZ;
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
        return ((iHashCode5 + (num != null ? num.hashCode() : 0)) * 31) + this.LLIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSearchItem(poiItem=");
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
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1198630hIT(PoiData poiData, List<? extends Position> list, String str, C1198610hIR c1198610hIR, Boolean bool, Integer num, int i) {
        this.LL = poiData;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = c1198610hIR;
        this.LLILZIL = bool;
        this.LLILZLL = num;
        this.LLIZ = i;
    }
}
