package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.business.TTRecommendationDSAConsentSDKHandlerServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1193204le extends C09AY implements Function0<Keva> {
    public final /* synthetic */ TTRecommendationDSAConsentSDKHandlerServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1193204le(TTRecommendationDSAConsentSDKHandlerServiceImpl tTRecommendationDSAConsentSDKHandlerServiceImpl) {
        super(0);
        this.LL = tTRecommendationDSAConsentSDKHandlerServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo(this.LL.LIZJ);
    }
}
