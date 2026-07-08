package X;

/* JADX INFO: renamed from: X.06W5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06W5 implements C06W3 {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C06W5) && this.LIZ == ((C06W5) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransitionConfig(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06W5(int i) {
        this.LIZ = i;
    }
}
