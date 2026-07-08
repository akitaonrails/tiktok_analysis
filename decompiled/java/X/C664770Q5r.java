package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664770Q5r {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Set<String> LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C664770Q5r)) {
            return false;
        }
        C664770Q5r c664770Q5r = (C664770Q5r) obj;
        return this.LIZ == c664770Q5r.LIZ && this.LIZIZ == c664770Q5r.LIZIZ && this.LIZJ == c664770Q5r.LIZJ && Intrinsics.LJFF(this.LIZLLL, c664770Q5r.LIZLLL) && Intrinsics.LJFF(this.LJ, c664770Q5r.LJ);
    }

    public C664770Q5r(boolean z, boolean z2, boolean z3, Set<String> set, String str) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = set;
        this.LJ = str;
    }
}
