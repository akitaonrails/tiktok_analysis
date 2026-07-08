package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ppe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656880Ppe {
    public static final Map<String, String> LIZ(Aweme aweme) {
        String roomTitleAiSummary;
        Object obj;
        Object obj2;
        String roomTitle;
        String roomTitleAiSummary2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        User author = aweme.getAuthor();
        String roomTitleAiSummary3 = null;
        if (author != null) {
            roomTitleAiSummary = author.getRoomTitleAiSummary();
        } else {
            roomTitleAiSummary = null;
        }
        String str = "1";
        if (!TextUtils.isEmpty(roomTitleAiSummary)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_ai_room", obj);
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            roomTitleAiSummary3 = author2.getRoomTitleAiSummary();
        }
        if (!TextUtils.isEmpty(roomTitleAiSummary3)) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_ai_summary_load", obj2);
        if (!LIZIZ(aweme)) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_ai_summary_show", str);
        User author3 = aweme.getAuthor();
        String str2 = "";
        if (author3 == null || (roomTitle = author3.getRoomTitle()) == null) {
            roomTitle = "";
        }
        linkedHashMap.put("room_title", roomTitle);
        User author4 = aweme.getAuthor();
        if (author4 != null && (roomTitleAiSummary2 = author4.getRoomTitleAiSummary()) != null) {
            str2 = roomTitleAiSummary2;
        }
        linkedHashMap.put("ai_summary_content", str2);
        return linkedHashMap;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        String roomTitleAiSummary;
        String roomTitle;
        LiveRoomStruct liveRoomStructFinally = AwemeExtKt.getLiveRoomStructFinally(aweme);
        if (liveRoomStructFinally != null && liveRoomStructFinally.hasCommerceGoods) {
            return false;
        }
        C01GW c01gw = C275130AqN.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 0) {
            return false;
        }
        int iIntValue = ((Number) c01gw.getValue()).intValue();
        String roomTitle2 = null;
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                User author = aweme.getAuthor();
                if (author != null) {
                    roomTitle = author.getRoomTitle();
                } else {
                    roomTitle = null;
                }
                if (!TextUtils.isEmpty(roomTitle)) {
                    return false;
                }
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    roomTitle2 = author2.getRoomTitleAiSummary();
                }
                if (!TextUtils.isEmpty(roomTitle2)) {
                    return true;
                }
            }
            return false;
        }
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            roomTitleAiSummary = author3.getRoomTitleAiSummary();
        } else {
            roomTitleAiSummary = null;
        }
        if (!TextUtils.isEmpty(roomTitleAiSummary)) {
            return true;
        }
        User author4 = aweme.getAuthor();
        if (author4 != null) {
            roomTitle2 = author4.getRoomTitle();
        }
        TextUtils.isEmpty(roomTitle2);
        return false;
    }
}
