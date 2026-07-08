package X;

/* JADX INFO: renamed from: X.0ND3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ND3 implements InterfaceC900840ZVq {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ND3) && this.LIZ == ((C0ND3) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HasExpired(isVideo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ND3(boolean z) {
        this.LIZ = z;
    }
}
