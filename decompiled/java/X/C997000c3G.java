package X;

/* JADX INFO: renamed from: X.0c3G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997000c3G extends AbstractC996990c3F {
    public final int LIZIZ;

    public C997000c3G() {
        this(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C997000c3G) && this.LIZIZ == ((C997000c3G) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadTimeout(statusCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C997000c3G(int i) {
        super("load_timeout");
        this.LIZIZ = i;
    }
}
