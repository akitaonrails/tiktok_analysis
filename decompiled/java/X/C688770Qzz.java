package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0Qzz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688770Qzz {
    public static final Map<String, Object> LIZ(Aweme aweme) {
        String nickname;
        List<String> urlList;
        List<String> urlList2;
        UrlModel cover;
        UrlModel avatarThumb;
        Long lValueOf = null;
        if (aweme == null) {
            return null;
        }
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
        pairArr[1] = new Pair("desc", aweme.getDesc());
        User author = aweme.getAuthor();
        if (author != null) {
            nickname = author.getNickname();
        } else {
            nickname = null;
        }
        pairArr[2] = new Pair("user_name", nickname);
        User author2 = aweme.getAuthor();
        if (author2 != null && (avatarThumb = author2.getAvatarThumb()) != null) {
            urlList = avatarThumb.getUrlList();
        } else {
            urlList = null;
        }
        pairArr[3] = new Pair("user_avatar", urlList);
        Video video = aweme.getVideo();
        if (video != null && (cover = video.getCover()) != null) {
            urlList2 = cover.getUrlList();
        } else {
            urlList2 = null;
        }
        pairArr[4] = new Pair("cover", urlList2);
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            lValueOf = Long.valueOf(statistics.getDiggCount());
        }
        pairArr[5] = new Pair("digg_count", Long.valueOf(C0R2Q.LIZIZ(lValueOf)));
        pairArr[6] = new Pair("aweme_data", aweme);
        pairArr[7] = new Pair("create_time", Long.valueOf(aweme.getCreateTime()));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final String LIZIZ(List<String> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS241S0000000_10.get$arr$(425), 30));
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
