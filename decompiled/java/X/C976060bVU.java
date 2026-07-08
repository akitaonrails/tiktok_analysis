package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.match.business.event.BattleEnigmaEntranceAnimEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleEnigmaShortTouchEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleEnigmaWindowIconEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpRightListChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0bVU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976060bVU {
    public static final void LIZ(C975970bVL c975970bVL, Map<Long, BattleUserArmies> map, boolean z, long j) {
        long ownerUserId;
        long jLJJJJJ;
        boolean z2;
        DataChannel dataChannel;
        C975960bVK c975960bVKM3;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long j2 = 0;
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 == null) {
            return;
        }
        for (Map.Entry<Long, BattleUserArmies> entry : map.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            if (z) {
                jLJJJJJ = ownerUserId;
            } else {
                jLJJJJJ = interfaceC973730bRjYf2.LJJJJJ();
            }
            boolean z3 = true;
            if (jLongValue == jLJJJJJ) {
                z2 = true;
            } else {
                z2 = false;
            }
            BattleUserArmies value = entry.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update enigma info, key = ");
            sbLIZ.append(entry.getKey().longValue());
            sbLIZ.append(" uv = ");
            sbLIZ.append(value.hostEnigmaUv);
            sbLIZ.append(", score = ");
            sbLIZ.append(value.hostEnigmaScore);
            C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
            if (value.hostEnigmaScore <= j2) {
                z3 = false;
            }
            InterfaceC975520bUc interfaceC975520bUc = c975970bVL.LIZIZ;
            if (interfaceC975520bUc != null) {
                dataChannel = interfaceC975520bUc.getDataChannel();
            } else {
                dataChannel = null;
            }
            if (z3 && C915980Zwa.LJFF().Nt() && dataChannel != null) {
                dataChannel.LC0(BattleEnigmaWindowIconEvent.class, entry.getKey());
            }
            if (z2) {
                long jLJJJJ = interfaceC973730bRjYf2.LJJJJ();
                long jLJIJJ = interfaceC973730bRjYf2.LJIJJ();
                interfaceC973730bRjYf2.LJJLIIIJILLIZJL(value.hostEnigmaUv);
                interfaceC973730bRjYf2.LJJLIIIJL(value.hostEnigmaScore);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("update self enigma info, key = ");
                sbLIZ2.append(entry.getKey().longValue());
                sbLIZ2.append(" uv = ");
                sbLIZ2.append(value.hostEnigmaUv);
                sbLIZ2.append(", score = ");
                sbLIZ2.append(value.hostEnigmaScore);
                sbLIZ2.append(", currUv = ");
                sbLIZ2.append(jLJJJJ);
                sbLIZ2.append(", currScore = ");
                sbLIZ2.append(jLJIJJ);
                sbLIZ2.append(", model = ");
                InterfaceC975520bUc interfaceC975520bUc2 = c975970bVL.LIZIZ;
                if (interfaceC975520bUc2 != null) {
                    c975960bVKM3 = interfaceC975520bUc2.m3();
                } else {
                    c975960bVKM3 = null;
                }
                sbLIZ2.append(c975960bVKM3);
                C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ2));
                if (z3 && C915980Zwa.LJFF().Nt()) {
                    j2 = 0;
                    if (jLJJJJ == 0 && dataChannel != null) {
                        dataChannel.LC0(BattleEnigmaEntranceAnimEvent.class, Long.valueOf(j));
                    }
                    long j3 = value.hostEnigmaUv;
                    if (j3 > jLJJJJ && dataChannel != null) {
                        dataChannel.LC0(BattleEnigmaShortTouchEvent.class, new Pair(Long.valueOf(j3), Long.valueOf(j)));
                    }
                } else {
                    j2 = 0;
                }
            }
        }
    }

    public static final void LIZJ(C975970bVL c975970bVL, long j, long j2, long j3) {
        C976480bWA c976480bWA;
        long j4;
        ArrayList arrayList;
        MutableLiveData<List<C976480bWA>> mutableLiveData;
        List<C976480bWA> value;
        boolean z;
        long j5;
        DataChannel dataChannel;
        List list;
        List list2;
        C976480bWA c976480bWA2;
        C976480bWA c976480bWA3;
        MutableLiveData<List<C976480bWA>> mutableLiveData2;
        List<C976480bWA> value2;
        MutableLiveData<List<C976480bWA>> mutableLiveData3;
        List<C976480bWA> value3;
        C976480bWA next;
        C975960bVK c975960bVK = c975970bVL.LJII;
        Long lValueOf = null;
        if (c975960bVK != null && (mutableLiveData3 = c975960bVK.LJJJLIIL) != null && (value3 = mutableLiveData3.getValue()) != null) {
            Iterator<C976480bWA> it2 = value3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZ == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c976480bWA = next;
        } else {
            c976480bWA = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update current anchor score& contributionList , ");
        sbLIZ.append(c976480bWA);
        C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        long j6 = 0;
        if (c976480bWA != null) {
            j4 = c976480bWA.LIZIZ;
            j6 = c976480bWA.LIZJ;
        } else {
            j4 = 0;
        }
        C978270bZ3 c978270bZ3 = new C978270bZ3(j4, j6, 24);
        C975960bVK c975960bVK2 = c975970bVL.LJII;
        if (c975960bVK2 != null && (mutableLiveData2 = c975960bVK2.LJJJLIIL) != null && (value2 = mutableLiveData2.getValue()) != null) {
            arrayList = new ArrayList();
            for (C976480bWA c976480bWA4 : value2) {
                if (c976480bWA4.LIZ != j) {
                    arrayList.add(c976480bWA4);
                }
            }
        } else {
            arrayList = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update guest Anchor Score = ");
        if (arrayList != null && (c976480bWA3 = (C976480bWA) C13LP.LJJJLL(arrayList)) != null) {
            lValueOf = Long.valueOf(c976480bWA3.LIZIZ);
        }
        sbLIZ2.append(lValueOf);
        C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC975520bUc interfaceC975520bUc = c975970bVL.LIZIZ;
        if (interfaceC975520bUc != null && (dataChannel = interfaceC975520bUc.getDataChannel()) != null) {
            dataChannel.zW(BattleLeftScoreChannel.class, c978270bZ3);
            if (c976480bWA == null || (list = c976480bWA.LJI) == null) {
                list = C13BV.INSTANCE;
            }
            dataChannel.zW(BattleMvpLeftListChannel.class, list);
            if (!C970370bMJ.LJ() || (LiveMatchDropOffSetting.INSTANCE.isEnable() && C970370bMJ.LJIIIZ())) {
                if (arrayList == null || (c976480bWA2 = (C976480bWA) C13LP.LJJJLL(arrayList)) == null || (list2 = c976480bWA2.LJI) == null) {
                    list2 = C13BV.INSTANCE;
                }
                dataChannel.zW(BattleMvpRightListChannel.class, list2);
            }
        }
        C975960bVK c975960bVK3 = c975970bVL.LJII;
        if (c975960bVK3 != null && (mutableLiveData = c975960bVK3.LJJJLIIL) != null && (value = mutableLiveData.getValue()) != null) {
            for (C976480bWA c976480bWA5 : value) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("update hostArmies, ");
                sbLIZ3.append(c976480bWA5);
                sbLIZ3.append(", user = ");
                sbLIZ3.append(c976480bWA5.LIZ);
                sbLIZ3.append(",  rank = ");
                sbLIZ3.append(c976480bWA5.LIZLLL);
                C20441214yg.LIZIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ3));
                InterfaceC976360bVy interfaceC976360bVy = (InterfaceC976360bVy) c975970bVL.LJIILJJIL();
                if (interfaceC976360bVy != null) {
                    List<C976800bWg> list3 = c976480bWA5.LJFF;
                    if (c976480bWA5.LIZ == j) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C915980Zwa.LJFF().Nt()) {
                        j5 = c976480bWA5.LJ;
                    } else {
                        j5 = c976480bWA5.LIZLLL;
                    }
                    interfaceC976360bVy.LJJIJIL(j5, list3, z, false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Type inference failed for: r3v41, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v13, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v12, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C975970bVL r26, java.util.List r27, java.util.Map r28, long r29, long r31, boolean r33, int r34) {
        /*
            Method dump skipped, instruction units count: 1637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C976060bVU.LIZIZ(X.0bVL, java.util.List, java.util.Map, long, long, boolean, int):void");
    }
}
