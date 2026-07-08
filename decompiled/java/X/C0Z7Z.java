package X;

/* JADX INFO: renamed from: X.0Z7Z, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z7Z {
    public final int LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public C0Z7Z() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z7Z)) {
            return false;
        }
        C0Z7Z c0z7z = (C0Z7Z) obj;
        return this.LIZ == c0z7z.LIZ && this.LIZIZ == c0z7z.LIZIZ && this.LIZJ == c0z7z.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMVoicePreloadConfig(maxConcurrentTasks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Z7Z(int i) {
        this.LIZ = 2;
        this.LIZIZ = 20000L;
        this.LIZJ = 2;
    }
}
