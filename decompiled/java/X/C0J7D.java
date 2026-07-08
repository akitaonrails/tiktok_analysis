package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J7D, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7D {
    public final Aweme LIZ;
    public final int LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0J7D)) {
            return false;
        }
        C0J7D c0j7d = (C0J7D) obj;
        return Intrinsics.LJFF(this.LIZ, c0j7d.LIZ) && this.LIZIZ == c0j7d.LIZIZ && this.LIZJ == c0j7d.LIZJ;
    }

    public C0J7D(int i, long j, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = i;
        this.LIZJ = j;
    }
}
