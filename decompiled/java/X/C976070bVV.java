package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bVV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976070bVV {
    public static final void LIZ(C975970bVL c975970bVL, int i, Map<Long, BattleTeamResult> map, long j, int i2, long j2) {
        boolean z;
        long jLongValue;
        Room roomInfo;
        long j3;
        DataChannel dataChannel;
        C975990bVN c975990bVN;
        Long lValueOf;
        Collection<BattleTeamResult> collectionValues;
        Room roomInfo2;
        User owner;
        EnumC973680bRe enumC973680bRe;
        Room roomInfo3;
        User owner2;
        boolean z2 = false;
        if (map != null && !map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dealResult, Battle result map is null or empty, scene = ");
            sbLIZ.append(i);
            sbLIZ.append(", battleStatus = ");
            sbLIZ.append(i2);
            C20441214yg.LJIIIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        EnumC975850bV9 enumC975850bV9 = EnumC975850bV9.PUNISH_FROM_FINISH_RESPONSE;
        if (!c975970bVL.LJIILIIL) {
            if (i != 1) {
                if (i != 106) {
                    if (i != 103 && i != 104) {
                        enumC973680bRe = EnumC973680bRe.TIME_OUT;
                    } else {
                        InterfaceC975520bUc interfaceC975520bUc = c975970bVL.LIZIZ;
                        if (interfaceC975520bUc != null && (roomInfo3 = interfaceC975520bUc.getRoomInfo()) != null && (owner2 = roomInfo3.getOwner()) != null && j == owner2.getId()) {
                            enumC973680bRe = EnumC973680bRe.POSITIVE_OVER;
                        } else {
                            enumC973680bRe = EnumC973680bRe.NEGATIVE_OVER;
                        }
                    }
                } else {
                    enumC973680bRe = EnumC973680bRe.TIME_OUT;
                }
            } else {
                enumC975850bV9 = EnumC975850bV9.PUNISH_FROM_FINISH_MESSAGE;
                enumC973680bRe = EnumC973680bRe.TIME_OUT;
            }
            c975970bVL.LJJJ(Boolean.valueOf(C976040bVS.LJIIZILJ(j2)), enumC973680bRe);
        }
        C975960bVK c975960bVK = c975970bVL.LJII;
        if (c975960bVK != null) {
            jLongValue = c975960bVK.LJJJJJ();
        } else {
            jLongValue = 0;
        }
        if (jLongValue == 0) {
            InterfaceC975520bUc interfaceC975520bUc2 = c975970bVL.LIZIZ;
            if (interfaceC975520bUc2 != null && (roomInfo2 = interfaceC975520bUc2.getRoomInfo()) != null && (owner = roomInfo2.getOwner()) != null) {
                lValueOf = Long.valueOf(owner.getId());
            } else {
                lValueOf = null;
            }
            if (map != null && (collectionValues = map.values()) != null) {
                for (BattleTeamResult battleTeamResult : collectionValues) {
                    List<BattleTeamUser> list = battleTeamResult.teamUsers;
                    if (list != null) {
                        Iterator<BattleTeamUser> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                BattleTeamUser next = it2.next();
                                if (Intrinsics.LJFF(next.userId, lValueOf)) {
                                    if (next != null) {
                                        Long l = battleTeamResult.teamId;
                                        if (l != null) {
                                            jLongValue = l.longValue();
                                        } else {
                                            jLongValue = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C974540bT2.LIZ.LLFZ("uid_error", true);
        }
        if (map == null) {
            return;
        }
        c975970bVL.LJIILIIL = true;
        InterfaceC975520bUc interfaceC975520bUc3 = c975970bVL.LIZIZ;
        if (interfaceC975520bUc3 == null) {
            C20441214yg.LJIIIZ("MultiMatchStateMatching", "dealResult, Battle state is End");
            return;
        }
        EnumC964170bCJ enumC964170bCJY2 = interfaceC975520bUc3.Y2();
        if (enumC964170bCJY2 == null) {
            enumC964170bCJY2 = EnumC964170bCJ.NONE;
        }
        if (enumC964170bCJY2.compareTo(EnumC964170bCJ.PUNISH_START) >= 0) {
            C20441214yg.LJIIIZ("MultiMatchStateMatching", "dealResult, Battle state is punish, return");
            return;
        }
        InterfaceC975520bUc interfaceC975520bUc4 = c975970bVL.LIZIZ;
        if (interfaceC975520bUc4 != null) {
            roomInfo = interfaceC975520bUc4.getRoomInfo();
        } else {
            roomInfo = null;
        }
        if (!Room.isValid(roomInfo)) {
            C20441214yg.LJIIIZ("MultiMatchStateMatching", "dealResult, current room is invalid");
        }
        BattleTeamResult battleTeamResult2 = map.get(Long.valueOf(jLongValue));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, BattleTeamResult> entry : map.entrySet()) {
            if (entry.getKey().longValue() != jLongValue) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (battleTeamResult2 == null) {
            C20441214yg.LJ("MultiMatchStateMatching", "currentAnchorResult is null, return");
            return;
        }
        C975960bVK c975960bVK2 = c975970bVL.LJII;
        if (c975960bVK2 != null && (c975990bVN = c975960bVK2.LJJJLZIJ) != null) {
            c975990bVN.LJIIIIZZ(map);
        }
        C973890bRz.LIZJ = battleTeamResult2;
        C973890bRz.LIZLLL = linkedHashMap;
        Map<String, Object> map2 = C015G.LIZ;
        C015G.LIZ(battleTeamResult2, "livesdk_multi_match_host_team_result", C2097908Jt.LIZJ(new Pair("user_side", "host")));
        C015G.LIZ(linkedHashMap, "livesdk_multi_match_guest_team_result", C2097908Jt.LIZJ(new Pair("user_side", "host")));
        if (battleTeamResult2.result == 2) {
            c975970bVL.LJIJ(EnumC964170bCJ.DRAW, EnumC975850bV9.DRAW_FROM_FINISH_REQUEST, null, null);
        }
        C975960bVK c975960bVK3 = c975970bVL.LJII;
        if (c975960bVK3 != null) {
            j3 = c975960bVK3.LJJJJIZL;
        } else {
            j3 = 0;
        }
        C973890bRz.LJII = j3;
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null) {
            interfaceC975810bV5LIZLLL.LJIIL();
        }
        if (battleTeamResult2.result != 2) {
            if (i2 == 2) {
                c975970bVL.LJJIJ("finish_draw", false);
                C974540bT2.LIZ.LLFZ("opposite_leave", true);
                return;
            }
            InterfaceC975520bUc interfaceC975520bUc5 = c975970bVL.LIZIZ;
            if (interfaceC975520bUc5 != null && (dataChannel = interfaceC975520bUc5.getDataChannel()) != null) {
                if (battleTeamResult2.result == 0) {
                    z2 = true;
                }
                dataChannel.zW(BattleIsCurrentWinChannel.class, Boolean.valueOf(z2));
            }
            EnumC970440bMQ.BATTLE_INFO_SCENE_RESUME.getType();
            c975970bVL.LJIJ(EnumC964170bCJ.PUNISH_START, enumC975850bV9, null, null);
        }
    }
}
