package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689180R1o {
    public final boolean LIZ;
    public final C689190R1p LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C689180R1o)) {
            return false;
        }
        C689180R1o c689180R1o = (C689180R1o) obj;
        return this.LIZ == c689180R1o.LIZ && Intrinsics.LJFF(this.LIZIZ, c689180R1o.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        C689190R1p c689190R1p = this.LIZIZ;
        return iZ2 + (c689190R1p == null ? 0 : c689190R1p.hashCode());
    }

    public C689180R1o(boolean z, C689190R1p c689190R1p) {
        this.LIZ = z;
        this.LIZIZ = c689190R1p;
    }
}
