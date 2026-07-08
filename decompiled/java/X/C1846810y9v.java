package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846810y9v {
    public int LIZ;
    public C1846930yA7 LIZIZ;
    public final C1846930yA7 LIZJ;

    public final boolean equals(Object obj) {
        if (obj instanceof C1846810y9v) {
            C1846810y9v c1846810y9v = (C1846810y9v) obj;
            if (this.LIZ == c1846810y9v.LIZ && Intrinsics.LJFF(this.LIZIZ, c1846810y9v.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1846810y9v.LIZJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1846810y9v(int i, C1846930yA7 c1846930yA7, C1846930yA7 c1846930yA72) {
        this.LIZ = i;
        this.LIZIZ = c1846930yA7;
        this.LIZJ = c1846930yA72;
    }
}
