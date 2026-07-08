package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.net.URI;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0npd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449830npd {
    public static final C1449830npd LIZ = new C1449830npd();
    public static String LIZIZ = "";

    public static void LIZ(final InterfaceC1449840npe interfaceC1449840npe) {
        if (C2286708xd.LIZJ(LIZIZ)) {
            interfaceC1449840npe.onSuccess();
        } else {
            DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"requirement_ftgru"}, C2097608Jq.LJIIJ(new Pair("requirement_ftgru", C1697810uHb.LJIILJJIL("unet_denoise_44k_music_model_v1.0"))), new IFetchResourceListener() { // from class: X.0npc
                @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                public final void onFailure(Exception exc) {
                    InterfaceC1449840npe interfaceC1449840npe2 = interfaceC1449840npe;
                    if (interfaceC1449840npe2 != null) {
                        interfaceC1449840npe2.onFailure();
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                public final void onSuccess(long j) {
                    String strFindResourceUri;
                    try {
                        if (C13Q5.LIZJ()) {
                            strFindResourceUri = C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, "unet_denoise_44k_music_model_v1.0");
                        } else {
                            strFindResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, "unet_denoise_44k_music_model_v1.0");
                        }
                        if (C123100dR.LIZ(strFindResourceUri)) {
                            C1449830npd c1449830npd = C1449830npd.LIZ;
                            String path = URI.create(strFindResourceUri).getPath();
                            c1449830npd.getClass();
                            C1449830npd.LIZIZ = path;
                        }
                        InterfaceC1449840npe interfaceC1449840npe2 = interfaceC1449840npe;
                        if (interfaceC1449840npe2 != null) {
                            interfaceC1449840npe2.onSuccess();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        System.out.print(e.getStackTrace());
                    }
                }
            });
        }
    }
}
