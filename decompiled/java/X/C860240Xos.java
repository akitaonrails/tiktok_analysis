package X;

/* JADX INFO: renamed from: X.0Xos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860240Xos extends AbstractC878300Ycu {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C860240Xos) && this.LIZ == ((C860240Xos) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceOptFormResult(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C860240Xos(boolean z) {
        this.LIZ = z;
    }
}
