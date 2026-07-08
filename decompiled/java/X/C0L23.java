package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L23, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L23 {
    public final int LIZ;
    public final int LIZIZ;
    public final Pair<Integer, Integer> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0L23)) {
            return false;
        }
        C0L23 c0l23 = (C0L23) obj;
        return this.LIZ == c0l23.LIZ && this.LIZIZ == c0l23.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0l23.LIZJ);
    }

    public C0L23(int i, int i2, Pair<Integer, Integer> pair) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = pair;
    }
}
