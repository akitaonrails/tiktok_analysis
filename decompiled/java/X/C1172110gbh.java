package X;

import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172110gbh implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final PoiLocation LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1172110gbh() {
        String str = null;
        this(str, str, str, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1172110gbh)) {
            return false;
        }
        C1172110gbh c1172110gbh = (C1172110gbh) obj;
        return Intrinsics.LJFF(this.LL, c1172110gbh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1172110gbh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1172110gbh.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1172110gbh.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1172110gbh.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1172110gbh.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PoiLocation poiLocation = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (poiLocation == null ? 0 : poiLocation.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZLL;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyFavoriteItem(poiName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiAddress=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", poiId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", location=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", typeLevel=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", poiInfoSource=");
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

    public /* synthetic */ C1172110gbh(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, null, null, null);
    }

    public C1172110gbh(String str, String str2, String str3, PoiLocation poiLocation, String str4, String str5) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = poiLocation;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
    }
}
