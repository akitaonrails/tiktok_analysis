package X;

/* JADX INFO: renamed from: X.0Paw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647760Paw extends AbstractC651060PgG {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C647760Paw) && this.LIZ == ((C647760Paw) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HitPredict(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C647760Paw(boolean z) {
        this.LIZ = z;
    }
}
