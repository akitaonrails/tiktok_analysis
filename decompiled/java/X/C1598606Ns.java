package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1598606Ns {
    public final Integer LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C1598606Ns() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1598606Ns)) {
            return false;
        }
        C1598606Ns c1598606Ns = (C1598606Ns) obj;
        return Intrinsics.LJFF(this.LIZ, c1598606Ns.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1598606Ns.LIZIZ) && this.LIZJ == c1598606Ns.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1598606Ns.LIZLLL) && Intrinsics.LJFF(this.LJ, c1598606Ns.LJ);
    }

    public /* synthetic */ C1598606Ns(Integer num, int i) {
        this(null, (i & 1) != 0 ? null : num, null, false, null);
    }

    public C1598606Ns(String str, Integer num, String str2, boolean z, String str3) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
