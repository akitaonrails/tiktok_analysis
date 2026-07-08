package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929150aHp {
    public final int LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public final int LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C929150aHp)) {
            return false;
        }
        C929150aHp c929150aHp = (C929150aHp) obj;
        return this.LIZ == c929150aHp.LIZ && this.LIZIZ == c929150aHp.LIZIZ && this.LIZJ == c929150aHp.LIZJ && this.LIZLLL == c929150aHp.LIZLLL && Intrinsics.LJFF(this.LJ, c929150aHp.LJ);
    }

    public C929150aHp(int i, int i2, Integer num) {
        this.LIZ = i;
        this.LIZLLL = i2;
        this.LJ = num;
    }
}
