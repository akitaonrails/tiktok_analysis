package X;

/* JADX INFO: renamed from: X.0YAN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAN {
    public final C0Y98 LIZ;

    public C0YAN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YAN) && this.LIZ == ((C0YAN) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationDeletedFilter(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0YAN(int i) {
        this(C0Y98.ALL);
    }

    public C0YAN(C0Y98 c0y98) {
        this.LIZ = c0y98;
    }
}
