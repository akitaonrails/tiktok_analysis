package X;

/* JADX INFO: renamed from: X.0gEP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157670gEP {
    public final EnumC1189760h4A LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157670gEP)) {
            return false;
        }
        C1157670gEP c1157670gEP = (C1157670gEP) obj;
        return this.LIZ == c1157670gEP.LIZ && this.LIZIZ == c1157670gEP.LIZIZ && this.LIZJ == c1157670gEP.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiscoverMoreStyleConfig(style=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", guideExpandDelayMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", guideShowDurationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157670gEP(EnumC1189760h4A enumC1189760h4A, long j, int i) {
        long j2;
        j = (i & 2) != 0 ? 30000L : j;
        if ((i & 4) != 0) {
            j2 = 10000;
        } else {
            j2 = 0;
        }
        this.LIZ = enumC1189760h4A;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
