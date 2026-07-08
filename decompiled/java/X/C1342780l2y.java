package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342780l2y {
    public final int LIZ;
    public final C1340400kz8 LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1342780l2y)) {
            return false;
        }
        C1342780l2y c1342780l2y = (C1342780l2y) obj;
        return this.LIZ == c1342780l2y.LIZ && Intrinsics.LJFF(this.LIZIZ, c1342780l2y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1342780l2y.LIZJ);
    }

    public C1342780l2y(int i, C1340400kz8 c1340400kz8, String str) {
        this.LIZ = i;
        this.LIZIZ = c1340400kz8;
        this.LIZJ = str;
    }
}
