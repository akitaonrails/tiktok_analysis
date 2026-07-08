package X;

/* JADX INFO: renamed from: X.0LOJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LOJ {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C0LOJ() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LOJ)) {
            return false;
        }
        C0LOJ c0loj = (C0LOJ) obj;
        return this.LIZ == c0loj.LIZ && this.LIZIZ == c0loj.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftQueryFilter(includeAIGCFailedDraft=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", includeAIGCProcessingDraft=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LOJ(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
