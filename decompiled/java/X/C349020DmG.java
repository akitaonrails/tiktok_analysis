package X;

/* JADX INFO: renamed from: X.0DmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349020DmG {
    public final boolean LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C349020DmG)) {
            return false;
        }
        C349020DmG c349020DmG = (C349020DmG) obj;
        return this.LIZ == c349020DmG.LIZ && this.LIZIZ == c349020DmG.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioRecordState(isRecording=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C349020DmG(boolean z, long j) {
        this.LIZ = z;
        this.LIZIZ = j;
    }
}
