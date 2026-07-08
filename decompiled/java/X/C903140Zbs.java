package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903140Zbs {
    public static final void LIZ(EnterChatParams enterChatParams) {
        String enterFromForMob;
        String enterFromForMob2;
        IMUser imUser;
        String uid;
        IMUser imUser2;
        String uid2;
        String strLIZJ;
        IMUser iMUserLIZLLL;
        long jLongValue;
        String enterMethodForMob;
        int iIntValue;
        String strLIZJ2;
        IMConversation iMConversation;
        IMContact imContact = enterChatParams.getImContact();
        String strLJIIJ = null;
        int iIntValue2 = 0;
        if (imContact != null) {
            if ((imContact instanceof IMConversation) && (iMConversation = (IMConversation) imContact) != null && iMConversation.getConversationType() == AbstractC1711506n3.LIZIZ) {
                enterChatParams.setSessionId(iMConversation.getConversationId());
                enterChatParams.setChatType(3);
            } else {
                IMUser iMUserLIZ = C903150Zbt.LIZ(imContact);
                if (iMUserLIZ != null) {
                    if (enterChatParams.getInboxType() == null) {
                        strLIZJ2 = C0YNP.LJ(iMUserLIZ.getUid());
                    } else {
                        Integer inboxType = enterChatParams.getInboxType();
                        if (inboxType != null) {
                            iIntValue = inboxType.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        strLIZJ2 = C0YNP.LIZJ(iIntValue, iMUserLIZ.getUid());
                    }
                    enterChatParams.setSessionId(strLIZJ2);
                    enterChatParams.setImUser(iMUserLIZ);
                }
            }
        }
        int i = 2;
        if (enterChatParams.getEnterFrom() == 6 && ((enterMethodForMob = enterChatParams.getEnterMethodForMob()) == null || enterMethodForMob.length() == 0)) {
            enterChatParams.setEnterMethodForMob("share_toast");
        } else if (enterChatParams.getEnterFrom() == 2 && ((enterFromForMob2 = enterChatParams.getEnterFromForMob()) == null || enterFromForMob2.length() == 0)) {
            enterChatParams.setEnterMethodForMob("stranger_message_box");
        } else if (enterChatParams.getEnterFrom() == 16 && ((enterFromForMob = enterChatParams.getEnterFromForMob()) == null || enterFromForMob.length() == 0)) {
            enterChatParams.setEnterMethodForMob("link_auto_message");
        }
        if (Intrinsics.LJFF(enterChatParams.getEnterMethodForMob(), "share_toast") || Intrinsics.LJFF(enterChatParams.getEnterMethodForMob(), "toast")) {
            IIMChatPerfLogger.LIZ.getClass();
            IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
            if (iIMChatPerfLoggerLIZ != null) {
                iIMChatPerfLoggerLIZ.LJIIJ();
            }
        }
        IMAIServiceAPI.LIZ.getClass();
        InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
        String sessionId = enterChatParams.getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        if (interfaceC1693306k7LIZ.LJIL(sessionId)) {
            enterChatParams.setChatType(5);
        }
        if (enterChatParams.getChatType() == -1) {
            IMUser imUser3 = enterChatParams.getImUser();
            if (enterChatParams.getEnterFrom() == 2) {
                i = 1;
            } else if (imUser3 == null || imUser3.getCommerceUserLevel() <= 0) {
                i = 0;
            }
            enterChatParams.setChatType(i);
        }
        if (enterChatParams.getChatType() != 3) {
            if (enterChatParams.getImUser() == null) {
                String strValueOf = String.valueOf(C0YNP.LJII(enterChatParams.getSessionId()));
                IIMContactUtilService.LIZ.getClass();
                IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                if (iIMContactUtilServiceLIZ != null) {
                    strLJIIJ = iIMContactUtilServiceLIZ.LJIIJ(enterChatParams.getSessionId());
                }
                if (enterChatParams.getChatType() == 5) {
                    InterfaceC1491705sh interfaceC1491705shLIZIZ = AnonymousClass0629.LIZ().LIZIZ();
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(strValueOf);
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    iMUserLIZLLL = AnonymousClass0629.LIZ().LIZIZ().LJI(interfaceC1491705shLIZIZ.LIZ(jLongValue));
                } else {
                    IMContactApi.LIZ.getClass();
                    iMUserLIZLLL = C069P.LIZ().LJ().LIZLLL(strValueOf, strLJIIJ, "im_chat");
                }
                if (iMUserLIZLLL == null) {
                    return;
                }
                try {
                    String uid3 = iMUserLIZLLL.getUid();
                    if (uid3 != null) {
                        C2095008Iq.LJIILIIL(uid3);
                    }
                    enterChatParams.setImUser(iMUserLIZLLL);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ChatRoomActivity.start uid is invalid: ");
                    sbLIZ.append(iMUserLIZLLL.getUid());
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
            }
            String shareUserId = enterChatParams.getShareUserId();
            if ((shareUserId == null || shareUserId.length() == 0) && (imUser = enterChatParams.getImUser()) != null && (uid = imUser.getUid()) != null) {
                enterChatParams.setShareUserId(uid);
            }
            String sessionId2 = enterChatParams.getSessionId();
            if ((sessionId2 == null || sessionId2.length() == 0) && (imUser2 = enterChatParams.getImUser()) != null && (uid2 = imUser2.getUid()) != null && uid2.length() != 0) {
                if (enterChatParams.getInboxType() == null) {
                    strLIZJ = C0YNP.LJ(uid2);
                } else {
                    Integer inboxType2 = enterChatParams.getInboxType();
                    if (inboxType2 != null) {
                        iIntValue2 = inboxType2.intValue();
                    }
                    strLIZJ = C0YNP.LIZJ(iIntValue2, uid2);
                }
                enterChatParams.setSessionId(strLIZJ);
            }
        }
    }
}
