package X;

/* JADX INFO: renamed from: X.0WBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819260WBw extends AbstractC819270WBx {
    public final AbstractC818550W9d LIZ;
    public final String LIZIZ;
    public final AbstractC818660W9o<?> LIZJ;
    public final C0WC0<?, byte[]> LIZLLL;
    public final C814570VxP LJ;

    public final int hashCode() {
        return ((((((((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode()) * 1000003) ^ this.LIZJ.hashCode()) * 1000003) ^ this.LIZLLL.hashCode()) * 1000003) ^ this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendRequest{transportContext=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", transportName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", transformer=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", encoding=");
        sbLIZ.append(this.LJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC819270WBx
    public final C814570VxP LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC819270WBx
    public final AbstractC818660W9o<?> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC819270WBx
    public final C0WC0<?, byte[]> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC819270WBx
    public final AbstractC818550W9d LIZLLL() {
        return this.LIZ;
    }

    @Override // X.AbstractC819270WBx
    public final String LJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC819270WBx)) {
            return false;
        }
        AbstractC819270WBx abstractC819270WBx = (AbstractC819270WBx) obj;
        if (this.LIZ.equals(abstractC819270WBx.LIZLLL()) && this.LIZIZ.equals(abstractC819270WBx.LJ()) && this.LIZJ.equals(abstractC819270WBx.LIZIZ()) && this.LIZLLL.equals(abstractC819270WBx.LIZJ()) && this.LJ.equals(abstractC819270WBx.LIZ())) {
            return true;
        }
        return false;
    }

    public C819260WBw(AbstractC818550W9d abstractC818550W9d, String str, AbstractC818660W9o abstractC818660W9o, C0WC0 c0wc0, C814570VxP c814570VxP) {
        this.LIZ = abstractC818550W9d;
        this.LIZIZ = str;
        this.LIZJ = abstractC818660W9o;
        this.LIZLLL = c0wc0;
        this.LJ = c814570VxP;
    }
}
