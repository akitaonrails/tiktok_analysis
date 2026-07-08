package X;

import Y.ARunnableS26S0101000_15;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.gamelink.v2.widget.GameLinkV2Widget;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkControlWidget;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLinkButtonSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS144S0400000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aB9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925010aB9 implements InterfaceC924460aAG, InterfaceC968210bIp {
    public static final HashMap<String, InterfaceC924460aAG> LLJILJIL = new HashMap<>();
    public InterfaceC924920aB0 LL;
    public final DataChannel LLILLJJLI;
    public int LLILLL;
    public Room LLILZ;
    public InterfaceC954180awC LLILZIL;
    public InterfaceC945140ahc LLILZLL;
    public final ArrayList<InterfaceC964770bDH> LLIZ;
    public C949400aoU LLIZLLLIL;
    public Function1<? super SeiAppData, Unit> LLJ;
    public C922940a7o LLJI;
    public final C01GW LLJIJIL;

    @Override // X.InterfaceC924460aAG
    public final void Ie() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkControlDestroy: ");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LJIIIZ("GameLinkManager", C2188811AlT.LIZIZ(sbLIZ));
        try {
            IMessageService iMessageService = (IMessageService) C1161920gLG.LIZJ(IMessageService.class);
            Room room = this.LLILZ;
            IMessageManager iMessageManager = iMessageService.get(room != null ? room.getId() : 0L);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(C001A.LINK_MESSAGE.getIntType(), (C987070bnF) this.LLJIJIL.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("GameLinkManager", "", e);
        }
        LIZLLL(this.LLILZIL, "dispose_GameLinkManager_detach");
        this.LLILZIL = null;
        InterfaceC945140ahc interfaceC945140ahc = this.LLILZLL;
        if (interfaceC945140ahc != null) {
            interfaceC945140ahc.LJ(this);
        }
        InterfaceC945140ahc interfaceC945140ahc2 = this.LLILZLL;
        if (interfaceC945140ahc2 != null) {
            interfaceC945140ahc2.dispose();
        }
        synchronized (this.LLIZ) {
            try {
                this.LLIZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C925070aBF.LIZ = false;
        C925070aBF.LIZIZ = false;
        C925070aBF.LIZJ = null;
        ((C11NJ) C925070aBF.LIZLLL.getValue()).LJ();
        C20441214yg.LJIIIZ("GameLinkPermissionManager", "onDetach");
    }

    @Override // X.InterfaceC924460aAG
    public final int LLJLLIL() {
        InterfaceC954180awC interfaceC954180awC = this.LLILZIL;
        if (interfaceC954180awC != null) {
            return interfaceC954180awC.LLJLLIL();
        }
        return 0;
    }

    @Override // X.InterfaceC924460aAG
    public final void Le() {
        C922940a7o c922940a7o = this.LLJI;
        if (c922940a7o != null) {
            c922940a7o.release();
        }
        this.LLJI = null;
    }

    @Override // X.InterfaceC924460aAG
    public final int scene() {
        InterfaceC954180awC interfaceC954180awC = this.LLILZIL;
        if (interfaceC954180awC != null) {
            return interfaceC954180awC.scene();
        }
        return 4;
    }

    @Override // X.InterfaceC924460aAG
    public final InterfaceC923040a7y He() {
        return this.LLJI;
    }

    @Override // X.InterfaceC924460aAG
    public final int Je() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC924460aAG
    public final Room LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC924460aAG
    public final InterfaceC954180awC LLJLL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC924460aAG
    public final DataChannel getDataChannel() {
        return this.LLILLJJLI;
    }

    public C925010aB9(DataChannel dataChannel) {
        C921810a5z c921810a5z = new C921810a5z() { // from class: X.0a9z
            @Override // X.C921810a5z, X.InterfaceC964770bDH
            public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
                DataChannel dataChannel2;
                if (!LiveGameLinkButtonSetting.INSTANCE.isExperimentGroup() && (dataChannel2 = this.LL.LLILLJJLI) != null) {
                    dataChannel2.SX0(C956720b0I.class, new Pair(interfaceC954180awC, inviteMessage));
                }
            }

            @Override // X.C921810a5z, X.InterfaceC964770bDH
            public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
                DataChannel dataChannel2;
                if (!LiveGameLinkButtonSetting.INSTANCE.isExperimentGroup() && (dataChannel2 = this.LL.LLILLJJLI) != null) {
                    dataChannel2.SX0(C956720b0I.class, null);
                }
            }
        };
        this.LLILLL = 4;
        this.LLIZ = new ArrayList<>();
        this.LLJIJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 46));
        this.LLILLJJLI = dataChannel;
        Fe(c921810a5z);
    }

    @Override // X.InterfaceC924460aAG
    public final void Fe(InterfaceC964770bDH interfaceC964770bDH) {
        synchronized (this.LLIZ) {
            try {
                this.LLIZ.add(interfaceC964770bDH);
                InterfaceC954180awC interfaceC954180awC = this.LLILZIL;
                if (interfaceC954180awC != null) {
                    interfaceC954180awC.LJJZZIII(interfaceC964770bDH);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC924460aAG
    public final void Ge(C945320ahu c945320ahu) {
        SeiAppData seiAppDataLJII;
        InterfaceC954180awC interfaceC954180awC;
        if (c945320ahu != null && (seiAppDataLJII = C969340bKe.LJII(c945320ahu)) != null && (interfaceC954180awC = this.LLILZIL) != null && Intrinsics.LJFF(interfaceC954180awC.U3(), seiAppDataLJII.channelId)) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS144S0400000_15(this, c945320ahu, interfaceC954180awC, seiAppDataLJII, 0));
        }
    }

    public final void LIZIZ(InterfaceC954180awC interfaceC954180awC) {
        String strU3;
        String strLIZLLL;
        StreamUrl streamUrl;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initLinkMicSession, channelId = ");
        if (interfaceC954180awC != null) {
            strU3 = interfaceC954180awC.U3();
        } else {
            strU3 = null;
        }
        sbLIZ.append(strU3);
        C20441214yg.LJIIIZ("GameLinkManager", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC964770bDH interfaceC964770bDH : this.LLIZ) {
            if (interfaceC954180awC != null) {
                interfaceC954180awC.LJJZZIII(interfaceC964770bDH);
            }
        }
        MixInfo.Builder builder = new MixInfo.Builder();
        Room room = this.LLILZ;
        if (room != null && (streamUrl = room.getStreamUrl()) != null) {
            strLIZLLL = streamUrl.LIZLLL();
        } else {
            strLIZLLL = null;
        }
        builder.setStreamUrl(strLIZLLL);
        builder.setStreamMixer(null);
        C949400aoU c949400aoU = new C949400aoU(false, builder.build(), new InterfaceC965060bDk() { // from class: X.0aBA
            @Override // X.InterfaceC965060bDk
            public final InterfaceC754220TiG create() {
                return null;
            }
        }, false, false, "#2F173A", null, false, null, null, null, null, 8152);
        this.LLIZLLLIL = c949400aoU;
        if (interfaceC954180awC != null) {
            interfaceC954180awC.b9(c949400aoU);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    @Override // X.InterfaceC968210bIp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIIL(X.InterfaceC954180awC r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onSessionCreate, "
            r1.append(r0)
            X.0bEC r7 = (X.C965340bEC) r7
            java.lang.String r0 = r7.U3()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r4 = "GameLinkManager"
            X.C20441214yg.LJIIIZ(r4, r0)
            X.0awC r0 = r6.LLILZIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L8f
            boolean r0 = r7.LJLIIIL()
            if (r0 == 0) goto L8f
            r5 = 1
        L2c:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "result = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " scene = "
            r1.append(r0)
            int r0 = r7.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C944230ag9.LIZ(r4, r0, r3)
            com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLinkButtonSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLinkButtonSetting.INSTANCE
            boolean r0 = r0.isExperimentGroup()
            if (r0 != 0) goto L64
            if (r5 == 0) goto L8d
            com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder r0 = X.C924250a9v.LIZ()
            java.lang.String r1 = r7.U3()
            java.util.HashSet<java.lang.String> r0 = r0.LJJLJLI
            boolean r0 = X.C13LP.LJJJJ(r1, r0)
            if (r0 != 0) goto L8d
        L63:
            r5 = r2
        L64:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isDestroy: "
            r2.append(r0)
            com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder r0 = X.C924250a9v.LIZ()
            java.lang.String r1 = r7.U3()
            java.util.HashSet<java.lang.String> r0 = r0.LJJLJLI
            boolean r0 = X.C13LP.LJJJJ(r1, r0)
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C944230ag9.LIZ(r4, r0, r3)
            if (r5 == 0) goto L8c
            r6.LLILZIL = r7
            r6.LIZIZ(r7)
        L8c:
            return
        L8d:
            r2 = 0
            goto L63
        L8f:
            r5 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C925010aB9.LLLLIIL(X.0awC):void");
    }

    @Override // X.InterfaceC968210bIp
    public final void LLLLLLLZIL(InterfaceC954180awC interfaceC954180awC) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSessionDestroy, ");
        sbLIZ.append(interfaceC954180awC.U3());
        C20441214yg.LJIIIZ("GameLinkManager", C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL(interfaceC954180awC, "dispose_on_session_destroy");
        if (Intrinsics.LJFF(this.LLILZIL, interfaceC954180awC)) {
            this.LLILZIL = null;
        }
        C924250a9v.LIZ().LJJZ = false;
    }

    @Override // X.InterfaceC924460aAG
    public final void Me(C924880aAw c924880aAw) {
        this.LL = c924880aAw;
    }

    @Override // X.InterfaceC924460aAG
    public final void Ne(AwS594S0100000_15 awS594S0100000_15) {
        this.LLJ = awS594S0100000_15;
    }

    @Override // X.InterfaceC924460aAG
    public final void a9(InterfaceC964770bDH interfaceC964770bDH) {
        synchronized (this.LLIZ) {
            try {
                this.LLIZ.remove(interfaceC964770bDH);
                InterfaceC954180awC interfaceC954180awC = this.LLILZIL;
                if (interfaceC954180awC != null) {
                    interfaceC954180awC.LLIFFJFJJ(interfaceC964770bDH);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC924460aAG
    public final void b9(C949400aoU c949400aoU) {
        C949400aoU c949400aoU2 = this.LLIZLLLIL;
        if (c949400aoU2 == null) {
            c949400aoU2 = null;
        }
        if (!Intrinsics.LJFF(c949400aoU, c949400aoU2)) {
            this.LLIZLLLIL = c949400aoU;
            InterfaceC954180awC interfaceC954180awC = this.LLILZIL;
            if (interfaceC954180awC != null) {
                interfaceC954180awC.b9(c949400aoU);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    @Override // X.InterfaceC924460aAG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ke(android.content.Context r38, com.bytedance.android.livesdkapi.depend.model.live.Room r39) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C925010aB9.Ke(android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    public final void LIZJ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, boolean z) {
        List<Long> list;
        C924250a9v.LIZ().LJJ(multiLiveAnchorPanelSettings);
        C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettings;
        InterfaceC924920aB0 interfaceC924920aB0 = this.LL;
        if (interfaceC924920aB0 != null) {
            C924880aAw c924880aAw = (C924880aAw) interfaceC924920aB0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GameLinkAnchorSettingUpdate:");
            sbLIZ.append(multiLiveAnchorPanelSettings);
            C20441214yg.LJIIIZ("GameLinkControlWidget", C2188811AlT.LIZIZ(sbLIZ));
            int i = 1;
            if (z) {
                C923050a7z.LIZJ = "live_play";
                c924880aAw.LIZ.z1(EnumC925190aBR.AUDIENCE_OPEN);
                Room room = c924880aAw.LIZ.LLILZ;
                if (room != null && room.getLinkMicInfo() != null && (list = c924880aAw.LIZ.LLILZ.getLinkMicInfo().audienceIdList) != null && list.size() > 0) {
                    C924810aAp.LJ().LJIIIZ(true);
                } else {
                    C924810aAp.LJ().LJIIIZ(false);
                }
            }
            if (C925050aBD.LJIIJJI(multiLiveAnchorPanelSettings)) {
                GameLinkControlWidget gameLinkControlWidget = c924880aAw.LIZ;
                if (!gameLinkControlWidget.y1()) {
                    C20441214yg.LJIIIZ("GameLinkControlWidget", "onGameLinkEnable");
                    C925050aBD.LIZLLL(gameLinkControlWidget.dataChannel);
                }
            } else {
                if (C925050aBD.LJIIIZ()) {
                    GameLinkControlWidget gameLinkControlWidget2 = c924880aAw.LIZ;
                    C925050aBD.LJII(gameLinkControlWidget2.dataChannel);
                    GameLinkV2Widget gameLinkV2Widget = gameLinkControlWidget2.LLILLL;
                    if (gameLinkV2Widget != null) {
                        gameLinkV2Widget.B1(false);
                    }
                }
                i = 0;
            }
            if (z) {
                ARunnableS26S0101000_15 aRunnableS26S0101000_15 = new ARunnableS26S0101000_15(i, c924880aAw.LIZ.LLILZ, 3);
                if (LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
                    aRunnableS26S0101000_15.run();
                }
            }
        }
    }

    public final void LIZLLL(InterfaceC954180awC interfaceC954180awC, String str) {
        String strU3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseLinkMicSession, channelId = ");
        if (interfaceC954180awC != null) {
            strU3 = interfaceC954180awC.U3();
        } else {
            strU3 = null;
        }
        sbLIZ.append(strU3);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("GameLinkManager", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.LLIZ) {
            try {
                for (InterfaceC964770bDH interfaceC964770bDH : this.LLIZ) {
                    if (interfaceC954180awC != null) {
                        interfaceC954180awC.LLIFFJFJJ(interfaceC964770bDH);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (interfaceC954180awC != null) {
            interfaceC954180awC.LJLJI(str, EnumC965730bEp.UNKNOWN);
        }
    }

    @Override // X.InterfaceC924460aAG
    public final void Oe(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        String strU3;
        long j;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        InterfaceC954180awC interfaceC954180awC = this.LLILZIL;
        if (interfaceC954180awC == null || (strU3 = interfaceC954180awC.U3()) == null) {
            strU3 = "";
        }
        if (TextUtils.isEmpty(strU3)) {
            j = -1;
        } else {
            j = CastLongProtector.parseLong(strU3);
        }
        Room room = this.LLILZ;
        if (room != null) {
            this.LLJI = new C922940a7o(room, j, this, iMessageManager, lifecycleOwner);
        }
    }
}
