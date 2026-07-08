package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19754712Qv {
    public final boolean LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19754712Qv)) {
            return false;
        }
        C19754712Qv c19754712Qv = (C19754712Qv) obj;
        return this.LIZ == c19754712Qv.LIZ && this.LIZIZ == c19754712Qv.LIZIZ && Intrinsics.LJFF(this.LIZJ, c19754712Qv.LIZJ) && this.LIZLLL == c19754712Qv.LIZLLL;
    }

    public /* synthetic */ C19754712Qv(boolean z, boolean z2, int i) {
        this(0, null, z, (i & 8) != 0 ? false : z2);
    }

    public C19754712Qv(int i, Integer num, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = num;
        this.LIZLLL = z2;
    }
}
