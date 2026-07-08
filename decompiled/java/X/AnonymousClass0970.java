package X;

/* JADX INFO: renamed from: X.0970, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0970 extends AbstractC764660Tz6 {
    public final boolean LIZ;

    public AnonymousClass0970() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0970) && this.LIZ == ((AnonymousClass0970) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartKaraokeSuccess(startByEnter=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0970(boolean z) {
        this.LIZ = z;
    }
}
