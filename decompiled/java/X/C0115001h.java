package X;

/* JADX INFO: renamed from: X.001h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0115001h {
    public final boolean LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public C0115001h() {
        this(false, 100000L, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0115001h)) {
            return false;
        }
        C0115001h c0115001h = (C0115001h) obj;
        return this.LIZ == c0115001h.LIZ && this.LIZIZ == c0115001h.LIZIZ && this.LIZJ == c0115001h.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DropFrameConfig(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", delayTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxDropFrameCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0115001h(boolean z, long j, int i) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = i;
    }
}
