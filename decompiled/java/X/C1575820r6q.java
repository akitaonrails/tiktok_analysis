package X;

import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0r6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575820r6q implements Serializable, InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final VideoTrendingTopic LLILZ;

    public C1575820r6q() {
        this("", "", "", null);
    }

    public final String getContentType() {
        return this.LLILLJJLI;
    }

    public final String getCreationId() {
        return this.LLILLL;
    }

    public final String getEnterFrom() {
        return this.LL;
    }

    public final VideoTrendingTopic getSelectedTopic() {
        return this.LLILZ;
    }

    public C1575820r6q(String str, String str2, String str3, VideoTrendingTopic videoTrendingTopic) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = videoTrendingTopic;
    }
}
