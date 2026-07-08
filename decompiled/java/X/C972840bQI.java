package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutQosMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutLayerQosMonitorFilterRule;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0bQI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972840bQI implements InterfaceC972880bQM {
    public final C2177031AIb LL;
    public final InterfaceC2181771Aa7 LLILLJJLI;
    public LinkMicLayoutQosMonitor LLILLL = null;
    public final Set<String> LLILZ = C13LQ.LJLIIL(new String[]{"FromSei", "LayoutStateMessage"});

    @Override // X.InterfaceC972880bQM
    public final void LIZ(C972850bQJ c972850bQJ) throws JSONException {
        Object obj;
        C2181461AZc c2181461AZc;
        StringBuilder sb = new StringBuilder("reportEvent:");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_key", c972850bQJ.LIZ);
        jSONObject.put("params", new JSONObject(c972850bQJ.LIZIZ));
        sb.append(jSONObject);
        C20441214yg.LIZIZ("LinkMicLayoutMonitor", sb.toString());
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            boolean zLJJJJ = C13LP.LJJJJ(c972850bQJ.LIZIZ.get("source"), this.LLILZ);
            if (a0.LJJIIZI(c972850bQJ.LIZ, "linkmic_layout_layer", false) && LinkMicLayoutLayerQosMonitorFilterRule.INSTANCE.getEventBlockedList(zLJJJJ).contains(c972850bQJ.LIZ)) {
                return;
            }
        }
        String str = "";
        if (a0.LJJIIZI(c972850bQJ.LIZ, "livesdk_linkmic_layout_layer_start", false)) {
            String str2 = c972850bQJ.LIZIZ.get("switch_id");
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                InterfaceC2181771Aa7 interfaceC2181771Aa7 = this.LLILLJJLI;
                if ((interfaceC2181771Aa7 instanceof C2181461AZc) && (c2181461AZc = (C2181461AZc) interfaceC2181771Aa7) != null) {
                    c2181461AZc.LLJLIL(str2);
                }
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(c972850bQJ.LIZ);
        String str3 = c972850bQJ.LIZIZ.get("switch_id");
        if (str3 != null) {
            str = str3;
        }
        HashMap map = new HashMap();
        map.put(Scene.SCENE_SERVICE, String.valueOf(this.LL.LIZIZ));
        String str4 = "1";
        if (C123100dR.LIZ(str)) {
            if (this.LLILLJJLI.LJJJLL(str)) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("room_enter_refresh", obj);
        }
        c474500IjALIZ.LJJIIZI(map);
        Map<String, String> map2 = c972850bQJ.LIZIZ;
        HashMap map3 = new HashMap();
        map3.putAll(map2);
        try {
            map3.put("nqe_score", String.valueOf(TTNetInit.getEffectiveConnectionType()));
            map3.put("http_rtt", String.valueOf(TTNetInit.getNetworkQuality().LIZIZ));
            map3.put("trans_rtt", String.valueOf(TTNetInit.getNetworkQuality().LIZ));
            map3.put("connection_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType());
            w.LIZ.getClass();
            map3.put("enter_method", w.LJIIL());
            map3.put("enter_from_merge", w.LJIIIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c474500IjALIZ.LJJIIZI(map3);
        HashMap map4 = new HashMap();
        if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).wc0()) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map4.put("in_bg", str4);
        c474500IjALIZ.LJJIIZI(map4);
        c474500IjALIZ.LIZ();
    }

    public C972840bQI(C2177031AIb c2177031AIb, InterfaceC2181771Aa7 interfaceC2181771Aa7) {
        this.LL = c2177031AIb;
        this.LLILLJJLI = interfaceC2181771Aa7;
    }
}
