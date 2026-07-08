package X;

/* JADX INFO: renamed from: X.0OhC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626160OhC {
    public final boolean LIZ;
    public final boolean LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C626160OhC() {
        boolean z = false;
        this(z, z, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C626160OhC)) {
            return false;
        }
        C626160OhC c626160OhC = (C626160OhC) obj;
        return this.LIZ == c626160OhC.LIZ && this.LIZIZ == c626160OhC.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadingState(prevHasMore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nextHasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C626160OhC(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public /* synthetic */ C626160OhC(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
