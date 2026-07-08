package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UrlStructComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import java.util.List;

/* JADX INFO: renamed from: X.0ZFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896600ZFi {
    public static final QuoteMode LIZ(Aweme aweme, long j, AttachmentTypeComponent attachmentTypeComponent) {
        long jLongValue;
        List<String> urlList;
        long j2;
        UrlModel cover;
        AttachmentTypeComponent attachmentTypeComponent2 = attachmentTypeComponent;
        if (C817650W5r.LIZ(aweme)) {
            return QuoteMode.None.INSTANCE;
        }
        if (attachmentTypeComponent2 == null) {
            if (C729510SjV.LJJIJIL(aweme)) {
                attachmentTypeComponent2 = AttachmentTypeComponent.ATTACHMENT_TYPE_STORY;
            } else {
                attachmentTypeComponent2 = AttachmentTypeComponent.ATTACHMENT_TYPE_DEFAULT;
            }
        }
        String aid = aweme.getAid();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme));
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = -1;
        }
        Video video = aweme.getVideo();
        if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) {
            urlList = C13BV.INSTANCE;
        }
        UrlStructComponent urlStructComponent = new UrlStructComponent(urlList);
        int awemeType = aweme.getAwemeType();
        boolean zLJJIJIL = C729510SjV.LJJIJIL(aweme);
        FallbackStatusComponent fallbackStatusComponent = FallbackStatusComponent.UNKNOWN;
        Story story = aweme.getStory();
        if (story != null) {
            j2 = story.expiredAt;
        } else {
            j2 = 0;
        }
        return new QuoteMode.Quote(new AttachmentComponent(attachmentTypeComponent2, aid, j, jLongValue, urlStructComponent, awemeType, zLJJIJIL, fallbackStatusComponent, j2), true);
    }
}
