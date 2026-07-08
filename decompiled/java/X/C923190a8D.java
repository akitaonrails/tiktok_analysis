package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a8D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923190a8D {
    public static boolean LIZ;
    public static int LIZIZ;
    public static final List<Long> LIZJ = new ArrayList();
    public static boolean LIZLLL;
    public static boolean LJ;

    public static Map LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C01Z4.LIZ(null, linkedHashMap);
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        linkedHashMap.put("is_guest_connection", (multiGuestDataHolder == null || multiGuestDataHolder.LJJIFFI != 0) ? "1" : CardStruct.IStatusCode.DEFAULT);
        return linkedHashMap;
    }

    public static void LIZLLL() {
        if (LIZ) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_guest_suggested_list_show");
        c474500IjALIZ.LJJIIZI(LIZ());
        c474500IjALIZ.LJJII(Integer.valueOf(LIZIZ), "suggested_guest_num");
        c474500IjALIZ.LIZ();
        ConcurrentHashSet<String> concurrentHashSet = C924950aB3.LIZ;
        C924950aB3.LIZJ("outroom_recommend_user", LIZIZ, null, null, 60);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_multi_anchor_guest_suggested_list_show, size: ");
        sbLIZ.append(LIZIZ);
        C20441214yg.LIZIZ("MultiGuestSuggestUserReporter", C2188811AlT.LIZIZ(sbLIZ));
        LIZ = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZIZ(LinkPlayerInfo linkPlayerInfo) {
        boolean z;
        List<String> list;
        String str;
        String str2;
        List<String> list2 = linkPlayerInfo.recommendTagList;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (list = linkPlayerInfo.recommendTagList) != null && (str = (String) ListProtector.get(list, 0)) != null) {
            switch (str.hashCode()) {
                case -383734187:
                    if (!str.equals("ttlive_suggestedGuests_hostManageGuestsSheet_suggestedSection_followerLabel")) {
                    }
                    break;
                case -218021047:
                    if (str.equals("random_match")) {
                    }
                    break;
                case 301801502:
                    if (!str.equals("follower")) {
                    }
                    break;
                case 576085804:
                    str2 = "gifter_lv";
                    if (!str.equals("gifter_lv")) {
                    }
                    break;
                case 868947377:
                    str2 = "top5_viewer";
                    if (!str.equals("top5_viewer")) {
                    }
                    break;
                case 1708091124:
                    str2 = "recent_guest";
                    if (!str.equals("recent_guest")) {
                    }
                    break;
            }
            return "";
        }
        return "";
    }

    public static void LIZJ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_guest_suggested_panel");
        c474500IjALIZ.LJJIIZI(LIZ());
        c474500IjALIZ.LJJII(str, "action_type");
        if (Intrinsics.LJFF(str, "click")) {
            new C927240aEk("anchorLiveHome", "emptyGuideSuggest").LIZ();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_multi_anchor_guest_suggested_panel, actionType: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestSuggestUserReporter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJFF(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_guest_suggested_bubble");
        c474500IjALIZ.LJJIIZI(LIZ());
        c474500IjALIZ.LJJII(str, "action_type");
        Pair[] pairArr = {new Pair("anchorLiveHome", "suggestedBubble")};
        C945340ahw c945340ahw = new C945340ahw(c474500IjALIZ);
        c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
        c945340ahw.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_multi_anchor_guest_suggested_bubble, actionType: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestSuggestUserReporter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJI(String str) {
        if (LIZLLL && Intrinsics.LJFF(str, "show")) {
            return;
        }
        if (LJ && Intrinsics.LJFF(str, "click")) {
            return;
        }
        if (Intrinsics.LJFF(str, "show")) {
            LIZLLL = true;
        }
        if (Intrinsics.LJFF(str, "click")) {
            LJ = true;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_guest_suggested_tab");
        c474500IjALIZ.LJJIIZI(LIZ());
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_multi_anchor_guest_suggested_tab, actionType: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestSuggestUserReporter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJ(String str, LinkPlayerInfo linkPlayerInfo, int i, int i2, long j, String str2, String str3) {
        ArrayList arrayList = (ArrayList) LIZJ;
        String str4 = "show";
        if (arrayList.contains(Long.valueOf(linkPlayerInfo.mUser.getId())) && Intrinsics.LJFF(str, "show")) {
            return;
        }
        if (Intrinsics.LJFF(str, "show")) {
            arrayList.add(Long.valueOf(linkPlayerInfo.mUser.getId()));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_guest_suggested");
        c474500IjALIZ.LJJIIZI(LIZ());
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(LIZIZ(linkPlayerInfo), "suggested_reason");
        c474500IjALIZ.LJJII(String.valueOf(linkPlayerInfo.mUser.getId()), "guest_id");
        c474500IjALIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportSuggestUserShowOrClick, user name: ");
        sbLIZ.append(linkPlayerInfo.mUser.getNickName());
        sbLIZ.append(", actionType: ");
        sbLIZ.append(str);
        sbLIZ.append(", suggested_reason: ");
        sbLIZ.append(LIZIZ(linkPlayerInfo));
        C20441214yg.LIZIZ("MultiGuestSuggestUserReporter", C2188811AlT.LIZIZ(sbLIZ));
        ConcurrentHashSet<String> concurrentHashSet = C924950aB3.LIZ;
        String idStr = linkPlayerInfo.mUser.getIdStr();
        if (!Intrinsics.LJFF(str, "show")) {
            str4 = "invite";
        }
        C924950aB3.LIZLLL(new C924960aB4("outroom_recommend_user", str4, i2, i, "normal", idStr, null, null, null, null, null, null, Long.valueOf(j), str2, C920500a3s.LIZ, null, null, null, null, str3, linkPlayerInfo.trackMap, null, 10457024));
    }
}
