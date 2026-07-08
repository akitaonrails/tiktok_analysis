package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193740hAa {
    public final long LIZ;
    public final boolean LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1193740hAa)) {
            return false;
        }
        C1193740hAa c1193740hAa = (C1193740hAa) obj;
        return this.LIZ == c1193740hAa.LIZ && this.LIZIZ == c1193740hAa.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1193740hAa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1193740hAa.LIZLLL);
    }

    public C1193740hAa(long j, boolean z, Integer num, int i) {
        num = (i & 4) != 0 ? null : num;
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = num;
        this.LIZLLL = null;
    }
}
