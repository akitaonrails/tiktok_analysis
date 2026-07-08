package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import java.util.Map;

/* JADX INFO: renamed from: X.0Z9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895170Z9v {
    public static final void LIZ(C19EG c19eg, C0Y8T c0y8t, Map map) {
        IMContact iMContactLJI;
        if (c0y8t == null) {
            return;
        }
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        IIMContactUtilService.LIZ.getClass();
        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
        String str = null;
        if (iIMContactUtilServiceLIZ != null) {
            iMContactLJI = iIMContactUtilServiceLIZ.LJI(c0y8t);
        } else {
            iMContactLJI = null;
        }
        EnterChatParams enterChatParams = new EnterChatParams(c19eg, iMContactLJI);
        enterChatParams.setChatType(3);
        enterChatParams.setEnterFrom(15);
        if (map != null) {
            str = (String) map.get("enter_from");
        }
        enterChatParams.setEnterFromForMob(str);
        enterChatParams.setEnterMethodForMob("create_group");
        enterChatParams.setSessionId(c0y8t.getConversationId());
        enterChatParams.setQuickChat(true);
        enterChatParams.getExtraMobParams().put("panel_source", "share_post_and_group_chat_panel");
        imChatService.LJIILLIIL(enterChatParams, null);
    }
}
