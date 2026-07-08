package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.158u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204722158u {
    public final C1322110kVd LIZ;
    public final C1143920fsE LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C204722158u)) {
            return false;
        }
        C204722158u c204722158u = (C204722158u) obj;
        return Intrinsics.LJFF(this.LIZ, c204722158u.LIZ) && Intrinsics.LJFF(this.LIZIZ, c204722158u.LIZIZ) && this.LIZJ == c204722158u.LIZJ;
    }

    public C204722158u(C1322110kVd c1322110kVd, C1143920fsE c1143920fsE, int i) {
        this.LIZ = c1322110kVd;
        this.LIZIZ = c1143920fsE;
        this.LIZJ = i;
    }
}
