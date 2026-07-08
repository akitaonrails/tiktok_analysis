package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.archive2.model.GetStoryOnThisDayInfoResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ge2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173560ge2 implements InterfaceC0148002o {
    public final C1173680geE LL;
    public final C1173680geE LLILLJJLI;
    public final Map<String, Aweme> LLILLL;
    public final boolean LLILZ;
    public final GetStoryOnThisDayInfoResponse LLILZIL;
    public final long LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final List<String> LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1173560ge2)) {
            return false;
        }
        C1173560ge2 c1173560ge2 = (C1173560ge2) obj;
        return Intrinsics.LJFF(this.LL, c1173560ge2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1173560ge2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1173560ge2.LLILLL) && this.LLILZ == c1173560ge2.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1173560ge2.LLILZIL) && this.LLILZLL == c1173560ge2.LLILZLL && this.LLIZ == c1173560ge2.LLIZ && this.LLIZLLLIL == c1173560ge2.LLIZLLLIL && this.LLJ == c1173560ge2.LLJ && Intrinsics.LJFF(this.LLJI, c1173560ge2.LLJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        GetStoryOnThisDayInfoResponse getStoryOnThisDayInfoResponse = this.LLILZIL;
        return ((((((((((iHashCode + (getStoryOnThisDayInfoResponse == null ? 0 : getStoryOnThisDayInfoResponse.hashCode())) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryArchiveV2State(collectionAwemeData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", thoughtCollectionAwemeData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", realAwemeMap=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", canShowOnThisDay=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onThisDayInfoResponse=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", firstStoryTimestamp=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isCalendarListLoaded=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isRequestingRealAwemeData=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", canRequestRealAwemeData=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", pendingRequestRealAwemeIdList=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1173560ge2(C1173680geE c1173680geE, C1173680geE c1173680geE2, Map<String, ? extends Aweme> map, boolean z, GetStoryOnThisDayInfoResponse getStoryOnThisDayInfoResponse, long j, boolean z2, boolean z3, boolean z4, List<String> list) {
        this.LL = c1173680geE;
        this.LLILLJJLI = c1173680geE2;
        this.LLILLL = map;
        this.LLILZ = z;
        this.LLILZIL = getStoryOnThisDayInfoResponse;
        this.LLILZLL = j;
        this.LLIZ = z2;
        this.LLIZLLLIL = z3;
        this.LLJ = z4;
        this.LLJI = list;
    }

    public static C1173560ge2 LIZ(C1173560ge2 c1173560ge2, C1173680geE c1173680geE, C1173680geE c1173680geE2, Map map, GetStoryOnThisDayInfoResponse getStoryOnThisDayInfoResponse, long j, boolean z, boolean z2, boolean z3, List list, int i) {
        boolean z4;
        List list2 = list;
        boolean z5 = z3;
        boolean z6 = z2;
        boolean z7 = z;
        long j2 = j;
        GetStoryOnThisDayInfoResponse getStoryOnThisDayInfoResponse2 = getStoryOnThisDayInfoResponse;
        Map map2 = map;
        C1173680geE c1173680geE3 = c1173680geE2;
        C1173680geE c1173680geE4 = c1173680geE;
        if ((i & 1) != 0) {
            c1173680geE4 = c1173560ge2.LL;
        }
        if ((i & 2) != 0) {
            c1173680geE3 = c1173560ge2.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            map2 = c1173560ge2.LLILLL;
        }
        if ((i & 8) != 0) {
            z4 = c1173560ge2.LLILZ;
        } else {
            z4 = false;
        }
        if ((i & 16) != 0) {
            getStoryOnThisDayInfoResponse2 = c1173560ge2.LLILZIL;
        }
        if ((i & 32) != 0) {
            j2 = c1173560ge2.LLILZLL;
        }
        if ((i & 64) != 0) {
            z7 = c1173560ge2.LLIZ;
        }
        if ((i & 128) != 0) {
            z6 = c1173560ge2.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            z5 = c1173560ge2.LLJ;
        }
        if ((i & 512) != 0) {
            list2 = c1173560ge2.LLJI;
        }
        c1173560ge2.getClass();
        return new C1173560ge2(c1173680geE4, c1173680geE3, map2, z4, getStoryOnThisDayInfoResponse2, j2, z7, z6, z5, list2);
    }
}
