package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.publicscreen.api.NewMessageNumChannel;
import com.bytedance.android.live.publicscreen.api.NonGiftMessageChannel;
import com.bytedance.android.livesdk.livesetting.game.GameFloatWindowMsgStrategySetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;
import com.bytedance.android.livesdk.model.message.StarCommentPushMessage;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uhl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779390Uhl implements InterfaceC777000Udu, OnMessageListener {
    public final DataChannel LL;
    public IMessageManager LLILLJJLI;
    public LinkedList<ChatMessage> LLILLL;
    public LinkedList<GiftMessage> LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL = true;
    public boolean LLIZ = true;
    public String LLIZLLLIL = "";

    @Override // X.InterfaceC777000Udu
    public final void LIZ() {
        this.LLIZ = false;
        LinkedList<ChatMessage> linkedList = this.LLILLL;
        if (linkedList != null) {
            linkedList.clear();
        }
        LJII();
    }

    @Override // X.InterfaceC777000Udu
    public final void LIZIZ() {
        this.LLILZLL = false;
        LinkedList<GiftMessage> linkedList = this.LLILZ;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    @Override // X.InterfaceC777000Udu
    public final void LIZJ() {
        this.LLILZIL = true;
        LJII();
    }

    @Override // X.InterfaceC777000Udu
    public final void LIZLLL() {
        this.LLILZIL = false;
        LinkedList<ChatMessage> linkedList = this.LLILLL;
        if (linkedList != null) {
            linkedList.clear();
        }
        LinkedList<GiftMessage> linkedList2 = this.LLILZ;
        if (linkedList2 != null) {
            linkedList2.clear();
        }
        LJII();
    }

    @Override // X.InterfaceC777000Udu
    public final void LJFF() {
        this.LL.zW(NewMessageNumChannel.class, 0);
        this.LL.zW(NonGiftMessageChannel.class, 0);
    }

    public final void LJII() {
        LinkedList<ChatMessage> linkedList;
        if (GameFloatWindowMsgStrategySetting.INSTANCE.getConfig().enableStrategyChat && (linkedList = this.LLILLL) != null) {
            Integer numValueOf = Integer.valueOf(linkedList.size());
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(numValueOf, "g_broadcast_float_window_comment_unread");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("comment unread size = ");
            sbLIZ.append(numValueOf);
            C20441214yg.LJIIIZ("GameSmallMsgStrategy", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC777000Udu
    public final void release() {
        LJFF();
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LLILLJJLI = null;
    }

    public C779390Uhl(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // X.InterfaceC777000Udu
    public final void LJ(IMessageManager iMessageManager) {
        if (iMessageManager == null || Intrinsics.LJFF(this.LLILLJJLI, iMessageManager)) {
            return;
        }
        IMessageManager iMessageManager2 = this.LLILLJJLI;
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(this);
        }
        this.LLILLJJLI = iMessageManager;
        iMessageManager.addMessageListener(C001A.GIFT.getIntType(), this);
        iMessageManager.addMessageListener(C001A.CHAT.getIntType(), this);
        iMessageManager.addMessageListener(C001A.SOCIAL.getIntType(), this);
        iMessageManager.addMessageListener(C001A.ROOM.getIntType(), this);
        iMessageManager.addMessageListener(C001A.STAR_COMMENT_PUSH_MESSAGE.getIntType(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        LinkedList<ChatMessage> linkedList;
        LinkedList<GiftMessage> linkedList2;
        String str;
        int iIntValue = 0;
        if (iMessage instanceof StarCommentPushMessage) {
            if (InterfaceC772390URp.LLLZZ.LIZIZ().booleanValue()) {
                StarCommentMessage starCommentMessage = ((StarCommentPushMessage) iMessage).current;
                if (starCommentMessage != null) {
                    str = starCommentMessage.starCommentId;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, this.LLIZLLLIL) && !Intrinsics.LJFF(str, "") && str != null) {
                    this.LLIZLLLIL = str;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (iMessage instanceof GiftMessage) {
            if (!InterfaceC772390URp.LLLZIL.LIZIZ().booleanValue()) {
                return;
            }
            GiftMessage giftMessage = (GiftMessage) iMessage;
            Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(giftMessage.giftId);
            if (giftFindGiftById == null) {
                giftFindGiftById = giftMessage.mGift;
            }
            if (giftMessage.repeatEnd == 0 && giftFindGiftById.combo) {
                return;
            }
            if (InterfaceC772390URp.LLLZL.LIZIZ().booleanValue() && this.LLILZIL && this.LLILZLL && (linkedList2 = this.LLILZ) != null) {
                linkedList2.add(iMessage);
                if (linkedList2.size() > 50) {
                    linkedList2.poll();
                }
            }
        } else if (iMessage instanceof ChatMessage) {
            if (Intrinsics.LJFF(((BaseMessage) iMessage).baseMessage.describe, "star_comment") && InterfaceC772390URp.LLLZLZ.LIZIZ().booleanValue()) {
                return;
            }
            boolean zBooleanValue = InterfaceC772390URp.LLLZIIL.LIZIZ().booleanValue();
            if (InterfaceC772390URp.LLLZLL.LIZIZ().booleanValue() && this.LLILZIL && this.LLIZ && (linkedList = this.LLILLL) != null) {
                linkedList.add(iMessage);
                if (linkedList.size() > 50) {
                    linkedList.poll();
                }
                LJII();
            }
            if (!zBooleanValue) {
                return;
            }
        } else if (iMessage instanceof SocialMessage) {
            if (!InterfaceC772390URp.LLZIL.LIZIZ().booleanValue() || ((SocialMessage) iMessage).action != 1) {
                return;
            }
        } else {
            if (!(iMessage instanceof RoomMessage)) {
                return;
            }
            RoomMessage roomMessage = (RoomMessage) iMessage;
            if (roomMessage.source != 3 && !Intrinsics.LJFF(roomMessage.baseMessage.describe, "LiveGoal")) {
                return;
            }
        }
        Integer num = (Integer) this.LL.gg0(NewMessageNumChannel.class);
        if (num == null || (iIntValue = num.intValue()) < 100) {
            this.LL.zW(NewMessageNumChannel.class, Integer.valueOf(iIntValue + 1));
        }
    }

    public final void LJI(LinkedList<ChatMessage> linkedList, LinkedList<GiftMessage> linkedList2) {
        LJFF();
        this.LLILLL = linkedList;
        this.LLILZ = linkedList2;
    }
}
