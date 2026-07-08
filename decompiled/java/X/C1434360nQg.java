package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434360nQg {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1434360nQg)) {
            return false;
        }
        C1434360nQg c1434360nQg = (C1434360nQg) obj;
        return this.LIZ == c1434360nQg.LIZ && this.LIZIZ == c1434360nQg.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1434360nQg.LIZJ);
    }

    public C1434360nQg(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
