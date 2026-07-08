package X;

/* JADX INFO: renamed from: X.0YAR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAR {
    public final C0Y95 LIZ;

    public C0YAR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YAR) && this.LIZ == ((C0YAR) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationMuteFilter(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YAR(int i) {
        this.LIZ = C0Y95.ALL;
    }
}
