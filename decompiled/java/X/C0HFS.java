package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HFS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HFS {
    public final int LIZ;
    public final int LIZIZ;
    public final C0HFV LIZJ;
    public final C0HFV LIZLLL;
    public final C438450HHf LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HFS)) {
            return false;
        }
        C0HFS c0hfs = (C0HFS) obj;
        return this.LIZ == c0hfs.LIZ && this.LIZIZ == c0hfs.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0hfs.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0hfs.LIZLLL) && Intrinsics.LJFF(this.LJ, c0hfs.LJ);
    }

    public C0HFS(int i, int i2, C0HFV c0hfv, C0HFV c0hfv2, C438450HHf c438450HHf) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = c0hfv;
        this.LIZLLL = c0hfv2;
        this.LJ = c438450HHf;
    }
}
