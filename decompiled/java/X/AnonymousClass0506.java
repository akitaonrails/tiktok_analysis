package X;

/* JADX INFO: renamed from: X.0506, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0506 implements C161R {
    public final boolean LIZ;

    public AnonymousClass0506() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0506) && this.LIZ == ((AnonymousClass0506) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultEmptyExtTranslationData(translated=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C164G
    public final boolean LIZ() {
        return this.LIZ;
    }

    public AnonymousClass0506(boolean z) {
        this.LIZ = z;
    }
}
