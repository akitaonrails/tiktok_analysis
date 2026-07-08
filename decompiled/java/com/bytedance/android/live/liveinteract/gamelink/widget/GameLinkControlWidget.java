package com.bytedance.android.live.liveinteract.gamelink.widget;

import X.C20441214yg;
import X.C2188811AlT;
import X.C464660IKa;
import X.C465900IOu;
import X.C772560USg;
import X.C776250Uch;
import X.C921810a5z;
import X.C923050a7z;
import X.C924650aAZ;
import X.C924810aAp;
import X.C924850aAt;
import X.C924880aAw;
import X.C924910aAz;
import X.C925050aBD;
import X.C930910aKf;
import X.C941700ac4;
import X.C944640ago;
import X.C945320ahu;
import X.C948450amx;
import X.EnumC925190aBR;
import X.InterfaceC500940Jki;
import X.InterfaceC924460aAG;
import X.InterfaceC924870aAv;
import X.InterfaceC924890aAx;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.gamelink.v2.widget.GameLinkV2Widget;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.room.SeiCacheChannel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.game.linkmic.AbsGameLinkControlWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveOneTapGoliveEntranceSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class GameLinkControlWidget extends AbsGameLinkControlWidget implements InterfaceC924890aAx {
    public InterfaceC924870aAv LL;
    public InterfaceC924460aAG LLILLJJLI;
    public GameLinkV2Widget LLILLL;
    public Room LLILZ;
    public final C944640ago LLILZIL = C944640ago.LLILLJJLI.getValue();
    public final C924910aAz LLILZLL = new C924910aAz(this);
    public final C924880aAw LLIZ = new C924880aAw(this);
    public final C924850aAt LLIZLLLIL = new C921810a5z() { // from class: X.0aAt
        @Override // X.C921810a5z, X.InterfaceC964770bDH
        public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = C925050aBD.LJFF();
            if (C925050aBD.LJIIJJI(multiLiveAnchorPanelSettingsLJFF)) {
                if (multiLiveAnchorPanelSettingsLJFF != null && multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq == 3 && multiLiveAnchorPanelSettingsLJFF.allowViewerReq == 3) {
                    return;
                }
                GameLinkControlWidget gameLinkControlWidget = this.LL;
                if (gameLinkControlWidget.y1()) {
                    return;
                }
                C20441214yg.LJIIIZ("GameLinkControlWidget", "onGameLinkEnable");
                C925050aBD.LIZLLL(gameLinkControlWidget.dataChannel);
                return;
            }
            C925050aBD.LJII(this.LL.dataChannel);
        }

        @Override // X.C921810a5z, X.InterfaceC964770bDH
        public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CreateChannelMessage:");
            sbLIZ.append(createChannelMessage);
            C20441214yg.LJIIIZ("GameLinkControlWidget", C2188811AlT.LIZIZ(sbLIZ));
            C924250a9v.LIZ().LJJLL = true;
            C924810aAp.LJ().LJIILJJIL = createChannelMessage.owner.linkMicId;
            C923050a7z.LIZJ = "others";
            this.LL.z1(EnumC925190aBR.AUDIENCE_OPEN);
            GameLinkControlWidget gameLinkControlWidget = this.LL;
            C925070aBF.LIZJ(gameLinkControlWidget.LLILZ, gameLinkControlWidget);
        }

        @Override // X.C921810a5z, X.InterfaceC964770bDH
        public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
            EnumC918970a1P enumC918970a1P;
            DataChannel dataChannel;
            C20441214yg.LJIIIZ("GameLinkControlWidget", "receive:DestroyChannelMessage");
            C924250a9v.LIZ().LJJLL = false;
            C924250a9v.LIZ().LJJLJLI.add(interfaceC954180awC.U3());
            GameLinkControlWidget gameLinkControlWidget = this.LL;
            gameLinkControlWidget.getClass();
            C20441214yg.LJIIIZ("GameLinkControlWidget", "onGameLinkTurnedOff");
            C924810aAp.LJ().LIZIZ(Boolean.FALSE);
            C923050a7z.LJFF("other");
            C923050a7z.LJI("connection_over");
            if (C924790aAn.LIZLLL().LJFF() && ((dataChannel = gameLinkControlWidget.dataChannel) == null || dataChannel.gg0(PIPStatusData.class) == null || !((Boolean) gameLinkControlWidget.dataChannel.gg0(PIPStatusData.class)).booleanValue())) {
                if (gameLinkControlWidget.LLJ == null) {
                    C782110Um9 c782110Um9 = new C782110Um9(gameLinkControlWidget.context);
                    c782110Um9.LJII(2131843472);
                    c782110Um9.LJIILIIL(2131843699, new InterfaceC743640TFa() { // from class: X.0aAu
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            liveDialog.dismiss();
                        }
                    });
                    gameLinkControlWidget.LLJ = c782110Um9.LIZ();
                }
                LiveDialog liveDialog = gameLinkControlWidget.LLJ;
                if (liveDialog != null) {
                    C786410Ut5.E4(liveDialog);
                }
            }
            InterfaceC924870aAv interfaceC924870aAv = gameLinkControlWidget.LL;
            if (interfaceC924870aAv != null) {
                interfaceC924870aAv.LIZ(gameLinkControlWidget.LLILLL);
                gameLinkControlWidget.LLILLL = null;
            }
            gameLinkControlWidget.LLILZLL.LIZ(8);
            GameLinkDataHolder gameLinkDataHolderLIZLLL = C924650aAZ.LIZLLL();
            if (gameLinkDataHolderLIZLLL != null) {
                enumC918970a1P = gameLinkDataHolderLIZLLL.LJJJJI;
            } else {
                enumC918970a1P = null;
            }
            if (enumC918970a1P == EnumC918970a1P.GRID_FIX || enumC918970a1P == EnumC918970a1P.FLOATING_FIX || enumC918970a1P == EnumC918970a1P.GRID || enumC918970a1P == EnumC918970a1P.FLOATING) {
                C924650aAZ.LJIILJJIL("others", null);
                C924650aAZ.LJIILL("others", EnumC918970a1P.NORMAL, null);
            }
            InterfaceC924460aAG interfaceC924460aAG = gameLinkControlWidget.LLILLJJLI;
            if (interfaceC924460aAG != null) {
                interfaceC924460aAG.Le();
            }
            C924250a9v.LIZ().LJIIZILJ(true);
        }
    };
    public LiveDialog LLJ = null;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hs4;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.AbsGameLinkControlWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        Integer num;
        C20441214yg.LJIIIZ("GameLinkControlWidget", "onDestroy");
        this.LL = null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            C944640ago c944640ago = this.LLILZIL;
            c944640ago.getClass();
            try {
                IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
                if (iMessageManager != null) {
                    iMessageManager.removeMessageListener(c944640ago);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
            }
        }
        InterfaceC924460aAG interfaceC924460aAG = this.LLILLJJLI;
        if (interfaceC924460aAG != null) {
            interfaceC924460aAG.Me(null);
            this.LLILLJJLI.a9(this.LLIZLLLIL);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.zQ2(this);
        if (C464660IKa.LIZ()) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            C941700ac4.LIZLLL();
        }
        C772560USg c772560USg = (C772560USg) dataChannelGlobal.gg0(C930910aKf.class);
        if (c772560USg == null || (num = c772560USg.LIZIZ) == null || num.intValue() != 1 || !TTliveOneTapGoliveEntranceSetting.INSTANCE.getValue()) {
            C948450amx c948450amx = C948450amx.LIZIZ;
            Room room = this.LLILZ;
            c948450amx.LIZ(room != null ? Long.valueOf(room.getId()) : null, "GameLinkControlWidget#onDestroy");
        }
        super.onDestroy();
    }

    public final boolean y1() {
        Room room = this.LLILZ;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        return (interfaceC500940JkiUser == null || room == null || room.getOwnerUserId() != interfaceC500940JkiUser.getCurrentUserId()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkControlWidget.onCreate():void");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0aAt] */
    public GameLinkControlWidget(InterfaceC924870aAv interfaceC924870aAv) {
        C20441214yg.LJIIIZ("GameLinkControlWidget", "GameLinkControlWidget");
        this.LL = interfaceC924870aAv;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.AbsGameLinkControlWidget
    public final void x1(C945320ahu c945320ahu) {
        GameLinkV2Widget gameLinkV2Widget = this.LLILLL;
        if (gameLinkV2Widget != null) {
            gameLinkV2Widget.C1(c945320ahu);
        }
    }

    public final void z1(EnumC925190aBR enumC925190aBR) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGameLinkTurnedOn:");
        sbLIZ.append(enumC925190aBR);
        C20441214yg.LJIIIZ("GameLinkControlWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (!isViewValid()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onGameLinkTurnedOn but view invalid");
            sbLIZ2.append(enumC925190aBR);
            C20441214yg.LJIIIZ("GameLinkControlWidget", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (this.LLILZ != null) {
            InterfaceC924870aAv interfaceC924870aAv = this.LL;
            if (interfaceC924870aAv != null && this.LLILLJJLI != null) {
                GameLinkV2Widget gameLinkV2Widget = new GameLinkV2Widget(this.LLILLJJLI);
                interfaceC924870aAv.LIZIZ(gameLinkV2Widget);
                this.LLILLL = gameLinkV2Widget;
                C20441214yg.LJIIIZ("GameLinkControlWidget", "loadGameLinkWidget");
                if (MultiGuestV3RoomLoadingOptSetting.INSTANCE.isEnable()) {
                    this.LLILLL.C1((C945320ahu) this.dataChannel.gg0(SeiCacheChannel.class));
                }
            }
            if (!y1()) {
                DataChannel dataChannel = this.dataChannel;
                if (C925050aBD.LJIIJ()) {
                    C925050aBD.LJII(dataChannel);
                } else {
                    C925050aBD.LIZLLL(dataChannel);
                }
            }
            C923050a7z.LIZ = SystemClock.uptimeMillis();
            Map mapLIZ = C923050a7z.LIZ(null);
            String str = C923050a7z.LIZJ;
            if (str == null) {
                str = "others";
            }
            HashMap map = (HashMap) mapLIZ;
            map.put("trigger", str);
            map.put("permission_type", C925050aBD.LJ());
            C924650aAZ.LIZIZ(mapLIZ);
            C923050a7z.LIZJ = null;
            C923050a7z.LJ("livesdk_guest_connection_mode_view_start", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()), mapLIZ);
        }
        C924810aAp.LJ().LIZIZ(Boolean.TRUE);
    }

    @Override // X.InterfaceC781470Ul7
    public final boolean LLIIJLIL(Runnable runnable, boolean z, boolean z2, C465900IOu c465900IOu, String str, boolean z3, EnterRoomConfig enterRoomConfig) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("interceptCloseRoom: ");
        sbLIZ.append(z);
        sbLIZ.append(", showDialog=");
        sbLIZ.append(z2);
        sbLIZ.append(", liveEvent=");
        sbLIZ.append(c465900IOu);
        sbLIZ.append(", skippingToOtherRoomSource=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("GameLinkControlWidget", C2188811AlT.LIZIZ(sbLIZ));
        GameLinkV2Widget gameLinkV2Widget = this.LLILLL;
        if (gameLinkV2Widget != null) {
            return gameLinkV2Widget.z1(runnable, z2, c465900IOu);
        }
        return false;
    }
}
