package X;

import android.text.TextUtils;
import com.ss.android.ttve.nativePort.TEEffectUtils;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.net.URI;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0tJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1660840tJy {
    public static void LIZ(final InterfaceC1660860tK0 interfaceC1660860tK0) {
        C201955140j.LIZ("start download aec model");
        final String audioAECModelName = TEEffectUtils.getAudioAECModelName();
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"AudioAECModel"}, C2097608Jq.LJIIJ(new Pair("AudioAECModel", C1697810uHb.LJIILJJIL(audioAECModelName))), new IFetchResourceListener() { // from class: X.0tJz
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onFailure(Exception exc) {
                InterfaceC1660860tK0 interfaceC1660860tK02 = interfaceC1660860tK0;
                if (interfaceC1660860tK02 != null) {
                    interfaceC1660860tK02.LIZ(exc);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onSuccess(long j) {
                String strFindResourceUri;
                if (C13Q5.LIZJ()) {
                    strFindResourceUri = C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, audioAECModelName);
                } else {
                    strFindResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, audioAECModelName);
                }
                if (TextUtils.isEmpty(strFindResourceUri)) {
                    InterfaceC1660860tK0 interfaceC1660860tK02 = interfaceC1660860tK0;
                    if (interfaceC1660860tK02 != null) {
                        interfaceC1660860tK02.onSuccess("");
                        return;
                    }
                    return;
                }
                String path = URI.create(strFindResourceUri).getPath();
                InterfaceC1660860tK0 interfaceC1660860tK03 = interfaceC1660860tK0;
                if (interfaceC1660860tK03 != null) {
                    interfaceC1660860tK03.onSuccess(path);
                }
            }
        });
    }
}
