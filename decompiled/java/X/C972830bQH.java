package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutLayerQosMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutLayerQosMonitorFilterRule;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0bQH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972830bQH implements InterfaceC972880bQM {
    public final Function0<Boolean> LL;
    public final Set<String> LLILLJJLI = C13LQ.LJLIIL(new String[]{"apply", "invite"});
    public final Set<String> LLILLL = C13LQ.LJLIIL(new String[]{"FromSei", "LayoutStateMessage"});

    public C972830bQH(Function0<Boolean> function0) {
        this.LL = function0;
    }

    @Override // X.InterfaceC972880bQM
    public final void LIZ(C972850bQJ c972850bQJ) throws JSONException {
        String str;
        StringBuilder sb = new StringBuilder("reportEvent:");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_key", c972850bQJ.LIZ);
        jSONObject.put("params", new JSONObject(c972850bQJ.LIZIZ));
        sb.append(jSONObject);
        C20441214yg.LIZIZ("LinkMicEventMonitor", sb.toString());
        if (LinkMicLayoutLayerQosMonitor.INSTANCE.isEnable() && !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            boolean zLJJJJ = C13LP.LJJJJ(c972850bQJ.LIZIZ.get("source"), this.LLILLL);
            if (a0.LJJIIZI(c972850bQJ.LIZ, "linkmic_layout_layer", false) && LinkMicLayoutLayerQosMonitorFilterRule.INSTANCE.getEventBlockedList(zLJJJJ).contains(c972850bQJ.LIZ)) {
                return;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(c972850bQJ.LIZ);
        Map<String, String> map = c972850bQJ.LIZIZ;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        try {
            map2.put("nqe_score", String.valueOf(TTNetInit.getEffectiveConnectionType()));
            map2.put("http_rtt", String.valueOf(TTNetInit.getNetworkQuality().LIZIZ));
            map2.put("trans_rtt", String.valueOf(TTNetInit.getNetworkQuality().LIZ));
            map2.put("connection_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType());
            w.LIZ.getClass();
            map2.put("enter_method", w.LJIIL());
            map2.put("enter_from_merge", w.LJIIIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c474500IjALIZ.LJJIIZI(map2);
        HashMap map3 = new HashMap();
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).wc0()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map3.put("in_bg", str);
        c474500IjALIZ.LJJIIZI(map3);
        try {
            LIZIZ(c972850bQJ, c474500IjALIZ);
            c474500IjALIZ.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c474500IjALIZ.LIZ();
            throw th;
        }
    }

    public final void LIZIZ(C972850bQJ c972850bQJ, C474500IjA c474500IjA) {
        Object objValueOf;
        if (u.LJIIZILJ(c972850bQJ.LIZ, "livesdk_linkmic_api_finish", false) && C13LP.LJJJJ(c972850bQJ.LIZIZ.get("api_name"), this.LLILLJJLI)) {
            String str = c972850bQJ.LIZIZ.get("api_name");
            if (Intrinsics.LJFF(str, "apply")) {
                objValueOf = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
            } else if (Intrinsics.LJFF(str, "invite")) {
                objValueOf = c972850bQJ.LIZIZ.get("remote_user_id");
            } else {
                objValueOf = null;
            }
            c474500IjA.LJJII(objValueOf, "target_id");
            new C945340ahw(c474500IjA).LIZ((Pair[]) Arrays.copyOf(new Pair[]{new Pair("apiResponse", "finish")}, 1));
        }
    }
}
