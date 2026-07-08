package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0gUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167440gUA {
    public final List<Aweme> LIZ;
    public final boolean LIZIZ;
    public final Long LIZJ;
    public final Exception LIZLLL;
    public final Integer LJ;

    public C1167440gUA() {
        this(null, false, null, null, null, 31);
    }

    public C1167440gUA(List list, boolean z, Long l, Exception exc, Integer num, int i) {
        list = (i & 1) != 0 ? null : list;
        z = (i & 2) != 0 ? false : z;
        l = (i & 4) != 0 ? null : l;
        exc = (i & 8) != 0 ? null : exc;
        num = (i & 16) != 0 ? null : num;
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = l;
        this.LIZLLL = exc;
        this.LJ = num;
    }
}
