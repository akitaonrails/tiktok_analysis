package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;

/* JADX INFO: renamed from: X.0597, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0597 {
    public static final boolean LIZ() {
        Object c098200Yq;
        try {
            INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
            c098200Yq = iNetworkStateService != null ? iNetworkStateService.getNetworkStatus() : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null || c098200Yq == EnumC325100Com.NOT_AVAILABLE || c098200Yq == EnumC325100Com.FAKE) ? false : true;
    }
}
