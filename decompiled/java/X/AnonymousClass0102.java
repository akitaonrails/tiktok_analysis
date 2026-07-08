package X;

import android.view.View;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.dataChannel.GameGuessPinCardEvent;
import com.bytedance.android.livesdk.game.model.PinCardView;
import com.bytedance.android.livesdk.model.message.GameGuessPinCardMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0102, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0102 implements InterfaceC1107910ew9, OnIMMessageListener, InterfaceC1141530foN {
    public DataChannel LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(551));

    @Override // X.InterfaceC1107910ew9
    public final void LIZJ(EnumC1107860ew4 enumC1107860ew4, boolean z) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "guess_pin_card_behavior";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final void LJ(PinCardView pinCardView) {
        try {
            int i = pinCardView.pinCardType;
            if (i != 0) {
                if (i == 1) {
                    ((IPinCardService) this.LLILLJJLI.getValue()).Rg(EnumC1107860ew4.GAME_GUESSING, EnumC1108010ewJ.OTHERS, null);
                    DataChannel dataChannel = this.LL;
                    if (dataChannel != null) {
                        dataChannel.SX0(C749120Ta2.class, null);
                        return;
                    }
                    return;
                }
                return;
            }
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C749120Ta2.class, pinCardView);
            }
            DataChannel dataChannel3 = this.LL;
            if (dataChannel3 != null) {
                dataChannel3.LC0(GameGuessPinCardEvent.class, pinCardView.roundIdStr);
            }
            if (CastLongProtector.parseLong(pinCardView.endTimestampStr) - (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) < pinCardView.minDurationTime) {
                DataChannel dataChannel4 = this.LL;
                if (dataChannel4 != null) {
                    dataChannel4.SX0(C749120Ta2.class, null);
                    return;
                }
                return;
            }
            ((IPinCardService) this.LLILLJJLI.getValue()).DP(EnumC1107860ew4.GAME_GUESSING, new C1097040eec(this.LL, pinCardView), new C1107970ewF(CastLongProtector.parseLong(pinCardView.endTimestampStr) - pinCardView.duration), -1L, null);
            LJFF(pinCardView);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("GuessPinCardBehavior", th);
        }
    }

    public final void LJFF(PinCardView pinCardView) {
        Long lValueOf;
        if (C500260Jjc.LJIIZILJ(this.LL) && pinCardView.isAutoPin) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guessing_anchor_pin_card_click");
            c474500IjALIZ.LJJIJIIJI(Long.valueOf(C500260Jjc.LJJLIIIJ(this.LL)));
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LL);
            if (roomLJJLIIIIJ != null) {
                lValueOf = Long.valueOf(roomLJJLIIIIJ.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJI(lValueOf);
            c474500IjALIZ.LJJII("pin", "button_name");
            c474500IjALIZ.LJJII(pinCardView.roundIdStr, "round_id");
            c474500IjALIZ.LJJII(1, "is_auto_pin");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "close_guessing_pin_card")) {
            ((IPinCardService) this.LLILLJJLI.getValue()).Rg(EnumC1107860ew4.GAME_GUESSING, EnumC1108010ewJ.OTHERS, null);
            DataChannel dataChannel = this.LL;
            if (dataChannel != null) {
                dataChannel.SX0(C749120Ta2.class, null);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        PinCardView pinCardView;
        if ((iMessage instanceof GameGuessPinCardMessage) && (pinCardView = ((GameGuessPinCardMessage) iMessage).view) != null) {
            LJ(pinCardView);
        }
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
        DataChannel dataChannel;
        if (enumC1108010ewJ == EnumC1108010ewJ.COVER && (dataChannel = this.LL) != null) {
            dataChannel.SX0(C749120Ta2.class, null);
        }
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        IMessageManager iMessageManager;
        C1548820qPI.LJIIIIZZ("close_guessing_pin_card", this);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
    }

    @Override // X.InterfaceC1107910ew9
    public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        PinCardView pinCardView;
        IMessageManager iMessageManager;
        DataChannel dataChannel = c1107460evQ.LIZJ;
        this.LL = dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.GAME_GUESS_PIN_CARD_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null && (pinCardView = (PinCardView) dataChannel2.gg0(C749120Ta2.class)) != null) {
            LJ(pinCardView);
        }
        C1548820qPI.LIZLLL("close_guessing_pin_card", this);
    }

    @Override // X.InterfaceC1107910ew9
    public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
        view.setBackgroundColor(0);
    }
}
