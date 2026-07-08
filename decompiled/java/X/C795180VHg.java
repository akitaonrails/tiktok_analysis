package X;

/* JADX INFO: renamed from: X.0VHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795180VHg extends AbstractC795160VHe {
    public final C795380VIa LIZ;

    public C795180VHg() {
        this(C795380VIa.LIZIZ);
    }

    public final int hashCode() {
        return (C795180VHg.class.getName().hashCode() * 31) + this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success {mOutputData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C795180VHg(C795380VIa c795380VIa) {
        this.LIZ = c795380VIa;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C795180VHg.class == obj.getClass()) {
            return this.LIZ.equals(((C795180VHg) obj).LIZ);
        }
        return false;
    }
}
