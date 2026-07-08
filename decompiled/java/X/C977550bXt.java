package X;

import Y.AObserverS179S0200000_15;
import Y.AfS3S0000100_15;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.api.QuickStartRequestEvent;
import com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.api.TwoMatchApi;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4029011FixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviteMockSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AFwS338S0000000_15;
import kotlin.jvm.internal.AwS155S0110000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS3S0210100_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977550bXt implements InterfaceC976280bVq {
    public final MatchBaseWidget LIZ;
    public InterfaceC957770b1z LIZIZ;
    public final DataChannel LIZJ;
    public final C977620bY0 LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public GiftMode LJI;
    public final EnumC919170a1j LJII;
    public Long LJIIIIZZ;
    public InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> LJIIIZ;
    public Function2<? super Boolean, ? super Boolean, Unit> LJIIJ;
    public Function2<? super EnumC976510bWD, ? super Boolean, Unit> LJIIJJI;
    public Function1<? super Boolean, Unit> LJIIL;
    public Function0<Unit> LJIILIIL;
    public AObserverS179S0200000_15 LJIILJJIL;
    public C986440bmE LJIILL;

    @Override // X.InterfaceC976280bVq
    public final void LJIIIZ(LinkMicBattleMessage linkMicBattleMessage) {
    }

    @Override // X.InterfaceC976280bVq
    public final void LJJIIJZLJL(LinkMicBattleMessage linkMicBattleMessage, boolean z) {
    }

    @Override // X.InterfaceC976280bVq
    public final void LIZIZ() {
        C977620bY0 c977620bY0;
        MutableLiveData mutableLiveData;
        C20441214yg.LJ("TwoMatchInviterCoordinator", "onStateWillLeave");
        this.LJ = true;
        C977620bY0 c977620bY02 = this.LIZLLL;
        if (c977620bY02 != null) {
            c977620bY02.LJI();
        }
        LIZLLL();
        C20441214yg.LIZIZ("TwoMatchInviterCoordinator", "will clear invite viewModel");
        C977620bY0 c977620bY03 = this.LIZLLL;
        if (c977620bY03 != null) {
            c977620bY03.onCleared();
        }
        AObserverS179S0200000_15 aObserverS179S0200000_15 = this.LJIILJJIL;
        if (aObserverS179S0200000_15 != null && (c977620bY0 = this.LIZLLL) != null && (mutableLiveData = c977620bY0.LJIJ) != null) {
            mutableLiveData.removeObserver(aObserverS179S0200000_15);
        }
        this.LJIILJJIL = null;
    }

    @Override // X.InterfaceC976280bVq
    public final void LIZLLL() {
        InterfaceC957770b1z interfaceC957770b1z = this.LIZIZ;
        if (interfaceC957770b1z != null) {
            interfaceC957770b1z.dismiss();
        }
        this.LJIILIIL.invoke();
    }

    @Override // X.InterfaceC976280bVq
    public final void LJ() {
        C977620bY0 c977620bY0 = this.LIZLLL;
        if (c977620bY0 != null) {
            c977620bY0.LJIIJJI(EnumC976510bWD.MIC_ROOM_START, this.LJFF);
        }
    }

    public C977550bXt(MatchBaseWidget matchBaseWidget) {
        DataChannel dataChannelProvideDataChannel;
        this.LIZ = matchBaseWidget;
        if (matchBaseWidget != null) {
            dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LIZJ = dataChannelProvideDataChannel;
        this.LIZLLL = matchBaseWidget != null ? (C977620bY0) matchBaseWidget.y1(C977620bY0.class) : null;
        this.LJII = EnumC919170a1j.MATCH_TYPE_1V1;
        this.LJIIIZ = AFwS338S0000000_15.get$arr$(12);
        this.LJIIJ = AFwS299S0000000_15.get$arr$(45);
        this.LJIIJJI = AFwS299S0000000_15.get$arr$(44);
        this.LJIIL = AFwS250S0000000_15.get$arr$(203);
        this.LJIILIIL = AFwS203S0000000_15.get$arr$(372);
    }

    @Override // X.InterfaceC976280bVq
    public final void LIZ(boolean z) {
        MatchBaseWidget matchBaseWidget;
        C16FS c16fs;
        View view = null;
        C985030bjx c985030bjx = null;
        if (C915980Zwa.LJII().LJJIJ().size() >= 2 && (matchBaseWidget = this.LIZ) != null && matchBaseWidget.getView() != null) {
            MatchBaseWidget matchBaseWidget2 = this.LIZ;
            if (matchBaseWidget2 != null) {
                c16fs = (C16FS) matchBaseWidget2.findViewById(R.id.cnn);
            } else {
                c16fs = null;
            }
            MatchBaseWidget matchBaseWidget3 = this.LIZ;
            if (matchBaseWidget3 != null) {
                c985030bjx = (C985030bjx) matchBaseWidget3.findViewById(R.id.cnl);
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
                    return;
                }
                return;
            } else {
                if (c16fs != null) {
                    c16fs.j0(R.style.a76);
                }
                if (c985030bjx == null) {
                    return;
                }
                c985030bjx.LIZIZ();
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRematchBtnState isEnabled = ");
        sbLIZ.append(z);
        sbLIZ.append(", matchWidget?.view = ");
        MatchBaseWidget matchBaseWidget4 = this.LIZ;
        if (matchBaseWidget4 != null) {
            view = matchBaseWidget4.getView();
        }
        sbLIZ.append(view);
        C20441214yg.LIZIZ("TwoMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC976280bVq
    public final void LJIIJ(boolean z) {
        C977620bY0 c977620bY0;
        C977620bY0 c977620bY02 = this.LIZLLL;
        if (c977620bY02 != null) {
            c977620bY02.LJIIJJI(EnumC976510bWD.HOSTS_LIST_CHANGED, this.LJFF);
        }
        if (LiveDirectMatchSetting.INSTANCE.isEnabled() && (c977620bY0 = this.LIZLLL) != null) {
            c977620bY0.LJIIL();
        }
        if (z) {
            C766270U4b.LIZLLL(2131853338);
        }
    }

    @Override // X.InterfaceC976280bVq
    public final boolean LJIILIIL(LinkMicBattleMessage linkMicBattleMessage) {
        long jLongValue;
        Long l;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        List<C954460awe> list;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l2 = this.LJIIIIZZ;
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        if (jCurrentTimeMillis - jLongValue > 3000) {
            return false;
        }
        C977620bY0 c977620bY0 = this.LIZLLL;
        if (c977620bY0 != null && (mutableLiveData = c977620bY0.LJFF) != null && (value = mutableLiveData.getValue()) != null && (list = value.get(Boolean.FALSE)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C954460awe> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ));
            }
            l = (Long) C13LP.LJJJLL(arrayList);
        } else {
            l = null;
        }
        long j = linkMicBattleMessage.actionByUserId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message teamUser = ");
        sbLIZ.append(linkMicBattleMessage.teamUsers);
        C20441214yg.LIZIZ("TwoMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isMeanwhile , inviteHostIds = ");
        sbLIZ2.append(l);
        sbLIZ2.append(" and responseIds = ");
        sbLIZ2.append(j);
        C20441214yg.LJ("TwoMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
        if (l == null || l.longValue() != j) {
            return false;
        }
        return true;
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
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r0 = r7.LJI
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
        throw new UnsupportedOperationException("Method not decompiled: X.C977550bXt.LJJIJIIJIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):boolean");
    }

    public final void LIZJ(long j, Long l) {
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
        ((TwoMatchApi) C480460Ism.LIZLLL(TwoMatchApi.class)).cancel(id, channelId, j, 0, null, null, l).LJIILIIL(new C0UO0()).LJJLL(new AfS3S0000100_15(j, 14), new AfS3S0000100_15(j, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    @Override // X.InterfaceC976280bVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r9, boolean r10, kotlin.jvm.internal.AwS381S0200000_15 r11) {
        /*
            r8 = this;
            X.0bY0 r0 = r8.LIZLLL
            r5 = 0
            if (r0 == 0) goto La9
            androidx.lifecycle.MutableLiveData r0 = r0.LIZJ
            if (r0 == 0) goto La9
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto La9
            java.util.Iterator r7 = r0.iterator()
        L15:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r6 = r7.next()
            r0 = r6
            X.0awe r0 = (X.C954460awe) r0
            if (r9 == 0) goto L15
            long r3 = r0.LJ
            long r1 = r9.actionByUserId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
        L2c:
            X.0awe r6 = (X.C954460awe) r6
            if (r6 == 0) goto La9
            X.0Tip r0 = r6.LJIJJ
        L32:
            X.C946260ajQ.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r4 = r8.LIZJ
            if (r4 == 0) goto L46
            java.lang.Class<com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent> r3 = com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent.class
            X.0baw r2 = new X.0baw
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = 6
            r2.<init>(r1, r5, r5, r0)
            r4.LC0(r3, r2)
        L46:
            r0 = 2131842869(0x7f115735, float:1.9319086E38)
            X.C766270U4b.LIZLLL(r0)
            boolean r0 = X.C974500bSy.LIZIZ(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11.invoke(r0)
            if (r9 == 0) goto La6
            X.0bT2 r1 = X.C974540bT2.LIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1.LJLJLJ(r9, r0)
            com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting.INSTANCE
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto La6
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r9.battleSetting
            int r1 = r0.inviteType
            r0 = 5
            if (r1 != r0) goto La6
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "notifyCohostStatusChangeOnReceiveRejectIM, inviteType = "
            r2.append(r0)
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r9.battleSetting
            int r0 = r0.inviteType
            r2.append(r0)
            java.lang.String r0 = ", actionByUserId = "
            r2.append(r0)
            long r0 = r9.actionByUserId
            r2.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "TwoMatchInviterCoordinator"
            X.C20441214yg.LIZIZ(r0, r1)
            X.0Upu r4 = X.C784440Upu.LIZ()
            X.0ayz r3 = new X.0ayz
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r9.battleSetting
            int r2 = r0.inviteType
            long r0 = r9.actionByUserId
            r3.<init>(r2, r0)
            r4.LIZIZ(r3)
        La6:
            return
        La7:
            r6 = r5
            goto L2c
        La9:
            r0 = r5
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977550bXt.LJJIJLIJ(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage, boolean, kotlin.jvm.internal.AwS381S0200000_15):void");
    }

    @Override // X.InterfaceC976280bVq
    public final Pair LJJIJ(AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152, AwS559S0100000_15 awS559S0100000_153, AwS559S0100000_15 awS559S0100000_154, AwS559S0100000_15 awS559S0100000_155, AwS594S0100000_15 awS594S0100000_15, EnumC975850bV9 enumC975850bV9, LinkMicBattleMessage linkMicBattleMessage) {
        return new Pair(Boolean.FALSE, Boolean.TRUE);
    }

    @Override // X.InterfaceC976280bVq
    public final void LJIJJ(EnumC975850bV9 enumC975850bV9, boolean z, boolean z2, boolean z3, String str, GiftMode giftMode, Function1<? super EnumC919170a1j, Unit> function1, InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> interfaceC1631620sYq, Function2<? super Boolean, ? super Boolean, Unit> function2, Function2<? super EnumC976510bWD, ? super Boolean, Unit> function22, Function1<? super Boolean, Unit> function12, Function1<? super Long, Unit> function13, Function0<Unit> function0, Function0<Unit> function02) {
        C977620bY0 c977620bY0;
        C977620bY0 c977620bY02;
        C977620bY0 c977620bY03;
        C128Y c128yLJJJJZI;
        InterfaceC957770b1z interfaceC957770b1z;
        boolean z4;
        MutableLiveData mutableLiveData;
        long j;
        boolean z5;
        List<C954460awe> list;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData2;
        Map<Boolean, List<C954460awe>> value;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData3;
        Map<Boolean, List<C954460awe>> value2;
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        C977620bY0 c977620bY04 = this.LIZLLL;
        if (c977620bY04 != null) {
            c977620bY04.LIZ(this.LIZJ);
        }
        if (enumC975850bV9 != EnumC975850bV9.INVITER_FROM_FRIEND_RANK) {
            C977620bY0 c977620bY05 = this.LIZLLL;
            if (c977620bY05 != null) {
                c977620bY05.LIZIZ();
            }
        } else {
            List<C954460awe> listLIZIZ = C2074808Aw.LIZIZ();
            List<C954460awe> listLIZLLL = C2074808Aw.LIZLLL();
            List<C954460awe> listLIZJ = C2074808Aw.LIZJ();
            if ((!listLIZIZ.isEmpty()) && (c977620bY03 = this.LIZLLL) != null) {
                c977620bY03.LIZLLL(listLIZIZ);
            }
            if ((!listLIZLLL.isEmpty()) && (!listLIZJ.isEmpty()) && (c977620bY02 = this.LIZLLL) != null) {
                c977620bY02.LJIIIZ(new ArrayList(listLIZLLL), new ArrayList(listLIZJ));
            }
            Map<Long, GiftGalleryBadgeInfo> mapLIZ = C2074808Aw.LIZ();
            if ((!mapLIZ.isEmpty()) && (c977620bY0 = this.LIZLLL) != null) {
                c977620bY0.LJ(mapLIZ);
            }
        }
        this.LJFF = z2;
        this.LJI = giftMode;
        this.LJIIIZ = interfaceC1631620sYq;
        this.LJIIJ = function2;
        this.LJIIJJI = function22;
        this.LJIIL = function12;
        this.LJIILIIL = function02;
        if (this.LIZ != null) {
            DataChannel dataChannel = this.LIZJ;
            List<C954460awe> list2 = null;
            if (dataChannel != null && (fragmentManager2 = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                c128yLJJJJZI = fragmentManager2.LJJJJZI("TwoMatchInviteDialog");
            } else {
                c128yLJJJJZI = null;
            }
            if (c128yLJJJJZI instanceof InterfaceC957770b1z) {
                interfaceC957770b1z = (InterfaceC957770b1z) c128yLJJJJZI;
            } else {
                interfaceC957770b1z = null;
            }
            this.LIZIZ = interfaceC957770b1z;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inviteDialog  = ");
            sbLIZ.append(this.LIZIZ);
            C20441214yg.LJ("TwoMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            if (enumC975850bV9 != EnumC975850bV9.AUTO_MATCH_INVITER_FROM_JSB && enumC975850bV9 != EnumC975850bV9.SOLO_INVITER_FROM_JSB) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (this.LIZIZ == null && !z4) {
                MatchBaseWidget matchBaseWidget = this.LIZ;
                LinkDialog linkDialogLIZLLL = C977650bY3.LIZLLL(matchBaseWidget, matchBaseWidget, str, giftMode, null, null, AFwS338S0000000_15.get$arr$(13), null, null, z2, null, null, 3504);
                this.LIZIZ = linkDialogLIZLLL;
                DataChannel dataChannel2 = this.LIZJ;
                if (dataChannel2 != null) {
                    fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
                } else {
                    fragmentManager = null;
                }
                linkDialogLIZLLL.show(fragmentManager, "TwoMatchInviteDialog");
            }
            InterfaceC957770b1z interfaceC957770b1z2 = this.LIZIZ;
            if (interfaceC957770b1z2 != null) {
                interfaceC957770b1z2.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9((AwS559S0100000_15) function02, 25));
            }
            if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
                C977620bY0 c977620bY06 = this.LIZLLL;
                if (c977620bY06 != null && (mutableLiveData3 = c977620bY06.LJFF) != null && (value2 = mutableLiveData3.getValue()) != null) {
                    list = value2.get(Boolean.TRUE);
                } else {
                    list = null;
                }
                C977620bY0 c977620bY07 = this.LIZLLL;
                if (c977620bY07 != null && (mutableLiveData2 = c977620bY07.LJFF) != null && (value = mutableLiveData2.getValue()) != null) {
                    list2 = value.get(Boolean.FALSE);
                }
                if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
                    C20441214yg.LJ("TwoMatchInviterCoordinator", "selfTeam or rivalTeamList is empty");
                    C974540bT2 c974540bT2 = C974540bT2.LIZ;
                    C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.TEAM_EMPTY, 0, z2, EnumC919170a1j.MATCH_TYPE_1V1, 6);
                    return;
                }
            }
            if (z) {
                this.LJIIIIZZ = Long.valueOf(System.currentTimeMillis());
                if (giftMode != null) {
                    j = giftMode.giftId;
                } else {
                    j = 0;
                }
                EnumC919170a1j enumC919170a1j = this.LJII;
                if (LiveMatchInvite4029011FixSetting.INSTANCE.isEnabled()) {
                    List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
                    Iterator<C954460awe> it2 = listLLILZLL.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Long.valueOf(it2.next().LJ));
                    }
                    z5 = false;
                    this.LJIILL = new C986440bmE(new C986430bmD(C13LP.LLIIJI(arrayList), enumC919170a1j, Long.valueOf(j), z2, SystemClock.elapsedRealtime()), new AwS559S0100000_15(this, 997), AFwS203S0000000_15.get$arr$(373), new AwS3S0210100_15(this, z2, j, enumC919170a1j, 3), new AwS451S0200000_15(this, (AwS155S0110000_15) function2, 19), new AwS559S0100000_15(this, 998));
                } else {
                    z5 = false;
                }
                C977620bY0 c977620bY08 = this.LIZLLL;
                if (c977620bY08 != null) {
                    c977620bY08.LJJIIZI = C977760bYE.LIZ(z5);
                }
                C977620bY0 c977620bY09 = this.LIZLLL;
                if (c977620bY09 != null) {
                    c977620bY09.LJIJJLI(z2, Long.valueOf(j), this.LJII);
                }
                if (LiveMatchInviteMockSetting.INSTANCE.isOrphanBattleEnabled()) {
                    C20441214yg.LJIIL("TwoMatchInviterCoordinator", "MOCK: forcing hasLeftCurrentState=true to simulate orphan battle race condition");
                    this.LJ = true;
                }
            }
            if (!LiveMatchInvite4029011FixSetting.INSTANCE.isEnabled() || this.LJIILJJIL == null) {
                AObserverS179S0200000_15 aObserverS179S0200000_15 = new AObserverS179S0200000_15(enumC975850bV9, this, 5);
                this.LJIILJJIL = aObserverS179S0200000_15;
                C977620bY0 c977620bY010 = this.LIZLLL;
                if (c977620bY010 != null && (mutableLiveData = c977620bY010.LJIJ) != null) {
                    mutableLiveData.observeForever(aObserverS179S0200000_15);
                }
            }
            if (LiveDirectMatchSetting.INSTANCE.isEnabled()) {
                AwS381S0200000_15 awS381S0200000_15 = new AwS381S0200000_15((AwS594S0100000_15) function13, this, 140);
                DataChannel dataChannel3 = this.LIZJ;
                if (dataChannel3 != null) {
                    dataChannel3.BQ2(this.LIZ, QuickStartRequestEvent.class, new AwS594S0100000_15(awS381S0200000_15, 931));
                }
            }
        }
    }
}
