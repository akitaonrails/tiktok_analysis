package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0voI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756520voI {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;

    public C1756520voI() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1756520voI)) {
            return false;
        }
        C1756520voI c1756520voI = (C1756520voI) obj;
        return Intrinsics.LJFF(this.LIZ, c1756520voI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1756520voI.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1756520voI.LIZJ);
    }

    public C1756520voI(Integer num, Integer num2, Integer num3) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = num3;
    }
}
