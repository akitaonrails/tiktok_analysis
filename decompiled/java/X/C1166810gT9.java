package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166810gT9 implements InterfaceC1891350zJl {
    public final String LL;
    public final UrlModel LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;
    public final int LLIZLLLIL;
    public final boolean LLJ;
    public Integer LLJI;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPlaylistItem(aid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", viewCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isPhotoIconVisible=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", videoDuration=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isSubOnlyVideo=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", mixLabel=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Integer num = this.LLJI;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1166810gT9 c1166810gT9;
        if (interfaceC1891350zJl instanceof C1166810gT9) {
            c1166810gT9 = (C1166810gT9) interfaceC1891350zJl;
        } else {
            c1166810gT9 = null;
        }
        if (c1166810gT9 == null || !Intrinsics.LJFF(c1166810gT9.LL, this.LL) || !Intrinsics.LJFF(c1166810gT9.LLJI, this.LLJI)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1166810gT9 c1166810gT9;
        if (interfaceC1891350zJl instanceof C1166810gT9) {
            c1166810gT9 = (C1166810gT9) interfaceC1891350zJl;
        } else {
            c1166810gT9 = null;
        }
        if (c1166810gT9 == null || !Intrinsics.LJFF(c1166810gT9.LL, this.LL) || !Intrinsics.LJFF(c1166810gT9.LLJI, this.LLJI)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        C1166810gT9 c1166810gT9;
        if (obj instanceof C1166810gT9) {
            c1166810gT9 = (C1166810gT9) obj;
        } else {
            c1166810gT9 = null;
        }
        if (c1166810gT9 == null || !Intrinsics.LJFF(c1166810gT9.LL, this.LL) || !Intrinsics.LJFF(c1166810gT9.LLJI, this.LLJI)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1166810gT9(Aweme aweme, int i) {
        UrlModel cover;
        long playCount;
        boolean z;
        int duration;
        Integer index;
        String aid = aweme.getAid();
        Video video = aweme.getVideo();
        Integer numValueOf = null;
        if (video != null) {
            cover = video.getCover();
        } else {
            cover = null;
        }
        String desc = aweme.getDesc();
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            playCount = statistics.getPlayCount();
        } else {
            playCount = 0;
        }
        String strLIZIZ = C1843500y4a.LIZIZ(playCount);
        if (!AwemeExtKt.isPhotoMode(aweme) && !C0NC0.LIZ(aweme)) {
            z = false;
        } else {
            z = true;
        }
        Video video2 = aweme.getVideo();
        if (video2 != null) {
            duration = video2.getDuration();
        } else {
            duration = 0;
        }
        this(aid, cover, desc, strLIZIZ, z, duration, aweme.isSubOnlyVideo(), i, false);
        PlayListInfo playListInfo = aweme.playlist_info;
        if (playListInfo != null && (index = playListInfo.getIndex()) != null) {
            numValueOf = Integer.valueOf(index.intValue() + 1);
        }
        this.LLJI = numValueOf;
    }

    public C1166810gT9(C1166810gT9 c1166810gT9, boolean z) {
        this(c1166810gT9.LL, c1166810gT9.LLILLJJLI, c1166810gT9.LLILLL, c1166810gT9.LLILZ, c1166810gT9.LLILZIL, c1166810gT9.LLILZLL, c1166810gT9.LLIZ, c1166810gT9.LLIZLLLIL, z);
        this.LLJI = c1166810gT9.LLJI;
    }

    public C1166810gT9(String str, UrlModel urlModel, String str2, String str3, boolean z, int i, boolean z2, int i2, boolean z3) {
        this.LL = str;
        this.LLILLJJLI = urlModel;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = z2;
        this.LLIZLLLIL = i2;
        this.LLJ = z3;
    }
}
