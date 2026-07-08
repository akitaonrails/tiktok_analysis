package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCheckBattleInfoSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976000bVO extends C975970bVL {
    public final BattleInfoResponse LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;

    public final String LJJJLL() {
        EnumC919170a1j enumC919170a1jLJIIIZ;
        CharSequence charSequence = (CharSequence) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
        if (charSequence != null && !a0.LJJJIL(charSequence)) {
            String str = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
            return str == null ? "" : str;
        }
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc == null || (enumC919170a1jLJIIIZ = interfaceC975520bUc.LJIIIZ()) == null) {
            enumC919170a1jLJIIIZ = EnumC919170a1j.MATCH_TYPE_INDIVIDUAL;
        }
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        c917350Zyn.getClass();
        return C917350Zyn.LIZIZ(enumC919170a1jLJIIIZ, size);
    }

    public static void LJJJJZI(C976000bVO c976000bVO) {
        long j;
        long id;
        Room roomInfo;
        Room roomInfo2;
        c976000bVO.getClass();
        int finishRetryCount = LiveMatchAudienceCheckBattleInfoSetting.INSTANCE.getFinishRetryCount();
        c976000bVO.LJIIZILJ = finishRetryCount;
        C975960bVK c975960bVK = c976000bVO.LJII;
        long ownerUserId = 0;
        if (c975960bVK != null && c975960bVK.LJ > 0 && !c976000bVO.LJIILLIIL) {
            c976000bVO.LJIILLIIL = true;
            c976000bVO.LJIIZILJ = finishRetryCount - 1;
            long channelId = C915980Zwa.LJII().getChannelId();
            C975960bVK c975960bVK2 = c976000bVO.LJII;
            if (c975960bVK2 != null) {
                j = c975960bVK2.LJ;
            } else {
                j = 0;
            }
            C974540bT2.LIZ.LJJJJ("audience_result");
            C480460Ism.LIZ().getClass();
            LinkBattleApi linkBattleApi = (LinkBattleApi) C480460Ism.LIZLLL(LinkBattleApi.class);
            InterfaceC975520bUc interfaceC975520bUc = c976000bVO.LIZIZ;
            if (interfaceC975520bUc != null && (roomInfo2 = interfaceC975520bUc.getRoomInfo()) != null) {
                id = roomInfo2.getId();
            } else {
                id = 0;
            }
            InterfaceC975520bUc interfaceC975520bUc2 = c976000bVO.LIZIZ;
            if (interfaceC975520bUc2 != null && (roomInfo = interfaceC975520bUc2.getRoomInfo()) != null) {
                ownerUserId = roomInfo.getOwnerUserId();
            }
            linkBattleApi.getInfo(id, channelId, j, ownerUserId, EnumC970440bMQ.BATTLE_INFO_SCENE_FINISH.getType()).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(c976000bVO, 155), new AfS184S0100000_15(c976000bVO, 156));
        }
    }

    @Override // X.C975970bVL, X.C975800bV4, X.InterfaceC975690bUt
    public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
        Integer numValueOf;
        boolean z;
        List<? extends TeamUsersInfo> list;
        Room roomInfo;
        if (!(abstractC1136060ffY instanceof LinkMicBattleMessage)) {
            return;
        }
        LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) abstractC1136060ffY;
        int i = linkMicBattleMessage.action;
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    super.LIZ(abstractC1136060ffY);
                    return;
                } else {
                    LJJJLZIJ(linkMicBattleMessage);
                    return;
                }
            }
            LJJJZ(linkMicBattleMessage);
            return;
        }
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.inviteType);
        } else {
            numValueOf = null;
        }
        boolean zLIZ = C959180b4G.LIZ(numValueOf);
        int i2 = linkMicBattleMessage.battleSetting.battleType;
        if (i2 != 0 && i2 != EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
            z = true;
        } else {
            z = false;
        }
        C973660bRc c973660bRc = C973660bRc.LIZ;
        C975960bVK c975960bVK = this.LJII;
        if (c975960bVK != null) {
            list = c975960bVK.LJJIJ;
        } else {
            list = null;
        }
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null) {
            roomInfo = interfaceC975520bUc.getRoomInfo();
        } else {
            roomInfo = null;
        }
        c973660bRc.LJJJJZ(z, list, null, roomInfo, "setting_open_message");
        C955400ayA.LJJJJIZL();
        if (zLIZ) {
            C970290bMB.LIZ.getClass();
            C970290bMB.LJIJJ(1, false);
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LLIIII("normal", z);
        }
        C970290bMB.LIZ.LJIJI("open_message", "settle", z, zLIZ);
        C955430ayD.LJIIIIZZ("match_open_message");
        LJJJJLI(linkMicBattleMessage);
        C975800bV4.LJJIIZI(this, linkMicBattleMessage, null, EnumC975850bV9.OPEN_MESSAGE_IN_PUNISH, 2);
    }

    @Override // X.InterfaceC975690bUt
    public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
        Integer numValueOf;
        String str;
        Map<Long, BattleUserArmies> map;
        Map<Long, BattleResult> map2;
        int i;
        List<? extends TeamUsersInfo> list;
        long jLongValue;
        long j;
        long j2;
        List<? extends TeamUsersInfo> list2;
        Map<Long, BattleTeamResult> map3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromSource = ");
        sbLIZ.append(enumC975850bV9);
        C20441214yg.LIZIZ("MultiMatchStateSettlingAudience", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC975850bV9 == EnumC975850bV9.TIME_OVER_SETTLEMENT) {
            LJJJJZI(this);
        } else {
            BattleInfoResponse battleInfoResponse = this.LJIILL;
            if (battleInfoResponse != null) {
                long value = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                long jLJIILIIL = LJIILIIL();
                BattleSetting battleSetting = battleInfoResponse.setting;
                ArrayList arrayList = null;
                if (battleSetting != null) {
                    numValueOf = Integer.valueOf(battleSetting.inviteType);
                } else {
                    numValueOf = null;
                }
                boolean zLIZ = C959180b4G.LIZ(numValueOf);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("get from battleInfo,punish duration = ");
                sbLIZ2.append(jLJIILIIL);
                C20441214yg.LIZIZ("MultiMatchStateSettlingAudience", C2188811AlT.LIZIZ(sbLIZ2));
                if (jLJIILIIL > 0) {
                    if (enumC975850bV9 == EnumC975850bV9.AUDIENCE_BATTLE_INFO_ROOM_ENTER) {
                        str = "room_enter";
                    } else {
                        str = "battle_info";
                    }
                    C970290bMB.LIZ.LJIJI(str, "settle", C970370bMJ.LJII(), zLIZ);
                    C973660bRc c973660bRc = C973660bRc.LIZ;
                    C973660bRc.LJLLILLLL = C974520bT0.LIZ();
                    C946230ajN.LIZJ();
                    C975960bVK c975960bVK = this.LJII;
                    if (c975960bVK != null) {
                        c975960bVK.LJJIIZI = jLJIILIIL;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Map<Long, BattleTeamUserArmies> map4 = battleInfoResponse.teamArmies;
                    if (map4 != null) {
                        Iterator<Map.Entry<Long, BattleTeamUserArmies>> it2 = map4.entrySet().iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(it2.next().getValue());
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("updateUserArmies result = ");
                        sbLIZ3.append(arrayList2);
                        C20441214yg.LJ("MultiMatchStateSettlingAudience", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    Map<Long, BattleUserArmies> mapLJ = battleInfoResponse.armies;
                    if (mapLJ == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    C976060bVU.LIZIZ(this, arrayList2, mapLJ, 0L, 0L, false, 28);
                    LJIJJLI(battleInfoResponse.enigmaBattleSetting);
                    LJIJJ(battleInfoResponse.enigmaBattleExtraInfo);
                    LJIJI(battleInfoResponse.anchorMatchSettings);
                    C975960bVK c975960bVK2 = this.LJII;
                    if (c975960bVK2 != null) {
                        c975960bVK2.LJJIJIIJI = battleInfoResponse.battleCombos;
                        c975960bVK2.LJJJJZ = battleInfoResponse.battleFeatureFlags;
                    }
                    Map<Long, BattleTeamUserArmies> map5 = battleInfoResponse.teamArmies;
                    boolean z = false;
                    if ((map5 == null || map5.isEmpty() || (map3 = battleInfoResponse.teamBattleResult) == null || map3.isEmpty()) && ((map = battleInfoResponse.armies) == null || map.isEmpty() || (map2 = battleInfoResponse.resultMap) == null || map2.isEmpty())) {
                        LJJJJZI(this);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("audienceSyncBattleInfo, ");
                        sbLIZ4.append(battleInfoResponse);
                        C20441214yg.LJ("MultiMatchStateSettlingAudience", C2188811AlT.LIZIZ(sbLIZ4));
                    } else {
                        Map<Long, BattleTeamResult> mapLIZIZ = C125500dp.LIZIZ(battleInfoResponse);
                        BattleSetting battleSetting2 = battleInfoResponse.setting;
                        if (battleSetting2 != null) {
                            i = battleSetting2.status;
                        } else {
                            i = 2;
                        }
                        LJJJLIIL("room_enter_battle_info", enumC975850bV9, mapLIZIZ, i);
                        C973660bRc c973660bRc2 = C973660bRc.LIZ;
                        BattleSetting battleSetting3 = battleInfoResponse.setting;
                        if (battleSetting3 != null && battleSetting3.battleType == EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
                            z = true;
                        }
                        boolean z2 = !z;
                        C975960bVK c975960bVK3 = this.LJII;
                        if (c975960bVK3 != null) {
                            list = c975960bVK3.LJJIJ;
                        } else {
                            list = null;
                        }
                        String strLJJJLL = LJJJLL();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("settling_battle_info_");
                        sbLIZ5.append(enumC975850bV9.getSource());
                        c973660bRc2.LJJJLIIL(strLJJJLL, C2188811AlT.LIZIZ(sbLIZ5), list, z2, true);
                        int iLIZ = C970370bMJ.LIZ(enumC975850bV9);
                        C974540bT2 c974540bT2 = C974540bT2.LIZ;
                        Long l = battleInfoResponse.battleId;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        C975960bVK c975960bVK4 = this.LJII;
                        if (c975960bVK4 != null && (list2 = c975960bVK4.LJJIJ) != null) {
                            arrayList = new ArrayList(list2);
                        }
                        c974540bT2.LLFF(value, jLongValue, arrayList, iLIZ, arrayList2, false);
                        C975960bVK c975960bVK5 = this.LJII;
                        if (c975960bVK5 != null) {
                            j = c975960bVK5.LJ;
                        } else {
                            j = 0;
                        }
                        C974540bT2.LIZ.LJLZ(j, C915980Zwa.LJI().LJIIJ().getChannelId(), 2, null, null);
                        C975960bVK c975960bVK6 = this.LJII;
                        if (c975960bVK6 != null) {
                            j2 = c975960bVK6.LJ;
                        } else {
                            j2 = 0;
                        }
                        C974540bT2.LIZ.LJZI(j2, C915980Zwa.LJI().LJIIJ().getChannelId(), false, 2, false, false, null);
                    }
                } else {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("shouldn't be here,");
                    sbLIZ6.append(battleInfoResponse);
                    C20441214yg.LJ("MultiMatchStateSettlingAudience", C2188811AlT.LIZIZ(sbLIZ6));
                }
            }
            LinkMicBattleMessage linkMicBattleMessage = this.LIZLLL;
            if (linkMicBattleMessage != null) {
                if (linkMicBattleMessage.action == 5) {
                    LJJJZ(linkMicBattleMessage);
                }
                if (linkMicBattleMessage.action == 6) {
                    LJJJLZIJ(linkMicBattleMessage);
                }
            }
        }
        LJJJJIZL("MultiMatchStateSettlingAudience");
    }

    @Override // X.C975970bVL, X.InterfaceC975690bUt
    public final void LJI(EnumC975850bV9 enumC975850bV9) {
        super.LJI(enumC975850bV9);
        this.LJIIJ.removeCallbacksAndMessages(null);
    }

    public final void LJJJLZIJ(LinkMicBattleMessage linkMicBattleMessage) {
        Long lValueOf;
        int i;
        Long lValueOf2;
        Room roomInfo;
        User owner;
        if (linkMicBattleMessage != null) {
            Map mapLIZ = C125500dp.LIZ(linkMicBattleMessage);
            C975960bVK c975960bVK = this.LJII;
            if (c975960bVK != null) {
                lValueOf = Long.valueOf(c975960bVK.LJJJJJ());
                if (lValueOf != null && lValueOf.longValue() == 0) {
                    for (BattleTeamResult battleTeamResult : ((LinkedHashMap) mapLIZ).values()) {
                        List<BattleTeamUser> list = battleTeamResult.teamUsers;
                        if (list != null) {
                            Iterator<BattleTeamUser> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    BattleTeamUser next = it2.next();
                                    Long l = next.userId;
                                    InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
                                    if (interfaceC975520bUc != null && (roomInfo = interfaceC975520bUc.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null) {
                                        lValueOf2 = Long.valueOf(owner.getId());
                                    } else {
                                        lValueOf2 = null;
                                    }
                                    if (Intrinsics.LJFF(l, lValueOf2)) {
                                        if (next != null && (lValueOf = battleTeamResult.teamId) == null) {
                                            lValueOf = 1L;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                lValueOf = null;
            }
            BattleTeamResult battleTeamResult2 = (BattleTeamResult) ((LinkedHashMap) mapLIZ).get(lValueOf);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post MatchCutShortEvent currentResult = ");
            sbLIZ.append(battleTeamResult2);
            C20441214yg.LJIIIZ("MultiMatchStateSettlingAudience", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) LJIILJJIL();
            if (interfaceC976360bVy != null) {
                if (battleTeamResult2 != null) {
                    i = battleTeamResult2.result;
                } else {
                    i = 2;
                }
                interfaceC976360bVy.LJII(i);
            }
        }
        C975960bVK c975960bVK2 = this.LJII;
        if (c975960bVK2 != null) {
            c975960bVK2.LJIJJLI = true;
        }
        LJJJJZ("cut_short_msg", EnumC975850bV9.RESULT_FROM_CUT_SHORT_MESSAGE);
    }

    public final void LJJJZ(LinkMicBattleMessage linkMicBattleMessage) {
        int i;
        DataChannel dataChannel;
        C975960bVK c975960bVK = this.LJII;
        if (c975960bVK != null) {
            c975960bVK.LJIJJLI = false;
        }
        C974540bT2.LIZ.LLF(linkMicBattleMessage);
        List<BattleTeamResult> list = linkMicBattleMessage.teamBattleResult;
        if (list != null) {
            InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
            if (interfaceC975520bUc != null) {
                dataChannel = interfaceC975520bUc.getDataChannel();
            } else {
                dataChannel = null;
            }
            C974480bSw.LJJ(dataChannel, list, this.LJIIIZ, EnumC976420bW4.MSG_FINISH, false);
        }
        Map mapLJJIJIIJIL = C975970bVL.LJJIJIIJIL(linkMicBattleMessage);
        List list2 = linkMicBattleMessage.teamArmies;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        C976060bVU.LIZIZ(this, list2, mapLJJIJIIJIL, 0L, 0L, false, 28);
        LJIJJLI(linkMicBattleMessage.enigmaBattleSetting);
        C975960bVK c975960bVK2 = this.LJII;
        if (c975960bVK2 != null) {
            c975960bVK2.LJJIJIIJI = linkMicBattleMessage.battleCombos;
            c975960bVK2.LJJIIZI = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
        }
        Map<Long, BattleTeamResult> mapLIZ = C125500dp.LIZ(linkMicBattleMessage);
        EnumC975850bV9 enumC975850bV9 = EnumC975850bV9.RESULT_FROM_FINISH_MESSAGE;
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            i = battleSetting.status;
        } else {
            i = -1;
        }
        LJJJLIIL("finish_msg", enumC975850bV9, mapLIZ, i);
    }

    public final void LJJJJZ(String str, EnumC975850bV9 enumC975850bV9) {
        List<? extends TeamUsersInfo> list;
        List<? extends TeamUsersInfo> list2;
        Room roomInfo;
        EnumC919170a1j enumC919170a1jLJIIIZ;
        String str2 = "cut_short";
        if (!a0.LJJIIZI(str, "cut_short", false) && !a0.LJJIIZI(str, "list_change", false)) {
            str2 = "normal";
        }
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C974540bT2.LLIIII(str2, C970370bMJ.LJII());
        if (!Intrinsics.LJFF(str, "battle_info")) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            boolean zLJII = C970370bMJ.LJII();
            C975960bVK c975960bVK = this.LJII;
            if (c975960bVK != null) {
                list = c975960bVK.LJJIJ;
            } else {
                list = null;
            }
            String strLJJJLL = LJJJLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("settling_end_");
            sbLIZ.append(str);
            c973660bRc.LJJJLIIL(strLJJJLL, C2188811AlT.LIZIZ(sbLIZ), list, zLJII, false);
            boolean zLJII2 = C970370bMJ.LJII();
            C975960bVK c975960bVK2 = this.LJII;
            if (c975960bVK2 != null) {
                list2 = c975960bVK2.LJJIJ;
            } else {
                list2 = null;
            }
            InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
            if (interfaceC975520bUc != null) {
                roomInfo = interfaceC975520bUc.getRoomInfo();
            } else {
                roomInfo = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("settling_end_");
            sbLIZ2.append(str);
            c973660bRc.LJJJJZ(zLJII2, list2, null, roomInfo, C2188811AlT.LIZIZ(sbLIZ2));
            C955400ayA.LJJJJIZL();
            C970290bMB c970290bMB = C970290bMB.LIZ;
            C970290bMB.LJJIIJ(str);
            InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
            if (interfaceC975520bUc2 == null || (enumC919170a1jLJIIIZ = interfaceC975520bUc2.LJIIIZ()) == null) {
                enumC919170a1jLJIIIZ = EnumC919170a1j.MATCH_TYPE_1VN;
            }
            C974540bT2.LLD(str, enumC919170a1jLJIIIZ);
        }
        LJIJ(EnumC964170bCJ.MATCH_END, enumC975850bV9, this.LIZLLL, this.LJIILL);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL(java.lang.String r14, X.EnumC975850bV9 r15, java.util.Map<java.lang.Long, com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult> r16, int r17) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C976000bVO.LJJJLIIL(java.lang.String, X.0bV9, java.util.Map, int):void");
    }

    public C976000bVO(EnumC964170bCJ enumC964170bCJ, InterfaceC975520bUc interfaceC975520bUc, InterfaceC977310bXV interfaceC977310bXV, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse) {
        super(enumC964170bCJ, interfaceC975520bUc, interfaceC977310bXV, linkMicBattleMessage, battleInfoResponse);
        this.LJIILL = battleInfoResponse;
    }
}
