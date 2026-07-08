package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZCW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZCW {
    public static final C0ZCW LIZ = new C0ZCW();

    public static String LIZ(Integer num) {
        int value = C0ZCX.FilteredReasonRisk.getValue();
        if (num != null && num.intValue() == value) {
            return "model";
        }
        int value2 = C0ZCX.FilteredRequestKeyword.getValue();
        if (num != null && num.intValue() == value2) {
            return "filtered_keyword";
        }
        int value3 = C0ZCX.FilteredReasonContentRisk.getValue();
        if (num != null && num.intValue() == value3) {
            return "content_model";
        }
        return "";
    }

    public static String LIZIZ(C869590Y9l c869590Y9l) {
        int iIntValue;
        Integer numLJIIJJI;
        String str = c869590Y9l.getLocalExt().get("s:inbox_page_category");
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        EnumC895750ZCb enumC895750ZCbFromValue = EnumC895750ZCb.fromValue(iIntValue);
        if (enumC895750ZCbFromValue != null) {
            int i = C895740ZCa.LIZ[enumC895750ZCbFromValue.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "filtered_message";
                    }
                    return "";
                }
                return "message_request";
            }
            return "inbox";
        }
        return "";
    }

    public static String LIZJ(C869590Y9l c869590Y9l) {
        ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
        if (companion.isVideoMention(c869590Y9l)) {
            return "mention_video";
        }
        if (companion.isVideoTag(c869590Y9l)) {
            return "tag_video";
        }
        if (companion.isVideoMentionAndTag(c869590Y9l)) {
            return "tag_mention_video";
        }
        if (companion.isStoryMention(c869590Y9l)) {
            return "mention_story";
        }
        if (companion.isStoryToStoryBackwardsMention(c869590Y9l)) {
            return "add_story_to_story";
        }
        if (companion.isPostToStoryBackwardsMention(c869590Y9l)) {
            return "add_post_to_story";
        }
        return null;
    }

    public static String LIZLLL(C869590Y9l c869590Y9l) {
        String strLIZ;
        BaseRequestComponent baseRequestComponent;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        String str;
        StickerTemplate stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class);
        Integer numLJIIJJI = null;
        if (stickerTemplate != null && (baseRequestComponent = stickerTemplate.baseRequestComponent) != null && (queryDataComponent = baseRequestComponent.queryData) != null && (map = queryDataComponent.extras) != null && (str = map.get("a:sticker_type")) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str);
        }
        IIMEmojiAnalytics iIMEmojiAnalytics = (IIMEmojiAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMEmojiAnalytics.class);
        if (iIMEmojiAnalytics == null || (strLIZ = iIMEmojiAnalytics.LIZ(numLJIIJJI)) == null || strLIZ.length() == 0) {
            return c869590Y9l.getScene();
        }
        return strLIZ;
    }

    public static boolean LJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null || c869590Y9l.getMsgStatus() == 3) {
            return false;
        }
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        if (localExt != null && localExt.containsKey("s:send_response_check_code")) {
            return TextUtils.equals(CardStruct.IStatusCode.DEFAULT, localExt.get("s:send_response_check_code"));
        }
        return true;
    }
}
