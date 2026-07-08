package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Zhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906920Zhy extends AbstractC906930Zhz {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(523));

    public static Map LIZJ(InterfaceC906940Zi0 interfaceC906940Zi0) {
        String enterFrom;
        String enterMethod;
        String interactionType;
        String interactionName;
        Pair[] pairArr = new Pair[4];
        InterfaceC906950Zi1 eventTrackingExtra = interfaceC906940Zi0.getEventTrackingExtra();
        String str = "";
        if (eventTrackingExtra == null || (enterFrom = eventTrackingExtra.getEnterFrom()) == null) {
            enterFrom = "";
        }
        pairArr[0] = new Pair("enter_from", enterFrom);
        InterfaceC906950Zi1 eventTrackingExtra2 = interfaceC906940Zi0.getEventTrackingExtra();
        if (eventTrackingExtra2 == null || (enterMethod = eventTrackingExtra2.getEnterMethod()) == null) {
            enterMethod = "";
        }
        pairArr[1] = new Pair("enter_method", enterMethod);
        InterfaceC906950Zi1 eventTrackingExtra3 = interfaceC906940Zi0.getEventTrackingExtra();
        if (eventTrackingExtra3 == null || (interactionType = eventTrackingExtra3.getInteractionType()) == null) {
            interactionType = "";
        }
        pairArr[2] = new Pair("interaction_type", interactionType);
        InterfaceC906950Zi1 eventTrackingExtra4 = interfaceC906940Zi0.getEventTrackingExtra();
        if (eventTrackingExtra4 != null && (interactionName = eventTrackingExtra4.getInteractionName()) != null) {
            str = interactionName;
        }
        pairArr[3] = new Pair("interaction_name", str);
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String conversationId;
        String strLJ;
        String processId;
        Map mapLJ;
        InterfaceC906940Zi0 interfaceC906940Zi0 = (InterfaceC906940Zi0) xBaseParamModel;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC906960Zi2.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC906960Zi2 interfaceC906960Zi2 = (InterfaceC906960Zi2) C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
        try {
            if (enumC1063300dmC != EnumC1063300dmC.LYNX) {
                interfaceC906960Zi2.setStatusCode(3);
                interfaceC906960Zi2.setStatusMsg("Only Lynx platform is supported.");
                completionBlock.onFailure(0, "", interfaceC906960Zi2);
                return;
            }
            int iIntValue = interfaceC906940Zi0.getMsgType().intValue();
            if (1800 <= iIntValue && iIntValue < 2010) {
                String contentPb = interfaceC906940Zi0.getContentPb();
                if (contentPb != null && contentPb.length() != 0) {
                    String scene = interfaceC906940Zi0.getScene();
                    if (scene == null || scene.length() == 0) {
                        interfaceC906960Zi2.setStatusCode(1);
                        interfaceC906960Zi2.setStatusMsg("Scene required for template message");
                        completionBlock.onFailure(0, "", interfaceC906960Zi2);
                        return;
                    }
                } else {
                    interfaceC906960Zi2.setStatusCode(1);
                    interfaceC906960Zi2.setStatusMsg("ContentPB required for template message");
                    completionBlock.onFailure(0, "", interfaceC906960Zi2);
                    return;
                }
            } else {
                String content = interfaceC906940Zi0.getContent();
                if (content == null || content.length() == 0) {
                    interfaceC906960Zi2.setStatusCode(1);
                    interfaceC906960Zi2.setStatusMsg("Content required for non-template message");
                    completionBlock.onFailure(0, "", interfaceC906960Zi2);
                    return;
                }
            }
            int iIntValue2 = interfaceC906940Zi0.getConversationType().intValue();
            if (iIntValue2 != 0) {
                if (iIntValue2 != 1) {
                    interfaceC906960Zi2.setStatusCode(1);
                    interfaceC906960Zi2.setStatusMsg("ConversationType invalid");
                    completionBlock.onFailure(0, "", interfaceC906960Zi2);
                    return;
                }
                String conversationId2 = interfaceC906940Zi0.getConversationId();
                if (conversationId2 != null && conversationId2.length() != 0) {
                    strLJ = interfaceC906940Zi0.getConversationId();
                    if (strLJ == null) {
                        strLJ = "";
                    }
                } else {
                    interfaceC906960Zi2.setStatusCode(1);
                    interfaceC906960Zi2.setStatusMsg("For group chat, conversationId is required.");
                    completionBlock.onFailure(0, "", interfaceC906960Zi2);
                    return;
                }
            } else {
                String uid = interfaceC906940Zi0.getUid();
                if ((uid == null || uid.length() == 0) && ((conversationId = interfaceC906940Zi0.getConversationId()) == null || conversationId.length() == 0)) {
                    interfaceC906960Zi2.setStatusCode(1);
                    interfaceC906960Zi2.setStatusMsg("For single chat, uid or conversationId is required.");
                    completionBlock.onFailure(0, "", interfaceC906960Zi2);
                    return;
                }
                String conversationId3 = interfaceC906940Zi0.getConversationId();
                if (conversationId3 != null && conversationId3.length() != 0) {
                    strLJ = interfaceC906940Zi0.getConversationId();
                    if (strLJ == null) {
                        strLJ = "";
                    }
                } else {
                    String uid2 = interfaceC906940Zi0.getUid();
                    if (uid2 == null) {
                        uid2 = "";
                    }
                    strLJ = C0YNP.LJ(uid2);
                }
            }
            String uid3 = interfaceC906940Zi0.getUid();
            if (uid3 == null) {
                uid3 = "";
            }
            int iIntValue3 = interfaceC906940Zi0.getConversationType().intValue();
            int iIntValue4 = interfaceC906940Zi0.getMsgType().intValue();
            String content2 = interfaceC906940Zi0.getContent();
            String contentPb2 = interfaceC906940Zi0.getContentPb();
            String scene2 = interfaceC906940Zi0.getScene();
            InterfaceC906950Zi1 eventTrackingExtra = interfaceC906940Zi0.getEventTrackingExtra();
            if (eventTrackingExtra == null || (processId = eventTrackingExtra.getProcessId()) == null) {
                processId = "";
            }
            interfaceC906940Zi0.getSyncedExt();
            String transientExt = interfaceC906940Zi0.getTransientExt();
            if (transientExt != null && transientExt.length() != 0) {
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String transientExt2 = interfaceC906940Zi0.getTransientExt();
                    Type type = new TypeToken<Map<String, ? extends String>>() { // from class: X.04YU
                    }.getType();
                    c1227904rF.getClass();
                    mapLJ = (Map) C1227904rF.LIZJ(transientExt2, type);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    mapLJ = C2097608Jq.LJ();
                }
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            ((InterfaceC905660Zfw) this.LLILLL.getValue()).LIZ(new C905640Zfu(uid3, strLJ, iIntValue3, iIntValue4, content2, contentPb2, scene2, processId, mapLJ, null, null, C2097608Jq.LJ()), LIZJ(interfaceC906940Zi0));
            interfaceC906960Zi2.setStatusCode(0);
            interfaceC906960Zi2.setStatusMsg("success");
            completionBlock.onSuccess(interfaceC906960Zi2, "");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SendMessageMethod handle error: ");
            sbLIZ.append(e2);
            C2188811AlT.LIZIZ(sbLIZ);
            interfaceC906960Zi2.setStatusCode(2);
            interfaceC906960Zi2.setStatusMsg("Client Error");
            completionBlock.onFailure(0, "", interfaceC906960Zi2);
        }
    }
}
