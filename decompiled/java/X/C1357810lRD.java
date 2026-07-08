package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357810lRD {
    public final String LIZ;
    public final RepostReplyStruct LIZIZ;
    public final UpvoteCacheState LIZJ;
    public final Integer LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1357810lRD)) {
            return false;
        }
        C1357810lRD c1357810lRD = (C1357810lRD) obj;
        return Intrinsics.LJFF(this.LIZ, c1357810lRD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1357810lRD.LIZIZ) && this.LIZJ == c1357810lRD.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1357810lRD.LIZLLL) && Intrinsics.LJFF(this.LJ, c1357810lRD.LJ);
    }

    public C1357810lRD(String str, RepostReplyStruct repostReplyStruct, UpvoteCacheState upvoteCacheState, Integer num, String str2) {
        this.LIZ = str;
        this.LIZIZ = repostReplyStruct;
        this.LIZJ = upvoteCacheState;
        this.LIZLLL = num;
        this.LJ = str2;
    }
}
