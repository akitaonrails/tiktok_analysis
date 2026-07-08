package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0h4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190040h4c implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final PoiReviewsApi.PoiReviewModel LIZJ;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public C1190040h4c(String str, String str2, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = poiReviewModel;
    }
}
