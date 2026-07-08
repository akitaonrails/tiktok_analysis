package X;

/* JADX INFO: renamed from: X.0TyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764110TyD extends C764750TzF {
    public final EnumC764520Tys LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C764110TyD) && this.LIZ == ((C764110TyD) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenPlayListAction(defaultPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764110TyD() {
        this(EnumC764520Tys.QUEUE);
    }

    public C764110TyD(EnumC764520Tys enumC764520Tys) {
        this.LIZ = enumC764520Tys;
    }
}
