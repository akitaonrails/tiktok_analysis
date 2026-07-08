package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0smA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639880smA {
    public final C1639670slp LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1639880smA)) {
            return false;
        }
        C1639880smA c1639880smA = (C1639880smA) obj;
        return Intrinsics.LJFF(this.LIZ, c1639880smA.LIZ) && this.LIZIZ == c1639880smA.LIZIZ && this.LIZJ == c1639880smA.LIZJ;
    }

    public C1639880smA(C1639670slp c1639670slp, boolean z, boolean z2) {
        this.LIZ = c1639670slp;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
