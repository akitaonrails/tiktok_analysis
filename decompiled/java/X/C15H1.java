package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.service.ICommerceService;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: renamed from: X.15H1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15H1 implements ICommerceService {
    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final boolean LIZ(Context context, String str) {
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);
        if (iMainService == null) {
            return false;
        }
        return iMainService.openAdOpenUrl(context, str, false);
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final boolean openAdWebUrl(Context context, String str, String str2) {
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);
        if (iMainService == null) {
            return false;
        }
        return iMainService.openAdWebUrl(context, str, str2);
    }
}
