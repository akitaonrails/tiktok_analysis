package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Dbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342490Dbj extends AbstractC342510Dbl {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        String containerID;
        InterfaceC342500Dbk interfaceC342500Dbk = (InterfaceC342500Dbk) xBaseParamModel;
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("target_aweme_id", interfaceC342500Dbk.getAwemeId());
                linkedHashMap.put("enter_from", interfaceC342500Dbk.getEnterFrom());
                linkedHashMap.put("enter_from_merge", interfaceC342500Dbk.getEnterFrom());
                linkedHashMap.put("enter_method", interfaceC342500Dbk.getEnterMethod());
                linkedHashMap.put("related_live_tag", interfaceC342500Dbk.getRelatedLiveTag());
                linkedHashMap.put("req_from_prefix", interfaceC342500Dbk.getReqFrom());
                String drawVideoId = interfaceC342500Dbk.getDrawVideoId();
                if (drawVideoId == null) {
                    drawVideoId = "";
                }
                linkedHashMap.put("draw_video_id", drawVideoId);
                String drawAuthorId = interfaceC342500Dbk.getDrawAuthorId();
                if (drawAuthorId == null) {
                    drawAuthorId = "";
                }
                linkedHashMap.put("draw_author_id", drawAuthorId);
                String drawRoomId = interfaceC342500Dbk.getDrawRoomId();
                if (drawRoomId == null) {
                    drawRoomId = "";
                }
                linkedHashMap.put("draw_room_id", drawRoomId);
                linkedHashMap.put("insert_aweme_ids", interfaceC342500Dbk.getAwemeId());
                linkedHashMap.put("insert_aweme_type", interfaceC342500Dbk.getAwemeType());
                linkedHashMap.put("mix_video_type", "2");
                Map<String, Object> logExtra = interfaceC342500Dbk.getLogExtra();
                if (logExtra != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : logExtra.entrySet()) {
                        if (entry.getValue() instanceof String) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openMixVideoLiveFeedPage(activityLIZLLL, linkedHashMap)) {
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID = interfaceC634840OvC2.getContainerID();
                    } else {
                        containerID = null;
                    }
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC342520Dbm.class, containerID), "");
                    return;
                }
                C2382909Vj.LIZ(completionBlock, 0, "openMixVideoLiveFeedPage return false", null, 4);
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "activity is null", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "openMixVideoLiveFeedPage error";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
