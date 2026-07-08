package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.dependency.player.PlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0pMC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508460pMC {
    public static final C1508460pMC LIZ = new C1508460pMC();

    public static void LIZ(ProductPackStruct productPackStruct) {
        ProductBase productBase;
        Video video;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (video = productBase.descVideo) != null) {
            try {
                Aweme awemeLIZ = video.LIZ();
                LIZ.getClass();
                LIZIZ(awemeLIZ);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZIZ(Aweme aweme) {
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IPlayerDependencyService.class.getName();
            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
        }
        ((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin).preloadDescVideo(aweme);
    }
}
