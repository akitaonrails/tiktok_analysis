package X;

import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229810i6l {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final long LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final List<GroupAccessCriteria> LJIIJ;

    public C1229810i6l() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1229810i6l)) {
            return false;
        }
        C1229810i6l c1229810i6l = (C1229810i6l) obj;
        return this.LIZ == c1229810i6l.LIZ && Intrinsics.LJFF(this.LIZIZ, c1229810i6l.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1229810i6l.LIZJ) && this.LIZLLL == c1229810i6l.LIZLLL && this.LJ == c1229810i6l.LJ && Intrinsics.LJFF(this.LJFF, c1229810i6l.LJFF) && this.LJI == c1229810i6l.LJI && Intrinsics.LJFF(this.LJII, c1229810i6l.LJII) && this.LJIIIIZZ == c1229810i6l.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1229810i6l.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1229810i6l.LJIIJ);
    }

    public C1229810i6l(int i) {
        this(0L, "", "", -1, 0, "", 0L, "", false, "", Collections.singletonList(new GroupAccessCriteria(EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_UNKNOWN.getValue(), "", "")));
    }

    public C1229810i6l(long j, String str, String str2, int i, int i2, String str3, long j2, String str4, boolean z, String str5, List<GroupAccessCriteria> list) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = str3;
        this.LJI = j2;
        this.LJII = str4;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str5;
        this.LJIIJ = list;
    }
}
