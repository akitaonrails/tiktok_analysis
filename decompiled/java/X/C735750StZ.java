package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0StZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735750StZ extends AbstractC1386130mAt {
    public Aweme LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;

    public C735750StZ() {
        super("click_video_play");
        this.LJIIZILJ = "";
        this.LJIJ = "";
        this.LJIJI = "";
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        LJ("from_page", this.LJIIZILJ);
        LJ("enter_from", this.LIZLLL);
        LJFF("group_id", C735370Ssx.LIZJ(this.LJIILLIIL), InterfaceC1210900hcG.LIZIZ);
        Aweme aweme = this.LJIILLIIL;
        LIZLLL(aweme != null ? aweme.getAwemeType() : 0, "aweme_type");
        Aweme aweme2 = this.LJIILLIIL;
        if (aweme2 != null) {
            LJ("author_id", AwemeExtKt.getAuthorUid(aweme2));
            C15WT.LIZIZ.LJIJJLI(this, this.LIZLLL, this.LJIJI, this.LJIILLIIL.getAid());
            LJ("request_id", C735370Ssx.LJIJJ(this.LJIILLIIL));
            if (AwemeExtKt.isPhotoMode(this.LJIILLIIL)) {
                LIZLLL(C735370Ssx.LJIILL(this.LJIILLIIL), "pic_cnt");
            }
        }
        Aweme aweme3 = this.LJIILLIIL;
        if (aweme3 != null) {
            C1380890m2R.LJ(aweme3, this);
        }
        String strLIZIZ = C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(this.LJIILLIIL));
        if (strLIZIZ != null) {
            LJ("log_pb", strLIZIZ);
        }
        String strLIZ = C1381730m3n.LIZ(this.LJIILLIIL);
        if (strLIZ != null && !strLIZ.isEmpty()) {
            LJ("photo_content_type", strLIZ);
        }
        String str = this.LJIJ;
        if (str != null && !str.isEmpty()) {
            LJ("enter_method", this.LJIJ);
        }
        LIZLLL(C2214201BlK.LJIIJJI ? 1 : 0, "is_background");
        Aweme aweme4 = this.LJIILLIIL;
        if (aweme4 == null || aweme4.getPodcastInfo() == null) {
            LIZLLL(0, "is_podcast_preview");
            LJ("podcast_rss_feed_url", "");
            LJ("podcast_rss_entry_id", "");
        } else {
            if (this.LJIILLIIL.getPodcastInfo().isPodcastPreview() == null || !this.LJIILLIIL.getPodcastInfo().isPodcastPreview().booleanValue()) {
                LIZLLL(0, "is_podcast_preview");
            } else {
                LIZLLL(1, "is_podcast_preview");
            }
            if (this.LJIILLIIL.getPodcastInfo().getPlayAddr() == null || this.LJIILLIIL.getPodcastInfo().getPlayAddr().getUrlList() == null || this.LJIILLIIL.getPodcastInfo().getPlayAddr().getUrlList().isEmpty() || TextUtils.isEmpty((CharSequence) ListProtector.get(this.LJIILLIIL.getPodcastInfo().getPlayAddr().getUrlList(), 0))) {
                LJ("podcast_rss_feed_url", "");
            } else {
                LJ("podcast_rss_feed_url", (String) ListProtector.get(this.LJIILLIIL.getPodcastInfo().getPlayAddr().getUrlList(), 0));
            }
            if (this.LJIILLIIL.getPodcastInfo().getEpisodeItemId() != null) {
                LJ("podcast_rss_entry_id", this.LJIILLIIL.getPodcastInfo().getEpisodeItemId());
            } else {
                LJ("podcast_rss_entry_id", "");
            }
        }
        if (C0SUD.LIZ) {
            LJ("enter_from", C0SXF.LJJIFFI(null, Boolean.FALSE, this.LIZLLL));
        }
    }
}
