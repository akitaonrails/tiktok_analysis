package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0StY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735740StY extends AbstractC1386140mAu<C735740StY> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public Aweme LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;

    public C735740StY() {
        super("video_pause");
        this.LJJLIIIJL = "";
        this.LJJLIIIJLLLLLLLZ = "";
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        PhotoModeImageInfo photoModeImageInfo;
        LJ("pause_method", this.LJJLIIIJLLLLLLLZ);
        String strLIZLLL = C735370Ssx.LIZLLL(this.LJJLIIIJJIZ);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("author_id", strLIZLLL, c2082308Dt);
        LJFF("group_id", this.LJJLIIIJILLIZJL, InterfaceC1210900hcG.LIZIZ);
        LIZJ(this.LJJLIIIJJI);
        LJFF("enter_from", this.LJJLIIIJ, c2082308Dt);
        LIZLLL(this.LJJLIIIJLJLI, "is_long");
        Aweme aweme = this.LJJLIIIJJIZ;
        if (aweme != null) {
            LIZLLL(aweme.getAwemeType(), "aweme_type");
            LJ("is_on_this_day", AwemeExtKt.isOnThisDayVideo(this.LJJLIIIJJIZ) ? "1" : CardStruct.IStatusCode.DEFAULT);
        }
        LIZLLL(C735370Ssx.LJJ(this.LJJLIIIJJIZ), "text_post_content");
        LJ("from_page", this.LJJLIIIJL);
        C719730SLb.LIZ(this.LJJLIIIJJIZ, this);
        Aweme aweme2 = this.LJJLIIIJJIZ;
        LIZLLL((aweme2 == null || (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) == null || !photoModeImageInfo.hasTitle()) ? 0 : 1, "has_title");
        String strLIZ = C1381730m3n.LIZ(this.LJJLIIIJJIZ);
        if (strLIZ != null && !strLIZ.isEmpty()) {
            LJ("photo_content_type", strLIZ);
        }
        if (C735370Ssx.LJJIIJ(this.LJJLIIIJJIZ) || C735370Ssx.LJJIL(this.LJJLIIIJJIZ)) {
            LJ("is_text_mode", "1");
        }
        if (C735370Ssx.LJJIL(this.LJJLIIIJJIZ)) {
            LJ("is_text_trans_pic", "1");
        }
        Aweme aweme3 = this.LJJLIIIJJIZ;
        if (aweme3 != null) {
            C1380890m2R.LJ(aweme3, this);
        }
        LJ("is_background", C2214201BlK.LJIIJJI ? "1" : CardStruct.IStatusCode.DEFAULT);
        LJ("is_floating_window", CardStruct.IStatusCode.DEFAULT);
        Aweme aweme4 = this.LJJLIIIJJIZ;
        if (aweme4 == null || aweme4.getPodcastInfo() == null) {
            LIZLLL(0, "is_podcast_preview");
            LJ("podcast_rss_feed_url", "");
            LJ("podcast_rss_entry_id", "");
        } else {
            if (this.LJJLIIIJJIZ.getPodcastInfo().isPodcastPreview() == null || !this.LJJLIIIJJIZ.getPodcastInfo().isPodcastPreview().booleanValue()) {
                LIZLLL(0, "is_podcast_preview");
            } else {
                LIZLLL(1, "is_podcast_preview");
            }
            if (this.LJJLIIIJJIZ.getPodcastInfo().getPlayAddr() == null || this.LJJLIIIJJIZ.getPodcastInfo().getPlayAddr().getUrlList() == null || this.LJJLIIIJJIZ.getPodcastInfo().getPlayAddr().getUrlList().isEmpty() || TextUtils.isEmpty((CharSequence) ListProtector.get(this.LJJLIIIJJIZ.getPodcastInfo().getPlayAddr().getUrlList(), 0))) {
                LJ("podcast_rss_feed_url", "");
            } else {
                LJ("podcast_rss_feed_url", (String) ListProtector.get(this.LJJLIIIJJIZ.getPodcastInfo().getPlayAddr().getUrlList(), 0));
            }
            if (this.LJJLIIIJJIZ.getPodcastInfo().getEpisodeItemId() != null) {
                LJ("podcast_rss_entry_id", this.LJJLIIIJJIZ.getPodcastInfo().getEpisodeItemId());
            } else {
                LJ("podcast_rss_entry_id", "");
            }
        }
        if (C0SUD.LIZ) {
            LJ("enter_from", C0SXF.LJJIFFI(null, Boolean.FALSE, this.LJJLIIIJ));
        }
    }

    public final void LJJIJIL(int i, Aweme aweme) {
        this.LJJLIIIJJIZ = aweme;
        this.LJJLIIIJJI = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).LIZ(i, aweme);
        this.LJJLIIIJILLIZJL = C735370Ssx.LIZJ(aweme);
        if (!TextUtils.isEmpty(aweme.partN)) {
            this.LJJLIIIJLJLI = 2;
        } else {
            if (aweme.getVideo() == null || !aweme.getVideo().isLongVideo()) {
                return;
            }
            this.LJJLIIIJLJLI = 1;
        }
    }
}
