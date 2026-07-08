package X;

/* JADX INFO: renamed from: X.0YAS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAS {
    public final C0Y97 LIZ;

    public C0YAS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YAS) && this.LIZ == ((C0YAS) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationReadFilter(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0YAS(int i) {
        this(C0Y97.ALL);
    }

    public C0YAS(C0Y97 c0y97) {
        this.LIZ = c0y97;
    }
}
