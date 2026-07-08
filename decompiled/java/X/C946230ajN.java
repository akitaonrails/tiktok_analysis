package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ajN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946230ajN {
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static long LJ = -1;
    public static String LJIIIZ = "";
    public static final Map<Long, HashSet<Long>> LJIIJ = new LinkedHashMap();
    public static final Map<Long, HashSet<Long>> LJIIJJI = new LinkedHashMap();

    public static void LIZJ() {
        C20441214yg.LJIIIZ("MatchWithGuestTracking", "start: ");
        C20441214yg.LJIIIZ("MatchWithGuestTracking", "reset: ");
        LIZ = -1L;
        LIZLLL = -1L;
        LJ = -1L;
        LJFF = 0L;
        LJI = 0L;
        LJIIIIZZ = 0L;
        LJIIIZ = "";
        C20441214yg.LJIIIZ("MatchWithGuestTracking", "resetGuestMapForPK: ");
        LIZJ = -1L;
        ((LinkedHashMap) LJIIJ).clear();
        LIZIZ = -1L;
        ((LinkedHashMap) LJIIJJI).clear();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        LJII = room != null ? room.getId() : 0L;
        LIZ = C158B.LIZ();
        LIZJ = C158B.LIZ();
        if (C915980Zwa.LJII().LJJLIIIJJI()) {
            long jLIZ = C158B.LIZ();
            LJI(jLIZ);
            if (!C915980Zwa.LJII().LJJJJI(C950220apo.LIZLLL()).isEmpty()) {
                LJII(jLIZ);
            }
            Iterator<C936770aU7> it2 = C915980Zwa.LJII().LJJIIJZLJL().iterator();
            while (it2.hasNext()) {
                LJ(it2.next());
            }
        }
    }

    public static void LIZLLL() {
        C20441214yg.LJIIIZ("MatchWithGuestTracking", "startPunish: ");
        LIZIZ = C158B.LIZ();
        if (C915980Zwa.LJII().LJJLIIIJJI()) {
            Iterator<C936770aU7> it2 = C915980Zwa.LJII().LJJIIJZLJL().iterator();
            while (it2.hasNext()) {
                LJFF(it2.next());
            }
        }
    }

    public static boolean LIZIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isVaild: duration ");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("MatchWithGuestTracking", C2188811AlT.LIZIZ(sbLIZ));
        if (j >= 0 && j < 3000000) {
            return true;
        }
        return false;
    }

    public static void LJ(C936770aU7 c936770aU7) {
        Long l;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestListPK: ");
        sbLIZ.append(LIZJ);
        sbLIZ.append(", ");
        sbLIZ.append(c936770aU7.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(c936770aU7.LIZ);
        C20441214yg.LJIIIZ("MatchWithGuestTracking", C2188811AlT.LIZIZ(sbLIZ));
        if (LIZJ > -1 && (l = c936770aU7.LIZIZ) != null) {
            long jLongValue = l.longValue();
            Map<Long, HashSet<Long>> map = LJIIJ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.get(Long.valueOf(jLongValue)) == null) {
                map.put(Long.valueOf(jLongValue), new HashSet<>());
            }
            HashSet hashSet = (HashSet) linkedHashMap.get(Long.valueOf(jLongValue));
            if (hashSet != null) {
                hashSet.add(Long.valueOf(c936770aU7.LIZ));
            }
        }
    }

    public static void LJFF(C936770aU7 c936770aU7) {
        Long l;
        if (LIZIZ > -1 && (l = c936770aU7.LIZIZ) != null) {
            long jLongValue = l.longValue();
            Map<Long, HashSet<Long>> map = LJIIJJI;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.get(Long.valueOf(jLongValue)) == null) {
                map.put(Long.valueOf(jLongValue), new HashSet<>());
            }
            HashSet hashSet = (HashSet) linkedHashMap.get(Long.valueOf(jLongValue));
            if (hashSet != null) {
                hashSet.add(Long.valueOf(c936770aU7.LIZ));
            }
        }
    }

    public static void LJI(long j) {
        if (LIZ > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateWatchGuest: now ");
            sbLIZ.append(j);
            C20441214yg.LJIIIZ("MatchWithGuestTracking", C2188811AlT.LIZIZ(sbLIZ));
            long j2 = LIZLLL;
            if (j2 > 0) {
                LJFF += j - j2;
            }
            LIZLLL = j;
        }
    }

    public static void LJII(long j) {
        if (LIZ > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateWatchOwnGuest: now: ");
            sbLIZ.append(j);
            C20441214yg.LJIIIZ("MatchWithGuestTracking", C2188811AlT.LIZIZ(sbLIZ));
            long j2 = LJ;
            if (j2 > 0) {
                LJI += j - j2;
            }
            LJ = j;
        }
    }

    public static void LIZ(Map map, boolean z) {
        Map<Long, HashSet<Long>> map2;
        Map<Long, HashSet<Long>> map3;
        int size;
        Integer numValueOf;
        if (C948770anT.LJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAllAccumulatedGuests: ");
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("MatchWithGuestTracking", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                map2 = LJIIJ;
            } else {
                map2 = LJIIJJI;
            }
            List listLJIJJLI = C15438062q.LJIJJLI(((LinkedHashMap) map2).values());
            long j = LJII;
            if (z) {
                map3 = LJIIJ;
            } else {
                map3 = LJIIJJI;
            }
            HashSet<Long> hashSet = map3.get(Long.valueOf(j));
            ArrayList arrayList = (ArrayList) listLJIJJLI;
            map.put("accu_both_guest_cnt", String.valueOf(arrayList.size()));
            if (hashSet != null) {
                size = hashSet.size();
            } else {
                size = 0;
            }
            map.put("accu_guest_cnt", String.valueOf(size));
            map.put("accu_guest_id_list", C13LP.LLIFFJFJJ(listLJIJJLI).toString());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addWatchAccumulatedGuests: ");
            sbLIZ2.append(LJII);
            sbLIZ2.append(", ");
            sbLIZ2.append(arrayList.size());
            sbLIZ2.append(", ");
            if (hashSet != null) {
                numValueOf = Integer.valueOf(hashSet.size());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            C20441214yg.LJIIIZ("MatchWithGuestTracking", C2188811AlT.LIZIZ(sbLIZ2));
            if (z) {
                C20441214yg.LJIIIZ("MatchWithGuestTracking", "resetGuestMapForPK: ");
                LIZJ = -1L;
                ((LinkedHashMap) LJIIJ).clear();
            } else {
                LIZIZ = -1L;
                ((LinkedHashMap) LJIIJJI).clear();
            }
        }
    }
}
