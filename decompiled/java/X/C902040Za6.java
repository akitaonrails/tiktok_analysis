package X;

/* JADX INFO: renamed from: X.0Za6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902040Za6 implements InterfaceC902100ZaC {
    public final C0ZSW LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C902040Za6) && this.LIZ == ((C902040Za6) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FinalImageState(safetyMaskType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C902040Za6(C0ZSW c0zsw) {
        this.LIZ = c0zsw;
    }
}
