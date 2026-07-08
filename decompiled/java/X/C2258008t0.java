package X;

import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.NodeTag;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2258008t0 {
    public final ContentUnderstandingRequest LIZ;
    public final C2257808sy LIZIZ;
    public final long LIZJ;
    public final ConcurrentHashMap<NodeTag, Long> LIZLLL = new ConcurrentHashMap<>();
    public Long LJ;
    public volatile boolean LJFF;

    public final Long LIZ(long j, String str) {
        Long l = this.LIZLLL.get(NodeTag.m282boximpl(str));
        if (l != null) {
            return Long.valueOf(j - l.longValue());
        }
        return null;
    }

    public C2258008t0(ContentUnderstandingRequest contentUnderstandingRequest, C2257808sy c2257808sy, long j) {
        this.LIZ = contentUnderstandingRequest;
        this.LIZIZ = c2257808sy;
        this.LIZJ = j;
    }
}
