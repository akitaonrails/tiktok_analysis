package X;

import com.ss.android.ugc.aweme.music.understanding.NodeTag;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08t1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2258108t1 {
    public final C2257808sy LIZ;
    public final long LIZIZ;
    public final ConcurrentHashMap<NodeTag, Long> LIZJ = new ConcurrentHashMap<>();

    public C2258108t1(C2257808sy c2257808sy, long j) {
        this.LIZ = c2257808sy;
        this.LIZIZ = j;
    }

    public final Long LIZ(long j, String str) {
        Long l = this.LIZJ.get(NodeTag.m282boximpl(str));
        if (l != null) {
            return Long.valueOf(j - l.longValue());
        }
        return null;
    }
}
