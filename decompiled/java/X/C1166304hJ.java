package X;

/* JADX INFO: renamed from: X.04hJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1166304hJ {
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PointerKeyboardModifiers(packedValue=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1166304hJ) || i != ((C1166304hJ) obj).LIZ) {
            return false;
        }
        return true;
    }
}
