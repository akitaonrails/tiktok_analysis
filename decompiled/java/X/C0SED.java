package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0SED, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SED {
    public final String LIZ;
    public final List<User> LIZIZ;
    public final long LIZJ;
    public final Long LIZLLL;
    public final Aweme LJ;

    public C0SED() {
        this(null, null, 0L, null, null, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0SED(String str, List<? extends User> list, long j, Long l, Aweme aweme) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = j;
        this.LIZLLL = l;
        this.LJ = aweme;
    }

    public C0SED(String str, C13BV c13bv, long j, Long l, Aweme aweme, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : c13bv, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : l, (i & 16) == 0 ? aweme : null);
    }
}
