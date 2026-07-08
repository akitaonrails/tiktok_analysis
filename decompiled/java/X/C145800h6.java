package X;

import com.bytedance.android.livesdk.minute_game.model.MinuteGameGameplay;
import com.bytedance.android.livesdk.minute_game.model.TriggerGift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage;
import com.bytedance.android.livesdk.sticker.game.ViewerGameGiftStateChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.00h6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C145800h6 implements OnMessageListener {
    public DataChannel LL;
    public long LLILLL;
    public IMessageManager LLILZ;
    public EnumC146000h8 LLILLJJLI = EnumC146000h8.IDLE;
    public final List<InterfaceC146200hA> LLILZIL = new ArrayList();

    public final void LIZLLL() {
        IMessageManager iMessageManager = this.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.MINUTE_GAME_UPDATE_MESSAGE.getIntType(), this);
        }
        this.LLILZ = null;
        EnumC146000h8 enumC146000h8 = this.LLILLJJLI;
        EnumC146000h8 enumC146000h82 = EnumC146000h8.IDLE;
        if (enumC146000h8 != enumC146000h82) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop(): forcing state IDLE from ");
            sbLIZ.append(this.LLILLJJLI);
            C20441214yg.LJIIIZ("ViewerGameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI = enumC146000h82;
            DataChannel dataChannel = this.LL;
            if (dataChannel != null) {
                dataChannel.zW(ViewerGameGiftStateChannel.class, new C146400hC(enumC146000h82, 0L, 0L));
            }
        }
        this.LL = null;
        this.LLILLL = 0L;
        C146300hB.LIZ = "";
        ((ArrayList) this.LLILZIL).clear();
    }

    public final void LIZ(C170600l6 c170600l6) {
        if (!((ArrayList) this.LLILZIL).contains(c170600l6)) {
            ((ArrayList) this.LLILZIL).add(c170600l6);
        }
    }

    public final void LIZJ(DataChannel dataChannel) {
        IMessageManager iMessageManager;
        if (this.LL == dataChannel && this.LLILZ != null) {
            return;
        }
        IMessageManager iMessageManager2 = this.LLILZ;
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(this);
        }
        this.LL = dataChannel;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLILZ = iMessageManager;
        if (iMessageManager == null) {
            C20441214yg.LJ("ViewerGameGiftStateManager__ttlive_gift_render", "start(): MessageManager not found on DataChannel; IM updates will be missed");
        } else {
            iMessageManager.addMessageListener(C001A.MINUTE_GAME_UPDATE_MESSAGE.getIntType(), this);
            C20441214yg.LJIIIZ("ViewerGameGiftStateManager__ttlive_gift_render", "start(): registered MinuteGameUpdate listener");
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        MinuteGameUpdateMessage minuteGameUpdateMessage;
        Long lValueOf;
        Integer numValueOf;
        long j;
        Object objValueOf;
        GiftMessage giftMessage;
        TriggerGift triggerGift;
        Long lValueOf2 = null;
        if ((iMessage instanceof MinuteGameUpdateMessage) && (minuteGameUpdateMessage = (MinuteGameUpdateMessage) iMessage) != null) {
            MinuteGameGameplay minuteGameGameplay = minuteGameUpdateMessage.gameplay;
            int i = 0;
            if (minuteGameGameplay != null && (triggerGift = minuteGameGameplay.triggerGift) != null) {
                Long lValueOf3 = Long.valueOf(triggerGift.giftId);
                if (lValueOf3.longValue() != 0) {
                    this.LLILLL = lValueOf3.longValue();
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMessage: updateType=");
            sbLIZ.append(minuteGameUpdateMessage.updateType);
            sbLIZ.append(" (");
            sbLIZ.append(C146100h9.LIZ(minuteGameUpdateMessage.updateType));
            sbLIZ.append("), gameplayId=");
            MinuteGameGameplay minuteGameGameplay2 = minuteGameUpdateMessage.gameplay;
            if (minuteGameGameplay2 != null) {
                lValueOf = Long.valueOf(minuteGameGameplay2.gameplayId);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(", gameType=");
            MinuteGameGameplay minuteGameGameplay3 = minuteGameUpdateMessage.gameplay;
            if (minuteGameGameplay3 != null) {
                numValueOf = Integer.valueOf(minuteGameGameplay3.gameType);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", currentState=");
            sbLIZ.append(this.LLILLJJLI);
            C20441214yg.LJIIIZ("ViewerGameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
            int i2 = minuteGameUpdateMessage.updateType;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("onMessage: unknown updateType=");
                                sbLIZ2.append(minuteGameUpdateMessage.updateType);
                                sbLIZ2.append(", ignored");
                                C20441214yg.LJ("ViewerGameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ2));
                                return;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("TIMED_PROP received, in-state event, no transition; gift id=");
                            MinuteGameUpdateMessage.TimedPropData timedPropData = minuteGameUpdateMessage.timedPropData;
                            if (timedPropData != null && (giftMessage = timedPropData.giftMessage) != null) {
                                objValueOf = Long.valueOf(giftMessage.giftId);
                            } else {
                                objValueOf = "";
                            }
                            sbLIZ3.append(objValueOf);
                            C20441214yg.LJIIIZ("ViewerGameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ3));
                            Iterator it2 = C13LP.LLIIII(this.LLILZIL).iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC146200hA) it2.next()).LIZ();
                            }
                            return;
                        }
                        MinuteGameGameplay minuteGameGameplay4 = minuteGameUpdateMessage.gameplay;
                        if (minuteGameGameplay4 != null) {
                            j = minuteGameGameplay4.senderId;
                        } else {
                            j = 0;
                        }
                        long currentUserId = UserService.getInstance().user().getCurrentUserId();
                        if (j != 0 && j == currentUserId) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("REJECTED toast shown to self: senderId=");
                            sbLIZ4.append(j);
                            sbLIZ4.append(", gameplayId=");
                            MinuteGameGameplay minuteGameGameplay5 = minuteGameUpdateMessage.gameplay;
                            if (minuteGameGameplay5 != null) {
                                lValueOf2 = Long.valueOf(minuteGameGameplay5.gameplayId);
                            }
                            sbLIZ4.append(lValueOf2);
                            C20441214yg.LJIIIZ("ViewerGameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ4));
                            C766270U4b.LIZLLL(2131853110);
                        } else {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("REJECTED ignored (not self): senderId=");
                            sbLIZ5.append(j);
                            sbLIZ5.append(", selfId=");
                            sbLIZ5.append(currentUserId);
                            sbLIZ5.append(", gameplayId=");
                            MinuteGameGameplay minuteGameGameplay6 = minuteGameUpdateMessage.gameplay;
                            if (minuteGameGameplay6 != null) {
                                lValueOf2 = Long.valueOf(minuteGameGameplay6.gameplayId);
                            }
                            sbLIZ5.append(lValueOf2);
                            C20441214yg.LJIIIZ("ViewerGameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ5));
                        }
                        MinuteGameGameplay minuteGameGameplay7 = minuteGameUpdateMessage.gameplay;
                        if (minuteGameGameplay7 != null) {
                            i = minuteGameGameplay7.rejectReason;
                        }
                        LIZIZ(minuteGameUpdateMessage, "decline", i);
                        return;
                    }
                    LJ(EnumC146000h8.IDLE, minuteGameUpdateMessage);
                    return;
                }
                LJ(EnumC146000h8.SETTLED, minuteGameUpdateMessage);
                return;
            }
            LJ(EnumC146000h8.STARTED, minuteGameUpdateMessage);
            LIZIZ(minuteGameUpdateMessage, "accept", 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.EnumC146000h8 r16, com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage r17) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145800h6.LJ(X.00h8, com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2 A[PHI: r5
      0x00d2: PHI (r5v2 long) = (r5v0 long), (r5v4 long) binds: [B:15:0x003d, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage r17, java.lang.String r18, int r19) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145800h6.LIZIZ(com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage, java.lang.String, int):void");
    }
}
