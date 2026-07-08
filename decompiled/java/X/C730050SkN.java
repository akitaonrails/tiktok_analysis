package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730050SkN {
    public final boolean LIZ;
    public final List<C730340Skq> LIZIZ;
    public final Aweme LIZJ;
    public final Integer LIZLLL;

    public C730050SkN() {
        this(false, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C730050SkN)) {
            return false;
        }
        C730050SkN c730050SkN = (C730050SkN) obj;
        return this.LIZ == c730050SkN.LIZ && Intrinsics.LJFF(this.LIZIZ, c730050SkN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c730050SkN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c730050SkN.LIZLLL);
    }

    public C730050SkN(boolean z, List list, Aweme aweme, int i) {
        z = (i & 1) != 0 ? false : z;
        list = (i & 2) != 0 ? new ArrayList() : list;
        aweme = (i & 4) != 0 ? null : aweme;
        Integer num = (i & 8) != 0 ? 0 : null;
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = aweme;
        this.LIZLLL = num;
    }
}
