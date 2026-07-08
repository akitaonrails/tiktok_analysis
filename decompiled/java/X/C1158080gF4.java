package X;

/* JADX INFO: renamed from: X.0gF4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158080gF4 extends AbstractC214838195w {
    public final EnumC214828195m LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1158080gF4) && this.LIZ == ((C1158080gF4) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnTileSizeChanged(category=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158080gF4(EnumC214828195m enumC214828195m) {
        this.LIZ = enumC214828195m;
    }
}
