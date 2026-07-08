package X;

import android.graphics.Rect;
import com.bytedance.android.live.liveinteract.api.AdjustVideoInteractStreamBottomEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.event.PlayerChangeLayoutParamEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizePlayerHandler;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0agF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944290agF implements InterfaceC939110aXt, OnMessageListener {
    public final DataChannel LL;
    public IMessageManager LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC939110aXt
    public final void LIZ(Pair<Integer, Integer> pair) {
    }

    @Override // X.InterfaceC939110aXt
    public final void init() {
        LJIIIIZZ(false);
    }

    @Override // X.InterfaceC939110aXt
    public final int scene() {
        return 2;
    }

    @Override // X.InterfaceC939110aXt
    public final int version() {
        return 2;
    }

    @Override // X.InterfaceC939110aXt
    public final void LJ() {
        if (this.LLILLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCoHostPreAdjustPlayerHandler");
        sbLIZ.append("_onMessage receive  close or leave msg");
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIIZZ(true);
    }

    @Override // X.InterfaceC939110aXt
    public final boolean LJI() {
        return !this.LLILLL;
    }

    @Override // X.InterfaceC939110aXt
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCoHostPreAdjustPlayerHandler");
        sbLIZ.append("_release");
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LLILLJJLI = null;
    }

    public C944290agF(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // X.InterfaceC939110aXt
    public final void LIZIZ(boolean z) {
        C956380azk c956380azk;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCoHostPreAdjustPlayerHandler_resetToFullScreen, notify:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C0IET c0iet = new C0IET(-1, -1, 0, 0, 0, true, "MultiCoHostPreAdjustPlayerHandler#resetToFullScreen");
            DataChannel dataChannel = this.LL;
            if (dataChannel != null) {
                dataChannel.LC0(PlayerChangeLayoutParamEvent.class, c0iet);
            }
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel2.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(1, "resetToFullScreen"));
                return;
            }
            return;
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 == null || (c956380azk = (C956380azk) dataChannel3.gg0(LinkCrossRoomStateChangeEvent.class)) == null) {
            return;
        }
        c956380azk.LIZ = 1;
        c956380azk.LIZIZ = "resetToFullScreen";
    }

    @Override // X.InterfaceC939110aXt
    public final void LIZJ(Rect rect) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCoHostPreAdjustPlayerHandler");
        sbLIZ.append("_updateContent contentRect = ");
        sbLIZ.append(rect);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = false;
        C956380azk c956380azk = new C956380azk(0, "updateContent");
        c956380azk.LIZJ = rect.top + rect.height();
        if (C915980Zwa.LJFF().co0() || C915980Zwa.LIZIZ().JV1(false).isPlayingIncludeResult()) {
            z = true;
        }
        c956380azk.LJIIIIZZ = z;
        int i = C956370azj.LIZ;
        C956370azj.LIZ(c956380azk, this.LL);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zW(LinkCrossRoomStateChangeEvent.class, c956380azk);
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.zW(AdjustVideoInteractStreamBottomEvent.class, new C963860bBo(rect.top, rect.bottom, rect.left, rect.right, "updateContent"));
        }
    }

    @Override // X.InterfaceC939110aXt
    public final void LIZLLL(Room room) {
        if (this.LLILLJJLI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiCoHostPreAdjustPlayerHandler");
            sbLIZ.append("_initMessageManager return messageManager has init or room is null");
            C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(room.getId());
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.LINK_MESSAGE.getIntType(), this);
        } else {
            iMessageManager = null;
        }
        this.LLILLJJLI = iMessageManager;
    }

    @Override // X.InterfaceC939110aXt
    public final boolean LJFF(Room room) {
        if (room.getLinkMicInfo() != null && room.getLinkMicInfo().channelId > 0 && room.getLinkMicInfo().rivalAnchorId > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC939110aXt
    public final void LJII(C2180891AWx c2180891AWx) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCoHostPreAdjustPlayerHandler");
        sbLIZ.append("_updatePlayer");
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        Rect playerRange = c2180891AWx.getPlayerRange();
        C0IET c0iet = new C0IET(playerRange.width(), playerRange.height(), playerRange.top, playerRange.left, playerRange.right - playerRange.width(), false, "MultiCoHostPreAdjustPlayerHandler#updatePlayer");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MultiCoHostPreAdjustPlayerHandler");
        sbLIZ2.append("_updatePlayer, params = ");
        sbLIZ2.append(c0iet);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ2));
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.LC0(PlayerChangeLayoutParamEvent.class, c0iet);
        }
    }

    public final void LJIIIIZZ(boolean z) {
        this.LLILLL = z;
        if (z) {
            IMessageManager iMessageManager = this.LLILLJJLI;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
            this.LLILLJJLI = null;
            release();
            if (!LinkmicRtcRatioOptimizePlayerHandler.isEnable()) {
                LIZIZ(true);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCoHostPreAdjustPlayerHandler");
        sbLIZ.append("_updateIsLinkMicClose value = ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof LinkMessage) {
            int i = ((LinkMessage) iMessage).messageType;
            if (i == 7 || i == 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MultiCoHostPreAdjustPlayerHandler");
                sbLIZ.append("_onMessage receive  close or leave msg");
                C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MultiCoHostPreAdjustPlayerHandler");
                sbLIZ2.append("_updateLinkMicState2Close");
                C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ2));
                LJIIIIZZ(true);
            }
        }
    }
}
