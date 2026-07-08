package X;

import Y.AObserverS179S0200000_15;
import Y.AObserverS31S0500000_15;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.invitee.TeamPairInviteeCohostRoomFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.VWSettingsPageCloseChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTechMonitorCalibrationSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchInvitePanelConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchThemeDisplayResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS58S0010000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import kotlin.jvm.internal.AwS97S0210000_15;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974910bTd implements InterfaceC976410bW3 {
    public static C974910bTd LJIIJJI;
    public final MatchBaseWidget LIZ;
    public LinkDialog LIZIZ;
    public long LIZJ;
    public final DataChannel LIZLLL;
    public final C975250bUB LJ;
    public boolean LJFF;
    public LinkMicBattleMessage LJI;
    public boolean LJII;
    public long LJIIIIZZ;
    public final boolean LJIIIZ;
    public C11JF LJIIJ;

    @Override // X.InterfaceC976410bW3
    public final void LIZIZ() {
        this.LJFF = true;
        C975250bUB c975250bUB = this.LJ;
        if (c975250bUB != null) {
            c975250bUB.LJI();
        }
        this.LIZIZ = null;
        this.LIZJ = 0L;
        C500260Jjc.LJJLIIIJLJLI(this.LJIIJ);
        this.LJIIJ = null;
        LJIIJJI = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC976410bW3
    public final void LJIIJJI() {
        BattleSetting battleSetting;
        C962900bAG c962900bAG;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel == null || (c962900bAG = (C962900bAG) dataChannel.gg0(BattleIsInTeamPairing.class)) == null || !c962900bAG.LIZ) {
            boolean z = this.LJII;
            C975250bUB c975250bUB = this.LJ;
            if (c975250bUB != null) {
                EnumC976390bW1 enumC976390bW1 = EnumC976390bW1.HOSTS_LIST_CHANGED;
                long j = this.LJIIIIZZ;
                LinkMicBattleMessage linkMicBattleMessage = this.LJI;
                c975250bUB.LJIIJJI(enumC976390bW1, j, (linkMicBattleMessage == null || (battleSetting = linkMicBattleMessage.battleSetting) == null) ? C915980Zwa.LJII().getChannelId() : battleSetting.channelId, z ? 1 : 0);
            }
        }
    }

    public C974910bTd(MatchBaseWidget matchBaseWidget) {
        DataChannel dataChannelProvideDataChannel;
        this.LIZ = matchBaseWidget;
        if (matchBaseWidget != null) {
            dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LIZLLL = dataChannelProvideDataChannel;
        this.LJ = matchBaseWidget != null ? (C975250bUB) matchBaseWidget.y1(C975250bUB.class) : null;
        C20337914i1<Integer> c20337914i1 = InterfaceC980390bcT.Ha;
        boolean z = true;
        if (c20337914i1.LIZIZ().intValue() < 1) {
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        } else {
            z = false;
        }
        this.LJIIIZ = z;
    }

    @Override // X.InterfaceC976410bW3
    public final void LIZ(boolean z) {
        View viewFindViewById;
        MatchBaseWidget matchBaseWidget = this.LIZ;
        C985030bjx c985030bjx = null;
        if (matchBaseWidget != null && matchBaseWidget.getView() != null) {
            MatchBaseWidget matchBaseWidget2 = this.LIZ;
            if (matchBaseWidget2 != null) {
                viewFindViewById = matchBaseWidget2.findViewById(R.id.cnn);
            } else {
                viewFindViewById = null;
            }
            MatchBaseWidget matchBaseWidget3 = this.LIZ;
            if (matchBaseWidget3 != null && (c985030bjx = (C985030bjx) matchBaseWidget3.findViewById(R.id.cnl)) != null) {
                C786410Ut5.LLJL(c985030bjx, 8);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setEnabled(z);
            }
            if (c985030bjx != null) {
                c985030bjx.setEnabled(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[PHI: r3
      0x0036: PHI (r3v1 X.0awe) = (r3v0 X.0awe), (r3v4 X.0awe) binds: [B:16:0x0034, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ(long r7) {
        /*
            r6 = this;
            X.0bUB r0 = r6.LJ
            r5 = 0
            if (r0 == 0) goto L2c
            androidx.lifecycle.MutableLiveData r0 = r0.LIZJ
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L2c
            java.util.Iterator r4 = r0.iterator()
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.0awe r0 = (X.C954460awe) r0
            long r1 = r0.LJ
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L15
        L28:
            X.0awe r3 = (X.C954460awe) r3
            if (r3 != 0) goto L36
        L2c:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            X.0awe r3 = r0.LLILL(r7)
            if (r3 == 0) goto L38
        L36:
            X.0Tip r5 = r3.LJIJJ
        L38:
            java.lang.String r0 = X.C946260ajQ.LIZ(r5)
            return r0
        L3d:
            r3 = r5
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974910bTd.LIZJ(long):java.lang.String");
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIIIZ(LinkMicBattleMessage linkMicBattleMessage) {
        C975250bUB c975250bUB = this.LJ;
        if (c975250bUB != null) {
            c975250bUB.LJIIIIZZ(linkMicBattleMessage.actionByUserId, true);
        }
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIILLIIL(String str) {
        Boolean boolValueOf;
        if (C464790IKn.LIZ.LIZIZ(this.LIZJ)) {
            C19322110iZ.LIZ(this.LIZJ);
            this.LIZJ = 0L;
        }
        LinkDialog linkDialog = this.LIZIZ;
        if (linkDialog != null) {
            boolValueOf = Boolean.valueOf(linkDialog.isVisible());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C974540bT2.LIZ.LJLJJLL(str, this.LJII);
        }
        LinkDialog linkDialog2 = this.LIZIZ;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIL(LinkMicBattleMessage linkMicBattleMessage) {
        if (C974500bSy.LIZJ(linkMicBattleMessage)) {
            C766270U4b.LIZLLL(2131856756);
            LJJIFFI(false, true);
        } else {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843057, LIZJ(linkMicBattleMessage.actionByUserId)));
        }
        C974540bT2.LIZ.LJJJJLL(linkMicBattleMessage, Boolean.valueOf(this.LJII));
    }

    public final void LJJJI(Function0<Unit> function0) {
        long id;
        User owner;
        if (this.LJFF) {
            return;
        }
        C20441214yg.LIZIZ("TeamMatchInviteeCoordinator", "handleAcceptRequestSuccess");
        C975250bUB c975250bUB = this.LJ;
        if (c975250bUB != null) {
            c975250bUB.LJIILJJIL.setValue(Boolean.FALSE);
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(c975250bUB.LIZ);
            if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            c975250bUB.LJIIIIZZ(id, true);
        }
        function0.invoke();
    }

    public final void LJIILJJIL(Throwable th, Function1<? super Boolean, Unit> function1) {
        boolean z;
        long id;
        User owner;
        if (this.LJFF) {
            return;
        }
        C20441214yg.LIZIZ("TeamMatchInviteeCoordinator", "handleAcceptRequestFailed");
        C975250bUB c975250bUB = this.LJ;
        if (c975250bUB != null) {
            c975250bUB.LJIILJJIL.setValue(Boolean.FALSE);
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(c975250bUB.LIZ);
            if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            c975250bUB.LJIIIIZZ(id, false);
        }
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            if (!TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
            } else {
                if (c501470JlZ.getErrorCode() == 4004048) {
                    C766270U4b.LIZLLL(2131842762);
                    z = true;
                }
                function1.invoke(Boolean.valueOf(z));
                LJJIFFI(false, false);
            }
        } else {
            C766270U4b.LIZLLL(2131852422);
        }
        z = false;
        function1.invoke(Boolean.valueOf(z));
        LJJIFFI(false, false);
    }

    public final void LJJIFFI(boolean z, boolean z2) {
        DataChannel dataChannel;
        C962900bAG c962900bAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTeamPairFlag ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("TeamMatchInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel2 = this.LIZLLL;
        if ((dataChannel2 != null && (c962900bAG = (C962900bAG) dataChannel2.gg0(BattleIsInTeamPairing.class)) != null && c962900bAG.LIZ == z) || (dataChannel = this.LIZLLL) == null) {
            return;
        }
        dataChannel.zW(BattleIsInTeamPairing.class, new C962900bAG(z, z2, 4));
    }

    @Override // X.InterfaceC976410bW3
    public final void LJJIIJ(LinkMicBattleMessage linkMicBattleMessage, boolean z) {
        LJJIFFI(false, true);
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843056, LIZJ(linkMicBattleMessage.actionByUserId)));
        C974540bT2.LIZ.LJLJLJ(linkMicBattleMessage, Boolean.valueOf(this.LJII));
    }

    public final void LJJJIL(EnumC976390bW1 enumC976390bW1, Function1<? super EnumC976390bW1, Unit> function1) {
        if (this.LJFF) {
            return;
        }
        C20441214yg.LIZIZ("TeamMatchInviteeCoordinator", "handleRejectRequestFailed");
        C975250bUB c975250bUB = this.LJ;
        if (c975250bUB != null) {
            c975250bUB.LJIILLIIL.setValue(Boolean.TRUE);
        }
        function1.invoke(enumC976390bW1);
        LJJIFFI(false, false);
    }

    public final void LJJJJ(EnumC976390bW1 enumC976390bW1, Function1<? super EnumC976390bW1, Unit> function1) {
        if (this.LJFF) {
            return;
        }
        C20441214yg.LIZIZ("TeamMatchInviteeCoordinator", "handleRejectRequestSuccess");
        C975250bUB c975250bUB = this.LJ;
        if (c975250bUB != null) {
            c975250bUB.LJIILLIIL.setValue(Boolean.TRUE);
        }
        function1.invoke(enumC976390bW1);
        LJJIFFI(false, false);
    }

    @Override // X.InterfaceC976410bW3
    public final boolean LJIJ(boolean z, LinkMicBattleMessage linkMicBattleMessage, AwS416S0200000_15 awS416S0200000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS594S0100000_15 awS594S0100000_153) {
        LiveData<Boolean> liveData;
        MutableLiveData mutableLiveData;
        FragmentManager fragmentManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("teamPairInviteePanelTag already show, return, ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ");
        C20484715Dp c20484715Dp = C464790IKn.LIZ;
        sbLIZ.append(c20484715Dp.LIZIZ(this.LIZJ));
        C20441214yg.LIZIZ("TeamMatchInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        this.LJI = linkMicBattleMessage;
        long j = this.LIZJ;
        long jLJFF = 0;
        if (j != 0 && c20484715Dp.LIZIZ(j)) {
            return true;
        }
        if (linkMicBattleMessage.action == 7) {
            C20441214yg.LIZIZ("TeamMatchInviteeCoordinator", "receive accept message, should not open again");
            return true;
        }
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        C975250bUB c975250bUB = this.LJ;
        if (c975250bUB != null) {
            c975250bUB.LIZLLL(listLJIJJ);
        }
        if (z) {
            C975250bUB c975250bUB2 = this.LJ;
            if (c975250bUB2 != null) {
                c975250bUB2.LIZ(this.LIZLLL);
            }
            C975250bUB c975250bUB3 = this.LJ;
            if (c975250bUB3 != null) {
                c975250bUB3.onCleared();
            }
            C975250bUB c975250bUB4 = this.LJ;
            if (c975250bUB4 != null) {
                c975250bUB4.LJFF(this.LIZLLL, LiveMatchTeamPairConfigSetting.INSTANCE.getValue().inviteeWaitingTime, new AwS416S0200000_15(this, linkMicBattleMessage, 125));
            }
            LJJIFFI(true, false);
        }
        DataChannel dataChannel = this.LIZLLL;
        C975250bUB c975250bUB5 = this.LJ;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("match_team_pair_invitee_cohost_dialog");
            if ((fragmentLJJJJZI instanceof TeamPairInviteeCohostRoomFragment) && !fragmentLJJJJZI.isVisible() && !fragmentLJJJJZI.isAdded()) {
                jLJFF = C19322110iZ.LIZLLL(fragmentManager, TeamPairInviteeCohostRoomFragment.class, "match_team_pair_invitee_cohost_dialog", null, null);
            } else {
                TeamPairInviteeCohostRoomFragment teamPairInviteeCohostRoomFragment = new TeamPairInviteeCohostRoomFragment();
                teamPairInviteeCohostRoomFragment.LLL = dataChannel;
                teamPairInviteeCohostRoomFragment.LLLIILIL = c975250bUB5;
                teamPairInviteeCohostRoomFragment.LLLF = linkMicBattleMessage;
                jLJFF = C19322110iZ.LJFF(fragmentManager, teamPairInviteeCohostRoomFragment, "match_team_pair_invitee_cohost_dialog", null, 0);
            }
        }
        this.LIZJ = jLJFF;
        DataChannel dataChannel2 = this.LIZLLL;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(VWSettingsPageCloseChannel.class);
        }
        C973260bQy.LIZ(this, C918130a03.LIZ(Integer.valueOf(linkMicBattleMessage.battleSetting.battleType)));
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget != null) {
            C975250bUB c975250bUB6 = this.LJ;
            if (c975250bUB6 != null && (mutableLiveData = c975250bUB6.LJIJI) != null) {
                mutableLiveData.observe(matchBaseWidget, new AObserverS31S0500000_15(this, awS416S0200000_15, awS594S0100000_15, awS594S0100000_152, awS594S0100000_153, 0));
            }
            C975250bUB c975250bUB7 = this.LJ;
            if (c975250bUB7 != null && (liveData = c975250bUB7.LJIILIIL) != null) {
                liveData.observe(matchBaseWidget, new AObserverS179S0200000_15(awS594S0100000_152, this, 10));
            }
            DataChannel dataChannel3 = this.LIZLLL;
            if (dataChannel3 != null) {
                dataChannel3.BQ2(matchBaseWidget, BattleIsInTeamPairing.class, new AwS381S0200000_15(this, awS594S0100000_153, 171));
            }
        }
        return true;
    }

    @Override // X.InterfaceC976410bW3
    public final boolean LJJIII(EnumC975850bV9 enumC975850bV9, LinkMicBattleMessage linkMicBattleMessage, boolean z, boolean z2, boolean z3, AwS664S0100000_15 awS664S0100000_15, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS594S0100000_15 awS594S0100000_153) {
        Text text;
        MatchInvitePanelConfig matchInvitePanelConfig;
        Integer numValueOf;
        MutableLiveData mutableLiveData;
        FragmentManager fragmentManager;
        GiftModeMeta giftModeMeta;
        Long lValueOf;
        int i;
        C975250bUB c975250bUB;
        Long lValueOf2;
        User owner;
        EnumC977660bY4 enumC977660bY4;
        LinkDialog linkDialog = this.LIZIZ;
        if (linkDialog != null && linkDialog.isVisible()) {
            LinkDialog linkDialog2 = this.LIZIZ;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TYPE_TEAM_MATCH_INVITEE) {
                return true;
            }
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        this.LJI = linkMicBattleMessage;
        this.LJII = z3;
        this.LJIIIIZZ = linkMicBattleMessage.battleId;
        if (z) {
            C975250bUB c975250bUB2 = this.LJ;
            if (c975250bUB2 != null) {
                c975250bUB2.LIZ(this.LIZLLL);
            }
            C975250bUB c975250bUB3 = this.LJ;
            if (c975250bUB3 != null) {
                c975250bUB3.onCleared();
            }
            C975250bUB c975250bUB4 = this.LJ;
            if (c975250bUB4 != null) {
                c975250bUB4.LIZLLL(listLJIJJ);
            }
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZLLL);
            if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                lValueOf = Long.valueOf(owner.getId());
            } else {
                lValueOf = null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<TeamUsersInfo> list = linkMicBattleMessage.teamUsers;
            if (list != null) {
                for (TeamUsersInfo teamUsersInfo : list) {
                    if (teamUsersInfo.userIds.contains(lValueOf)) {
                        Iterator<Long> it2 = teamUsersInfo.userIds.iterator();
                        while (it2.hasNext()) {
                            C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(it2.next().longValue());
                            if (c954460aweLLILL != null) {
                                arrayList.add(c954460aweLLILL);
                            }
                        }
                    } else {
                        Iterator<Long> it3 = teamUsersInfo.userIds.iterator();
                        while (it3.hasNext()) {
                            C954460awe c954460aweLLILL2 = C915980Zwa.LJII().LLILL(it3.next().longValue());
                            if (c954460aweLLILL2 != null) {
                                arrayList2.add(c954460aweLLILL2);
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                C975250bUB c975250bUB5 = this.LJ;
                if (c975250bUB5 != null) {
                    c975250bUB5.LJIIIZ(arrayList, arrayList2);
                }
                C975250bUB c975250bUB6 = this.LJ;
                if (c975250bUB6 != null) {
                    c975250bUB6.LJIIIIZZ(linkMicBattleMessage.actionByUserId, true);
                }
                if (z2 && (c975250bUB = this.LJ) != null) {
                    long j = linkMicBattleMessage.battleId;
                    BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
                    if (battleSetting != null) {
                        lValueOf2 = Long.valueOf(battleSetting.channelId);
                    } else {
                        lValueOf2 = null;
                    }
                    c975250bUB.LJIIJ(1, j, lValueOf2, z3);
                }
                int iLIZ = C978480bZO.LIZ(false);
                C975250bUB c975250bUB7 = this.LJ;
                if (c975250bUB7 != null) {
                    c975250bUB7.LJFF(this.LIZLLL, iLIZ, new AwS97S0210000_15(z3, this, linkMicBattleMessage, 5));
                }
            } else {
                C20441214yg.LJ("TeamMatchInviteeCoordinator", "invite message teamList empty");
                C974540bT2 c974540bT2 = C974540bT2.LIZ;
                EnumC974920bTe enumC974920bTe = EnumC974920bTe.TEAM_LIST_EMPTY;
                BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
                if (battleSetting2 != null) {
                    i = battleSetting2.inviteType;
                } else {
                    i = 0;
                }
                long j2 = linkMicBattleMessage.battleId;
                EnumC919170a1j enumC919170a1jXB0 = EnumC919170a1j.MATCH_TYPE_2V2;
                if (LiveMatchTechMonitorCalibrationSetting.INSTANCE.isFunnelDetailEnabled()) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    C0K04.LJFF("reason", enumC974920bTe.getValue(), jSONObject);
                    C0K04.LJFF("role_type", "invitee", jSONObject);
                    C0K04.LIZLLL(i, "invite_type", jSONObject);
                    C0K04.LJ("battle_id", j2, jSONObject);
                    try {
                        C0K04.LIZLLL(C915980Zwa.LJFF().RY(false).ordinal(), "match_status", jSONObject);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("match_status read failed: ");
                        sbLIZ.append(e.getMessage());
                        C20441214yg.LJIIL("livesdk_multi_match", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C0K04.LJFF("reason", enumC974920bTe.getValue(), jSONObject2);
                    C0K04.LJFF("role_type", "invitee", jSONObject2);
                    if (enumC919170a1jXB0 == null) {
                        enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                    }
                    c974540bT2.LLIIIZ("reject_silent_drop", jSONObject, jSONObject2, new JSONObject(), false, enumC919170a1jXB0);
                }
                return false;
            }
        }
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget != null) {
            long j3 = this.LJIIIIZZ;
            boolean z4 = this.LJIIIZ;
            BattleSetting battleSetting3 = linkMicBattleMessage.battleSetting;
            if (battleSetting3 != null && (giftModeMeta = battleSetting3.giftModeMeta) != null) {
                text = giftModeMeta.giftModeDesc;
            } else {
                text = null;
            }
            MatchThemeDisplayResource matchThemeDisplayResource = linkMicBattleMessage.matchThemeDisplayResource;
            if (matchThemeDisplayResource != null) {
                matchInvitePanelConfig = matchThemeDisplayResource.matchInvitePanelConfig;
            } else {
                matchInvitePanelConfig = null;
            }
            AwS58S0010000_15 awS58S0010000_15 = new AwS58S0010000_15(z3, 3);
            BattleSetting battleSetting4 = linkMicBattleMessage.battleSetting;
            if (battleSetting4 != null) {
                numValueOf = Integer.valueOf(battleSetting4.battleType);
            } else {
                numValueOf = null;
            }
            EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(numValueOf);
            LinkDialog linkDialog3 = new LinkDialog(matchBaseWidget);
            EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.TYPE_TEAM_MATCH_INVITEE;
            C979700bbM c979700bbM = new C979700bbM(matchBaseWidget, z4, text, matchInvitePanelConfig, awS58S0010000_15, j3, z3, enumC919170a1jLIZ);
            linkDialog3.LLILZIL = enumC977660bY42;
            linkDialog3.LLILZLL = c979700bbM;
            this.LIZIZ = linkDialog3;
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                LinkDialog linkDialog4 = this.LIZIZ;
                if (linkDialog4 != null) {
                    linkDialog4.show(fragmentManager, "TeamMatchInviteeCoordinator");
                }
                DataChannel dataChannel2 = this.LIZLLL;
                if (dataChannel2 != null) {
                    dataChannel2.FQ2(VWSettingsPageCloseChannel.class);
                }
            }
            C974540bT2 c974540bT22 = C974540bT2.LIZ;
            C974540bT2.LJLJL(linkMicBattleMessage, z2, C918130a03.LIZ(Integer.valueOf(linkMicBattleMessage.battleSetting.battleType)));
            C973260bQy.LIZ(this, C918130a03.LIZ(Integer.valueOf(linkMicBattleMessage.battleSetting.battleType)));
            C975250bUB c975250bUB8 = this.LJ;
            if (c975250bUB8 != null && (mutableLiveData = c975250bUB8.LJIJI) != null) {
                mutableLiveData.observe(matchBaseWidget, new AObserverS31S0500000_15(this, awS559S0100000_15, awS594S0100000_15, awS594S0100000_152, awS594S0100000_153, 1));
                return true;
            }
            return true;
        }
        return true;
    }
}
