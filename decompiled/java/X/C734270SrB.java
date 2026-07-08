package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.service.optimistic.IOptimisticPluginService;
import com.ss.android.ugc.aweme.localservice.service.optimistic.OptimisticPluginEmptyService;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: renamed from: X.0SrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734270SrB implements IOptimisticPluginService {
    public static final C734270SrB LIZIZ = new C734270SrB();
    public final /* synthetic */ IOptimisticPluginService LIZ;

    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IOptimisticPluginService
    public final C0O3D LIZ(Context context, String str, Bundle bundle, AFwS198S0000000_11 aFwS198S0000000_11, AFwS243S0000000_11 aFwS243S0000000_11) {
        return this.LIZ.LIZ(context, str, bundle, aFwS198S0000000_11, aFwS243S0000000_11);
    }

    public C734270SrB() {
        IOptimisticPluginService iOptimisticPluginService = (IOptimisticPluginService) PluggableExtentionKt.pluggableSpi$default(IOptimisticPluginService.class, false, false, false, 14, null);
        this.LIZ = iOptimisticPluginService == null ? new OptimisticPluginEmptyService() : iOptimisticPluginService;
    }
}
