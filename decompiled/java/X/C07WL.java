package X;

/* JADX INFO: renamed from: X.07WL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WL {
    public final boolean LIZ;

    public C07WL() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07WL) && this.LIZ == ((C07WL) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApiResponseMeta(preloadTemplateData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07WL(boolean z) {
        this.LIZ = z;
    }
}
