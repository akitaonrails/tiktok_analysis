package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.net.URI;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05YQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05YQ {
    public static final C05YQ LIZ = new C05YQ();

    public static void LIZ(String str, final String str2, final InterfaceC1446480nkE interfaceC1446480nkE) {
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download model is ");
        sbLIZ.append(str2);
        C201955140j.LIZLLL(c1662160tM6, "AudioServiceManager", C2188811AlT.LIZIZ(sbLIZ));
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{str}, C2097608Jq.LJIIJ(new Pair(str, C1697810uHb.LJIILJJIL(str2))), new IFetchResourceListener() { // from class: X.0nkD
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onFailure(Exception exc) {
                InterfaceC1446480nkE interfaceC1446480nkE2 = interfaceC1446480nkE;
                if (interfaceC1446480nkE2 != null) {
                    interfaceC1446480nkE2.onFailure();
                }
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
                    C1662160tM6 c1662160tM62 = C1662160tM6.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append(" path is ");
                    sbLIZ2.append(strFindResourceUri);
                    C201955140j.LIZLLL(c1662160tM62, "AudioServiceManager", C2188811AlT.LIZIZ(sbLIZ2));
                    if (C123100dR.LIZ(strFindResourceUri)) {
                        String path = URI.create(strFindResourceUri).getPath();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str2);
                        sbLIZ3.append(" is download success, local path is ");
                        sbLIZ3.append(path);
                        C201955140j.LIZLLL(c1662160tM62, "AudioServiceManager", C2188811AlT.LIZIZ(sbLIZ3));
                        InterfaceC1446480nkE interfaceC1446480nkE2 = interfaceC1446480nkE;
                        if (interfaceC1446480nkE2 != null) {
                            interfaceC1446480nkE2.onSuccess(path);
                            return;
                        }
                        return;
                    }
                    InterfaceC1446480nkE interfaceC1446480nkE3 = interfaceC1446480nkE;
                    if (interfaceC1446480nkE3 != null) {
                        interfaceC1446480nkE3.onFailure();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC1446480nkE interfaceC1446480nkE4 = interfaceC1446480nkE;
                    if (interfaceC1446480nkE4 != null) {
                        interfaceC1446480nkE4.onFailure();
                    }
                    System.out.print(e.getStackTrace());
                }
            }
        });
    }
}
