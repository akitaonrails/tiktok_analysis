package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.graph.spi.IAIGCArchRegistry;
import com.ss.android.ugc.aweme.aigc.graph.spi.IDfCameraBizAigcContributor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.tools.integration.plugin.album.CreationBizAlbumPlatformPluginBridgeService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginState;
import kotlin.Unit;

/* JADX INFO: renamed from: X.13zg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC20192613zg implements Runnable {
    public static final RunnableC20192613zg LL = new RunnableC20192613zg();

    public static void LIZ() {
        Object c098200Yq;
        C20192713zh c20192713zh = C20192713zh.LIZ;
        CreativeToolsBizPluginState.Installed installed = new CreativeToolsBizPluginState.Installed(false);
        c20192713zh.getClass();
        C20192713zh.LIZJ(installed);
        C547350LdN.LIZ(true);
        IDfCameraBizAigcContributor iDfCameraBizAigcContributor = (IDfCameraBizAigcContributor) C0WYG.LIZ(IDfCameraBizAigcContributor.class, "com.ss.android.ugc.aweme.tools.aab.DfCameraBizAigcContributor");
        IAIGCArchRegistry iAIGCArchRegistry = (IAIGCArchRegistry) PluggableExtentionKt.pluggableSpi$default(IAIGCArchRegistry.class, false, false, false, 14, null);
        if (iDfCameraBizAigcContributor == null || iAIGCArchRegistry == null) {
            C554740LpI c554740LpI = C554740LpI.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIGC Arch contribution skipped: contributor=");
            sbLIZ.append(iDfCameraBizAigcContributor);
            sbLIZ.append(", registry=");
            sbLIZ.append(iAIGCArchRegistry);
            C201955140j.LJIIIIZZ(c554740LpI, "CreativeToolsBizPluginManager", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            try {
                iDfCameraBizAigcContributor.LIZ(iAIGCArchRegistry);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                C201955140j.LIZLLL(C554740LpI.LIZIZ, "CreativeToolsBizPluginManager", "AIGC Arch contribution pushed for com.ss.android.ugc.aweme.df_camera_biz");
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C554740LpI c554740LpI2 = C554740LpI.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AIGC Arch contribution failed: ");
                sbLIZ2.append(thM5exceptionOrNullimpl);
                C201955140j.LJIIIIZZ(c554740LpI2, "CreativeToolsBizPluginManager", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        CreationBizAlbumPlatformPluginBridgeService.LIZ.getClass();
        if (PluggableExtentionKt.pluggableSpi$default(CreationBizAlbumPlatformPluginBridgeService.class, false, false, false, 14, null) == null) {
            ServiceManager.get().bind(CreationBizAlbumPlatformPluginBridgeService.class, new ServiceProvider() { // from class: X.04n3
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    Object c098200Yq2;
                    try {
                        Object objNewInstance = Class.forName("com.ss.android.ugc.aweme.tools.integration.plugin.album.CreationBizAlbumPlatformPluginBridgeServiceImpl").newInstance();
                        c098200Yq2 = objNewInstance instanceof CreationBizAlbumPlatformPluginBridgeService ? (CreationBizAlbumPlatformPluginBridgeService) objNewInstance : null;
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        return null;
                    }
                    return c098200Yq2;
                }
            }).asSingleton();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CreativeToolsBizPluginManager@a596.markInstalledAndEnsureRegistered$action$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreativeToolsBizPluginManager@a596.markInstalledAndEnsureRegistered$action$1");
    }
}
