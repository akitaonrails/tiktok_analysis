package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZF7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZF7 extends C09AY implements Function0<IMSayhiAnalytics> {
    public C0ZF7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IMSayhiAnalytics invoke() {
        return ((IIMService) ServiceManager.get().getService(IIMService.class)).getImSayhiAnalytics();
    }
}
