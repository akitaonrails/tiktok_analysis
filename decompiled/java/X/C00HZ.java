package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00HZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00HZ implements C15W0 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final Map<String, String> LJI;
    public final String LJII;

    public C00HZ() {
        throw null;
    }

    @Override // X.C15W0
    public final Map<String, String> LIZ() {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("enter_from", this.LIZ);
        pairArr[1] = new Pair("enter_method", this.LIZJ);
        pairArr[2] = new Pair("is_success", this.LIZLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[3] = new Pair("duration", String.valueOf(this.LJ));
        pairArr[4] = new Pair("is_first_feed", this.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[5] = new Pair("pull_type", String.valueOf(this.LJFF));
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(this.LJI);
        return mapLJIIJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00HZ)) {
            return false;
        }
        C00HZ c00hz = (C00HZ) obj;
        return Intrinsics.LJFF(this.LIZ, c00hz.LIZ) && this.LIZIZ == c00hz.LIZIZ && Intrinsics.LJFF(this.LIZJ, c00hz.LIZJ) && this.LIZLLL == c00hz.LIZLLL && this.LJ == c00hz.LJ && this.LJFF == c00hz.LJFF && Intrinsics.LJFF(this.LJI, c00hz.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreFeedApiV2Et(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFirstFeed=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", pullType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", stage=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C15W0
    public final String getEventName() {
        return this.LJII;
    }

    public C00HZ(boolean z, String str, boolean z2, long j, int i, Map map) {
        this.LIZ = "homepage_explore";
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = z2;
        this.LJ = j;
        this.LJFF = i;
        this.LJI = map;
        this.LJII = "homepage_explore_feed_api_v2";
    }
}
