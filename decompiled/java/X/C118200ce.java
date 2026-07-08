package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.00ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C118200ce implements OnMessageListener {
    public DataChannel LL;
    public final HashMap<String, Integer> LLILLJJLI = new HashMap<>();

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        int iIntValue;
        if (iMessage instanceof GiftMessage) {
            GiftMessage giftMessage = (GiftMessage) iMessage;
            if (giftMessage.isHistoryMessage || C1133680fbi.LIZIZ(giftMessage) != UserService.getInstance().user().getCurrentUserId()) {
                return;
            }
            Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(giftMessage.giftId);
            if (giftFindGiftById == null && (giftFindGiftById = giftMessage.mGift) == null) {
                return;
            }
            C1133690fbj.LIZ.getClass();
            String strLIZIZ = C1133690fbj.LIZIZ(giftMessage);
            if (giftMessage.repeatEnd == 1) {
                this.LLILLJJLI.remove(strLIZIZ);
                return;
            }
            C118300cf c118300cf = new C118300cf();
            int i = giftMessage.repeatCount;
            c118300cf.element = i;
            if (giftFindGiftById.combo) {
                Integer num = this.LLILLJJLI.get(strLIZIZ);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue < i) {
                    this.LLILLJJLI.put(strLIZIZ, Integer.valueOf(i));
                }
                c118300cf.element = i - iIntValue;
            }
            if (c118300cf.element <= 0) {
                return;
            }
            Map<Integer, Set<C1140490fmh>> map = C1139440fl0.LL;
            C1139440fl0.LIZIZ(0, giftMessage.giftId, new C020Y(iMessage, c118300cf, 27));
            return;
        }
        if (iMessage instanceof ChatMessage) {
            AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) iMessage;
            if (abstractC1136060ffY.isHistoryMessage) {
                return;
            }
            Map<Integer, Set<C1140490fmh>> map2 = C1139440fl0.LL;
            C1139440fl0.LIZIZ(1, abstractC1136060ffY.getMessageId(), new C5182020e(iMessage, 168));
            return;
        }
        if (iMessage instanceof LikeMessage) {
            AbstractC1136060ffY abstractC1136060ffY2 = (AbstractC1136060ffY) iMessage;
            if (abstractC1136060ffY2.isHistoryMessage) {
                return;
            }
            Map<Integer, Set<C1140490fmh>> map3 = C1139440fl0.LL;
            C1139440fl0.LIZIZ(2, abstractC1136060ffY2.getMessageId(), new C5182020e(iMessage, 169));
            return;
        }
        if (iMessage instanceof SocialMessage) {
            SocialMessage socialMessage = (SocialMessage) iMessage;
            if (socialMessage.isHistoryMessage) {
                return;
            }
            if (socialMessage.action == 3) {
                Map<Integer, Set<C1140490fmh>> map4 = C1139440fl0.LL;
                C1139440fl0.LIZIZ(3, socialMessage.getMessageId(), new C5182020e(iMessage, 170));
            }
            if (socialMessage.action == 1) {
                Map<Integer, Set<C1140490fmh>> map5 = C1139440fl0.LL;
                C1139440fl0.LIZIZ(4, socialMessage.getMessageId(), new C5182020e(iMessage, 171));
            }
        }
    }
}
