package X;

/* JADX INFO: renamed from: X.0gqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181120gqE {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1181120gqE() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1181120gqE)) {
            return false;
        }
        C1181120gqE c1181120gqE = (C1181120gqE) obj;
        return this.LIZ == c1181120gqE.LIZ && this.LIZIZ == c1181120gqE.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashUpdateOption(showLoading=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showError=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1181120gqE(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
