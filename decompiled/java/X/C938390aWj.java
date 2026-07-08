package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizePlayerHandler;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.Pair;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938390aWj implements InterfaceC939110aXt, OnMessageListener {
    public final ViewGroup LL;
    public final DataChannel LLILLJJLI;
    public IMessageManager LLILLL;
    public boolean LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 647));
    public InterfaceC937960aW2 LLILZLL;

    @Override // X.InterfaceC939110aXt
    public final void init() {
        LJIIJ(false);
        if (LJIIIZ() != null) {
            C786410Ut5.LJJJLZIJ(LJIIIZ(), this.LL);
            this.LL.addView(LJIIIZ());
        }
    }

    @Override // X.InterfaceC939110aXt
    public final int scene() {
        return 4;
    }

    @Override // X.InterfaceC939110aXt
    public final int version() {
        return 5;
    }

    @Override // X.InterfaceC939110aXt
    public final void LJ() {
        if (this.LLILZ) {
            return;
        }
        LJIIJ(true);
    }

    @Override // X.InterfaceC939110aXt
    public final boolean LJI() {
        return !this.LLILZ;
    }

    public final InterfaceC937960aW2 LJIIIIZZ() {
        InterfaceC937960aW2 interfaceC937960aW2Gd0 = this.LLILZLL;
        if (interfaceC937960aW2Gd0 == null) {
            interfaceC937960aW2Gd0 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).gd0(LJIIIZ());
            if (interfaceC937960aW2Gd0 != null) {
                interfaceC937960aW2Gd0.LIZLLL(false);
            } else {
                interfaceC937960aW2Gd0 = null;
            }
            this.LLILZLL = interfaceC937960aW2Gd0;
        }
        return interfaceC937960aW2Gd0;
    }

    public final FrameLayout LJIIIZ() {
        return (FrameLayout) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC939110aXt
    public final void release() {
        InterfaceC937960aW2 interfaceC937960aW2LJIIIIZZ;
        if (this.LLILZ && (interfaceC937960aW2LJIIIIZZ = LJIIIIZZ()) != null) {
            interfaceC937960aW2LJIIIIZZ.LJ();
        }
        try {
            if (LJIIIZ() != null) {
                C786410Ut5.LJJJLZIJ(LJIIIZ(), this.LL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release failed: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("MultiGuestV3PreAdjustPlayerHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC939110aXt
    public final void LIZ(Pair<Integer, Integer> pair) {
        InterfaceC937960aW2 interfaceC937960aW2LJIIIIZZ = LJIIIIZZ();
        if (interfaceC937960aW2LJIIIIZZ != null) {
            interfaceC937960aW2LJIIIIZZ.LIZ(pair);
        }
    }

    @Override // X.InterfaceC939110aXt
    public final void LIZIZ(boolean z) {
        C0IEU c0ieu;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestV3PreAdjustPlayerHandler");
        sbLIZ.append("_resetToFullScreen, notify=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C0IEU c0ieu2 = new C0IEU(-1, -1, 0, 0, 0, true, EnumC918990a1R.valueOf("NORMAL"), "MultiGuestV3PreAdjustPlayerHandler_resetToFullScreen", (InterfaceC463550IFt) null, "MultiGuestV3PreAdjustPlayerHandler_resetToFullScreen", false, 2816);
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.zW(AudienceVideoViewParams.class, c0ieu2);
                return;
            }
            return;
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 == null || (c0ieu = (C0IEU) dataChannel2.gg0(AudienceVideoViewParams.class)) == null) {
            return;
        }
        c0ieu.LIZ = -1;
        c0ieu.LIZIZ = -1;
        c0ieu.LIZJ = 0;
        c0ieu.LIZLLL = 0;
        c0ieu.LJ = 0;
        c0ieu.LJFF = true;
        c0ieu.LJI = EnumC918990a1R.valueOf("NORMAL");
        c0ieu.LJII = "MultiGuestV3PreAdjustPlayerHandler_resetToFullScreen";
        c0ieu.LJIIJ = "MultiGuestV3PreAdjustPlayerHandler_resetToFullScreen";
    }

    @Override // X.InterfaceC939110aXt
    public final void LIZJ(Rect rect) {
        InterfaceC937960aW2 interfaceC937960aW2LJIIIIZZ = LJIIIIZZ();
        if (interfaceC937960aW2LJIIIIZZ != null) {
            interfaceC937960aW2LJIIIIZZ.LIZIZ(rect);
        }
    }

    @Override // X.InterfaceC939110aXt
    public final void LIZLLL(Room room) {
        if (this.LLILLL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiGuestV3PreAdjustPlayerHandler");
            sbLIZ.append("_initMessageManager return messageManager has init or room is null");
            C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(room.getId());
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.BASE_LINK_LAYER_MESSAGE.getIntType(), this);
        } else {
            iMessageManager = null;
        }
        this.LLILLL = iMessageManager;
    }

    @Override // X.InterfaceC939110aXt
    public final boolean LJFF(Room room) {
        return C500260Jjc.LJJJI(Boolean.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Io0(room)));
    }

    @Override // X.InterfaceC939110aXt
    public final void LJII(C2180891AWx c2180891AWx) {
        Rect playerRange = c2180891AWx.getPlayerRange();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestV3PreAdjustPlayerHandler");
        sbLIZ.append("_updatePlayer rect = ");
        sbLIZ.append(playerRange);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        int iWidth = playerRange.width();
        int iHeight = playerRange.height();
        int i = playerRange.top;
        int i2 = playerRange.left;
        int width = this.LL.getWidth() - playerRange.right;
        String layoutName = c2180891AWx.getLayoutName();
        if (layoutName == null) {
            layoutName = "NORMAL";
        }
        C0IEU c0ieu = new C0IEU(iWidth, iHeight, i, i2, width, false, EnumC918990a1R.valueOf(layoutName), "pre adjust manager", (InterfaceC463550IFt) null, (String) null, false, 3840);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MultiGuestV3PreAdjustPlayerHandler");
        sbLIZ2.append("_sendAdjustPlayerEvent");
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ2));
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zW(AudienceVideoViewParams.class, c0ieu);
        }
    }

    public final void LJIIJ(boolean z) {
        this.LLILZ = z;
        if (z) {
            IMessageManager iMessageManager = this.LLILLL;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
            this.LLILLL = null;
            release();
            if (!LinkmicRtcRatioOptimizePlayerHandler.isEnable()) {
                LIZIZ(true);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestV3PreAdjustPlayerHandler");
        sbLIZ.append("_updateIsLinkMicClose value = ");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if ((iMessage instanceof LinkLayerMessage) && ((LinkLayerMessage) iMessage).messageType == 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiGuestV3PreAdjustPlayerHandler");
            sbLIZ.append("_onMessage receive destroy channel msg");
            C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MultiGuestV3PreAdjustPlayerHandler");
            sbLIZ2.append("_updateLinkMicState2Close");
            C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ2));
            LJIIJ(true);
        }
    }

    public C938390aWj(ViewGroup viewGroup, DataChannel dataChannel) {
        this.LL = viewGroup;
        this.LLILLJJLI = dataChannel;
    }
}
