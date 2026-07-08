package X;

import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentMeta;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360650lVn {
    public final boolean LIZ;
    public final List<RepostNewContentUser> LIZIZ;
    public final List<RepostNewContentMeta> LIZJ;

    public C1360650lVn() {
        this(false, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1360650lVn)) {
            return false;
        }
        C1360650lVn c1360650lVn = (C1360650lVn) obj;
        return this.LIZ == c1360650lVn.LIZ && Intrinsics.LJFF(this.LIZIZ, c1360650lVn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1360650lVn.LIZJ);
    }

    public C1360650lVn(boolean z, List<RepostNewContentUser> list, List<RepostNewContentMeta> list2) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = list2;
    }
}
