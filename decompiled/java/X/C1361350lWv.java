package X;

import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361350lWv {
    public final long LIZ;
    public final NewContentResponse.RepostFeedRedDotResponse LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361350lWv)) {
            return false;
        }
        C1361350lWv c1361350lWv = (C1361350lWv) obj;
        return this.LIZ == c1361350lWv.LIZ && Intrinsics.LJFF(this.LIZIZ, c1361350lWv.LIZIZ) && this.LIZJ == c1361350lWv.LIZJ && this.LIZLLL == c1361350lWv.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public C1361350lWv(long j, NewContentResponse.RepostFeedRedDotResponse repostFeedRedDotResponse, int i, int i2) {
        this.LIZ = j;
        this.LIZIZ = repostFeedRedDotResponse;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
