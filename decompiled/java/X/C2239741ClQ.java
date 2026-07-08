package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ClQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239741ClQ {
    public final Aweme LIZ;
    public final int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public final Set<Integer> LJI = new LinkedHashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2239741ClQ)) {
            return false;
        }
        C2239741ClQ c2239741ClQ = (C2239741ClQ) obj;
        return Intrinsics.LJFF(this.LIZ, c2239741ClQ.LIZ) && this.LIZIZ == c2239741ClQ.LIZIZ;
    }

    public C2239741ClQ(Aweme aweme, int i) {
        this.LIZ = aweme;
        this.LIZIZ = i;
    }
}
