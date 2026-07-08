package X;

import android.content.Intent;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611800s2s implements InterfaceC2753014t, InterfaceC111300bX {
    public final long LL;
    public final String LLILLJJLI;
    public final EnumC1612760s4Q LLILLL;
    public final Intent LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final long LLIZ;
    public final boolean LLIZLLLIL;
    public final int LLJ;
    public final MutableLiveData<InterfaceC1236080iGs> LLJI;
    public final MutableLiveData<Object> LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final int LLJJ;
    public final CollectionDetailModel LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;
    public final C1612600s4A LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public final String LLJJJIL;
    public final String LLJJJJ;
    public final boolean LLJJJJJIL;
    public final DramaExtraTrackingParams LLJJJJLIIL;
    public final String LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(506));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1611800s2s)) {
            return false;
        }
        C1611800s2s c1611800s2s = (C1611800s2s) obj;
        return this.LL == c1611800s2s.LL && Intrinsics.LJFF(this.LLILLJJLI, c1611800s2s.LLILLJJLI) && this.LLILLL == c1611800s2s.LLILLL && Intrinsics.LJFF(this.LLILZ, c1611800s2s.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1611800s2s.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1611800s2s.LLILZLL) && this.LLIZ == c1611800s2s.LLIZ && this.LLIZLLLIL == c1611800s2s.LLIZLLLIL && this.LLJ == c1611800s2s.LLJ && Intrinsics.LJFF(this.LLJI, c1611800s2s.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1611800s2s.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1611800s2s.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1611800s2s.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1611800s2s.LLJILLL) && this.LLJJ == c1611800s2s.LLJJ && Intrinsics.LJFF(this.LLJJI, c1611800s2s.LLJJI) && this.LLJJIII == c1611800s2s.LLJJIII && this.LLJJIJI == c1611800s2s.LLJJIJI && Intrinsics.LJFF(this.LLJJIJIIJIL, c1611800s2s.LLJJIJIIJIL) && this.LLJJIJIL == c1611800s2s.LLJJIJIL && this.LLJJJ == c1611800s2s.LLJJJ && Intrinsics.LJFF(this.LLJJJIL, c1611800s2s.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c1611800s2s.LLJJJJ) && this.LLJJJJJIL == c1611800s2s.LLJJJJJIL && Intrinsics.LJFF(this.LLJJJJLIIL, c1611800s2s.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c1611800s2s.LLJJL);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        Intent intent = this.LLILZ;
        int iHashCode = (((((((((((((((iY2 + (intent == null ? 0 : intent.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31;
        String str = this.LLJILJIL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJILJILJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJILLL;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLJJ) * 31;
        CollectionDetailModel collectionDetailModel = this.LLJJI;
        int iHashCode5 = (((((iHashCode4 + (collectionDetailModel == null ? 0 : collectionDetailModel.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31;
        C1612600s4A c1612600s4A = this.LLJJIJIIJIL;
        int iHashCode6 = (((((iHashCode5 + (c1612600s4A == null ? 0 : c1612600s4A.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31;
        String str4 = this.LLJJJIL;
        int iHashCode7 = (((((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LLJJJJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJJJJIL)) * 31;
        DramaExtraTrackingParams dramaExtraTrackingParams = this.LLJJJJLIIL;
        return ((iHashCode7 + (dramaExtraTrackingParams != null ? dramaExtraTrackingParams.hashCode() : 0)) * 31) + this.LLJJL.hashCode();
    }

    public final String toString() {
        return "SeriesDetailHierarchyData(collectionId=" + this.LL + ", enterFrom=" + this.LLILLJJLI + ", entrySource=" + this.LLILLL + ", intent=" + this.LLILZ + ", sessionId=" + this.LLILZIL + ", detailVideoListSessionId=" + this.LLILZLL + ", roomId=" + this.LLIZ + ", hideBackButton=" + this.LLIZLLLIL + ", purchaseButtonText=" + this.LLJ + ", purchaseListener=" + this.LLJI + ", scrollListener=" + this.LLJIJIL + ", anchorId=" + this.LLJILJIL + ", anchorVideoId=" + this.LLJILJILJ + ", anchorGroupId=" + this.LLJILLL + ", anchorNumber=" + this.LLJJ + ", collectionDetailModelFromList=" + this.LLJJI + ", isAd=" + this.LLJJIII + ", isFromBottomBanner=" + this.LLJJIJI + ", anchorInfo=" + this.LLJJIJIIJIL + ", isLimitedFree=" + this.LLJJIJIL + ", isFromHotZone=" + this.LLJJJ + ", sourceCard=" + this.LLJJJIL + ", rootScene=" + this.LLJJJJ + ", isFromDramaComponent=" + this.LLJJJJJIL + ", dramaExtraTrackingParams=" + this.LLJJJJLIIL + ", seriesEnterEntrance=" + this.LLJJL + ')';
    }

    public C1611800s2s(long j, String str, EnumC1612760s4Q enumC1612760s4Q, Intent intent, String str2, String str3, long j2, boolean z, int i, MutableLiveData<InterfaceC1236080iGs> mutableLiveData, MutableLiveData<Object> mutableLiveData2, String str4, String str5, String str6, int i2, CollectionDetailModel collectionDetailModel, boolean z2, boolean z3, C1612600s4A c1612600s4A, boolean z4, boolean z5, String str7, String str8, boolean z6, DramaExtraTrackingParams dramaExtraTrackingParams, String str9) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = enumC1612760s4Q;
        this.LLILZ = intent;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = j2;
        this.LLIZLLLIL = z;
        this.LLJ = i;
        this.LLJI = mutableLiveData;
        this.LLJIJIL = mutableLiveData2;
        this.LLJILJIL = str4;
        this.LLJILJILJ = str5;
        this.LLJILLL = str6;
        this.LLJJ = i2;
        this.LLJJI = collectionDetailModel;
        this.LLJJIII = z2;
        this.LLJJIJI = z3;
        this.LLJJIJIIJIL = c1612600s4A;
        this.LLJJIJIL = z4;
        this.LLJJJ = z5;
        this.LLJJJIL = str7;
        this.LLJJJJ = str8;
        this.LLJJJJJIL = z6;
        this.LLJJJJLIIL = dramaExtraTrackingParams;
        this.LLJJL = str9;
    }
}
