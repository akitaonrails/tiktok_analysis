package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nE9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426590nE9 {
    public final long LIZ;
    public final String LIZIZ;
    public final EnumC1426270nDd LIZJ;

    public C1426590nE9() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1426590nE9)) {
            return false;
        }
        C1426590nE9 c1426590nE9 = (C1426590nE9) obj;
        return this.LIZ == c1426590nE9.LIZ && Intrinsics.LJFF(this.LIZIZ, c1426590nE9.LIZIZ) && this.LIZJ == c1426590nE9.LIZJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1426590nE9(String str, int i) {
        long jCurrentTimeMillis;
        if ((i & 1) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        this(jCurrentTimeMillis, (i & 2) != 0 ? "" : str, null);
    }

    public C1426590nE9(long j, String str, EnumC1426270nDd enumC1426270nDd) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = enumC1426270nDd;
    }
}
