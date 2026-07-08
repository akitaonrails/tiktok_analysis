package X;

import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.15CJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15CJ {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public volatile ExploreAwemeList LIZLLL;

    public final boolean LIZ() {
        return this.LIZJ <= 0 || System.currentTimeMillis() - this.LIZIZ >= TimeUnit.SECONDS.toMillis(this.LIZJ);
    }

    public C15CJ(String str, long j, long j2, ExploreAwemeList exploreAwemeList) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = exploreAwemeList;
    }
}
