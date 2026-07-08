package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.UserContent;

/* JADX INFO: renamed from: X.0CwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329880CwU {
    public static final C329910CwX LIZ(InterfaceC329670Cw9 interfaceC329670Cw9) {
        UrlModel urlModel;
        String nickname;
        UserContent.SourceType sourceType;
        long diggCount;
        Video video;
        String text = interfaceC329670Cw9.getText();
        Aweme aweme = interfaceC329670Cw9.getAweme();
        boolean z = interfaceC329670Cw9 instanceof C329890CwV;
        if (z) {
            urlModel = ((C329890CwV) interfaceC329670Cw9).LJFF;
            nickname = ((C329890CwV) interfaceC329670Cw9).LJI;
            sourceType = UserContent.SourceType.COMMENT;
        } else {
            User author = interfaceC329670Cw9.getAweme().getAuthor();
            if (author == null || (urlModel = author.getAvatarThumb()) == null) {
                urlModel = new UrlModel();
            }
            User author2 = interfaceC329670Cw9.getAweme().getAuthor();
            if (author2 == null || (nickname = author2.getNickname()) == null) {
                nickname = "";
            }
            if (interfaceC329670Cw9 instanceof C329840CwQ) {
                sourceType = UserContent.SourceType.PHOTO_TEXT;
            } else if (interfaceC329670Cw9 instanceof C329850CwR) {
                sourceType = UserContent.SourceType.VIDEO;
            } else {
                throw new C1954807lC();
            }
        }
        boolean zLIZIZ = interfaceC329670Cw9.LIZIZ();
        boolean z2 = false;
        if (z) {
            diggCount = ((C329890CwV) interfaceC329670Cw9).LJII;
        } else {
            if (interfaceC329670Cw9.getAweme().getUserDigg() == 1) {
                z2 = true;
            }
            AwemeStatistics statistics = interfaceC329670Cw9.getAweme().getStatistics();
            if (statistics != null) {
                diggCount = statistics.getDiggCount();
            } else {
                diggCount = 0;
            }
        }
        UrlModel cover = null;
        if (!z && (video = interfaceC329670Cw9.getAweme().getVideo()) != null) {
            cover = video.getCover();
        }
        return new C329910CwX(text, aweme, urlModel, nickname, sourceType, zLIZIZ, z2, diggCount, cover, interfaceC329670Cw9);
    }
}
