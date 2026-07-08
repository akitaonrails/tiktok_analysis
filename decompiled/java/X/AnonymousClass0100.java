package X;

import android.os.SystemClock;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.dataChannel.GameGuessPinCardEvent;
import com.bytedance.android.livesdk.game.model.PinCardView;
import com.bytedance.android.livesdk.model.message.GameGuessPinCardMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;

/* JADX INFO: renamed from: X.0100, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0100 implements OnIMMessageListener {
    public final DataChannel LL;
    public long LLILLJJLI;
    public long LLILLL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "guess_pin_card_behavior";
    }

    public final void LIZJ() {
        IMessageManager iMessageManager;
        PinCardView pinCardView;
        DataChannel dataChannel = this.LL;
        if (C500260Jjc.LJJJI(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null)) {
            ((IPinCardService) C1161920gLG.LIZJ(IPinCardService.class)).Y70(EnumC1107860ew4.GAME_GUESSING, new AnonymousClass0102());
            return;
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null && (pinCardView = (PinCardView) dataChannel2.gg0(C749120Ta2.class)) != null) {
            LIZ(pinCardView);
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 == null || (iMessageManager = (IMessageManager) dataChannel3.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.addMessageListener(C001A.GAME_GUESS_PIN_CARD_MESSAGE.getIntType(), (OnIMMessageListener) this);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public AnonymousClass0100(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final void LIZ(PinCardView pinCardView) {
        try {
            int i = pinCardView.pinCardType;
            if (i != 0) {
                if (i == 1) {
                    this.LLILLJJLI = 0L;
                    this.LLILLL = 0L;
                    DataChannel dataChannel = this.LL;
                    if (dataChannel != null) {
                        dataChannel.SX0(C749120Ta2.class, null);
                        return;
                    }
                    return;
                }
                return;
            }
            this.LLILLJJLI = SystemClock.elapsedRealtime();
            long j = pinCardView.duration;
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            this.LLILLL = Math.min(j * j2, (CastLongProtector.parseLong(pinCardView.endTimestampStr) * j2) - System.currentTimeMillis());
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C749120Ta2.class, pinCardView);
            }
            DataChannel dataChannel3 = this.LL;
            if (dataChannel3 != null) {
                dataChannel3.LC0(GameGuessPinCardEvent.class, pinCardView.roundIdStr);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("GuessPinCardHandler", th);
        }
    }

    public final void LIZIZ(boolean z) {
        DataChannel dataChannel;
        IMessageManager iMessageManager;
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        if ((!z || (this.LLILLJJLI > 0 && SystemClock.elapsedRealtime() - this.LLILLJJLI >= this.LLILLL)) && (dataChannel = this.LL) != null) {
            dataChannel.SX0(C749120Ta2.class, null);
        }
        this.LLILLJJLI = 0L;
        this.LLILLL = 0L;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        PinCardView pinCardView;
        if ((iMessage instanceof GameGuessPinCardMessage) && (pinCardView = ((GameGuessPinCardMessage) iMessage).view) != null) {
            LIZ(pinCardView);
        }
    }
}
