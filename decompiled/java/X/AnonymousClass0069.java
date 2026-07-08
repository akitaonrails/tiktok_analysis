package X;

import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.livesetting.watchlive.AIReplyAssistantWatcherSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0069, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0069 {
    public static void LIZ(IMessageManager iMessageManager, int i, OnIMMessageListener onIMMessageListener, Function1 function1) {
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(i, onIMMessageListener);
            function1.invoke(Integer.valueOf(i));
        }
    }

    public static void LIZIZ(DataChannel dataChannel, IMessageManager iMessageManager, OnIMMessageListener onIMMessageListener, Function1 function1) {
        LIZ(iMessageManager, C001A.ROOM.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.CHAT.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.EMOTE_CHAT.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.GIFT.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.MEMBER.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.LIVE_UNAUTHORIZED_MEMBER_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.DIGG.getIntType(), onIMMessageListener, function1);
        InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(C500260Jjc.LJJLIIIJ(dataChannel));
        if (interfaceC1085480eLyO41 != null && interfaceC1085480eLyO41.isEnabled()) {
            LIZ(iMessageManager, C001A.LIKE.getIntType(), onIMMessageListener, function1);
        }
        LIZ(iMessageManager, C001A.SOCIAL.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.CONTROL.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.SCREEN.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.ROOM_RICH_CHAT_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.COMMENT_IMAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.GOODS_ORDER.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.ASSET_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.PORTAL_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.ENVELOPE_PORTAL_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.LIVE_INTRO_MESSAGE.getIntType(), onIMMessageListener, function1);
        if (!C500260Jjc.LJIIZILJ(dataChannel)) {
            LIZ(iMessageManager, C001A.LIVE_GAME_INTRO_MESSAGE.getIntType(), onIMMessageListener, function1);
        }
        LIZ(iMessageManager, C001A.ROOM_VERIFY.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.BOTTOM_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.IM_DELETE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.QUESTION_DELETE_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.RED_ENVELOPE_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.SUB_NOTIFY_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.GIFT_COLLECTION_UPDATE_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.RANK_TEXT_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.MODERATOR_OPERATE_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.CAPSULE_MESSAGE.getIntType(), onIMMessageListener, function1);
        if (!C500260Jjc.LJIIZILJ(dataChannel)) {
            LIZ(iMessageManager, C001A.GREETING_MESSAGE.getIntType(), onIMMessageListener, function1);
        }
        LIZ(iMessageManager, C001A.GIFT_GALLERY_MESSAGE.getIntType(), onIMMessageListener, function1);
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            LIZ(iMessageManager, C001A.ANCHOR_GROW_LEVEL_MESSAGE.getIntType(), onIMMessageListener, function1);
        }
        LIZ(iMessageManager, C001A.A_I_SUMMARY_MESSAGE.getIntType(), onIMMessageListener, function1);
        LIZ(iMessageManager, C001A.WHISPER_MESSAGE.getIntType(), onIMMessageListener, function1);
        if (AIReplyAssistantWatcherSetting.isEnable() && !C500260Jjc.LJIIZILJ(dataChannel)) {
            LIZ(iMessageManager, C001A.COMMENT_REPLY_MESSAGE.getIntType(), onIMMessageListener, function1);
        }
    }
}
