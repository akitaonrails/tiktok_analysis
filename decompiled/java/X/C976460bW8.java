package X;

import Y.AfS184S0100000_15;
import Y.AfS67S0201000_15;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.VWSettingsPageCloseChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchInvitePanelConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchThemeDisplayResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS58S0010000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0bW8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976460bW8 implements InterfaceC976410bW3, InterfaceC976930bWt {
    public static C976460bW8 LJIILIIL;
    public final MatchBaseWidget LIZ;
    public LinkDialog LIZIZ;
    public final DataChannel LIZJ;
    public final C976940bWu LIZLLL;
    public boolean LJ;
    public LinkMicBattleMessage LJFF;
    public boolean LJI;
    public long LJII;
    public final boolean LJIIIIZZ;
    public Function0<Unit> LJIIIZ;
    public Function1<? super Boolean, Unit> LJIIJ;
    public Function1<? super EnumC976390bW1, Unit> LJIIJJI;
    public Function1<? super EnumC976390bW1, Unit> LJIIL;

    @Override // X.InterfaceC976410bW3
    public final void LIZIZ() {
        this.LJ = true;
        if (this.LIZLLL != null) {
            C11JF c11jf = AbstractC742600TBa.LJIIIIZZ;
            if (c11jf != null) {
                C500260Jjc.LJJLIIIJLJLI(c11jf);
            }
            AbstractC742600TBa.LJIIIIZZ = null;
        }
        this.LIZIZ = null;
        LJIILIIL = null;
    }

    @Override // X.InterfaceC976410bW3
    public final boolean LJIJ(boolean z, LinkMicBattleMessage linkMicBattleMessage, AwS416S0200000_15 awS416S0200000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS594S0100000_15 awS594S0100000_153) {
        return false;
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIIJJI() {
        C976940bWu c976940bWu = this.LIZLLL;
        if (c976940bWu != null) {
            c976940bWu.LIZJ(EnumC976390bW1.HOSTS_LIST_CHANGED);
        }
    }

    public C976460bW8(MatchBaseWidget matchBaseWidget) {
        DataChannel dataChannelProvideDataChannel;
        this.LIZ = matchBaseWidget;
        if (matchBaseWidget != null) {
            dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LIZJ = dataChannelProvideDataChannel;
        this.LIZLLL = matchBaseWidget != null ? (C976940bWu) matchBaseWidget.y1(C976940bWu.class) : null;
        C20337914i1<Integer> c20337914i1 = InterfaceC980390bcT.Ha;
        boolean z = true;
        if (c20337914i1.LIZIZ().intValue() < 1) {
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        } else {
            z = false;
        }
        this.LJIIIIZZ = z;
        this.LJIIIZ = AFwS203S0000000_15.get$arr$(442);
        this.LJIIJ = AFwS250S0000000_15.get$arr$(242);
        this.LJIIJJI = AFwS250S0000000_15.get$arr$(244);
        this.LJIIL = AFwS250S0000000_15.get$arr$(243);
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

    @Override // X.InterfaceC976930bWt
    public final void LIZJ(int i) {
        long channelId = C915980Zwa.LJII().getChannelId();
        if (channelId == 0) {
            C20441214yg.LJ("IndividualMatchInviteeCoordinator", "Accept api error channel id is empty");
            boolean z = this.LJI;
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LJJIJLIJ(EnumC975260bUC.CHANNEL_ID_INVALID, z ? 1 : 0, this.LJII, i, EnumC919170a1j.MATCH_TYPE_INDIVIDUAL);
            return;
        }
        C974540bT2.LIZ.LJLLL(i, this.LJII, this.LJI);
        long value = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        long value2 = value + LiveTimeIncrementForBattleSetting.INSTANCE.getValue();
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).acceptInvitePb(this.LJII, channelId, value, value2, i, 0).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS184S0100000_15(this, 186), new AfS184S0100000_15(this, 187));
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIIIZ(LinkMicBattleMessage linkMicBattleMessage) {
        C976940bWu c976940bWu = this.LIZLLL;
        if (c976940bWu != null) {
            c976940bWu.LIZIZ(linkMicBattleMessage.actionByUserId, true);
        }
    }

    @Override // X.InterfaceC976930bWt
    public final void LJIILJJIL(EnumC976390bW1 enumC976390bW1) {
        boolean z;
        long channelId = C915980Zwa.LJII().getChannelId();
        boolean z2 = this.LJI;
        if (channelId == 0) {
            C20441214yg.LJ("IndividualMatchInviteeCoordinator", "Reject api error channel id is empty");
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            EnumC975270bUD enumC975270bUD = EnumC975270bUD.CHANNEL_ID_INVALID;
            long j = this.LJII;
            EnumC976390bW1.Companion.getClass();
            C974540bT2.LJLL(enumC975270bUD, z2 ? 1 : 0, j, C976430bW5.LIZ(enumC976390bW1), EnumC919170a1j.MATCH_TYPE_INDIVIDUAL);
            return;
        }
        C974540bT2 c974540bT22 = C974540bT2.LIZ;
        long j2 = this.LJII;
        EnumC976390bW1.Companion.getClass();
        String strLIZ = C976430bW5.LIZ(enumC976390bW1);
        int i = 1;
        if (enumC976390bW1 == EnumC976390bW1.HOSTS_LIST_CHANGED) {
            z = true;
        } else {
            z = false;
        }
        C974540bT2.LJLJLLL(z2 ? 1 : 0, j2, strLIZ, z);
        C480460Ism.LIZ().getClass();
        MultiMatchApi multiMatchApi = (MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class);
        long j3 = this.LJII;
        int i2 = C976580bWK.LIZ[enumC976390bW1.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new C1954807lC();
                }
                i = 0;
            }
        } else {
            i = 0;
        }
        ((C0J1N) multiMatchApi.reject(channelId, j3, z2 ? 1 : 0, i, 0, 0L, null).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS67S0201000_15(z2 ? 1 : 0, this, enumC976390bW1, 5), new AfS67S0201000_15(z2 ? 1 : 0, this, enumC976390bW1, 6));
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIILLIIL(String str) {
        Boolean boolValueOf;
        LinkDialog linkDialog = this.LIZIZ;
        if (linkDialog != null) {
            boolValueOf = Boolean.valueOf(linkDialog.isVisible());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C974540bT2.LIZ.LJLJJLL(str, this.LJI);
        }
        LinkDialog linkDialog2 = this.LIZIZ;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
    }

    @Override // X.InterfaceC976410bW3
    public final void LJIL(LinkMicBattleMessage linkMicBattleMessage) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843057, LJJJI(linkMicBattleMessage.actionByUserId)));
        C974540bT2.LIZ.LJJJJLL(linkMicBattleMessage, Boolean.valueOf(this.LJI));
    }

    public final String LJJJI(long j) {
        MutableLiveData mutableLiveData;
        List list;
        Object next;
        C976940bWu c976940bWu = this.LIZLLL;
        C754570Tip c754570Tip = null;
        if (c976940bWu != null && (mutableLiveData = c976940bWu.LIZLLL) != null && (list = (List) mutableLiveData.getValue()) != null) {
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
        return C946260ajQ.LIZ(c754570Tip);
    }

    @Override // X.InterfaceC976410bW3
    public final void LJJIIJ(LinkMicBattleMessage linkMicBattleMessage, boolean z) {
        C766270U4b.LJIIJJI(u.LJJIFFI(C497740JfY.LJIJI(2131853304), "{username}", LJJJI(linkMicBattleMessage.actionByUserId), false));
        C974540bT2.LIZ.LJLJLJ(linkMicBattleMessage, Boolean.valueOf(this.LJI));
        if (!z) {
            C976450bW7.LIZ(this, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC976410bW3
    public final boolean LJJIII(EnumC975850bV9 enumC975850bV9, LinkMicBattleMessage linkMicBattleMessage, boolean z, boolean z2, boolean z3, AwS664S0100000_15 awS664S0100000_15, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS594S0100000_15 awS594S0100000_153) {
        ArrayList arrayList;
        Text text;
        MatchInvitePanelConfig matchInvitePanelConfig;
        Integer numValueOf;
        Long lValueOf;
        List<TeamUsersInfo> list;
        long j;
        Map<Long, GiftGalleryBadgeInfo> map;
        String str;
        BattleSetting battleSetting;
        BattleSetting battleSetting2;
        FragmentManager fragmentManager;
        C976940bWu c976940bWu;
        EnumC977660bY4 enumC977660bY4;
        LinkDialog linkDialog = this.LIZIZ;
        Integer numValueOf2 = null;
        if (linkDialog != null && linkDialog.isVisible()) {
            LinkDialog linkDialog2 = this.LIZIZ;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TYPE_INDIVIDUAL_MATCH_INVITEE) {
                return true;
            }
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        this.LJIIIZ = awS559S0100000_15;
        this.LJIIJ = awS594S0100000_15;
        this.LJIIJJI = awS594S0100000_152;
        this.LJIIL = awS594S0100000_153;
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        List<TeamUsersInfo> list2 = linkMicBattleMessage.teamUsers;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIJJ, 10));
        Iterator<C954460awe> it2 = listLJIJJ.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(it2.next().LJ));
        }
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<TeamUsersInfo> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(Long.valueOf(it3.next().teamId));
            }
        } else {
            arrayList = null;
        }
        if (!C976880bWo.LIZ(arrayList2, arrayList)) {
            LJIILJJIL(EnumC976390bW1.HOSTS_LIST_CHANGED);
            C766270U4b.LIZLLL(2131853338);
            return false;
        }
        C976940bWu c976940bWu2 = this.LIZLLL;
        if (c976940bWu2 != null) {
            c976940bWu2.LIZ = this.LIZJ;
            c976940bWu2.LIZIZ = this;
        }
        this.LJFF = linkMicBattleMessage;
        this.LJI = z3;
        this.LJII = linkMicBattleMessage.battleId;
        if (z) {
            if (c976940bWu2 != null) {
                c976940bWu2.onCleared();
            }
            C976940bWu c976940bWu3 = this.LIZLLL;
            if (c976940bWu3 != null) {
                c976940bWu3.LIZJ.setValue(listLJIJJ);
            }
            C976940bWu c976940bWu4 = this.LIZLLL;
            if (c976940bWu4 != null) {
                c976940bWu4.LIZIZ(linkMicBattleMessage.actionByUserId, true);
            }
            if (z2 && (c976940bWu = this.LIZLLL) != null) {
                c976940bWu.LJIIJ.setValue(Boolean.TRUE);
                InterfaceC976930bWt interfaceC976930bWt = (InterfaceC976930bWt) c976940bWu.LIZIZ;
                if (interfaceC976930bWt != null) {
                    interfaceC976930bWt.LIZJ(1);
                }
            }
            int iLIZ = C978480bZO.LIZ(false);
            C976940bWu c976940bWu5 = this.LIZLLL;
            if (c976940bWu5 != null) {
                c976940bWu5.LIZ(this.LIZJ, iLIZ, new AwS559S0100000_15(this, 1073));
            }
        }
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget != null) {
            boolean z4 = this.LJIIIIZZ;
            GiftModeMeta giftModeMeta = linkMicBattleMessage.battleSetting.giftModeMeta;
            if (giftModeMeta != null) {
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
            AwS58S0010000_15 awS58S0010000_15 = new AwS58S0010000_15(z3, 2);
            LinkDialog linkDialog3 = new LinkDialog(matchBaseWidget);
            EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.TYPE_INDIVIDUAL_MATCH_INVITEE;
            C979760bbS c979760bbS = new C979760bbS(matchBaseWidget, z3, z4, text, matchInvitePanelConfig, awS58S0010000_15);
            linkDialog3.LLILZIL = enumC977660bY42;
            linkDialog3.LLILZLL = c979760bbS;
            this.LIZIZ = linkDialog3;
            DataChannel dataChannel = this.LIZJ;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                LinkDialog linkDialog4 = this.LIZIZ;
                if (linkDialog4 != null) {
                    linkDialog4.show(fragmentManager, "IndividualMatchInviteeCoordinator");
                }
                DataChannel dataChannel2 = this.LIZJ;
                if (dataChannel2 != null) {
                    dataChannel2.FQ2(VWSettingsPageCloseChannel.class);
                }
            }
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LJLJL(linkMicBattleMessage, z2, EnumC919170a1j.MATCH_TYPE_INDIVIDUAL);
            LinkMicBattleMessage linkMicBattleMessage2 = this.LJFF;
            if (linkMicBattleMessage2 != null && (battleSetting2 = linkMicBattleMessage2.battleSetting) != null) {
                numValueOf = Integer.valueOf(battleSetting2.inviteType);
            } else {
                numValueOf = null;
            }
            boolean zLIZ = C959180b4G.LIZ(numValueOf);
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            C973660bRc c973660bRc = C973660bRc.LIZ;
            LinkMicBattleMessage linkMicBattleMessage3 = this.LJFF;
            if (linkMicBattleMessage3 != null) {
                lValueOf = Long.valueOf(linkMicBattleMessage3.actionByUserId);
            } else {
                lValueOf = null;
            }
            LinkMicBattleMessage linkMicBattleMessage4 = this.LJFF;
            if (linkMicBattleMessage4 != null) {
                list = linkMicBattleMessage4.teamUsers;
                j = linkMicBattleMessage4.battleId;
            } else {
                list = null;
                j = 0;
            }
            if (linkMicBattleMessage4 != null) {
                map = linkMicBattleMessage4.leagueInfoMap;
            } else {
                map = null;
            }
            if (size == 3) {
                str = "1v1v1";
            } else {
                str = "1v1v1v1";
            }
            if (linkMicBattleMessage4 != null && (battleSetting = linkMicBattleMessage4.battleSetting) != null) {
                numValueOf2 = Integer.valueOf(battleSetting.inviteType);
            }
            C973660bRc.LJJJJZI(lValueOf, true, list, j, map, zLIZ, str, numValueOf2, null, 576);
        }
        return true;
    }
}
