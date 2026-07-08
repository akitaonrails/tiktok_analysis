package X;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VUA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUA {
    public static final C0VUA LJFF;
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final List<C0VUH> LIZLLL;
    public final C0VUC LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VUA)) {
            return false;
        }
        C0VUA c0vua = (C0VUA) obj;
        return this.LIZ == c0vua.LIZ && this.LIZIZ == c0vua.LIZIZ && this.LIZJ == c0vua.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0vua.LIZLLL) && this.LJ == c0vua.LJ;
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31;
        C0VUC c0vuc = this.LJ;
        return iY2 + (c0vuc == null ? 0 : c0vuc.hashCode());
    }

    static {
        long j = 0;
        LJFF = new C0VUA(j, j, j, C13BV.INSTANCE);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.LJ != null) {
            sb.append('[');
            sb.append(this.LJ.name().toLowerCase(Locale.ROOT));
            sb.append("] ");
        }
        sb.append("memoryUsed=");
        sb.append(C08M9.LIZ(this.LIZ, true));
        sb.append("MB largestMemAlloc=");
        sb.append(C08M9.LIZ(this.LIZJ, true));
        sb.append("MB pageCacheOverflow=");
        sb.append(this.LIZIZ);
        sb.append(" dbStats=");
        sb.append(this.LIZLLL.size());
        for (C0VUH c0vuh : this.LIZLLL) {
            sb.append("\n  ");
            sb.append(c0vuh);
        }
        return sb.toString();
    }

    public /* synthetic */ C0VUA(long j, long j2, long j3, List list) {
        this(j, j2, j3, list, null);
    }

    public C0VUA(long j, long j2, long j3, List<C0VUH> list, C0VUC c0vuc) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = list;
        this.LJ = c0vuc;
    }
}
