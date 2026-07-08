package X;

/* JADX INFO: renamed from: X.0b5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960230b5x extends AbstractC214838195w {
    public final EnumC955210axr LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C960230b5x) && this.LIZ == ((C960230b5x) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnSearchStarted(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C960230b5x(EnumC955210axr enumC955210axr) {
        this.LIZ = enumC955210axr;
    }
}
