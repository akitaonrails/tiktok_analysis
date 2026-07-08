package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UrlStructComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.service.impl.StoryIMService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896720ZFu extends C09AY implements Function0<C0ZGJ> {
    public final /* synthetic */ User LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ StoryIMService LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ QuickDMEventParam LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C896720ZFu(User user, String str, Activity activity, boolean z, StoryIMService storyIMService, Aweme aweme, String str2, QuickDMEventParam quickDMEventParam, Map<String, String> map, String str3) {
        super(0);
        this.LL = user;
        this.LLILLJJLI = str;
        this.LLILLL = activity;
        this.LLILZ = z;
        this.LLILZIL = storyIMService;
        this.LLILZLL = aweme;
        this.LLIZ = str2;
        this.LLIZLLLIL = quickDMEventParam;
        this.LLJ = map;
        this.LLJI = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0ZGJ invoke() {
        User user = this.LL;
        String strLJ = C0YNP.LJ(user != null ? user.getUid() : null);
        User user2 = this.LL;
        String uid = user2 != null ? user2.getUid() : null;
        User user3 = this.LL;
        String nickname = user3 != null ? user3.getNickname() : null;
        final StoryIMService storyIMService = this.LLILZIL;
        final User user4 = this.LL;
        final Aweme aweme = this.LLILZLL;
        C0ZGE c0zge = new C0ZGE() { // from class: X.0ZFj
            @Override // X.C0ZGE
            public final QuoteMode LIZ(C0ZGS c0zgs) {
                AttachmentTypeComponent attachmentTypeComponent;
                long j;
                List<String> urlList;
                UrlModel cover;
                StoryIMService storyIMService2 = storyIMService;
                User user5 = user4;
                Aweme aweme2 = aweme;
                if (c0zgs.isQuickReply()) {
                    attachmentTypeComponent = AttachmentTypeComponent.ATTACHMENT_TYPE_STORY;
                } else {
                    attachmentTypeComponent = AttachmentTypeComponent.ATTACHMENT_TYPE_STORY_REPLY;
                }
                storyIMService2.getClass();
                if (aweme2 != null && user5 != null) {
                    String aid = aweme2.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    String uid2 = user5.getUid();
                    long jLongValue = -1;
                    if (uid2 != null) {
                        j = CastLongProtector.parseLong(uid2);
                    } else {
                        j = -1;
                    }
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme2));
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    }
                    Video video = aweme2.getVideo();
                    if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) {
                        urlList = C13BV.INSTANCE;
                    }
                    return new QuoteMode.Quote(new AttachmentComponent(attachmentTypeComponent, aid, j, jLongValue, new UrlStructComponent(urlList), aweme2.getAwemeType(), aweme2.getIsTikTokStory(), FallbackStatusComponent.UNKNOWN, 0L), true);
                }
                return QuoteMode.None.INSTANCE;
            }
        };
        final String str = this.LLILLJJLI;
        String str2 = str == null ? "" : str;
        final String str3 = this.LLIZ;
        C0ZGG c0zgg = new C0ZGG() { // from class: X.0ZFv
            @Override // X.C0ZGG
            public final String LIZ(C0ZGS c0zgs) {
                return StoryIMService.LJIIJJI(c0zgs, str3);
            }
        };
        final QuickDMEventParam quickDMEventParam = this.LLIZLLLIL;
        final Map<String, String> map = this.LLJ;
        final String str4 = this.LLJI;
        return new C0ZGJ(this.LLILLL, strLJ, uid, nickname, 0, str2, c0zgg, c0zge, new C0ZG6() { // from class: X.0SVM
            @Override // X.C0ZG6
            public final Map<String, String> LIZ(C0ZGS c0zgs) {
                return StoryIMService.LJIIL(aweme, quickDMEventParam, map, storyIMService, str, str4, str3, c0zgs);
            }
        }, null, this.LLILZ, 512);
    }
}
