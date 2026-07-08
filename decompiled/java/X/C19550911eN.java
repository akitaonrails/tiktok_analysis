package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.audio.IAudioModeAVEnvOpt;
import com.ss.android.ugc.aweme.services.audio.IAudioModelService;
import com.ss.android.ugc.aweme.services.audio.IAudioParams;
import com.ss.android.ugc.aweme.services.audio.IAudioService;
import com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory;
import com.ss.android.ugc.aweme.services.audio.IDownloadModelCallback;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.net.URI;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11eN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19550911eN implements IAudioModelService, IAudioServiceFactory<IAudioModeAVEnvOpt> {
    public IAudioModeAVEnvOpt LIZ;

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory
    public final IAudioService getAudioService(IAudioParams iAudioParams) {
        this.LIZ = (IAudioModeAVEnvOpt) iAudioParams;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioModelService
    public final void fetchResourcesByRequirementsAndModelNames(String str, final String str2, final IDownloadModelCallback iDownloadModelCallback) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        CreativeToolsPluginService creativeToolsPluginService;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_fix_audio_metrics_ve_aab2", true, true) || ((abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null && creativeToolsPluginService.LJI(activityLIZIZ))) {
            IAudioModeAVEnvOpt iAudioModeAVEnvOpt = this.LIZ;
            if (iAudioModeAVEnvOpt != null) {
                iAudioModeAVEnvOpt.initDownloadableModel();
            }
            DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{str}, C2097608Jq.LJIIJ(new Pair(str, C1697810uHb.LJIILJJIL(str2))), new IFetchResourceListener() { // from class: X.13U0
                @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                public final void onFailure(Exception exc) {
                    iDownloadModelCallback.onFailure();
                }

                @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                public final void onSuccess(long j) {
                    String strFindResourceUri;
                    try {
                        if (C13Q5.LIZJ()) {
                            strFindResourceUri = C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, str2);
                        } else {
                            strFindResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, str2);
                        }
                        if (C123100dR.LIZ(strFindResourceUri)) {
                            iDownloadModelCallback.onSuccess(URI.create(strFindResourceUri).getPath());
                        } else {
                            iDownloadModelCallback.onFailure();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        System.out.print(e.getStackTrace());
                        iDownloadModelCallback.onFailure();
                    }
                }
            });
            return;
        }
        iDownloadModelCallback.onFailure();
    }
}
