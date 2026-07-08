package X;

/* JADX INFO: renamed from: X.0DI4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DI4 implements C0DI5 {
    public final int LIZ = 2;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DI4) && this.LIZ == ((C0DI4) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fixed(digits=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
