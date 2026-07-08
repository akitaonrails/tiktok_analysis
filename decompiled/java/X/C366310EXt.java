package X;

/* JADX INFO: renamed from: X.0EXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366310EXt {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C366310EXt() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C366310EXt)) {
            return false;
        }
        C366310EXt c366310EXt = (C366310EXt) obj;
        return this.LIZ == c366310EXt.LIZ && this.LIZIZ == c366310EXt.LIZIZ && this.LIZJ == c366310EXt.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiffState(hasUserEdited=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasAdvanceEdited=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasAudioChanged=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C366310EXt(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
