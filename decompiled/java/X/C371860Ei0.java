package X;

/* JADX INFO: renamed from: X.0Ei0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371860Ei0 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public C371860Ei0() {
        this(false, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C371860Ei0)) {
            return false;
        }
        C371860Ei0 c371860Ei0 = (C371860Ei0) obj;
        return this.LIZ == c371860Ei0.LIZ && this.LIZIZ == c371860Ei0.LIZIZ && this.LIZJ == c371860Ei0.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionLoadingStates(hasCaptionCache=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableFillerWords=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C371860Ei0(boolean z, int i, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = z2;
    }
}
