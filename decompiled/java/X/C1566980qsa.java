package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qsa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566980qsa {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1566980qsa)) {
            return false;
        }
        C1566980qsa c1566980qsa = (C1566980qsa) obj;
        return this.LIZ == c1566980qsa.LIZ && Intrinsics.LJFF(this.LIZIZ, c1566980qsa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1566980qsa.LIZJ) && this.LIZLLL == c1566980qsa.LIZLLL;
    }

    public C1566980qsa(int i, String str, String str2, boolean z) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
    }
}
