package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0fpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142430fpp {
    public final long LIZ;
    public final String LIZIZ;
    public final List<BadgeStruct> LIZJ;
    public final long LIZLLL;
    public volatile long LJ;
    public volatile boolean LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BadgeListCacheEntry(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cacheKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", badgeCount=");
        sbLIZ.append(this.LIZJ.size());
        sbLIZ.append(", lastAccess=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isDisposed=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1142430fpp(String str, long j, List list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = jCurrentTimeMillis;
        this.LJ = jCurrentTimeMillis;
    }
}
