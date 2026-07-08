package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MUY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MUY extends C09AY implements Function0<IAnchorService> {
    public C0MUY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IAnchorService invoke() {
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null) {
            return iExternalService.anchorService();
        }
        return null;
    }
}
