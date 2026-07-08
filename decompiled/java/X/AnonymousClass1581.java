package X;

/* JADX INFO: renamed from: X.1581, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1581 extends AnonymousClass1582 {
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass1581) && this.LIZIZ == ((AnonymousClass1581) obj).LIZIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Topic(topicId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass1581(long j) {
        super("topic");
        this.LIZIZ = j;
    }
}
