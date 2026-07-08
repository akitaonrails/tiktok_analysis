package X;

import com.ss.android.ugc.aweme.ab.LiveNewAiSummaryConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveAiSummary;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCardCommentBox;
import com.ss.android.ugc.aweme.feed.model.live.WatchReasonV2;
import com.ss.android.ugc.aweme.feed.model.live.WatchReasonV2Item;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0TKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745090TKp {
    public static final C745090TKp LIZ = new C745090TKp();

    public static String LIZ(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        WatchReasonV2 watchReasonV2;
        List<WatchReasonV2Item> list;
        WatchReasonV2Item watchReasonV2Item;
        List<Integer> list2;
        String strLJJLIIIJ;
        if (c1aca == null || (liveRoomStruct = c1aca.LIZJ) == null || (watchReasonV2 = liveRoomStruct.watchReasonV2) == null || (list = watchReasonV2.reasons) == null || (watchReasonV2Item = (WatchReasonV2Item) C13LP.LJJJLL(list)) == null || (list2 = watchReasonV2Item.tagIds) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list2, "+", null, null, 0, null, null, 62)) == null) {
            return "";
        }
        return strLJJLIIIJ;
    }

    public static Map LIZIZ(C1ACA c1aca, AbstractC745150TKv abstractC745150TKv) {
        String str;
        LiveRoomStruct liveRoomStruct;
        PreviewCardCommentBox previewCardCommentBox;
        LiveRoomStruct liveRoomStruct2;
        LiveAiSummary liveAiSummary;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1aca != null && (liveRoomStruct2 = c1aca.LIZJ) != null && (liveAiSummary = liveRoomStruct2.getLiveAiSummary()) != null) {
            linkedHashMap.put("is_ai_room", liveAiSummary.aiLiveSummaryVersions);
            LiveNewAiSummaryConfig liveNewAiSummaryConfig = C0TL7.LIZ;
            boolean z = C0TL7.LIZ(c1aca.LIZJ).enable;
            String str2 = CardStruct.IStatusCode.DEFAULT;
            String str3 = "";
            if (z) {
                linkedHashMap.put("is_ai_summary_show", String.valueOf(c1aca.LJJZZIII));
                linkedHashMap.put("ai_summary_ui", String.valueOf(liveAiSummary.aiLiveSummaryType));
                List<String> list = liveAiSummary.aiSummaryList;
                if (list != null && !list.isEmpty()) {
                    str2 = "1";
                }
                linkedHashMap.put("is_ai_summary_load", str2);
                linkedHashMap.put("ai_summary_content", liveAiSummary.aiSummaryList.toString());
                String str4 = liveAiSummary.resultKey;
                if (str4 == null) {
                    str4 = "";
                }
                linkedHashMap.put("result_key", str4);
                String str5 = liveAiSummary.audienceSideTitleLanguage;
                if (str5 != null) {
                    str3 = str5;
                }
                linkedHashMap.put("aisummary_language", str3);
            } else if (C0TL6.LIZ().enable) {
                String str6 = liveAiSummary.roomLlmTitle;
                if (str6 != null) {
                    str3 = str6;
                }
                linkedHashMap.put("ai_summary_content", str3);
                if (str6 != null && C500260Jjc.LJJIIZ(str6)) {
                    str2 = "1";
                }
                linkedHashMap.put("is_ai_summary_load", str2);
                linkedHashMap.put("is_ai_summary_show", String.valueOf(c1aca.LJJZZIII));
            }
        }
        linkedHashMap.put("ai_summary_second_label", LIZ(c1aca));
        if (!(abstractC745150TKv instanceof C745140TKu) ? !(!(abstractC745150TKv instanceof C745170TKx) ? c1aca == null || !c1aca.LJJZ : c1aca == null || !c1aca.LJJZZI) : !(((c1aca == null || !c1aca.LJJZ) && !C745020TKi.LIZ(c1aca, null, 10)) || ((C745140TKu) abstractC745150TKv).LIZ)) {
            if (C745010TKh.LIZ()) {
                str = "ai_summary_profile_and_comment_bar";
            } else {
                str = "realtime_comment_bar";
            }
            linkedHashMap.put("cmt_interact_preview_type", str);
            if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null && (previewCardCommentBox = liveRoomStruct.previewCardCommentBox) != null) {
                linkedHashMap.put("comment_box_copy_starling_key", previewCardCommentBox.starlingKey);
                linkedHashMap.put("comment_box_copy", previewCardCommentBox.content);
            }
        }
        return linkedHashMap;
    }
}
