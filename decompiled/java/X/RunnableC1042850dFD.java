package X;

import com.bytedance.lynx.hybrid.ssp.base.net.DefaultNetAdapter;
import com.google.gson.n;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0dFD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC1042850dFD implements Runnable {
    public final /* synthetic */ C1042860dFE LL;
    public final /* synthetic */ InterfaceC1042870dFF LLILLJJLI;

    public RunnableC1042850dFD(C1042860dFE c1042860dFE, InterfaceC1042870dFF interfaceC1042870dFF) {
        this.LL = c1042860dFE;
        this.LLILLJJLI = interfaceC1042870dFF;
    }

    public final void LIZ() {
        DefaultNetAdapter defaultNetAdapter = C1042900dFI.LJFF;
        C1042860dFE c1042860dFE = this.LL;
        InterfaceC1042870dFF interfaceC1042870dFF = this.LLILLJJLI;
        defaultNetAdapter.getClass();
        HashMap<String, String> map = new HashMap<>();
        map.put("ssp_sdk_version", "1");
        n nVar = new n();
        nVar.LJJIIJ("scheme_url", c1042860dFE.LIZ);
        nVar.LJJIIJ("url", c1042860dFE.LIZIZ);
        nVar.LJJIIJ("event", c1042860dFE.LIZJ);
        nVar.LJJIIJ("rule_domain", c1042860dFE.LIZLLL);
        nVar.LJJIIJ("hit_url", c1042860dFE.LJ);
        nVar.LJJIIJ("container_id", c1042860dFE.LJFF);
        nVar.LJJIIJ("page_info_id", c1042860dFE.LJI);
        nVar.LJJIIJ("event_time", c1042860dFE.LJII);
        nVar.LJJIII(Integer.valueOf(c1042860dFE.LJIIIIZZ), "index");
        nVar.LJJIIJ("extra", c1042860dFE.LJIIIZ);
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendRequest recording event. event:");
        sbLIZ.append(c1042860dFE.LIZJ);
        sbLIZ.append(", url:");
        sbLIZ.append(c1042860dFE.LIZIZ);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SspLifeCycle_", 2);
        defaultNetAdapter.LIZIZ(EnumC1042800dF8.POST, "https://scc.tiktokv.com/ssp_sdk/event_report", c1042860dFE.LIZIZ, defaultNetAdapter.LIZ, map, nVar, interfaceC1042870dFF, null, false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SSPBase@88ad.sendLandingPageRecordingEvent$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SSPBase@88ad.sendLandingPageRecordingEvent$1");
    }
}
