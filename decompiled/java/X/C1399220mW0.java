package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mW0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399220mW0 extends C09AY implements Function0<IAILiveService> {
    public C1399220mW0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IAILiveService invoke() {
        IAILiveService aILiveService;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (aILiveService = iExternalService.getAILiveService()) != null) {
            return aILiveService;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
