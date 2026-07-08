package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0goT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180030goT implements Serializable {
    public boolean hasDoClick;
    public boolean hasShowRatingModule;
    public boolean hasShowReasonModule;
    public boolean hasShown;
    public List<PoiReviewsApi.NegativeReason> npsSelectedReason;
    public EnumC1157540gEC npsShowStep;
    public String recordId;
    public Integer selectedScore;

    public C1180030goT() {
        this(null, null, false, null, null, false, false, false);
    }

    public final void setHasDoClick(boolean z) {
        this.hasDoClick = z;
    }

    public final void setHasShowRatingModule(boolean z) {
        this.hasShowRatingModule = z;
    }

    public final void setHasShowReasonModule(boolean z) {
        this.hasShowReasonModule = z;
    }

    public final void setHasShown(boolean z) {
        this.hasShown = z;
    }

    public final void setNpsSelectedReason(List<PoiReviewsApi.NegativeReason> list) {
        this.npsSelectedReason = list;
    }

    public final void setNpsShowStep(EnumC1157540gEC enumC1157540gEC) {
        this.npsShowStep = enumC1157540gEC;
    }

    public final void setRecordId(String str) {
        this.recordId = str;
    }

    public final void setSelectedScore(Integer num) {
        this.selectedScore = num;
    }

    public C1180030goT(EnumC1157540gEC enumC1157540gEC, List<PoiReviewsApi.NegativeReason> list, boolean z, Integer num, String str, boolean z2, boolean z3, boolean z4) {
        this.npsShowStep = enumC1157540gEC;
        this.npsSelectedReason = list;
        this.hasDoClick = z;
        this.selectedScore = num;
        this.recordId = str;
        this.hasShowRatingModule = z2;
        this.hasShowReasonModule = z3;
        this.hasShown = z4;
    }
}
