package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.DismissUserProfileEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostLynxQuickMatchInviteePanelEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976030bVR extends C975800bV4<InterfaceC976410bW3> {
    public final C976400bW2 LJI;
    public boolean LJII;

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LIZLLL(String str) {
    }

    public static EnumC975850bV9 LJJIJ(EnumC976390bW1 enumC976390bW1) {
        int i = C976370bVz.LIZ[enumC976390bW1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC975850bV9.INVITEE_TIMEOUT;
                }
                throw new C1954807lC();
            }
            return EnumC975850bV9.HOSTS_LIST_CHANGED;
        }
        return EnumC975850bV9.INVITEE_REJECT_BUTTON_CLICK;
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
        if (!(abstractC1136060ffY instanceof LinkMicBattleMessage)) {
            return;
        }
        LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) abstractC1136060ffY;
        int i = linkMicBattleMessage.action;
        if (i != 1) {
            Integer numValueOf = null;
            boolean z = false;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 7) {
                            BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
                            if (battleSetting != null) {
                                numValueOf = Integer.valueOf(battleSetting.inviteType);
                            }
                            boolean zLIZ = C959180b4G.LIZ(numValueOf);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("handleAcceptMsg isRematch:");
                            sbLIZ.append(zLIZ);
                            C20441214yg.LIZIZ("MatchStateInvitee", C2188811AlT.LIZIZ(sbLIZ));
                            C974540bT2.LJJIJL(linkMicBattleMessage);
                            if (linkMicBattleMessage.battleSetting.status == 1) {
                                LJJIJIIJI(1, linkMicBattleMessage);
                            }
                            InterfaceC976410bW3 interfaceC976410bW3 = (InterfaceC976410bW3) LJIILJJIL();
                            if (interfaceC976410bW3 != null) {
                                interfaceC976410bW3.LJIIIZ(linkMicBattleMessage);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C20441214yg.LIZIZ("MatchStateInvitee", "ACTION_OPEN with IM");
                    LJJIJIIJI(0, linkMicBattleMessage);
                    return;
                }
                C20441214yg.LJIIIZ("MatchStateInvitee", "handleCancelMessage");
                if (!C976040bVS.LJIIJ(this, linkMicBattleMessage.battleId)) {
                    return;
                }
                InterfaceC976410bW3 interfaceC976410bW32 = (InterfaceC976410bW3) LJIILJJIL();
                if (interfaceC976410bW32 != null) {
                    interfaceC976410bW32.LJIL(linkMicBattleMessage);
                }
                LJJIJL(true);
                LJIJ(EnumC964170bCJ.NONE, EnumC975850bV9.CANCEL_MESSAGE, linkMicBattleMessage, null);
                return;
            }
            InterfaceC976410bW3 interfaceC976410bW33 = (InterfaceC976410bW3) LJIILJJIL();
            if (interfaceC976410bW33 != null) {
                if (this.LIZ == EnumC964170bCJ.ACCEPTED) {
                    z = true;
                }
                interfaceC976410bW33.LJJIIJ(linkMicBattleMessage, z);
            }
            LJJIJL(true);
            LJIJ(EnumC964170bCJ.NONE, EnumC975850bV9.REJECT_MESSAGE, linkMicBattleMessage, null);
            return;
        }
        C974500bSy.LIZ(linkMicBattleMessage);
        C976040bVS.LJJ(linkMicBattleMessage.leagueInfoMap, linkMicBattleMessage.leagueScoreInfoMap);
        LJIJJLI(linkMicBattleMessage.enigmaBattleSetting);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List<com.bytedance.android.livesdk.model.message.TeamUsersInfo>] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List, java.util.List<? extends com.bytedance.android.livesdk.model.message.TeamUsersInfo>] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    @Override // X.InterfaceC975690bUt
    public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
        boolean z;
        LinkMicBattleMessage linkMicBattleMessage;
        Integer numValueOf;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        long id;
        ?? arrayList;
        long j2;
        GiftModeMetaV2 giftModeMetaV2;
        BattleSetting battleSetting;
        GiftModeMeta giftModeMeta;
        BattleSetting battleSetting2;
        C975960bVK c975960bVKM3;
        long j3;
        Integer numValueOf2;
        GiftModeMeta giftModeMeta2;
        BattleSetting battleSetting3;
        BattleSetting battleSetting4;
        Integer numValueOf3;
        BattleSetting battleSetting5;
        C975960bVK c975960bVKM32;
        C975990bVN c975990bVN;
        BattleSetting battleSetting6;
        Long lValueOf;
        long j4;
        Integer numValueOf4;
        GiftModeMeta giftModeMeta3;
        GiftModeMeta giftModeMeta4;
        Integer numValueOf5;
        BattleSetting battleSetting7;
        GiftModeMeta giftModeMeta5;
        C975960bVK c975960bVKM33;
        C975990bVN c975990bVN2;
        C975960bVK c975960bVKM34;
        Map<Long, BattleComboInfo> map;
        BattleSetting battleSetting8;
        C975960bVK c975960bVKM35;
        C975990bVN c975990bVN3;
        Room roomInfo;
        User owner;
        DataChannel dataChannel;
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        boolean z5 = false;
        if (interfaceC975870bVBLJFF != null) {
            interfaceC975870bVBLJFF.LIZIZ(false);
        }
        if (this.LIZ == EnumC964170bCJ.ACCEPTED) {
            LJIILLIIL(this.LJI, "MatchStateInvitee", new AwS629S0100000_15(this, 82));
        }
        C0UVC.LIZJ("MatchStateInvitee");
        C0UVC.LIZLLL = "stateDidEnter";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" fromSource = ");
        sbLIZ.append(enumC975850bV9);
        C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (enumC975850bV9 == EnumC975850bV9.INVITER_MEANWHILE_AUTO_ACCEPT) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null && (dataChannel = interfaceC975520bUc.getDataChannel()) != null) {
            dataChannel.FQ2(DismissUserProfileEvent.class);
        }
        EnumC964170bCJ enumC964170bCJY2 = null;
        if (this.LIZLLL != null) {
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            if (!listLLILZLL.isEmpty() && listLLILZLL.size() >= 3) {
                InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                if (interfaceC975520bUc2 != null && (roomInfo = interfaceC975520bUc2.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null) {
                    id = owner.getId();
                } else {
                    id = ((C954460awe) ListProtector.get(listLLILZLL, 0)).LJ;
                }
                InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                if (interfaceC975520bUc3 != null && (c975960bVKM35 = interfaceC975520bUc3.m3()) != null && (c975990bVN3 = c975960bVKM35.LJJJLZIJ) != null) {
                    c975990bVN3.LIZJ();
                }
                LinkMicBattleMessage linkMicBattleMessage2 = this.LIZLLL;
                if (linkMicBattleMessage2 != null && (battleSetting8 = linkMicBattleMessage2.battleSetting) != null && battleSetting8.battleType == EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
                    arrayList = new ArrayList();
                    for (C954460awe c954460awe : C915980Zwa.LJII().LLILZLL(true)) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Long.valueOf(c954460awe.LJ));
                        TeamUsersInfo teamUsersInfo = new TeamUsersInfo();
                        teamUsersInfo.teamId = c954460awe.LJ;
                        teamUsersInfo.userIds = arrayList2;
                        arrayList.add(teamUsersInfo);
                    }
                } else {
                    LinkMicBattleMessage linkMicBattleMessage3 = this.LIZLLL;
                    if (linkMicBattleMessage3 != null) {
                        arrayList = linkMicBattleMessage3.teamUsers;
                    } else {
                        arrayList = 0;
                    }
                }
                InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                if (interfaceC975520bUc4 != null && (c975960bVKM34 = interfaceC975520bUc4.m3()) != null) {
                    LinkMicBattleMessage linkMicBattleMessage4 = this.LIZLLL;
                    if (linkMicBattleMessage4 != null) {
                        map = linkMicBattleMessage4.battleCombos;
                    } else {
                        map = null;
                    }
                    c975960bVKM34.LJJIJIIJI = map;
                }
                if (arrayList != 0) {
                    j2 = 0;
                    for (TeamUsersInfo teamUsersInfo2 : arrayList) {
                        Iterator<Long> it2 = teamUsersInfo2.userIds.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Long next = it2.next();
                            Long l = next;
                            if (l != null && l.longValue() == id) {
                                if (next != null) {
                                    j2 = teamUsersInfo2.teamId;
                                }
                            }
                        }
                        InterfaceC975520bUc interfaceC975520bUc5 = this.LIZIZ;
                        if (interfaceC975520bUc5 != null && (c975960bVKM33 = interfaceC975520bUc5.m3()) != null && (c975990bVN2 = c975960bVKM33.LJJJLZIJ) != null) {
                            c975990bVN2.LJFF(teamUsersInfo2.teamId, teamUsersInfo2.userIds);
                        }
                    }
                } else {
                    j2 = 0;
                }
                InterfaceC975520bUc interfaceC975520bUc6 = this.LIZIZ;
                if (interfaceC975520bUc6 != null && (c975960bVKM32 = interfaceC975520bUc6.m3()) != null && (c975990bVN = c975960bVKM32.LJJJLZIJ) != null) {
                    c975990bVN.LIZ(new ArrayList());
                    LinkMicBattleMessage linkMicBattleMessage5 = this.LIZLLL;
                    if (linkMicBattleMessage5 != null) {
                        battleSetting6 = linkMicBattleMessage5.battleSetting;
                    } else {
                        battleSetting6 = null;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateMatchSetting = ");
                    sbLIZ2.append(battleSetting6);
                    sbLIZ2.append(", giftId = ");
                    if (battleSetting6 != null && (giftModeMeta5 = battleSetting6.giftModeMeta) != null) {
                        lValueOf = Long.valueOf(giftModeMeta5.giftId);
                    } else {
                        lValueOf = null;
                    }
                    sbLIZ2.append(lValueOf);
                    C20441214yg.LIZIZ("LiveMatchModelUpdater", C2188811AlT.LIZIZ(sbLIZ2));
                    C975960bVK c975960bVK = c975990bVN.LIZ;
                    c975960bVK.LJII = battleSetting6;
                    if (battleSetting6 != null) {
                        j4 = battleSetting6.battleId;
                    } else {
                        j4 = 0;
                    }
                    c975960bVK.LJLJI(j4);
                    c975960bVK.LJIJI.getClass();
                    if (battleSetting6 != null) {
                        numValueOf4 = Integer.valueOf(battleSetting6.battleType);
                    } else {
                        numValueOf4 = null;
                    }
                    c975960bVK.LIZLLL = C918130a03.LIZ(numValueOf4);
                    if (battleSetting6 != null) {
                        giftModeMeta3 = battleSetting6.giftModeMeta;
                    } else {
                        giftModeMeta3 = null;
                    }
                    c975960bVK.LJLI(giftModeMeta3);
                    if (battleSetting6 != null && Long.valueOf(battleSetting6.channelId) != null) {
                        c975960bVK.LJIIIZ = battleSetting6.channelId;
                    }
                    C974450bSt c974450bSt = C973890bRz.LIZ;
                    c974450bSt.LJLJI(battleSetting6);
                    C973890bRz.LJIIIZ = c975990bVN.LIZ.LIZLLL;
                    if (battleSetting6 != null) {
                        giftModeMeta4 = battleSetting6.giftModeMeta;
                    } else {
                        giftModeMeta4 = null;
                    }
                    c974450bSt.LJLI(giftModeMeta4);
                    LinkMicBattleMessage linkMicBattleMessage6 = this.LIZLLL;
                    if (linkMicBattleMessage6 != null && (battleSetting7 = linkMicBattleMessage6.battleSetting) != null) {
                        numValueOf5 = Integer.valueOf(battleSetting7.battleType);
                    } else {
                        numValueOf5 = null;
                    }
                    c975990bVN.LIZ.LIZLLL = C918130a03.LIZ(numValueOf5);
                }
                C961300b7g.LIZ.getClass();
                C961300b7g.LIZIZ("");
                InterfaceC975520bUc interfaceC975520bUc7 = this.LIZIZ;
                if (interfaceC975520bUc7 != null) {
                    LinkMicBattleMessage linkMicBattleMessage7 = this.LIZLLL;
                    if (linkMicBattleMessage7 != null && (battleSetting5 = linkMicBattleMessage7.battleSetting) != null) {
                        numValueOf3 = Integer.valueOf(battleSetting5.battleType);
                    } else {
                        numValueOf3 = null;
                    }
                    interfaceC975520bUc7.k3(C918130a03.LIZ(numValueOf3));
                }
                InterfaceC975520bUc interfaceC975520bUc8 = this.LIZIZ;
                if (interfaceC975520bUc8 != null && (c975960bVKM3 = interfaceC975520bUc8.m3()) != null) {
                    c975960bVKM3.LJJJZ(false);
                    c975960bVKM3.LJJIJ = arrayList;
                    LinkMicBattleMessage linkMicBattleMessage8 = this.LIZLLL;
                    if (linkMicBattleMessage8 != null) {
                        j3 = linkMicBattleMessage8.actionByUserId;
                    } else {
                        j3 = 0;
                    }
                    c975960bVKM3.LJJJJZI = j3;
                    if (linkMicBattleMessage8 != null && (battleSetting4 = linkMicBattleMessage8.battleSetting) != null) {
                        numValueOf2 = Integer.valueOf(battleSetting4.inviteType);
                    } else {
                        numValueOf2 = null;
                    }
                    c975960bVKM3.LJFF = C959180b4G.LIZ(numValueOf2);
                    LinkMicBattleMessage linkMicBattleMessage9 = this.LIZLLL;
                    if (linkMicBattleMessage9 != null && (battleSetting3 = linkMicBattleMessage9.battleSetting) != null) {
                        giftModeMeta2 = battleSetting3.giftModeMeta;
                    } else {
                        giftModeMeta2 = null;
                    }
                    c975960bVKM3.LJLI(giftModeMeta2);
                    c975960bVKM3.LJIIJ = j2;
                }
                InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
                if (interfaceC975810bV5LIZLLL != null) {
                    LinkMicBattleMessage linkMicBattleMessage10 = this.LIZLLL;
                    if (linkMicBattleMessage10 != null && (battleSetting2 = linkMicBattleMessage10.battleSetting) != null) {
                        giftModeMeta = battleSetting2.giftModeMeta;
                    } else {
                        giftModeMeta = null;
                    }
                    interfaceC975810bV5LIZLLL.LJJIJL(giftModeMeta);
                }
                InterfaceC975810bV5 interfaceC975810bV5LIZLLL2 = C915980Zwa.LJI().LIZLLL();
                if (interfaceC975810bV5LIZLLL2 != null) {
                    LinkMicBattleMessage linkMicBattleMessage11 = this.LIZLLL;
                    if (linkMicBattleMessage11 != null && (battleSetting = linkMicBattleMessage11.battleSetting) != null) {
                        giftModeMetaV2 = battleSetting.giftModeMetaV2;
                    } else {
                        giftModeMetaV2 = null;
                    }
                    interfaceC975810bV5LIZLLL2.LJJIJIL(giftModeMetaV2);
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(" error not multi match ,still not avaliable,linkedUsers = ");
                sbLIZ3.append(listLLILZLL);
                C20441214yg.LJ("MatchStateInvitee", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        if ((!LiveCoHostLynxQuickMatchInviteePanelEnableSetting.INSTANCE.isEnable() || this.LIZ != EnumC964170bCJ.ACCEPTED) && !LJJIJIL(true) && !LJJIJIIJIL(true, z, enumC975850bV9)) {
            return;
        }
        LJJIJL(false);
        if ((enumC975850bV9 == EnumC975850bV9.INVITE_MESSAGE || enumC975850bV9 == EnumC975850bV9.INVITER_MEANWHILE || enumC975850bV9 == EnumC975850bV9.INVITER_MEANWHILE_AUTO_ACCEPT) && (linkMicBattleMessage = this.LIZLLL) != null) {
            BattleSetting battleSetting9 = linkMicBattleMessage.battleSetting;
            if (battleSetting9 != null) {
                numValueOf = Integer.valueOf(battleSetting9.inviteType);
            } else {
                numValueOf = null;
            }
            boolean zLIZ = C959180b4G.LIZ(numValueOf);
            BattleSetting battleSetting10 = linkMicBattleMessage.battleSetting;
            if (battleSetting10 != null) {
                j = battleSetting10.sourceType;
            } else {
                j = 0;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("coHostSourceType=");
            sbLIZ4.append(j);
            C20441214yg.LIZIZ("MultiMatchStateInvitee", C2188811AlT.LIZIZ(sbLIZ4));
            if (j != 0) {
                C955540ayO c955540ayOLIZ = C915200ZvK.LIZ(Integer.valueOf((int) j));
                C973660bRc c973660bRc = C973660bRc.LIZ;
                long j5 = linkMicBattleMessage.actionByUserId;
                if (linkMicBattleMessage.battleSetting.battleType != EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c973660bRc.LJLJJLL(j5, z4, linkMicBattleMessage.teamUsers, linkMicBattleMessage, c955540ayOLIZ, zLIZ, linkMicBattleMessage.leagueInfoMap);
            } else {
                C973660bRc c973660bRc2 = C973660bRc.LIZ;
                long j6 = linkMicBattleMessage.actionByUserId;
                if (linkMicBattleMessage.battleSetting.battleType != EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C973660bRc.LIZ.LJLJJLL(j6, z2, linkMicBattleMessage.teamUsers, linkMicBattleMessage, C915980Zwa.LJI().LIZ().LJIILLIIL(), zLIZ, linkMicBattleMessage.leagueInfoMap);
            }
            InterfaceC975520bUc interfaceC975520bUc9 = this.LIZIZ;
            if (interfaceC975520bUc9 != null) {
                enumC964170bCJY2 = interfaceC975520bUc9.Y2();
            }
            if (enumC964170bCJY2 == EnumC964170bCJ.RECEIVED) {
                z3 = true;
                z5 = true;
            } else {
                z3 = true;
            }
            C974540bT2.LJLJJI(linkMicBattleMessage, z3 ^ z5);
        }
    }

    @Override // X.InterfaceC975690bUt
    public final void LJI(EnumC975850bV9 enumC975850bV9) {
        String str;
        this.LJI.LIZ();
        C0UVC.LIZJ("MatchStateInvitee");
        C0UVC.LIZLLL = "stateWillLeave";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" fromSource = ");
        sbLIZ.append(enumC975850bV9);
        C0UVC.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (enumC975850bV9 == EnumC975850bV9.INVITEE_ACCEPT_BUTTON_CLICK) {
            return;
        }
        switch (C976370bVz.LIZIZ[enumC975850bV9.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                str = "active";
                break;
            case 6:
                str = "cancelled";
                break;
            case 7:
                str = "reject_by_other";
                break;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                str = "cohost_end";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                str = "time_out";
                break;
            default:
                str = "";
                break;
        }
        InterfaceC976410bW3 interfaceC976410bW3 = (InterfaceC976410bW3) LJIILJJIL();
        if (interfaceC976410bW3 != null) {
            interfaceC976410bW3.LJIILLIIL(str);
        }
        InterfaceC976410bW3 interfaceC976410bW32 = (InterfaceC976410bW3) LJIILJJIL();
        if (interfaceC976410bW32 != null) {
            interfaceC976410bW32.LIZIZ();
        }
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJII(long j) {
        InterfaceC976410bW3 interfaceC976410bW3 = (InterfaceC976410bW3) LJIILJJIL();
        if (interfaceC976410bW3 != null) {
            interfaceC976410bW3.LJIIJJI();
        }
        LJIJ(EnumC964170bCJ.NONE, EnumC975850bV9.INVITEE_LEAVE_COHOST, null, null);
    }

    public final boolean LJJIJIL(boolean z) {
        BattleSetting battleSetting;
        LinkMicBattleMessage linkMicBattleMessage = this.LIZLLL;
        if (linkMicBattleMessage == null || (battleSetting = linkMicBattleMessage.battleSetting) == null || battleSetting.inviteType != 3 || !LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
            return false;
        }
        InterfaceC976410bW3 interfaceC976410bW3 = (InterfaceC976410bW3) LJIILJJIL();
        if (interfaceC976410bW3 != null) {
            interfaceC976410bW3.LJIJ(z, linkMicBattleMessage, new AwS416S0200000_15(this, linkMicBattleMessage, 73), new AwS594S0100000_15(this, 837), new AwS594S0100000_15(this, 838), new AwS594S0100000_15(this, 839));
        }
        return true;
    }

    public final void LJJIJL(boolean z) {
        Boolean boolValueOf;
        InterfaceC976410bW3 interfaceC976410bW3;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        Boolean boolValueOf2 = null;
        if (interfaceC975520bUc != null) {
            boolValueOf = Boolean.valueOf(interfaceC975520bUc.d3());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
            if (interfaceC975520bUc2 != null) {
                boolValueOf2 = Boolean.valueOf(interfaceC975520bUc2.isAnchor());
            }
            if (C500260Jjc.LJJJI(boolValueOf2) && (interfaceC976410bW3 = (InterfaceC976410bW3) LJIILJJIL()) != null) {
                interfaceC976410bW3.LIZ(z);
            }
        }
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public final void h3(String str) {
        EnumC964170bCJ enumC964170bCJY2;
        long jLJJJJJL;
        super.h3(str);
        boolean zD3 = false;
        if (LJJIJIL(false)) {
            return;
        }
        long jLIZ = C158B.LIZ();
        boolean zLJJIJIIJIL = LJJIJIIJIL(false, false, EnumC975850bV9.MATCH_ICON_CLICK);
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc == null || (enumC964170bCJY2 = interfaceC975520bUc.Y2()) == null) {
            enumC964170bCJY2 = EnumC964170bCJ.NONE;
        }
        if (zLJJIJIIJIL && enumC964170bCJY2 == EnumC964170bCJ.ACCEPTED) {
            long jLIZ2 = C158B.LIZ() - jLIZ;
            InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
            if (interfaceC975520bUc2 != null) {
                zD3 = interfaceC975520bUc2.d3();
            }
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LJ = C158B.LIZ();
            JSONObject jSONObject = new JSONObject();
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(zD3);
            if (interfaceC973730bRjYf2 != null) {
                jLJJJJJL = interfaceC973730bRjYf2.LJJJJJL();
            } else {
                jLJJJJJL = 0;
            }
            C0K04.LJ("battle_id", jLJJJJJL, jSONObject);
            C974540bT2.LJIJJLI(jSONObject, zD3);
            JSONObject jSONObject2 = new JSONObject();
            C0K04.LJFF("role_type", "invitee", jSONObject2);
            C0K04.LJFF(Scene.SCENE_SERVICE, "match_icon", jSONObject2);
            C0K04.LJFF("reason", "click", jSONObject2);
            C0K04.LJ("prepare_duration", jLIZ2, jSONObject);
            c974540bT2.LLIIIZ("receive_panel_show", jSONObject, jSONObject2, new JSONObject(), false, null);
        }
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJFF(long j, String str) {
        C975960bVK c975960bVKM3;
        MutableLiveData<List<C976480bWA>> mutableLiveData;
        List<C976480bWA> value;
        int size;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        int i = 0;
        if (interfaceC975520bUc != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null && (mutableLiveData = c975960bVKM3.LJJJLIIL) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<C976480bWA> it2 = value.iterator();
            i = 0;
            while (it2.hasNext()) {
                List<C976800bWg> list = it2.next().LJFF;
                if (list != null) {
                    size = ((ArrayList) list).size();
                } else {
                    size = 0;
                }
                i += size;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserLeft, leaveReason = ");
        sbLIZ.append(j);
        sbLIZ.append(", linkmicId = ");
        sbLIZ.append(str);
        sbLIZ.append(" and size = ");
        sbLIZ.append(listLLILZLL.size());
        sbLIZ.append(" matchAnchorCount = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MatchStateInvitee", C2188811AlT.LIZIZ(sbLIZ));
        if (i != listLLILZLL.size()) {
            InterfaceC976410bW3 interfaceC976410bW3 = (InterfaceC976410bW3) LJIILJJIL();
            if (interfaceC976410bW3 != null) {
                interfaceC976410bW3.LJIIJJI();
            }
            InterfaceC976410bW3 interfaceC976410bW32 = (InterfaceC976410bW3) LJIILJJIL();
            if (interfaceC976410bW32 != null) {
                interfaceC976410bW32.LJIILLIIL("onUserLeft");
            }
        }
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJIIL(List list, List list2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostsListChanged， list.size = ");
        sbLIZ.append(Integer.valueOf(list.size()));
        C20441214yg.LIZIZ("MatchStateInvitee", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC976410bW3 interfaceC976410bW3 = (InterfaceC976410bW3) LJIILJJIL();
        if (interfaceC976410bW3 != null) {
            interfaceC976410bW3.LJIIJJI();
        }
        InterfaceC976410bW3 interfaceC976410bW32 = (InterfaceC976410bW3) LJIILJJIL();
        if (interfaceC976410bW32 != null) {
            interfaceC976410bW32.LJIILLIIL("onHostsListChanged");
        }
    }

    public final void LJJIJIIJI(int i, LinkMicBattleMessage linkMicBattleMessage) {
        Integer numValueOf;
        if (linkMicBattleMessage.action == 4) {
            if (this.LJII) {
                C20441214yg.LJIIIZ("MatchStateInvitee", "handleBattleStartPreInspection: ");
                return;
            } else {
                this.LJII = true;
                C976040bVS.LJJ(linkMicBattleMessage.leagueInfoMap, linkMicBattleMessage.leagueScoreInfoMap);
                LJIJJLI(linkMicBattleMessage.enigmaBattleSetting);
            }
        }
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.inviteType);
        } else {
            numValueOf = null;
        }
        C959180b4G.LIZ(numValueOf);
        if (i == 0) {
            LJIJ(EnumC964170bCJ.MATCH_START, EnumC975850bV9.OPEN_MESSAGE, linkMicBattleMessage, null);
        }
        if (linkMicBattleMessage.action == 7 && i == 1) {
            LJIJ(EnumC964170bCJ.MATCH_START, EnumC975850bV9.ACCEPT_MESSAGE, linkMicBattleMessage, null);
        }
    }

    @Override // X.C975800bV4, X.InterfaceC975690bUt
    public final void f3(int i, boolean z) {
        super.f3(i, z);
        LJJIJIIJIL(false, false, EnumC975850bV9.GUIDE_CAPSULE_CLICK);
    }

    @Override // X.C976040bVS, X.InterfaceC975690bUt
    public final void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        InterfaceC976410bW3 interfaceC976410bW3 = (InterfaceC976410bW3) LJIILJJIL();
        if (interfaceC976410bW3 != null) {
            interfaceC976410bW3.LJIIJJI();
        }
        InterfaceC976410bW3 interfaceC976410bW32 = (InterfaceC976410bW3) LJIILJJIL();
        if (interfaceC976410bW32 != null) {
            interfaceC976410bW32.LJIILLIIL("onLinkMicFinish");
        }
        LJIJ(EnumC964170bCJ.NONE, EnumC975850bV9.INVITEE_LEAVE_COHOST, null, null);
    }

    public final boolean LJJIJIIJIL(boolean z, boolean z2, EnumC975850bV9 enumC975850bV9) {
        LinkMicBattleMessage linkMicBattleMessage = this.LIZLLL;
        if (linkMicBattleMessage != null) {
            InterfaceC976410bW3 interfaceC976410bW3 = (InterfaceC976410bW3) LJIILJJIL();
            Boolean boolValueOf = null;
            if (interfaceC976410bW3 != null) {
                InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
                if (interfaceC975520bUc != null) {
                    boolValueOf = Boolean.valueOf(interfaceC975520bUc.d3());
                }
                Boolean boolValueOf2 = Boolean.valueOf(interfaceC976410bW3.LJJIII(enumC975850bV9, linkMicBattleMessage, z, z2, C500260Jjc.LJJJI(boolValueOf), new AwS664S0100000_15(this, 12), new AwS559S0100000_15(this, 862), new AwS594S0100000_15(this, 834), new AwS594S0100000_15(this, 835), new AwS594S0100000_15(this, 836)));
                if (boolValueOf2 != null) {
                    return boolValueOf2.booleanValue();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public C976030bVR(EnumC964170bCJ enumC964170bCJ, InterfaceC975520bUc interfaceC975520bUc, InterfaceC977310bXV interfaceC977310bXV, LinkMicBattleMessage linkMicBattleMessage) {
        super(enumC964170bCJ, interfaceC975520bUc, interfaceC977310bXV, linkMicBattleMessage);
        this.LJI = new C976400bW2("MatchStateInvitee", interfaceC975520bUc);
    }
}
