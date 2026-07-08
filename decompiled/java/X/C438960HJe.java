package X;

/* JADX INFO: renamed from: X.0HJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438960HJe {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;

    public C438960HJe() {
        this(false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C438960HJe)) {
            return false;
        }
        C438960HJe c438960HJe = (C438960HJe) obj;
        return this.LIZ == c438960HJe.LIZ && this.LIZIZ == c438960HJe.LIZIZ && this.LIZJ == c438960HJe.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarUploadingInfo(needReportUploadingFlow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", directlyGenerate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", estimatedWaitingTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C438960HJe(boolean z, int i) {
        this((i & 1) != 0 ? false : z, false, 0L);
    }

    public C438960HJe(boolean z, boolean z2, long j) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = j;
    }
}
