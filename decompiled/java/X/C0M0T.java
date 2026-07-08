package X;

/* JADX INFO: renamed from: X.0M0T, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M0T extends C561950M2f {
    public final int LIZLLL;
    public int LJ;

    public C0M0T() {
        this(0);
    }

    @Override // X.C561950M2f
    public final int LIZ() {
        return this.LIZLLL;
    }

    public final int hashCode() {
        return this.LJ;
    }

    public C0M0T(int i) {
        super(0, 7);
        this.LIZLLL = 108;
        this.LJ = 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0M0T)) {
            return false;
        }
        C0M0T c0m0t = (C0M0T) obj;
        if (c0m0t.LIZLLL != this.LIZLLL || c0m0t.LJ != this.LJ) {
            return false;
        }
        return true;
    }
}
