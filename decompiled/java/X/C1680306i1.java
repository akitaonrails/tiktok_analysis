package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.service.IMessageViewHelper;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06i1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1680306i1 implements IMessageViewHelper {
    public static final C1680306i1 LIZIZ = new C1680306i1();

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final boolean LIZIZ(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 35 || i == 8 || i == 9 || i == 12 || i == 13 || i == 15 || i == 16 || i == 17 || i == 25 || i == 26 || i == 200001 || i == 200002 || i == 20 || i == 21 || i == 27 || i == 200003 || i == 300000 || i == 31 || i == 34 || i == 33 || i == 36 || i == 200004 || i == 40 || i == 37 || i == 43 || i == 45 || ((Set) C1681306iB.LIZIZ.getValue()).contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final IMUser LJ(C869590Y9l c869590Y9l) {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LJIIL(String.valueOf(c869590Y9l.getSender()), c869590Y9l.getSecSender(), "im_local_db");
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final String LJI(C869590Y9l c869590Y9l) {
        Integer numValueOf;
        if (c869590Y9l != null && (numValueOf = Integer.valueOf(c869590Y9l.getMsgType())) != null) {
            if (numValueOf.intValue() == 1802) {
                return "view_picture";
            }
            if (numValueOf.intValue() == 1803) {
                return "view_private_video";
            }
            return "chat";
        }
        return "chat";
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final void LIZLLL(SystemContent systemContent, String str) {
        SystemContent.Key[] template;
        Map<String, String> extra;
        if (systemContent == null || (template = systemContent.getTemplate()) == null || template.length == 0) {
            return;
        }
        SystemContent.Key key = template[0];
        if (SystemContent.Companion.isSafeWarningLink(key)) {
            C0I0B.LJFF.LIZIZ();
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("action_type", "show");
            C20684815ws.LJIILLIIL("im_official_alert", c830490Whz);
        }
        if ((key.getAction() == 3 || key.getAction() == 7) && (extra = key.getExtra()) != null) {
            String str2 = extra.get(Scene.SCENE_SERVICE);
            C0I0B.LJFF.LIZIZ();
            C830490Whz c830490Whz2 = new C830490Whz();
            c830490Whz2.put("notice_type", str2);
            c830490Whz2.put("process_id", str);
            C20684815ws.LJIILLIIL("show_chat_notice", c830490Whz2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final void LIZJ(C869590Y9l c869590Y9l, SystemContent systemContent, SessionInfo sessionInfo) {
        String scene;
        String conversationId;
        int chatType;
        String conversationId2;
        int chatType2;
        int chatType3;
        CheckMessage.EventTrackingData eventTrackingStruct;
        if (c869590Y9l == null) {
            return;
        }
        C1675506hF c1675506hF = C1675506hF.LIZ;
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        c1675506hF.getClass();
        CheckMessage checkMessageLIZ = C1675506hF.LIZ(localExt);
        if (checkMessageLIZ != null && (eventTrackingStruct = checkMessageLIZ.getEventTrackingStruct()) != null) {
            scene = eventTrackingStruct.getScene();
        } else {
            scene = null;
        }
        int chatType4 = -1;
        if (scene != null) {
            if (sessionInfo != null) {
                chatType3 = sessionInfo.getChatType();
            } else {
                chatType3 = -1;
            }
            C1679106hp.LIZJ(chatType3, scene, null, null, sessionInfo, 188);
            return;
        }
        if (c869590Y9l.getMsgType() == EnumC868450Y5b.LEGACY_MESSAGE_TYPE_SYSTEM.getValue() && Intrinsics.LJFF(c869590Y9l.getScene(), "safety_screenshot_notice")) {
            if (sessionInfo != null) {
                chatType2 = sessionInfo.getChatType();
            } else {
                chatType2 = -1;
            }
            C1679106hp.LIZJ(chatType2, "safety_screenshot_notice", null, null, sessionInfo, 188);
        }
        String str = "";
        if (c869590Y9l.getMsgType() == 4072) {
            if (sessionInfo != null) {
                chatType = sessionInfo.getChatType();
            } else {
                chatType = -1;
            }
            Integer numValueOf = Integer.valueOf(c869590Y9l.getMsgType());
            if (sessionInfo == null || (conversationId2 = sessionInfo.getConversationId()) == null) {
                conversationId2 = "";
            }
            C1679106hp.LIZJ(chatType, "effect_repeated_sending", numValueOf, conversationId2, sessionInfo, 148);
        }
        if (c869590Y9l.getMsgType() == 4073) {
            if (sessionInfo != null) {
                chatType4 = sessionInfo.getChatType();
            }
            Integer numValueOf2 = Integer.valueOf(c869590Y9l.getMsgType());
            if (sessionInfo != null && (conversationId = sessionInfo.getConversationId()) != null) {
                str = conversationId;
            }
            C1679106hp.LIZJ(chatType4, "effect_high_frequency_sharing", numValueOf2, str, sessionInfo, 148);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.im.message.content.SystemContent.Key r19, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r20, X.C869590Y9l r21) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1680306i1.LJFF(com.ss.android.ugc.aweme.im.message.content.SystemContent$Key, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, X.0Y9l):void");
    }

    @Override // com.ss.android.ugc.aweme.im.service.IMessageViewHelper
    public final C1680206i0 LIZ(int i, IMUser iMUser, String str, SessionInfo sessionInfo, C869590Y9l c869590Y9l) {
        return new C1680206i0(i, iMUser, str, sessionInfo, c869590Y9l);
    }
}
