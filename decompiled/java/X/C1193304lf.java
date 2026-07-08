package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.business.TTSearchDSAConsentSDKHandlerServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1193304lf extends C09AY implements Function0<Keva> {
    public final /* synthetic */ TTSearchDSAConsentSDKHandlerServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1193304lf(TTSearchDSAConsentSDKHandlerServiceImpl tTSearchDSAConsentSDKHandlerServiceImpl) {
        super(0);
        this.LL = tTSearchDSAConsentSDKHandlerServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo(this.LL.LIZJ);
    }
}
