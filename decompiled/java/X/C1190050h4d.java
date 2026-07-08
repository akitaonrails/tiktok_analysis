package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0h4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190050h4d implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final Function1<PoiReviewsApi.PoiReviewModel, Unit> LIZJ;

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

    public C1190050h4d(String str, String str2, AwS597S0100000_18 awS597S0100000_18) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = awS597S0100000_18;
    }
}
