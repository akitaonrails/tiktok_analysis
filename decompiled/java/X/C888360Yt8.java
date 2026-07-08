package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.service.model.IMChatExt;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;

/* JADX INFO: renamed from: X.0Yt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888360Yt8 {
    public static final void LIZ(String str) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        int i;
        InterfaceC887210YrH interfaceC887210YrH;
        boolean zIsTCM;
        EnumC896490ZEx enumC896490ZEx;
        String uuid;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
            IMChatExt iMChatExt = new IMChatExt();
            iMChatExt.commerceScene = "msg_list";
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
            if (c0y8tLIZ == null) {
                return;
            }
            boolean z = false;
            if (c0y8tLIZ.isSingleChat()) {
                i = 0;
            } else {
                i = 3;
            }
            IMChatListApi.LJJIII.getClass();
            InterfaceC882680Yjy interfaceC882680YjyLJJIL = C890330YwJ.LIZ().LJJIL();
            InterfaceC884440Ymo interfaceC884440YmoLJII = null;
            if (interfaceC882680YjyLJJIL != null) {
                interfaceC884440YmoLJII = interfaceC882680YjyLJJIL.LJII(str);
            }
            if ((interfaceC884440YmoLJII instanceof InterfaceC887210YrH) && (interfaceC887210YrH = (InterfaceC887210YrH) interfaceC884440YmoLJII) != null) {
                IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                EnterChatParams enterChatParams = new EnterChatParams(c19egLIZIZ, i, str);
                enterChatParams.setEnterFrom(3);
                enterChatParams.setEnterFromForMob("notification_page");
                enterChatParams.setEnterMethodForMob("cell");
                enterChatParams.setSessionId(interfaceC887210YrH.getExtra().getSessionId());
                enterChatParams.setChatExt(iMChatExt);
                enterChatParams.setHasCameraIcon(true);
                enterChatParams.setUnreadCount((int) c0y8tLIZ.getUnreadCount());
                enterChatParams.setStickyTop(((InterfaceC888420YtE) interfaceC887210YrH.getExtra()).isStickyTop());
                if (interfaceC887210YrH instanceof C0Z8N) {
                    zIsTCM = ((C0Z8N) interfaceC887210YrH).getExtra().isTCM();
                } else {
                    zIsTCM = false;
                }
                enterChatParams.setTCM(zIsTCM);
                C894700Z8a activityStatusTextWithType = interfaceC887210YrH.getActivityStatusTextWithType();
                if (activityStatusTextWithType == null || (enumC896490ZEx = activityStatusTextWithType.LIZIZ) == null) {
                    enumC896490ZEx = EnumC896490ZEx.NO_STATUS;
                }
                enterChatParams.setActivityStatus(enumC896490ZEx);
                enterChatParams.setLastMessageMsgType(((InterfaceC888420YtE) interfaceC887210YrH.getExtra()).getLastMessageMsgType());
                C869590Y9l lastMsg = ((InterfaceC888420YtE) interfaceC887210YrH.getExtra()).getLastMsg();
                if (lastMsg == null || (uuid = lastMsg.getUuid()) == null) {
                    uuid = "";
                }
                enterChatParams.setLastMsgUUId(uuid);
                if (interfaceC887210YrH.getReadStatus() == EnumC881770YiV.ALL_SEEN) {
                    z = true;
                }
                enterChatParams.setLastMsgAllRead(z);
                enterChatParams.setMediaMsgMasking(((InterfaceC888420YtE) interfaceC887210YrH.getExtra()).isMediaMsgMasking());
                enterChatParams.setHighRiskConversation(((InterfaceC888420YtE) interfaceC887210YrH.getExtra()).isHighRiskConversation());
                imChatService.LJIILLIIL(enterChatParams, null);
            }
        }
    }
}
