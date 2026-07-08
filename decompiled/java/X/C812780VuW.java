package X;

/* JADX INFO: renamed from: X.0VuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812780VuW extends AbstractC812770VuV {
    public final String LIZ;
    public final Long LIZIZ = null;

    @Override // X.AbstractC812770VuV
    public final Long LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC812770VuV
    public final String LIZIZ() {
        return this.LIZ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() ^ 1000003;
        Long l = this.LIZIZ;
        return (iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        String str = this.LIZ;
        Long l = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntegrityTokenRequest{nonce=");
        sbLIZ.append(str);
        sbLIZ.append(", cloudProjectNumber=");
        sbLIZ.append(l);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC812770VuV) {
            AbstractC812770VuV abstractC812770VuV = (AbstractC812770VuV) obj;
            if (this.LIZ.equals(abstractC812770VuV.LIZIZ()) && ((l = this.LIZIZ) != null ? l.equals(abstractC812770VuV.LIZ()) : abstractC812770VuV.LIZ() == null)) {
                return true;
            }
        }
        return false;
    }
}
