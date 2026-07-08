package X;

/* JADX INFO: renamed from: X.0wOL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778870wOL {
    public final EnumC1778790wOD LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778870wOL)) {
            return false;
        }
        C1778870wOL c1778870wOL = (C1778870wOL) obj;
        return this.LIZ == c1778870wOL.LIZ && this.LIZIZ == c1778870wOL.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisableStatus(resultState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", disable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778870wOL(EnumC1778790wOD enumC1778790wOD, boolean z) {
        this.LIZ = enumC1778790wOD;
        this.LIZIZ = z;
    }
}
