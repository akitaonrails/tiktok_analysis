package X;

import com.ss.android.ugc.aweme.services.IArticleModeLoggingService;

/* JADX INFO: renamed from: X.0mPE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395020mPE implements IArticleModeLoggingService {
    public static final C1395020mPE LIZ = new C1395020mPE();

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logClickCopyLink() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("link_type", "weblink");
        c2344009Gk.LJFF("enter_from", "article_detail");
        C20684815ws.LJIILLIIL("click_copy_link", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logClickMoreAction() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "article_detail");
        C20684815ws.LJIILLIIL("click_more_action", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logArticleDetailExit(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("exit_way", str);
        C20684815ws.LJIILLIIL("article_detail_exit", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logRssFeedClick(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("click_rss_feed", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logClickOpenOtherBrowser(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("url", str);
        if (C703302op.LIZ(str2)) {
            c2344009Gk.LJFF("group_id", str2);
        }
        c2344009Gk.LJFF("enter_from", "article_detail");
        C20684815ws.LJIILLIIL("open_other_browser", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logClickRetry(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("url", str);
        if (C703302op.LIZ(str2)) {
            c2344009Gk.LJFF("group_id", str2);
        }
        c2344009Gk.LJFF("enter_from", "article_detail");
        C20684815ws.LJIILLIIL("click_retry", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logEnterArticleDetail(C2344009Gk c2344009Gk, Integer num) {
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "pic_cnt");
        }
        C20684815ws.LJIILLIIL("enter_article_detail", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logMultiAnchorStayTime(C2344009Gk c2344009Gk, long j) {
        if (j < 0) {
            return;
        }
        c2344009Gk.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("multi_anchor_stay_time", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logArticleDetailStaytime(C2344009Gk c2344009Gk, Integer num, Long l) {
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "pic_cnt");
        }
        if (l != null) {
            l.longValue();
            c2344009Gk.LIZLLL(l.longValue(), "duration");
        }
        C20684815ws.LJIILLIIL("article_detail_staytime", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeLoggingService
    public final void logClickReport(String str, Integer num, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(150, "aweme_type");
        c2344009Gk.LJFF("request_id", str);
        c2344009Gk.LJFF("enter_method", "click_more_button");
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "pic_cnt");
        }
        if (C703302op.LIZ(str2)) {
            c2344009Gk.LJFF("author_id", str2);
        }
        if (C703302op.LIZ(str3)) {
            c2344009Gk.LJFF("photo_content_type", str3);
        }
        c2344009Gk.LJFF("enter_from", "article_detail");
        C20684815ws.LJIILLIIL("click_report", c2344009Gk.LIZ);
    }
}
