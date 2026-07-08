package X;

/* JADX INFO: renamed from: X.0uDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695400uDi {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Mode(value=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1695400uDi) || i != ((C1695400uDi) obj).LIZ) {
            return false;
        }
        return true;
    }
}
