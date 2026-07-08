package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: X.0l7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345560l7S implements Serializable {
    public static final int $stable = 8;
    public final Map<String, Object> additionalParams;
    public final String authorId;
    public final Aweme aweme;
    public final String commentTag;
    public final String enterFrom;
    public final String enterMethod;
    public final String eventType;
    public final String fromPage;
    public final Boolean isHotPlayer;
    public final String lastGroupId;
    public final String newsId;
    public final String pageType;
    public final String previousPage;
    public final String videoFrom;

    public C1345560l7S() {
        this("", "", "", "", null, "", null, "", "", "", "", null, "", "");
    }

    public final Boolean isHotPlayer() {
        return this.isHotPlayer;
    }

    public C1345560l7S(String str, String str2, String str3, String str4, Aweme aweme, String str5, Boolean bool, String str6, String str7, String str8, String str9, Map<String, Object> map, String str10, String str11) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.eventType = str3;
        this.commentTag = str4;
        this.aweme = aweme;
        this.pageType = str5;
        this.isHotPlayer = bool;
        this.lastGroupId = str6;
        this.authorId = str7;
        this.newsId = str8;
        this.videoFrom = str9;
        this.additionalParams = map;
        this.previousPage = str10;
        this.fromPage = str11;
    }
}
