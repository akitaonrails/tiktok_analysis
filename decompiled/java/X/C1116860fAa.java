package X;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.live.strategy.HostClientAiService$wrapperLivePitayaCore$1;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116860fAa extends AbstractC1116880fAc {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        HostClientAiService$wrapperLivePitayaCore$1 hostClientAiService$wrapperLivePitayaCore$1LJIJJLI;
        C157V hostClientAiService;
        InterfaceC1116870fAb interfaceC1116870fAb = (InterfaceC1116870fAb) xBaseParamModel;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null && (hostClientAiService = iHostAction.getHostClientAiService()) != null) {
            hostClientAiService$wrapperLivePitayaCore$1LJIJJLI = hostClientAiService.LJIJJLI();
        } else {
            hostClientAiService$wrapperLivePitayaCore$1LJIJJLI = null;
        }
        if (hostClientAiService$wrapperLivePitayaCore$1LJIJJLI != null && hostClientAiService$wrapperLivePitayaCore$1LJIJJLI.LIZ()) {
            Map<String, Object> inputParams = interfaceC1116870fAb.getInputParams();
            if (inputParams == null) {
                inputParams = C2097608Jq.LJ();
            }
            hostClientAiService$wrapperLivePitayaCore$1LJIJJLI.LIZLLL(interfaceC1116870fAb.getTaskKey(), new JSONObject(inputParams), new InterfaceC472990Igj() { // from class: X.0fAe
                @Override // X.InterfaceC472990Igj
                public final void LIZ(C1093210eYR c1093210eYR) {
                    JavaOnlyMap javaOnlyMapLIZIZ;
                    JSONObject jSONObject = c1093210eYR.LIZIZ;
                    Integer numValueOf = null;
                    if (jSONObject == null) {
                        javaOnlyMapLIZIZ = null;
                    } else {
                        C1297550js1.LIZ.getClass();
                        javaOnlyMapLIZIZ = C1297550js1.LIZIZ(jSONObject);
                    }
                    CompletionBlock<InterfaceC1116890fAd> completionBlock2 = completionBlock;
                    this.getClass();
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1116890fAd.class, null);
                    InterfaceC1116890fAd interfaceC1116890fAd = (InterfaceC1116890fAd) xBaseModelLIZJ;
                    interfaceC1116890fAd.setOutputParams(javaOnlyMapLIZIZ);
                    PTYError pTYError = c1093210eYR.LIZJ;
                    if (pTYError != null) {
                        numValueOf = Integer.valueOf(pTYError.getCode());
                    }
                    interfaceC1116890fAd.setErrorCode(numValueOf);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                }
            }, new C464190IIf(0L, 63));
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "pitaya environment is not ready", null, 4);
    }
}
