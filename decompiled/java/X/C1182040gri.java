package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.SlashParam;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0gri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182040gri extends AbstractC1182160gru {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        final String containerID;
        InterfaceC1182150grt interfaceC1182150grt = (InterfaceC1182150grt) xBaseParamModel;
        String sessionID = interfaceC1182150grt.getSessionID();
        if (sessionID.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        List<SlashParam> listSingletonList = null;
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "business not math or sessionId is null", null, 4);
            return;
        }
        InterfaceC1181010gq3 interfaceC1181010gq3LJFF = C1180170goh.LJFF(sessionID);
        if (interfaceC1181010gq3LJFF == null) {
            C2382909Vj.LIZ(completionBlock, 0, "did not find slashContainer", null, 4);
            return;
        }
        String instanceId = interfaceC1182150grt.getInstanceId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : interfaceC1182150grt.getBusinessQueryParam().entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        SlashParam slashParamLIZJ = C1180170goh.LIZJ(sessionID, instanceId);
        C1181930grX c1181930grXPu2 = interfaceC1181010gq3LJFF.Pu2();
        String str = c1181930grXPu2.LIZ;
        String str2 = c1181930grXPu2.LIZIZ;
        C1227904rF.LIZ.getClass();
        SlashRequestParam slashRequestParam = new SlashRequestParam(str, str2, C1227904rF.LJI(slashParamLIZJ), linkedHashMap, null, null);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        if (slashParamLIZJ != null) {
            listSingletonList = Collections.singletonList(slashParamLIZJ);
        }
        interfaceC1181010gq3LJFF.ex2(slashRequestParam, instanceId, listSingletonList, new InterfaceC1181150gqH() { // from class: X.0gs2
            @Override // X.InterfaceC1181150gqH
            public final void LIZ(BaseComponentData baseComponentData) {
                String strLJI;
                PoiDetailApi.PoiDetailLynxResponse poiDetailLynxResponse;
                CompletionBlock<InterfaceC1182180grw> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1182180grw.class, containerID);
                InterfaceC1182180grw interfaceC1182180grw = (InterfaceC1182180grw) xBaseModelLIZJ;
                boolean z2 = baseComponentData instanceof PoiDetailApi.PoiDetailLynxResponse;
                if (z2) {
                    strLJI = ((PoiDetailApi.PoiDetailLynxResponse) baseComponentData).getBusinessData();
                } else {
                    C1227904rF.LIZ.getClass();
                    strLJI = C1227904rF.LJI(baseComponentData);
                }
                interfaceC1182180grw.setBusinessData(strLJI);
                Map<String, String> attachedDataList = null;
                if (z2 && (poiDetailLynxResponse = (PoiDetailApi.PoiDetailLynxResponse) baseComponentData) != null) {
                    attachedDataList = poiDetailLynxResponse.getAttachedDataList();
                }
                interfaceC1182180grw.setAttachedDataMap(attachedDataList);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }

            @Override // X.InterfaceC1181150gqH
            public final void onError(Throwable th) {
                String message;
                String strLIZIZ;
                CompletionBlock<InterfaceC1182180grw> completionBlock2 = completionBlock;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("throwable: msg: ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                sbLIZ.append(" stack: ");
                if (th != null) {
                    strLIZIZ = C13SZ.LIZIZ(th);
                } else {
                    strLIZIZ = null;
                }
                sbLIZ.append(strLIZIZ);
                C2382909Vj.LIZ(completionBlock2, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            }
        }, new C1181120gqE(false, false));
    }
}
