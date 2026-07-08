package X;

/* JADX INFO: renamed from: X.0j8R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269290j8R implements InterfaceC1277930jMN {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1269290j8R) && this.LIZ == ((C1269290j8R) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoFrameRate(fps=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1277930jMN
    public final boolean isValid() {
        return this.LIZ > 0;
    }

    public C1269290j8R(int i) {
        this.LIZ = i;
    }
}
