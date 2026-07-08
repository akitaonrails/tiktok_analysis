package X;

import Y.ARunnableS84S0200000_15;
import Y.AfS1S0101100_15;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.IMatchViolationEventHelper;
import com.bytedance.android.live.liveinteract.api.MatchPlaybookCapabilityShowEvent;
import com.bytedance.android.live.liveinteract.api.PlayerCalculateFinishMessage;
import com.bytedance.android.live.liveinteract.api.QuickStartRequestEvent;
import com.bytedance.android.live.liveinteract.linkroom.LiveMatchReapplyPlaybookAfterMatchEndWithoutRematchSetting;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.ActivePlaybookChannel;
import com.bytedance.android.live.liveinteract.multihost.core.model.NewLayoutWindowStateChangeMessage;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchGameRouterConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviterPanelLynxConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLynxConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchStreakOverlapSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVictoryLapFunnyEffectApplySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMockRematchRecommendBattle;
import com.bytedance.android.livesdk.model.message.BattleAICommentaryMessage;
import com.bytedance.android.livesdk.model.message.BattleGameplayMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.CohostContentGuideInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishEffectInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.linkmic.common.CohostTypeLayoutExtra;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0bUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975500bUa implements InterfaceC975700bUu, InterfaceC975770bV1 {
    public static final /* synthetic */ int LJIIJ = 0;
    public final MatchBaseWidget LIZ;
    public C976100bVY LIZIZ;
    public final boolean LIZJ;
    public final C974690bTH LIZLLL;
    public InterfaceC975520bUc LJ;
    public C975680bUs LJFF;
    public C975550bUf LJI;
    public DataChannel LJII;
    public C974050bSF LJIIIIZZ;
    public final BPEAHandler LJIIIZ;

    @Override // X.InterfaceC975700bUu
    public final void LIZJ() {
        C975680bUs c975680bUs = this.LJFF;
        if (c975680bUs != null) {
            c975680bUs.LJ = true;
        }
    }

    @Override // X.InterfaceC975700bUu
    public final void LJ() {
        C974050bSF c974050bSF = this.LJIIIIZZ;
        if (c974050bSF != null) {
            Long l = C973890bRz.LJIILJJIL;
            if (l != null) {
                C973890bRz.LIZ.LJIIL = l.longValue();
                C973890bRz.LJIILJJIL = null;
            }
            C973890bRz.LJIIIIZZ(2, "backOldArch");
            c974050bSF.LIZ.S1("match_mode_select_panel", null);
        }
    }

    public final void LJIIIZ() {
        C20441214yg.LIZIZ("LiveMatchManager", "destroyComponentManager");
        C975550bUf c975550bUf = this.LJI;
        if (c975550bUf != null) {
            c975550bUf.LIZIZ();
        }
        this.LJI = null;
        C20441214yg.LIZIZ("LiveMatchManager", "InteractiveModeComponentManager destroyed");
    }

    public final InterfaceC975520bUc LJIIJJI() {
        C975680bUs c975680bUs = this.LJFF;
        return c975680bUs == null ? this.LJ : c975680bUs;
    }

    public final void LJIILIIL() {
        C975550bUf c975550bUf = this.LJI;
        if (c975550bUf != null && ((ArrayList) c975550bUf.LIZIZ).size() <= 0) {
            ArrayList arrayList = new ArrayList();
            if (this.LIZJ) {
                LiveMatchLynxConfigSetting liveMatchLynxConfigSetting = LiveMatchLynxConfigSetting.INSTANCE;
                if (liveMatchLynxConfigSetting.loadLynxContainer()) {
                    C976750bWb c976750bWb = new C976750bWb();
                    c976750bWb.LLILLJJLI = EnumC976730bWZ.P0;
                    arrayList.add(c976750bWb);
                }
                if (!liveMatchLynxConfigSetting.loadLynxContainer() || !liveMatchLynxConfigSetting.startAnimationEnable()) {
                    C977360bXa c977360bXa = new C977360bXa(new C978020bYe());
                    c977360bXa.LLILLJJLI = EnumC976730bWZ.P0;
                    arrayList.add(c977360bXa);
                }
            }
            if (this.LIZJ) {
                C977370bXb c977370bXb = new C977370bXb(new C15DG());
                c977370bXb.LLILLJJLI = EnumC976730bWZ.P0;
                arrayList.add(c977370bXb);
            }
            C977350bXZ c977350bXZ = new C977350bXZ(new C985780blA(this.LIZ));
            EnumC976730bWZ enumC976730bWZ = EnumC976730bWZ.P0;
            c977350bXZ.LLILLJJLI = enumC976730bWZ;
            arrayList.add(c977350bXZ);
            C977350bXZ c977350bXZ2 = new C977350bXZ(new C980900bdI(this.LIZ));
            c977350bXZ2.LLILLJJLI = enumC976730bWZ;
            arrayList.add(c977350bXZ2);
            C978280bZ4 c978280bZ4 = new C978280bZ4();
            c978280bZ4.LLILZ = enumC976730bWZ;
            arrayList.add(c978280bZ4);
            C963600bBO c963600bBO = new C963600bBO();
            c963600bBO.LLIZ = enumC976730bWZ;
            arrayList.add(c963600bBO);
            if (!arrayList.isEmpty()) {
                C975550bUf c975550bUf2 = this.LJI;
                if (c975550bUf2 != null) {
                    c975550bUf2.LIZ(arrayList);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initP0MatchComponents: Added ");
                sbLIZ.append(arrayList.size());
                sbLIZ.append(" P0 components");
                C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void LJIILJJIL() {
        if (this.LJI == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!this.LIZJ) {
            LiveMatchLynxConfigSetting liveMatchLynxConfigSetting = LiveMatchLynxConfigSetting.INSTANCE;
            if (liveMatchLynxConfigSetting.loadLynxContainer()) {
                C976750bWb c976750bWb = new C976750bWb();
                c976750bWb.LLILLJJLI = EnumC976730bWZ.P1;
                arrayList.add(c976750bWb);
            }
            if (!liveMatchLynxConfigSetting.loadLynxContainer() || !liveMatchLynxConfigSetting.startAnimationEnable()) {
                C977360bXa c977360bXa = new C977360bXa(new C978020bYe());
                c977360bXa.LLILLJJLI = EnumC976730bWZ.P1;
                arrayList.add(c977360bXa);
            }
        }
        C977360bXa c977360bXa2 = new C977360bXa(new C15FS(this.LIZ));
        EnumC976730bWZ enumC976730bWZ = EnumC976730bWZ.P1;
        c977360bXa2.LLILLJJLI = enumC976730bWZ;
        arrayList.add(c977360bXa2);
        if (!this.LIZJ) {
            C977370bXb c977370bXb = new C977370bXb(new C15DG());
            c977370bXb.LLILLJJLI = enumC976730bWZ;
            arrayList.add(c977370bXb);
        }
        C975570bUh c975570bUh = new C975570bUh();
        c975570bUh.LLJ = new C975540bUe(this);
        C977370bXb c977370bXb2 = new C977370bXb(c975570bUh);
        c977370bXb2.LLILLJJLI = enumC976730bWZ;
        arrayList.add(c977370bXb2);
        C20489815Fo c20489815Fo = new C20489815Fo();
        C977370bXb c977370bXb3 = new C977370bXb(new C15DW(new AwS559S0100000_15(c20489815Fo, 48)));
        c977370bXb3.LLILLJJLI = enumC976730bWZ;
        arrayList.add(c977370bXb3);
        C977350bXZ c977350bXZ = new C977350bXZ(new C158N(this.LJII));
        c977350bXZ.LLILLJJLI = enumC976730bWZ;
        arrayList.add(c977350bXZ);
        C977350bXZ c977350bXZ2 = new C977350bXZ(new C973280bR0());
        c977350bXZ2.LLILLJJLI = enumC976730bWZ;
        arrayList.add(c977350bXZ2);
        C977350bXZ c977350bXZ3 = new C977350bXZ(new AbstractC977390bXd() { // from class: X.0bR1
            public MatchBaseWidget LLILZ;

            @Override // X.AbstractC977390bXd, X.InterfaceC977420bXg
            public final void LIZJ(AbstractC986700bme abstractC986700bme) {
            }

            @Override // X.InterfaceC977430bXh
            public final void dismiss() {
                ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
                View viewFindViewById;
                for (C954460awe c954460awe : C915980Zwa.LJII().LJJLI()) {
                    MatchBaseWidget matchBaseWidget = this.LLILZ;
                    if (matchBaseWidget != null && (viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(c954460awe.LJ)) != null && (viewFindViewById = viewOnClickListenerC986770bmlX1.findViewById(R.id.me1)) != null) {
                        int visibility = viewFindViewById.getVisibility();
                        viewFindViewById.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, viewFindViewById);
                    }
                }
            }

            @Override // X.AbstractC977390bXd, X.InterfaceC977430bXh
            public final void onUnload() {
                super.onUnload();
                dismiss();
                this.LLILZ = null;
            }

            @Override // X.AbstractC977390bXd, X.InterfaceC977430bXh
            public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
                super.LIZLLL(matchBaseWidget);
                this.LLILZ = matchBaseWidget;
                matchBaseWidget.provideDataChannel();
            }

            @Override // X.AbstractC977390bXd
            public final void LJI(C975960bVK c975960bVK) {
                ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
                Map<Long, BattleComboInfo> map;
                Map<Long, BattleComboInfo> map2;
                BattleComboInfo battleComboInfo;
                boolean zCo0;
                GiftGalleryBadgeSection giftGalleryBadgeSection;
                LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText;
                List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
                C20441214yg.LIZIZ("MatchLeagueBadgeComponent", "start MatchLeagueBadgeComponent ");
                listLJJLI.size();
                boolean zLIZ = C973270bQz.LIZ();
                for (C954460awe c954460awe : C915980Zwa.LJII().LJIJJ()) {
                    MatchBaseWidget matchBaseWidget = this.LLILZ;
                    if (matchBaseWidget != null && (viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(c954460awe.LJ)) != null) {
                        String str = null;
                        if (c975960bVK != null) {
                            map = c975960bVK.LJJIJIIJI;
                        } else {
                            map = null;
                        }
                        if (map != null && !map.isEmpty()) {
                            if (c975960bVK != null && (map2 = c975960bVK.LJJIJIIJI) != null && (battleComboInfo = map2.get(Long.valueOf(c954460awe.LJ))) != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("show Badge, uid = ");
                                sbLIZ.append(c954460awe.LJ);
                                sbLIZ.append(", combo = ");
                                sbLIZ.append(battleComboInfo.comboCount);
                                sbLIZ.append(", league = ");
                                GiftGalleryBadgeInfo giftGalleryBadgeInfo = c954460awe.LJJIII;
                                if (giftGalleryBadgeInfo != null && (giftGalleryBadgeSection = giftGalleryBadgeInfo.leagueInfo) != null && (linkMicGiftGalleryDisplayText = giftGalleryBadgeSection.displayText) != null) {
                                    str = linkMicGiftGalleryDisplayText.content;
                                }
                                sbLIZ.append(str);
                                C20441214yg.LIZIZ("MatchLeagueBadgeComponent", C2188811AlT.LIZIZ(sbLIZ));
                                if (LiveMatchStreakOverlapSetting.INSTANCE.getValue()) {
                                    zCo0 = C915980Zwa.LJFF().Nt();
                                } else {
                                    zCo0 = C915980Zwa.LJFF().co0();
                                }
                                if (zCo0 && zLIZ) {
                                    viewOnClickListenerC986770bmlX1.V1(battleComboInfo, c954460awe.LJJIII, C915980Zwa.LJII().LLILZ(c954460awe.LJ), false);
                                }
                            }
                        } else if (C915980Zwa.LJFF().co0() && zLIZ) {
                            viewOnClickListenerC986770bmlX1.V1(null, c954460awe.LJJIII, C915980Zwa.LJII().LLILZ(c954460awe.LJ), true);
                        }
                    }
                }
            }
        });
        c977350bXZ3.LLILLJJLI = enumC976730bWZ;
        arrayList.add(c977350bXZ3);
        C977350bXZ c977350bXZ4 = new C977350bXZ(new C977470bXl(new AwS559S0100000_15(this, 47)));
        c977350bXZ4.LLILLJJLI = enumC976730bWZ;
        arrayList.add(c977350bXZ4);
        C977350bXZ c977350bXZ5 = new C977350bXZ(new C975530bUd());
        c977350bXZ5.LLILLJJLI = enumC976730bWZ;
        arrayList.add(c977350bXZ5);
        C977350bXZ c977350bXZ6 = new C977350bXZ(c20489815Fo);
        c977350bXZ6.LLILLJJLI = enumC976730bWZ;
        arrayList.add(c977350bXZ6);
        C977380bXc c977380bXc = new C977380bXc();
        c977380bXc.LL = enumC976730bWZ;
        arrayList.add(c977380bXc);
        C985890blL c985890blL = new C985890blL();
        c985890blL.LLILZ = enumC976730bWZ;
        arrayList.add(c985890blL);
        if (!this.LIZJ) {
            C978310bZ7 c978310bZ7 = new C978310bZ7(this.LIZ, this.LJII);
            c978310bZ7.LLILLL = enumC976730bWZ;
            arrayList.add(c978310bZ7);
            C970890bN9 c970890bN9 = new C970890bN9();
            c970890bN9.LLIZLLLIL = enumC976730bWZ;
            arrayList.add(c970890bN9);
        }
        if (!arrayList.isEmpty()) {
            C975550bUf c975550bUf = this.LJI;
            if (c975550bUf != null) {
                if (c975550bUf.LJFF) {
                    C20441214yg.LIZIZ("InteractiveModeComponentManager", "addP1Components, already initialized, skip");
                } else {
                    c975550bUf.LJFF = true;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("addP1Components, count=");
                    sbLIZ.append(arrayList.size());
                    C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((ArrayList) c975550bUf.LIZJ).add(it2.next());
                    }
                    EnumC919170a1j enumC919170a1j = c975550bUf.LJI;
                    if (enumC919170a1j != null) {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC975560bUg) it3.next()).LJI(enumC919170a1j);
                        }
                    }
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initP1MatchComponents: Added ");
            sbLIZ2.append(arrayList.size());
            sbLIZ2.append(" P1 components");
            C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final boolean LJIILL() {
        MatchBaseWidget matchBaseWidget = this.LIZ;
        return (matchBaseWidget.context == null || matchBaseWidget.getView() == null) ? false : true;
    }

    public final void LJIIZILJ() {
        IMessageManager iMessageManager;
        InterfaceC954180awC interfaceC954180awCLJIIIZ;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        C20441214yg.LJ("LiveMatchManager", "LiveMatchManager destroy");
        C2074908Ax.LIZ.set(new C1999007sK(0));
        InterfaceC975520bUc interfaceC975520bUc = this.LJ;
        C975960bVK c975960bVKM3 = interfaceC975520bUc != null ? interfaceC975520bUc.m3() : null;
        InterfaceC975520bUc interfaceC975520bUc2 = this.LJ;
        if ((interfaceC975520bUc2 != null ? interfaceC975520bUc2.Y2() : null) == EnumC964170bCJ.PUNISH_START && C950220apo.LJI()) {
            C973660bRc.LIZ.LJJLIIJ(c975960bVKM3 != null ? c975960bVKM3.LJJIJ : null, C970370bMJ.LJII(), C500260Jjc.LJJJI(c975960bVKM3 != null ? Boolean.valueOf(c975960bVKM3.LJI) : null) ? EnumC973680bRe.POSITIVE_OVER : EnumC973680bRe.NEGATIVE_OVER);
        }
        InterfaceC975520bUc interfaceC975520bUc3 = this.LJ;
        if (interfaceC975520bUc3 != null) {
            interfaceC975520bUc3.r3(EnumC964170bCJ.NONE, EnumC975850bV9.MATCH_MANAGER_UNLOAD, null, null);
        }
        C975550bUf c975550bUf = this.LJI;
        if (c975550bUf != null) {
            c975550bUf.LIZIZ();
        }
        DataChannel dataChannel = this.LJII;
        if (!C500260Jjc.LJJJI(dataChannel != null ? (Boolean) dataChannel.gg0(C753790ThZ.class) : null) && (interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ()) != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJLLLLLL(0.0f, 0, true);
        }
        DataChannel dataChannel2 = this.LJII;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C753790ThZ.class, Boolean.FALSE);
        }
        this.LJ = null;
        this.LJFF = null;
        this.LIZIZ = null;
        C974690bTH c974690bTH = this.LIZLLL;
        if (c974690bTH != null) {
            DataChannel dataChannel3 = c974690bTH.LL;
            if (dataChannel3 != null && (iMessageManager = (IMessageManager) dataChannel3.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener(C001A.LINK_MIC_BATTLE.getIntType(), c974690bTH);
                iMessageManager.removeMessageListener(C001A.LINK_MIC_BATTLE_ARMIES.getIntType(), c974690bTH);
                iMessageManager.removeMessageListener(C001A.LINK_MIC_BATTLE_PUNISH_FINISH.getIntType(), c974690bTH);
                iMessageManager.removeMessageListener(C001A.COMPETITION_CONTRIBUTOR_MESSAGE.getIntType(), c974690bTH);
                iMessageManager.removeMessageListener(C001A.BATTLE_A_I_COMMENTARY_MESSAGE.getIntType(), c974690bTH);
            }
            ((ArrayList) C20483515Dd.LJIIIIZZ).remove(c974690bTH);
            C974790bTR c974790bTR = c974690bTH.LLILZLL;
            if (c974790bTR != null) {
                c974790bTR.LIZ.LIZ();
            }
        }
        C20441214yg.LJ("LiveMatchManager", "reset all engine to null");
        DataChannel dataChannel4 = this.LJII;
        if (dataChannel4 != null) {
            dataChannel4.zQ2(this);
        }
        this.LJII = null;
        this.LJIIIZ.removeCallbacksAndMessages(null);
        if (LiveDirectMatchSetting.INSTANCE.isEnabled() && this.LIZJ) {
            return;
        }
        LJIIIZ();
        C915980Zwa.LJFF().tj2();
    }

    public final void LJIIL() {
        C975550bUf c975550bUf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Try to initComponentManager. interactiveModeComponentManager is null? ");
        sbLIZ.append(this.LJI == null);
        C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJI == null) {
            this.LJI = new C975550bUf();
        }
        LJIILIIL();
        MatchBaseWidget matchBaseWidget = this.LIZ;
        if (matchBaseWidget.context == null || (c975550bUf = this.LJI) == null) {
            return;
        }
        c975550bUf.LJ(matchBaseWidget);
    }

    @Override // X.InterfaceC975700bUu
    public final MatchBaseWidget LIZIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0bVY] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0bUj] */
    public C975500bUa(final MatchBaseWidget matchBaseWidget) {
        this.LIZ = matchBaseWidget;
        final ?? r2 = new InterfaceC977310bXV() { // from class: X.0bUj
            @Override // X.InterfaceC977310bXV
            public final void LIZ(String str, boolean z, boolean z2) {
                C973660bRc.LIZ.LJL(str, z, C915980Zwa.LJI().LIZ().LJIILLIIL());
            }
        };
        this.LJIIIZ = new BPEAHandler(Looper.getMainLooper());
        DataChannel dataChannel = matchBaseWidget.dataChannel;
        this.LJII = dataChannel;
        final boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
        this.LIZJ = zLJIIZILJ;
        this.LIZIZ = new InterfaceC975710bUv(zLJIIZILJ, r2, matchBaseWidget) { // from class: X.0bVY
            public final boolean LIZ;
            public final InterfaceC977310bXV LIZIZ;
            public final MatchBaseWidget LIZJ;

            @Override // X.InterfaceC975710bUv
            public final void LIZ() {
            }

            {
                this.LIZ = zLJIIZILJ;
                this.LIZIZ = r2;
                this.LIZJ = matchBaseWidget;
            }

            @Override // X.InterfaceC975710bUv
            public final InterfaceC975780bV2 LIZIZ(boolean z, EnumC919170a1j enumC919170a1j, EnumC964170bCJ enumC964170bCJ, EnumC975850bV9 enumC975850bV9) {
                boolean zLJIJI;
                int size;
                boolean z2;
                List list;
                List list2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createCoordinator,status = ");
                sbLIZ.append(enumC964170bCJ);
                sbLIZ.append(",type = ");
                sbLIZ.append(enumC919170a1j);
                C20441214yg.LIZIZ("LiveMatchStateRegistry", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                boolean z3 = false;
                if (interfaceC975870bVBLJFF != null) {
                    zLJIJI = interfaceC975870bVBLJFF.LJIJI();
                } else {
                    zLJIJI = false;
                }
                EnumC975850bV9 enumC975850bV92 = EnumC975850bV9.INVITER_FROM_FRIEND_RANK;
                if (enumC975850bV9 != enumC975850bV92 || !C2074808Aw.LJFF() || (((list = (List) ((C0TW5) this.LIZJ.y1(C977630bY1.class)).LIZJ.getValue()) == null || (size = list.size()) <= 0) && (((list2 = (List) ((C0TW5) this.LIZJ.y1(C977620bY0.class)).LIZJ.getValue()) == null || (size = list2.size()) <= 0) && (size = C2074908Ax.LIZ.get().LJ.size()) <= 0))) {
                    size = C915980Zwa.LJII().LLILZLL(true).size();
                }
                boolean zIsEnabled = LiveMatchInviterPanelLynxConfigSetting.INSTANCE.isEnabled();
                if (enumC975850bV9 != enumC975850bV92 && !C2074808Aw.LJFF()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 ? !(!zIsEnabled || size < 2 || zLJIJI) : !(!zIsEnabled || zLJIJI)) {
                    z3 = true;
                }
                if (enumC964170bCJ == EnumC964170bCJ.PREPARING || enumC964170bCJ == EnumC964170bCJ.INVITED) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("panelDecision,status=");
                    sbLIZ2.append(enumC964170bCJ);
                    sbLIZ2.append(",matchType=");
                    sbLIZ2.append(enumC919170a1j);
                    sbLIZ2.append(",fromSource=");
                    sbLIZ2.append(enumC975850bV9);
                    sbLIZ2.append(",isFriendRankQuickMatch=");
                    sbLIZ2.append(z2);
                    sbLIZ2.append(",isLynxEnabled=");
                    sbLIZ2.append(zIsEnabled);
                    sbLIZ2.append(",hostCount=");
                    sbLIZ2.append(size);
                    sbLIZ2.append(",isInFallback=");
                    sbLIZ2.append(zLJIJI);
                    sbLIZ2.append(",useCombinedPanel=");
                    sbLIZ2.append(z3);
                    C20441214yg.LIZIZ("LiveMatchStateRegistry", C2188811AlT.LIZIZ(sbLIZ2));
                }
                switch (C964180bCK.LIZ[enumC964170bCJ.ordinal()]) {
                    case 1:
                        if (z) {
                            return new InterfaceC975940bVI(this.LIZJ) { // from class: X.0bUJ
                                public final MatchBaseWidget LIZ;
                                public final DataChannel LIZIZ;

                                @Override // X.InterfaceC975940bVI
                                public final void LJJI() {
                                }

                                @Override // X.InterfaceC975940bVI
                                public final void LJIJJLI() {
                                    MatchBaseWidget matchBaseWidget2;
                                    C16FS c16fs;
                                    C20441214yg.LJ("NoneCoordinator", "update rematch status, back to enable");
                                    MatchBaseWidget matchBaseWidget3 = this.LIZ;
                                    if (matchBaseWidget3 == null || matchBaseWidget3.getView() == null || (matchBaseWidget2 = this.LIZ) == null || (c16fs = (C16FS) matchBaseWidget2.findViewById(R.id.cnn)) == null) {
                                        return;
                                    }
                                    c16fs.j0(R.style.a7v);
                                    c16fs.setEnabled(true);
                                }

                                {
                                    DataChannel dataChannelProvideDataChannel;
                                    this.LIZ = matchBaseWidget;
                                    if (matchBaseWidget != null) {
                                        dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
                                    } else {
                                        dataChannelProvideDataChannel = null;
                                    }
                                    this.LIZIZ = dataChannelProvideDataChannel;
                                }

                                @Override // X.InterfaceC975940bVI
                                public final void LJJ(LinkMicBattleMessage linkMicBattleMessage) {
                                    final int i;
                                    Integer numValueOf;
                                    C20441214yg.LJ("NoneCoordinator", "try reject current Invite");
                                    BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
                                    boolean z4 = false;
                                    if (battleSetting != null) {
                                        i = battleSetting.inviteType;
                                    } else {
                                        i = 0;
                                    }
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("inviteType=");
                                    sbLIZ3.append(i);
                                    C20441214yg.LIZIZ("NoneCoordinator", C2188811AlT.LIZIZ(sbLIZ3));
                                    if (LiveDirectMatchSetting.INSTANCE.isEnabled()) {
                                        if (i != 5) {
                                            z4 = true;
                                        }
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("checkChannelId=");
                                        sbLIZ4.append(z4);
                                        C20441214yg.LIZIZ("NoneCoordinator", C2188811AlT.LIZIZ(sbLIZ4));
                                    } else {
                                        z4 = true;
                                    }
                                    long channelId = C915980Zwa.LJII().getChannelId();
                                    if (z4 && channelId == 0) {
                                        C20441214yg.LJ("NoneCoordinator", "Reject api error channel id is empty");
                                        return;
                                    }
                                    final long j = linkMicBattleMessage.battleId;
                                    C974540bT2.LJLJLLL(i, j, "cohost_list_change", true);
                                    EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                                    BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
                                    if (battleSetting2 != null) {
                                        numValueOf = Integer.valueOf((int) battleSetting2.sourceType);
                                    } else {
                                        numValueOf = null;
                                    }
                                    C480460Ism.LIZ().getClass();
                                    ((C0J1N) ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).reject(channelId, j, i, 1, 0, linkMicBattleMessage.actionByUserId, numValueOf).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS1S0101100_15(i, j, enumC919170a1jXB0, 2), new C09JN() { // from class: X.0bUK
                                        @Override // X.C09JN
                                        public final void accept(Object obj) {
                                            C1C7U.LIZ("MatchNoneAnchorCoordinator@dcb4.requestRejectApiWhenListChange$2");
                                            Throwable th = (Throwable) obj;
                                            C974540bT2.LIZ.LJLLI(i, j, th);
                                            C0UVC.LIZIZ(th);
                                            C1C7U.LIZIZ("MatchNoneAnchorCoordinator@dcb4.requestRejectApiWhenListChange$2");
                                        }
                                    });
                                }

                                @Override // X.InterfaceC975940bVI
                                public final void LJJIIZI(AwS594S0100000_15 awS594S0100000_15) {
                                    DataChannel dataChannel2 = this.LIZIZ;
                                    if (dataChannel2 != null) {
                                        dataChannel2.BQ2(this.LIZ, QuickStartRequestEvent.class, new AwS594S0100000_15(awS594S0100000_15, 731));
                                    }
                                }
                            };
                        }
                        return new InterfaceC975780bV2() { // from class: X.0bXU
                        };
                    case 2:
                        if (z3) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("createCoordinator, isInFallback = ");
                            sbLIZ3.append(zLJIJI);
                            C20441214yg.LIZIZ("LiveMatchStateRegistry", C2188811AlT.LIZIZ(sbLIZ3));
                            return new C975910bVF(this.LIZJ, enumC919170a1j);
                        }
                        int i = C964180bCK.LIZIZ[enumC919170a1j.ordinal()];
                        if (i != 1) {
                            if (i != 2 && i != 3) {
                                if (i != 4) {
                                    return new C974960bTi(this.LIZJ);
                                }
                                return new C976140bVc(this.LIZJ);
                            }
                            return new C974960bTi(this.LIZJ);
                        }
                        return new C976140bVc(this.LIZJ);
                    case 3:
                        if (z3) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("createCoordinator, isInFallback = ");
                            sbLIZ4.append(zLJIJI);
                            C20441214yg.LIZIZ("LiveMatchStateRegistry", C2188811AlT.LIZIZ(sbLIZ4));
                            return new C977560bXu(this.LIZJ, enumC919170a1j);
                        }
                        int i2 = C964180bCK.LIZIZ[enumC919170a1j.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2 && i2 != 3) {
                                if (i2 != 4) {
                                    return new C977580bXw(this.LIZJ);
                                }
                                return new C977570bXv(this.LIZJ);
                            }
                            return new C977580bXw(this.LIZJ);
                        }
                        return new C977550bXt(this.LIZJ);
                    case 4:
                    case 5:
                        int i3 = C964180bCK.LIZIZ[enumC919170a1j.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2 && i3 != 3) {
                                if (i3 != 4) {
                                    MatchBaseWidget matchBaseWidget2 = this.LIZJ;
                                    C974910bTd c974910bTd = C974910bTd.LJIIJJI;
                                    if (c974910bTd != null && c974910bTd.LIZ == matchBaseWidget2) {
                                        return c974910bTd;
                                    }
                                    C974910bTd c974910bTd2 = new C974910bTd(matchBaseWidget2);
                                    C974910bTd.LJIIJJI = c974910bTd2;
                                    return c974910bTd2;
                                }
                                MatchBaseWidget matchBaseWidget3 = this.LIZJ;
                                C976460bW8 c976460bW8 = C976460bW8.LJIILIIL;
                                if (c976460bW8 != null && c976460bW8.LIZ == matchBaseWidget3) {
                                    return c976460bW8;
                                }
                                C976460bW8 c976460bW82 = new C976460bW8(matchBaseWidget3);
                                C976460bW8.LJIILIIL = c976460bW82;
                                return c976460bW82;
                            }
                            MatchBaseWidget matchBaseWidget4 = this.LIZJ;
                            C974910bTd c974910bTd3 = C974910bTd.LJIIJJI;
                            if (c974910bTd3 != null && c974910bTd3.LIZ == matchBaseWidget4) {
                                return c974910bTd3;
                            }
                            C974910bTd c974910bTd4 = new C974910bTd(matchBaseWidget4);
                            C974910bTd.LJIIJJI = c974910bTd4;
                            return c974910bTd4;
                        }
                        MatchBaseWidget matchBaseWidget5 = this.LIZJ;
                        C976110bVZ c976110bVZ = C976110bVZ.LJIILJJIL;
                        if (c976110bVZ != null && c976110bVZ.LIZ == matchBaseWidget5) {
                            return c976110bVZ;
                        }
                        C976110bVZ c976110bVZ2 = new C976110bVZ(matchBaseWidget5);
                        C976110bVZ.LJIILJJIL = c976110bVZ2;
                        return c976110bVZ2;
                    case 6:
                        if (C964180bCK.LIZIZ[enumC919170a1j.ordinal()] == 1) {
                            return new C976180bVg(this.LIZJ);
                        }
                        return new C976190bVh(this.LIZJ);
                    case 7:
                        if (C964180bCK.LIZIZ[enumC919170a1j.ordinal()] == 1) {
                            return new C976180bVg(this.LIZJ);
                        }
                        return new C976190bVh(this.LIZJ);
                    case 8:
                        if (C964180bCK.LIZIZ[enumC919170a1j.ordinal()] == 1) {
                            return new C976180bVg(this.LIZJ);
                        }
                        return new C976190bVh(this.LIZJ);
                    case BdTuring.TYPE_ECAF /* 9 */:
                        final MatchBaseWidget matchBaseWidget6 = this.LIZJ;
                        return new C976190bVh(matchBaseWidget6) { // from class: X.0bWi
                            public final MatchBaseWidget LJII;

                            @Override // X.C976190bVh
                            public final MatchBaseWidget LJIILJJIL() {
                                return this.LJII;
                            }

                            {
                                super(matchBaseWidget6);
                                this.LJII = matchBaseWidget6;
                                if (matchBaseWidget6 != null) {
                                    matchBaseWidget6.provideDataChannel();
                                    matchBaseWidget6.findViewById(R.id.cnl);
                                }
                            }
                        };
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        final MatchBaseWidget matchBaseWidget7 = this.LIZJ;
                        return new InterfaceC976950bWv(matchBaseWidget7) { // from class: X.0bWG
                            public final MatchBaseWidget LIZ;

                            @Override // X.InterfaceC976950bWv
                            public final void LJI() {
                                MatchBaseWidget matchBaseWidget8 = this.LIZ;
                                if (matchBaseWidget8 == null || matchBaseWidget8.getView() == null) {
                                    return;
                                }
                                MatchBaseWidget matchBaseWidget9 = this.LIZ;
                                C16FS c16fs = matchBaseWidget9 != null ? (C16FS) matchBaseWidget9.findViewById(R.id.cnn) : null;
                                MatchBaseWidget matchBaseWidget10 = this.LIZ;
                                C985030bjx c985030bjx = matchBaseWidget10 != null ? (C985030bjx) matchBaseWidget10.findViewById(R.id.cnl) : null;
                                if (c16fs != null) {
                                    C786410Ut5.LLJJJ(c16fs, 8);
                                }
                                if (c985030bjx != null) {
                                    C786410Ut5.LLJL(c985030bjx, 8);
                                    c985030bjx.LIZIZ();
                                }
                            }

                            {
                                this.LIZ = matchBaseWidget7;
                                if (matchBaseWidget7 != null) {
                                    matchBaseWidget7.provideDataChannel();
                                }
                            }
                        };
                    default:
                        return new InterfaceC975780bV2() { // from class: X.0bXU
                        };
                }
            }

            @Override // X.InterfaceC975710bUv
            public final C975800bV4 LIZJ(final InterfaceC975520bUc interfaceC975520bUc, final EnumC964170bCJ enumC964170bCJ, final LinkMicBattleMessage linkMicBattleMessage, final BattleInfoResponse battleInfoResponse, EnumC975850bV9 enumC975850bV9) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resolve status = ");
                sbLIZ.append(enumC964170bCJ);
                sbLIZ.append(", isAnchor = ");
                sbLIZ.append(this.LIZ);
                C20441214yg.LIZIZ("liuxuedi", C2188811AlT.LIZIZ(sbLIZ));
                switch (C964180bCK.LIZ[enumC964170bCJ.ordinal()]) {
                    case 1:
                        if (this.LIZ) {
                            return new C975800bV4<InterfaceC975940bVI>(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage) { // from class: X.0bV3
                                @Override // X.C976040bVS, X.InterfaceC975690bUt
                                public final boolean LJIIIZ() {
                                    Integer numValueOf;
                                    DataChannel dataChannel2;
                                    InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                    BattleInfoResponse battleInfoResponse2 = (interfaceC975520bUc2 == null || (dataChannel2 = interfaceC975520bUc2.getDataChannel()) == null) ? null : (BattleInfoResponse) dataChannel2.gg0(C969680bLC.class);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("onMatchConnectResumed,reResumeBattleInfo = ");
                                    sbLIZ2.append(battleInfoResponse2);
                                    C20441214yg.LIZIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ2));
                                    if (battleInfoResponse2 == null) {
                                        return false;
                                    }
                                    long jLJIILL = LJIILL();
                                    BattleSetting battleSetting = battleInfoResponse2.setting;
                                    long j = battleSetting != null ? battleSetting.extraDurationSecond : 0L;
                                    long j2 = jLJIILL + j;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("handle resume battleInfo, remainTime = ");
                                    sbLIZ3.append(jLJIILL);
                                    sbLIZ3.append(" , extraTime = ");
                                    sbLIZ3.append(j);
                                    sbLIZ3.append(" , realRemainTime = ");
                                    sbLIZ3.append(j2);
                                    C20441214yg.LIZIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ3));
                                    LJIL(battleInfoResponse2);
                                    C976040bVS.LJIIJJI(battleInfoResponse2.userInfoMap);
                                    BattleSetting battleSetting2 = battleInfoResponse2.setting;
                                    if (battleSetting2 != null && (numValueOf = Integer.valueOf(battleSetting2.status)) != null) {
                                        if (numValueOf.intValue() == 1) {
                                            if (j2 > 0) {
                                                C975800bV4.LJJIIZI(this, null, battleInfoResponse2, EnumC975850bV9.ANCHOR_RESUME_BATTLE_INFO, 1);
                                                return true;
                                            }
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("Resume data: match data expired , ");
                                            sbLIZ4.append(j2);
                                            C20441214yg.LJ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ4));
                                            C974540bT2.LIZ.LJJIL();
                                            return false;
                                        }
                                        if (numValueOf.intValue() == 3) {
                                            long value = j2 + LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                                            if (value > 0) {
                                                C975800bV4.LJJIIZ(this, null, battleInfoResponse2, EnumC975850bV9.ANCHOR_RESUME_BATTLE_INFO, 1);
                                                return true;
                                            }
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("match data expired , ");
                                            sbLIZ5.append(value);
                                            C20441214yg.LJ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ5));
                                            return false;
                                        }
                                    }
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append("else resume, ");
                                    BattleSetting battleSetting3 = battleInfoResponse2.setting;
                                    sbLIZ6.append(battleSetting3 != null ? Integer.valueOf(battleSetting3.status) : null);
                                    C20441214yg.LJ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ6));
                                    return false;
                                }

                                @Override // X.C975800bV4, X.InterfaceC975690bUt
                                public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
                                    DataChannel dataChannel2;
                                    BattleSetting battleSetting;
                                    C975960bVK c975960bVKM3;
                                    if (!(abstractC1136060ffY instanceof LinkMicBattleMessage)) {
                                        return;
                                    }
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("onReceiveMessage, message.action = ");
                                    LinkMicBattleMessage linkMicBattleMessage2 = (LinkMicBattleMessage) abstractC1136060ffY;
                                    sbLIZ2.append(linkMicBattleMessage2.action);
                                    C20441214yg.LIZIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ2));
                                    int i = linkMicBattleMessage2.action;
                                    Integer numValueOf = null;
                                    if (i != 1) {
                                        if (i != 7) {
                                            if (i != 3) {
                                                if (i == 4 && (battleSetting = linkMicBattleMessage2.battleSetting) != null && battleSetting.inviteType == 4) {
                                                    InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                                    if (interfaceC975520bUc2 != null && (c975960bVKM3 = interfaceC975520bUc2.m3()) != null) {
                                                        c975960bVKM3.LJJJJZI = linkMicBattleMessage2.actionByUserId;
                                                    }
                                                    C975800bV4.LJJIIZI(this, linkMicBattleMessage2, null, EnumC975850bV9.OPEN_MESSAGE, 2);
                                                    return;
                                                }
                                                return;
                                            }
                                            C20441214yg.LJIIIZ("MatchStateNoneAnchor", "handleCancelMessage");
                                            if (!C976040bVS.LJIIJ(this, linkMicBattleMessage2.battleId) || !C974500bSy.LIZJ(linkMicBattleMessage2)) {
                                                return;
                                            }
                                            C20441214yg.LJIIIZ("MatchStateNoneAnchor", "Set isInTeamPair to false");
                                            InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                            if (interfaceC975520bUc3 == null || (dataChannel2 = interfaceC975520bUc3.getDataChannel()) == null) {
                                                return;
                                            }
                                            dataChannel2.zW(BattleIsInTeamPairing.class, new C962900bAG(false, false, false));
                                            return;
                                        }
                                        LJJI(linkMicBattleMessage2);
                                        return;
                                    }
                                    C974500bSy.LIZ(linkMicBattleMessage2);
                                    BattleSetting battleSetting2 = linkMicBattleMessage2.battleSetting;
                                    if (battleSetting2 != null) {
                                        numValueOf = Integer.valueOf(battleSetting2.inviteType);
                                    }
                                    boolean zLIZ = C959180b4G.LIZ(numValueOf);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("dealLinkMicBattleMessage, message = ");
                                    sbLIZ3.append(linkMicBattleMessage2.action);
                                    C20441214yg.LJIIIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ3));
                                    if (!C974500bSy.LIZJ(linkMicBattleMessage2) || !LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
                                        int size = C915980Zwa.LJII().LLILZLL(true).size();
                                        int size2 = C915980Zwa.LJII().LJIJJ().size();
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("linkedListSize = ");
                                        sbLIZ4.append(size);
                                        sbLIZ4.append(" ,linkingList = ");
                                        sbLIZ4.append(size2);
                                        C20441214yg.LJIIIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ4));
                                        if (size != size2 && !zLIZ) {
                                            C20441214yg.LJ("MatchStateNoneAnchor", "Reject invite");
                                            InterfaceC975940bVI interfaceC975940bVI = (InterfaceC975940bVI) LJIILJJIL();
                                            if (interfaceC975940bVI == null) {
                                                return;
                                            }
                                            interfaceC975940bVI.LJJ(linkMicBattleMessage2);
                                            return;
                                        }
                                    }
                                    LJJI(linkMicBattleMessage2);
                                }

                                @Override // X.InterfaceC975690bUt
                                public final void LIZJ(EnumC975850bV9 enumC975850bV92) {
                                    Boolean boolValueOf;
                                    EnumC919170a1j enumC919170a1jLJIIIZ;
                                    InterfaceC975520bUc interfaceC975520bUc2;
                                    C975960bVK c975960bVKM3;
                                    C975990bVN c975990bVN;
                                    InterfaceC973730bRj interfaceC973730bRjYf2;
                                    BattleTeamResult battleTeamResultLJIJI;
                                    InterfaceC973730bRj interfaceC973730bRjYf22;
                                    InterfaceC975940bVI interfaceC975940bVI;
                                    BattleTeamResult battleTeamResultLJIJI2;
                                    C0UVC.LIZJ("MatchStateNoneAnchor");
                                    C0UVC.LIZLLL = "stateDidEnter";
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("reset fromSource = ");
                                    sbLIZ2.append(enumC975850bV92);
                                    C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                    InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                    if (interfaceC975520bUc3 != null) {
                                        boolValueOf = Boolean.valueOf(interfaceC975520bUc3.d3());
                                    } else {
                                        boolValueOf = null;
                                    }
                                    if (C500260Jjc.LJJJI(boolValueOf) && (interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false)) != null && (battleTeamResultLJIJI = interfaceC973730bRjYf2.LJIJI()) != null && Integer.valueOf(battleTeamResultLJIJI.result) != null && (((interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false)) == null || (battleTeamResultLJIJI2 = interfaceC973730bRjYf22.LJIJI()) == null || battleTeamResultLJIJI2.result != 2) && (interfaceC975940bVI = (InterfaceC975940bVI) LJIILJJIL()) != null)) {
                                        interfaceC975940bVI.LJIJJLI();
                                    }
                                    InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                                    if (interfaceC975520bUc4 != null && (c975960bVKM3 = interfaceC975520bUc4.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
                                        c975990bVN.LJIIJJI(C915980Zwa.LJII().LLILZLL(true));
                                    }
                                    InterfaceC975940bVI interfaceC975940bVI2 = (InterfaceC975940bVI) LJIILJJIL();
                                    if (interfaceC975940bVI2 != null) {
                                        interfaceC975940bVI2.LJJIIZI(new AwS594S0100000_15(this, 846));
                                    }
                                    InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                                    if (interfaceC975870bVBLJFF != null) {
                                        if (interfaceC975870bVBLJFF.LJIILIIL()) {
                                            interfaceC975870bVBLJFF.LIZIZ(false);
                                        }
                                        interfaceC975870bVBLJFF.LJIILJJIL(true);
                                    }
                                    if (enumC975850bV92 == EnumC975850bV9.LYNX_UI_ERROR) {
                                        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                                        if (interfaceC975870bVBLJFF != null) {
                                            interfaceC975870bVBLJFF.LIZIZ(true);
                                        }
                                        InterfaceC975520bUc interfaceC975520bUc5 = this.LIZIZ;
                                        if (interfaceC975520bUc5 != null) {
                                            enumC919170a1jLJIIIZ = interfaceC975520bUc5.LJIIIZ();
                                        } else {
                                            enumC919170a1jLJIIIZ = null;
                                        }
                                        if (enumC919170a1jLJIIIZ == EnumC919170a1j.MATCH_TYPE_2V2 && C915980Zwa.LJII().LLILZLL(true).size() == 2 && (interfaceC975520bUc2 = this.LIZIZ) != null) {
                                            interfaceC975520bUc2.k3(EnumC919170a1j.MATCH_TYPE_1V1);
                                        }
                                        if (listLLILZLL.size() > 2) {
                                            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                                            C974210bSV c974210bSV = new C974210bSV("open_entrance", null);
                                            c974210bSV.LJIIIZ = true;
                                            c974210bSV.LJFF = "lynx_fallback";
                                            c784440UpuLIZ.LIZIZ(c974210bSV);
                                        } else {
                                            C975800bV4.LJJIIJZLJL(this, enumC975850bV92);
                                        }
                                        C975060bTs.LIZ("livesdk_match_inviter_lynx_fallback_success", new HashMap());
                                    }
                                }

                                @Override // X.C976040bVS, X.InterfaceC975690bUt
                                public final void LIZLLL(String str) {
                                    EnumC919170a1j enumC919170a1jLJIIIZ;
                                    C975960bVK c975960bVKM3;
                                    String strLJIJJ;
                                    C975960bVK c975960bVKM32;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(" rematch button clicked,currentType = ");
                                    InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                    if (interfaceC975520bUc2 != null) {
                                        enumC919170a1jLJIIIZ = interfaceC975520bUc2.LJIIIZ();
                                    } else {
                                        enumC919170a1jLJIIIZ = null;
                                    }
                                    sbLIZ2.append(enumC919170a1jLJIIIZ);
                                    C20441214yg.LIZIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ2));
                                    InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                    if (interfaceC975520bUc3 != null && (c975960bVKM32 = interfaceC975520bUc3.m3()) != null) {
                                        c975960bVKM32.LJFF = true;
                                    }
                                    C915980Zwa.LJI().LJIIJ().LJ(EnumC973640bRa.PK_REMATCH.getValue());
                                    InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                                    if (interfaceC975520bUc4 != null && (c975960bVKM3 = interfaceC975520bUc4.m3()) != null) {
                                        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                                        if (interfaceC975870bVBLJFF == null || (strLJIJJ = interfaceC975870bVBLJFF.LJIJJ()) == null) {
                                            strLJIJJ = "";
                                        }
                                        c975960bVKM3.LJJLJLI = new C973800bRq(str, CardStruct.IStatusCode.DEFAULT, strLJIJJ);
                                    }
                                    C975800bV4.LJJIIJZLJL(this, EnumC975850bV9.PUNISH_REMATCH_BUTTON_CLICK);
                                }

                                @Override // X.InterfaceC975690bUt
                                public final void LJI(EnumC975850bV9 enumC975850bV92) {
                                    InterfaceC975940bVI interfaceC975940bVI = (InterfaceC975940bVI) LJIILJJIL();
                                    if (interfaceC975940bVI != null) {
                                        interfaceC975940bVI.LJJI();
                                    }
                                }

                                @Override // X.C976040bVS, X.InterfaceC975690bUt
                                public final void X2(C974180bSS c974180bSS) {
                                    if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
                                        return;
                                    }
                                    if (c974180bSS.LIZ != 5) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("autoMatchScene=");
                                        sbLIZ2.append(c974180bSS.LIZ);
                                        sbLIZ2.append(" is not league match. Skip");
                                        C20441214yg.LIZIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ2));
                                        return;
                                    }
                                    C955540ayO c955540ayO = c974180bSS.LIZIZ;
                                    C973660bRc c973660bRc = C973660bRc.LIZ;
                                    String str = C973660bRc.LJJLIIIJJIZ;
                                    c973660bRc.LJLJLLL(0L, null, null, false, false, "1v1", str, c955540ayO);
                                    if (c974180bSS.LIZJ != null) {
                                        C20441214yg.LIZIZ("MatchStateNoneAnchor", "Match does not need to react to the failure case. Return!");
                                        return;
                                    }
                                    c973660bRc.LJJLIIIJ(0L, false, null, null, 0L, C950220apo.LJFF(), false, "1v1", c974180bSS.LIZIZ, str);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("Update matchType and transit state. data=");
                                    sbLIZ3.append(c974180bSS);
                                    C20441214yg.LIZIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ3));
                                    InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                    if (interfaceC975520bUc2 != null) {
                                        interfaceC975520bUc2.k3(EnumC919170a1j.MATCH_TYPE_1V1);
                                    }
                                    C975800bV4.LJJIII(this, null, EnumC975850bV9.AUTO_MATCH_INVITER_FROM_JSB, 3);
                                }

                                @Override // X.C976040bVS, X.InterfaceC975690bUt
                                public final void e3(C975600bUk c975600bUk) {
                                    if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
                                        return;
                                    }
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("StateNoneAnchor onBattleRequestEvent, event = ");
                                    sbLIZ2.append(c975600bUk.LJ);
                                    C20441214yg.LIZIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ2));
                                    C975800bV4.LJJIII(this, null, C974080bSI.LIZ(Integer.valueOf(c975600bUk.LJI.LIZ)), 3);
                                }

                                @Override // X.C975800bV4, X.InterfaceC975690bUt
                                public final void h3(String str) {
                                    String value;
                                    C975960bVK c975960bVKM3;
                                    C975990bVN c975990bVN;
                                    InterfaceC955780aym interfaceC955780aymLJIIJ = C915980Zwa.LJI().LJIIJ();
                                    if (str == null) {
                                        value = EnumC973640bRa.PK_ICON.getValue();
                                    } else {
                                        value = str;
                                    }
                                    interfaceC955780aymLJIIJ.LJ(value);
                                    InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                    if (interfaceC975520bUc2 != null && (c975960bVKM3 = interfaceC975520bUc2.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
                                        c975990bVN.LJIIJJI(C915980Zwa.LJII().LLILZLL(true));
                                    }
                                    super.h3(str);
                                    LJJIJ(this, null, str, false, 5);
                                }

                                @Override // X.C975800bV4, X.InterfaceC975690bUt
                                public final void i3(C974230bSX c974230bSX) {
                                    boolean z;
                                    String strLJIJJ;
                                    super.i3(c974230bSX);
                                    InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                    if (interfaceC975520bUc2 != null) {
                                        C975960bVK c975960bVKM3 = interfaceC975520bUc2.m3();
                                        if (c975960bVKM3 != null) {
                                            C975990bVN c975990bVN = c975960bVKM3.LJJJLZIJ;
                                            if (c975990bVN != null) {
                                                c975990bVN.LJIIJJI(C915980Zwa.LJII().LLILZLL(true));
                                            }
                                            if (c974230bSX.LIZJ) {
                                                c975960bVKM3.LJFF = true;
                                                String str = C973660bRc.LJJJJL;
                                                InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                                                if (interfaceC975870bVBLJFF == null || (strLJIJJ = interfaceC975870bVBLJFF.LJIJJ()) == null) {
                                                    strLJIJJ = "";
                                                }
                                                c975960bVKM3.LJJLJLI = new C973800bRq(str, "1", strLJIJJ);
                                            }
                                        }
                                        interfaceC975520bUc2.k3(c974230bSX.LIZ);
                                    }
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("onStartMatchExternal, matchType = ");
                                    sbLIZ2.append(c974230bSX.LIZ);
                                    C20441214yg.LIZIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ2));
                                    if (c974230bSX.LIZ == EnumC919170a1j.MATCH_TYPE_2V2 && C915980Zwa.LIZLLL().y91() == 2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    Boolean boolValueOf = null;
                                    if (z) {
                                        C20441214yg.LIZIZ("MatchStateNoneAnchor", "onStartMatchExternal, starting team pair");
                                        InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                        if (interfaceC975520bUc3 != null) {
                                            boolValueOf = Boolean.valueOf(interfaceC975520bUc3.d3());
                                        }
                                        final boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
                                        C950840aqo c950840aqo = new C950840aqo(3, new InterfaceC914930Zut<C960260b60>() { // from class: X.0bV8
                                            @Override // X.InterfaceC914930Zut
                                            public final void onSuccess(C960260b60 c960260b60) {
                                                C975990bVN c975990bVN2;
                                                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(zLJJJI);
                                                if (interfaceC973730bRjYf2 != null) {
                                                    interfaceC973730bRjYf2.LJJJZ(true);
                                                }
                                                C977810bYJ.LIZ();
                                                if (C978520bZS.LJIILIIL(zLJJJI)) {
                                                    C766270U4b.LIZLLL(2131856753);
                                                }
                                                InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                                                if (interfaceC975520bUc4 != null) {
                                                    interfaceC975520bUc4.k3(EnumC919170a1j.MATCH_TYPE_2V2);
                                                    C975960bVK c975960bVKM32 = interfaceC975520bUc4.m3();
                                                    if (c975960bVKM32 != null && (c975990bVN2 = c975960bVKM32.LJJJLZIJ) != null) {
                                                        c975990bVN2.LIZIZ();
                                                    }
                                                }
                                                C975800bV4.LJJIII(this, null, EnumC975850bV9.INVITER_SUGGESTED_TEAM_PAIR, 3);
                                            }

                                            @Override // X.InterfaceC914930Zut
                                            public final void LIZ(int i, String str2, Throwable th) {
                                                DataChannel dataChannel2;
                                                C962900bAG c962900bAG;
                                                String prompt;
                                                getClass();
                                                if (th != null) {
                                                    if (!(th instanceof C501470JlZ) || (prompt = ((C501470JlZ) th).getPrompt()) == null) {
                                                        prompt = "";
                                                    }
                                                    if (prompt.length() == 0) {
                                                        C766270U4b.LIZLLL(2131856763);
                                                    } else {
                                                        C766270U4b.LJIIJJI(prompt);
                                                    }
                                                }
                                                InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                                                if (interfaceC975520bUc4 != null && (dataChannel2 = interfaceC975520bUc4.getDataChannel()) != null && (c962900bAG = (C962900bAG) dataChannel2.gg0(BattleIsInTeamPairing.class)) != null && c962900bAG.LIZ) {
                                                    return;
                                                }
                                                C975800bV4.LJJIIJZLJL(this, EnumC975850bV9.CANCEL_BEFORE_INVITE);
                                            }
                                        }, 3, 24);
                                        C973660bRc c973660bRc = C973660bRc.LIZ;
                                        C973660bRc.LJLLI(zLJJJI);
                                        C915980Zwa.LJIIIZ().LIZIZ(EnumC959750b5B.TYPE_TEAM_PAIR_BUTTON_CLICK, c950840aqo);
                                        return;
                                    }
                                    C20441214yg.LIZIZ("MatchStateNoneAnchor", "onStartMatchExternal, normal click entrance");
                                    LJJIJ(this, null, c974230bSX.LIZLLL, c974230bSX.LIZIZ, 1);
                                }

                                @Override // X.C975800bV4, X.InterfaceC975690bUt
                                public final void f3(int i, boolean z) {
                                    String value;
                                    C975960bVK c975960bVKM3;
                                    C975990bVN c975990bVN;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("onMatchGuideClicked, noticeType = ");
                                    sbLIZ2.append(i);
                                    C20441214yg.LIZIZ("MatchStateNoneAnchor", C2188811AlT.LIZIZ(sbLIZ2));
                                    InterfaceC955780aym interfaceC955780aymLJIIJ = C915980Zwa.LJI().LJIIJ();
                                    if (i == 6) {
                                        value = EnumC973640bRa.INDIVIDUAL_GUIDE.getValue();
                                    } else {
                                        value = EnumC973640bRa.PK_GUIDE.getValue();
                                    }
                                    interfaceC955780aymLJIIJ.LJ(value);
                                    InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                    if (interfaceC975520bUc2 != null && (c975960bVKM3 = interfaceC975520bUc2.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
                                        c975990bVN.LJIIJJI(C915980Zwa.LJII().LLILZLL(true));
                                    }
                                    super.f3(i, z);
                                    LJJIJ(this, Integer.valueOf(i), null, false, 6);
                                }

                                public static void LJJIJ(C975790bV3 c975790bV3, Integer num, String str, boolean z, int i) {
                                    EnumC919170a1j enumC919170a1jLJIIIZ;
                                    EnumC975850bV9 enumC975850bV92;
                                    EnumC919170a1j enumC919170a1jLJIIIZ2;
                                    EnumC975850bV9 enumC975850bV93;
                                    EnumC919170a1j enumC919170a1jLJIIIZ3;
                                    EnumC919170a1j enumC919170a1jLJIIIZ4;
                                    EnumC975850bV9 enumC975850bV94;
                                    InterfaceC975870bVB interfaceC975870bVBLJFF;
                                    EnumC975850bV9 enumC975850bV95;
                                    EnumC919170a1j enumC919170a1jLJIIIZ5;
                                    EnumC919170a1j enumC919170a1jLJIIIZ6;
                                    EnumC975850bV9 enumC975850bV96;
                                    EnumC919170a1j enumC919170a1jLJIIIZ7 = null;
                                    if ((i & 1) != 0) {
                                        num = null;
                                    }
                                    if ((i & 2) != 0) {
                                        str = null;
                                    }
                                    if ((i & 4) != 0) {
                                        z = false;
                                    }
                                    c975790bV3.getClass();
                                    C978360bZC.LJIIJJI = "match_icon";
                                    if (LiveMatchInviterPanelLynxConfigSetting.INSTANCE.isEnabled() && (interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF()) != null && !interfaceC975870bVBLJFF.LJIJI()) {
                                        if (z) {
                                            InterfaceC975520bUc interfaceC975520bUc2 = c975790bV3.LIZIZ;
                                            if (interfaceC975520bUc2 != null) {
                                                enumC919170a1jLJIIIZ5 = interfaceC975520bUc2.LJIIIZ();
                                            } else {
                                                enumC919170a1jLJIIIZ5 = null;
                                            }
                                            if (enumC919170a1jLJIIIZ5 != EnumC919170a1j.MATCH_TYPE_2V2) {
                                                InterfaceC975520bUc interfaceC975520bUc3 = c975790bV3.LIZIZ;
                                                if (interfaceC975520bUc3 != null) {
                                                    enumC919170a1jLJIIIZ6 = interfaceC975520bUc3.LJIIIZ();
                                                } else {
                                                    enumC919170a1jLJIIIZ6 = null;
                                                }
                                                if (enumC919170a1jLJIIIZ6 != EnumC919170a1j.MATCH_TYPE_1VN) {
                                                    if (num != null) {
                                                        enumC975850bV96 = EnumC975850bV9.GUIDE_CAPSULE_CLICK;
                                                    } else {
                                                        enumC975850bV96 = EnumC975850bV9.MODE_GUIDE_BUTTON_CLICK;
                                                    }
                                                    C975800bV4.LJJIII(c975790bV3, null, enumC975850bV96, 3);
                                                    return;
                                                }
                                            }
                                        }
                                        if (num != null) {
                                            enumC975850bV95 = EnumC975850bV9.GUIDE_CAPSULE_CLICK;
                                        } else {
                                            enumC975850bV95 = EnumC975850bV9.MODE_GUIDE_BUTTON_CLICK;
                                        }
                                        C975800bV4.LJJIIJZLJL(c975790bV3, enumC975850bV95);
                                        return;
                                    }
                                    InterfaceC975520bUc interfaceC975520bUc4 = c975790bV3.LIZIZ;
                                    if (interfaceC975520bUc4 != null) {
                                        enumC919170a1jLJIIIZ = interfaceC975520bUc4.LJIIIZ();
                                    } else {
                                        enumC919170a1jLJIIIZ = null;
                                    }
                                    if (enumC919170a1jLJIIIZ != EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
                                        InterfaceC975520bUc interfaceC975520bUc5 = c975790bV3.LIZIZ;
                                        if (interfaceC975520bUc5 != null) {
                                            enumC919170a1jLJIIIZ3 = interfaceC975520bUc5.LJIIIZ();
                                        } else {
                                            enumC919170a1jLJIIIZ3 = null;
                                        }
                                        if (enumC919170a1jLJIIIZ3 != EnumC919170a1j.MATCH_TYPE_1V1) {
                                            InterfaceC975520bUc interfaceC975520bUc6 = c975790bV3.LIZIZ;
                                            if (interfaceC975520bUc6 != null) {
                                                enumC919170a1jLJIIIZ4 = interfaceC975520bUc6.LJIIIZ();
                                            } else {
                                                enumC919170a1jLJIIIZ4 = null;
                                            }
                                            if (enumC919170a1jLJIIIZ4 != EnumC919170a1j.MATCH_TYPE_1VN) {
                                                InterfaceC975520bUc interfaceC975520bUc7 = c975790bV3.LIZIZ;
                                                if (interfaceC975520bUc7 != null) {
                                                    enumC919170a1jLJIIIZ7 = interfaceC975520bUc7.LJIIIZ();
                                                }
                                                if (enumC919170a1jLJIIIZ7 != EnumC919170a1j.MATCH_TYPE_2V2) {
                                                    return;
                                                }
                                            }
                                            if (num != null) {
                                                enumC975850bV94 = EnumC975850bV9.GUIDE_CAPSULE_CLICK;
                                            } else {
                                                enumC975850bV94 = EnumC975850bV9.MODE_GUIDE_BUTTON_CLICK;
                                            }
                                            C975800bV4.LJJIIJZLJL(c975790bV3, enumC975850bV94);
                                            return;
                                        }
                                    }
                                    if (!z && (Intrinsics.LJFF(str, "pk_icon") || Intrinsics.LJFF(str, "playbook_match") || Intrinsics.LJFF(str, "livefest_page") || C13LP.LJJJJ(str, LiveMatchGameRouterConfigSetting.INSTANCE.getEnterFromList()))) {
                                        InterfaceC975520bUc interfaceC975520bUc8 = c975790bV3.LIZIZ;
                                        if (interfaceC975520bUc8 != null) {
                                            enumC919170a1jLJIIIZ2 = interfaceC975520bUc8.LJIIIZ();
                                        } else {
                                            enumC919170a1jLJIIIZ2 = null;
                                        }
                                        if (enumC919170a1jLJIIIZ2 == EnumC919170a1j.MATCH_TYPE_1V1) {
                                            if (num != null) {
                                                enumC975850bV93 = EnumC975850bV9.GUIDE_CAPSULE_CLICK;
                                            } else {
                                                enumC975850bV93 = EnumC975850bV9.MODE_GUIDE_BUTTON_CLICK;
                                            }
                                            C975800bV4.LJJIIJZLJL(c975790bV3, enumC975850bV93);
                                            return;
                                        }
                                    }
                                    if (num != null) {
                                        enumC975850bV92 = EnumC975850bV9.GUIDE_CAPSULE_CLICK;
                                    } else {
                                        enumC975850bV92 = EnumC975850bV9.MODE_GUIDE_BUTTON_CLICK;
                                    }
                                    C975800bV4.LJJIII(c975790bV3, null, enumC975850bV92, 3);
                                }
                            };
                        }
                        return new C975800bV4<InterfaceC975940bVI>(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage) { // from class: X.0bVW
                            public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());

                            @Override // X.C976040bVS, X.InterfaceC975690bUt
                            public final void d1() {
                            }

                            @Override // X.C975800bV4, X.InterfaceC975690bUt
                            public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
                                if (!(abstractC1136060ffY instanceof LinkMicBattleMessage)) {
                                    return;
                                }
                                LinkMicBattleMessage linkMicBattleMessage2 = (LinkMicBattleMessage) abstractC1136060ffY;
                                int i = linkMicBattleMessage2.action;
                                if (i != 4) {
                                    if (i == 5) {
                                        LJJIJ(linkMicBattleMessage2);
                                        LJIJ(EnumC964170bCJ.SETTLE_START, EnumC975850bV9.SETTLE_FINISH_MESSAGE_AUDIENCE, linkMicBattleMessage2, null);
                                        return;
                                    }
                                    return;
                                }
                                LJJIJ(linkMicBattleMessage2);
                                AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(abstractC1136060ffY, this, 79);
                                if (linkMicBattleMessage2.action != 4) {
                                    return;
                                }
                                awS416S0200000_15.invoke();
                            }

                            /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
                            @Override // X.C976040bVS, X.InterfaceC975690bUt
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final boolean LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r13) {
                                /*
                                    Method dump skipped, instruction units count: 267
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C976080bVW.LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse):boolean");
                            }

                            @Override // X.InterfaceC975690bUt
                            public final void LIZJ(EnumC975850bV9 enumC975850bV92) {
                                DataChannel dataChannel2;
                                Room roomInfo;
                                C0UVC.LIZJ("MultiMatchStateNoneAudience");
                                C0UVC.LIZLLL = "stateDidEnter";
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("reset fromSource = ");
                                sbLIZ2.append(enumC975850bV92);
                                C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                if (interfaceC975520bUc2 != null) {
                                    InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                    if (interfaceC975520bUc3 != null) {
                                        roomInfo = interfaceC975520bUc3.getRoomInfo();
                                    } else {
                                        roomInfo = null;
                                    }
                                    interfaceC975520bUc2.g3(new C975960bVK(enumC975850bV92, false, roomInfo));
                                }
                                InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                                if (interfaceC975520bUc4 != null && (dataChannel2 = interfaceC975520bUc4.getDataChannel()) != null) {
                                    dataChannel2.zQ2(this);
                                }
                                this.LJI.removeCallbacksAndMessages(null);
                            }

                            @Override // X.InterfaceC975690bUt
                            public final void LJI(EnumC975850bV9 enumC975850bV92) {
                                DataChannel dataChannel2;
                                InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                if (interfaceC975520bUc2 != null && (dataChannel2 = interfaceC975520bUc2.getDataChannel()) != null) {
                                    dataChannel2.zQ2(this);
                                }
                                this.LJI.removeCallbacksAndMessages(null);
                            }

                            public final void LJJIJ(LinkMicBattleMessage linkMicBattleMessage2) {
                                InterfaceC975520bUc interfaceC975520bUc2;
                                Long lValueOf;
                                DataChannel dataChannel2;
                                Room roomLJJLIIIIJ;
                                User owner;
                                C975960bVK c975960bVKM3;
                                C975990bVN c975990bVN;
                                long jLongValue;
                                Room roomInfo;
                                Room roomInfo2;
                                C975960bVK c975960bVKM32;
                                InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                if (interfaceC975520bUc3 != null && (c975960bVKM32 = interfaceC975520bUc3.m3()) != null && c975960bVKM32.LJ == linkMicBattleMessage2.battleId) {
                                    return;
                                }
                                InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                                Integer numValueOf = null;
                                if (interfaceC975520bUc4 != null) {
                                    EnumC975850bV9 enumC975850bV92 = EnumC975850bV9.OPEN_MESSAGE_AUDIENCE;
                                    InterfaceC975520bUc interfaceC975520bUc5 = this.LIZIZ;
                                    if (interfaceC975520bUc5 != null) {
                                        roomInfo2 = interfaceC975520bUc5.getRoomInfo();
                                    } else {
                                        roomInfo2 = null;
                                    }
                                    interfaceC975520bUc4.g3(new C975960bVK(enumC975850bV92, false, roomInfo2));
                                }
                                boolean zLIZ = C959180b4G.LIZ(Integer.valueOf(linkMicBattleMessage2.battleSetting.inviteType));
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("handleOpenMsg  isFromReMatch source:");
                                sbLIZ2.append(zLIZ);
                                C20441214yg.LIZIZ("MatchState", C2188811AlT.LIZIZ(sbLIZ2));
                                C976040bVS.LJJ(linkMicBattleMessage2.leagueInfoMap, linkMicBattleMessage2.leagueScoreInfoMap);
                                LJIJJLI(linkMicBattleMessage2.enigmaBattleSetting);
                                LJIJI(linkMicBattleMessage2.anchorMatchSettings);
                                InterfaceC975520bUc interfaceC975520bUc6 = this.LIZIZ;
                                if ((interfaceC975520bUc6 != null && (roomInfo = interfaceC975520bUc6.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null) || ((interfaceC975520bUc2 = this.LIZIZ) != null && (dataChannel2 = interfaceC975520bUc2.getDataChannel()) != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null)) {
                                    lValueOf = Long.valueOf(owner.getId());
                                } else {
                                    lValueOf = null;
                                }
                                InterfaceC975520bUc interfaceC975520bUc7 = this.LIZIZ;
                                if (interfaceC975520bUc7 != null && (c975960bVKM3 = interfaceC975520bUc7.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
                                    c975990bVN.LIZJ();
                                    if (lValueOf != null) {
                                        jLongValue = lValueOf.longValue();
                                    } else {
                                        jLongValue = 0;
                                    }
                                    c975990bVN.LJI(linkMicBattleMessage2, null, jLongValue);
                                }
                                InterfaceC975520bUc interfaceC975520bUc8 = this.LIZIZ;
                                if (interfaceC975520bUc8 == null) {
                                    return;
                                }
                                BattleSetting battleSetting = linkMicBattleMessage2.battleSetting;
                                if (battleSetting != null) {
                                    numValueOf = Integer.valueOf(battleSetting.battleType);
                                }
                                interfaceC975520bUc8.k3(C918130a03.LIZ(numValueOf));
                            }
                        };
                    case 2:
                        return new C975800bV4<InterfaceC975900bVE>(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage) { // from class: X.0bV7
                            @Override // X.C976040bVS, X.InterfaceC975690bUt
                            public final void LIZLLL(String str) {
                            }

                            @Override // X.C976040bVS, X.InterfaceC975690bUt
                            public final void j3() {
                                InterfaceC975900bVE interfaceC975900bVE = (InterfaceC975900bVE) LJIILJJIL();
                                if (interfaceC975900bVE != null) {
                                    interfaceC975900bVE.LJIIL();
                                }
                                C975800bV4.LJJIIJ(this, EnumC975850bV9.MATCH_PLAYBOOK_CAPABILITY_SHOWN);
                            }

                            @Override // X.C975800bV4, X.InterfaceC975690bUt
                            public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
                                if (!(abstractC1136060ffY instanceof LinkMicBattleMessage)) {
                                    return;
                                }
                                LinkMicBattleMessage linkMicBattleMessage2 = (LinkMicBattleMessage) abstractC1136060ffY;
                                int i = linkMicBattleMessage2.action;
                                if (i != 1) {
                                    if (i == 7) {
                                        LJJI(linkMicBattleMessage2);
                                    }
                                } else {
                                    InterfaceC975900bVE interfaceC975900bVE = (InterfaceC975900bVE) LJIILJJIL();
                                    if (interfaceC975900bVE != null) {
                                        interfaceC975900bVE.LJIIL();
                                    }
                                    LJJI(linkMicBattleMessage2);
                                }
                            }

                            @Override // X.InterfaceC975690bUt
                            public final void LIZJ(EnumC975850bV9 enumC975850bV92) {
                                C0UVC.LIZJ("MatchStatePreparing");
                                C0UVC.LIZLLL = "stateDidEnter";
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("status = ");
                                sbLIZ2.append(this.LIZ);
                                C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                LJJIJ(enumC975850bV92);
                            }

                            @Override // X.InterfaceC975690bUt
                            public final void LJI(EnumC975850bV9 enumC975850bV92) {
                                Boolean boolValueOf;
                                InterfaceC975900bVE interfaceC975900bVE;
                                DataChannel dataChannel2;
                                InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                if (interfaceC975520bUc2 != null && (dataChannel2 = interfaceC975520bUc2.getDataChannel()) != null) {
                                    dataChannel2.zQ2(this);
                                }
                                InterfaceC975900bVE interfaceC975900bVE2 = (InterfaceC975900bVE) LJIILJJIL();
                                if (interfaceC975900bVE2 != null) {
                                    interfaceC975900bVE2.LIZIZ();
                                }
                                InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                if (interfaceC975520bUc3 != null) {
                                    boolValueOf = Boolean.valueOf(interfaceC975520bUc3.d3());
                                } else {
                                    boolValueOf = null;
                                }
                                if (C500260Jjc.LJJJI(boolValueOf) && (interfaceC975900bVE = (InterfaceC975900bVE) LJIILJJIL()) != null) {
                                    interfaceC975900bVE.LJIIZILJ();
                                }
                            }

                            public final void LJJIJ(EnumC975850bV9 enumC975850bV92) {
                                EnumC919170a1j enumC919170a1jLJIIIZ;
                                Boolean boolValueOf;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("showTeamMateSelectPanel, state did Enter ");
                                sbLIZ2.append(this.LIZ);
                                sbLIZ2.append(", fromSource = ");
                                sbLIZ2.append(enumC975850bV92);
                                C20441214yg.LIZIZ("MatchStatePreparing", C2188811AlT.LIZIZ(sbLIZ2));
                                if (LiveMatchDropOffSetting.INSTANCE.isEnable() && C970370bMJ.LJIIIZ() && enumC975850bV92 == EnumC975850bV9.PUNISH_REMATCH_BUTTON_CLICK) {
                                    enumC919170a1jLJIIIZ = EnumC919170a1j.MATCH_TYPE_1V1;
                                } else {
                                    InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                    if (interfaceC975520bUc2 != null) {
                                        enumC919170a1jLJIIIZ = interfaceC975520bUc2.LJIIIZ();
                                    } else {
                                        enumC919170a1jLJIIIZ = null;
                                    }
                                }
                                InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
                                if (interfaceC975810bV5LIZLLL != null) {
                                    GiftMode giftModeLJIIJ = interfaceC975810bV5LIZLLL.LJIIJ();
                                    boolean zLJJIJIIJIL = interfaceC975810bV5LIZLLL.LJJIJIIJIL();
                                    InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                    if (interfaceC975520bUc3 != null) {
                                        boolValueOf = Boolean.valueOf(interfaceC975520bUc3.d3());
                                    } else {
                                        boolValueOf = null;
                                    }
                                    if (C500260Jjc.LJJJI(boolValueOf)) {
                                        if (giftModeLJIIJ != null) {
                                            interfaceC975810bV5LIZLLL.LJJIIJZLJL(giftModeLJIIJ, true, true);
                                        } else {
                                            if (zLJJIJIIJIL) {
                                                interfaceC975810bV5LIZLLL.LJJIIJZLJL(null, true, true);
                                            } else {
                                                interfaceC975810bV5LIZLLL.LJJIIJZLJL(interfaceC975810bV5LIZLLL.LJIJJ(), true, true);
                                                if (interfaceC975810bV5LIZLLL.LJIILJJIL() != 0) {
                                                }
                                            }
                                            interfaceC975810bV5LIZLLL.LJIIJJI(interfaceC975810bV5LIZLLL.LJIL(), true);
                                        }
                                        interfaceC975810bV5LIZLLL.LJIIJJI(1, true);
                                    }
                                    if (LiveMatchReapplyPlaybookAfterMatchEndWithoutRematchSetting.enable()) {
                                        if (giftModeLJIIJ != null) {
                                            interfaceC975810bV5LIZLLL.LJJIIJZLJL(giftModeLJIIJ, true, true);
                                        } else if (zLJJIJIIJIL) {
                                            interfaceC975810bV5LIZLLL.LJJIIJZLJL(null, true, true);
                                        }
                                    }
                                }
                                if (LiveMatchInviterPanelLynxConfigSetting.INSTANCE.isEnabled()) {
                                    if (enumC919170a1jLJIIIZ != null) {
                                        InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                                        if (interfaceC975520bUc4 != null) {
                                            interfaceC975520bUc4.k3(enumC919170a1jLJIIIZ);
                                        }
                                        if (enumC975850bV92 == EnumC975850bV9.PUNISH_REMATCH_BUTTON_CLICK && enumC919170a1jLJIIIZ == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
                                            C975800bV4.LJJIII(this, null, enumC975850bV92, 3);
                                            return;
                                        } else {
                                            LJJIJIIJI(enumC975850bV92, enumC919170a1jLJIIIZ);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                if (enumC919170a1jLJIIIZ != null) {
                                    int i = C975890bVD.LIZ[enumC919170a1jLJIIIZ.ordinal()];
                                    if (i != 1) {
                                        if (i != 2) {
                                            if (i == 3 || i == 4) {
                                                LJJIJIIJI(enumC975850bV92, enumC919170a1jLJIIIZ);
                                                return;
                                            }
                                        } else {
                                            InterfaceC975520bUc interfaceC975520bUc5 = this.LIZIZ;
                                            if (interfaceC975520bUc5 != null) {
                                                interfaceC975520bUc5.k3(EnumC919170a1j.MATCH_TYPE_1V1);
                                            }
                                            LJJIJIIJI(enumC975850bV92, enumC919170a1jLJIIIZ);
                                            return;
                                        }
                                    } else {
                                        InterfaceC975520bUc interfaceC975520bUc6 = this.LIZIZ;
                                        if (interfaceC975520bUc6 != null) {
                                            interfaceC975520bUc6.k3(EnumC919170a1j.MATCH_TYPE_INDIVIDUAL);
                                        }
                                        if (enumC975850bV92 == null) {
                                            enumC975850bV92 = EnumC975850bV9.MATCH_MODE_CONFIRM_CLICK;
                                        }
                                        C975800bV4.LJJIII(this, null, enumC975850bV92, 3);
                                        return;
                                    }
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("error dispatch logic, currentType = ");
                                sbLIZ3.append(enumC919170a1jLJIIIZ);
                                C20441214yg.LJ("MatchStatePreparing", C2188811AlT.LIZIZ(sbLIZ3));
                            }

                            @Override // X.C975800bV4, X.InterfaceC975690bUt
                            public final void h3(String str) {
                                super.h3(str);
                                LJJIJ(EnumC975850bV9.MATCH_ICON_CLICK);
                            }

                            @Override // X.C976040bVS, X.InterfaceC975690bUt
                            public final void LJIIL(List list, List list2) {
                                InterfaceC975900bVE interfaceC975900bVE = (InterfaceC975900bVE) LJIILJJIL();
                                if (interfaceC975900bVE != null) {
                                    interfaceC975900bVE.LJIIL();
                                }
                                C975800bV4.LJJIIJ(this, EnumC975850bV9.HOSTS_LIST_CHANGED);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJJIJIIJI(X.EnumC975850bV9 r10, X.EnumC919170a1j r11) {
                                /*
                                    r9 = this;
                                    r3 = r9
                                    X.0bUc r0 = r3.LIZIZ
                                    if (r0 == 0) goto L8
                                    r0.getDataChannel()
                                L8:
                                    X.0bUc r0 = r3.LIZIZ
                                    r2 = 0
                                    if (r0 == 0) goto L79
                                    boolean r0 = r0.d3()
                                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                                L15:
                                    boolean r0 = X.C500260Jjc.LJJJI(r0)
                                    X.C918250a0F.LIZ(r0)
                                    com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r6 = X.C978520bZS.LJII()
                                    X.0bUc r0 = r3.LIZIZ
                                    if (r0 == 0) goto L2d
                                    X.0bVK r0 = r0.m3()
                                    if (r0 == 0) goto L2d
                                    r0.LJJLJ(r6)
                                L2d:
                                    X.0bSt r0 = X.C973890bRz.LIZ
                                    r0.LJJLJ(r6)
                                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                    java.lang.String r0 = "selected gift mode = "
                                    r1.append(r0)
                                    if (r6 == 0) goto L3f
                                    java.lang.String r2 = r6.giftName
                                L3f:
                                    r1.append(r2)
                                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                                    java.lang.String r0 = "MatchStatePreparing"
                                    X.C20441214yg.LIZIZ(r0, r1)
                                    r5 = r10
                                    if (r5 == 0) goto L62
                                    int[] r1 = X.C975890bVD.LIZIZ
                                    int r0 = r5.ordinal()
                                    r1 = r1[r0]
                                    r0 = 1
                                    if (r1 == r0) goto L76
                                    r0 = 2
                                    if (r1 == r0) goto L76
                                    r0 = 3
                                    if (r1 == r0) goto L73
                                    r0 = 4
                                    if (r1 == r0) goto L73
                                L62:
                                    X.0bTk r4 = X.EnumC974980bTk.INVITE
                                L64:
                                    kotlin.jvm.internal.AwS76S0500000_15 r2 = new kotlin.jvm.internal.AwS76S0500000_15
                                    r8 = 5
                                    r7 = r11
                                    r2.<init>(r3, r4, r5, r6, r7, r8)
                                    X.0bV9 r0 = X.EnumC975850bV9.INVITER_FROM_FRIEND_RANK
                                    if (r5 != r0) goto L7b
                                    X.C156000ik.LIZ(r2)
                                    return
                                L73:
                                    X.0bTk r4 = X.EnumC974980bTk.WITHDRAW
                                    goto L64
                                L76:
                                    X.0bTk r4 = X.EnumC974980bTk.REJECT
                                    goto L64
                                L79:
                                    r0 = r2
                                    goto L15
                                L7b:
                                    r2.invoke()
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C975830bV7.LJJIJIIJI(X.0bV9, X.0a1j):void");
                            }

                            @Override // X.C975800bV4, X.InterfaceC975690bUt
                            public final void f3(int i, boolean z) {
                                super.f3(i, z);
                                LJJIJ(EnumC975850bV9.GUIDE_CAPSULE_CLICK);
                            }
                        };
                    case 3:
                        return new C976050bVT(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage, enumC975850bV9);
                    case 4:
                    case 5:
                        return new C976030bVR(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage);
                    case 6:
                        if (this.LIZ) {
                            return new C975980bVM(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage, battleInfoResponse);
                        }
                        return new C976010bVP(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage, battleInfoResponse);
                    case 7:
                        if (this.LIZ) {
                            return new C975970bVL(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage, battleInfoResponse) { // from class: X.0bVX
                                public final BattleInfoResponse LJIILL;

                                @Override // X.C975970bVL, X.C975800bV4, X.InterfaceC975690bUt
                                public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
                                    if (!(abstractC1136060ffY instanceof LinkMicBattleMessage)) {
                                        return;
                                    }
                                    super.LIZ(abstractC1136060ffY);
                                    LinkMicBattleMessage linkMicBattleMessage2 = (LinkMicBattleMessage) abstractC1136060ffY;
                                    if (linkMicBattleMessage2.action == 5) {
                                        C974540bT2.LIZ.LJJJLZIJ(linkMicBattleMessage2);
                                    }
                                }

                                @Override // X.InterfaceC975690bUt
                                public final void LIZJ(EnumC975850bV9 enumC975850bV92) {
                                    BattleSetting battleSetting;
                                    MutableLiveData<List<C976480bWA>> mutableLiveData;
                                    List<C976480bWA> value;
                                    C976480bWA next;
                                    DataChannel dataChannel2;
                                    C970290bMB.LJIJ(LiveCenterMockToolSwitch.PUNISH);
                                    if (enumC975850bV92 == EnumC975850bV9.TIME_OVER_SETTLEMENT) {
                                        C976230bVl.LIZ(this, (InterfaceC976360bVy) LJIILJJIL(), 106, false, 0L, 0, 0L, 112);
                                    } else {
                                        LinkMicBattleMessage linkMicBattleMessage2 = this.LIZLLL;
                                        if (linkMicBattleMessage2 != null) {
                                            if (linkMicBattleMessage2.action == 5) {
                                                List<BattleTeamResult> list = linkMicBattleMessage2.teamBattleResult;
                                                if (list != null) {
                                                    InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                                    if (interfaceC975520bUc2 != null) {
                                                        dataChannel2 = interfaceC975520bUc2.getDataChannel();
                                                    } else {
                                                        dataChannel2 = null;
                                                    }
                                                    C974480bSw.LJJ(dataChannel2, list, this.LJIIIZ, EnumC976420bW4.MSG_FINISH, true);
                                                }
                                                C975960bVK c975960bVK = this.LJII;
                                                if (c975960bVK != null) {
                                                    c975960bVK.LJJIJIIJI = linkMicBattleMessage2.battleCombos;
                                                }
                                                List<BattleTeamUserArmies> list2 = linkMicBattleMessage2.teamArmies;
                                                if (list2 != null) {
                                                    for (BattleTeamUserArmies battleTeamUserArmies : list2) {
                                                        C975960bVK c975960bVK2 = this.LJII;
                                                        if (c975960bVK2 != null && (mutableLiveData = c975960bVK2.LJJJLIIL) != null && (value = mutableLiveData.getValue()) != null) {
                                                            Iterator<C976480bWA> it2 = value.iterator();
                                                            while (true) {
                                                                if (it2.hasNext()) {
                                                                    next = it2.next();
                                                                    Long l = battleTeamUserArmies.teamId;
                                                                    long j = next.LIZ;
                                                                    if (l != null && l.longValue() == j) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    next = null;
                                                                    break;
                                                                }
                                                            }
                                                            C976480bWA c976480bWA = next;
                                                            if (c976480bWA != null) {
                                                                c976480bWA.LIZLLL = battleTeamUserArmies.hostRank;
                                                            }
                                                        }
                                                    }
                                                }
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("combo = ");
                                                sbLIZ2.append(linkMicBattleMessage2.battleCombos);
                                                C20441214yg.LIZIZ("ComboTEst", C2188811AlT.LIZIZ(sbLIZ2));
                                                C976070bVV.LIZ(this, 1, C125500dp.LIZ(linkMicBattleMessage2), 0L, linkMicBattleMessage2.battleSetting.status, -1L);
                                                C974540bT2 c974540bT2 = C974540bT2.LIZ;
                                                C970370bMJ.LJII();
                                                JSONObject jSONObject = new JSONObject();
                                                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                                                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                                                c917350Zyn.getClass();
                                                C0K04.LJFF("match_type", C917350Zyn.LIZJ(enumC919170a1jXB0), jSONObject);
                                                C0K04.LJFF("finish_reason", "normal_finish_message", jSONObject);
                                                C0K04.LIZLLL(1, "is_normal_finish", jSONObject);
                                                C974540bT2.LLIIIILZ(c974540bT2, "battle_finished_timing", jSONObject, 12);
                                            }
                                            if (linkMicBattleMessage2.action == 6 && C976040bVS.LJIIJ(this, linkMicBattleMessage2.battleId)) {
                                                LJJIJ("cut_short_msg", false);
                                            }
                                        }
                                        BattleInfoResponse battleInfoResponse2 = this.LJIILL;
                                        if (battleInfoResponse2 != null && (battleSetting = battleInfoResponse2.setting) != null && battleSetting.status == 3) {
                                            LJJJJJL();
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("settlement deal resume battleInfo, battleInfoResponse = ");
                                            sbLIZ3.append(battleInfoResponse2);
                                            C20441214yg.LIZIZ("MultiMatchStateSettling", C2188811AlT.LIZIZ(sbLIZ3));
                                            C975960bVK c975960bVK3 = this.LJII;
                                            if (c975960bVK3 != null) {
                                                c975960bVK3.LJJIJIIJI = battleInfoResponse2.battleCombos;
                                                c975960bVK3.LJJIIZI = LJIILIIL();
                                            }
                                            C976070bVV.LIZ(this, 2, C125500dp.LIZIZ(battleInfoResponse2), 0L, 3, -1L);
                                        }
                                    }
                                    LJJJJIZL("MultiMatchStateSettling");
                                }

                                @Override // X.C975970bVL, X.InterfaceC975690bUt
                                public final void LJI(EnumC975850bV9 enumC975850bV92) {
                                    InterfaceC976360bVy interfaceC976360bVy;
                                    super.LJI(enumC975850bV92);
                                    if (enumC975850bV92 == EnumC975850bV9.DRAW_FROM_FINISH_REQUEST && (interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL()) != null) {
                                        interfaceC976360bVy.LJIIL();
                                    }
                                    this.LJIIJ.removeCallbacksAndMessages(null);
                                }

                                {
                                    this.LJIILL = battleInfoResponse;
                                }
                            };
                        }
                        return new C976000bVO(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage, battleInfoResponse);
                    case 8:
                        return new C975950bVJ(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage, battleInfoResponse);
                    case BdTuring.TYPE_ECAF /* 9 */:
                        final InterfaceC977310bXV interfaceC977310bXV = this.LIZIZ;
                        return new C975970bVL(enumC964170bCJ, interfaceC975520bUc, interfaceC977310bXV, linkMicBattleMessage, battleInfoResponse) { // from class: X.0bVm
                            public final BPEAHandler LJIILL = new BPEAHandler(Looper.getMainLooper());

                            /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
                            @Override // X.InterfaceC975690bUt
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZJ(X.EnumC975850bV9 r12) {
                                /*
                                    r11 = this;
                                    X.0bVK r0 = r11.LJII
                                    if (r0 == 0) goto L65
                                    long r9 = r0.LJJJJJ()
                                L8:
                                    X.0bVK r0 = r11.LJII
                                    r8 = 0
                                    r6 = 0
                                    if (r0 == 0) goto L62
                                    androidx.lifecycle.MutableLiveData<java.util.List<X.0bWA>> r0 = r0.LJJJLIIL
                                    if (r0 == 0) goto L62
                                    java.lang.Object r0 = r0.getValue()
                                    java.util.List r0 = (java.util.List) r0
                                    if (r0 == 0) goto L62
                                    java.util.Iterator r4 = r0.iterator()
                                L1f:
                                    boolean r0 = r4.hasNext()
                                    if (r0 == 0) goto L60
                                    java.lang.Object r3 = r4.next()
                                    r0 = r3
                                    X.0bWA r0 = (X.C976480bWA) r0
                                    long r1 = r0.LIZ
                                    int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                                    if (r0 != 0) goto L1f
                                L32:
                                    X.0bWA r3 = (X.C976480bWA) r3
                                    if (r3 == 0) goto L62
                                    long r4 = r3.LIZJ
                                L38:
                                    X.0bUc r0 = r11.LIZIZ
                                    if (r0 == 0) goto L44
                                    boolean r0 = r0.isAnchor()
                                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
                                L44:
                                    boolean r0 = X.C500260Jjc.LJJIJIIJIL(r8)
                                    if (r0 == 0) goto L5c
                                    com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = r11.LJIILL
                                    Y.ARunnableS115S0100000_15 r2 = new Y.ARunnableS115S0100000_15
                                    r0 = 156(0x9c, float:2.19E-43)
                                    r2.<init>(r11, r0)
                                    int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                                    if (r0 <= 0) goto L5d
                                    r0 = 10000(0x2710, double:4.9407E-320)
                                L59:
                                    X.C786410Ut5.LJLIIL(r0, r3, r2)
                                L5c:
                                    return
                                L5d:
                                    r0 = 4000(0xfa0, double:1.9763E-320)
                                    goto L59
                                L60:
                                    r3 = r8
                                    goto L32
                                L62:
                                    r4 = 0
                                    goto L38
                                L65:
                                    com.bytedance.android.livesdkapi.depend.model.live.Room r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt.LJJIII()
                                    if (r0 == 0) goto L70
                                    long r9 = r0.getOwnerUserId()
                                    goto L8
                                L70:
                                    r9 = 1
                                    goto L8
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C976240bVm.LIZJ(X.0bV9):void");
                            }
                        };
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        return new C975800bV4<InterfaceC976950bWv>(enumC964170bCJ, interfaceC975520bUc, this.LIZIZ, linkMicBattleMessage) { // from class: X.0bV6
                            public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());

                            @Override // X.InterfaceC975690bUt
                            public final void LIZJ(EnumC975850bV9 enumC975850bV92) {
                                BattleTeamResult battleTeamResult;
                                Boolean boolValueOf;
                                Long lValueOf;
                                C975960bVK c975960bVKM3;
                                C975960bVK c975960bVKM32;
                                C975960bVK c975960bVKM33;
                                MatchPunishEffectInfo.EffectStruct effectStruct;
                                C975960bVK c975960bVKM34;
                                InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                if (interfaceC975520bUc2 != null && (c975960bVKM33 = interfaceC975520bUc2.m3()) != null && (effectStruct = c975960bVKM33.LJJZ) != null) {
                                    C978440bZK.LJIIJ(String.valueOf(effectStruct.effectResourceId), LiveMatchVictoryLapFunnyEffectApplySetting.INSTANCE.getValue());
                                    InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                    if (interfaceC975520bUc3 != null && (c975960bVKM34 = interfaceC975520bUc3.m3()) != null) {
                                        c975960bVKM34.LJJZ = null;
                                    }
                                }
                                InterfaceC976950bWv interfaceC976950bWv = (InterfaceC976950bWv) LJIILJJIL();
                                if (interfaceC976950bWv != null) {
                                    interfaceC976950bWv.LJI();
                                }
                                C978500bZQ.LIZJ();
                                C974450bSt c974450bSt = C973890bRz.LIZ;
                                InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                                if (interfaceC975520bUc4 != null && (c975960bVKM32 = interfaceC975520bUc4.m3()) != null) {
                                    battleTeamResult = c975960bVKM32.LJJIJIIJIL;
                                } else {
                                    battleTeamResult = null;
                                }
                                C973890bRz.LJ = battleTeamResult;
                                ((IMatchViolationEventHelper) C1161920gLG.LIZJ(IMatchViolationEventHelper.class)).resetMatchOnViolation();
                                C786410Ut5.LJLIIL(400L, this.LJI, new ARunnableS84S0200000_15(this, enumC975850bV92, 49));
                                InterfaceC975520bUc interfaceC975520bUc5 = this.LIZIZ;
                                if (interfaceC975520bUc5 != null) {
                                    boolValueOf = Boolean.valueOf(interfaceC975520bUc5.isAnchor());
                                } else {
                                    boolValueOf = null;
                                }
                                if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                                    InterfaceC975520bUc interfaceC975520bUc6 = this.LIZIZ;
                                    if (interfaceC975520bUc6 != null && (c975960bVKM3 = interfaceC975520bUc6.m3()) != null) {
                                        lValueOf = Long.valueOf(c975960bVKM3.LJ);
                                    } else {
                                        lValueOf = null;
                                    }
                                    C973890bRz.LIZ(lValueOf);
                                }
                                C389001fE.LIZ("LiveMatchDidFinishEvent", null, System.currentTimeMillis(), false);
                                if (enumC975850bV92 != EnumC975850bV9.DRAW_REMATCH_BUTTON_CLICK && !LiveMatchReapplyPlaybookAfterMatchEndWithoutRematchSetting.enable() && C915980Zwa.LJFF().RY(true).compareTo(EnumC964170bCJ.RECEIVED) < 0) {
                                    InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
                                    if (interfaceC975810bV5LIZLLL != null) {
                                        interfaceC975810bV5LIZLLL.LJJIIJZLJL(null, true, true);
                                        interfaceC975810bV5LIZLLL.LJIJJLI();
                                        interfaceC975810bV5LIZLLL.LJIJ();
                                    }
                                    C978520bZS.LJIJJLI(null);
                                }
                                C978340bZA.LIZ = null;
                                C978340bZA.LIZIZ = null;
                                C978340bZA.LIZJ = null;
                            }

                            @Override // X.InterfaceC975690bUt
                            public final void LJI(EnumC975850bV9 enumC975850bV92) {
                                Integer numValueOf;
                                Boolean boolValueOf;
                                C975960bVK c975960bVKM3;
                                Function0<Unit> function0LJJII;
                                C975960bVK c975960bVKM32;
                                C975960bVK c975960bVKM33;
                                Function0<Unit> function0;
                                C975960bVK c975960bVKM34;
                                C975960bVK c975960bVKM35;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("stateWillLeave, punishFinishReason = ");
                                InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                                Integer numValueOf2 = null;
                                if (interfaceC975520bUc2 != null && (c975960bVKM35 = interfaceC975520bUc2.m3()) != null) {
                                    numValueOf = Integer.valueOf(c975960bVKM35.LJJI);
                                } else {
                                    numValueOf = null;
                                }
                                sbLIZ2.append(numValueOf);
                                sbLIZ2.append(", shouldTriggerCallback = ");
                                InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                                if (interfaceC975870bVBLJFF != null) {
                                    boolValueOf = Boolean.valueOf(interfaceC975870bVBLJFF.LJIJ());
                                } else {
                                    boolValueOf = null;
                                }
                                sbLIZ2.append(boolValueOf);
                                C20441214yg.LIZIZ("MultiMatchStateEnd", C2188811AlT.LIZIZ(sbLIZ2));
                                InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                                if (interfaceC975520bUc3 != null && (c975960bVKM32 = interfaceC975520bUc3.m3()) != null && c975960bVKM32.LJJI == 2) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("stateWillLeave, punishFinishReason = ");
                                    InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                                    if (interfaceC975520bUc4 != null && (c975960bVKM34 = interfaceC975520bUc4.m3()) != null) {
                                        numValueOf2 = Integer.valueOf(c975960bVKM34.LJJI);
                                    }
                                    sbLIZ3.append(numValueOf2);
                                    sbLIZ3.append(", invoking callback");
                                    C20441214yg.LIZIZ("MultiMatchStateEnd", C2188811AlT.LIZIZ(sbLIZ3));
                                    InterfaceC975520bUc interfaceC975520bUc5 = this.LIZIZ;
                                    if (interfaceC975520bUc5 != null && (c975960bVKM33 = interfaceC975520bUc5.m3()) != null && (function0 = c975960bVKM33.LJJLJ) != null) {
                                        function0.invoke();
                                    }
                                } else {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("stateWillLeave, punishFinishReason = ");
                                    InterfaceC975520bUc interfaceC975520bUc6 = this.LIZIZ;
                                    if (interfaceC975520bUc6 != null && (c975960bVKM3 = interfaceC975520bUc6.m3()) != null) {
                                        numValueOf2 = Integer.valueOf(c975960bVKM3.LJJI);
                                    }
                                    sbLIZ4.append(numValueOf2);
                                    sbLIZ4.append(", not invoking callback");
                                    C20441214yg.LIZIZ("MultiMatchStateEnd", C2188811AlT.LIZIZ(sbLIZ4));
                                }
                                InterfaceC975870bVB interfaceC975870bVBLJFF2 = C915980Zwa.LJI().LJFF();
                                if (interfaceC975870bVBLJFF2 != null) {
                                    if (interfaceC975870bVBLJFF2.LJIJ() && (function0LJJII = interfaceC975870bVBLJFF2.LJJII()) != null) {
                                        function0LJJII.invoke();
                                    }
                                    interfaceC975870bVBLJFF2.LJFF(false);
                                    interfaceC975870bVBLJFF2.LJIJJLI(AFwS203S0000000_15.get$arr$(331));
                                }
                            }
                        };
                    default:
                        throw new C1954807lC();
                }
            }
        };
        C915980Zwa.LJFF().mC1(C500260Jjc.LJJLIIIIJ(this.LJII), this);
        C974690bTH c974690bTH = new C974690bTH(this.LJII);
        this.LIZLLL = c974690bTH;
        c974690bTH.LIZJ(this.LJII);
        C976100bVY c976100bVY = this.LIZIZ;
        if (c976100bVY != null) {
            C975680bUs c975680bUs = new C975680bUs(zLJIIZILJ, c976100bVY, this.LJII, this, false);
            c975680bUs.g3(new C975960bVK(EnumC975850bV9.INITIALIZE, zLJIIZILJ, C500260Jjc.LJJLIIIIJ(this.LJII)));
            this.LJ = c975680bUs;
        }
        c974690bTH.LLILLL = new InterfaceC952160asw() { // from class: X.0bUb
            @Override // X.InterfaceC952160asw
            public final void LIZ(LinkMicBattleArmiesMessage linkMicBattleArmiesMessage) {
                Long lValueOf;
                C975550bUf c975550bUf;
                C975960bVK c975960bVKM3;
                C975500bUa c975500bUa = this.LIZ;
                InterfaceC975520bUc interfaceC975520bUc = c975500bUa.LJ;
                Long lValueOf2 = null;
                if (interfaceC975520bUc != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null) {
                    lValueOf = Long.valueOf(c975960bVKM3.LJ);
                } else {
                    lValueOf = null;
                }
                if (linkMicBattleArmiesMessage != null) {
                    lValueOf2 = Long.valueOf(linkMicBattleArmiesMessage.battleId);
                }
                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    if (linkMicBattleArmiesMessage != null && linkMicBattleArmiesMessage.triggerReason == EnumC975300bUG.KEEP_ALIVE.getValue()) {
                        return;
                    }
                    InterfaceC975520bUc interfaceC975520bUc2 = c975500bUa.LJ;
                    if (interfaceC975520bUc2 != null) {
                        interfaceC975520bUc2.q3(linkMicBattleArmiesMessage);
                    }
                    if (linkMicBattleArmiesMessage == null || (c975550bUf = c975500bUa.LJI) == null) {
                        return;
                    }
                    c975550bUf.LJII(linkMicBattleArmiesMessage);
                }
            }

            @Override // X.InterfaceC952160asw
            public final void LIZIZ(AbstractC1136060ffY abstractC1136060ffY) {
                InterfaceC975520bUc interfaceC975520bUc;
                C975960bVK c975960bVKM3;
                int i;
                MatchPunishEffectInfo matchPunishEffectInfo;
                C975960bVK c975960bVKM32;
                BattleSetting battleSetting;
                C975500bUa c975500bUa = this.LIZ;
                c975500bUa.getClass();
                if (abstractC1136060ffY instanceof LinkMicBattleMessage) {
                    LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) abstractC1136060ffY;
                    BattleSetting battleSetting2 = linkMicBattleMessage.battleSetting;
                    if (battleSetting2 != null && battleSetting2.battleType == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL.getType()) {
                        c975500bUa.LJIJJLI(linkMicBattleMessage);
                    }
                    BattleSetting battleSetting3 = linkMicBattleMessage.battleSetting;
                    if ((battleSetting3 != null && battleSetting3.battleType == EnumC919170a1j.MATCH_TYPE_2V2.getType()) || ((battleSetting = linkMicBattleMessage.battleSetting) != null && battleSetting.battleType == EnumC919170a1j.MATCH_TYPE_1VN.getType())) {
                        c975500bUa.LJIJJLI(linkMicBattleMessage);
                    }
                    BattleSetting battleSetting4 = linkMicBattleMessage.battleSetting;
                    if (battleSetting4 != null && battleSetting4.battleType == EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
                        c975500bUa.LJIJJLI(linkMicBattleMessage);
                    }
                }
                if (abstractC1136060ffY instanceof LinkMicBattlePunishFinishMessage) {
                    LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage = (LinkMicBattlePunishFinishMessage) abstractC1136060ffY;
                    MatchPunishExtraInfo matchPunishExtraInfo = linkMicBattlePunishFinishMessage.matchPunishExtraInfo;
                    if (matchPunishExtraInfo != null && (matchPunishEffectInfo = matchPunishExtraInfo.matchPunishEffectInfo) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("victoryLapEffect, Battle FINISH message contains effect: ");
                        sbLIZ.append(matchPunishEffectInfo);
                        C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
                        long jLJFF = C950220apo.LJFF();
                        if (matchPunishEffectInfo.userToEffectMap.containsKey(Long.valueOf(jLJFF))) {
                            MatchPunishEffectInfo.EffectStruct effectStruct = matchPunishEffectInfo.effectToEffectStructMap.get(matchPunishEffectInfo.userToEffectMap.get(Long.valueOf(jLJFF)));
                            if (effectStruct != null) {
                                C978440bZK.LJIIJ(String.valueOf(effectStruct.effectResourceId), LiveMatchVictoryLapFunnyEffectApplySetting.INSTANCE.getValue());
                            }
                            InterfaceC975520bUc interfaceC975520bUc2 = c975500bUa.LJ;
                            if (interfaceC975520bUc2 != null && (c975960bVKM32 = interfaceC975520bUc2.m3()) != null) {
                                c975960bVKM32.LJJZ = null;
                            }
                        }
                    }
                    InterfaceC975520bUc interfaceC975520bUc3 = c975500bUa.LJ;
                    if (interfaceC975520bUc3 != null && (c975960bVKM3 = interfaceC975520bUc3.m3()) != null) {
                        if (LiveMockRematchRecommendBattle.INSTANCE.getValue() != 0) {
                            i = 2;
                        } else {
                            i = linkMicBattlePunishFinishMessage.reason;
                        }
                        c975960bVKM3.LJJI = i;
                    }
                    InterfaceC975520bUc interfaceC975520bUc4 = c975500bUa.LJ;
                    if (interfaceC975520bUc4 != null) {
                        interfaceC975520bUc4.q3(linkMicBattlePunishFinishMessage);
                    }
                    C975550bUf c975550bUf = c975500bUa.LJI;
                    if (c975550bUf != null) {
                        c975550bUf.LJII(linkMicBattlePunishFinishMessage);
                    }
                }
                if (abstractC1136060ffY instanceof BattleGameplayMessage) {
                    InterfaceC975520bUc interfaceC975520bUc5 = c975500bUa.LJ;
                    if (interfaceC975520bUc5 != null) {
                        interfaceC975520bUc5.q3(abstractC1136060ffY);
                    }
                    C975550bUf c975550bUf2 = c975500bUa.LJI;
                    if (c975550bUf2 != null) {
                        c975550bUf2.LJII(abstractC1136060ffY);
                    }
                }
                if ((abstractC1136060ffY instanceof BattleAICommentaryMessage) && (interfaceC975520bUc = c975500bUa.LJ) != null) {
                    interfaceC975520bUc.q3(abstractC1136060ffY);
                }
            }
        };
        int size = C915980Zwa.LJII().LJJIJ().size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init isAnchor = ");
        sbLIZ.append(zLJIIZILJ);
        sbLIZ.append(" dataChannel = ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(" matchEngine = ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" interactiveModeComponentManager = ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(" coHostLinkedUserCount = ");
        sbLIZ.append(size);
        C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled() || !zLJIIZILJ || size >= 2) {
            LJIIL();
        }
        DataChannel dataChannel2 = this.LJII;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(matchBaseWidget, PlayerCalculateFinishMessage.class, AFwS250S0000000_15.get$arr$(14));
        }
        DataChannel dataChannel3 = this.LJII;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(MatchPlaybookCapabilityShowEvent.class, this, new AwS594S0100000_15(this, 19));
            dataChannel3.CQ2(NewLayoutWindowStateChangeMessage.class, this, new AwS594S0100000_15(this, 20));
        }
    }

    public final C975960bVK LJIIJ(boolean z) {
        InterfaceC975520bUc interfaceC975520bUc;
        if (!z) {
            interfaceC975520bUc = this.LJ;
            if (interfaceC975520bUc == null) {
                return null;
            }
        } else {
            interfaceC975520bUc = this.LJFF;
            if (interfaceC975520bUc == null) {
                return null;
            }
        }
        return interfaceC975520bUc.m3();
    }

    public final void LJIILLIIL(C975600bUk c975600bUk) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBattleRequestEvent, inviteType: ");
        sbLIZ.append(c975600bUk.LIZIZ);
        sbLIZ.append(", sourceType: ");
        sbLIZ.append(c975600bUk.LJI.LIZ);
        C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC975520bUc interfaceC975520bUc = this.LJ;
        if (interfaceC975520bUc != null) {
            interfaceC975520bUc.e3(c975600bUk);
        }
    }

    public final void LJIJI(String str) {
        boolean z;
        EnumC964170bCJ enumC964170bCJ;
        C0UVC.LIZJ("LiveMatchManager");
        C0UVC.LIZLLL = "onMatchIconClick";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matchEngine is null = ");
        if (this.LJ == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" clickFrom = ");
        sbLIZ.append(str);
        C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C975680bUs c975680bUs = this.LJFF;
        if (c975680bUs == null || (enumC964170bCJ = c975680bUs.LJIIJJI) == null) {
            enumC964170bCJ = EnumC964170bCJ.NONE;
        }
        if (enumC964170bCJ.compareTo(EnumC964170bCJ.NONE) > 0) {
            C975680bUs c975680bUs2 = this.LJFF;
            if (c975680bUs2 != null) {
                c975680bUs2.h3(str);
                return;
            }
            return;
        }
        InterfaceC975520bUc interfaceC975520bUc = this.LJ;
        if (interfaceC975520bUc == null) {
            return;
        }
        interfaceC975520bUc.h3(str);
    }

    public final void LJIJJLI(LinkMicBattleMessage linkMicBattleMessage) {
        Integer numValueOf;
        boolean z;
        boolean z2;
        CohostContentGuideInfo cohostContentGuideInfo;
        C975960bVK c975960bVKM3;
        MatchPunishExtraInfo matchPunishExtraInfo;
        MatchPunishEffectInfo matchPunishEffectInfo;
        String str;
        String str2;
        String string;
        String string2;
        Playbook playbook;
        C499701x5 c499701x5;
        Set<ActivePlaybook> set;
        C975960bVK c975960bVKM32;
        C955010axX c955010axXI30;
        C956040azC c956040azCLJI;
        CohostTypeLayoutExtra cohostTypeLayoutExtra;
        BattleSetting battleSetting;
        ActivePlaybook activePlaybook = null;
        if (linkMicBattleMessage != null) {
            numValueOf = Integer.valueOf(linkMicBattleMessage.action);
        } else {
            numValueOf = null;
        }
        if (linkMicBattleMessage != null && (battleSetting = linkMicBattleMessage.battleSetting) != null && battleSetting.inviteType == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z && numValueOf != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 3 || numValueOf.intValue() == 2 || numValueOf.intValue() == 7)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceiveBattleMessage, ignore team pair single room invite message: ");
            sbLIZ.append(linkMicBattleMessage);
            C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!this.LIZJ && !C950220apo.LJIJI() && linkMicBattleMessage.action == 4 && (c955010axXI30 = C915980Zwa.LJII().i30()) != null && (c956040azCLJI = c955010axXI30.LJI()) != null && (cohostTypeLayoutExtra = c956040azCLJI.LIZLLL) != null && cohostTypeLayoutExtra.disableMatchComponent) {
            C20441214yg.LJ("LiveMatchManager", "onReceiveBattleMessage, ignore open message in enlarge layout, wait sei to load match component");
            return;
        }
        if (linkMicBattleMessage.action == 5 && (matchPunishExtraInfo = linkMicBattleMessage.matchPunishExtraInfo) != null && (matchPunishEffectInfo = matchPunishExtraInfo.matchPunishEffectInfo) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("victoryLapEffect, message contains effect info ");
            sbLIZ2.append(matchPunishEffectInfo);
            C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ2));
            long jLJFF = C950220apo.LJFF();
            if (matchPunishEffectInfo.userToEffectMap.containsKey(Long.valueOf(jLJFF))) {
                C0UEA liveEffectController = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectController();
                Long l = matchPunishEffectInfo.userToEffectMap.get(Long.valueOf(jLJFF));
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1316905Dj(LiveMatchVictoryLapFunnyEffectApplySetting.INSTANCE.getValue(), l, liveEffectController, null), 3);
                InterfaceC975520bUc interfaceC975520bUc = this.LJ;
                if (interfaceC975520bUc != null && (c975960bVKM32 = interfaceC975520bUc.m3()) != null) {
                    c975960bVKM32.LJJZ = matchPunishEffectInfo.effectToEffectStructMap.get(l);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("victoryLapEffect, Added effectId ");
                sbLIZ3.append(l);
                sbLIZ3.append(" to match model");
                C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ3));
            }
            Map.Entry entry = (Map.Entry) C13LP.LJJJLIIL(matchPunishEffectInfo.userToEffectMap.entrySet());
            if (entry != null) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                long jLongValue2 = ((Number) entry.getValue()).longValue();
                DataChannel dataChannel = this.LJII;
                if (dataChannel != null && (c499701x5 = (C499701x5) dataChannel.gg0(ActivePlaybookChannel.class)) != null && (set = c499701x5.LIZ) != null) {
                    activePlaybook = (ActivePlaybook) C13LP.LJJJLIIL(set);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C974350bSj.LIZ(linkedHashMap);
                if (C915980Zwa.LIZLLL().J8()) {
                    str = "host";
                } else {
                    str = "user";
                }
                linkedHashMap.put("user_type", str);
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                int size = C915980Zwa.LJII().LLILZLL(true).size();
                int i = C917470Zyz.LIZ[enumC919170a1jXB0.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                str2 = "";
                            } else if (size == 3) {
                                str2 = "1v2";
                            } else {
                                str2 = "1v3";
                            }
                        } else if (size == 3) {
                            str2 = "1v1v1v1";
                        } else {
                            str2 = "1v1v1v1v1";
                        }
                    } else {
                        str2 = "2v2";
                    }
                } else {
                    str2 = "1v1";
                }
                linkedHashMap.put("sub_match_type", str2);
                linkedHashMap.put("punish_anchor_id", String.valueOf(jLongValue));
                if (activePlaybook == null || (playbook = activePlaybook.playbook) == null || (string = Long.valueOf(playbook.playbookId).toString()) == null) {
                    string = "";
                }
                linkedHashMap.put("playbook_id", string);
                if (activePlaybook == null || (string2 = Long.valueOf(activePlaybook.playId).toString()) == null) {
                    string2 = "";
                }
                linkedHashMap.put("play_id", string2);
                linkedHashMap.put("effect_id", String.valueOf(jLongValue2));
                C974350bSj.LJII("livesdk_pk_punish_effect_show", linkedHashMap);
            }
        }
        if (linkMicBattleMessage.action == 5) {
            int value = LiveMockRematchRecommendBattle.INSTANCE.getValue();
            if (value != 0) {
                cohostContentGuideInfo = new CohostContentGuideInfo();
                cohostContentGuideInfo.recommendedBattleType = value;
            } else {
                MatchPunishExtraInfo matchPunishExtraInfo2 = linkMicBattleMessage.matchPunishExtraInfo;
                if (matchPunishExtraInfo2 != null) {
                    cohostContentGuideInfo = matchPunishExtraInfo2.cohostContentGuideInfo;
                } else {
                    cohostContentGuideInfo = null;
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("updateContentGuideInfo, guideInfo = ");
            sbLIZ4.append(cohostContentGuideInfo);
            C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ4));
            InterfaceC975520bUc interfaceC975520bUc2 = this.LJ;
            if (interfaceC975520bUc2 != null && (c975960bVKM3 = interfaceC975520bUc2.m3()) != null) {
                c975960bVKM3.LJJLIL = cohostContentGuideInfo;
            }
        }
        switch (linkMicBattleMessage.action) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
                InterfaceC975520bUc interfaceC975520bUcLJIIJJI = LJIIJJI();
                if (interfaceC975520bUcLJIIJJI != null) {
                    interfaceC975520bUcLJIIJJI.q3(linkMicBattleMessage);
                }
                break;
            case 5:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                InterfaceC975520bUc interfaceC975520bUc3 = this.LJ;
                if (interfaceC975520bUc3 != null) {
                    interfaceC975520bUc3.q3(linkMicBattleMessage);
                }
                C975550bUf c975550bUf = this.LJI;
                if (c975550bUf != null) {
                    c975550bUf.LJII(linkMicBattleMessage);
                }
                break;
            case 6:
                InterfaceC975520bUc interfaceC975520bUc4 = this.LJ;
                if (interfaceC975520bUc4 != null) {
                    interfaceC975520bUc4.q3(linkMicBattleMessage);
                }
                C975680bUs c975680bUs = this.LJFF;
                if (c975680bUs != null) {
                    c975680bUs.q3(linkMicBattleMessage);
                }
                this.LJFF = null;
                break;
        }
        InterfaceC954910axN.LIZ.getClass();
        C958790b3d.LIZ("LiveMatchManager", "competition", "match").LJIILJJIL(linkMicBattleMessage);
    }

    public final void LJJ(MultiMatchPrepareResponse multiMatchPrepareResponse) {
        InterfaceC975520bUc interfaceC975520bUc;
        C975960bVK c975960bVKM3;
        if (multiMatchPrepareResponse != null && (interfaceC975520bUc = this.LJ) != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null) {
            c975960bVKM3.LJIILIIL = multiMatchPrepareResponse.ruleGuideUrl;
            List<GiftMode> list = multiMatchPrepareResponse.giftMode;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            c975960bVKM3.LJIILJJIL = list;
            c975960bVKM3.LJJLL = multiMatchPrepareResponse.recommendTeamMate;
        }
    }

    @Override // X.InterfaceC975700bUu
    public final void LIZ(EnumC962960bAM enumC962960bAM, String str) {
        C974050bSF c974050bSF = this.LJIIIIZZ;
        if (c974050bSF != null) {
            c974050bSF.LIZ(enumC962960bAM, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0160  */
    @Override // X.InterfaceC975700bUu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.InterfaceC975520bUc r12, X.EnumC964170bCJ r13) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975500bUa.LIZLLL(X.0bUc, X.0bCJ):void");
    }

    @Override // X.InterfaceC975700bUu
    public final void LJFF(InterfaceC975520bUc interfaceC975520bUc, EnumC919170a1j enumC919170a1j) {
        C0UVC.LIZJ("LiveMatchManager");
        C0UVC.LIZLLL = "engineDidSetMatchType";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matchType = ");
        sbLIZ.append(enumC919170a1j);
        C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!interfaceC975520bUc.d3() && enumC919170a1j != EnumC919170a1j.UNKNOWN) {
            C973890bRz.LJIIIZ = enumC919170a1j;
            C975550bUf c975550bUf = this.LJI;
            if (c975550bUf != null) {
                c975550bUf.LIZLLL(enumC919170a1j);
            }
            LJIILIIL();
            MatchBaseWidget matchBaseWidget = this.LIZ;
            if (matchBaseWidget.context == null) {
                C20441214yg.LJIIL("LiveMatchManager", "engineDidSetMatchType: widget.context is null, skip loading components");
                return;
            }
            C975550bUf c975550bUf2 = this.LJI;
            if (c975550bUf2 != null) {
                c975550bUf2.LJ(matchBaseWidget);
            }
        }
    }

    @Override // X.InterfaceC975700bUu
    public final void LJI(InterfaceC975520bUc interfaceC975520bUc, EnumC964170bCJ enumC964170bCJ) {
        String str;
        C975960bVK c975960bVKM3;
        C975960bVK c975960bVK;
        List<C975960bVK> arrayList;
        EnumC919170a1j enumC919170a1jLJIIIZ;
        EnumC919170a1j enumC919170a1jLJIIIZ2;
        Room roomInfo;
        C975680bUs c975680bUs;
        C975960bVK c975960bVKM32;
        int i = C963870bBp.LIZ[enumC964170bCJ.ordinal()];
        if (i != 1) {
            if ((i != 2 && i != 3) || !this.LIZJ) {
                return;
            }
            boolean z = this.LIZJ;
            C976100bVY c976100bVY = this.LIZIZ;
            if (c976100bVY != null) {
                C975680bUs c975680bUs2 = new C975680bUs(z, c976100bVY, this.LJII, this, true);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create rematch Engine ,type = ");
                sbLIZ.append(interfaceC975520bUc.LJIIIZ());
                C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
                c975680bUs2.LIZJ(interfaceC975520bUc.LJIIIZ());
                InterfaceC975520bUc interfaceC975520bUc2 = this.LJ;
                if (interfaceC975520bUc2 == null || (arrayList = interfaceC975520bUc2.p3()) == null) {
                    arrayList = new ArrayList<>();
                }
                c975680bUs2.LJIIJ = arrayList;
                InterfaceC975520bUc interfaceC975520bUc3 = this.LJ;
                if (interfaceC975520bUc3 != null && (c975960bVKM32 = interfaceC975520bUc3.m3()) != null) {
                    c975680bUs2.LJIIJ.add(c975960bVKM32);
                }
                InterfaceC975520bUc interfaceC975520bUc4 = this.LJ;
                if (interfaceC975520bUc4 != null && (roomInfo = interfaceC975520bUc4.getRoomInfo()) != null && (c975680bUs = this.LJFF) != null) {
                    c975680bUs.l3(roomInfo);
                }
                C975960bVK c975960bVK2 = new C975960bVK(EnumC975850bV9.INITIALIZE_REMATCH, true, C500260Jjc.LJJLIIIIJ(this.LJII));
                InterfaceC975520bUc interfaceC975520bUc5 = this.LJ;
                if (interfaceC975520bUc5 == null || (enumC919170a1jLJIIIZ = interfaceC975520bUc5.LJIIIZ()) == null) {
                    enumC919170a1jLJIIIZ = EnumC919170a1j.UNKNOWN;
                }
                c975960bVK2.LIZLLL = enumC919170a1jLJIIIZ;
                InterfaceC975520bUc interfaceC975520bUc6 = this.LJ;
                if (interfaceC975520bUc6 == null || (enumC919170a1jLJIIIZ2 = interfaceC975520bUc6.LJIIIZ()) == null) {
                    enumC919170a1jLJIIIZ2 = EnumC919170a1j.UNKNOWN;
                }
                c975960bVK2.LJJJI = enumC919170a1jLJIIIZ2;
                c975680bUs2.g3(c975960bVK2);
                this.LJFF = c975680bUs2;
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        String uniqueId = interfaceC975520bUc.getUniqueId();
        C975680bUs c975680bUs3 = this.LJFF;
        if (c975680bUs3 != null) {
            str = c975680bUs3.LJFF;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(uniqueId, str)) {
            InterfaceC975520bUc interfaceC975520bUc7 = this.LJ;
            if (interfaceC975520bUc7 != null) {
                interfaceC975520bUc7.LJII(201L);
            }
            C975680bUs c975680bUs4 = this.LJFF;
            this.LJ = c975680bUs4;
            if (c975680bUs4 != null) {
                c975680bUs4.LJ = false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mainEngine model = ");
            InterfaceC975520bUc interfaceC975520bUc8 = this.LJ;
            if (interfaceC975520bUc8 != null) {
                c975960bVKM3 = interfaceC975520bUc8.m3();
            } else {
                c975960bVKM3 = null;
            }
            sbLIZ2.append(c975960bVKM3);
            sbLIZ2.append(" and reMatchEngine Model = ");
            C975680bUs c975680bUs5 = this.LJFF;
            if (c975680bUs5 != null) {
                c975960bVK = c975680bUs5.LJIIIZ;
            } else {
                c975960bVK = null;
            }
            sbLIZ2.append(c975960bVK);
            C20441214yg.LJ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LJFF = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.lang.Integer r6, java.lang.Integer r7) {
        /*
            r5 = this;
            com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget r0 = r5.LIZ
            android.view.View r0 = r0.contentView
            r1 = 0
            if (r0 == 0) goto L38
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        Lb:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L35
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L36
            int r0 = r2.topMargin
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L19:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            java.lang.String r4 = "LiveMatchManager"
            if (r0 == 0) goto L3a
            if (r2 == 0) goto L29
            int r0 = r2.height
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L29:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r7)
            if (r0 == 0) goto L3a
            java.lang.String r0 = "MatchSeiHeight, adjustMatch,topMargin == paramMargin && height == linkRegionHeight"
            X.C20441214yg.LJ(r4, r0)
            return
        L35:
            r2 = r1
        L36:
            r0 = r1
            goto L19
        L38:
            r2 = r1
            goto Lb
        L3a:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "MatchSeiHeight, adjustMatchHeightAccordingToSei, topMarin = "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = ", and linkRegineHeight = "
            r3.append(r0)
            r1 = 0
            if (r7 == 0) goto L87
            int r0 = r7.intValue()
        L52:
            float r0 = X.C497740JfY.LJJI(r0)
            r3.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            X.C20441214yg.LJ(r4, r0)
            if (r2 == 0) goto L83
            if (r6 == 0) goto L84
            int r0 = r6.intValue()
        L68:
            r2.topMargin = r0
            if (r7 == 0) goto L70
            int r1 = r7.intValue()
        L70:
            r0 = 1112801280(0x42540000, float:53.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            int r1 = r1 + r0
            r2.height = r1
            com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget r0 = r5.LIZ
            android.view.View r0 = r0.contentView
            if (r0 == 0) goto L83
            X.C786410Ut5.W5(r0, r2)
        L83:
            return
        L84:
            r0 = 130(0x82, float:1.82E-43)
            goto L68
        L87:
            r0 = 0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975500bUa.LJII(java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.Integer r4, java.lang.Integer r5) {
        /*
            r3 = this;
            com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget r0 = r3.LIZ
            android.view.View r0 = r0.contentView
            r1 = 0
            if (r0 == 0) goto L31
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        Lb:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L2e
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L2f
            int r0 = r2.topMargin
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L19:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L33
            if (r2 == 0) goto L27
            int r0 = r2.rightMargin
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L27:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r5)
            if (r0 == 0) goto L33
            return
        L2e:
            r2 = r1
        L2f:
            r0 = r1
            goto L19
        L31:
            r2 = r1
            goto Lb
        L33:
            r1 = 0
            if (r2 == 0) goto L4f
            if (r4 == 0) goto L50
            int r0 = r4.intValue()
        L3c:
            r2.leftMargin = r0
            if (r5 == 0) goto L44
            int r1 = r5.intValue()
        L44:
            r2.rightMargin = r1
            com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget r0 = r3.LIZ
            android.view.View r0 = r0.contentView
            if (r0 == 0) goto L4f
            X.C786410Ut5.W5(r0, r2)
        L4f:
            return
        L50:
            r0 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975500bUa.LJIIIIZZ(java.lang.Integer, java.lang.Integer):void");
    }

    public final void LJIJJ(Room room, EnumC974070bSH enumC974070bSH) {
        GiftMode giftMode;
        InterfaceC975520bUc interfaceC975520bUc;
        C975960bVK c975960bVKM3;
        C975960bVK c975960bVKM32;
        InterfaceC975520bUc interfaceC975520bUc2;
        C975960bVK c975960bVKM33;
        C975960bVK c975960bVKM34;
        C975960bVK c975960bVKM35;
        C975960bVK c975960bVKM36;
        Boolean boolValueOf;
        EnumC964170bCJ enumC964170bCJY2;
        C975960bVK c975960bVKM37;
        C975550bUf c975550bUf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMatchProcessStarted room = ");
        sbLIZ.append(room);
        sbLIZ.append(" source = ");
        sbLIZ.append(enumC974070bSH);
        C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
        if (room == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("match delegate process started, source = ");
        sbLIZ2.append(enumC974070bSH);
        sbLIZ2.append(", interactiveModeComponentManager = ");
        sbLIZ2.append(this.LJI);
        C20441214yg.LJ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC975520bUc interfaceC975520bUc3 = this.LJ;
        if (interfaceC975520bUc3 != null) {
            interfaceC975520bUc3.l3(room);
        }
        if (this.LIZJ && LJIILL()) {
            LJIILJJIL();
            MatchBaseWidget matchBaseWidget = this.LIZ;
            if (matchBaseWidget.context != null && (c975550bUf = this.LJI) != null) {
                c975550bUf.LJFF(matchBaseWidget);
            }
        }
        C975550bUf c975550bUf2 = this.LJI;
        GiftMode giftModeLJJJJZ = null;
        if (c975550bUf2 != null) {
            InterfaceC975520bUc interfaceC975520bUc4 = this.LJ;
            if (interfaceC975520bUc4 == null || (enumC964170bCJY2 = interfaceC975520bUc4.Y2()) == null) {
                enumC964170bCJY2 = EnumC964170bCJ.NONE;
            }
            EnumC976700bWW enumC976700bWWLIZ = C976720bWY.LIZ(enumC964170bCJY2);
            InterfaceC975520bUc interfaceC975520bUc5 = this.LJ;
            if (interfaceC975520bUc5 != null) {
                c975960bVKM37 = interfaceC975520bUc5.m3();
            } else {
                c975960bVKM37 = null;
            }
            c975550bUf2.LJIIIZ(enumC976700bWWLIZ, c975960bVKM37);
        }
        if (this.LIZJ && enumC974070bSH == EnumC974070bSH.MATCH_CREATED_SOURCE_RESUME) {
            InterfaceC975520bUc interfaceC975520bUc6 = this.LJ;
            if (interfaceC975520bUc6 != null) {
                boolValueOf = Boolean.valueOf(interfaceC975520bUc6.n3());
            } else {
                boolValueOf = null;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("reconnect valid  = ");
            sbLIZ3.append(boolValueOf);
            C20441214yg.LJ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("BattleDataHolder.currentData.specificGiftData = ");
        C974450bSt c974450bSt = C973890bRz.LIZ;
        sbLIZ4.append(c974450bSt.LJIILIIL);
        sbLIZ4.append(", matchEngine?.getMatchModel()?.currentGift = ");
        InterfaceC975520bUc interfaceC975520bUc7 = this.LJ;
        if (interfaceC975520bUc7 != null && (c975960bVKM36 = interfaceC975520bUc7.m3()) != null) {
            giftMode = c975960bVKM36.LJIILL;
        } else {
            giftMode = null;
        }
        sbLIZ4.append(giftMode);
        sbLIZ4.append(", matchEngine?.getMatchModel()?.specificGiftData = ");
        InterfaceC975520bUc interfaceC975520bUc8 = this.LJ;
        if (interfaceC975520bUc8 != null && (c975960bVKM35 = interfaceC975520bUc8.m3()) != null) {
            giftModeLJJJJZ = c975960bVKM35.LJJJJZ();
        }
        sbLIZ4.append(giftModeLJJJJZ);
        C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ4));
        InterfaceC975520bUc interfaceC975520bUc9 = this.LJ;
        if ((interfaceC975520bUc9 == null || (c975960bVKM34 = interfaceC975520bUc9.m3()) == null || c975960bVKM34.LJIILL == null) && (interfaceC975520bUc = this.LJ) != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null) {
            c975960bVKM3.LJIILL = C978440bZK.LJII(c974450bSt.LJIILJJIL);
        }
        InterfaceC975520bUc interfaceC975520bUc10 = this.LJ;
        if (interfaceC975520bUc10 != null && (c975960bVKM32 = interfaceC975520bUc10.m3()) != null && c975960bVKM32.LJJJJIZL == 0 && (interfaceC975520bUc2 = this.LJ) != null && (c975960bVKM33 = interfaceC975520bUc2.m3()) != null) {
            c975960bVKM33.LJJLJ(c974450bSt.LJIILIIL);
        }
    }

    public final boolean LJIL(BattleInfoResponse battleInfoResponse, int i) {
        Boolean boolValueOf;
        EnumC970440bMQ enumC970440bMQLIZ = C970430bMP.LIZ(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Audience handle battleInfo scene = ");
        sbLIZ.append(enumC970440bMQLIZ);
        C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC975520bUc interfaceC975520bUc = this.LJ;
        if (interfaceC975520bUc != null) {
            boolValueOf = Boolean.valueOf(interfaceC975520bUc.o3(battleInfoResponse, C970430bMP.LIZ(i)));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && LJIILL()) {
            LJIILJJIL();
            C975550bUf c975550bUf = this.LJI;
            if (c975550bUf != null) {
                c975550bUf.LJFF(this.LIZ);
            }
            C975550bUf c975550bUf2 = this.LJI;
            if (c975550bUf2 != null) {
                c975550bUf2.LJI(new C970840bN4(battleInfoResponse), C970430bMP.LIZ(i));
            }
            C975550bUf c975550bUf3 = this.LJI;
            if (c975550bUf3 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onAudienceWindowStateReady info: ");
                sbLIZ2.append(battleInfoResponse);
                sbLIZ2.append(", scene: ");
                sbLIZ2.append(enumC970440bMQLIZ);
                C20441214yg.LIZIZ("InteractiveModeComponentManager", C2188811AlT.LIZIZ(sbLIZ2));
                Iterator it2 = ((ArrayList) c975550bUf3.LIZJ()).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC975560bUg) it2.next()).LJIIJ(battleInfoResponse, enumC970440bMQLIZ);
                }
            }
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public final void LJIJ(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage) {
        Integer numValueOf;
        C975680bUs c975680bUs = this.LJFF;
        if (c975680bUs != null) {
            c975680bUs.Z2(list, list2, customLinkMessage);
        }
        InterfaceC975520bUc interfaceC975520bUc = this.LJ;
        if (interfaceC975520bUc != null) {
            interfaceC975520bUc.Z2(list, list2, customLinkMessage);
        }
        C975550bUf c975550bUf = this.LJI;
        if (c975550bUf != null) {
            c975550bUf.LJIIIIZZ(list, list2);
        }
        Integer numValueOf2 = Integer.valueOf(list.size());
        Integer numValueOf3 = null;
        if (list2 != null) {
            numValueOf = Integer.valueOf(((ArrayList) list2).size());
        } else {
            numValueOf = null;
        }
        C975400bUQ.LIZLLL(!Intrinsics.LJFF(numValueOf2, numValueOf));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("oldList = ");
        if (list2 != null) {
            numValueOf3 = Integer.valueOf(((ArrayList) list2).size());
        }
        sbLIZ.append(numValueOf3);
        sbLIZ.append(" and newList = ");
        sbLIZ.append(Integer.valueOf(list.size()));
        C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
    }
}
