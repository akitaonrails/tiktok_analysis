package X;

/* JADX INFO: renamed from: X.0bLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970010bLj implements InterfaceC951240arS<Object> {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C970010bLj)) {
            return false;
        }
        C970010bLj c970010bLj = (C970010bLj) obj;
        return this.LIZ == c970010bLj.LIZ && this.LIZIZ == c970010bLj.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateTitleInfo(titleType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", yourTemplateCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C970010bLj)) {
            return false;
        }
        C970010bLj c970010bLj = (C970010bLj) obj;
        if (c970010bLj.LIZ != this.LIZ || c970010bLj.LIZIZ != this.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C970010bLj;
    }

    public C970010bLj(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
