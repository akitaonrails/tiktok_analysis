package X;

/* JADX INFO: renamed from: X.0b7Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961140b7Q extends AbstractC961730b8N {
    public final EnumC961190b7V LIZ;
    public final EnumC961110b7N LIZIZ;
    public final EnumC961090b7L LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C961140b7Q)) {
            return false;
        }
        C961140b7Q c961140b7Q = (C961140b7Q) obj;
        return this.LIZ == c961140b7Q.LIZ && this.LIZIZ == c961140b7Q.LIZIZ && this.LIZJ == c961140b7Q.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        EnumC961090b7L enumC961090b7L = this.LIZJ;
        return iHashCode + (enumC961090b7L == null ? 0 : enumC961090b7L.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Miss(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mismatchField=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cacheSource=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C961140b7Q(EnumC961190b7V enumC961190b7V, EnumC961090b7L enumC961090b7L, int i) {
        EnumC961110b7N enumC961110b7N;
        if ((i & 2) != 0) {
            enumC961110b7N = EnumC961110b7N.NONE;
        } else {
            enumC961110b7N = null;
        }
        this(enumC961190b7V, enumC961110b7N, (i & 4) != 0 ? null : enumC961090b7L);
    }

    public C961140b7Q(EnumC961190b7V enumC961190b7V, EnumC961110b7N enumC961110b7N, EnumC961090b7L enumC961090b7L) {
        this.LIZ = enumC961190b7V;
        this.LIZIZ = enumC961110b7N;
        this.LIZJ = enumC961090b7L;
    }
}
