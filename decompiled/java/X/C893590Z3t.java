package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;

/* JADX INFO: renamed from: X.0Z3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893590Z3t {
    public static void LIZ(C869590Y9l c869590Y9l) {
        String eventId;
        String str;
        String str2;
        String str3;
        C0I0B.LJFF.LIZIZ();
        ShareLiveEventContent shareLiveEventContent = (ShareLiveEventContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareLiveEventContent.class);
        if (shareLiveEventContent != null && (eventId = shareLiveEventContent.getEventId()) != null && eventId.length() != 0) {
            boolean zLJJIJIIJIL = C0ZDX.LJJIJIIJIL(c869590Y9l);
            boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l);
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("enter_from", "chat");
            c830490Whz.put("live_event_id", eventId);
            if (shareLiveEventContent.isPaidEvent()) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            c830490Whz.put("is_free_event", str);
            c830490Whz.put("live_event_cnt", String.valueOf(1));
            c830490Whz.put("action_type", "show");
            if (zLJJIJIIJIL) {
                str2 = "group_chat";
            } else {
                str2 = "single_chat";
            }
            c830490Whz.put("event_page", str2);
            c830490Whz.put("conversation_id", c869590Y9l.getConversationId());
            c830490Whz.put("live_event_type", shareLiveEventContent.getEventType());
            c830490Whz.put("main_live_event_id", shareLiveEventContent.getEventId());
            c830490Whz.put("is_multi_event", CardStruct.IStatusCode.DEFAULT);
            c830490Whz.put("anchor_id", String.valueOf(c869590Y9l.getSender()));
            if (zLJJJJIZL) {
                str3 = "livesdk_live_event_anchor_entrance_show";
            } else {
                str3 = "livesdk_live_event_user_entrance_show";
            }
            C20684815ws.LJIILLIIL(str3, c830490Whz);
        }
    }
}
