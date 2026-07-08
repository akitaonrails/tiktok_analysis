package X;

/* JADX INFO: renamed from: X.04wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1263304wx implements InterfaceC1264504x9 {
    public final int LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263304wx)) {
            return false;
        }
        C1263304wx c1263304wx = (C1263304wx) obj;
        return this.LIZ == c1263304wx.LIZ && this.LIZIZ == c1263304wx.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Paused(lastProgress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lastRemainTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1263304wx() {
        this(0, -1L);
    }

    public C1263304wx(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
