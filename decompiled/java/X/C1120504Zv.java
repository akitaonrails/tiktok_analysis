package X;

import com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECInitConfigProviderService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1120504Zv extends C09AY implements Function0<C1121904a9> {
    public C1120504Zv() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1121904a9 invoke() {
        IECInitConfigProviderService iECInitConfigProviderService = (IECInitConfigProviderService) PluggableExtentionKt.pluggableSpi$default(IECInitConfigProviderService.class, false, false, false, 14, null);
        if (iECInitConfigProviderService != null) {
            return iECInitConfigProviderService.LIZ();
        }
        return null;
    }
}
