package X;

import java.util.List;

/* JADX INFO: renamed from: X.0zJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891440zJu {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final List<C1891430zJt> LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1891440zJu() {
        boolean z = false;
        this(z, z, z, (List) null, 31);
    }

    public /* synthetic */ C1891440zJu(boolean z, boolean z2, boolean z3, List list, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, false, (List<C1891430zJt>) ((i & 16) != 0 ? null : list));
    }

    public C1891440zJu(boolean z, boolean z2, boolean z3, boolean z4, List<C1891430zJt> list) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = list;
    }
}
