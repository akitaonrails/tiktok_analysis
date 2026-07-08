package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166800gT8 implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final Integer LLILLJJLI;
    public final String LLILLL;
    public final UrlModel LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public Integer LLIZ;

    public C1166800gT8() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Integer num = this.LLILLJJLI;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFeedItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1166800gT8)) {
            return false;
        }
        C1166800gT8 c1166800gT8 = (C1166800gT8) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLL, c1166800gT8.LLILLL) || !Intrinsics.LJFF(this.LLIZ, c1166800gT8.LLIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1166800gT8)) {
            return false;
        }
        C1166800gT8 c1166800gT8 = (C1166800gT8) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLL, c1166800gT8.LLILLL) || !Intrinsics.LJFF(this.LLIZ, c1166800gT8.LLIZ)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1166800gT8)) {
            return false;
        }
        C1166800gT8 c1166800gT8 = (C1166800gT8) obj;
        if (!Intrinsics.LJFF(this.LLILLL, c1166800gT8.LLILLL) || !Intrinsics.LJFF(this.LLIZ, c1166800gT8.LLIZ)) {
            return false;
        }
        return true;
    }

    public C1166800gT8(Aweme aweme, Integer num) {
        UrlModel cover;
        long playCount;
        Integer index;
        this.LL = aweme;
        this.LLILLJJLI = num;
        this.LLILLL = aweme.getAid();
        Video video = aweme.getVideo();
        if (video != null) {
            cover = video.getCover();
        } else {
            cover = null;
        }
        this.LLILZ = cover;
        this.LLILZIL = aweme.getDesc();
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            playCount = statistics.getPlayCount();
        } else {
            playCount = 0;
        }
        this.LLILZLL = C1843500y4a.LIZIZ(playCount);
        if (num == null) {
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && (index = playListInfo.getIndex()) != null) {
                num = Integer.valueOf(index.intValue() + 1);
            } else {
                num = null;
            }
        }
        this.LLIZ = num;
    }
}
