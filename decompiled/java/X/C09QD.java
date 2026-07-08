package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09QD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09QD extends C09AY implements Function0<IAVPublishService> {
    public C09QD() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IAVPublishService invoke() {
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null) {
            return iExternalService.publishService();
        }
        return null;
    }
}
