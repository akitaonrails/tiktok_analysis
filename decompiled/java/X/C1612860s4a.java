package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612860s4a implements InterfaceC2753014t, InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final long LLILZLL;
    public final boolean LLIZ;
    public final int LLIZLLLIL;
    public final SeriesCategory LLJ;
    public final boolean LLJI;
    public final String LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final C1612600s4A LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final String LLJJIJI;
    public final C1612570s47 LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final DramaExtraTrackingParams LLJJJ;
    public final Aweme LLJJJIL;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(569));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1612860s4a)) {
            return false;
        }
        C1612860s4a c1612860s4a = (C1612860s4a) obj;
        return Intrinsics.LJFF(this.LL, c1612860s4a.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1612860s4a.LLILLJJLI) && this.LLILLL == c1612860s4a.LLILLL && this.LLILZ == c1612860s4a.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1612860s4a.LLILZIL) && this.LLILZLL == c1612860s4a.LLILZLL && this.LLIZ == c1612860s4a.LLIZ && this.LLIZLLLIL == c1612860s4a.LLIZLLLIL && this.LLJ == c1612860s4a.LLJ && this.LLJI == c1612860s4a.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1612860s4a.LLJIJIL) && this.LLJILJIL == c1612860s4a.LLJILJIL && this.LLJILJILJ == c1612860s4a.LLJILJILJ && this.LLJILLL == c1612860s4a.LLJILLL && Intrinsics.LJFF(this.LLJJ, c1612860s4a.LLJJ) && this.LLJJI == c1612860s4a.LLJJI && this.LLJJIII == c1612860s4a.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, c1612860s4a.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1612860s4a.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c1612860s4a.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1612860s4a.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1612860s4a.LLJJJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        String str = this.LLILZIL;
        int iHashCode2 = (((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31;
        C1612600s4A c1612600s4A = this.LLJJ;
        int iHashCode3 = (((((iHashCode2 + (c1612600s4A == null ? 0 : c1612600s4A.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31;
        String str2 = this.LLJJIJI;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C1612570s47 c1612570s47 = this.LLJJIJIIJIL;
        int iHashCode5 = (iHashCode4 + (c1612570s47 == null ? 0 : c1612570s47.hashCode())) * 31;
        String str3 = this.LLJJIJIL;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DramaExtraTrackingParams dramaExtraTrackingParams = this.LLJJJ;
        int iHashCode7 = (iHashCode6 + (dramaExtraTrackingParams == null ? 0 : dramaExtraTrackingParams.hashCode())) * 31;
        Aweme aweme = this.LLJJJIL;
        return iHashCode7 + (aweme != null ? aweme.hashCode() : 0);
    }

    public final String toString() {
        return "SeriesVideoPlaylistHierarchyData(sessionId=" + this.LL + ", vmKey=" + this.LLILLJJLI + ", hasPurchasedCollection=" + this.LLILLL + ", isViewerSelfCreator=" + this.LLILZ + ", enterFrom=" + this.LLILZIL + ", collectionId=" + this.LLILZLL + ", isDirectFeedNavigation=" + this.LLIZ + ", targetCursor=" + this.LLIZLLLIL + ", seriesCategory=" + this.LLJ + ", selectRecommendTab=" + this.LLJI + ", collectionUserId=" + this.LLJIJIL + ", isFromBottomBanner=" + this.LLJILJIL + ", isFromAnchor=" + this.LLJILJILJ + ", isFromDramaComponent=" + this.LLJILLL + ", anchorInfo=" + this.LLJJ + ", isLimitedFree=" + this.LLJJI + ", isFromHotZone=" + this.LLJJIII + ", sourceCard=" + this.LLJJIJI + ", sourceInfo=" + this.LLJJIJIIJIL + ", groupId=" + this.LLJJIJIL + ", dramaExtraTrackingParams=" + this.LLJJJ + ", currentAweme=" + this.LLJJJIL + ')';
    }

    public C1612860s4a(String str, String str2, boolean z, boolean z2, String str3, long j, boolean z3, int i, SeriesCategory seriesCategory, boolean z4, String str4, boolean z5, boolean z6, boolean z7, C1612600s4A c1612600s4A, boolean z8, boolean z9, String str5, C1612570s47 c1612570s47, String str6, DramaExtraTrackingParams dramaExtraTrackingParams, Aweme aweme) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = str3;
        this.LLILZLL = j;
        this.LLIZ = z3;
        this.LLIZLLLIL = i;
        this.LLJ = seriesCategory;
        this.LLJI = z4;
        this.LLJIJIL = str4;
        this.LLJILJIL = z5;
        this.LLJILJILJ = z6;
        this.LLJILLL = z7;
        this.LLJJ = c1612600s4A;
        this.LLJJI = z8;
        this.LLJJIII = z9;
        this.LLJJIJI = str5;
        this.LLJJIJIIJIL = c1612570s47;
        this.LLJJIJIL = str6;
        this.LLJJJ = dramaExtraTrackingParams;
        this.LLJJJIL = aweme;
    }
}
