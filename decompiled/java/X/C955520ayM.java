package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0ayM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955520ayM {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(489));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(488));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(487));

    public static final ConcurrentHashMap<Long, List<Long>> LJ() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static List LJI() {
        List<Long> listZr2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).zr2();
        return listZr2 == null ? C13BV.INSTANCE : listZr2;
    }

    public static final void LIZ(Map<String, String> map) {
        ((HashMap) map).put("guest_cnt", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getGuestCount()));
    }

    public static final void LIZLLL(Map<String, String> map) {
        map.put("linker_mode", String.valueOf(C915980Zwa.LJII().Uh()));
    }

    public static List LJFF(long j) {
        List<C936770aU7> listLJJJJI = C915980Zwa.LJII().LJJJJI(j);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJI, 10));
        Iterator<C936770aU7> it2 = listLJJJJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LIZ));
        }
        return arrayList;
    }

    public static long LJII(long j) {
        if (j == C950220apo.LJFF()) {
            return C950220apo.LIZLLL();
        }
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(j);
        if (c954460aweLLILL != null) {
            return c954460aweLLILL.LJFF;
        }
        return 0L;
    }

    public static void LJIIIIZZ(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "mg";
        } else {
            str2 = "live";
        }
        C955400ayA.LLIILII("livesdk_disable_chmg_popup_click", C2097608Jq.LJIIIIZZ(new Pair("anchor_id", String.valueOf(C950220apo.LJ())), new Pair("show_period", str2), new Pair("click_position", str)));
    }

    public static void LIZIZ(Map map, long j, JoinGroupMessageExtra joinGroupMessageExtra) {
        Map<Long, JoinGroupMessageExtra.RivalGuestExtras> map2;
        Set<Map.Entry<Long, JoinGroupMessageExtra.RivalGuestExtras>> setEntrySet;
        ArrayList arrayList = new ArrayList();
        long jLIZLLL = C950220apo.LIZLLL();
        if (joinGroupMessageExtra != null && (map2 = joinGroupMessageExtra.rivalGuestsMap) != null && (setEntrySet = map2.entrySet()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((Number) ((Map.Entry) obj).getKey()).longValue() != jLIZLLL) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Iterator<JoinGroupMessageExtra.RivalGuestExtra> it3 = ((JoinGroupMessageExtra.RivalGuestExtras) ((Map.Entry) it2.next()).getValue()).rivalGuests.iterator();
                while (it3.hasNext()) {
                    arrayList.add(Long.valueOf(it3.next().userId));
                }
            }
        }
        HashMap map3 = (HashMap) map;
        map3.put("cohost_inviter_guest_cnt", String.valueOf(arrayList.size()));
        map3.put("cohost_inviter_guest_id_list", arrayList.toString());
        Long lValueOf = Long.valueOf(j);
        if (lValueOf != null) {
            ((ConcurrentHashMap) LIZ.getValue()).put(lValueOf, arrayList);
        }
        map3.put("cohost_invitee_guest_cnt", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getGuestCount()));
        map3.put("cohost_invitee_guest_id_list", LJI().toString());
    }

    public static void LIZJ(Map map, Room room, RivalExtraInfo rivalExtraInfo) {
        LinkerInfo linkerInfo;
        List<UserInfo> list;
        Long lValueOf;
        HashMap map2 = (HashMap) map;
        map2.put("cohost_inviter_guest_cnt", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getGuestCount()));
        map2.put("cohost_inviter_guest_id_list", LJI().toString());
        if (rivalExtraInfo != null && (linkerInfo = rivalExtraInfo.linkerInfo) != null && (list = linkerInfo.linkedGuestUsers) != null) {
            map2.put("cohost_invitee_guest_cnt", String.valueOf(list.size()));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<UserInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().user_id));
            }
            map2.put("cohost_invitee_guest_id_list", arrayList.toString());
            if (room != null && (lValueOf = Long.valueOf(room.getOwnerUserId())) != null) {
                ((ConcurrentHashMap) LIZ.getValue()).put(lValueOf, arrayList);
            }
        }
    }
}
