package X;

import com.bytedance.android.live.gift.GiftLimitNotificationEvent;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.livesdk.model.message.GiftPromptMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.00xt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C249900xt implements OnMessageListener {
    public final DataChannel LL;
    public IMessageManager LLILLJJLI;

    public C249900xt(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        int iIntValue;
        if (iMessage instanceof GiftPromptMessage) {
            C250000xu c250000xu = C250000xu.LIZ;
            GiftPromptMessage giftPromptMessage = (GiftPromptMessage) iMessage;
            String str = giftPromptMessage.title;
            c250000xu.getClass();
            C250000xu.LJIIIIZZ = str;
            C250000xu.LJIIIZ = giftPromptMessage.body;
            Integer num = giftPromptMessage.blockNumDays;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C250000xu.LJIIJ = iIntValue;
            C250000xu.LJIIJJI = giftPromptMessage.orderId;
            Long l = giftPromptMessage.orderTimestamp;
            if (l != null) {
                C250000xu.LJIIL = l.toString();
            }
            C250000xu.LJJIIJ = giftPromptMessage.inUserGiftingAddictionExpr;
            C250000xu.LJJIIJZLJL = giftPromptMessage.popUpSchema;
            ((IGiftReminderService) C1161920gLG.LIZJ(IGiftReminderService.class)).tt2(4);
            this.LL.LC0(GiftLimitNotificationEvent.class, Boolean.valueOf(C250000xu.LIZJ()));
        }
    }
}
