package X;

import com.ss.android.ugc.tiktok.pns.upc.config.UPCNetworkReportingConfigData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00jL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C159700jL implements InterfaceC160100jP {
    public static final C159700jL LIZ = new C159700jL();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(446));

    @Override // X.InterfaceC160100jP
    public final void LIZ(C159800jM c159800jM, C112500bj c112500bj, Throwable th) {
    }

    @Override // X.InterfaceC160100jP
    public final void LIZJ(C159800jM c159800jM) {
        List<String> list;
        String str = c159800jM.LIZ;
        if (str.length() == 0) {
            return;
        }
        UPCNetworkReportingConfigData uPCNetworkReportingConfigData = (UPCNetworkReportingConfigData) LIZJ.getValue();
        if (uPCNetworkReportingConfigData != null && (list = uPCNetworkReportingConfigData.upcNetworkPathBlockList) != null && !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (a0.LJJIIZI(str, it2.next(), false)) {
                    return;
                }
            }
        }
        C20684815ws.LJIILLIIL("upc_network_request_started", C2097908Jt.LIZJ(new Pair("url_path", str)));
    }
}
