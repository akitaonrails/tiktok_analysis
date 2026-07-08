package X;

import Y.AObserverS219S0100000_15;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.VWSettingsPageCloseChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostLynxInviteeObserverFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostLynxQuickMatchInviteePanelEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
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
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bVZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976110bVZ implements InterfaceC976410bW3 {
    public static C976110bVZ LJIILJJIL;
    public final MatchBaseWidget LIZ;
    public C976260bVo LIZIZ;
    public LinkDialog LIZJ;
    public final DataChannel LIZLLL;
    public final C976120bVa LJ;
    public boolean LJFF;
    public LinkMicBattleMessage LJI;
    public boolean LJII;
    public long LJIIIIZZ;
    public final boolean LJIIIZ;
    public Function0<Unit> LJIIJ;
    public Function1<? super Boolean, Unit> LJIIJJI;
    public Function1<? super EnumC976390bW1, Unit> LJIIL;
    public Function1<? super EnumC976390bW1, Unit> LJIILIIL;

    @Override // X.InterfaceC976410bW3
    public final void LIZIZ() {
        this.LJFF = true;
        C976120bVa c976120bVa = this.LJ;
        if (c976120bVa != null) {
            c976120bVa.LJI();
        }
        this.LIZJ = null;
        LJIILJJIL = null;
    }

    @Override // X.InterfaceC976410bW3
    public final boolean LJIJ(boolean z, LinkMicBattleMessage linkMicBattleMessage, AwS416S0200000_15 awS416S0200000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS594S0100000_15 awS594S0100000_153) {
        return false;
    }

    @Override // X.InterfaceC976410bW3
    public final void LJJIIJ(LinkMicBattleMessage linkMicBattleMessage, boolean z) {
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIIJJI() {
        C976120bVa c976120bVa = this.LJ;
        if (c976120bVa != null) {
            c976120bVa.LJIIL(EnumC976390bW1.HOSTS_LIST_CHANGED, this.LJIIIIZZ, this.LJII);
        }
    }

    public final void LJIILJJIL() {
        if (this.LJFF) {
            return;
        }
        C976120bVa c976120bVa = this.LJ;
        if (c976120bVa != null) {
            c976120bVa.LJIILJJIL.setValue(Boolean.FALSE);
            c976120bVa.LJIIIIZZ(c976120bVa.LJIIJJI(), true);
        }
        this.LJIIJ.invoke();
    }

    public C976110bVZ(MatchBaseWidget matchBaseWidget) {
        DataChannel dataChannelProvideDataChannel;
        this.LIZ = matchBaseWidget;
        if (matchBaseWidget != null) {
            dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LIZLLL = dataChannelProvideDataChannel;
        this.LJ = matchBaseWidget != null ? (C976120bVa) matchBaseWidget.y1(C976120bVa.class) : null;
        C20337914i1<Integer> c20337914i1 = InterfaceC980390bcT.Ha;
        boolean z = true;
        if (c20337914i1.LIZIZ().intValue() < 1) {
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        } else {
            z = false;
        }
        this.LJIIIZ = z;
        this.LJIIJ = AFwS203S0000000_15.get$arr$(335);
        this.LJIIJJI = AFwS250S0000000_15.get$arr$(189);
        this.LJIIL = AFwS250S0000000_15.get$arr$(191);
        this.LJIILIIL = AFwS250S0000000_15.get$arr$(190);
    }

    @Override // X.InterfaceC976410bW3
    public final void LIZ(boolean z) {
        MatchBaseWidget matchBaseWidget;
        View viewFindViewById;
        View view = null;
        C985030bjx c985030bjx = null;
        if (C915980Zwa.LJII().LJJIJ().size() >= 2 && (matchBaseWidget = this.LIZ) != null && matchBaseWidget.getView() != null) {
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
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRematchBtnState isEnable = ");
        sbLIZ.append(z);
        sbLIZ.append(", matchWidget?.view = ");
        MatchBaseWidget matchBaseWidget4 = this.LIZ;
        if (matchBaseWidget4 != null) {
            view = matchBaseWidget4.getView();
        }
        sbLIZ.append(view);
        C20441214yg.LIZIZ("TwoMatchInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(Throwable th) {
        if (this.LJFF) {
            return;
        }
        C976120bVa c976120bVa = this.LJ;
        boolean z = false;
        if (c976120bVa != null) {
            c976120bVa.LJIILJJIL.setValue(Boolean.FALSE);
            c976120bVa.LJIIIIZZ(c976120bVa.LJIIJJI(), false);
        }
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            if (!TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
            } else if (c501470JlZ.getErrorCode() == 4004048) {
                C766270U4b.LIZLLL(2131842762);
                z = true;
            }
        } else {
            C766270U4b.LIZLLL(2131852422);
        }
        this.LJIIJJI.invoke(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIIIZ(LinkMicBattleMessage linkMicBattleMessage) {
        C976120bVa c976120bVa = this.LJ;
        if (c976120bVa != null) {
            c976120bVa.LJIIIIZZ(linkMicBattleMessage.actionByUserId, true);
        }
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIILLIIL(String str) {
        Boolean boolValueOf;
        LinkDialog linkDialog = this.LIZJ;
        if (linkDialog != null) {
            boolValueOf = Boolean.valueOf(linkDialog.isVisible());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C974540bT2.LIZ.LJLJJLL(str, this.LJII);
        }
        LinkDialog linkDialog2 = this.LIZJ;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIL(LinkMicBattleMessage linkMicBattleMessage) {
        long j;
        MutableLiveData mutableLiveData;
        List list;
        Object next;
        LinkMicBattleMessage linkMicBattleMessage2 = this.LJI;
        if (linkMicBattleMessage2 != null) {
            j = linkMicBattleMessage2.actionByUserId;
        } else {
            j = linkMicBattleMessage.actionByUserId;
        }
        C976120bVa c976120bVa = this.LJ;
        C754570Tip c754570Tip = null;
        if (c976120bVa != null && (mutableLiveData = c976120bVa.LIZJ) != null && (list = (List) mutableLiveData.getValue()) != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C954460awe) next).LJ == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C954460awe c954460awe = (C954460awe) next;
            if (c954460awe != null) {
                c754570Tip = c954460awe.LJIJJ;
            }
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843057, C946260ajQ.LIZ(c754570Tip)));
        C974540bT2.LIZ.LJJJJLL(linkMicBattleMessage, Boolean.valueOf(this.LJII));
        if (linkMicBattleMessage.battleSetting.inviteType == 5) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyCohostStatusChangeOnReceiveCancelIM, inviteType = ");
            sbLIZ.append(linkMicBattleMessage.battleSetting.inviteType);
            sbLIZ.append(", actionByUserId = ");
            sbLIZ.append(linkMicBattleMessage.actionByUserId);
            C20441214yg.LIZIZ("TwoMatchInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            C784440Upu.LIZ().LIZIZ(new C955840ays(linkMicBattleMessage.battleSetting.inviteType, linkMicBattleMessage.actionByUserId));
        }
        C976260bVo c976260bVo = this.LIZIZ;
        if (c976260bVo != null) {
            AbstractC970950bNF.LJZ(c976260bVo, "match_invitee_dismiss_invitation_panel", false);
        }
    }

    public final Pair<List<C954460awe>, List<C954460awe>> LJJJI(LinkMicBattleMessage linkMicBattleMessage, boolean z, boolean z2, boolean z3, InterfaceC1631620sYq<? super List<C954460awe>, ? super List<C954460awe>, ? super EnumC919170a1j, Unit> interfaceC1631620sYq) {
        Long lValueOf;
        C976120bVa c976120bVa;
        C976120bVa c976120bVa2;
        C976120bVa c976120bVa3;
        Integer numValueOf;
        User owner;
        C976120bVa c976120bVa4;
        List<BattleUserInfoWrapper> list;
        List<BattleUserInfoWrapper> list2;
        C976120bVa c976120bVa5 = this.LJ;
        if (c976120bVa5 != null) {
            c976120bVa5.LIZ(this.LIZLLL);
        }
        C976120bVa c976120bVa6 = this.LJ;
        if (c976120bVa6 != null) {
            c976120bVa6.onCleared();
        }
        C976120bVa c976120bVa7 = this.LJ;
        if (c976120bVa7 != null) {
            c976120bVa7.LIZLLL(C915980Zwa.LJII().LLILZLL(true));
        }
        int i = 0;
        if (LiveDirectMatchSetting.INSTANCE.isEnabled() && (list = linkMicBattleMessage.anchorInfo) != null && (!list.isEmpty()) && (list2 = linkMicBattleMessage.anchorInfo) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<BattleUserInfoWrapper> it2 = list2.iterator();
            while (it2.hasNext()) {
                BattleUserInfo battleUserInfo = it2.next().userInfo;
                if (battleUserInfo != null) {
                    arrayList.add(battleUserInfo);
                }
            }
            C976120bVa c976120bVa8 = this.LJ;
            if (c976120bVa8 != null) {
                c976120bVa8.LIZJ(arrayList, linkMicBattleMessage.leagueInfoMap);
            }
        }
        Map<Long, GiftGalleryBadgeInfo> map = linkMicBattleMessage.leagueInfoMap;
        if (map != null && (c976120bVa4 = this.LJ) != null) {
            c976120bVa4.LJ(map);
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZLLL);
        Integer numValueOf2 = null;
        if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        } else {
            lValueOf = null;
        }
        Pair pairLIZ = C949610aop.LIZ(linkMicBattleMessage, lValueOf);
        List<C954460awe> list3 = (List) pairLIZ.getFirst();
        List<C954460awe> list4 = (List) pairLIZ.getSecond();
        C976120bVa c976120bVa9 = this.LJ;
        if (c976120bVa9 != null) {
            c976120bVa9.LJIIIZ(list3, list4);
        }
        C976120bVa c976120bVa10 = this.LJ;
        if (c976120bVa10 != null) {
            c976120bVa10.LJIIIIZZ(linkMicBattleMessage.actionByUserId, true);
        }
        if (z && (c976120bVa3 = this.LJ) != null) {
            long j = this.LJIIIIZZ;
            BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
            if (battleSetting != null) {
                numValueOf = Integer.valueOf((int) battleSetting.sourceType);
            } else {
                numValueOf = null;
            }
            c976120bVa3.LJIIJ(1, j, numValueOf, z2);
        }
        BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
        if (battleSetting2 != null && battleSetting2.scene == 2 && LiveDirectMatchSetting.INSTANCE.isEnabled() && (c976120bVa2 = this.LJ) != null) {
            BattleSetting battleSetting3 = linkMicBattleMessage.battleSetting;
            if (battleSetting3 != null) {
                numValueOf2 = Integer.valueOf((int) battleSetting3.sourceType);
            }
            BattleSetting battleSetting4 = linkMicBattleMessage.battleSetting;
            if (battleSetting4 != null) {
                i = battleSetting4.inviteType;
            }
            c976120bVa2.LJIJJ = numValueOf2;
            c976120bVa2.LJIJJLI = Integer.valueOf(i);
        }
        if (z3 && (c976120bVa = this.LJ) != null) {
            c976120bVa.LJIIL(EnumC976390bW1.DECLINE_BUTTON, this.LJIIIIZZ, z2);
        }
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(list3, list4, EnumC919170a1j.MATCH_TYPE_1V1);
        }
        return new Pair<>(list3, list4);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r28, boolean r29, boolean r30, boolean r31, X.InterfaceC1631620sYq r32) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C976110bVZ.LJJJIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage, boolean, boolean, boolean, X.0sYq):void");
    }

    @Override // X.InterfaceC976410bW3
    public final boolean LJJIII(EnumC975850bV9 enumC975850bV9, LinkMicBattleMessage linkMicBattleMessage, boolean z, boolean z2, boolean z3, AwS664S0100000_15 awS664S0100000_15, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS594S0100000_15 awS594S0100000_153) {
        Context applicationContext;
        boolean z4;
        boolean z5;
        Long lValueOf;
        Pair<List<C954460awe>, List<C954460awe>> pairLIZ;
        User owner;
        C976120bVa c976120bVa;
        MutableLiveData mutableLiveData;
        BattleSetting battleSetting;
        GiftGalleryBadgeInfo giftGalleryBadgeInfo;
        Integer numValueOf;
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget == null || (applicationContext = matchBaseWidget.context) == null) {
            applicationContext = GlobalContext.getApplicationContext();
        }
        if (z && z2) {
            C976120bVa c976120bVa2 = this.LJ;
            if (c976120bVa2 != null) {
                long j = linkMicBattleMessage.battleId;
                BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
                if (battleSetting2 != null) {
                    numValueOf = Integer.valueOf((int) battleSetting2.sourceType);
                } else {
                    numValueOf = null;
                }
                c976120bVa2.LJIIJ(1, j, numValueOf, z3);
            }
            C20441214yg.LIZIZ("TwoMatchInviteeCoordinator", "presentMatchInviteeView auto accept.");
            return true;
        }
        this.LJIIJ = awS559S0100000_15;
        this.LJIIJJI = awS594S0100000_15;
        this.LJIIL = awS594S0100000_152;
        this.LJIILIIL = awS594S0100000_153;
        this.LJI = linkMicBattleMessage;
        this.LJII = z3;
        this.LJIIIIZZ = linkMicBattleMessage.battleId;
        if (enumC975850bV9 == EnumC975850bV9.INVITE_MESSAGE && linkMicBattleMessage.battleSetting.inviteType == 5) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyCohostStatusChangeOnReceiveInviteIM, inviteType = ");
            sbLIZ.append(linkMicBattleMessage.battleSetting.inviteType);
            sbLIZ.append(", actionByUserId = ");
            sbLIZ.append(linkMicBattleMessage.actionByUserId);
            C20441214yg.LIZIZ("TwoMatchInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            Map<Long, GiftGalleryBadgeInfo> map = linkMicBattleMessage.leagueInfoMap;
            if (map != null) {
                giftGalleryBadgeInfo = map.get(Long.valueOf(linkMicBattleMessage.actionByUserId));
            } else {
                giftGalleryBadgeInfo = null;
            }
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            BattleSetting battleSetting3 = linkMicBattleMessage.battleSetting;
            c784440UpuLIZ.LIZIZ(new C955750ayj(battleSetting3.inviteType, linkMicBattleMessage.actionByUserId, new C957560b1e((int) battleSetting3.sourceType, 2), giftGalleryBadgeInfo));
        }
        if (LiveCoHostLynxQuickMatchInviteePanelEnableSetting.INSTANCE.isEnable() && (battleSetting = linkMicBattleMessage.battleSetting) != null && battleSetting.scene == 2 && LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            z4 = true;
        } else {
            z4 = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("presentMatchInviteeView enableLynxPage:");
        sbLIZ2.append(z4);
        C20441214yg.LIZIZ("TwoMatchInviteeCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
        if (z4 && applicationContext != null) {
            InterfaceC949480aoc viewerWishesService = GiftService.LLILLJJLI.getViewerWishesService();
            if (viewerWishesService != null && viewerWishesService.LIZIZ(this.LIZLLL)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z) {
                pairLIZ = LJJJI(linkMicBattleMessage, z2, z3, z5, awS664S0100000_15);
            } else {
                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZLLL);
                if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                    lValueOf = Long.valueOf(owner.getId());
                } else {
                    lValueOf = null;
                }
                pairLIZ = C949610aop.LIZ(linkMicBattleMessage, lValueOf);
            }
            List<C954460awe> first = pairLIZ.getFirst();
            List<C954460awe> second = pairLIZ.getSecond();
            if (LiveCoHostLynxInviteeObserverFixSetting.INSTANCE.isEnabled() && (c976120bVa = this.LJ) != null && (mutableLiveData = c976120bVa.LJIJI) != null) {
                mutableLiveData.observeForever(new AObserverS219S0100000_15(this, 64));
            }
            if (z5) {
                C20441214yg.LIZIZ("TwoMatchInviteeCoordinator", "presentMatchInviteeView shouldAutoDecline");
                C976120bVa c976120bVa3 = this.LJ;
                if (c976120bVa3 != null) {
                    c976120bVa3.LJIIL(EnumC976390bW1.DECLINE_BUTTON, linkMicBattleMessage.battleId, z3);
                    return true;
                }
                return true;
            }
            JSONObject jSONObject = new JSONObject(C1516000pYM.LIZJ(linkMicBattleMessage));
            C976260bVo c976260bVo = new C976260bVo(linkMicBattleMessage, first, second, awS664S0100000_15, awS559S0100000_15, awS594S0100000_15, awS594S0100000_152, awS594S0100000_153, new C976470bW9(this, enumC975850bV9, linkMicBattleMessage, z, z2, z3, awS664S0100000_15, awS559S0100000_15, awS594S0100000_15, awS594S0100000_152, awS594S0100000_153));
            c976260bVo.LLILLJJLI.put("battle_message", jSONObject);
            c976260bVo.LLILLJJLI.put("is_rank_leagueCampaign", Boolean.valueOf(C915980Zwa.LJFF().k31()));
            c976260bVo.LLILLJJLI.put("inviteType", Integer.valueOf(z3 ? 1 : 0));
            c976260bVo.LLILLJJLI.put("start_load_ms", Long.valueOf(System.currentTimeMillis()));
            this.LIZIZ = c976260bVo;
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                dataChannel.FQ2(VWSettingsPageCloseChannel.class);
            }
            return C970940bNE.LIZJ(applicationContext, c976260bVo);
        }
        LJJJIL(linkMicBattleMessage, z, z2, z3, awS664S0100000_15);
        return true;
    }
}
