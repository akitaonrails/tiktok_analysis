package X;

import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import java.net.URI;

/* JADX INFO: renamed from: X.0o7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461160o7u {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        final String strFindResourceUri;
        if (!((Boolean) C283080B7q.LIZ.getValue()).booleanValue() || (strFindResourceUri = C13Q5.LIZ().LIZLLL().findResourceUri("aed40_5m")) == null) {
            strFindResourceUri = "";
        }
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, new String[]{"aed40_5m"}, new FetchResourcesListener() { // from class: X.0o7t
            @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
            public final void onSuccess() {
                String strFindResourceUri2 = C13Q5.LIZ().LIZLLL().findResourceUri("aed40_5m");
                if (strFindResourceUri2 == null) {
                    strFindResourceUri2 = "";
                }
                if (!C123100dR.LIZ(strFindResourceUri2)) {
                    InterfaceC1364105Vn<C1461140o7s> interfaceC1364105Vn2 = c23260099m;
                    C1461140o7s c1461140o7s = new C1461140o7s("", 50001, "can't find model");
                    C189200o6.m2constructorimpl(c1461140o7s);
                    interfaceC1364105Vn2.resumeWith(c1461140o7s);
                    return;
                }
                String path = URI.create(strFindResourceUri2).getPath();
                InterfaceC1364105Vn<C1461140o7s> interfaceC1364105Vn3 = c23260099m;
                C1461140o7s c1461140o7s2 = new C1461140o7s(path);
                C189200o6.m2constructorimpl(c1461140o7s2);
                interfaceC1364105Vn3.resumeWith(c1461140o7s2);
            }

            @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
            public final void onFailed(Exception exc) {
                String message;
                if (((Boolean) C283080B7q.LIZ.getValue()).booleanValue() && C123100dR.LIZ(strFindResourceUri)) {
                    String path = URI.create(strFindResourceUri).getPath();
                    if (C2286708xd.LIZJ(path)) {
                        InterfaceC1364105Vn<C1461140o7s> interfaceC1364105Vn2 = c23260099m;
                        C1461140o7s c1461140o7s = new C1461140o7s(path);
                        C189200o6.m2constructorimpl(c1461140o7s);
                        interfaceC1364105Vn2.resumeWith(c1461140o7s);
                        return;
                    }
                }
                InterfaceC1364105Vn<C1461140o7s> interfaceC1364105Vn3 = c23260099m;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download failed,");
                if (exc != null) {
                    message = exc.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C1461140o7s c1461140o7s2 = new C1461140o7s("", 50000, C2188811AlT.LIZIZ(sbLIZ));
                C189200o6.m2constructorimpl(c1461140o7s2);
                interfaceC1364105Vn3.resumeWith(c1461140o7s2);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
