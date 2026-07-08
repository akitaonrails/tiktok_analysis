package X;

import Y.AObserverS179S0200000_15;
import Y.AfS3S0000100_15;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.coordinator.TriggerCombinedMatchPanelDismissEvent;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent;
import com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.api.TwoMatchApi;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AFwS338S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0bXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977560bXu implements InterfaceC976280bVq {
    public final MatchBaseWidget LIZ;
    public EnumC919170a1j LIZIZ;
    public final DataChannel LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public GiftMode LJFF;
    public String LJI;
    public final C977630bY1 LJII;
    public InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> LJIIIIZZ;
    public Function2<? super Boolean, ? super Boolean, Unit> LJIIIZ;
    public Function2<? super EnumC976510bWD, ? super Boolean, Unit> LJIIJ;
    public Function1<? super Boolean, Unit> LJIIJJI;
    public Function0<Unit> LJIIL;
    public LinkDialog LJIILIIL;
    public Function0<Unit> LJIILJJIL;
    public Long LJIILL;
    public C986440bmE LJIILLIIL;
    public AObserverS179S0200000_15 LJIIZILJ;

    @Override // X.InterfaceC976280bVq
    public final void LIZIZ() {
        C977630bY1 c977630bY1;
        MutableLiveData mutableLiveData;
        C977630bY1 c977630bY12;
        MutableLiveData mutableLiveData2;
        C20441214yg.LJ("CombinedMatchInviterCoordinator", "onStateWillLeave");
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasLeftCurrentState: ");
        sbLIZ.append(true);
        C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL = true;
        C977630bY1 c977630bY13 = this.LJII;
        if (c977630bY13 != null) {
            c977630bY13.LJI();
        }
        LIZLLL();
        C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", "will clear invite viewModel");
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget != null && (c977630bY12 = this.LJII) != null && (mutableLiveData2 = c977630bY12.LJJI) != null) {
            mutableLiveData2.removeObservers(matchBaseWidget);
        }
        AObserverS179S0200000_15 aObserverS179S0200000_15 = this.LJIIZILJ;
        if (aObserverS179S0200000_15 != null && (c977630bY1 = this.LJII) != null && (mutableLiveData = c977630bY1.LJJI) != null) {
            mutableLiveData.removeObserver(aObserverS179S0200000_15);
        }
        this.LJIIZILJ = null;
        C977630bY1 c977630bY14 = this.LJII;
        if (c977630bY14 != null) {
            c977630bY14.onCleared();
        }
    }

    @Override // X.InterfaceC976280bVq
    public final void LIZLLL() {
        C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", "dismissInvitationView");
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.LC0(TriggerCombinedMatchPanelDismissEvent.class, Boolean.TRUE);
        }
        LinkDialog linkDialog = this.LJIILIIL;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
    }

    @Override // X.InterfaceC976280bVq
    public final void LJ() {
        C977630bY1 c977630bY1 = this.LJII;
        if (c977630bY1 != null) {
            c977630bY1.LJIIJJI(EnumC976510bWD.MIC_ROOM_START, this.LJ);
        }
    }

    @Override // X.InterfaceC976280bVq
    public final void LIZ(boolean z) {
        C16FS c16fs;
        MatchBaseWidget matchBaseWidget;
        C985030bjx c985030bjx = null;
        View view = null;
        if (this.LIZIZ == EnumC919170a1j.MATCH_TYPE_1V1 && (C915980Zwa.LJII().LJJIJ().size() < 2 || (matchBaseWidget = this.LIZ) == null || matchBaseWidget.getView() == null)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateRematchBtnState isEnabled = ");
            sbLIZ.append(z);
            sbLIZ.append(", matchWidget?.view = ");
            MatchBaseWidget matchBaseWidget2 = this.LIZ;
            if (matchBaseWidget2 != null) {
                view = matchBaseWidget2.getView();
            }
            sbLIZ.append(view);
            C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        MatchBaseWidget matchBaseWidget3 = this.LIZ;
        if (matchBaseWidget3 != null) {
            c16fs = (C16FS) matchBaseWidget3.findViewById(R.id.cnn);
        } else {
            c16fs = null;
        }
        MatchBaseWidget matchBaseWidget4 = this.LIZ;
        if (matchBaseWidget4 != null) {
            c985030bjx = (C985030bjx) matchBaseWidget4.findViewById(R.id.cnl);
        }
        if (c16fs != null) {
            c16fs.setEnabled(z);
        }
        if (c985030bjx != null) {
            c985030bjx.setEnabled(z);
        }
        if (z) {
            if (c16fs != null) {
                c16fs.j0(R.style.a7v);
            }
        } else {
            if (c16fs != null) {
                c16fs.j0(R.style.a76);
            }
            if (c985030bjx == null) {
                return;
            }
            c985030bjx.LIZIZ();
        }
    }

    public final void LIZJ(long j) {
        long id;
        Room roomLJJLIIIIJ;
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
            id = roomLJJLIIIIJ.getId();
        } else {
            id = 0;
        }
        long channelId = C915980Zwa.LJII().getChannelId();
        C480460Ism.LIZ().getClass();
        ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).cancel(id, channelId, j, 0).LJIILIIL(new C0UO0()).LJJLL(new AfS3S0000100_15(j, 10), new AfS3S0000100_15(j, 11));
    }

    @Override // X.InterfaceC976280bVq
    public final void LJIIIZ(LinkMicBattleMessage linkMicBattleMessage) {
        C977630bY1 c977630bY1 = this.LJII;
        if (c977630bY1 != null) {
            c977630bY1.LJIIIIZZ(linkMicBattleMessage.actionByUserId, true);
        }
    }

    @Override // X.InterfaceC976280bVq
    public final void LJIIJ(boolean z) {
        Object objGg0;
        C962900bAG c962900bAG;
        C977630bY1 c977630bY1;
        int i = C917370Zyp.LIZ[this.LIZIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unrelated match type: ");
                    sbLIZ.append(this.LIZIZ);
                    C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                C977630bY1 c977630bY12 = this.LJII;
                if (c977630bY12 != null) {
                    c977630bY12.LJIIJJI(EnumC976510bWD.HOSTS_LIST_CHANGED, this.LJ);
                }
                if (!z) {
                    return;
                }
                C766270U4b.LIZLLL(2131853338);
                return;
            }
            C977630bY1 c977630bY13 = this.LJII;
            if (c977630bY13 != null) {
                c977630bY13.LJIIJJI(EnumC976510bWD.HOSTS_LIST_CHANGED, this.LJ);
            }
            if (LiveDirectMatchSetting.INSTANCE.isEnabled() && (c977630bY1 = this.LJII) != null) {
                ((LinkedHashMap) c977630bY1.LJJIL).clear();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("clearBattleIdMap, _battleId =  ");
                sbLIZ2.append(c977630bY1.LJJIJLIJ);
                C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (!z) {
                return;
            }
            C766270U4b.LIZLLL(2131853338);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("host list change, isInPair = ");
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleIsInTeamPairing.class);
        } else {
            objGg0 = null;
        }
        sbLIZ3.append(objGg0);
        C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ3));
        DataChannel dataChannel2 = this.LIZJ;
        if (dataChannel2 != null && (c962900bAG = (C962900bAG) dataChannel2.gg0(BattleIsInTeamPairing.class)) != null && c962900bAG.LIZ) {
            return;
        }
        C977630bY1 c977630bY14 = this.LJII;
        if (c977630bY14 != null) {
            c977630bY14.LJIIJJI(EnumC976510bWD.HOSTS_LIST_CHANGED, this.LJ);
        }
        if (!z) {
            return;
        }
        C766270U4b.LIZLLL(2131853338);
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc  */
    @Override // X.InterfaceC976280bVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r13) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977560bXu.LJIILIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b A[PHI: r2
      0x002b: PHI (r2v1 boolean) = (r2v0 boolean), (r2v3 boolean) binds: [B:20:0x0028, B:13:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC976280bVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJIIJIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r8) {
        /*
            r7 = this;
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r6 = r8.battleSetting
            r5 = 1
            if (r6 == 0) goto L2d
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta r1 = r6.giftModeMeta
            if (r1 == 0) goto L27
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r0 = r7.LJFF
            if (r0 == 0) goto L24
            long r3 = r0.giftId
        Lf:
            long r1 = r1.giftId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            r2 = 1
        L16:
            int r1 = X.C978520bZS.LJIIIZ()
            int r0 = r6.gameplayOption
            if (r1 != r0) goto L2b
            r0 = 1
        L1f:
            if (r2 == 0) goto L2d
            if (r0 == 0) goto L2d
            return r5
        L24:
            r3 = 0
            goto Lf
        L27:
            r2 = 0
            if (r6 == 0) goto L2b
            goto L16
        L2b:
            r0 = 0
            goto L1f
        L2d:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977560bXu.LJJIJIIJIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):boolean");
    }

    public C977560bXu(MatchBaseWidget matchBaseWidget, EnumC919170a1j enumC919170a1j) {
        DataChannel dataChannelProvideDataChannel;
        this.LIZ = matchBaseWidget;
        this.LIZIZ = enumC919170a1j;
        if (matchBaseWidget != null) {
            dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LIZJ = dataChannelProvideDataChannel;
        this.LJI = "";
        this.LJII = matchBaseWidget != null ? (C977630bY1) matchBaseWidget.y1(C977630bY1.class) : null;
        this.LJIIIIZZ = AFwS338S0000000_15.get$arr$(7);
        this.LJIIIZ = AFwS299S0000000_15.get$arr$(34);
        this.LJIIJ = AFwS299S0000000_15.get$arr$(33);
        this.LJIIJJI = AFwS250S0000000_15.get$arr$(182);
        this.LJIIL = AFwS203S0000000_15.get$arr$(311);
        this.LJIILJJIL = AFwS203S0000000_15.get$arr$(312);
    }

    public final void LJIILJJIL(long j, Long l) {
        long id;
        Room roomLJJLIIIIJ;
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
            id = roomLJJLIIIIJ.getId();
        } else {
            id = 0;
        }
        long channelId = C915980Zwa.LJII().getChannelId();
        C480460Ism.LIZ().getClass();
        ((TwoMatchApi) C480460Ism.LIZLLL(TwoMatchApi.class)).cancel(id, channelId, j, 0, null, null, l).LJIILIIL(new C0UO0()).LJJLL(new AfS3S0000100_15(j, 12), new AfS3S0000100_15(j, 13));
    }

    @Override // X.InterfaceC976280bVq
    public final void LJJIIJZLJL(LinkMicBattleMessage linkMicBattleMessage, boolean z) {
        MutableLiveData mutableLiveData;
        List list;
        Object next;
        C977630bY1 c977630bY1 = this.LJII;
        C754570Tip c754570Tip = null;
        if (c977630bY1 != null && (mutableLiveData = c977630bY1.LIZJ) != null && (list = (List) mutableLiveData.getValue()) != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C954460awe c954460awe = (C954460awe) next;
                    if (linkMicBattleMessage != null && c954460awe.LJ == linkMicBattleMessage.actionByUserId) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C954460awe c954460awe2 = (C954460awe) next;
            if (c954460awe2 != null) {
                c754570Tip = c954460awe2.LJIJJ;
            }
        }
        String strLIZ = C946260ajQ.LIZ(c754570Tip);
        if (linkMicBattleMessage != null && C974500bSy.LIZJ(linkMicBattleMessage)) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131856760, strLIZ));
        } else {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843057, strLIZ));
        }
        if (linkMicBattleMessage != null) {
            C974540bT2.LIZ.LJJJJLL(linkMicBattleMessage, Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC976280bVq
    public final void LJJIJLIJ(LinkMicBattleMessage linkMicBattleMessage, boolean z, AwS381S0200000_15 awS381S0200000_15) {
        String strLJIJI;
        MutableLiveData mutableLiveData;
        List list;
        MutableLiveData mutableLiveData2;
        List list2;
        Object next;
        DataChannel dataChannel = this.LIZJ;
        C754570Tip c754570Tip = null;
        if (dataChannel != null) {
            dataChannel.LC0(RematchButtonUpdateEvent.class, new C979440baw(Boolean.TRUE, null, null, 6));
        }
        C977630bY1 c977630bY1 = this.LJII;
        if (c977630bY1 != null && (mutableLiveData = c977630bY1.LIZJ) != null && (list = (List) mutableLiveData.getValue()) != null && list.size() > 2) {
            C977630bY1 c977630bY12 = this.LJII;
            if (c977630bY12 != null && (mutableLiveData2 = c977630bY12.LIZJ) != null && (list2 = (List) mutableLiveData2.getValue()) != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C954460awe c954460awe = (C954460awe) next;
                        if (linkMicBattleMessage != null && c954460awe.LJ == linkMicBattleMessage.actionByUserId) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C954460awe c954460awe2 = (C954460awe) next;
                if (c954460awe2 != null) {
                    c754570Tip = c954460awe2.LJIJJ;
                }
            }
            strLJIJI = u.LJJIFFI(C497740JfY.LJIJI(2131853306), "{username}", C946260ajQ.LIZ(c754570Tip), false);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131842869);
        }
        C766270U4b.LJIIJJI(strLJIJI);
        awS381S0200000_15.invoke(Boolean.valueOf(C974500bSy.LIZIZ(linkMicBattleMessage)));
        if (linkMicBattleMessage != null) {
            C974540bT2.LIZ.LJLJLJ(linkMicBattleMessage, Boolean.valueOf(z));
            if (LiveDirectMatchSetting.INSTANCE.isEnabled() && linkMicBattleMessage.battleSetting.inviteType == 5) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("notifyCohostStatusChangeOnReceiveRejectIM, inviteType = ");
                sbLIZ.append(linkMicBattleMessage.battleSetting.inviteType);
                sbLIZ.append(", actionByUserId = ");
                sbLIZ.append(linkMicBattleMessage.actionByUserId);
                C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
                C784440Upu.LIZ().LIZIZ(new C955910ayz(linkMicBattleMessage.battleSetting.inviteType, linkMicBattleMessage.actionByUserId));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    @Override // X.InterfaceC976280bVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair LJJIJ(kotlin.jvm.internal.AwS559S0100000_15 r15, kotlin.jvm.internal.AwS559S0100000_15 r16, kotlin.jvm.internal.AwS559S0100000_15 r17, kotlin.jvm.internal.AwS559S0100000_15 r18, kotlin.jvm.internal.AwS559S0100000_15 r19, kotlin.jvm.internal.AwS594S0100000_15 r20, X.EnumC975850bV9 r21, com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r22) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977560bXu.LJJIJ(kotlin.jvm.internal.AwS559S0100000_15, kotlin.jvm.internal.AwS559S0100000_15, kotlin.jvm.internal.AwS559S0100000_15, kotlin.jvm.internal.AwS559S0100000_15, kotlin.jvm.internal.AwS559S0100000_15, kotlin.jvm.internal.AwS594S0100000_15, X.0bV9, com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    @Override // X.InterfaceC976280bVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.EnumC975850bV9 r45, boolean r46, boolean r47, boolean r48, java.lang.String r49, com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r50, kotlin.jvm.functions.Function1<? super X.EnumC919170a1j, kotlin.Unit> r51, X.InterfaceC1631620sYq<? super java.lang.Long, ? super X.EnumC919170a1j, ? super java.util.List<com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser>, kotlin.Unit> r52, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> r53, kotlin.jvm.functions.Function2<? super X.EnumC976510bWD, ? super java.lang.Boolean, kotlin.Unit> r54, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r55, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977560bXu.LJIJJ(X.0bV9, boolean, boolean, boolean, java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode, kotlin.jvm.functions.Function1, X.0sYq, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }
}
