package X;

/* JADX INFO: renamed from: X.0SZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723420SZg extends C723430SZh {
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C723420SZg) && this.LIZJ == ((C723420SZg) obj).LIZJ;
    }

    public final int hashCode() {
        return this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnbindProxyEventParams(position=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C723420SZg(int i) {
        this.LIZJ = i;
    }
}
