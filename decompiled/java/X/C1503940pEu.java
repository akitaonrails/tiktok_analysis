package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.bnpl.IBNPLService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503940pEu extends AbstractC1503900pEq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        IProbeService iProbeService;
        HashMap<String, Object> mapLJJLIIIJLJLI;
        IBNPLService iBNPLService;
        Map<String, String> mapLJ;
        String scene = ((InterfaceC1503910pEr) xBaseParamModel).getScene();
        if (scene == null || scene.length() == 0) {
            scene = "TTS_BNPL";
        }
        JSONObject jSONObjectLIZJ = C1722320uv8.LIZJ(scene, null);
        if (u.LJIJI(scene, "TTS_BNPL", true) && (iBNPLService = (IBNPLService) PluggableExtentionKt.pluggableSpi$default(IBNPLService.class, false, false, false, 14, null)) != null && (mapLJ = iBNPLService.LJ()) != null) {
            for (Map.Entry<String, String> entry : mapLJ.entrySet()) {
                jSONObjectLIZJ.put(entry.getKey(), entry.getValue());
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_bnpl_add_probe_info_in_riskinfo", true) && (iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null)) != null && (mapLJJLIIIJLJLI = iProbeService.LJJLIIIJLJLI()) != null) {
            for (Map.Entry<String, Object> entry2 : mapLJJLIIIJLJLI.entrySet()) {
                jSONObjectLIZJ.put(entry2.getKey(), entry2.getValue());
            }
        }
        String strValueOf = String.valueOf(jSONObjectLIZJ);
        if (strValueOf.length() == 0) {
            strValueOf = "{}";
        }
        if (strValueOf.length() > 0) {
            XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1503920pEs.class));
            ((InterfaceC1503920pEs) xBaseModelLIZLLL).setRiskInfo(strValueOf);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZLLL, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "risk info is empty", null, 4);
    }
}
