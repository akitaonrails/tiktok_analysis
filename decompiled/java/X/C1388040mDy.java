package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.common.model.GroupCheckMsg;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0mDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388040mDy extends AbstractC1388060mE0 {
    public final InterfaceC1388020mDw LLILLL;

    public C1388040mDy() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1388020mDw.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        this.LLILLL = (InterfaceC1388020mDw) C1549500qQO.LIZJ(interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null, c19719912DlLIZ);
    }

    public static void LIZJ(CompletionBlock completionBlock, C0YMW c0ymw) {
        String statusMsg;
        String checkMsg;
        GroupCheckMsg groupCheckMsg;
        if (c0ymw == null || (checkMsg = c0ymw.getCheckMsg()) == null || (groupCheckMsg = (GroupCheckMsg) C051M.LIZIZ(GroupCheckMsg.class, checkMsg)) == null || (statusMsg = groupCheckMsg.getStatusMsg()) == null) {
            statusMsg = "create conversation failed";
        }
        C2382909Vj.LIZ(completionBlock, 0, statusMsg, null, 4);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        final Activity activityLIZIZ;
        EnumC913760Zt0 enumC913760Zt0LIZJ;
        LinkedHashMap linkedHashMap;
        final InterfaceC1388050mDz interfaceC1388050mDz = (InterfaceC1388050mDz) xBaseParamModel;
        if (interfaceC1388050mDz.getBizLine().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        LinkedHashMap linkedHashMap2 = null;
        if (!z && interfaceC1388050mDz.getBizScene().length() != 0 && interfaceC1388050mDz.getEnterFrom().length() != 0 && interfaceC1388050mDz.getEnterMethod().length() != 0) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                C913630Zsn c913630Zsn = C913630Zsn.LJIIJJI;
                String bizLine = interfaceC1388050mDz.getBizLine();
                String bizScene = interfaceC1388050mDz.getBizScene();
                c913630Zsn.getClass();
                C1229380i64 c1229380i64 = new C1229380i64(bizLine, bizScene, "jsb");
                List<String> uidList = interfaceC1388050mDz.getUidList();
                if (uidList == null) {
                    uidList = C13BV.INSTANCE;
                }
                String groupType = interfaceC1388050mDz.getGroupType();
                if (groupType == null || (enumC913760Zt0LIZJ = C1229420i68.LIZJ(groupType)) == null) {
                    enumC913760Zt0LIZJ = EnumC913760Zt0.NORMAL_GROUP_CHAT;
                }
                String uniqueId = interfaceC1388050mDz.getUniqueId();
                if (interfaceC1388050mDz.getGroupType() == null) {
                    EnumC913760Zt0.NORMAL_GROUP_CHAT.getValue();
                }
                if (!C123100dR.LIZ(uniqueId)) {
                    uniqueId = null;
                }
                String name = interfaceC1388050mDz.getName();
                Map<String, Object> extraMap = interfaceC1388050mDz.getExtraMap();
                if (extraMap != null) {
                    linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(extraMap.size()));
                    Iterator<T> it2 = extraMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                } else {
                    linkedHashMap = null;
                }
                C1229390i65 c1229390i65 = new C1229390i65(uidList, null, enumC913760Zt0LIZJ, null, null, linkedHashMap, uniqueId, name, null, 282);
                String enterFrom = interfaceC1388050mDz.getEnterFrom();
                String enterMethod = interfaceC1388050mDz.getEnterMethod();
                Map<String, Object> extraETParams = interfaceC1388050mDz.getExtraETParams();
                if (extraETParams != null) {
                    linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(extraETParams.size()));
                    Iterator<T> it3 = extraETParams.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it3.next();
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
                    }
                }
                c1229380i64.LIZ(c1229390i65, new C1229400i66(enterFrom, enterMethod, linkedHashMap2, 8), new C1231500i9U() { // from class: X.0mDv
                    @Override // X.C1231500i9U, X.InterfaceC863580XuG, X.InterfaceC863600XuI
                    public final void LIZIZ(C0YMW c0ymw) {
                        super.LIZIZ(c0ymw);
                        C1388040mDy c1388040mDy = this.LIZIZ;
                        CompletionBlock<InterfaceC1388020mDw> completionBlock2 = completionBlock;
                        c1388040mDy.getClass();
                        C1388040mDy.LIZJ(completionBlock2, c0ymw);
                    }

                    @Override // X.C1231500i9U, X.InterfaceC863580XuG
                    public final void LIZJ(C0Y8T c0y8t, C0YMW c0ymw) {
                        super.LIZJ(c0y8t, c0ymw);
                        if (c0y8t != null) {
                            CompletionBlock<InterfaceC1388020mDw> completionBlock2 = completionBlock;
                            C1388040mDy c1388040mDy = this.LIZIZ;
                            Context context = activityLIZIZ;
                            InterfaceC1388050mDz interfaceC1388050mDz2 = interfaceC1388050mDz;
                            InterfaceC1388020mDw interfaceC1388020mDw = c1388040mDy.LLILLL;
                            interfaceC1388020mDw.setConversationId(c0y8t.getConversationId());
                            interfaceC1388020mDw.setConversationShortId(Long.valueOf(c0y8t.getConversationShortId()));
                            completionBlock2.onSuccess(interfaceC1388020mDw, "");
                            IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                            EnterChatParams enterChatParams = new EnterChatParams(context, 3, c0y8t.getConversationId());
                            enterChatParams.setNewGroupChat(true);
                            enterChatParams.setEnterFromForMob(interfaceC1388050mDz2.getEnterFrom());
                            enterChatParams.setEnterMethodForMob(interfaceC1388050mDz2.getEnterMethod());
                            imChatService.LJIILLIIL(enterChatParams, null);
                            return;
                        }
                        C1388040mDy c1388040mDy2 = this.LIZIZ;
                        CompletionBlock<InterfaceC1388020mDw> completionBlock3 = completionBlock;
                        c1388040mDy2.getClass();
                        C1388040mDy.LIZJ(completionBlock3, c0ymw);
                    }
                }, null);
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "param is invalid", null, 4);
    }
}
