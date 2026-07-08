package X;

import com.bytedance.android.live.base.model.user.SubscribeBadge;
import java.util.Map;

/* JADX INFO: renamed from: X.0K6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512220K6y {
    public final SubscribeBadge LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Map<String, String> LJI;

    public C512220K6y() {
        this(null, false, false, null, null, null, 1023);
    }

    public C512220K6y(SubscribeBadge subscribeBadge, boolean z, boolean z2, String str, String str2, Map map, int i) {
        subscribeBadge = (i & 1) != 0 ? null : subscribeBadge;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        str = (i & 128) != 0 ? "" : str;
        str2 = (i & 256) != 0 ? "" : str2;
        map = (i & 512) != 0 ? C2097608Jq.LJ() : map;
        this.LIZ = subscribeBadge;
        this.LIZIZ = z;
        this.LIZJ = false;
        this.LIZLLL = z2;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = map;
    }
}
