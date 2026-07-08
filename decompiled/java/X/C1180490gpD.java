package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180490gpD implements InterfaceC111300bX {
    public final C1180890gpr LL;
    public final MyMomentsData LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1180490gpD)) {
            return false;
        }
        C1180490gpD c1180490gpD = (C1180490gpD) obj;
        return Intrinsics.LJFF(this.LL, c1180490gpD.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1180490gpD.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1180490gpD.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        MyMomentsData myMomentsData = this.LLILLJJLI;
        return ((iHashCode + (myMomentsData == null ? 0 : myMomentsData.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCampaignHierarchyData(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", initResponse=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", trackId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1180490gpD(C1180890gpr c1180890gpr, MyMomentsData myMomentsData, String str) {
        this.LL = c1180890gpr;
        this.LLILLJJLI = myMomentsData;
        this.LLILLL = str;
    }
}
