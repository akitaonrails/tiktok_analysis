package X;

/* JADX INFO: renamed from: X.0LmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552980LmS {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public C552980LmS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C552980LmS)) {
            return false;
        }
        C552980LmS c552980LmS = (C552980LmS) obj;
        return this.LIZ == c552980LmS.LIZ && this.LIZIZ == c552980LmS.LIZIZ && this.LIZJ == c552980LmS.LIZJ && this.LIZLLL == c552980LmS.LIZLLL && this.LJ == c552980LmS.LJ && this.LJFF == c552980LmS.LJFF;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkflowBuildValidationConfig(checkDAGNoCycle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", checkLinkEndpoints=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", checkArtifactAccess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", checkArtifactRegistry=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", checkArtifactGetType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", checkFailableNodeDependency=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C552980LmS(int i) {
        this.LIZ = true;
        this.LIZIZ = true;
        this.LIZJ = true;
        this.LIZLLL = true;
        this.LJ = true;
        this.LJFF = true;
    }
}
