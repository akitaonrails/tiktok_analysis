package X;

/* JADX INFO: renamed from: X.0LYD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LYD extends C0LYS {
    public final boolean LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public C0LYD() {
        this(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LYD)) {
            return false;
        }
        C0LYD c0lyd = (C0LYD) obj;
        return this.LIZ == c0lyd.LIZ && this.LIZIZ == c0lyd.LIZIZ && this.LIZJ == c0lyd.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowComponent(enableCover=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", generateInDraftButtonAppearDelay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", directlySaveToDraftWhenClickBack=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0LYD(int i) {
        this(false, 0L, false);
    }

    public C0LYD(boolean z, long j, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = z2;
    }
}
