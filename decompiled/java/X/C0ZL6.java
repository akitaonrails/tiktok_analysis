package X;

/* JADX INFO: renamed from: X.0ZL6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZL6 implements C0ZLI {
    public final C0ZLS LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZL6) && this.LIZ == ((C0ZL6) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exit(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZL6(C0ZLS c0zls) {
        this.LIZ = c0zls;
    }
}
