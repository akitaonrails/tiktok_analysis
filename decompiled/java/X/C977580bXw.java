package X;

import Y.AObserverS219S0100000_15;
import Y.AfS3S0000100_15;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AFwS338S0000000_15;
import kotlin.jvm.internal.AwS155S0110000_15;
import kotlin.jvm.internal.AwS3S0210100_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977580bXw implements InterfaceC976280bVq {
    public final MatchBaseWidget LIZ;
    public InterfaceC957770b1z LIZIZ;
    public long LIZJ;
    public final DataChannel LIZLLL;
    public final C977590bXx LJ;
    public boolean LJFF;
    public boolean LJI;
    public GiftMode LJII;
    public EnumC919170a1j LJIIIIZZ;
    public Long LJIIIZ;
    public InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> LJIIJ;
    public Function2<? super Boolean, ? super Boolean, Unit> LJIIJJI;
    public Function2<? super EnumC976510bWD, ? super Boolean, Unit> LJIIL;
    public Function1<? super Boolean, Unit> LJIILIIL;
    public Function0<Unit> LJIILJJIL;
    public C986440bmE LJIILL;
    public AObserverS219S0100000_15 LJIILLIIL;

    @Override // X.InterfaceC976280bVq
    public final void LIZIZ() {
        C977590bXx c977590bXx;
        MutableLiveData mutableLiveData;
        C20441214yg.LJ("TeamMatchInviterCoordinator", "onStateWillLeave");
        this.LJFF = true;
        C977590bXx c977590bXx2 = this.LJ;
        if (c977590bXx2 != null) {
            c977590bXx2.LJI();
        }
        LIZLLL();
        C20441214yg.LIZIZ("TeamMatchInviterCoordinator", "will clear invite viewModel");
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget != null && (c977590bXx = this.LJ) != null && (mutableLiveData = c977590bXx.LJIJ) != null) {
            mutableLiveData.removeObservers(matchBaseWidget);
        }
        this.LJIILLIIL = null;
        C977590bXx c977590bXx3 = this.LJ;
        if (c977590bXx3 != null) {
            c977590bXx3.onCleared();
        }
    }

    @Override // X.InterfaceC976280bVq
    public final void LIZLLL() {
        long j = this.LIZJ;
        if (j != 0) {
            C19322110iZ.LIZ(j);
            this.LIZJ = 0L;
        }
        InterfaceC957770b1z interfaceC957770b1z = this.LIZIZ;
        if (interfaceC957770b1z != null) {
            interfaceC957770b1z.dismiss();
        }
        this.LJIILJJIL.invoke();
    }

    @Override // X.InterfaceC976280bVq
    public final void LJ() {
        C977590bXx c977590bXx = this.LJ;
        if (c977590bXx != null) {
            c977590bXx.LJIIJ(EnumC976510bWD.MIC_ROOM_START, this.LJI);
        }
    }

    public C977580bXw(MatchBaseWidget matchBaseWidget) {
        DataChannel dataChannelProvideDataChannel;
        this.LIZ = matchBaseWidget;
        if (matchBaseWidget != null) {
            dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LIZLLL = dataChannelProvideDataChannel;
        this.LJ = matchBaseWidget != null ? (C977590bXx) matchBaseWidget.y1(C977590bXx.class) : null;
        this.LJIIIIZZ = EnumC919170a1j.MATCH_TYPE_1VN;
        this.LJIIJ = AFwS338S0000000_15.get$arr$(3);
        this.LJIIJJI = AFwS299S0000000_15.get$arr$(22);
        this.LJIIL = AFwS299S0000000_15.get$arr$(21);
        this.LJIILIIL = AFwS250S0000000_15.get$arr$(99);
        this.LJIILJJIL = AFwS203S0000000_15.get$arr$(174);
    }

    @Override // X.InterfaceC976280bVq
    public final void LIZ(boolean z) {
        C16FS c16fs;
        MatchBaseWidget matchBaseWidget = this.LIZ;
        C985030bjx c985030bjx = null;
        if (matchBaseWidget != null && matchBaseWidget.getView() != null) {
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
    }

    public final void LIZJ(long j) {
        long id;
        Room roomLJJLIIIIJ;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
            id = roomLJJLIIIIJ.getId();
        } else {
            id = 0;
        }
        long channelId = C915980Zwa.LJII().getChannelId();
        C480460Ism.LIZ().getClass();
        ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).cancel(id, channelId, j, 0).LJIILIIL(new C0UO0()).LJJLL(new AfS3S0000100_15(j, 7), new AfS3S0000100_15(j, 8));
    }

    @Override // X.InterfaceC976280bVq
    public final void LJIIIZ(LinkMicBattleMessage linkMicBattleMessage) {
        C977590bXx c977590bXx = this.LJ;
        if (c977590bXx != null) {
            c977590bXx.LJIIIIZZ(linkMicBattleMessage.actionByUserId, true);
        }
    }

    @Override // X.InterfaceC976280bVq
    public final void LJIIJ(boolean z) {
        Object objGg0;
        C962900bAG c962900bAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("host list change, isInPair = ");
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleIsInTeamPairing.class);
        } else {
            objGg0 = null;
        }
        sbLIZ.append(objGg0);
        C20441214yg.LIZIZ("TeamMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel2 = this.LIZLLL;
        if (dataChannel2 != null && (c962900bAG = (C962900bAG) dataChannel2.gg0(BattleIsInTeamPairing.class)) != null && c962900bAG.LIZ) {
            return;
        }
        C977590bXx c977590bXx = this.LJ;
        if (c977590bXx != null) {
            c977590bXx.LJIIJ(EnumC976510bWD.HOSTS_LIST_CHANGED, this.LJI);
        }
        if (z) {
            C766270U4b.LIZLLL(2131853338);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    @Override // X.InterfaceC976280bVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977580bXw.LJIILIIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):boolean");
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
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r0 = r7.LJII
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
        throw new UnsupportedOperationException("Method not decompiled: X.C977580bXw.LJJIJIIJIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):boolean");
    }

    @Override // X.InterfaceC976280bVq
    public final void LJJIIJZLJL(LinkMicBattleMessage linkMicBattleMessage, boolean z) {
        MutableLiveData mutableLiveData;
        List list;
        Object next;
        C977590bXx c977590bXx = this.LJ;
        C754570Tip c754570Tip = null;
        if (c977590bXx != null && (mutableLiveData = c977590bXx.LIZJ) != null && (list = (List) mutableLiveData.getValue()) != null) {
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    @Override // X.InterfaceC976280bVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r11, boolean r12, kotlin.jvm.internal.AwS381S0200000_15 r13) {
        /*
            r10 = this;
            X.0bXx r0 = r10.LJ
            r5 = 1
            r7 = 0
            r9 = 0
            if (r0 == 0) goto L7c
            androidx.lifecycle.MutableLiveData r0 = r0.LIZJ
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L7c
            java.util.Iterator r8 = r0.iterator()
        L17:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r6 = r8.next()
            r0 = r6
            X.0awe r0 = (X.C954460awe) r0
            if (r11 == 0) goto L17
            long r2 = r0.LJ
            long r0 = r11.actionByUserId
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L17
        L2e:
            X.0awe r6 = (X.C954460awe) r6
            if (r6 == 0) goto L7c
            X.0Tip r0 = r6.LJIJJ
        L34:
            java.lang.String r6 = X.C946260ajQ.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r4 = r10.LIZLLL
            if (r4 == 0) goto L49
            java.lang.Class<com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent> r3 = com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent.class
            X.0baw r2 = new X.0baw
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = 6
            r2.<init>(r1, r7, r7, r0)
            r4.LC0(r3, r2)
        L49:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r9] = r6
            r0 = 2131843055(0x7f1157ef, float:1.9319464E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r1)
            X.C766270U4b.LJIIJJI(r0)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r0 = r0.LLILZLL(r5)
            int r1 = r0.size()
            r0 = 3
            if (r1 < r0) goto L67
            r5 = 0
        L67:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r13.invoke(r0)
            if (r11 == 0) goto L79
            X.0bT2 r1 = X.C974540bT2.LIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r1.LJLJLJ(r11, r0)
        L79:
            return
        L7a:
            r6 = r7
            goto L2e
        L7c:
            r0 = r7
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977580bXw.LJJIJLIJ(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage, boolean, kotlin.jvm.internal.AwS381S0200000_15):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bf, code lost:
    
        if (1 == 0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    @Override // X.InterfaceC976280bVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair LJJIJ(kotlin.jvm.internal.AwS559S0100000_15 r18, kotlin.jvm.internal.AwS559S0100000_15 r19, kotlin.jvm.internal.AwS559S0100000_15 r20, kotlin.jvm.internal.AwS559S0100000_15 r21, kotlin.jvm.internal.AwS559S0100000_15 r22, kotlin.jvm.internal.AwS594S0100000_15 r23, X.EnumC975850bV9 r24, com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r25) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977580bXw.LJJIJ(kotlin.jvm.internal.AwS559S0100000_15, kotlin.jvm.internal.AwS559S0100000_15, kotlin.jvm.internal.AwS559S0100000_15, kotlin.jvm.internal.AwS559S0100000_15, kotlin.jvm.internal.AwS559S0100000_15, kotlin.jvm.internal.AwS594S0100000_15, X.0bV9, com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):kotlin.Pair");
    }

    @Override // X.InterfaceC976280bVq
    public final void LJIJJ(EnumC975850bV9 enumC975850bV9, boolean z, boolean z2, boolean z3, String str, GiftMode giftMode, Function1<? super EnumC919170a1j, Unit> function1, InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> interfaceC1631620sYq, Function2<? super Boolean, ? super Boolean, Unit> function2, Function2<? super EnumC976510bWD, ? super Boolean, Unit> function22, Function1<? super Boolean, Unit> function12, Function1<? super Long, Unit> function13, Function0<Unit> function0, Function0<Unit> function02) {
        C128Y c128yLJJJJZI;
        InterfaceC957770b1z interfaceC957770b1z;
        List<C954460awe> list;
        MutableLiveData mutableLiveData;
        long j;
        boolean z4;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData2;
        Map<Boolean, List<C954460awe>> value;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData3;
        Map<Boolean, List<C954460awe>> value2;
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        boolean z5 = z2;
        this.LJI = z5;
        this.LJII = giftMode;
        this.LJIIJ = interfaceC1631620sYq;
        this.LJIIJJI = function2;
        this.LJIIL = function22;
        this.LJIILIIL = function12;
        this.LJIILJJIL = function02;
        C977590bXx c977590bXx = this.LJ;
        List<C954460awe> list2 = null;
        if (c977590bXx != null) {
            c977590bXx.LJIIZILJ.setValue(new C977720bYA(null, null, null, null));
        }
        if (this.LIZ != null) {
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null && (fragmentManager2 = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                c128yLJJJJZI = fragmentManager2.LJJJJZI("TeamMatchInviteDialog");
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
            C20441214yg.LJ("TeamMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LIZIZ == null) {
                MatchBaseWidget matchBaseWidget = this.LIZ;
                LinkDialog linkDialogLIZJ = C977650bY3.LIZJ(matchBaseWidget, matchBaseWidget, str, giftMode, false, AFwS338S0000000_15.get$arr$(4), z5, false);
                this.LIZIZ = linkDialogLIZJ;
                DataChannel dataChannel2 = this.LIZLLL;
                if (dataChannel2 != null) {
                    fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
                } else {
                    fragmentManager = null;
                }
                linkDialogLIZJ.show(fragmentManager, "TeamMatchInviteDialog");
            }
            InterfaceC957770b1z interfaceC957770b1z2 = this.LIZIZ;
            if (interfaceC957770b1z2 != null) {
                interfaceC957770b1z2.setOnDismissListener(new DialogInterfaceOnDismissListenerC987000bn8(this, (AwS559S0100000_15) function02, 2));
            }
            C977590bXx c977590bXx2 = this.LJ;
            if (c977590bXx2 != null && (mutableLiveData3 = c977590bXx2.LJFF) != null && (value2 = mutableLiveData3.getValue()) != null) {
                list = value2.get(Boolean.TRUE);
            } else {
                list = null;
            }
            C977590bXx c977590bXx3 = this.LJ;
            if (c977590bXx3 != null && (mutableLiveData2 = c977590bXx3.LJFF) != null && (value = mutableLiveData2.getValue()) != null) {
                list2 = value.get(Boolean.FALSE);
            }
            if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
                if (list.size() == 2 && list2.size() == 2) {
                    this.LJIIIIZZ = EnumC919170a1j.MATCH_TYPE_2V2;
                }
                if (z) {
                    this.LJIIIZ = Long.valueOf(System.currentTimeMillis());
                    if (giftMode != null) {
                        j = giftMode.giftId;
                    } else {
                        j = 0;
                    }
                    EnumC919170a1j enumC919170a1j = this.LJIIIIZZ;
                    if (LiveMatchInvite4029011FixSetting.INSTANCE.isEnabled()) {
                        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
                        Iterator<C954460awe> it2 = listLLILZLL.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(it2.next().LJ));
                        }
                        z5 = z5;
                        z4 = false;
                        this.LJIILL = new C986440bmE(new C986430bmD(C13LP.LLIIJI(arrayList), enumC919170a1j, Long.valueOf(j), z5, SystemClock.elapsedRealtime()), new AwS559S0100000_15(this, 555), AFwS203S0000000_15.get$arr$(175), new AwS3S0210100_15(this, z5, j, enumC919170a1j, 0), new AwS451S0200000_15(this, (AwS155S0110000_15) function2, 9), new AwS559S0100000_15(this, 556));
                    } else {
                        z4 = false;
                    }
                    C977590bXx c977590bXx4 = this.LJ;
                    if (c977590bXx4 != null) {
                        c977590bXx4.LJJI = C977760bYE.LIZ(z4);
                    }
                    C977590bXx c977590bXx5 = this.LJ;
                    if (c977590bXx5 != null) {
                        c977590bXx5.LJIILJJIL(z5, Long.valueOf(j), this.LJIIIIZZ);
                    }
                    if (LiveMatchInviteMockSetting.INSTANCE.isOrphanBattleEnabled()) {
                        C20441214yg.LJIIL("TeamMatchInviterCoordinator", "MOCK: forcing hasLeftCurrentState=true to simulate orphan battle race condition");
                        this.LJFF = true;
                    }
                }
                if (!LiveMatchInvite4029011FixSetting.INSTANCE.isEnabled() || this.LJIILLIIL == null) {
                    AObserverS219S0100000_15 aObserverS219S0100000_15 = new AObserverS219S0100000_15(this, 31);
                    this.LJIILLIIL = aObserverS219S0100000_15;
                    C977590bXx c977590bXx6 = this.LJ;
                    if (c977590bXx6 != null && (mutableLiveData = c977590bXx6.LJIJ) != null) {
                        mutableLiveData.observe(this.LIZ, aObserverS219S0100000_15);
                        return;
                    }
                    return;
                }
                return;
            }
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.TEAM_EMPTY, 0, z5, EnumC919170a1j.MATCH_TYPE_2V2, 6);
        }
    }
}
