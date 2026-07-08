package X;

/* JADX INFO: renamed from: X.0TyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764220TyO extends C764750TzF {
    public final EnumC764520Tys LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C764220TyO) && this.LIZ == ((C764220TyO) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenKaraokeContainerAction(defaultPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764220TyO(EnumC764520Tys enumC764520Tys) {
        this.LIZ = enumC764520Tys;
    }
}
