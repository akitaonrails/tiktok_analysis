package X;

/* JADX INFO: renamed from: X.0TyB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764090TyB extends C764750TzF {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C764090TyB) && this.LIZ == ((C764090TyB) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HideSearchAction(categoryId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764090TyB(int i) {
        this.LIZ = i;
    }
}
