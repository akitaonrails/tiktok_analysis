package X;

/* JADX INFO: renamed from: X.0s2Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611610s2Z {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1611610s2Z() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1611610s2Z)) {
            return false;
        }
        C1611610s2Z c1611610s2Z = (C1611610s2Z) obj;
        return this.LIZ == c1611610s2Z.LIZ && this.LIZIZ == c1611610s2Z.LIZIZ;
    }

    public C1611610s2Z(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
