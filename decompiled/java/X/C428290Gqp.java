package X;

/* JADX INFO: renamed from: X.0Gqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428290Gqp extends AbstractC428280Gqo {
    public final EnumC429180GsG LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C428290Gqp) && this.LIZ == ((C428290Gqp) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C428290Gqp(EnumC429180GsG enumC429180GsG) {
        this.LIZ = enumC429180GsG;
    }
}
