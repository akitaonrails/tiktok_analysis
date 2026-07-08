package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lSO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358540lSO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ VideoItemParams LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ UpvoteList LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358540lSO(boolean z, boolean z2, VideoItemParams videoItemParams, String str, String str2, UpvoteList upvoteList, String str3, String str4) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = videoItemParams;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = upvoteList;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        User author;
        Aweme aweme;
        User author2;
        Aweme aweme2;
        String uid = null;
        if (this.LL || this.LLILLJJLI) {
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            VideoItemParams videoItemParams = this.LLILLL;
            String str = videoItemParams != null ? videoItemParams.mEventType : null;
            String str2 = this.LLILZ;
            if (str2 == null) {
                str2 = this.LL ? "recommend_panel" : "bubble";
            }
            VideoItemParams videoItemParams2 = this.LLILLL;
            C1358550lSP.LJIJJLI(c1358550lSP, str, str2, videoItemParams2 != null ? videoItemParams2.getAweme() : null, "click", "list", 0, this.LL ? "auto_enter_keyboard" : "bubble", null, null, null, 928);
        }
        C1358120lRi c1358120lRi = UpvotePanelListViewModel.LLJJIJI;
        VideoItemParams videoItemParams3 = this.LLILLL;
        String str3 = this.LLILZIL;
        c1358120lRi.getClass();
        String strLIZIZ = C1358120lRi.LIZIZ(videoItemParams3, str3);
        C1358550lSP c1358550lSP2 = C1358550lSP.LIZ;
        VideoItemParams videoItemParams4 = this.LLILLL;
        String str4 = videoItemParams4 != null ? videoItemParams4.mEventType : null;
        VideoItemParams videoItemParams5 = this.LLILLL;
        String aid = (videoItemParams5 == null || (aweme2 = videoItemParams5.getAweme()) == null) ? null : aweme2.getAid();
        VideoItemParams videoItemParams6 = this.LLILLL;
        String uid2 = (videoItemParams6 == null || (aweme = videoItemParams6.getAweme()) == null || (author2 = aweme.getAuthor()) == null) ? null : author2.getUid();
        String str5 = this.LLILZIL;
        UpvoteList upvoteList = this.LLILZLL;
        String str6 = this.LLIZ;
        String str7 = this.LLIZLLLIL;
        c1358550lSP2.getClass();
        C1358550lSP.LIZIZ(str4, strLIZIZ, aid, uid2, str5, upvoteList, str6, null, str7);
        VideoItemParams videoItemParams7 = this.LLILLL;
        String str8 = videoItemParams7 != null ? videoItemParams7.mEventType : null;
        VideoItemParams videoItemParams8 = this.LLILLL;
        Aweme aweme3 = videoItemParams8 != null ? videoItemParams8.getAweme() : null;
        boolean z = ((Number) C0B0U.LIZ.getValue()).intValue() == 0 && C263730AVf.LIZ() && !C0CHP.LIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str8);
        c2344009Gk.LJIIIIZZ("enter_type", strLIZIZ);
        c2344009Gk.LJIIIIZZ("group_id", aweme3 != null ? aweme3.getAid() : null);
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            uid = author.getUid();
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("panel_source", z ? "recommend_panel_au_u16" : "recommend_panel");
        if (z) {
            c2344009Gk.LJIIIIZZ("user_type", "u16");
            c2344009Gk.LJFF("user_country", "aus");
        }
        C20684815ws.LJIILLIIL("ttsocial_repost_panel_show", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
