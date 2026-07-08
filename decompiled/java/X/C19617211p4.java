package X;

import android.content.Context;
import android.graphics.PointF;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.article.model.ArticleStickerStruct;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerSettingsConfig;
import com.ss.android.ugc.aweme.ogc.news.sticker.consumer.ArticleLinkStickerIABSheet;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11p4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19617211p4 implements InterfaceC19603111mn {
    @Override // X.InterfaceC19603111mn
    public final boolean LIZJ() {
        Integer num = ArticleStickerSettingsConfig.LIZ().enableConsuming;
        return num == null || num.intValue() == 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11nD] */
    @Override // X.InterfaceC19603111mn
    public final C19605711nD LIZIZ(final C19EG c19eg, final C705930RmZ c705930RmZ) {
        return new InterfaceC19578611iq() { // from class: X.11nD
            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct) {
                String articleLink;
                String str;
                String uid;
                String str2;
                String articleTitle;
                String articleLink2;
                User user;
                C0R60 c0r60;
                ArticleStickerStruct articleSticker = interactStickerStruct.getArticleSticker();
                String str3 = "";
                if (articleSticker == null || (articleLink = articleSticker.getArticleLink()) == null) {
                    articleLink = "";
                }
                if (articleLink.length() > 0) {
                    C19617211p4 c19617211p4 = this.LL;
                    C19EG c19eg2 = c19eg;
                    Pair[] pairArr = new Pair[6];
                    C705930RmZ c705930RmZ2 = c705930RmZ;
                    if (c705930RmZ2 == null || (c0r60 = c705930RmZ2.LJIIZILJ) == null || (str = c0r60.LIZ) == null) {
                        str = "";
                    }
                    pairArr[0] = new Pair("enter_from", str);
                    C705930RmZ c705930RmZ3 = c705930RmZ;
                    if (c705930RmZ3 == null || (user = c705930RmZ3.LIZJ) == null || (uid = user.getUid()) == null) {
                        uid = "";
                    }
                    pairArr[1] = new Pair("author_id", uid);
                    C705930RmZ c705930RmZ4 = c705930RmZ;
                    if (c705930RmZ4 == null || (str2 = c705930RmZ4.LIZLLL) == null) {
                        str2 = "";
                    }
                    pairArr[2] = new Pair("from_group_id", str2);
                    ArticleStickerStruct articleSticker2 = interactStickerStruct.getArticleSticker();
                    if (articleSticker2 == null || (articleTitle = articleSticker2.getArticleTitle()) == null) {
                        articleTitle = "";
                    }
                    pairArr[3] = new Pair("new_content_title", articleTitle);
                    ArticleStickerStruct articleSticker3 = interactStickerStruct.getArticleSticker();
                    if (articleSticker3 != null && (articleLink2 = articleSticker3.getArticleLink()) != null) {
                        str3 = articleLink2;
                    }
                    pairArr[4] = new Pair("new_content_url", str3);
                    pairArr[5] = new Pair("is_from_sticker", "1");
                    c19617211p4.LIZ(c19eg2, articleLink, C2097608Jq.LJIIIIZZ(pairArr));
                }
                return true;
            }

            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
                onClick(interactStickerStruct);
                return true;
            }
        };
    }

    @Override // X.InterfaceC19603111mn
    public final void LIZ(Context context, String str, final Map<String, String> map) {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1440005kM.LIZ(new C453940Hr6(true, false, (AbstractC453920Hr4) new C453910Hr3("enter_article_sticker")));
            ArticleLinkStickerIABSheet articleLinkStickerIABSheet = new ArticleLinkStickerIABSheet();
            articleLinkStickerIABSheet.LLILZ = str;
            articleLinkStickerIABSheet.LLILZIL = new InterfaceC19617411p6() { // from class: X.11p3
                @Override // X.InterfaceC19617411p6
                public final void LIZ(long j) {
                    C1440005kM.LIZ(new C453940Hr6(false, false, 4));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(map);
                    linkedHashMap.put("stay_duration", String.valueOf(j));
                    C20684815ws.LJIILLIIL("news_anchor_h5_page_view", linkedHashMap);
                }
            };
            articleLinkStickerIABSheet.show(supportFragmentManager, "article_sticker_h5_page");
        }
    }
}
