package X;

/* JADX INFO: renamed from: X.0WBV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WBV extends AbstractC819100WBg {
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LibraryVersion{libraryName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC819100WBg
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC819100WBg
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC819100WBg)) {
            return false;
        }
        AbstractC819100WBg abstractC819100WBg = (AbstractC819100WBg) obj;
        if (this.LIZ.equals(abstractC819100WBg.LIZ()) && this.LIZIZ.equals(abstractC819100WBg.LIZIZ())) {
            return true;
        }
        return false;
    }

    public C0WBV(String str, String str2) {
        if (str != null) {
            this.LIZ = str;
            if (str2 != null) {
                this.LIZIZ = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }
}
