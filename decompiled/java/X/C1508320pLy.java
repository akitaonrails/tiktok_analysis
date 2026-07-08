package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.player.PlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;

/* JADX INFO: renamed from: X.0pLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508320pLy {
    public static InterfaceC1508380pM4 LIZ() {
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IPlayerDependencyService.class.getName(), anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
        }
        return ((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin).getSharedPlayerManager();
    }
}
